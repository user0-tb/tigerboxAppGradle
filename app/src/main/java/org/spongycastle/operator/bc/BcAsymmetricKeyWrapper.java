package org.spongycastle.operator.bc;

import java.security.SecureRandom;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.operator.AsymmetricKeyWrapper;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.OperatorException;

/* loaded from: classes4.dex */
public abstract class BcAsymmetricKeyWrapper extends AsymmetricKeyWrapper {
    private AsymmetricKeyParameter publicKey;
    private SecureRandom random;

    protected abstract AsymmetricBlockCipher createAsymmetricWrapper(ASN1ObjectIdentifier aSN1ObjectIdentifier);

    public BcAsymmetricKeyWrapper(AlgorithmIdentifier algorithmIdentifier, AsymmetricKeyParameter asymmetricKeyParameter) {
        super(algorithmIdentifier);
        this.publicKey = asymmetricKeyParameter;
    }

    public BcAsymmetricKeyWrapper setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    @Override // org.spongycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(GenericKey genericKey) throws OperatorException {
        AsymmetricBlockCipher createAsymmetricWrapper = createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm());
        AsymmetricKeyParameter asymmetricKeyParameter = this.publicKey;
        if (this.random != null) {
            new ParametersWithRandom(asymmetricKeyParameter, this.random);
        }
        try {
            byte[] keyBytes = OperatorUtils.getKeyBytes(genericKey);
            createAsymmetricWrapper.init(true, this.publicKey);
            return createAsymmetricWrapper.processBlock(keyBytes, 0, keyBytes.length);
        } catch (InvalidCipherTextException e) {
            throw new OperatorException("unable to encrypt contents key", e);
        }
    }
}
