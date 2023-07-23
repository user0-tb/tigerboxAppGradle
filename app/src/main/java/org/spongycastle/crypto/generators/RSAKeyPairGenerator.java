package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.RSAKeyGenerationParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.spongycastle.math.ec.WNafUtil;

/* loaded from: classes4.dex */
public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private RSAKeyGenerationParameters param;

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (RSAKeyGenerationParameters) keyGenerationParameters;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger chooseRandomPrime;
        BigInteger multiply;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int strength = this.param.getStrength();
        int i = strength >>> 1;
        int i2 = strength - i;
        int i3 = strength / 3;
        int i4 = strength >>> 2;
        BigInteger publicExponent = this.param.getPublicExponent();
        BigInteger chooseRandomPrime2 = chooseRandomPrime(i2, publicExponent);
        while (true) {
            chooseRandomPrime = chooseRandomPrime(i, publicExponent);
            if (chooseRandomPrime.subtract(chooseRandomPrime2).abs().bitLength() >= i3) {
                multiply = chooseRandomPrime2.multiply(chooseRandomPrime);
                if (multiply.bitLength() != strength) {
                    chooseRandomPrime2 = chooseRandomPrime2.max(chooseRandomPrime);
                } else if (WNafUtil.getNafWeight(multiply) >= i4) {
                    break;
                } else {
                    chooseRandomPrime2 = chooseRandomPrime(i2, publicExponent);
                }
            }
        }
        if (chooseRandomPrime2.compareTo(chooseRandomPrime) < 0) {
            bigInteger2 = chooseRandomPrime2;
            bigInteger = chooseRandomPrime;
        } else {
            bigInteger = chooseRandomPrime2;
            bigInteger2 = chooseRandomPrime;
        }
        BigInteger bigInteger3 = ONE;
        BigInteger subtract = bigInteger.subtract(bigInteger3);
        BigInteger subtract2 = bigInteger2.subtract(bigInteger3);
        BigInteger modInverse = publicExponent.modInverse(subtract.multiply(subtract2));
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RSAKeyParameters(false, multiply, publicExponent), (AsymmetricKeyParameter) new RSAPrivateCrtKeyParameters(multiply, publicExponent, modInverse, bigInteger, bigInteger2, modInverse.remainder(subtract), modInverse.remainder(subtract2), bigInteger2.modInverse(bigInteger)));
    }

    protected BigInteger chooseRandomPrime(int i, BigInteger bigInteger) {
        while (true) {
            BigInteger bigInteger2 = new BigInteger(i, 1, this.param.getRandom());
            BigInteger mod = bigInteger2.mod(bigInteger);
            BigInteger bigInteger3 = ONE;
            if (!mod.equals(bigInteger3) && bigInteger2.isProbablePrime(this.param.getCertainty()) && bigInteger.gcd(bigInteger2.subtract(bigInteger3)).equals(bigInteger3)) {
                return bigInteger2;
            }
        }
    }
}
