package org.spongycastle.crypto.tls;

import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class SecurityParameters {
    int entity = -1;
    int cipherSuite = -1;
    short compressionAlgorithm = -1;
    int prfAlgorithm = -1;
    int verifyDataLength = -1;
    byte[] masterSecret = null;
    byte[] clientRandom = null;
    byte[] serverRandom = null;
    short maxFragmentLength = -1;
    boolean truncatedHMac = false;
    boolean encryptThenMAC = false;

    void copySessionParametersFrom(SecurityParameters securityParameters) {
        this.entity = securityParameters.entity;
        this.cipherSuite = securityParameters.cipherSuite;
        this.compressionAlgorithm = securityParameters.compressionAlgorithm;
        this.prfAlgorithm = securityParameters.prfAlgorithm;
        this.verifyDataLength = securityParameters.verifyDataLength;
        this.masterSecret = Arrays.clone(securityParameters.masterSecret);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        byte[] bArr = this.masterSecret;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            this.masterSecret = null;
        }
    }

    public int getEntity() {
        return this.entity;
    }

    public int getCipherSuite() {
        return this.cipherSuite;
    }

    public short getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public int getPrfAlgorithm() {
        return this.prfAlgorithm;
    }

    public int getVerifyDataLength() {
        return this.verifyDataLength;
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public byte[] getClientRandom() {
        return this.clientRandom;
    }

    public byte[] getServerRandom() {
        return this.serverRandom;
    }
}
