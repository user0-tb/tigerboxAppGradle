package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.gcm.GCMExponentiator;
import org.spongycastle.crypto.modes.gcm.GCMMultiplier;
import org.spongycastle.crypto.modes.gcm.Tables1kGCMExponentiator;
import org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class GCMBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;
    private byte[] H;
    private byte[] J0;
    private byte[] S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        gCMMultiplier = gCMMultiplier == null ? new Tables8kGCMMultiplier() : gCMMultiplier;
        this.cipher = blockCipher;
        this.multiplier = gCMMultiplier;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCM";
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        KeyParameter keyParameter;
        this.forEncryption = z;
        this.macBlock = null;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            this.nonce = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
            this.macSize = macSize / 8;
            keyParameter = aEADParameters.getKey();
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.nonce = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        this.bufBlock = new byte[z ? 16 : this.macSize + 16];
        byte[] bArr = this.nonce;
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (keyParameter != null) {
            this.cipher.init(true, keyParameter);
            byte[] bArr2 = new byte[16];
            this.H = bArr2;
            this.cipher.processBlock(bArr2, 0, bArr2, 0);
            this.multiplier.init(this.H);
            this.exp = null;
        } else if (this.H == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr3 = new byte[16];
        this.J0 = bArr3;
        byte[] bArr4 = this.nonce;
        if (bArr4.length == 12) {
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            this.J0[15] = 1;
        } else {
            gHASH(bArr3, bArr4, bArr4.length);
            byte[] bArr5 = new byte[16];
            Pack.longToBigEndian(this.nonce.length * 8, bArr5, 8);
            gHASHBlock(this.J0, bArr5);
        }
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr6 = this.initialAssociatedText;
        if (bArr6 != null) {
            processAADBytes(bArr6, 0, bArr6.length);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public byte[] getMac() {
        return Arrays.clone(this.macBlock);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getOutputSize(int i) {
        int i2 = i + this.bufOff;
        if (this.forEncryption) {
            return i2 + this.macSize;
        }
        int i3 = this.macSize;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.bufOff;
        if (!this.forEncryption) {
            int i3 = this.macSize;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADByte(byte b) {
        byte[] bArr = this.atBlock;
        int i = this.atBlockPos;
        bArr[i] = b;
        int i2 = i + 1;
        this.atBlockPos = i2;
        if (i2 == 16) {
            gHASHBlock(this.S_at, bArr);
            this.atBlockPos = 0;
            this.atLength += 16;
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.atBlock;
            int i4 = this.atBlockPos;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.atBlockPos = i5;
            if (i5 == 16) {
                gHASHBlock(this.S_at, bArr2);
                this.atBlockPos = 0;
                this.atLength += 16;
            }
        }
    }

    private void initCipher() {
        if (this.atLength > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        int i = this.atBlockPos;
        if (i > 0) {
            gHASHPartial(this.S_atPre, this.atBlock, 0, i);
            this.atLengthPre += this.atBlockPos;
        }
        if (this.atLengthPre > 0) {
            System.arraycopy(this.S_atPre, 0, this.S, 0, 16);
        }
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
        byte[] bArr2 = this.bufBlock;
        int i2 = this.bufOff;
        bArr2[i2] = b;
        int i3 = i2 + 1;
        this.bufOff = i3;
        if (i3 == bArr2.length) {
            outputBlock(bArr, i);
            return 16;
        }
        return 0;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (bArr.length >= i + i2) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte[] bArr3 = this.bufBlock;
                int i6 = this.bufOff;
                bArr3[i6] = bArr[i + i5];
                int i7 = i6 + 1;
                this.bufOff = i7;
                if (i7 == bArr3.length) {
                    outputBlock(bArr2, i3 + i4);
                    i4 += 16;
                }
            }
            return i4;
        }
        throw new DataLengthException("Input buffer too short");
    }

    private void outputBlock(byte[] bArr, int i) {
        if (bArr.length < i + 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        gCTRBlock(this.bufBlock, bArr, i);
        if (this.forEncryption) {
            this.bufOff = 0;
            return;
        }
        byte[] bArr2 = this.bufBlock;
        System.arraycopy(bArr2, 16, bArr2, 0, this.macSize);
        this.bufOff = this.macSize;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, InvalidCipherTextException {
        if (this.totalLength == 0) {
            initCipher();
        }
        int i2 = this.bufOff;
        if (!this.forEncryption) {
            int i3 = this.macSize;
            if (i2 < i3) {
                throw new InvalidCipherTextException("data too short");
            }
            i2 -= i3;
        }
        int i4 = i2;
        if (i4 > 0) {
            if (bArr.length < i + i4) {
                throw new OutputLengthException("Output buffer too short");
            }
            gCTRPartial(this.bufBlock, 0, i4, bArr, i);
        }
        long j = this.atLength;
        int i5 = this.atBlockPos;
        long j2 = j + i5;
        this.atLength = j2;
        if (j2 > this.atLengthPre) {
            if (i5 > 0) {
                gHASHPartial(this.S_at, this.atBlock, 0, i5);
            }
            if (this.atLengthPre > 0) {
                xor(this.S_at, this.S_atPre);
            }
            long j3 = ((this.totalLength * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.exp == null) {
                Tables1kGCMExponentiator tables1kGCMExponentiator = new Tables1kGCMExponentiator();
                this.exp = tables1kGCMExponentiator;
                tables1kGCMExponentiator.init(this.H);
            }
            this.exp.exponentiateX(j3, bArr2);
            multiply(this.S_at, bArr2);
            xor(this.S, this.S_at);
        }
        byte[] bArr3 = new byte[16];
        Pack.longToBigEndian(this.atLength * 8, bArr3, 0);
        Pack.longToBigEndian(this.totalLength * 8, bArr3, 8);
        gHASHBlock(this.S, bArr3);
        byte[] bArr4 = new byte[16];
        this.cipher.processBlock(this.J0, 0, bArr4, 0);
        xor(bArr4, this.S);
        int i6 = this.macSize;
        byte[] bArr5 = new byte[i6];
        this.macBlock = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i6);
        if (this.forEncryption) {
            int length = bArr.length;
            int i7 = this.macSize;
            if (length < i + i4 + i7) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.macBlock, 0, bArr, i + this.bufOff, i7);
            i4 += this.macSize;
        } else {
            int i8 = this.macSize;
            byte[] bArr6 = new byte[i8];
            System.arraycopy(this.bufBlock, i4, bArr6, 0, i8);
            if (!Arrays.constantTimeAreEqual(this.macBlock, bArr6)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return i4;
    }

    @Override // org.spongycastle.crypto.modes.AEADBlockCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z) {
        this.cipher.reset();
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z) {
            this.macBlock = null;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    private void gCTRBlock(byte[] bArr, byte[] bArr2, int i) {
        byte[] nextCounterBlock = getNextCounterBlock();
        xor(nextCounterBlock, bArr);
        System.arraycopy(nextCounterBlock, 0, bArr2, i, 16);
        byte[] bArr3 = this.S;
        if (this.forEncryption) {
            bArr = nextCounterBlock;
        }
        gHASHBlock(bArr3, bArr);
        this.totalLength += 16;
    }

    private void gCTRPartial(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] nextCounterBlock = getNextCounterBlock();
        xor(nextCounterBlock, bArr, i, i2);
        System.arraycopy(nextCounterBlock, 0, bArr2, i3, i2);
        byte[] bArr3 = this.S;
        if (this.forEncryption) {
            bArr = nextCounterBlock;
        }
        gHASHPartial(bArr3, bArr, 0, i2);
        this.totalLength += i2;
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            gHASHPartial(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i, int i2) {
        xor(bArr, bArr2, i, i2);
        this.multiplier.multiplyH(bArr);
    }

    private byte[] getNextCounterBlock() {
        for (int i = 15; i >= 12; i--) {
            byte[] bArr = this.counter;
            byte b = (byte) ((bArr[i] + 1) & 255);
            bArr[i] = b;
            if (b != 0) {
                break;
            }
        }
        byte[] bArr2 = new byte[16];
        this.cipher.processBlock(this.counter, 0, bArr2, 0);
        return bArr2;
    }

    private static void multiply(byte[] bArr, byte[] bArr2) {
        byte[] clone = Arrays.clone(bArr);
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = bArr2[i];
            for (int i2 = 7; i2 >= 0; i2--) {
                if (((1 << i2) & b) != 0) {
                    xor(bArr3, clone);
                }
                boolean z = (clone[15] & 1) != 0;
                shiftRight(clone);
                if (z) {
                    clone[0] = (byte) (clone[0] ^ (-31));
                }
            }
        }
        System.arraycopy(bArr3, 0, bArr, 0, 16);
    }

    private static void shiftRight(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = bArr[i] & 255;
            bArr[i] = (byte) (i2 | (i3 >>> 1));
            i++;
            if (i == 16) {
                return;
            }
            i2 = (i3 & 1) << 7;
        }
    }

    private static void xor(byte[] bArr, byte[] bArr2) {
        for (int i = 15; i >= 0; i--) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    private static void xor(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return;
            }
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i + i3]);
            i2 = i3;
        }
    }
}
