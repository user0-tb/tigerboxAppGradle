package org.spongycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;
    private int ii;
    private int k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;
    private int r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;
    private int w;

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.ii = iArr[2];
        this.r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.w = iArr[7];
        this.checksum = iArr[8];
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int i = this.w;
        this.k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil((digestSize << 3) / i);
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        this.test8 = ((bArr[4][1] & 255) << 8) | (bArr[4][0] & 255) | ((bArr[4][2] & 255) << 16) | ((bArr[4][3] & 255) << 24) | ((bArr[4][4] & 255) << 32) | ((bArr[4][5] & 255) << 40) | ((bArr[4][6] & 255) << 48) | ((bArr[4][7] & 255) << 56);
        this.big8 = (bArr[4][8] & 255) | ((bArr[4][9] & 255) << 8) | ((bArr[4][10] & 255) << 16) | ((bArr[4][11] & 255) << 24) | ((bArr[4][12] & 255) << 32) | ((bArr[4][13] & 255) << 40) | ((bArr[4][14] & 255) << 48) | ((bArr[4][15] & 255) << 56);
    }

    public GMSSRootSig(Digest digest, int i, int i2) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        this.w = i;
        this.height = i2;
        this.k = (1 << i) - 1;
        this.messagesize = (int) Math.ceil((digestSize << 3) / i);
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr3;
        this.messDigestOTS.doFinal(bArr3, 0);
        int i3 = this.mdsize;
        byte[] bArr4 = new byte[i3];
        System.arraycopy(this.hash, 0, bArr4, 0, i3);
        int log = getLog((this.messagesize << this.w) + 1);
        int i4 = this.w;
        int i5 = 8;
        if (8 % i4 == 0) {
            int i6 = 8 / i4;
            i = 0;
            for (int i7 = 0; i7 < this.mdsize; i7++) {
                for (int i8 = 0; i8 < i6; i8++) {
                    i += bArr4[i7] & this.k;
                    bArr4[i7] = (byte) (bArr4[i7] >>> this.w);
                }
            }
            int i9 = (this.messagesize << this.w) - i;
            this.checksum = i9;
            int i10 = 0;
            while (i10 < log) {
                i += this.k & i9;
                int i11 = this.w;
                i9 >>>= i11;
                i10 += i11;
            }
        } else if (i4 < 8) {
            int i12 = this.mdsize / i4;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < i12) {
                long j = 0;
                for (int i16 = 0; i16 < this.w; i16++) {
                    j ^= (bArr4[i14] & 255) << (i16 << 3);
                    i14++;
                }
                int i17 = 0;
                while (i17 < i5) {
                    i15 += (int) (this.k & j);
                    j >>>= this.w;
                    i17++;
                    i12 = i12;
                    i5 = 8;
                }
                i13++;
                i5 = 8;
            }
            int i18 = this.mdsize % this.w;
            long j2 = 0;
            for (int i19 = 0; i19 < i18; i19++) {
                j2 ^= (bArr4[i14] & 255) << (i19 << 3);
                i14++;
            }
            int i20 = i18 << 3;
            int i21 = 0;
            while (i21 < i20) {
                i15 += (int) (this.k & j2);
                int i22 = this.w;
                j2 >>>= i22;
                i21 += i22;
            }
            int i23 = (this.messagesize << this.w) - i15;
            this.checksum = i23;
            i = i15;
            int i24 = 0;
            while (i24 < log) {
                i += this.k & i23;
                int i25 = this.w;
                i23 >>>= i25;
                i24 += i25;
            }
        } else if (i4 < 57) {
            int i26 = 0;
            int i27 = 0;
            while (true) {
                i2 = this.mdsize;
                int i28 = this.w;
                if (i26 > (i2 << 3) - i28) {
                    break;
                }
                int i29 = i26 % 8;
                i26 += i28;
                int i30 = (i26 + 7) >>> 3;
                long j3 = 0;
                int i31 = 0;
                for (int i32 = i26 >>> 3; i32 < i30; i32++) {
                    j3 ^= (bArr4[i32] & 255) << (i31 << 3);
                    i31++;
                }
                i27 = (int) (i27 + ((j3 >>> i29) & this.k));
            }
            int i33 = i26 >>> 3;
            if (i33 < i2) {
                int i34 = i26 % 8;
                int i35 = 0;
                long j4 = 0;
                while (i33 < this.mdsize) {
                    j4 ^= (bArr4[i33] & 255) << (i35 << 3);
                    i35++;
                    i33++;
                }
                i27 = (int) (i27 + ((j4 >>> i34) & this.k));
            }
            int i36 = (this.messagesize << this.w) - i27;
            this.checksum = i36;
            i = i27;
            int i37 = 0;
            while (i37 < log) {
                i += this.k & i36;
                int i38 = this.w;
                i36 >>>= i38;
                i37 += i38;
            }
        } else {
            i = 0;
        }
        int ceil = this.messagesize + ((int) Math.ceil(log / this.w));
        this.keysize = ceil;
        this.steps = (int) Math.ceil((ceil + i) / (1 << this.height));
        int i39 = this.keysize;
        int i40 = this.mdsize;
        this.sign = new byte[i39 * i40];
        this.counter = 0;
        this.test = 0;
        this.ii = 0;
        this.test8 = 0L;
        this.r = 0;
        this.privateKeyOTS = new byte[i40];
        byte[] bArr5 = new byte[i40];
        this.seed = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i40);
    }

    public boolean updateSign() {
        for (int i = 0; i < this.steps; i++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }

    public byte[] getSig() {
        return this.sign;
    }

    private void oneStep() {
        int i = this.w;
        if (8 % i == 0) {
            int i2 = this.test;
            if (i2 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i3 = this.ii;
                if (i3 < this.mdsize) {
                    byte[] bArr = this.hash;
                    this.test = bArr[i3] & this.k;
                    bArr[i3] = (byte) (bArr[i3] >>> this.w);
                } else {
                    int i4 = this.checksum;
                    this.test = this.k & i4;
                    this.checksum = i4 >>> this.w;
                }
            } else if (i2 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i5 = this.counter;
                int i6 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i5 * i6, i6);
                int i7 = this.counter + 1;
                this.counter = i7;
                if (i7 % (8 / this.w) == 0) {
                    this.ii++;
                }
            }
        } else if (i >= 8) {
            if (i < 57) {
                long j = this.test8;
                if (j == 0) {
                    this.big8 = 0L;
                    this.ii = 0;
                    int i8 = this.r;
                    int i9 = i8 % 8;
                    int i10 = i8 >>> 3;
                    int i11 = this.mdsize;
                    if (i10 < i11) {
                        if (i8 <= (i11 << 3) - i) {
                            int i12 = i8 + i;
                            this.r = i12;
                            i11 = (i12 + 7) >>> 3;
                        } else {
                            this.r = i8 + i;
                        }
                        while (i10 < i11) {
                            long j2 = this.big8;
                            int i13 = this.ii;
                            this.big8 = j2 ^ ((this.hash[i10] & 255) << (i13 << 3));
                            this.ii = i13 + 1;
                            i10++;
                        }
                        long j3 = this.big8 >>> i9;
                        this.big8 = j3;
                        this.test8 = j3 & this.k;
                    } else {
                        int i14 = this.checksum;
                        this.test8 = this.k & i14;
                        this.checksum = i14 >>> i;
                    }
                    this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                } else if (j > 0) {
                    Digest digest2 = this.messDigestOTS;
                    byte[] bArr6 = this.privateKeyOTS;
                    digest2.update(bArr6, 0, bArr6.length);
                    byte[] bArr7 = new byte[this.messDigestOTS.getDigestSize()];
                    this.privateKeyOTS = bArr7;
                    this.messDigestOTS.doFinal(bArr7, 0);
                    this.test8--;
                }
                if (this.test8 == 0) {
                    byte[] bArr8 = this.privateKeyOTS;
                    byte[] bArr9 = this.sign;
                    int i15 = this.counter;
                    int i16 = this.mdsize;
                    System.arraycopy(bArr8, 0, bArr9, i15 * i16, i16);
                    this.counter++;
                }
            }
        } else {
            int i17 = this.test;
            if (i17 == 0) {
                int i18 = this.counter;
                if (i18 % 8 == 0) {
                    int i19 = this.ii;
                    int i20 = this.mdsize;
                    if (i19 < i20) {
                        this.big8 = 0L;
                        if (i18 < ((i20 / i) << 3)) {
                            for (int i21 = 0; i21 < this.w; i21++) {
                                long j4 = this.big8;
                                byte[] bArr10 = this.hash;
                                int i22 = this.ii;
                                this.big8 = j4 ^ ((bArr10[i22] & 255) << (i21 << 3));
                                this.ii = i22 + 1;
                            }
                        } else {
                            for (int i23 = 0; i23 < this.mdsize % this.w; i23++) {
                                long j5 = this.big8;
                                byte[] bArr11 = this.hash;
                                int i24 = this.ii;
                                this.big8 = j5 ^ ((bArr11[i24] & 255) << (i23 << 3));
                                this.ii = i24 + 1;
                            }
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = this.checksum;
                }
                this.test = (int) (this.big8 & this.k);
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i17 > 0) {
                Digest digest3 = this.messDigestOTS;
                byte[] bArr12 = this.privateKeyOTS;
                digest3.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr13;
                this.messDigestOTS.doFinal(bArr13, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr14 = this.privateKeyOTS;
                byte[] bArr15 = this.sign;
                int i25 = this.counter;
                int i26 = this.mdsize;
                System.arraycopy(bArr14, 0, bArr15, i25 * i26, i26);
                this.big8 >>>= this.w;
                this.counter++;
            }
        }
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.ii, this.r, this.steps, this.keysize, this.height, this.w, this.checksum};
    }

    public byte[] getStatLong() {
        long j = this.test8;
        long j2 = this.big8;
        return new byte[]{(byte) (j & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 56) & 255), (byte) (j2 & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 24) & 255), (byte) ((j2 >> 32) & 255), (byte) ((j2 >> 40) & 255), (byte) ((j2 >> 48) & 255), (byte) ((j2 >> 56) & 255)};
    }

    public String toString() {
        String str = "" + this.big8 + "  ";
        int[] statInt = getStatInt();
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, 5, this.mdsize);
        byte[][] statByte = getStatByte();
        for (int i = 0; i < 9; i++) {
            str = str + statInt[i] + " ";
        }
        for (int i2 = 0; i2 < 5; i2++) {
            str = str + new String(Hex.encode(statByte[i2])) + " ";
        }
        return str;
    }
}
