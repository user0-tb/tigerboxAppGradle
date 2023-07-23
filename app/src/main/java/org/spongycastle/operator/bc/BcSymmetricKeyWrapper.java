package org.spongycastle.operator.bc;

import java.security.SecureRandom;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.OperatorException;
import org.spongycastle.operator.SymmetricKeyWrapper;

/* loaded from: classes4.dex */
public class BcSymmetricKeyWrapper extends SymmetricKeyWrapper {
    private SecureRandom random;
    private Wrapper wrapper;
    private KeyParameter wrappingKey;

    public BcSymmetricKeyWrapper(AlgorithmIdentifier algorithmIdentifier, Wrapper wrapper, KeyParameter keyParameter) {
        super(algorithmIdentifier);
        this.wrapper = wrapper;
        this.wrappingKey = keyParameter;
    }

    public BcSymmetricKeyWrapper setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    @Override // org.spongycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(GenericKey genericKey) throws OperatorException {
        byte[] keyBytes = OperatorUtils.getKeyBytes(genericKey);
        if (this.random == null) {
            this.wrapper.init(true, this.wrappingKey);
        } else {
            this.wrapper.init(true, new ParametersWithRandom(this.wrappingKey, this.random));
        }
        return this.wrapper.wrap(keyBytes, 0, keyBytes.length);
    }
}
