package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public interface CertificateVerifyer {
    boolean isValid(org.spongycastle.asn1.x509.Certificate[] certificateArr);
}
