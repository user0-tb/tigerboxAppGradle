package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class AlwaysValidVerifyer implements CertificateVerifyer {
    @Override // org.spongycastle.crypto.tls.CertificateVerifyer
    public boolean isValid(org.spongycastle.asn1.x509.Certificate[] certificateArr) {
        return true;
    }
}
