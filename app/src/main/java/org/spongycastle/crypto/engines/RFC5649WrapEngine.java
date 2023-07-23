package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class RFC5649WrapEngine implements Wrapper {
    private BlockCipher engine;
    private byte[] extractedAIV = null;
    private boolean forWrapping;
    private byte[] highOrderIV;
    private KeyParameter param;
    private byte[] preIV;

    public RFC5649WrapEngine(BlockCipher blockCipher) {
        byte[] bArr = {-90, 89, 89, -90};
        this.highOrderIV = bArr;
        this.preIV = bArr;
        this.engine = blockCipher;
    }

    @Override // org.spongycastle.crypto.Wrapper
    public void init(boolean z, CipherParameters cipherParameters) {
        this.forWrapping = z;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.preIV = parametersWithIV.getIV();
            this.param = (KeyParameter) parametersWithIV.getParameters();
            if (this.preIV.length != 4) {
                throw new IllegalArgumentException("IV length not equal to 4");
            }
        }
    }

    @Override // org.spongycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    private byte[] padPlaintext(byte[] bArr) {
        int length = bArr.length;
        int i = (8 - (length % 8)) % 8;
        byte[] bArr2 = new byte[length + i];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        if (i != 0) {
            System.arraycopy(new byte[i], 0, bArr2, length, i);
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i, int i2) {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        byte[] bArr2 = new byte[8];
        byte[] intToBigEndian = Pack.intToBigEndian(i2);
        byte[] bArr3 = this.preIV;
        int i3 = 0;
        System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
        System.arraycopy(intToBigEndian, 0, bArr2, this.preIV.length, intToBigEndian.length);
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArr, i, bArr4, 0, i2);
        byte[] padPlaintext = padPlaintext(bArr4);
        if (padPlaintext.length == 8) {
            int length = padPlaintext.length + 8;
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr2, 0, bArr5, 0, 8);
            System.arraycopy(padPlaintext, 0, bArr5, 8, padPlaintext.length);
            this.engine.init(true, this.param);
            while (i3 < length) {
                this.engine.processBlock(bArr5, i3, bArr5, i3);
                i3 += this.engine.getBlockSize();
            }
            return bArr5;
        }
        RFC3394WrapEngine rFC3394WrapEngine = new RFC3394WrapEngine(this.engine);
        rFC3394WrapEngine.init(true, new ParametersWithIV(this.param, bArr2));
        return rFC3394WrapEngine.wrap(padPlaintext, i, padPlaintext.length);
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] rfc3394UnwrapNoIvCheck;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int i3 = i2 / 8;
        if (i3 * 8 == i2) {
            if (i3 == 1) {
                throw new InvalidCipherTextException("unwrap data must be at least 16 bytes");
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            byte[] bArr3 = new byte[i2];
            if (i3 == 2) {
                this.engine.init(false, this.param);
                int i4 = 0;
                while (i4 < i2) {
                    this.engine.processBlock(bArr2, i4, bArr3, i4);
                    i4 += this.engine.getBlockSize();
                }
                byte[] bArr4 = new byte[8];
                this.extractedAIV = bArr4;
                System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
                byte[] bArr5 = this.extractedAIV;
                int length = i2 - bArr5.length;
                rfc3394UnwrapNoIvCheck = new byte[length];
                System.arraycopy(bArr3, bArr5.length, rfc3394UnwrapNoIvCheck, 0, length);
            } else {
                rfc3394UnwrapNoIvCheck = rfc3394UnwrapNoIvCheck(bArr, i, i2);
            }
            byte[] bArr6 = new byte[4];
            byte[] bArr7 = new byte[4];
            System.arraycopy(this.extractedAIV, 0, bArr6, 0, 4);
            System.arraycopy(this.extractedAIV, 4, bArr7, 0, 4);
            int bigEndianToInt = Pack.bigEndianToInt(bArr7, 0);
            boolean constantTimeAreEqual = Arrays.constantTimeAreEqual(bArr6, this.preIV);
            int length2 = rfc3394UnwrapNoIvCheck.length;
            if (bigEndianToInt <= length2 - 8) {
                constantTimeAreEqual = false;
            }
            if (bigEndianToInt > length2) {
                constantTimeAreEqual = false;
            }
            int i5 = length2 - bigEndianToInt;
            byte[] bArr8 = new byte[i5];
            System.arraycopy(rfc3394UnwrapNoIvCheck, rfc3394UnwrapNoIvCheck.length - i5, bArr8, 0, i5);
            if (!Arrays.constantTimeAreEqual(bArr8, new byte[i5])) {
                constantTimeAreEqual = false;
            }
            byte[] bArr9 = new byte[bigEndianToInt];
            System.arraycopy(rfc3394UnwrapNoIvCheck, 0, bArr9, 0, bigEndianToInt);
            if (constantTimeAreEqual) {
                return bArr9;
            }
            throw new InvalidCipherTextException("checksum failed");
        }
        throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
    }

    private byte[] rfc3394UnwrapNoIvCheck(byte[] bArr, int i, int i2) {
        int i3 = i2 - 8;
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[8];
        byte[] bArr4 = new byte[16];
        System.arraycopy(bArr, i, bArr3, 0, 8);
        System.arraycopy(bArr, i + 8, bArr2, 0, i3);
        this.engine.init(false, this.param);
        int i4 = (i2 / 8) - 1;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = i4; i6 >= 1; i6--) {
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                int i7 = (i6 - 1) * 8;
                System.arraycopy(bArr2, i7, bArr4, 8, 8);
                int i8 = (i4 * i5) + i6;
                int i9 = 1;
                while (i8 != 0) {
                    int i10 = 8 - i9;
                    bArr4[i10] = (byte) (((byte) i8) ^ bArr4[i10]);
                    i8 >>>= 8;
                    i9++;
                }
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr2, i7, 8);
            }
        }
        this.extractedAIV = bArr3;
        return bArr2;
    }
}
