package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.prng.RandomGenerator;
import org.spongycastle.crypto.tls.SessionParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
public abstract class TlsProtocol {
    protected static final short CS_CERTIFICATE_REQUEST = 7;
    protected static final short CS_CERTIFICATE_STATUS = 5;
    protected static final short CS_CERTIFICATE_VERIFY = 12;
    protected static final short CS_CLIENT_CERTIFICATE = 10;
    protected static final short CS_CLIENT_FINISHED = 13;
    protected static final short CS_CLIENT_HELLO = 1;
    protected static final short CS_CLIENT_KEY_EXCHANGE = 11;
    protected static final short CS_CLIENT_SUPPLEMENTAL_DATA = 9;
    protected static final short CS_END = 16;
    protected static final short CS_SERVER_CERTIFICATE = 4;
    protected static final short CS_SERVER_FINISHED = 15;
    protected static final short CS_SERVER_HELLO = 2;
    protected static final short CS_SERVER_HELLO_DONE = 8;
    protected static final short CS_SERVER_KEY_EXCHANGE = 6;
    protected static final short CS_SERVER_SESSION_TICKET = 14;
    protected static final short CS_SERVER_SUPPLEMENTAL_DATA = 3;
    protected static final short CS_START = 0;
    protected static final Integer EXT_RenegotiationInfo = Integers.valueOf(65281);
    protected static final Integer EXT_SessionTicket = Integers.valueOf(35);
    private static final String TLS_ERROR_MESSAGE = "Internal TLS error, this could be an attack";
    protected RecordStream recordStream;
    protected SecureRandom secureRandom;
    private ByteQueue applicationDataQueue = new ByteQueue();
    private ByteQueue alertQueue = new ByteQueue(2);
    private ByteQueue handshakeQueue = new ByteQueue();
    private TlsInputStream tlsInputStream = null;
    private TlsOutputStream tlsOutputStream = null;
    private volatile boolean closed = false;
    private volatile boolean failedWithError = false;
    private volatile boolean appDataReady = false;
    private volatile boolean splitApplicationDataRecords = true;
    private byte[] expected_verify_data = null;
    protected TlsSession tlsSession = null;
    protected SessionParameters sessionParameters = null;
    protected SecurityParameters securityParameters = null;
    protected Certificate peerCertificate = null;
    protected int[] offeredCipherSuites = null;
    protected short[] offeredCompressionMethods = null;
    protected Hashtable clientExtensions = null;
    protected Hashtable serverExtensions = null;
    protected short connection_state = 0;
    protected boolean resumedSession = false;
    protected boolean receivedChangeCipherSpec = false;
    protected boolean secure_renegotiation = false;
    protected boolean allowCertificateStatus = false;
    protected boolean expectSessionTicket = false;

    private void processApplicationData() {
    }

    protected abstract AbstractTlsContext getContext();

    protected abstract TlsPeer getPeer();

    protected void handleChangeCipherSpecMessage() throws IOException {
    }

    protected abstract void handleHandshakeMessage(short s, byte[] bArr) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public void handleWarningMessage(short s) throws IOException {
    }

