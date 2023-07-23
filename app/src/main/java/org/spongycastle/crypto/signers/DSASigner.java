package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.params.DSAKeyParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;

/* loaded from: classes4.dex */
public class DSASigner implements DSA {
    private final DSAKCalculator kCalculator;
    private DSAKeyParameters key;
    private SecureRandom random;

    public DSASigner() {
        this.kCalculator = new RandomDSAKCalculator();
    }

    public DSASigner(DSAKCalculator dSAKCalculator) {
        this.kCalculator = dSAKCalculator;
    }

    @Override // org.spongycastle.crypto.DSA
    public void init(boolean z, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (z) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.key = (DSAPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
                this.random = initSecureRandom((z || this.kCalculator.isDeterministic()) ? false : true, secureRandom);
            }
            this.key = (DSAPrivateKeyParameters) cipherParameters;
        } else {
            this.key = (DSAPublicKeyParameters) cipherParameters;
        }
        secureRandom = null;
        this.random = initSecureRandom((z || this.kCalculator.isDeterministic()) ? false : true, secureRandom);
    }

    @Override // org.spongycastle.crypto.DSA
    public BigInteger[] generateSignature(byte[] bArr) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger calculateE = calculateE(parameters.getQ(), bArr);
        if (this.kCalculator.isDeterministic()) {
            this.kCalculator.init(parameters.getQ(), ((DSAPrivateKeyParameters) this.key).getX(), bArr);
        } else {
            this.kCalculator.init(parameters.getQ(), this.random);
        }
        BigInteger nextK = this.kCalculator.nextK();
        BigInteger mod = parameters.getG().modPow(nextK, parameters.getP()).mod(parameters.getQ());
        return new BigInteger[]{mod, nextK.modInverse(parameters.getQ()).multiply(calculateE.add(((DSAPrivateKeyParameters) this.key).getX().multiply(mod))).mod(parameters.getQ())};
    }

    @Override // org.spongycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        DSAParameters parameters = this.key.getParameters();
        BigInteger calculateE = calculateE(parameters.getQ(), bArr);
        BigInteger valueOf = BigInteger.valueOf(0L);
        if (valueOf.compareTo(bigInteger) >= 0 || parameters.getQ().compareTo(bigInteger) <= 0 || valueOf.compareTo(bigInteger2) >= 0 || parameters.getQ().compareTo(bigInteger2) <= 0) {
            return false;
        }
        BigInteger modInverse = bigInteger2.modInverse(parameters.getQ());
        return parameters.getG().modPow(calculateE.multiply(modInverse).mod(parameters.getQ()), parameters.getP()).multiply(((DSAPublicKeyParameters) this.key).getY().modPow(bigInteger.multiply(modInverse).mod(parameters.getQ()), parameters.getP())).mod(parameters.getP()).mod(parameters.getQ()).equals(bigInteger);
    }

    private BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        if (bigInteger.bitLength() >= bArr.length * 8) {
            return new BigInteger(1, bArr);
        }
        int bitLength = bigInteger.bitLength() / 8;
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(bArr, 0, bArr2, 0, bitLength);
        return new BigInteger(1, bArr2);
    }

    protected SecureRandom initSecureRandom(boolean z, SecureRandom secureRandom) {
        if (z) {
            return secureRandom != null ? secureRandom : new SecureRandom();
        }
        return null;
    }
}
