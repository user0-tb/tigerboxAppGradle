package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.params.DESParameters;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class KeyAgreementSpi extends javax.crypto.KeyAgreementSpi {
    private static final Hashtable algorithms;
    private BigInteger g;
    private BigInteger p;
    private BigInteger result;
    private BigInteger x;

    static {
        Hashtable hashtable = new Hashtable();
        algorithms = hashtable;
        Integer valueOf = Integers.valueOf(64);
        Integer valueOf2 = Integers.valueOf(192);
        Integer valueOf3 = Integers.valueOf(128);
        Integer valueOf4 = Integers.valueOf(256);
        hashtable.put("DES", valueOf);
        hashtable.put("DESEDE", valueOf2);
        hashtable.put("BLOWFISH", valueOf3);
        hashtable.put("AES", valueOf4);
    }

    private byte[] bigIntToBytes(BigInteger bigInteger) {
        int bitLength = (this.p.bitLength() + 7) / 8;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == bitLength) {
            return byteArray;
        }
        if (byteArray[0] == 0 && byteArray.length == bitLength + 1) {
            int length = byteArray.length - 1;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 1, bArr, 0, length);
            return bArr;
        }
        byte[] bArr2 = new byte[bitLength];
        System.arraycopy(byteArray, 0, bArr2, bitLength - byteArray.length, byteArray.length);
        return bArr2;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.x == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        if (!(key instanceof DHPublicKey)) {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        if (dHPublicKey.getParams().getG().equals(this.g) && dHPublicKey.getParams().getP().equals(this.p)) {
            if (z) {
                this.result = dHPublicKey.getY().modPow(this.x, this.p);
                return null;
            }
            BigInteger modPow = dHPublicKey.getY().modPow(this.x, this.p);
            this.result = modPow;
            return new BCDHPublicKey(modPow, dHPublicKey.getParams());
        }
        throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.x == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        return bigIntToBytes(this.result);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        if (this.x == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        byte[] bigIntToBytes = bigIntToBytes(this.result);
        if (bArr.length - i < bigIntToBytes.length) {
            throw new ShortBufferException("DHKeyAgreement - buffer too short");
        }
        System.arraycopy(bigIntToBytes, 0, bArr, i, bigIntToBytes.length);
        return bigIntToBytes.length;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected SecretKey engineGenerateSecret(String str) {
        if (this.x == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        String upperCase = Strings.toUpperCase(str);
        byte[] bigIntToBytes = bigIntToBytes(this.result);
        Hashtable hashtable = algorithms;
        if (hashtable.containsKey(upperCase)) {
            int intValue = ((Integer) hashtable.get(upperCase)).intValue() / 8;
            byte[] bArr = new byte[intValue];
            System.arraycopy(bigIntToBytes, 0, bArr, 0, intValue);
            if (upperCase.startsWith("DES")) {
                DESParameters.setOddParity(bArr);
            }
            return new SecretKeySpec(bArr, str);
        }
        return new SecretKeySpec(bigIntToBytes, str);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        if (algorithmParameterSpec != null) {
            if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            }
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.p = dHParameterSpec.getP();
            this.g = dHParameterSpec.getG();
        } else {
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
        }
        BigInteger x = dHPrivateKey.getX();
        this.result = x;
        this.x = x;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        this.p = dHPrivateKey.getParams().getP();
        this.g = dHPrivateKey.getParams().getG();
        BigInteger x = dHPrivateKey.getX();
        this.result = x;
        this.x = x;
    }
}
