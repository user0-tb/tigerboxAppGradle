package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSABlindingParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;

/* loaded from: classes4.dex */
public class RSABlindingEngine implements AsymmetricBlockCipher {
    private BigInteger blindingFactor;
    private RSACoreEngine core = new RSACoreEngine();
    private boolean forEncryption;
    private RSAKeyParameters key;

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        RSABlindingParameters rSABlindingParameters;
        if (cipherParameters instanceof ParametersWithRandom) {
            rSABlindingParameters = (RSABlindingParameters) ((ParametersWithRandom) cipherParameters).getParameters();
        } else {
            rSABlindingParameters = (RSABlindingParameters) cipherParameters;
        }
        this.core.init(z, rSABlindingParameters.getPublicKey());
        this.forEncryption = z;
        this.key = rSABlindingParameters.getPublicKey();
        this.blindingFactor = rSABlindingParameters.getBlindingFactor();
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.core.getInputBlockSize();
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.core.getOutputBlockSize();
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) {
        BigInteger unblindMessage;
        BigInteger convertInput = this.core.convertInput(bArr, i, i2);
        if (this.forEncryption) {
            unblindMessage = blindMessage(convertInput);
        } else {
            unblindMessage = unblindMessage(convertInput);
        }
        return this.core.convertOutput(unblindMessage);
    }

    private BigInteger blindMessage(BigInteger bigInteger) {
        return bigInteger.multiply(this.blindingFactor.modPow(this.key.getExponent(), this.key.getModulus())).mod(this.key.getModulus());
    }

    private BigInteger unblindMessage(BigInteger bigInteger) {
        BigInteger modulus = this.key.getModulus();
        return bigInteger.multiply(this.blindingFactor.modInverse(modulus)).mod(modulus);
    }
}
