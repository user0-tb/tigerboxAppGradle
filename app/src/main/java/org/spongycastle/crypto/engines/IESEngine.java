package org.spongycastle.crypto.engines;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.spongycastle.crypto.BasicAgreement;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.EphemeralKeyPair;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.KeyParser;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.IESParameters;
import org.spongycastle.crypto.params.IESWithCipherParameters;
import org.spongycastle.crypto.params.KDFParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.BigIntegers;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class IESEngine {
    private byte[] IV;
    byte[] V;
    BasicAgreement agree;
    BufferedBlockCipher cipher;
    boolean forEncryption;
    DerivationFunction kdf;
    private EphemeralKeyPairGenerator keyPairGenerator;
    private KeyParser keyParser;
    Mac mac;
    byte[] macBuf;
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.cipher = null;
    }

    public IESEngine(BasicAgreement basicAgreement, DerivationFunction derivationFunction, Mac mac, BufferedBlockCipher bufferedBlockCipher) {
        this.agree = basicAgreement;
        this.kdf = derivationFunction;
        this.mac = mac;
        this.macBuf = new byte[mac.getMacSize()];
        this.cipher = bufferedBlockCipher;
    }

    public void init(boolean z, CipherParameters cipherParameters, CipherParameters cipherParameters2, CipherParameters cipherParameters3) {
        this.forEncryption = z;
        this.privParam = cipherParameters;
        this.pubParam = cipherParameters2;
        this.V = new byte[0];
        extractParams(cipherParameters3);
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, EphemeralKeyPairGenerator ephemeralKeyPairGenerator) {
        this.forEncryption = true;
        this.pubParam = asymmetricKeyParameter;
        this.keyPairGenerator = ephemeralKeyPairGenerator;
        extractParams(cipherParameters);
    }

    public void init(AsymmetricKeyParameter asymmetricKeyParameter, CipherParameters cipherParameters, KeyParser keyParser) {
        this.forEncryption = false;
        this.privParam = asymmetricKeyParameter;
        this.keyParser = keyParser;
        extractParams(cipherParameters);
    }

    private void extractParams(CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.IV = parametersWithIV.getIV();
            this.param = (IESParameters) parametersWithIV.getParameters();
            return;
        }
        this.IV = null;
        this.param = (IESParameters) cipherParameters;
    }

    public BufferedBlockCipher getCipher() {
        return this.cipher;
    }

    public Mac getMac() {
        return this.mac;
    }

    private byte[] encryptBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        if (this.cipher == null) {
            byte[] bArr4 = new byte[i2];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr3 = new byte[macKeySize];
            int i3 = i2 + macKeySize;
            byte[] bArr5 = new byte[i3];
            this.kdf.generateBytes(bArr5, 0, i3);
            if (this.V.length != 0) {
                System.arraycopy(bArr5, 0, bArr3, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, i2);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, i2);
                System.arraycopy(bArr5, i2, bArr3, 0, macKeySize);
            }
            bArr2 = new byte[i2];
            for (int i4 = 0; i4 != i2; i4++) {
                bArr2[i4] = (byte) (bArr[i + i4] ^ bArr4[i4]);
            }
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr6 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            byte[] bArr7 = new byte[macKeySize2];
            int i5 = cipherKeySize + macKeySize2;
            byte[] bArr8 = new byte[i5];
            this.kdf.generateBytes(bArr8, 0, i5);
            System.arraycopy(bArr8, 0, bArr6, 0, cipherKeySize);
            System.arraycopy(bArr8, cipherKeySize, bArr7, 0, macKeySize2);
            if (this.IV != null) {
                this.cipher.init(true, new ParametersWithIV(new KeyParameter(bArr6), this.IV));
            } else {
                this.cipher.init(true, new KeyParameter(bArr6));
            }
            bArr2 = new byte[this.cipher.getOutputSize(i2)];
            int processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
            i2 = processBytes + this.cipher.doFinal(bArr2, processBytes);
            bArr3 = bArr7;
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] bArr9 = new byte[4];
        if (this.V.length != 0 && encodingV != null) {
            Pack.intToBigEndian(encodingV.length * 8, bArr9, 0);
        }
        int macSize = this.mac.getMacSize();
        byte[] bArr10 = new byte[macSize];
        this.mac.init(new KeyParameter(bArr3));
        this.mac.update(bArr2, 0, bArr2.length);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.V.length != 0) {
            this.mac.update(bArr9, 0, 4);
        }
        this.mac.doFinal(bArr10, 0);
        byte[] bArr11 = this.V;
        byte[] bArr12 = new byte[bArr11.length + i2 + macSize];
        System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
        System.arraycopy(bArr2, 0, bArr12, this.V.length, i2);
        System.arraycopy(bArr10, 0, bArr12, this.V.length + i2, macSize);
        return bArr12;
    }

    private byte[] decryptBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] bArr2;
        byte[] bArr3;
        int doFinal;
        if (i2 <= this.param.getMacKeySize() / 8) {
            throw new InvalidCipherTextException("Length of input must be greater than the MAC");
        }
        if (this.cipher == null) {
            doFinal = (i2 - this.V.length) - this.mac.getMacSize();
            byte[] bArr4 = new byte[doFinal];
            int macKeySize = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize];
            int i3 = doFinal + macKeySize;
            byte[] bArr5 = new byte[i3];
            this.kdf.generateBytes(bArr5, 0, i3);
            if (this.V.length != 0) {
                System.arraycopy(bArr5, 0, bArr2, 0, macKeySize);
                System.arraycopy(bArr5, macKeySize, bArr4, 0, doFinal);
            } else {
                System.arraycopy(bArr5, 0, bArr4, 0, doFinal);
                System.arraycopy(bArr5, doFinal, bArr2, 0, macKeySize);
            }
            bArr3 = new byte[doFinal];
            for (int i4 = 0; i4 != doFinal; i4++) {
                bArr3[i4] = (byte) (bArr[(this.V.length + i) + i4] ^ bArr4[i4]);
            }
        } else {
            int cipherKeySize = ((IESWithCipherParameters) this.param).getCipherKeySize() / 8;
            byte[] bArr6 = new byte[cipherKeySize];
            int macKeySize2 = this.param.getMacKeySize() / 8;
            bArr2 = new byte[macKeySize2];
            int i5 = cipherKeySize + macKeySize2;
            byte[] bArr7 = new byte[i5];
            this.kdf.generateBytes(bArr7, 0, i5);
            System.arraycopy(bArr7, 0, bArr6, 0, cipherKeySize);
            System.arraycopy(bArr7, cipherKeySize, bArr2, 0, macKeySize2);
            if (this.IV != null) {
                this.cipher.init(false, new ParametersWithIV(new KeyParameter(bArr6), this.IV));
            } else {
                this.cipher.init(false, new KeyParameter(bArr6));
            }
            bArr3 = new byte[this.cipher.getOutputSize((i2 - this.V.length) - this.mac.getMacSize())];
            BufferedBlockCipher bufferedBlockCipher = this.cipher;
            byte[] bArr8 = this.V;
            int processBytes = bufferedBlockCipher.processBytes(bArr, i + bArr8.length, (i2 - bArr8.length) - this.mac.getMacSize(), bArr3, 0);
            doFinal = processBytes + this.cipher.doFinal(bArr3, processBytes);
        }
        byte[] encodingV = this.param.getEncodingV();
        byte[] bArr9 = new byte[4];
        if (this.V.length != 0 && encodingV != null) {
            Pack.intToBigEndian(encodingV.length * 8, bArr9, 0);
        }
        int i6 = i + i2;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i6 - this.mac.getMacSize(), i6);
        int length = copyOfRange.length;
        byte[] bArr10 = new byte[length];
        this.mac.init(new KeyParameter(bArr2));
        Mac mac = this.mac;
        byte[] bArr11 = this.V;
        mac.update(bArr, i + bArr11.length, (i2 - bArr11.length) - length);
        if (encodingV != null) {
            this.mac.update(encodingV, 0, encodingV.length);
        }
        if (this.V.length != 0) {
            this.mac.update(bArr9, 0, 4);
        }
        this.mac.doFinal(bArr10, 0);
        if (!Arrays.constantTimeAreEqual(copyOfRange, bArr10)) {
            throw new InvalidCipherTextException("Invalid MAC.");
        }
        return Arrays.copyOfRange(bArr3, 0, doFinal);
    }

    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.forEncryption) {
            EphemeralKeyPairGenerator ephemeralKeyPairGenerator = this.keyPairGenerator;
            if (ephemeralKeyPairGenerator != null) {
                EphemeralKeyPair generate = ephemeralKeyPairGenerator.generate();
                this.privParam = generate.getKeyPair().getPrivate();
                this.V = generate.getEncodedPublicKey();
            }
        } else if (this.keyParser != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, i, i2);
            try {
                this.pubParam = this.keyParser.readKey(byteArrayInputStream);
                this.V = Arrays.copyOfRange(bArr, i, (i2 - byteArrayInputStream.available()) + i);
            } catch (IOException e) {
                throw new InvalidCipherTextException("unable to recover ephemeral public key: " + e.getMessage(), e);
            }
        }
        this.agree.init(this.privParam);
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(this.agree.getFieldSize(), this.agree.calculateAgreement(this.pubParam));
        byte[] bArr2 = this.V;
        if (bArr2.length != 0) {
            byte[] bArr3 = new byte[bArr2.length + asUnsignedByteArray.length];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(asUnsignedByteArray, 0, bArr3, this.V.length, asUnsignedByteArray.length);
            asUnsignedByteArray = bArr3;
        }
        this.kdf.init(new KDFParameters(asUnsignedByteArray, this.param.getDerivationV()));
        return this.forEncryption ? encryptBlock(bArr, i, i2) : decryptBlock(bArr, i, i2);
    }
}
