package org.spongycastle.operator.jcajce;

import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.ProviderException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.operator.AsymmetricKeyUnwrapper;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.OperatorException;

/* loaded from: classes4.dex */
public class JceAsymmetricKeyUnwrapper extends AsymmetricKeyUnwrapper {
    private Map extraMappings;
    private OperatorHelper helper;
    private PrivateKey privKey;

    public JceAsymmetricKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        super(algorithmIdentifier);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.privKey = privateKey;
    }

    public JceAsymmetricKeyUnwrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceAsymmetricKeyUnwrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    @Override // org.spongycastle.operator.KeyUnwrapper
    public GenericKey generateUnwrappedKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws OperatorException {
        Key key = null;
        try {
            Cipher createAsymmetricWrapper = this.helper.createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm(), this.extraMappings);
            AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters(getAlgorithmIdentifier());
            try {
                if (createAlgorithmParameters != null) {
                    createAsymmetricWrapper.init(4, this.privKey, createAlgorithmParameters);
                } else {
                    createAsymmetricWrapper.init(4, this.privKey);
                }
                key = createAsymmetricWrapper.unwrap(bArr, this.helper.getKeyAlgorithmName(algorithmIdentifier.getAlgorithm()), 3);
            } catch (IllegalStateException | UnsupportedOperationException | GeneralSecurityException | ProviderException unused) {
            }
            if (key == null) {
                createAsymmetricWrapper.init(2, this.privKey);
                key = new SecretKeySpec(createAsymmetricWrapper.doFinal(bArr), algorithmIdentifier.getAlgorithm().getId());
            }
            return new JceGenericKey(algorithmIdentifier, key);
        } catch (InvalidKeyException e) {
            throw new OperatorException("key invalid: " + e.getMessage(), e);
        } catch (BadPaddingException e2) {
            throw new OperatorException("bad padding: " + e2.getMessage(), e2);
        } catch (IllegalBlockSizeException e3) {
            throw new OperatorException("illegal blocksize: " + e3.getMessage(), e3);
        }
    }
}
