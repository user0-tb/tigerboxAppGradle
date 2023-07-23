package org.spongycastle.openssl.jcajce;

import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.cert.jcajce.JcaX509AttributeCertificateHolder;
import org.spongycastle.cert.jcajce.JcaX509CRLHolder;
import org.spongycastle.cert.jcajce.JcaX509CertificateHolder;
import org.spongycastle.jce.PKCS10CertificationRequest;
import org.spongycastle.openssl.MiscPEMGenerator;
import org.spongycastle.openssl.PEMEncryptor;
import org.spongycastle.x509.X509AttributeCertificate;
import org.spongycastle.x509.X509V2AttributeCertificate;

/* loaded from: classes4.dex */
public class JcaMiscPEMGenerator extends MiscPEMGenerator {
    private String algorithm;
    private Object obj;
    private char[] password;
    private Provider provider;
    private SecureRandom random;

    public JcaMiscPEMGenerator(Object obj) throws IOException {
        super(convertObject(obj));
    }

    public JcaMiscPEMGenerator(Object obj, PEMEncryptor pEMEncryptor) throws IOException {
        super(convertObject(obj), pEMEncryptor);
    }

    private static Object convertObject(Object obj) throws IOException {
        if (obj instanceof X509Certificate) {
            try {
                return new JcaX509CertificateHolder((X509Certificate) obj);
            } catch (CertificateEncodingException e) {
                throw new IllegalArgumentException("Cannot encode object: " + e.toString());
            }
        } else if (obj instanceof X509CRL) {
            try {
                return new JcaX509CRLHolder((X509CRL) obj);
            } catch (CRLException e2) {
                throw new IllegalArgumentException("Cannot encode object: " + e2.toString());
            }
        } else if (obj instanceof KeyPair) {
            return convertObject(((KeyPair) obj).getPrivate());
        } else {
            if (obj instanceof PrivateKey) {
                return PrivateKeyInfo.getInstance(((Key) obj).getEncoded());
            }
            if (obj instanceof PublicKey) {
                return SubjectPublicKeyInfo.getInstance(((PublicKey) obj).getEncoded());
            }
            if (obj instanceof X509AttributeCertificate) {
                return new JcaX509AttributeCertificateHolder((X509V2AttributeCertificate) obj);
            }
            return obj instanceof PKCS10CertificationRequest ? new org.spongycastle.pkcs.PKCS10CertificationRequest(((PKCS10CertificationRequest) obj).getEncoded()) : obj;
        }
    }
}
