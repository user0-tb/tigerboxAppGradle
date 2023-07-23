package org.spongycastle.math.ec.custom.sec;

import com.google.android.exoplayer2.RendererCapabilities;
import java.math.BigInteger;
import org.spongycastle.math.raw.Nat;
import org.spongycastle.math.raw.Nat384;

/* loaded from: classes4.dex */
public class SecP384R1Field {
    private static final long M = 4294967295L;
    private static final int P11 = -1;
    private static final int PExt23 = -1;
    static final int[] P = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    static final int[] PExt = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && Nat.gte(12, iArr3, P))) {
            addPInvTo(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.add(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && Nat.gte(24, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (Nat.addTo(iArr4.length, iArr4, iArr3) != 0) {
                Nat.incAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (Nat.inc(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] fromBigInteger = Nat.fromBigInteger(RendererCapabilities.MODE_SUPPORT_MASK, bigInteger);
        if (fromBigInteger[11] == -1) {
            int[] iArr = P;
            if (Nat.gte(12, fromBigInteger, iArr)) {
                Nat.subFrom(12, iArr, fromBigInteger);
            }
        }
        return fromBigInteger;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            Nat.shiftDownBit(12, iArr, 0, iArr2);
        } else {
            Nat.shiftDownBit(12, iArr2, Nat.add(12, iArr, P, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = Nat.create(24);
        Nat384.mul(iArr, iArr2, create);
        reduce(create, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (Nat.isZero(12, iArr)) {
            Nat.zero(12, iArr2);
        } else {
            Nat.sub(12, P, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j = iArr[16] & M;
        long j2 = iArr[17] & M;
        long j3 = iArr[18] & M;
        long j4 = iArr[19] & M;
        long j5 = iArr[20] & M;
        long j6 = iArr[21] & M;
        long j7 = iArr[22] & M;
        long j8 = iArr[23] & M;
        long j9 = ((iArr[12] & M) + j5) - 1;
        long j10 = (iArr[13] & M) + j7;
        long j11 = (iArr[14] & M) + j7 + j8;
        long j12 = (iArr[15] & M) + j8;
        long j13 = j2 + j6;
        long j14 = j6 - j8;
        long j15 = j7 - j8;
        long j16 = (iArr[0] & M) + j9 + j14 + 0;
        iArr2[0] = (int) j16;
        long j17 = (j16 >> 32) + (((iArr[1] & M) + j8) - j9) + j10;
        iArr2[1] = (int) j17;
        long j18 = (j17 >> 32) + (((iArr[2] & M) - j6) - j10) + j11;
        iArr2[2] = (int) j18;
        long j19 = (j18 >> 32) + (((iArr[3] & M) + j9) - j11) + j12 + j14;
        iArr2[3] = (int) j19;
        long j20 = (j19 >> 32) + ((((((iArr[4] & M) + j) + j6) + j9) + j10) - j12) + j14;
        iArr2[4] = (int) j20;
        long j21 = (j20 >> 32) + ((iArr[5] & M) - j) + j10 + j11 + j13;
        iArr2[5] = (int) j21;
        long j22 = (j21 >> 32) + (((iArr[6] & M) + j3) - j2) + j11 + j12;
        iArr2[6] = (int) j22;
        long j23 = (j22 >> 32) + ((((iArr[7] & M) + j) + j4) - j3) + j12;
        iArr2[7] = (int) j23;
        long j24 = (j23 >> 32) + (((((iArr[8] & M) + j) + j2) + j5) - j4);
        iArr2[8] = (int) j24;
        long j25 = (j24 >> 32) + (((iArr[9] & M) + j3) - j5) + j13;
        iArr2[9] = (int) j25;
        long j26 = (j25 >> 32) + ((((iArr[10] & M) + j3) + j4) - j14) + j15;
        iArr2[10] = (int) j26;
        long j27 = (j26 >> 32) + ((((iArr[11] & M) + j4) + j5) - j15);
        iArr2[11] = (int) j27;
        reduce32((int) ((j27 >> 32) + 1), iArr2);
    }

    public static void reduce32(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = i & M;
            long j3 = (iArr[0] & M) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = (j3 >> 32) + ((iArr[1] & M) - j2);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (iArr[2] & M);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = j5 + (iArr[3] & M) + j2;
            iArr[3] = (int) j7;
            long j8 = (j7 >> 32) + (M & iArr[4]) + j2;
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || Nat.incAt(12, iArr, 5) == 0) && !(iArr[11] == -1 && Nat.gte(12, iArr, P))) {
            return;
        }
        addPInvTo(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] create = Nat.create(24);
        Nat384.square(iArr, create);
        reduce(create, iArr2);
    }

    public static void squareN(int[] iArr, int i, int[] iArr2) {
        int[] create = Nat.create(24);
        Nat384.square(iArr, create);
        reduce(create, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            Nat384.square(iArr2, create);
            reduce(create, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(12, iArr, iArr2, iArr3) != 0) {
            subPInvFrom(iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (Nat.sub(24, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = PExtInv;
            if (Nat.subFrom(iArr4.length, iArr4, iArr3) != 0) {
                Nat.decAt(24, iArr3, iArr4.length);
            }
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (Nat.shiftUpBit(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && Nat.gte(12, iArr2, P))) {
            addPInvTo(iArr2);
        }
    }

    private static void addPInvTo(int[] iArr) {
        long j = (iArr[0] & M) + 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & M) - 1);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[2] & M);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + (iArr[3] & M) + 1;
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + (M & iArr[4]) + 1;
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            Nat.incAt(12, iArr, 5);
        }
    }

    private static void subPInvFrom(int[] iArr) {
        long j = (iArr[0] & M) - 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + (iArr[1] & M) + 1;
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (iArr[2] & M);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + ((iArr[3] & M) - 1);
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + ((M & iArr[4]) - 1);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            Nat.decAt(12, iArr, 5);
        }
    }
}