    public TlsProtocol(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        this.recordStream = new RecordStream(this, inputStream, outputStream);
        this.secureRandom = secureRandom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cleanupHandshake() {
        byte[] bArr = this.expected_verify_data;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.expected_verify_data = null;
        }
        this.securityParameters.clear();
        this.peerCertificate = null;
        this.offeredCipherSuites = null;
        this.offeredCompressionMethods = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.secure_renegotiation = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void completeHandshake() throws IOException {
        while (this.connection_state != 16) {
            try {
                safeReadRecord();
            } finally {
                cleanupHandshake();
            }
        }
        this.recordStream.finaliseHandshake();
        this.splitApplicationDataRecords = !TlsUtils.isTLSv11(getContext());
        if (!this.appDataReady) {
            this.appDataReady = true;
            this.tlsInputStream = new TlsInputStream(this);
            this.tlsOutputStream = new TlsOutputStream(this);
        }
        if (this.tlsSession != null) {
            if (this.sessionParameters == null) {
                this.sessionParameters = new SessionParameters.Builder().setCipherSuite(this.securityParameters.cipherSuite).setCompressionAlgorithm(this.securityParameters.compressionAlgorithm).setMasterSecret(this.securityParameters.masterSecret).setPeerCertificate(this.peerCertificate).setServerExtensions(this.serverExtensions).build();
                this.tlsSession = new TlsSessionImpl(this.tlsSession.getSessionID(), this.sessionParameters);
            }
            getContext().setResumableSession(this.tlsSession);
        }
        getPeer().notifyHandshakeComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void processRecord(short s, byte[] bArr, int i, int i2) throws IOException {
        switch (s) {
            case 20:
                processChangeCipherSpec(bArr, i, i2);
                return;
            case 21:
                this.alertQueue.addData(bArr, i, i2);
                processAlert();
                return;
            case 22:
                this.handshakeQueue.addData(bArr, i, i2);
                processHandshake();
                return;
            case 23:
                if (!this.appDataReady) {
                    throw new TlsFatalAlert((short) 10);
                }
                this.applicationDataQueue.addData(bArr, i, i2);
                processApplicationData();
                return;
            case 24:
                if (!this.appDataReady) {
                    throw new TlsFatalAlert((short) 10);
                }
                return;
            default:
                return;
        }
    }

    private void processHandshake() throws IOException {
        boolean z;
        do {
            z = true;
            if (this.handshakeQueue.size() >= 4) {
                byte[] bArr = new byte[4];
                this.handshakeQueue.read(bArr, 0, 4, 0);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                short readUint8 = TlsUtils.readUint8(byteArrayInputStream);
                int readUint24 = TlsUtils.readUint24(byteArrayInputStream);
                if (this.handshakeQueue.size() >= readUint24 + 4) {
                    byte[] removeData = this.handshakeQueue.removeData(readUint24, 4);
                    if (readUint8 != 0) {
                        if (readUint8 == 20 && this.expected_verify_data == null) {
                            this.expected_verify_data = createVerifyData(!getContext().isServer());
                        }
                        this.recordStream.updateHandshakeData(bArr, 0, 4);
                        this.recordStream.updateHandshakeData(removeData, 0, readUint24);
                    }
                    handleHandshakeMessage(readUint8, removeData);
                    continue;
                }
            }
            z = false;
            continue;
        } while (z);
    }

    private void processAlert() throws IOException {
        while (this.alertQueue.size() >= 2) {
            byte[] removeData = this.alertQueue.removeData(2, 0);
            short s = removeData[0];
            short s2 = removeData[1];
            getPeer().notifyAlertReceived(s, s2);
            if (s == 2) {
                invalidateSession();
                this.failedWithError = true;
                this.closed = true;
                this.recordStream.safeClose();
                throw new IOException(TLS_ERROR_MESSAGE);
            }
            if (s2 == 0) {
                handleClose(false);
            }
            handleWarningMessage(s2);
        }
    }

    private void processChangeCipherSpec(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            if (TlsUtils.readUint8(bArr, i + i3) != 1) {
                throw new TlsFatalAlert((short) 50);
            }
            if (this.receivedChangeCipherSpec || this.alertQueue.size() > 0 || this.handshakeQueue.size() > 0) {
                throw new TlsFatalAlert((short) 10);
            }
            this.recordStream.receivedReadCipherSpec();
            this.receivedChangeCipherSpec = true;
            handleChangeCipherSpecMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int applicationDataAvailable() throws IOException {
        return this.applicationDataQueue.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int readApplicationData(byte[] bArr, int i, int i2) throws IOException {
        if (i2 < 1) {
            return 0;
        }
        while (this.applicationDataQueue.size() == 0) {
            if (this.closed) {
                if (this.failedWithError) {
                    throw new IOException(TLS_ERROR_MESSAGE);
                }
                return -1;
            }
            safeReadRecord();
        }
        int min = Math.min(i2, this.applicationDataQueue.size());
        this.applicationDataQueue.removeData(bArr, i, min, 0);
        return min;
    }

    protected void safeReadRecord() throws IOException {
        try {
            if (this.recordStream.readRecord()) {
                return;
            }
            throw new EOFException();
        } catch (TlsFatalAlert e) {
            if (!this.closed) {
                failWithError((short) 2, e.getAlertDescription(), "Failed to read record", e);
            }
            throw e;
        } catch (IOException e2) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to read record", e2);
            }
            throw e2;
        } catch (RuntimeException e3) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to read record", e3);
            }
            throw e3;
        }
    }

