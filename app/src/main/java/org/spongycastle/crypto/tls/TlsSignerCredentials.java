package org.spongycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface TlsSignerCredentials extends TlsCredentials {
    byte[] generateCertificateSignature(byte[] bArr) throws IOException;

    SignatureAndHashAlgorithm getSignatureAndHashAlgorithm();
}
