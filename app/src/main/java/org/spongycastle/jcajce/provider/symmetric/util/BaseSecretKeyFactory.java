package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes4.dex */
public class BaseSecretKeyFactory extends SecretKeyFactorySpi implements PBE {
    protected String algName;
    protected ASN1ObjectIdentifier algOid;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseSecretKeyFactory(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algName = str;
        this.algOid = aSN1ObjectIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof SecretKeySpec) {
            return (SecretKey) keySpec;
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
        if (cls != null) {
            if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            }
            if (SecretKeySpec.class.isAssignableFrom(cls)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.algName);
            }
            try {
                return (KeySpec) cls.getConstructor(byte[].class).newInstance(secretKey.getEncoded());
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("keySpec parameter is null");
    }

    @Override // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineTranslateKey(SecretKey secretKey) throws InvalidKeyException {
        if (secretKey == null) {
            throw new InvalidKeyException("key parameter is null");
        }
        if (!secretKey.getAlgorithm().equalsIgnoreCase(this.algName)) {
            throw new InvalidKeyException("Key not of type " + this.algName + DownloadsManager.EXTENSION_SEPARATOR);
        }
        return new SecretKeySpec(secretKey.getEncoded(), this.algName);
    }
}
