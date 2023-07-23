package org.spongycastle.math.raw;

import java.math.BigInteger;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public abstract class Nat224 {
    private static final long M = 4294967295L;

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
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
        return (int) (j7 >>> 32);
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
        return (int) (j7 >>> 32);
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
        return (int) (j7 >>> 32);
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
        return (int) (j7 >>> 32);
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
        long j7 = (j6 >>> 32) + (iArr[6] & M) + (M & iArr2[6]);
        iArr2[6] = (int) j7;
        return (int) (j7 >>> 32);
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
        long j7 = (j6 >>> 32) + (iArr[i + 6] & M) + (M & iArr2[i10]);
        iArr2[i10] = (int) j7;
        return (int) (j7 >>> 32);
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
        long j7 = (j6 >>> 32) + (iArr[i21] & M) + (M & iArr2[i22]);
        int i23 = (int) j7;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        return (int) (j7 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
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
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
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
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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
        for (int i3 = 6; i3 >= 0; i3--) {
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
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 7; i++) {
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
        long j8 = iArr[0] & M;
        long j9 = (j8 * j) + 0;
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j3);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + (j8 * j7);
        iArr3[6] = (int) j15;
        int i = (int) (j15 >>> 32);
        iArr3[7] = i;
        int i2 = 1;
        for (int i3 = 7; i2 < i3; i3 = 7) {
            long j16 = iArr[i2] & M;
            int i4 = i2 + 0;
            long j17 = (j16 * j) + (iArr3[i4] & M) + 0;
            iArr3[i4] = (int) j17;
            int i5 = i2 + 1;
            long j18 = j2;
            long j19 = (j17 >>> 32) + (j16 * j2) + (iArr3[i5] & M);
            iArr3[i5] = (int) j19;
            int i6 = i2 + 2;
            long j20 = j6;
            long j21 = (j19 >>> 32) + (j16 * j3) + (iArr3[i6] & M);
            iArr3[i6] = (int) j21;
            int i7 = i2 + 3;
            long j22 = (j21 >>> 32) + (j16 * j4) + (iArr3[i7] & M);
            iArr3[i7] = (int) j22;
            int i8 = i2 + 4;
            long j23 = (j22 >>> 32) + (j16 * j5) + (iArr3[i8] & M);
            iArr3[i8] = (int) j23;
            int i9 = i2 + 5;
            long j24 = (j23 >>> 32) + (j16 * j20) + (iArr3[i9] & M);
            iArr3[i9] = (int) j24;
            int i10 = i2 + 6;
            long j25 = (j24 >>> 32) + (j16 * j7) + (iArr3[i10] & M);
            iArr3[i10] = (int) j25;
            iArr3[i2 + 7] = (int) (j25 >>> 32);
            i2 = i5;
            j = j;
            j2 = j18;
            j6 = j20;
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
        long j8 = iArr[i + 0] & M;
        long j9 = (j8 * j) + 0;
        iArr3[i3 + 0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[i3 + 1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j3);
        iArr3[i3 + 2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j4);
        iArr3[i3 + 3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j5);
        iArr3[i3 + 4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[i3 + 5] = (int) j14;
        long j15 = j7;
        long j16 = (j14 >>> 32) + (j8 * j15);
        iArr3[i3 + 6] = (int) j16;
        iArr3[i3 + 7] = (int) (j16 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 7) {
            i5 += i4;
            long j17 = iArr[i + i6] & M;
            int i7 = i5 + 0;
            long j18 = (j17 * j) + (iArr3[i7] & M) + 0;
            iArr3[i7] = (int) j18;
            int i8 = i5 + 1;
            long j19 = j15;
            long j20 = (j18 >>> 32) + (j17 * j2) + (iArr3[i8] & M);
            iArr3[i8] = (int) j20;
            int i9 = i5 + 2;
            long j21 = j3;
            long j22 = (j20 >>> 32) + (j17 * j3) + (iArr3[i9] & M);
            iArr3[i9] = (int) j22;
            int i10 = i5 + 3;
            long j23 = (j22 >>> 32) + (j17 * j4) + (iArr3[i10] & M);
            iArr3[i10] = (int) j23;
            int i11 = i5 + 4;
            long j24 = (j23 >>> 32) + (j17 * j5) + (iArr3[i11] & M);
            iArr3[i11] = (int) j24;
            int i12 = i5 + 5;
            long j25 = (j24 >>> 32) + (j17 * j6) + (iArr3[i12] & M);
            iArr3[i12] = (int) j25;
            int i13 = i5 + 6;
            long j26 = (j25 >>> 32) + (j17 * j19) + (iArr3[i13] & M);
            iArr3[i13] = (int) j26;
            iArr3[i5 + 7] = (int) (j26 >>> 32);
            i6++;
            j3 = j21;
            j15 = j19;
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
        long j = M;
        long j2 = iArr2[0] & M;
        long j3 = iArr2[1] & M;
        long j4 = iArr2[2] & M;
        long j5 = iArr2[3] & M;
        long j6 = iArr2[4] & M;
        long j7 = iArr2[5] & M;
        long j8 = iArr2[6] & M;
        long j9 = 0;
        int i8 = 0;
        while (i8 < 7) {
            long j10 = j8;
            long j11 = iArr[i8] & j;
            long j12 = j7;
            long j13 = (j11 * j2) + (iArr3[i] & j) + 0;
            iArr3[i8 + 0] = (int) j13;
            int i9 = i8 + 1;
            long j14 = j3;
            long j15 = (j13 >>> 32) + (j11 * j3) + (iArr3[i9] & j);
            iArr3[i9] = (int) j15;
            long j16 = (j15 >>> 32) + (j11 * j4) + (iArr3[i2] & j);
            iArr3[i8 + 2] = (int) j16;
            long j17 = (j16 >>> 32) + (j11 * j5) + (iArr3[i3] & j);
            iArr3[i8 + 3] = (int) j17;
            long j18 = (j17 >>> 32) + (j11 * j6) + (iArr3[i4] & j);
            iArr3[i8 + 4] = (int) j18;
            long j19 = (j18 >>> 32) + (j11 * j12) + (iArr3[i5] & j);
            iArr3[i8 + 5] = (int) j19;
            long j20 = (j19 >>> 32) + (j11 * j10) + (iArr3[i6] & j);
            iArr3[i8 + 6] = (int) j20;
            long j21 = (j20 >>> 32) + j9 + (iArr3[i7] & j);
            iArr3[i8 + 7] = (int) j21;
            j9 = j21 >>> 32;
            i8 = i9;
            j8 = j10;
            j7 = j12;
            j3 = j14;
            j = M;
        }
        return (int) j9;
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j = iArr2[i2 + 0] & M;
        long j2 = iArr2[i2 + 1] & M;
        long j3 = iArr2[i2 + 2] & M;
        long j4 = iArr2[i2 + 3] & M;
        long j5 = iArr2[i2 + 4] & M;
        long j6 = iArr2[i2 + 5] & M;
        long j7 = iArr2[i2 + 6] & M;
        int i11 = i3;
        long j8 = 0;
        int i12 = 0;
        while (i12 < 7) {
            int i13 = i12;
            long j9 = iArr[i + i12] & M;
            long j10 = j;
            long j11 = (j9 * j) + (iArr3[i4] & M) + 0;
            long j12 = j7;
            iArr3[i11 + 0] = (int) j11;
            int i14 = i11 + 1;
            long j13 = (j11 >>> 32) + (j9 * j2) + (iArr3[i14] & M);
            iArr3[i14] = (int) j13;
            long j14 = (j13 >>> 32) + (j9 * j3) + (iArr3[i5] & M);
            iArr3[i11 + 2] = (int) j14;
            long j15 = (j14 >>> 32) + (j9 * j4) + (iArr3[i6] & M);
            iArr3[i11 + 3] = (int) j15;
            long j16 = (j15 >>> 32) + (j9 * j5) + (iArr3[i7] & M);
            iArr3[i11 + 4] = (int) j16;
            long j17 = (j16 >>> 32) + (j9 * j6) + (iArr3[i8] & M);
            iArr3[i11 + 5] = (int) j17;
            long j18 = (j17 >>> 32) + (j9 * j12) + (iArr3[i9] & M);
            iArr3[i11 + 6] = (int) j18;
            long j19 = (j18 >>> 32) + j8 + (iArr3[i10] & M);
            iArr3[i11 + 7] = (int) j19;
            j8 = j19 >>> 32;
            i12 = i13 + 1;
            i11 = i14;
            j7 = j12;
            j = j10;
            j3 = j3;
            j2 = j2;
        }
        return (int) j8;
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
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (M & iArr2[i3 + 6]);
        iArr3[i4 + 6] = (int) j16;
        return (j16 >>> 32) + j15;
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
        long j8 = (j7 >>> 32) + (j * (M & iArr[6]));
        iArr[6] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j8 = (j7 >>> 32) + (j * (iArr2[6] & M)) + (M & iArr[6]);
        iArr2[6] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j8 = (j7 >>> 32) + (j * (iArr[i2 + 6] & M)) + (iArr2[i10] & M);
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
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
        return Nat.incAt(7, iArr, i2, 4);
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
        return Nat.incAt(7, iArr, i3, 3);
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
        return Nat.incAt(7, iArr, i2, 3);
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
        } while (i3 < 7);
        return (int) j2;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & M;
        int i = 14;
        int i2 = 6;
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
                long j51 = M & iArr2[12];
                long j52 = j42 + (j49 * j);
                int i16 = (int) j52;
                iArr2[6] = (i16 << 1) | i15;
                long j53 = j44 + (j52 >>> 32) + (j49 * j6);
                long j54 = j46 + (j53 >>> 32) + (j10 * j49);
                long j55 = j48 + (j54 >>> 32) + (j49 * j17);
                long j56 = j47 + (j55 >>> 32) + (j49 * j25);
                long j57 = j50 + (j56 >>> 32) + (j49 * j36);
                long j58 = j51 + (j57 >>> 32);
                int i17 = (int) j53;
                iArr2[7] = (i17 << 1) | (i16 >>> 31);
                int i18 = (int) j54;
                iArr2[8] = (i18 << 1) | (i17 >>> 31);
                int i19 = (int) j55;
                iArr2[9] = (i19 << 1) | (i18 >>> 31);
                int i20 = i19 >>> 31;
                int i21 = (int) j56;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j57;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j58;
                iArr2[12] = i24 | (i25 << 1);
                iArr2[13] = (i25 >>> 31) | ((iArr2[13] + ((int) (j58 >> 32))) << 1);
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
        long j = iArr[i + 0] & M;
        int i14 = 0;
        int i15 = 14;
        int i16 = 6;
        while (true) {
            int i17 = i16 - 1;
            long j2 = iArr[i + i16] & M;
            long j3 = j2 * j2;
            int i18 = i15 - 1;
            iArr2[i2 + i18] = (i14 << 31) | ((int) (j3 >>> 33));
            i15 = i18 - 1;
            iArr2[i2 + i15] = (int) (j3 >>> 1);
            i14 = (int) j3;
            if (i17 <= 0) {
                long j4 = j * j;
                long j5 = ((i14 << 31) & M) | (j4 >>> 33);
                iArr2[i2 + 0] = (int) j4;
                long j6 = iArr[i + 1] & M;
                long j7 = iArr2[i3] & M;
                long j8 = j5 + (j6 * j);
                int i19 = (int) j8;
                iArr2[i2 + 1] = (i19 << 1) | (((int) (j4 >>> 32)) & 1);
                int i20 = i19 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = iArr[i + 2] & M;
                long j11 = iArr2[i4] & M;
                long j12 = iArr2[i5] & M;
                long j13 = j9 + (j10 * j);
                int i21 = (int) j13;
                iArr2[i2 + 2] = (i21 << 1) | i20;
                int i22 = i21 >>> 31;
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j14 & M;
                long j16 = iArr[i + 3] & M;
                long j17 = iArr2[i6] & M;
                long j18 = iArr2[i7] & M;
                long j19 = j15 + (j16 * j);
                int i23 = (int) j19;
                iArr2[i2 + 3] = (i23 << 1) | i22;
                long j20 = j12 + (j14 >>> 32) + (j19 >>> 32) + (j16 * j6);
                long j21 = j17 + (j20 >>> 32) + (j16 * j10);
                long j22 = j20 & M;
                long j23 = j21 & M;
                long j24 = iArr[i + 4] & M;
                long j25 = iArr2[i8] & M;
                long j26 = iArr2[i9] & M;
                long j27 = j22 + (j24 * j);
                int i24 = (int) j27;
                iArr2[i2 + 4] = (i23 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
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
                int i26 = (int) j38;
                iArr2[i2 + 5] = i25 | (i26 << 1);
                int i27 = i26 >>> 31;
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
                long j51 = j41 + (j * j48);
                int i28 = (int) j51;
                iArr2[i2 + 6] = (i28 << 1) | i27;
                long j52 = j43 + (j51 >>> 32) + (j48 * j6);
                long j53 = j45 + (j52 >>> 32) + (j48 * j10);
                long j54 = j47 + (j53 >>> 32) + (j48 * j16);
                long j55 = j46 + (j54 >>> 32) + (j48 * j24);
                long j56 = j49 + (j55 >>> 32) + (j48 * j35);
                long j57 = j50 + (j56 >>> 32);
                int i29 = (int) j52;
                iArr2[i2 + 7] = (i28 >>> 31) | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j53;
                iArr2[i2 + 8] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = (int) j54;
                iArr2[i2 + 9] = i32 | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j55;
                iArr2[i2 + 10] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) j56;
                iArr2[i2 + 11] = i36 | (i37 << 1);
                int i38 = i37 >>> 31;
                int i39 = (int) j57;
                iArr2[i2 + 12] = i38 | (i39 << 1);
                int i40 = i39 >>> 31;
                int i41 = i2 + 13;
                iArr2[i41] = i40 | ((iArr2[i41] + ((int) (j57 >> 32))) << 1);
                return;
            }
            i16 = i17;
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
        return (int) (j7 >> 32);
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
        return (int) (j7 >> 32);
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
        return (int) (j7 >> 32);
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
        long j7 = (j6 >> 32) + ((iArr2[6] & M) - (M & iArr[6]));
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
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
        return (int) (j7 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (6 - i) << 2);
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
    }
}
