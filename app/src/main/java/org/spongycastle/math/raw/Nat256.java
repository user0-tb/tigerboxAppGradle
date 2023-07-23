package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public abstract class Nat256 {
    private static final long M = 4294967295L;

    public static int[] create() {
        return new int[8];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & M) + (iArr2[0] & M) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & M) + (iArr2[1] & M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & M) + (iArr2[2] & M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & M) + (iArr2[3] & M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & M) + (iArr2[4] & M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & M) + (iArr2[5] & M);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[6] & M) + (iArr2[6] & M);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[7] & M) + (iArr2[7] & M);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int add(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i + 0] & M) + (iArr2[i2 + 0] & M) + 0;
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >>> 32) + (iArr[i + 1] & M) + (iArr2[i2 + 1] & M);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[i + 2] & M) + (iArr2[i2 + 2] & M);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[i + 3] & M) + (iArr2[i2 + 3] & M);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[i + 4] & M) + (iArr2[i2 + 4] & M);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[i + 5] & M) + (iArr2[i2 + 5] & M);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[i + 6] & M) + (iArr2[i2 + 6] & M);
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[i + 7] & M) + (iArr2[i2 + 7] & M);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & M) + (iArr2[0] & M) + (iArr3[0] & M) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & M) + (iArr2[1] & M) + (iArr3[1] & M);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & M) + (iArr2[2] & M) + (iArr3[2] & M);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & M) + (iArr2[3] & M) + (iArr3[3] & M);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & M) + (iArr2[4] & M) + (iArr3[4] & M);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & M) + (iArr2[5] & M) + (iArr3[5] & M);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[6] & M) + (iArr2[6] & M) + (iArr3[6] & M);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[7] & M) + (iArr2[7] & M) + (iArr3[7] & M);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        int i4 = i3 + 0;
        long j = (iArr[i + 0] & M) + (iArr2[i2 + 0] & M) + (iArr3[i4] & M) + 0;
        iArr3[i4] = (int) j;
        int i5 = i3 + 1;
        long j2 = (j >>> 32) + (iArr[i + 1] & M) + (iArr2[i2 + 1] & M) + (iArr3[i5] & M);
        iArr3[i5] = (int) j2;
        int i6 = i3 + 2;
        long j3 = (j2 >>> 32) + (iArr[i + 2] & M) + (iArr2[i2 + 2] & M) + (iArr3[i6] & M);
        iArr3[i6] = (int) j3;
        int i7 = i3 + 3;
        long j4 = (j3 >>> 32) + (iArr[i + 3] & M) + (iArr2[i2 + 3] & M) + (iArr3[i7] & M);
        iArr3[i7] = (int) j4;
        int i8 = i3 + 4;
        long j5 = (j4 >>> 32) + (iArr[i + 4] & M) + (iArr2[i2 + 4] & M) + (iArr3[i8] & M);
        iArr3[i8] = (int) j5;
        int i9 = i3 + 5;
        long j6 = (j5 >>> 32) + (iArr[i + 5] & M) + (iArr2[i2 + 5] & M) + (iArr3[i9] & M);
        iArr3[i9] = (int) j6;
        int i10 = i3 + 6;
        long j7 = (j6 >>> 32) + (iArr[i + 6] & M) + (iArr2[i2 + 6] & M) + (iArr3[i10] & M);
        iArr3[i10] = (int) j7;
        int i11 = i3 + 7;
        long j8 = (j7 >>> 32) + (iArr[i + 7] & M) + (iArr2[i2 + 7] & M) + (iArr3[i11] & M);
        iArr3[i11] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (iArr[0] & M) + (iArr2[0] & M) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & M) + (iArr2[1] & M);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & M) + (iArr2[2] & M);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & M) + (iArr2[3] & M);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & M) + (iArr2[4] & M);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & M) + (iArr2[5] & M);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (iArr[6] & M) + (iArr2[6] & M);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (iArr[7] & M) + (M & iArr2[7]);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i2 + 0;
        long j = (i3 & M) + (iArr[i + 0] & M) + (iArr2[i4] & M);
        iArr2[i4] = (int) j;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (iArr[i + 1] & M) + (iArr2[i5] & M);
        iArr2[i5] = (int) j2;
        int i6 = i2 + 2;
        long j3 = (j2 >>> 32) + (iArr[i + 2] & M) + (iArr2[i6] & M);
        iArr2[i6] = (int) j3;
        int i7 = i2 + 3;
        long j4 = (j3 >>> 32) + (iArr[i + 3] & M) + (iArr2[i7] & M);
        iArr2[i7] = (int) j4;
        int i8 = i2 + 4;
        long j5 = (j4 >>> 32) + (iArr[i + 4] & M) + (iArr2[i8] & M);
        iArr2[i8] = (int) j5;
        int i9 = i2 + 5;
        long j6 = (j5 >>> 32) + (iArr[i + 5] & M) + (iArr2[i9] & M);
        iArr2[i9] = (int) j6;
        int i10 = i2 + 6;
        long j7 = (j6 >>> 32) + (iArr[i + 6] & M) + (iArr2[i10] & M);
        iArr2[i10] = (int) j7;
        int i11 = i2 + 7;
        long j8 = (j7 >>> 32) + (iArr[i + 7] & M) + (M & iArr2[i11]);
        iArr2[i11] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i + 0;
        int i4 = i2 + 0;
        long j = (iArr[i3] & M) + (iArr2[i4] & M) + 0;
        int i5 = (int) j;
        iArr[i3] = i5;
        iArr2[i4] = i5;
        int i6 = i + 1;
        int i7 = i2 + 1;
        long j2 = (j >>> 32) + (iArr[i6] & M) + (iArr2[i7] & M);
        int i8 = (int) j2;
        iArr[i6] = i8;
        iArr2[i7] = i8;
        int i9 = i + 2;
        int i10 = i2 + 2;
        long j3 = (j2 >>> 32) + (iArr[i9] & M) + (iArr2[i10] & M);
        int i11 = (int) j3;
        iArr[i9] = i11;
        iArr2[i10] = i11;
        int i12 = i + 3;
        int i13 = i2 + 3;
        long j4 = (j3 >>> 32) + (iArr[i12] & M) + (iArr2[i13] & M);
        int i14 = (int) j4;
        iArr[i12] = i14;
        iArr2[i13] = i14;
        int i15 = i + 4;
        int i16 = i2 + 4;
        long j5 = (j4 >>> 32) + (iArr[i15] & M) + (iArr2[i16] & M);
        int i17 = (int) j5;
        iArr[i15] = i17;
        iArr2[i16] = i17;
        int i18 = i + 5;
        int i19 = i2 + 5;
        long j6 = (j5 >>> 32) + (iArr[i18] & M) + (iArr2[i19] & M);
        int i20 = (int) j6;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        int i21 = i + 6;
        int i22 = i2 + 6;
        long j7 = (j6 >>> 32) + (iArr[i21] & M) + (iArr2[i22] & M);
        int i23 = (int) j7;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        int i24 = i + 7;
        int i25 = i2 + 7;
        long j8 = (j7 >>> 32) + (iArr[i24] & M) + (M & iArr2[i25]);
        int i26 = (int) j8;
        iArr[i24] = i26;
        iArr2[i25] = i26;
        return (int) (j8 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean gte = gte(iArr, i, iArr2, i2);
        if (gte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            sub(iArr2, i2, iArr, i, iArr3, i3);
        }
        return gte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] create = create();
        int i = 0;
        while (bigInteger.signum() != 0) {
            create[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return create;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else if ((i & 255) != i) {
            return 0;
        } else {
            i2 = iArr[i >>> 5] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & M;
        long j2 = iArr2[1] & M;
        long j3 = iArr2[2] & M;
        long j4 = iArr2[3] & M;
        long j5 = iArr2[4] & M;
        long j6 = iArr2[5] & M;
        long j7 = iArr2[6] & M;
        long j8 = iArr2[7] & M;
        long j9 = iArr[0] & M;
        long j10 = (j9 * j) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[7] = (int) j17;
        int i = (int) (j17 >>> 32);
        iArr3[8] = i;
        int i2 = 1;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j18 = iArr[i2] & M;
            int i4 = i2 + 0;
            long j19 = (j18 * j) + (iArr3[i4] & M) + 0;
            iArr3[i4] = (int) j19;
            int i5 = i2 + 1;
            long j20 = j2;
            long j21 = (j19 >>> 32) + (j18 * j2) + (iArr3[i5] & M);
            iArr3[i5] = (int) j21;
            int i6 = i2 + 2;
            long j22 = j6;
            long j23 = (j21 >>> 32) + (j18 * j3) + (iArr3[i6] & M);
            iArr3[i6] = (int) j23;
            int i7 = i2 + 3;
            long j24 = (j23 >>> 32) + (j18 * j4) + (iArr3[i7] & M);
            iArr3[i7] = (int) j24;
            int i8 = i2 + 4;
            long j25 = (j24 >>> 32) + (j18 * j5) + (iArr3[i8] & M);
            iArr3[i8] = (int) j25;
            int i9 = i2 + 5;
            long j26 = (j25 >>> 32) + (j18 * j22) + (iArr3[i9] & M);
            iArr3[i9] = (int) j26;
            int i10 = i2 + 6;
            long j27 = (j26 >>> 32) + (j18 * j7) + (iArr3[i10] & M);
            iArr3[i10] = (int) j27;
            int i11 = i2 + 7;
            long j28 = (j27 >>> 32) + (j18 * j8) + (iArr3[i11] & M);
            iArr3[i11] = (int) j28;
            iArr3[i2 + 8] = (int) (j28 >>> 32);
            i2 = i5;
            j = j;
            j2 = j20;
            j6 = j22;
        }
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2 + 0] & M;
        long j2 = iArr2[i2 + 1] & M;
        long j3 = iArr2[i2 + 2] & M;
        long j4 = iArr2[i2 + 3] & M;
        long j5 = iArr2[i2 + 4] & M;
        long j6 = iArr2[i2 + 5] & M;
        long j7 = iArr2[i2 + 6] & M;
        long j8 = iArr2[i2 + 7] & M;
        long j9 = iArr[i + 0] & M;
        long j10 = (j9 * j) + 0;
        iArr3[i3 + 0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[i3 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[i3 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[i3 + 6] = (int) j16;
        long j17 = j8;
        long j18 = (j16 >>> 32) + (j9 * j17);
        iArr3[i3 + 7] = (int) j18;
        iArr3[i3 + 8] = (int) (j18 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 8) {
            i5 += i4;
            long j19 = iArr[i + i6] & M;
            int i7 = i5 + 0;
            long j20 = (j19 * j) + (iArr3[i7] & M) + 0;
            iArr3[i7] = (int) j20;
            int i8 = i5 + 1;
            long j21 = j17;
            long j22 = (j20 >>> 32) + (j19 * j2) + (iArr3[i8] & M);
            iArr3[i8] = (int) j22;
            int i9 = i5 + 2;
            long j23 = j3;
            long j24 = (j22 >>> 32) + (j19 * j3) + (iArr3[i9] & M);
            iArr3[i9] = (int) j24;
            int i10 = i5 + 3;
            long j25 = (j24 >>> 32) + (j19 * j4) + (iArr3[i10] & M);
            iArr3[i10] = (int) j25;
            int i11 = i5 + 4;
            long j26 = (j25 >>> 32) + (j19 * j5) + (iArr3[i11] & M);
            iArr3[i11] = (int) j26;
            int i12 = i5 + 5;
            long j27 = (j26 >>> 32) + (j19 * j6) + (iArr3[i12] & M);
            iArr3[i12] = (int) j27;
            int i13 = i5 + 6;
            long j28 = (j27 >>> 32) + (j19 * j7) + (iArr3[i13] & M);
            iArr3[i13] = (int) j28;
            int i14 = i5 + 7;
            long j29 = (j28 >>> 32) + (j19 * j21) + (iArr3[i14] & M);
            iArr3[i14] = (int) j29;
            iArr3[i5 + 8] = (int) (j29 >>> 32);
            i6++;
            j3 = j23;
            j17 = j21;
            j4 = j4;
            i4 = 1;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j = M;
        long j2 = iArr2[0] & M;
        long j3 = iArr2[1] & M;
        long j4 = iArr2[2] & M;
        long j5 = iArr2[3] & M;
        long j6 = iArr2[4] & M;
        long j7 = iArr2[5] & M;
        long j8 = iArr2[6] & M;
        long j9 = iArr2[7] & M;
        long j10 = 0;
        int i9 = 0;
        while (i9 < 8) {
            long j11 = j9;
            long j12 = iArr[i9] & j;
            long j13 = j7;
            long j14 = (j12 * j2) + (iArr3[i] & j) + 0;
            iArr3[i9 + 0] = (int) j14;
            int i10 = i9 + 1;
            long j15 = j3;
            long j16 = (j14 >>> 32) + (j12 * j3) + (iArr3[i10] & j);
            iArr3[i10] = (int) j16;
            long j17 = (j16 >>> 32) + (j12 * j4) + (iArr3[i2] & j);
            iArr3[i9 + 2] = (int) j17;
            long j18 = (j17 >>> 32) + (j12 * j5) + (iArr3[i3] & j);
            iArr3[i9 + 3] = (int) j18;
            long j19 = (j18 >>> 32) + (j12 * j6) + (iArr3[i4] & j);
            iArr3[i9 + 4] = (int) j19;
            long j20 = (j19 >>> 32) + (j12 * j13) + (iArr3[i5] & j);
            iArr3[i9 + 5] = (int) j20;
            long j21 = (j20 >>> 32) + (j12 * j8) + (iArr3[i6] & j);
            iArr3[i9 + 6] = (int) j21;
            long j22 = (j21 >>> 32) + (j12 * j11) + (iArr3[i7] & j);
            iArr3[i9 + 7] = (int) j22;
            long j23 = (j22 >>> 32) + j10 + (iArr3[i8] & j);
            iArr3[i9 + 8] = (int) j23;
            j10 = j23 >>> 32;
            i9 = i10;
            j9 = j11;
            j7 = j13;
            j3 = j15;
            j = M;
        }
        return (int) j10;
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j = iArr2[i2 + 0] & M;
        long j2 = iArr2[i2 + 1] & M;
        long j3 = iArr2[i2 + 2] & M;
        long j4 = iArr2[i2 + 3] & M;
        long j5 = iArr2[i2 + 4] & M;
        long j6 = iArr2[i2 + 5] & M;
        long j7 = iArr2[i2 + 6] & M;
        long j8 = iArr2[i2 + 7] & M;
        int i12 = i3;
        long j9 = 0;
        int i13 = 0;
        while (i13 < 8) {
            int i14 = i13;
            long j10 = iArr[i + i13] & M;
            long j11 = j;
            long j12 = (j10 * j) + (iArr3[i4] & M) + 0;
            long j13 = j8;
            iArr3[i12 + 0] = (int) j12;
            int i15 = i12 + 1;
            long j14 = (j12 >>> 32) + (j10 * j2) + (iArr3[i15] & M);
            iArr3[i15] = (int) j14;
            long j15 = (j14 >>> 32) + (j10 * j3) + (iArr3[i5] & M);
            iArr3[i12 + 2] = (int) j15;
            long j16 = (j15 >>> 32) + (j10 * j4) + (iArr3[i6] & M);
            iArr3[i12 + 3] = (int) j16;
            long j17 = (j16 >>> 32) + (j10 * j5) + (iArr3[i7] & M);
            iArr3[i12 + 4] = (int) j17;
            long j18 = (j17 >>> 32) + (j10 * j6) + (iArr3[i8] & M);
            iArr3[i12 + 5] = (int) j18;
            long j19 = (j18 >>> 32) + (j10 * j7) + (iArr3[i9] & M);
            iArr3[i12 + 6] = (int) j19;
            long j20 = (j19 >>> 32) + (j10 * j13) + (iArr3[i10] & M);
            iArr3[i12 + 7] = (int) j20;
            long j21 = (j20 >>> 32) + j9 + (iArr3[i11] & M);
            iArr3[i12 + 8] = (int) j21;
            j9 = j21 >>> 32;
            i13 = i14 + 1;
            i12 = i15;
            j8 = j13;
            j = j11;
            j3 = j3;
            j2 = j2;
        }
        return (int) j9;
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & M;
        long j2 = iArr[i2 + 0] & M;
        long j3 = (j * j2) + (iArr2[i3 + 0] & M) + 0;
        iArr3[i4 + 0] = (int) j3;
        long j4 = iArr[i2 + 1] & M;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (iArr2[i3 + 1] & M);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = iArr[i2 + 2] & M;
        long j8 = j6 + (j * j7) + j4 + (iArr2[i3 + 2] & M);
        iArr3[i4 + 2] = (int) j8;
        long j9 = iArr[i2 + 3] & M;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (iArr2[i3 + 3] & M);
        iArr3[i4 + 3] = (int) j10;
        long j11 = iArr[i2 + 4] & M;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (iArr2[i3 + 4] & M);
        iArr3[i4 + 4] = (int) j12;
        long j13 = iArr[i2 + 5] & M;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (iArr2[i3 + 5] & M);
        iArr3[i4 + 5] = (int) j14;
        long j15 = iArr[i2 + 6] & M;
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (iArr2[i3 + 6] & M);
        iArr3[i4 + 6] = (int) j16;
        long j17 = iArr[i2 + 7] & M;
        long j18 = (j16 >>> 32) + (j * j17) + j15 + (M & iArr2[i3 + 7]);
        iArr3[i4 + 7] = (int) j18;
        return (j18 >>> 32) + j17;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j = i & M;
        long j2 = ((iArr[0] & M) * j) + 0;
        iArr[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((iArr[1] & M) * j);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((iArr[2] & M) * j);
        iArr[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((iArr[3] & M) * j);
        iArr[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((iArr[4] & M) * j);
        iArr[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((iArr[5] & M) * j);
        iArr[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((iArr[6] & M) * j);
        iArr[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (M & iArr[7]));
        iArr[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j = i & M;
        long j2 = ((iArr2[0] & M) * j) + (iArr[0] & M) + 0;
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((iArr2[1] & M) * j) + (iArr[1] & M);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((iArr2[2] & M) * j) + (iArr[2] & M);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((iArr2[3] & M) * j) + (iArr[3] & M);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((iArr2[4] & M) * j) + (iArr[4] & M);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((iArr2[5] & M) * j) + (iArr[5] & M);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((iArr2[6] & M) * j) + (iArr[6] & M);
        iArr2[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (iArr2[7] & M)) + (M & iArr[7]);
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mulWordAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = i & M;
        int i4 = i3 + 0;
        long j2 = ((iArr[i2 + 0] & M) * j) + (iArr2[i4] & M) + 0;
        iArr2[i4] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (j2 >>> 32) + ((iArr[i2 + 1] & M) * j) + (iArr2[i5] & M);
        iArr2[i5] = (int) j3;
        int i6 = i3 + 2;
        long j4 = (j3 >>> 32) + ((iArr[i2 + 2] & M) * j) + (iArr2[i6] & M);
        iArr2[i6] = (int) j4;
        int i7 = i3 + 3;
        long j5 = (j4 >>> 32) + ((iArr[i2 + 3] & M) * j) + (iArr2[i7] & M);
        iArr2[i7] = (int) j5;
        int i8 = i3 + 4;
        long j6 = (j5 >>> 32) + ((iArr[i2 + 4] & M) * j) + (iArr2[i8] & M);
        iArr2[i8] = (int) j6;
        int i9 = i3 + 5;
        long j7 = (j6 >>> 32) + ((iArr[i2 + 5] & M) * j) + (iArr2[i9] & M);
        iArr2[i9] = (int) j7;
        int i10 = i3 + 6;
        long j8 = (j7 >>> 32) + ((iArr[i2 + 6] & M) * j) + (iArr2[i10] & M);
        iArr2[i10] = (int) j8;
        int i11 = i3 + 7;
        long j9 = (j8 >>> 32) + (j * (iArr[i2 + 7] & M)) + (iArr2[i11] & M);
        iArr2[i11] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & M;
        long j3 = j & M;
        int i3 = i2 + 0;
        long j4 = (j2 * j3) + (iArr[i3] & M) + 0;
        iArr[i3] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i4 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (iArr[i4] & M);
        iArr[i4] = (int) j7;
        int i5 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (iArr[i5] & M);
        iArr[i5] = (int) j8;
        int i6 = i2 + 3;
        long j9 = (j8 >>> 32) + (M & iArr[i6]);
        iArr[i6] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = i & M;
        long j2 = i2 & M;
        int i4 = i3 + 0;
        long j3 = (j * j2) + (iArr[i4] & M) + 0;
        iArr[i4] = (int) j3;
        int i5 = i3 + 1;
        long j4 = (j3 >>> 32) + j2 + (iArr[i5] & M);
        iArr[i5] = (int) j4;
        long j5 = j4 >>> 32;
        int i6 = i3 + 2;
        long j6 = j5 + (iArr[i6] & M);
        iArr[i6] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & M;
        int i3 = i2 + 0;
        long j3 = ((j & M) * j2) + (iArr[i3] & M) + 0;
        iArr[i3] = (int) j3;
        long j4 = j2 * (j >>> 32);
        int i4 = i2 + 1;
        long j5 = (j3 >>> 32) + j4 + (iArr[i4] & M);
        iArr[i4] = (int) j5;
        int i5 = i2 + 2;
        long j6 = (j5 >>> 32) + (iArr[i5] & M);
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(8, iArr, i2, 3);
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = i & M;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((iArr[i3] & M) * j);
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 8);
        return (int) j2;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & M;
        int i = 16;
        int i2 = 7;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & M;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = ((i6 << 31) & M) | (j4 >>> 33);
                iArr2[0] = (int) j4;
                long j6 = iArr[1] & M;
                long j7 = iArr2[2] & M;
                long j8 = j5 + (j6 * j);
                int i7 = (int) j8;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                int i8 = i7 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = iArr[2] & M;
                long j11 = iArr2[3] & M;
                long j12 = iArr2[4] & M;
                long j13 = j9 + (j10 * j);
                int i9 = (int) j13;
                iArr2[2] = (i9 << 1) | i8;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j14 & M;
                long j17 = iArr[3] & M;
                long j18 = iArr2[5] & M;
                long j19 = iArr2[6] & M;
                long j20 = j16 + (j17 * j);
                int i10 = (int) j20;
                iArr2[3] = (i10 << 1) | (i9 >>> 31);
                int i11 = i10 >>> 31;
                long j21 = j15 + (j20 >>> 32) + (j17 * j6);
                long j22 = j18 + (j21 >>> 32) + (j17 * j10);
                long j23 = j21 & M;
                long j24 = j22 & M;
                long j25 = iArr[4] & M;
                long j26 = iArr2[7] & M;
                long j27 = iArr2[8] & M;
                long j28 = j23 + (j25 * j);
                int i12 = (int) j28;
                iArr2[4] = (i12 << 1) | i11;
                int i13 = i12 >>> 31;
                long j29 = j24 + (j28 >>> 32) + (j25 * j6);
                long j30 = j19 + (j22 >>> 32) + (j29 >>> 32) + (j25 * j10);
                long j31 = j29 & M;
                long j32 = j26 + (j30 >>> 32) + (j25 * j17);
                long j33 = j30 & M;
                long j34 = j27 + (j32 >>> 32);
                long j35 = j32 & M;
                long j36 = iArr[5] & M;
                long j37 = iArr2[9] & M;
                long j38 = iArr2[10] & M;
                long j39 = j31 + (j36 * j);
                int i14 = (int) j39;
                iArr2[5] = (i14 << 1) | i13;
                int i15 = i14 >>> 31;
                long j40 = j33 + (j39 >>> 32) + (j36 * j6);
                long j41 = j35 + (j40 >>> 32) + (j36 * j10);
                long j42 = j40 & M;
                long j43 = j34 + (j41 >>> 32) + (j36 * j17);
                long j44 = j41 & M;
                long j45 = j37 + (j43 >>> 32) + (j36 * j25);
                long j46 = j43 & M;
                long j47 = j38 + (j45 >>> 32);
                long j48 = j45 & M;
                long j49 = iArr[6] & M;
                long j50 = iArr2[11] & M;
                long j51 = iArr2[12] & M;
                long j52 = j42 + (j49 * j);
                int i16 = (int) j52;
                iArr2[6] = (i16 << 1) | i15;
                int i17 = i16 >>> 31;
                long j53 = j44 + (j52 >>> 32) + (j49 * j6);
                long j54 = j46 + (j53 >>> 32) + (j49 * j10);
                long j55 = j53 & M;
                long j56 = j48 + (j54 >>> 32) + (j49 * j17);
                long j57 = j54 & M;
                long j58 = j47 + (j56 >>> 32) + (j49 * j25);
                long j59 = j56 & M;
                long j60 = j50 + (j58 >>> 32) + (j49 * j36);
                long j61 = j58 & M;
                long j62 = j51 + (j60 >>> 32);
                long j63 = j60 & M;
                long j64 = iArr[7] & M;
                long j65 = iArr2[13] & M;
                long j66 = M & iArr2[14];
                long j67 = j55 + (j64 * j);
                int i18 = (int) j67;
                iArr2[7] = (i18 << 1) | i17;
                long j68 = j57 + (j67 >>> 32) + (j64 * j6);
                long j69 = j59 + (j68 >>> 32) + (j10 * j64);
                long j70 = j61 + (j69 >>> 32) + (j64 * j17);
                long j71 = j63 + (j70 >>> 32) + (j64 * j25);
                long j72 = j62 + (j71 >>> 32) + (j64 * j36);
                long j73 = j65 + (j72 >>> 32) + (j64 * j49);
                long j74 = j66 + (j73 >>> 32);
                int i19 = (int) j68;
                iArr2[8] = (i19 << 1) | (i18 >>> 31);
                int i20 = (int) j69;
                iArr2[9] = (i20 << 1) | (i19 >>> 31);
                int i21 = i20 >>> 31;
                int i22 = (int) j70;
                iArr2[10] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j71;
                iArr2[11] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j72;
                iArr2[12] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
                int i28 = (int) j73;
                iArr2[13] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                int i30 = (int) j74;
                iArr2[14] = i29 | (i30 << 1);
                iArr2[15] = (i30 >>> 31) | ((iArr2[15] + ((int) (j74 >> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j = iArr[i + 0] & M;
        int i16 = 0;
        int i17 = 16;
        int i18 = 7;
        while (true) {
            int i19 = i18 - 1;
            long j2 = iArr[i + i18] & M;
            long j3 = j2 * j2;
            int i20 = i17 - 1;
            iArr2[i2 + i20] = (i16 << 31) | ((int) (j3 >>> 33));
            i17 = i20 - 1;
            iArr2[i2 + i17] = (int) (j3 >>> 1);
            i16 = (int) j3;
            if (i19 <= 0) {
                long j4 = j * j;
                long j5 = ((i16 << 31) & M) | (j4 >>> 33);
                iArr2[i2 + 0] = (int) j4;
                long j6 = iArr[i + 1] & M;
                long j7 = iArr2[i3] & M;
                long j8 = j5 + (j6 * j);
                int i21 = (int) j8;
                iArr2[i2 + 1] = (i21 << 1) | (((int) (j4 >>> 32)) & 1);
                int i22 = i21 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = iArr[i + 2] & M;
                long j11 = iArr2[i4] & M;
                long j12 = iArr2[i5] & M;
                long j13 = j9 + (j10 * j);
                int i23 = (int) j13;
                iArr2[i2 + 2] = (i23 << 1) | i22;
                int i24 = i23 >>> 31;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j14 & M;
                long j16 = iArr[i + 3] & M;
                long j17 = iArr2[i6] & M;
                long j18 = iArr2[i7] & M;
                long j19 = j15 + (j16 * j);
                int i25 = (int) j19;
                iArr2[i2 + 3] = (i25 << 1) | i24;
                long j20 = j12 + (j14 >>> 32) + (j19 >>> 32) + (j16 * j6);
                long j21 = j17 + (j20 >>> 32) + (j16 * j10);
                long j22 = j20 & M;
                long j23 = j21 & M;
                long j24 = iArr[i + 4] & M;
                long j25 = iArr2[i8] & M;
                long j26 = iArr2[i9] & M;
                long j27 = j22 + (j24 * j);
                int i26 = (int) j27;
                iArr2[i2 + 4] = (i25 >>> 31) | (i26 << 1);
                int i27 = i26 >>> 31;
                long j28 = j23 + (j27 >>> 32) + (j24 * j6);
                long j29 = j18 + (j21 >>> 32) + (j28 >>> 32) + (j24 * j10);
                long j30 = j28 & M;
                long j31 = j25 + (j29 >>> 32) + (j24 * j16);
                long j32 = j29 & M;
                long j33 = j26 + (j31 >>> 32);
                long j34 = j31 & M;
                long j35 = iArr[i + 5] & M;
                long j36 = iArr2[i10] & M;
                long j37 = iArr2[i11] & M;
                long j38 = j30 + (j35 * j);
                int i28 = (int) j38;
                iArr2[i2 + 5] = i27 | (i28 << 1);
                int i29 = i28 >>> 31;
                long j39 = j32 + (j38 >>> 32) + (j35 * j6);
                long j40 = j34 + (j39 >>> 32) + (j35 * j10);
                long j41 = j39 & M;
                long j42 = j33 + (j40 >>> 32) + (j35 * j16);
                long j43 = j40 & M;
                long j44 = j36 + (j42 >>> 32) + (j35 * j24);
                long j45 = j42 & M;
                long j46 = j37 + (j44 >>> 32);
                long j47 = j44 & M;
                long j48 = iArr[i + 6] & M;
                long j49 = iArr2[i12] & M;
                long j50 = iArr2[i13] & M;
                long j51 = j41 + (j48 * j);
                int i30 = (int) j51;
                iArr2[i2 + 6] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                long j52 = j43 + (j51 >>> 32) + (j48 * j6);
                long j53 = j45 + (j52 >>> 32) + (j48 * j10);
                long j54 = j52 & M;
                long j55 = j47 + (j53 >>> 32) + (j48 * j16);
                long j56 = j53 & M;
                long j57 = j46 + (j55 >>> 32) + (j48 * j24);
                long j58 = j55 & M;
                long j59 = j49 + (j57 >>> 32) + (j48 * j35);
                long j60 = j57 & M;
                long j61 = j50 + (j59 >>> 32);
                long j62 = j59 & M;
                long j63 = iArr[i + 7] & M;
                long j64 = iArr2[i14] & M;
                long j65 = iArr2[i15] & M;
                long j66 = j54 + (j * j63);
                int i32 = (int) j66;
                iArr2[i2 + 7] = (i32 << 1) | i31;
                long j67 = j56 + (j66 >>> 32) + (j63 * j6);
                long j68 = j58 + (j67 >>> 32) + (j63 * j10);
                long j69 = j60 + (j68 >>> 32) + (j63 * j16);
                long j70 = j62 + (j69 >>> 32) + (j63 * j24);
                long j71 = j61 + (j70 >>> 32) + (j63 * j35);
                long j72 = j64 + (j71 >>> 32) + (j63 * j48);
                long j73 = j65 + (j72 >>> 32);
                int i33 = (int) j67;
                iArr2[i2 + 8] = (i32 >>> 31) | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j68;
                iArr2[i2 + 9] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j69;
                iArr2[i2 + 10] = i36 | (i37 << 1);
                int i38 = (int) j70;
                iArr2[i2 + 11] = (i37 >>> 31) | (i38 << 1);
                int i39 = (int) j71;
                iArr2[i2 + 12] = (i38 >>> 31) | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = (int) j72;
                iArr2[i2 + 13] = i40 | (i41 << 1);
                int i42 = i41 >>> 31;
                int i43 = (int) j73;
                iArr2[i2 + 14] = i42 | (i43 << 1);
                int i44 = i43 >>> 31;
                int i45 = i2 + 15;
                iArr2[i45] = i44 | ((iArr2[i45] + ((int) (j73 >> 32))) << 1);
                return;
            }
            i18 = i19;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr[0] & M) - (iArr2[0] & M)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & M) - (iArr2[1] & M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[2] & M) - (iArr2[2] & M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[3] & M) - (iArr2[3] & M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[4] & M) - (iArr2[4] & M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[5] & M) - (iArr2[5] & M));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[6] & M) - (iArr2[6] & M));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr[7] & M) - (iArr2[7] & M));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((iArr[i + 0] & M) - (iArr2[i2 + 0] & M)) + 0;
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >> 32) + ((iArr[i + 1] & M) - (iArr2[i2 + 1] & M));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[i + 2] & M) - (iArr2[i2 + 2] & M));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[i + 3] & M) - (iArr2[i2 + 3] & M));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[i + 4] & M) - (iArr2[i2 + 4] & M));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[i + 5] & M) - (iArr2[i2 + 5] & M));
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr[i + 6] & M) - (iArr2[i2 + 6] & M));
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr[i + 7] & M) - (iArr2[i2 + 7] & M));
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((iArr3[0] & M) - (iArr[0] & M)) - (iArr2[0] & M)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((iArr3[1] & M) - (iArr[1] & M)) - (iArr2[1] & M));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((iArr3[2] & M) - (iArr[2] & M)) - (iArr2[2] & M));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((iArr3[3] & M) - (iArr[3] & M)) - (iArr2[3] & M));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((iArr3[4] & M) - (iArr[4] & M)) - (iArr2[4] & M));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + (((iArr3[5] & M) - (iArr[5] & M)) - (iArr2[5] & M));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + (((iArr3[6] & M) - (iArr[6] & M)) - (iArr2[6] & M));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + (((iArr3[7] & M) - (iArr[7] & M)) - (iArr2[7] & M));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = ((iArr2[0] & M) - (iArr[0] & M)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((iArr2[1] & M) - (iArr[1] & M));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[2] & M) - (iArr[2] & M));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[3] & M) - (iArr[3] & M));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr2[4] & M) - (iArr[4] & M));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr2[5] & M) - (iArr[5] & M));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((iArr2[6] & M) - (iArr[6] & M));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((iArr2[7] & M) - (M & iArr[7]));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i2 + 0;
        long j = ((iArr2[i3] & M) - (iArr[i + 0] & M)) + 0;
        iArr2[i3] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >> 32) + ((iArr2[i4] & M) - (iArr[i + 1] & M));
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >> 32) + ((iArr2[i5] & M) - (iArr[i + 2] & M));
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >> 32) + ((iArr2[i6] & M) - (iArr[i + 3] & M));
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >> 32) + ((iArr2[i7] & M) - (iArr[i + 4] & M));
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >> 32) + ((iArr2[i8] & M) - (iArr[i + 5] & M));
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (j6 >> 32) + ((iArr2[i9] & M) - (iArr[i + 6] & M));
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (j7 >> 32) + ((iArr2[i10] & M) - (iArr[i + 7] & M));
        iArr2[i10] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }
}
