package org.spongycastle.x509;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.CertificatePair;
import org.spongycastle.jce.provider.X509CertificateObject;

/* loaded from: classes4.dex */
public class X509CertificatePair {
    private X509Certificate forward;
    private X509Certificate reverse;

    public X509CertificatePair(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.forward = x509Certificate;
        this.reverse = x509Certificate2;
    }

    public X509CertificatePair(CertificatePair certificatePair) throws CertificateParsingException {
        if (certificatePair.getForward() != null) {
            this.forward = new X509CertificateObject(certificatePair.getForward());
        }
        if (certificatePair.getReverse() != null) {
            this.reverse = new X509CertificateObject(certificatePair.getReverse());
        }
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        Certificate certificate;
        try {
            Certificate certificate2 = null;
            if (this.forward != null) {
                certificate = Certificate.getInstance(new ASN1InputStream(this.forward.getEncoded()).readObject());
                if (certificate == null) {
                    throw new CertificateEncodingException("unable to get encoding for forward");
                }
            } else {
                certificate = null;
            }
            if (this.reverse != null && (certificate2 = Certificate.getInstance(new ASN1InputStream(this.reverse.getEncoded()).readObject())) == null) {
                throw new CertificateEncodingException("unable to get encoding for reverse");
            }
            return new CertificatePair(certificate, certificate2).getEncoded(ASN1Encoding.DER);
        } catch (IOException e) {
            throw new ExtCertificateEncodingException(e.toString(), e);
        } catch (IllegalArgumentException e2) {
            throw new ExtCertificateEncodingException(e2.toString(), e2);
        }
    }

    public X509Certificate getForward() {
        return this.forward;
    }

    public X509Certificate getReverse() {
        return this.reverse;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj != null && (obj instanceof X509CertificatePair)) {
            X509CertificatePair x509CertificatePair = (X509CertificatePair) obj;
            X509Certificate x509Certificate = this.forward;
            if (x509Certificate != null) {
                z = x509Certificate.equals(x509CertificatePair.forward);
            } else {
                z = x509CertificatePair.forward == null;
            }
            X509Certificate x509Certificate2 = this.reverse;
            if (x509Certificate2 != null) {
                z2 = x509Certificate2.equals(x509CertificatePair.reverse);
            } else {
                z2 = x509CertificatePair.reverse == null;
            }
            return z && z2;
        }
        return false;
    }

    public int hashCode() {
        X509Certificate x509Certificate = this.forward;
        int hashCode = x509Certificate != null ? (-1) ^ x509Certificate.hashCode() : -1;
        X509Certificate x509Certificate2 = this.reverse;
        return x509Certificate2 != null ? (hashCode * 17) ^ x509Certificate2.hashCode() : hashCode;
    }
}
