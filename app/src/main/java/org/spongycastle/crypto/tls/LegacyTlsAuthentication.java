package org.spongycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes4.dex */
public class LegacyTlsAuthentication extends ServerOnlyTlsAuthentication {
    protected CertificateVerifyer verifyer;

    public LegacyTlsAuthentication(CertificateVerifyer certificateVerifyer) {
        this.verifyer = certificateVerifyer;
    }

    @Override // org.spongycastle.crypto.tls.TlsAuthentication
    public void notifyServerCertificate(Certificate certificate) throws IOException {
        if (!this.verifyer.isValid(certificate.getCertificateList())) {
            throw new TlsFatalAlert((short) 90);
        }
    }
}