    protected void safeWriteRecord(short s, byte[] bArr, int i, int i2) throws IOException {
        try {
            this.recordStream.writeRecord(s, bArr, i, i2);
        } catch (IOException e) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to write record", e);
            }
            throw e;
        } catch (RuntimeException e2) {
            if (!this.closed) {
                failWithError((short) 2, (short) 80, "Failed to write record", e2);
            }
            throw e2;
        } catch (TlsFatalAlert e3) {
            if (!this.closed) {
                failWithError((short) 2, e3.getAlertDescription(), "Failed to write record", e3);
            }
            throw e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeData(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            if (this.failedWithError) {
                throw new IOException(TLS_ERROR_MESSAGE);
            }
            throw new IOException("Sorry, connection has been closed, you cannot write more data");
        }
        while (i2 > 0) {
            if (this.splitApplicationDataRecords) {
                safeWriteRecord((short) 23, bArr, i, 1);
                i++;
                i2--;
            }
            if (i2 > 0) {
                int min = Math.min(i2, this.recordStream.getPlaintextLimit());
                safeWriteRecord((short) 23, bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeHandshakeMessage(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.recordStream.getPlaintextLimit());
            safeWriteRecord((short) 22, bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    public OutputStream getOutputStream() {
        return this.tlsOutputStream;
    }

    public InputStream getInputStream() {
        return this.tlsInputStream;
    }

    protected void failWithError(short s, short s2, String str, Exception exc) throws IOException {
        if (!this.closed) {
            this.closed = true;
            if (s == 2) {
                invalidateSession();
                this.failedWithError = true;
            }
            raiseAlert(s, s2, str, exc);
            this.recordStream.safeClose();
            if (s != 2) {
                return;
            }
        }
        throw new IOException(TLS_ERROR_MESSAGE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void invalidateSession() {
        SessionParameters sessionParameters = this.sessionParameters;
        if (sessionParameters != null) {
            sessionParameters.clear();
            this.sessionParameters = null;
        }
        TlsSession tlsSession = this.tlsSession;
        if (tlsSession != null) {
            tlsSession.invalidate();
            this.tlsSession = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void processFinishedMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] readFully = TlsUtils.readFully(this.expected_verify_data.length, byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        if (!Arrays.constantTimeAreEqual(this.expected_verify_data, readFully)) {
            throw new TlsFatalAlert((short) 51);
        }
    }

    protected void raiseAlert(short s, short s2, String str, Exception exc) throws IOException {
        getPeer().notifyAlertRaised(s, s2, str, exc);
        safeWriteRecord((short) 21, new byte[]{(byte) s, (byte) s2}, 0, 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void raiseWarning(short s, String str) throws IOException {
        raiseAlert((short) 1, s, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void sendCertificateMessage(Certificate certificate) throws IOException {
        if (certificate == null) {
            certificate = Certificate.EMPTY_CHAIN;
        }
        if (certificate.getLength() == 0 && !getContext().isServer()) {
            ProtocolVersion serverVersion = getContext().getServerVersion();
            if (serverVersion.isSSL()) {
                raiseWarning((short) 41, serverVersion.toString() + " client didn't provide credentials");
                return;
            }
        }
        HandshakeMessage handshakeMessage = new HandshakeMessage(this, (short) 11);
        certificate.encode(handshakeMessage);
        handshakeMessage.writeToRecordStream();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void sendChangeCipherSpecMessage() throws IOException {
        safeWriteRecord((short) 20, new byte[]{1}, 0, 1);
        this.recordStream.sentWriteCipherSpec();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void sendFinishedMessage() throws IOException {
        byte[] createVerifyData = createVerifyData(getContext().isServer());
        HandshakeMessage handshakeMessage = new HandshakeMessage((short) 20, createVerifyData.length);
        handshakeMessage.write(createVerifyData);
        handshakeMessage.writeToRecordStream();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void sendSupplementalDataMessage(Vector vector) throws IOException {
        HandshakeMessage handshakeMessage = new HandshakeMessage(this, (short) 23);
        writeSupplementalData(handshakeMessage, vector);
        handshakeMessage.writeToRecordStream();
    }

    protected byte[] createVerifyData(boolean z) {
        AbstractTlsContext context = getContext();
        if (z) {
            return TlsUtils.calculateVerifyData(context, ExporterLabel.server_finished, getCurrentPRFHash(getContext(), this.recordStream.getHandshakeHash(), TlsUtils.SSL_SERVER));
        }
        return TlsUtils.calculateVerifyData(context, ExporterLabel.client_finished, getCurrentPRFHash(getContext(), this.recordStream.getHandshakeHash(), TlsUtils.SSL_CLIENT));
    }

    public void close() throws IOException {
        handleClose(true);
    }

    protected void handleClose(boolean z) throws IOException {
        if (this.closed) {
            return;
        }
        if (z && !this.appDataReady) {
            raiseWarning((short) 90, "User canceled handshake");
        }
        failWithError((short) 1, (short) 0, "Connection closed", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void flush() throws IOException {
        this.recordStream.flush();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public short processMaxFragmentLengthExtension(Hashtable hashtable, Hashtable hashtable2, short s) throws IOException {
        short maxFragmentLengthExtension = TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable2);
        if (maxFragmentLengthExtension < 0 || this.resumedSession || maxFragmentLengthExtension == TlsExtensionsUtils.getMaxFragmentLengthExtension(hashtable)) {
            return maxFragmentLengthExtension;
        }
        throw new TlsFatalAlert(s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void assertEmpty(ByteArrayInputStream byteArrayInputStream) throws IOException {
        if (byteArrayInputStream.available() > 0) {
            throw new TlsFatalAlert((short) 50);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] createRandomBlock(boolean z, RandomGenerator randomGenerator) {
        byte[] bArr = new byte[32];
        randomGenerator.nextBytes(bArr);
        if (z) {
            TlsUtils.writeGMTUnixTime(bArr, 0);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] createRenegotiationInfo(byte[] bArr) throws IOException {
        return TlsUtils.encodeOpaque8(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void establishMasterSecret(TlsContext tlsContext, TlsKeyExchange tlsKeyExchange) throws IOException {
        byte[] generatePremasterSecret = tlsKeyExchange.generatePremasterSecret();
        try {
            tlsContext.getSecurityParameters().masterSecret = TlsUtils.calculateMasterSecret(tlsContext, generatePremasterSecret);
        } finally {
            if (generatePremasterSecret != null) {
                Arrays.fill(generatePremasterSecret, (byte) 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] getCurrentPRFHash(TlsContext tlsContext, TlsHandshakeHash tlsHandshakeHash, byte[] bArr) {
        Digest forkPRFHash = tlsHandshakeHash.forkPRFHash();
        if (bArr != null && TlsUtils.isSSL(tlsContext)) {
            forkPRFHash.update(bArr, 0, bArr.length);
        }
        byte[] bArr2 = new byte[forkPRFHash.getDigestSize()];
        forkPRFHash.doFinal(bArr2, 0);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Hashtable readExtensions(ByteArrayInputStream byteArrayInputStream) throws IOException {
        if (byteArrayInputStream.available() < 1) {
            return null;
        }
        byte[] readOpaque16 = TlsUtils.readOpaque16(byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(readOpaque16);
        Hashtable hashtable = new Hashtable();
        while (byteArrayInputStream2.available() > 0) {
            if (hashtable.put(Integers.valueOf(TlsUtils.readUint16(byteArrayInputStream2)), TlsUtils.readOpaque16(byteArrayInputStream2)) != null) {
                throw new TlsFatalAlert((short) 47);
            }
        }
        return hashtable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Vector readSupplementalDataMessage(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] readOpaque24 = TlsUtils.readOpaque24(byteArrayInputStream);
        assertEmpty(byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(readOpaque24);
        Vector vector = new Vector();
        while (byteArrayInputStream2.available() > 0) {
            vector.addElement(new SupplementalDataEntry(TlsUtils.readUint16(byteArrayInputStream2), TlsUtils.readOpaque16(byteArrayInputStream2)));
        }
        return vector;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void writeExtensions(OutputStream outputStream, Hashtable hashtable) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            int intValue = num.intValue();
            TlsUtils.checkUint16(intValue);
            TlsUtils.writeUint16(intValue, byteArrayOutputStream);
            TlsUtils.writeOpaque16((byte[]) hashtable.get(num), byteArrayOutputStream);
        }
        TlsUtils.writeOpaque16(byteArrayOutputStream.toByteArray(), outputStream);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void writeSupplementalData(OutputStream outputStream, Vector vector) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < vector.size(); i++) {
            SupplementalDataEntry supplementalDataEntry = (SupplementalDataEntry) vector.elementAt(i);
            int dataType = supplementalDataEntry.getDataType();
            TlsUtils.checkUint16(dataType);
            TlsUtils.writeUint16(dataType, byteArrayOutputStream);
            TlsUtils.writeOpaque16(supplementalDataEntry.getData(), byteArrayOutputStream);
        }
        TlsUtils.writeOpaque24(byteArrayOutputStream.toByteArray(), outputStream);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getPRFAlgorithm(org.spongycastle.crypto.tls.TlsContext r4, int r5) throws java.io.IOException {
        /*
            boolean r4 = org.spongycastle.crypto.tls.TlsUtils.isTLSv12(r4)
            r0 = 1
            r1 = 47
            switch(r5) {
                case 59: goto L38;
                case 60: goto L38;
                case 61: goto L38;
                case 62: goto L38;
                case 63: goto L38;
                case 64: goto L38;
                default: goto La;
            }
        La:
            switch(r5) {
                case 103: goto L38;
                case 104: goto L38;
                case 105: goto L38;
                case 106: goto L38;
                case 107: goto L38;
                default: goto Ld;
            }
        Ld:
            r2 = 2
            switch(r5) {
                case 156: goto L38;
                case 157: goto L2f;
                case 158: goto L38;
                case 159: goto L2f;
                case 160: goto L38;
                case 161: goto L2f;
                case 162: goto L38;
                case 163: goto L2f;
                case 164: goto L38;
                case 165: goto L2f;
                default: goto L11;
            }
        L11:
            switch(r5) {
                case 168: goto L38;
                case 169: goto L2f;
                case 170: goto L38;
                case 171: goto L2f;
                case 172: goto L38;
                case 173: goto L2f;
                default: goto L14;
            }
        L14:
            r3 = 0
            switch(r5) {
                case 175: goto L2b;
                case 177: goto L2b;
                case 179: goto L2b;
                case 181: goto L2b;
                case 183: goto L2b;
                case 49208: goto L2b;
                case 49211: goto L2b;
                case 49301: goto L2b;
                case 49303: goto L2b;
                case 49305: goto L2b;
                default: goto L18;
            }
        L18:
            switch(r5) {
                case 185: goto L2b;
                case 186: goto L38;
                case 187: goto L38;
                case 188: goto L38;
                case 189: goto L38;
                case 190: goto L38;
                case 191: goto L38;
                case 192: goto L38;
                case 193: goto L38;
                case 194: goto L38;
                case 195: goto L38;
                case 196: goto L38;
                case 197: goto L38;
                default: goto L1b;
            }
        L1b:
            switch(r5) {
                case 49187: goto L38;
                case 49188: goto L2f;
                case 49189: goto L38;
                case 49190: goto L2f;
                case 49191: goto L38;
                case 49192: goto L2f;
                case 49193: goto L38;
                case 49194: goto L2f;
                case 49195: goto L38;
                case 49196: goto L2f;
                case 49197: goto L38;
                case 49198: goto L2f;
                case 49199: goto L38;
                case 49200: goto L2f;
                case 49201: goto L38;
                case 49202: goto L2f;
                default: goto L1e;
            }
        L1e:
            switch(r5) {
                case 49266: goto L38;
                case 49267: goto L2f;
                case 49268: goto L38;
                case 49269: goto L2f;
                case 49270: goto L38;
                case 49271: goto L2f;
                case 49272: goto L38;
                case 49273: goto L2f;
                case 49274: goto L38;
                case 49275: goto L2f;
                case 49276: goto L38;
                case 49277: goto L2f;
                case 49278: goto L38;
                case 49279: goto L2f;
                case 49280: goto L38;
                case 49281: goto L2f;
                case 49282: goto L38;
                case 49283: goto L2f;
                case 49284: goto L38;
                case 49285: goto L2f;
                case 49286: goto L38;
                case 49287: goto L2f;
                case 49288: goto L38;
                case 49289: goto L2f;
                case 49290: goto L38;
                case 49291: goto L2f;
                case 49292: goto L38;
                case 49293: goto L2f;
                case 49294: goto L38;
                case 49295: goto L2f;
                case 49296: goto L38;
                case 49297: goto L2f;
                case 49298: goto L38;
                case 49299: goto L2f;
                default: goto L21;
            }
        L21:
            switch(r5) {
                case 49307: goto L2b;
                case 49308: goto L38;
                case 49309: goto L38;
                case 49310: goto L38;
                case 49311: goto L38;
                case 49312: goto L38;
                case 49313: goto L38;
                case 49314: goto L38;
                case 49315: goto L38;
                case 49316: goto L38;
                case 49317: goto L38;
                case 49318: goto L38;
                case 49319: goto L38;
                case 49320: goto L38;
                case 49321: goto L38;
                case 49322: goto L38;
                case 49323: goto L38;
                default: goto L24;
            }
        L24:
            switch(r5) {
                case 52243: goto L38;
                case 52244: goto L38;
                case 52245: goto L38;
                default: goto L27;
            }
        L27:
            if (r4 == 0) goto L2a
            return r0
        L2a:
            return r3
        L2b:
            if (r4 == 0) goto L2e
            return r2
        L2e:
            return r3
        L2f:
            if (r4 == 0) goto L32
            return r2
        L32:
            org.spongycastle.crypto.tls.TlsFatalAlert r4 = new org.spongycastle.crypto.tls.TlsFatalAlert
            r4.<init>(r1)
            throw r4
        L38:
            if (r4 == 0) goto L3b
            return r0
        L3b:
            org.spongycastle.crypto.tls.TlsFatalAlert r4 = new org.spongycastle.crypto.tls.TlsFatalAlert
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.TlsProtocol.getPRFAlgorithm(org.spongycastle.crypto.tls.TlsContext, int):int");
    }

    /* loaded from: classes4.dex */
    class HandshakeMessage extends ByteArrayOutputStream {
        /* JADX INFO: Access modifiers changed from: package-private */
        public HandshakeMessage(TlsProtocol tlsProtocol, short s) throws IOException {
            this(s, 60);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public HandshakeMessage(short s, int i) throws IOException {
            super(i + 4);
            TlsUtils.writeUint8(s, (OutputStream) this);
            this.count += 3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void writeToRecordStream() throws IOException {
            int i = this.count - 4;
            TlsUtils.checkUint24(i);
            TlsUtils.writeUint24(i, this.buf, 1);
            TlsProtocol.this.writeHandshakeMessage(this.buf, 0, this.count);
            this.buf = null;
        }
    }
}
