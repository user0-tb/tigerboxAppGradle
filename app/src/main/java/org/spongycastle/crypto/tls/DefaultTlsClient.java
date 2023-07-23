package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public abstract class DefaultTlsClient extends AbstractTlsClient {
    public DefaultTlsClient() {
    }

    public DefaultTlsClient(TlsCipherFactory tlsCipherFactory) {
        super(tlsCipherFactory);
    }

    @Override // org.spongycastle.crypto.tls.TlsClient
    public int[] getCipherSuites() {
        return new int[]{CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 60, 47};
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    @Override // org.spongycastle.crypto.tls.TlsClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.spongycastle.crypto.tls.TlsKeyExchange getKeyExchange() throws java.io.IOException {
        /*
            r2 = this;
            int r0 = r2.selectedCipherSuite
            r1 = 1
            if (r0 == r1) goto L62
            r1 = 2
            if (r0 == r1) goto L62
            r1 = 4
            if (r0 == r1) goto L62
            r1 = 5
            if (r0 == r1) goto L62
            switch(r0) {
                case 10: goto L62;
                case 13: goto L5c;
                case 16: goto L55;
                case 19: goto L4f;
                case 22: goto L4a;
                case 59: goto L62;
                case 60: goto L62;
                case 61: goto L62;
                case 62: goto L5c;
                case 63: goto L55;
                case 64: goto L4f;
                case 65: goto L62;
                case 66: goto L5c;
                case 67: goto L55;
                case 68: goto L4f;
                case 69: goto L4a;
                case 192: goto L62;
                case 193: goto L5c;
                case 194: goto L55;
                case 195: goto L4f;
                case 196: goto L4a;
                case 49153: goto L43;
                case 49154: goto L43;
                case 49155: goto L43;
                case 49156: goto L43;
                case 49157: goto L43;
                case 49158: goto L3c;
                case 49159: goto L3c;
                case 49160: goto L3c;
                case 49161: goto L3c;
                case 49162: goto L3c;
                case 49163: goto L35;
                case 49164: goto L35;
                case 49165: goto L35;
                case 49166: goto L35;
                case 49167: goto L35;
                case 49168: goto L2e;
                case 49169: goto L2e;
                case 49170: goto L2e;
                case 49171: goto L2e;
                case 49172: goto L2e;
                case 49187: goto L3c;
                case 49188: goto L3c;
                case 49189: goto L43;
                case 49190: goto L43;
                case 49191: goto L2e;
                case 49192: goto L2e;
                case 49193: goto L35;
                case 49194: goto L35;
                case 49195: goto L3c;
                case 49196: goto L3c;
                case 49197: goto L43;
                case 49198: goto L43;
                case 49199: goto L2e;
                case 49200: goto L2e;
                case 49201: goto L35;
                case 49202: goto L35;
                case 49266: goto L3c;
                case 49267: goto L3c;
                case 49268: goto L43;
                case 49269: goto L43;
                case 49270: goto L2e;
                case 49271: goto L2e;
                case 49272: goto L35;
                case 49273: goto L35;
                case 49274: goto L62;
                case 49275: goto L62;
                case 49276: goto L4a;
                case 49277: goto L4a;
                case 49278: goto L55;
                case 49279: goto L55;
                case 49280: goto L4f;
                case 49281: goto L4f;
                case 49282: goto L5c;
                case 49283: goto L5c;
                case 49286: goto L3c;
                case 49287: goto L3c;
                case 49288: goto L43;
                case 49289: goto L43;
                case 49290: goto L2e;
                case 49291: goto L2e;
                case 49292: goto L35;
                case 49293: goto L35;
                case 49308: goto L62;
                case 49309: goto L62;
                case 49310: goto L4a;
                case 49311: goto L4a;
                case 49312: goto L62;
                case 49313: goto L62;
                case 49314: goto L4a;
                case 49315: goto L4a;
                case 52243: goto L2e;
                case 52244: goto L3c;
                case 52245: goto L4a;
                case 58384: goto L62;
                case 58385: goto L62;
                case 58386: goto L2e;
                case 58387: goto L2e;
                case 58388: goto L3c;
                case 58389: goto L3c;
                case 58398: goto L4a;
                case 58399: goto L4a;
                default: goto L11;
            }
        L11:
            switch(r0) {
                case 47: goto L62;
                case 48: goto L5c;
                case 49: goto L55;
                case 50: goto L4f;
                case 51: goto L4a;
                default: goto L14;
            }
        L14:
            switch(r0) {
                case 53: goto L62;
                case 54: goto L5c;
                case 55: goto L55;
                case 56: goto L4f;
                case 57: goto L4a;
                default: goto L17;
            }
        L17:
            switch(r0) {
                case 103: goto L4a;
                case 104: goto L5c;
                case 105: goto L55;
                case 106: goto L4f;
                case 107: goto L4a;
                default: goto L1a;
            }
        L1a:
            switch(r0) {
                case 132: goto L62;
                case 133: goto L5c;
                case 134: goto L55;
                case 135: goto L4f;
                case 136: goto L4a;
                default: goto L1d;
            }
        L1d:
            switch(r0) {
                case 150: goto L62;
                case 151: goto L5c;
                case 152: goto L55;
                case 153: goto L4f;
                case 154: goto L4a;
                default: goto L20;
            }
        L20:
            switch(r0) {
                case 156: goto L62;
                case 157: goto L62;
                case 158: goto L4a;
                case 159: goto L4a;
                case 160: goto L55;
                case 161: goto L55;
                case 162: goto L4f;
                case 163: goto L4f;
                case 164: goto L5c;
                case 165: goto L5c;
                default: goto L23;
            }
        L23:
            switch(r0) {
                case 186: goto L62;
                case 187: goto L5c;
                case 188: goto L55;
                case 189: goto L4f;
                case 190: goto L4a;
                default: goto L26;
            }
        L26:
            org.spongycastle.crypto.tls.TlsFatalAlert r0 = new org.spongycastle.crypto.tls.TlsFatalAlert
            r1 = 80
            r0.<init>(r1)
            throw r0
        L2e:
            r0 = 19
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createECDHEKeyExchange(r0)
            return r0
        L35:
            r0 = 18
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createECDHKeyExchange(r0)
            return r0
        L3c:
            r0 = 17
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createECDHEKeyExchange(r0)
            return r0
        L43:
            r0 = 16
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createECDHKeyExchange(r0)
            return r0
        L4a:
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createDHEKeyExchange(r1)
            return r0
        L4f:
            r0 = 3
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createDHEKeyExchange(r0)
            return r0
        L55:
            r0 = 9
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createDHKeyExchange(r0)
            return r0
        L5c:
            r0 = 7
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createDHKeyExchange(r0)
            return r0
        L62:
            org.spongycastle.crypto.tls.TlsKeyExchange r0 = r2.createRSAKeyExchange()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.DefaultTlsClient.getKeyExchange():org.spongycastle.crypto.tls.TlsKeyExchange");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    @Override // org.spongycastle.crypto.tls.TlsPeer
    public org.spongycastle.crypto.tls.TlsCipher getCipher() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.DefaultTlsClient.getCipher():org.spongycastle.crypto.tls.TlsCipher");
    }

    protected TlsKeyExchange createDHKeyExchange(int i) {
        return new TlsDHKeyExchange(i, this.supportedSignatureAlgorithms, null);
    }

    protected TlsKeyExchange createDHEKeyExchange(int i) {
        return new TlsDHEKeyExchange(i, this.supportedSignatureAlgorithms, null);
    }

    protected TlsKeyExchange createECDHKeyExchange(int i) {
        return new TlsECDHKeyExchange(i, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }

    protected TlsKeyExchange createECDHEKeyExchange(int i) {
        return new TlsECDHEKeyExchange(i, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
    }

    protected TlsKeyExchange createRSAKeyExchange() {
        return new TlsRSAKeyExchange(this.supportedSignatureAlgorithms);
    }
}
