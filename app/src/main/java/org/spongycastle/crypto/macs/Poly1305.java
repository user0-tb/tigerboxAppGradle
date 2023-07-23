package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.generators.Poly1305KeyGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;
    private int h0;
    private int h1;
    private int h2;
    private int h3;
    private int h4;
    private int k0;
    private int k1;
    private int k2;
    private int k3;
    private int r0;
    private int r1;
    private int r2;
    private int r3;
    private int r4;
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private final byte[] singleByte;

    private static final long mul32x32_64(int i, int i2) {
        return i * i2;
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] bArr;
        if (this.cipher == null) {
            bArr = null;
        } else if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
        } else {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), bArr);
        reset();
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        Poly1305KeyGenerator.checkKey(bArr);
        int littleEndianToInt = Pack.littleEndianToInt(bArr, 16);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 20);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 24);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 28);
        this.r0 = 67108863 & littleEndianToInt;
        int i = ((littleEndianToInt >>> 26) | (littleEndianToInt2 << 6)) & 67108611;
        this.r1 = i;
        int i2 = ((littleEndianToInt2 >>> 20) | (littleEndianToInt3 << 12)) & 67092735;
        this.r2 = i2;
        int i3 = ((littleEndianToInt3 >>> 14) | (littleEndianToInt4 << 18)) & 66076671;
        this.r3 = i3;
        int i4 = (littleEndianToInt4 >>> 8) & 1048575;
        this.r4 = i4;
        this.s1 = i * 5;
        this.s2 = i2 * 5;
        this.s3 = i3 * 5;
        this.s4 = i4 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 0, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            bArr = bArr3;
        }
        this.k0 = Pack.littleEndianToInt(bArr, 0);
        this.k1 = Pack.littleEndianToInt(bArr, 4);
        this.k2 = Pack.littleEndianToInt(bArr, 8);
        this.k3 = Pack.littleEndianToInt(bArr, 12);
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int min = Math.min(i2 - i3, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i3 + i, this.currentBlock, this.currentBlockOffset, min);
            i3 += min;
            this.currentBlockOffset += min;
        }
    }

    private void processBlock() {
        int i = this.currentBlockOffset;
        if (i < 16) {
            this.currentBlock[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.currentBlock[i2] = 0;
            }
        }
        long littleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0) & 4294967295L;
        long littleEndianToInt2 = Pack.littleEndianToInt(this.currentBlock, 4) & 4294967295L;
        long littleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8) & 4294967295L;
        long littleEndianToInt4 = 4294967295L & Pack.littleEndianToInt(this.currentBlock, 12);
        int i3 = (int) (this.h0 + (littleEndianToInt & 67108863));
        this.h0 = i3;
        this.h1 = (int) (this.h1 + ((((littleEndianToInt2 << 32) | littleEndianToInt) >>> 26) & 67108863));
        this.h2 = (int) (this.h2 + (((littleEndianToInt2 | (littleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.h3 = (int) (this.h3 + ((((littleEndianToInt4 << 32) | littleEndianToInt3) >>> 14) & 67108863));
        int i4 = (int) (this.h4 + (littleEndianToInt4 >>> 8));
        this.h4 = i4;
        if (this.currentBlockOffset == 16) {
            this.h4 = i4 + 16777216;
        }
        long mul32x32_64 = mul32x32_64(i3, this.r0) + mul32x32_64(this.h1, this.s4) + mul32x32_64(this.h2, this.s3) + mul32x32_64(this.h3, this.s2) + mul32x32_64(this.h4, this.s1);
        long mul32x32_642 = mul32x32_64(this.h0, this.r1) + mul32x32_64(this.h1, this.r0) + mul32x32_64(this.h2, this.s4) + mul32x32_64(this.h3, this.s3) + mul32x32_64(this.h4, this.s2);
        long mul32x32_643 = mul32x32_64(this.h0, this.r2) + mul32x32_64(this.h1, this.r1) + mul32x32_64(this.h2, this.r0) + mul32x32_64(this.h3, this.s4) + mul32x32_64(this.h4, this.s3);
        long mul32x32_644 = mul32x32_64(this.h0, this.r3) + mul32x32_64(this.h1, this.r2) + mul32x32_64(this.h2, this.r1) + mul32x32_64(this.h3, this.r0) + mul32x32_64(this.h4, this.s4);
        long mul32x32_645 = mul32x32_64(this.h0, this.r4) + mul32x32_64(this.h1, this.r3) + mul32x32_64(this.h2, this.r2) + mul32x32_64(this.h3, this.r1) + mul32x32_64(this.h4, this.r0);
        int i5 = ((int) mul32x32_64) & 67108863;
        this.h0 = i5;
        long j = mul32x32_642 + (mul32x32_64 >>> 26);
        this.h1 = ((int) j) & 67108863;
        long j2 = mul32x32_643 + ((j >>> 26) & (-1));
        this.h2 = ((int) j2) & 67108863;
        long j3 = mul32x32_644 + ((j2 >>> 26) & (-1));
        this.h3 = ((int) j3) & 67108863;
        long j4 = mul32x32_645 + (j3 >>> 26);
        this.h4 = ((int) j4) & 67108863;
        this.h0 = (int) (i5 + ((j4 >>> 26) * 5));
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i + 16 > bArr.length) {
            throw new DataLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i7 = this.h0;
        int i8 = i7 >>> 26;
        int i9 = i7 & 67108863;
        this.h0 = i9;
        int i10 = this.h1 + i8;
        this.h1 = i10;
        int i11 = i10 >>> 26;
        int i12 = i10 & 67108863;
        this.h1 = i12;
        int i13 = this.h2 + i11;
        this.h2 = i13;
        int i14 = i13 >>> 26;
        int i15 = i13 & 67108863;
        this.h2 = i15;
        int i16 = this.h3 + i14;
        this.h3 = i16;
        int i17 = i16 >>> 26;
        int i18 = i16 & 67108863;
        this.h3 = i18;
        int i19 = this.h4 + i17;
        this.h4 = i19;
        int i20 = i19 >>> 26;
        int i21 = i19 & 67108863;
        this.h4 = i21;
        int i22 = i9 + (i20 * 5);
        this.h0 = i22;
        int i23 = i22 + 5;
        int i24 = (i23 >>> 26) + i12;
        int i25 = (i24 >>> 26) + i15;
        int i26 = (i25 >>> 26) + i18;
        int i27 = 67108863 & i26;
        int i28 = ((i26 >>> 26) + i21) - 67108864;
        int i29 = (i28 >>> 31) - 1;
        int i30 = ~i29;
        this.h0 = (i22 & i30) | (i23 & 67108863 & i29);
        this.h1 = (i12 & i30) | (i24 & 67108863 & i29);
        this.h2 = (i15 & i30) | (i25 & 67108863 & i29);
        this.h3 = (i27 & i29) | (i18 & i30);
        this.h4 = (i21 & i30) | (i28 & i29);
        long j = ((i2 | (i3 << 26)) & 4294967295L) + (this.k0 & 4294967295L);
        Pack.intToLittleEndian((int) j, bArr, i);
        long j2 = (((i3 >>> 6) | (i4 << 20)) & 4294967295L) + (this.k1 & 4294967295L) + (j >>> 32);
        Pack.intToLittleEndian((int) j2, bArr, i + 4);
        long j3 = (((i4 >>> 12) | (i5 << 14)) & 4294967295L) + (this.k2 & 4294967295L) + (j2 >>> 32);
        Pack.intToLittleEndian((int) j3, bArr, i + 8);
        Pack.intToLittleEndian((int) ((((i5 >>> 18) | (i6 << 8)) & 4294967295L) + (4294967295L & this.k3) + (j3 >>> 32)), bArr, i + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.h4 = 0;
        this.h3 = 0;
        this.h2 = 0;
        this.h1 = 0;
        this.h0 = 0;
    }
}
