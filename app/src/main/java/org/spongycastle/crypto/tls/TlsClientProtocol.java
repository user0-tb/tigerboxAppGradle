package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.crypto.prng.ThreadedSeedGenerator;
import org.spongycastle.crypto.tls.TlsProtocol;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class TlsClientProtocol extends TlsProtocol {
    protected TlsAuthentication authentication;
    protected CertificateRequest certificateRequest;
    protected CertificateStatus certificateStatus;
    protected TlsKeyExchange keyExchange;
    protected byte[] selectedSessionID;
    protected TlsClient tlsClient;
    protected TlsClientContextImpl tlsClientContext;

    private static SecureRandom createSecureRandom() {
        ThreadedSeedGenerator threadedSeedGenerator = new ThreadedSeedGenerator();
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(threadedSeedGenerator.generateSeed(20, true));
        return secureRandom;
    }

    public TlsClientProtocol(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, createSecureRandom());
    }

    public TlsClientProtocol(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        super(inputStream, outputStream, secureRandom);
        this.tlsClient = null;
        this.tlsClientContext = null;
        this.selectedSessionID = null;
        this.keyExchange = null;
        this.authentication = null;
        this.certificateStatus = null;
        this.certificateRequest = null;
    }

    public void connect(TlsClient tlsClient) throws IOException {
        SessionParameters exportSessionParameters;
        if (tlsClient == null) {
            throw new IllegalArgumentException("'tlsClient' cannot be null");
        }
        if (this.tlsClient != null) {
            throw new IllegalStateException("'connect' can only be called once");
        }
        this.tlsClient = tlsClient;
        this.securityParameters = new SecurityParameters();
        this.securityParameters.entity = 1;
        this.tlsClientContext = new TlsClientContextImpl(this.secureRandom, this.securityParameters);
        this.securityParameters.clientRandom = createRandomBlock(tlsClient.shouldUseGMTUnixTime(), this.tlsClientContext.getNonceRandomGenerator());
        this.tlsClient.init(this.tlsClientContext);
        this.recordStream.init(this.tlsClientContext);
        TlsSession sessionToResume = tlsClient.getSessionToResume();
        if (sessionToResume != null && (exportSessionParameters = sessionToResume.exportSessionParameters()) != null) {
            this.tlsSession = sessionToResume;
            this.sessionParameters = exportSessionParameters;
        }
        sendClientHelloMessage();
        this.connection_state = (short) 1;
        completeHandshake();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.crypto.tls.TlsProtocol
    public void cleanupHandshake() {
        super.cleanupHandshake();
        this.selectedSessionID = null;
        this.keyExchange = null;
        this.authentication = null;
        this.certificateStatus = null;
        this.certificateRequest = null;
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    protected AbstractTlsContext getContext() {
        return this.tlsClientContext;
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    protected TlsPeer getPeer() {
        return this.tlsClient;
    }

    @Override // org.spongycastle.crypto.tls.TlsProtocol
    protected void handleHandshakeMessage(short s, byte[] bArr) throws IOException {
        TlsCredentials clientCredentials;
        byte[] currentPRFHash;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        if (this.resumedSession) {
            if (s != 20 || this.connection_state != 2) {
                throw new TlsFatalAlert((short) 10);
            }
            processFinishedMessage(byteArrayInputStream);
            this.connection_state = (short) 15;
            sendFinishedMessage();
            this.connection_state = (short) 13;
            this.connection_state = (short) 16;
            return;
        }
        if (s != 0) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = null;
            if (s == 2) {
                if (this.connection_state == 1) {
                    receiveServerHelloMessage(byteArrayInputStream);
                    this.connection_state = (short) 2;
                    if (this.securityParameters.maxFragmentLength >= 0) {
                        this.recordStream.setPlaintextLimit(1 << (this.securityParameters.maxFragmentLength + 8));
                    }
                    this.securityParameters.prfAlgorithm = getPRFAlgorithm(getContext(), this.securityParameters.getCipherSuite());
                    this.securityParameters.verifyDataLength = 12;
                    this.recordStream.notifyHelloComplete();
                    if (this.resumedSession) {
                        this.securityParameters.masterSecret = Arrays.clone(this.sessionParameters.getMasterSecret());
                        this.recordStream.setPendingConnectionState(getPeer().getCompression(), getPeer().getCipher());
                        sendChangeCipherSpecMessage();
                        return;
                    }
                    invalidateSession();
                    byte[] bArr2 = this.selectedSessionID;
                    if (bArr2.length > 0) {
                        this.tlsSession = new TlsSessionImpl(bArr2, null);
                        return;
                    }
                    return;
                }
                throw new TlsFatalAlert((short) 10);
            } else if (s != 4) {
                if (s == 20) {
                    short s2 = this.connection_state;
                    if (s2 != 13) {
                        if (s2 != 14) {
                            throw new TlsFatalAlert((short) 10);
                        }
                    } else if (this.expectSessionTicket) {
                        throw new TlsFatalAlert((short) 10);
                    }
                    processFinishedMessage(byteArrayInputStream);
                    this.connection_state = (short) 15;
                    this.connection_state = (short) 16;
                    return;
                } else if (s == 22) {
                    if (this.connection_state == 4) {
                        if (!this.allowCertificateStatus) {
                            throw new TlsFatalAlert((short) 10);
                        }
                        this.certificateStatus = CertificateStatus.parse(byteArrayInputStream);
                        assertEmpty(byteArrayInputStream);
                        this.connection_state = (short) 5;
                        return;
                    }
                    throw new TlsFatalAlert((short) 10);
                } else if (s != 23) {
                    switch (s) {
                        case 11:
                            short s3 = this.connection_state;
                            if (s3 == 2) {
                                handleSupplementalData(null);
                            } else if (s3 != 3) {
                                throw new TlsFatalAlert((short) 10);
                            }
                            this.peerCertificate = Certificate.parse(byteArrayInputStream);
                            assertEmpty(byteArrayInputStream);
                            if (this.peerCertificate == null || this.peerCertificate.isEmpty()) {
                                this.allowCertificateStatus = false;
                            }
                            this.keyExchange.processServerCertificate(this.peerCertificate);
                            TlsAuthentication authentication = this.tlsClient.getAuthentication();
                            this.authentication = authentication;
                            authentication.notifyServerCertificate(this.peerCertificate);
                            this.connection_state = (short) 4;
                            return;
                        case 12:
                            short s4 = this.connection_state;
                            if (s4 == 2) {
                                handleSupplementalData(null);
                            } else if (s4 != 3) {
                                if (s4 != 4 && s4 != 5) {
                                    throw new TlsFatalAlert((short) 10);
                                }
                                this.keyExchange.processServerKeyExchange(byteArrayInputStream);
                                assertEmpty(byteArrayInputStream);
                                this.connection_state = (short) 6;
                                return;
                            }
                            this.keyExchange.skipServerCredentials();
                            this.authentication = null;
                            this.keyExchange.processServerKeyExchange(byteArrayInputStream);
                            assertEmpty(byteArrayInputStream);
                            this.connection_state = (short) 6;
                            return;
                        case 13:
                            short s5 = this.connection_state;
                            if (s5 == 4 || s5 == 5) {
                                this.keyExchange.skipServerKeyExchange();
                            } else if (s5 != 6) {
                                throw new TlsFatalAlert((short) 10);
                            }
                            if (this.authentication == null) {
                                throw new TlsFatalAlert((short) 40);
                            }
                            this.certificateRequest = CertificateRequest.parse(getContext(), byteArrayInputStream);
                            assertEmpty(byteArrayInputStream);
                            this.keyExchange.validateCertificateRequest(this.certificateRequest);
                            TlsUtils.trackHashAlgorithms(this.recordStream.getHandshakeHash(), this.certificateRequest.getSupportedSignatureAlgorithms());
                            this.connection_state = (short) 7;
                            return;
                        case 14:
                            switch (this.connection_state) {
                                case 2:
                                    handleSupplementalData(null);
                                case 3:
                                    this.keyExchange.skipServerCredentials();
                                    this.authentication = null;
                                case 4:
                                case 5:
                                    this.keyExchange.skipServerKeyExchange();
                                    break;
                                case 6:
                                case 7:
                                    break;
                                default:
                                    throw new TlsFatalAlert((short) 40);
                            }
                            assertEmpty(byteArrayInputStream);
                            this.connection_state = (short) 8;
                            this.recordStream.getHandshakeHash().sealHashAlgorithms();
                            Vector clientSupplementalData = this.tlsClient.getClientSupplementalData();
                            if (clientSupplementalData != null) {
                                sendSupplementalDataMessage(clientSupplementalData);
                            }
                            this.connection_state = (short) 9;
                            CertificateRequest certificateRequest = this.certificateRequest;
                            if (certificateRequest == null) {
                                this.keyExchange.skipClientCredentials();
                                clientCredentials = null;
                            } else {
                                clientCredentials = this.authentication.getClientCredentials(certificateRequest);
                                if (clientCredentials == null) {
                                    this.keyExchange.skipClientCredentials();
                                    sendCertificateMessage(Certificate.EMPTY_CHAIN);
                                } else {
                                    this.keyExchange.processClientCredentials(clientCredentials);
                                    sendCertificateMessage(clientCredentials.getCertificate());
                                }
                            }
                            this.connection_state = (short) 10;
                            sendClientKeyExchangeMessage();
                            this.connection_state = (short) 11;
                            establishMasterSecret(getContext(), this.keyExchange);
                            this.recordStream.setPendingConnectionState(getPeer().getCompression(), getPeer().getCipher());
                            TlsHandshakeHash prepareToFinish = this.recordStream.prepareToFinish();
                            if (clientCredentials != null && (clientCredentials instanceof TlsSignerCredentials)) {
                                TlsSignerCredentials tlsSignerCredentials = (TlsSignerCredentials) clientCredentials;
                                if (TlsUtils.isTLSv12(getContext())) {
                                    signatureAndHashAlgorithm = tlsSignerCredentials.getSignatureAndHashAlgorithm();
                                    if (signatureAndHashAlgorithm == null) {
                                        throw new TlsFatalAlert((short) 80);
                                    }
                                    currentPRFHash = prepareToFinish.getFinalHash(signatureAndHashAlgorithm.getHash());
                                } else {
                                    currentPRFHash = getCurrentPRFHash(getContext(), prepareToFinish, null);
                                }
                                sendCertificateVerifyMessage(new DigitallySigned(signatureAndHashAlgorithm, tlsSignerCredentials.generateCertificateSignature(currentPRFHash)));
                                this.connection_state = (short) 12;
                            }
                            sendChangeCipherSpecMessage();
                            sendFinishedMessage();
                            this.connection_state = (short) 13;
                            return;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                } else if (this.connection_state == 2) {
                    handleSupplementalData(readSupplementalDataMessage(byteArrayInputStream));
                    return;
                } else {
                    throw new TlsFatalAlert((short) 10);
                }
            } else if (this.connection_state == 13) {
                if (!this.expectSessionTicket) {
                    throw new TlsFatalAlert((short) 10);
                }
                invalidateSession();
                receiveNewSessionTicketMessage(byteArrayInputStream);
                this.connection_state = (short) 14;
            } else {
                throw new TlsFatalAlert((short) 10);
            }
        }
        assertEmpty(byteArrayInputStream);
        if (this.connection_state == 16) {
            if (TlsUtils.isSSL(getContext())) {
                throw new TlsFatalAlert((short) 40);
            }
            raiseWarning((short) 100, "Renegotiation not supported");
        }
    }

    protected void handleSupplementalData(Vector vector) throws IOException {
        this.tlsClient.processServerSupplementalData(vector);
        this.connection_state = (short) 3;
        TlsKeyExchange keyExchange = this.tlsClient.getKeyExchange();
        this.keyExchange = keyExchange;
        keyExchange.init(getContext());
    }

    protected void receiveNewSessionTicketMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        NewSessionTicket parse = NewSessionTicket.parse(byteArrayInputStream);
        TlsProtocol.assertEmpty(byteArrayInputStream);
        this.tlsClient.notifyNewSessionTicket(parse);
    }

    protected void receiveServerHelloMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        ProtocolVersion readVersion = TlsUtils.readVersion(byteArrayInputStream);
        if (readVersion.isDTLS()) {
            throw new TlsFatalAlert((short) 47);
        }
        if (!readVersion.equals(this.recordStream.getReadVersion())) {
            throw new TlsFatalAlert((short) 47);
        }
        if (!readVersion.isEqualOrEarlierVersionOf(getContext().getClientVersion())) {
            throw new TlsFatalAlert((short) 47);
        }
        this.recordStream.setWriteVersion(readVersion);
        getContext().setServerVersion(readVersion);
        this.tlsClient.notifyServerVersion(readVersion);
        this.securityParameters.serverRandom = TlsUtils.readFully(32, byteArrayInputStream);
        byte[] readOpaque8 = TlsUtils.readOpaque8(byteArrayInputStream);
        this.selectedSessionID = readOpaque8;
        if (readOpaque8.length > 32) {
            throw new TlsFatalAlert((short) 47);
        }
        this.tlsClient.notifySessionID(readOpaque8);
        boolean z = false;
        this.resumedSession = this.selectedSessionID.length > 0 && this.tlsSession != null && Arrays.areEqual(this.selectedSessionID, this.tlsSession.getSessionID());
        int readUint16 = TlsUtils.readUint16(byteArrayInputStream);
        if (!Arrays.contains(this.offeredCipherSuites, readUint16) || readUint16 == 0 || readUint16 == 255 || !TlsUtils.isValidCipherSuiteForVersion(readUint16, readVersion)) {
            throw new TlsFatalAlert((short) 47);
        }
        this.tlsClient.notifySelectedCipherSuite(readUint16);
        short readUint8 = TlsUtils.readUint8(byteArrayInputStream);
        if (!Arrays.contains(this.offeredCompressionMethods, readUint8)) {
            throw new TlsFatalAlert((short) 47);
        }
        this.tlsClient.notifySelectedCompressionMethod(readUint8);
        this.serverExtensions = readExtensions(byteArrayInputStream);
        if (this.serverExtensions != null) {
            Enumeration keys = this.serverExtensions.keys();
            while (keys.hasMoreElements()) {
                Integer num = (Integer) keys.nextElement();
                if (!num.equals(EXT_RenegotiationInfo)) {
                    boolean z2 = this.resumedSession;
                    if (TlsUtils.getExtensionData(this.clientExtensions, num) == null) {
                        throw new TlsFatalAlert(AlertDescription.unsupported_extension);
                    }
                }
            }
        }
        byte[] extensionData = TlsUtils.getExtensionData(this.serverExtensions, EXT_RenegotiationInfo);
        if (extensionData != null) {
            this.secure_renegotiation = true;
            if (!Arrays.constantTimeAreEqual(extensionData, createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                throw new TlsFatalAlert((short) 40);
            }
        }
        this.tlsClient.notifySecureRenegotiation(this.secure_renegotiation);
        Hashtable hashtable = this.clientExtensions;
        Hashtable hashtable2 = this.serverExtensions;
        if (this.resumedSession) {
            if (readUint16 != this.sessionParameters.getCipherSuite() || readUint8 != this.sessionParameters.getCompressionAlgorithm()) {
                throw new TlsFatalAlert((short) 47);
            }
            hashtable = null;
            hashtable2 = this.sessionParameters.readServerExtensions();
        }
        this.securityParameters.cipherSuite = readUint16;
        this.securityParameters.compressionAlgorithm = readUint8;
        if (hashtable2 != null) {
            boolean hasEncryptThenMACExtension = TlsExtensionsUtils.hasEncryptThenMACExtension(hashtable2);
            if (hasEncryptThenMACExtension && !TlsUtils.isBlockCipherSuite(readUint16)) {
                throw new TlsFatalAlert((short) 47);
            }
            this.securityParameters.encryptThenMAC = hasEncryptThenMACExtension;
            this.securityParameters.maxFragmentLength = processMaxFragmentLengthExtension(hashtable, hashtable2, (short) 47);
            this.securityParameters.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(hashtable2);
            this.allowCertificateStatus = !this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(hashtable2, TlsExtensionsUtils.EXT_status_request, (short) 47);
            if (!this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(hashtable2, TlsProtocol.EXT_SessionTicket, (short) 47)) {
                z = true;
            }
            this.expectSessionTicket = z;
        }
        if (hashtable != null) {
            this.tlsClient.processServerExtensions(hashtable2);
        }
    }

    protected void sendCertificateVerifyMessage(DigitallySigned digitallySigned) throws IOException {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 15);
        digitallySigned.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    protected void sendClientHelloMessage() throws IOException {
        this.recordStream.setWriteVersion(this.tlsClient.getClientHelloRecordLayerVersion());
        ProtocolVersion clientVersion = this.tlsClient.getClientVersion();
        if (clientVersion.isDTLS()) {
            throw new TlsFatalAlert((short) 80);
        }
        getContext().setClientVersion(clientVersion);
        byte[] bArr = TlsUtils.EMPTY_BYTES;
        if (this.tlsSession != null && ((bArr = this.tlsSession.getSessionID()) == null || bArr.length > 32)) {
            bArr = TlsUtils.EMPTY_BYTES;
        }
        this.offeredCipherSuites = this.tlsClient.getCipherSuites();
        this.offeredCompressionMethods = this.tlsClient.getCompressionMethods();
        if (bArr.length > 0 && this.sessionParameters != null && (!Arrays.contains(this.offeredCipherSuites, this.sessionParameters.getCipherSuite()) || !Arrays.contains(this.offeredCompressionMethods, this.sessionParameters.getCompressionAlgorithm()))) {
            bArr = TlsUtils.EMPTY_BYTES;
        }
        this.clientExtensions = this.tlsClient.getClientExtensions();
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 1);
        TlsUtils.writeVersion(clientVersion, handshakeMessage);
        handshakeMessage.write(this.securityParameters.getClientRandom());
        TlsUtils.writeOpaque8(bArr, handshakeMessage);
        boolean z = TlsUtils.getExtensionData(this.clientExtensions, EXT_RenegotiationInfo) == null;
        boolean z2 = !Arrays.contains(this.offeredCipherSuites, 255);
        if (z && z2) {
            this.offeredCipherSuites = Arrays.append(this.offeredCipherSuites, 255);
        }
        TlsUtils.writeUint16ArrayWithUint16Length(this.offeredCipherSuites, handshakeMessage);
        TlsUtils.writeUint8ArrayWithUint8Length(this.offeredCompressionMethods, handshakeMessage);
        if (this.clientExtensions != null) {
            writeExtensions(handshakeMessage, this.clientExtensions);
        }
        handshakeMessage.writeToRecordStream();
    }

    protected void sendClientKeyExchangeMessage() throws IOException {
        TlsProtocol.HandshakeMessage handshakeMessage = new TlsProtocol.HandshakeMessage(this, (short) 16);
        this.keyExchange.generateClientKeyExchange(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }
}
