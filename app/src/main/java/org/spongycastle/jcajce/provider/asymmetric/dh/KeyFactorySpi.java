package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;

/* loaded from: classes4.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        } else if (cls.isAssignableFrom(DHPublicKeySpec.class) && (key instanceof DHPublicKey)) {
            DHPublicKey dHPublicKey = (DHPublicKey) key;
            return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
        } else {
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCDHPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCDHPrivateKey((DHPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DHPrivateKeySpec) {
            return new BCDHPrivateKey((DHPrivateKeySpec) keySpec);
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof DHPublicKeySpec) {
            return new BCDHPublicKey((DHPublicKeySpec) keySpec);
        }
        return super.engineGeneratePublic(keySpec);
    }

    @Override // org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals(PKCSObjectIdentifiers.dhKeyAgreement)) {
            return new BCDHPrivateKey(privateKeyInfo);
        }
        if (algorithm.equals(X9ObjectIdentifiers.dhpublicnumber)) {
            return new BCDHPrivateKey(privateKeyInfo);
        }
        throw new IOException("algorithm identifier " + algorithm + " in key not recognised");
    }

    @Override // org.spongycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals(PKCSObjectIdentifiers.dhKeyAgreement)) {
            return new BCDHPublicKey(subjectPublicKeyInfo);
        }
        if (algorithm.equals(X9ObjectIdentifiers.dhpublicnumber)) {
            return new BCDHPublicKey(subjectPublicKeyInfo);
        }
        throw new IOException("algorithm identifier " + algorithm + " in key not recognised");
    }
}
