package org.spongycastle.pqc.math.ntru.euclid;

/* loaded from: classes4.dex */
public class IntEuclidean {
    public int gcd;
    public int x;
    public int y;

    private IntEuclidean() {
    }

    public static IntEuclidean calculate(int i, int i2) {
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        int i7 = i;
        int i8 = i2;
        while (i8 != 0) {
            int i9 = i7 / i8;
            int i10 = i7 % i8;
            int i11 = i6 - (i9 * i5);
            i7 = i8;
            i8 = i10;
            int i12 = i4;
            i4 = i3 - (i9 * i4);
            i3 = i12;
            i6 = i5;
            i5 = i11;
        }
        IntEuclidean intEuclidean = new IntEuclidean();
        intEuclidean.x = i3;
        intEuclidean.y = i6;
        intEuclidean.gcd = i7;
        return intEuclidean;
    }
}
