package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.util.Random;

/* loaded from: classes4.dex */
public class GF2nONBField extends GF2nField {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    int[][] mMult;
    private int mType;

    public GF2nONBField(int i) throws RuntimeException {
        if (i < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i;
        this.mLength = this.mDegree / 64;
        int i2 = this.mDegree & 63;
        this.mBit = i2;
        if (i2 == 0) {
            this.mBit = 64;
        } else {
            this.mLength++;
        }
        computeType();
        if (this.mType < 3) {
            this.mMult = (int[][]) Array.newInstance(int.class, this.mDegree, 2);
            for (int i3 = 0; i3 < this.mDegree; i3++) {
                int[][] iArr = this.mMult;
                iArr[i3][0] = -1;
                iArr[i3][1] = -1;
            }
            computeMultMatrix();
            computeFieldPolynomial();
            this.fields = new java.util.Vector();
            this.matrices = new java.util.Vector();
            return;
        }
        throw new RuntimeException("\nThe type of this field is " + this.mType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getONBLength() {
        return this.mLength;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getONBBit() {
        return this.mBit;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        int degree3 = gF2nPolynomial.getDegree();
        while (degree3 > 1) {
            while (true) {
                GF2nONBElement gF2nONBElement = new GF2nONBElement(this, new Random());
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i = 1; i <= this.mDegree - 1; i++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            if ((degree << 1) > degree2) {
                gF2nPolynomial = gF2nPolynomial.quotient(gcd);
            } else {
                gF2nPolynomial = new GF2nPolynomial(gcd);
            }
            degree3 = gF2nPolynomial.getDegree();
        }
        return gF2nPolynomial.at(0);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        if (this.mDegree != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[this.mDegree];
        for (int i = 0; i < this.mDegree; i++) {
            gF2PolynomialArr[i] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        GF2nElement[] gF2nElementArr = new GF2nPolynomialElement[this.mDegree];
        gF2nElementArr[0] = (GF2nElement) randomRoot.clone();
        for (int i2 = 1; i2 < this.mDegree; i2++) {
            gF2nElementArr[i2] = gF2nElementArr[i2 - 1].square();
        }
        for (int i3 = 0; i3 < this.mDegree; i3++) {
            for (int i4 = 0; i4 < this.mDegree; i4++) {
                if (gF2nElementArr[i3].testBit(i4)) {
                    gF2PolynomialArr[(this.mDegree - i4) - 1].setBit((this.mDegree - i3) - 1);
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.GF2nField
    protected void computeFieldPolynomial() {
        int i = this.mType;
        if (i == 1) {
            this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1, "ALL");
        } else if (i == 2) {
            GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree + 1, "ONE");
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 1, "X");
            gF2Polynomial2.addToThis(gF2Polynomial);
            GF2Polynomial gF2Polynomial3 = gF2Polynomial;
            GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            int i2 = 1;
            while (i2 < this.mDegree) {
                GF2Polynomial shiftLeft = gF2Polynomial4.shiftLeft();
                shiftLeft.addToThis(gF2Polynomial3);
                i2++;
                gF2Polynomial3 = gF2Polynomial4;
                gF2Polynomial4 = shiftLeft;
            }
            this.fieldPolynomial = gF2Polynomial4;
        }
    }

    int[][] invMatrix(int[][] iArr) {
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, this.mDegree, this.mDegree);
        int[][] iArr3 = (int[][]) Array.newInstance(int.class, this.mDegree, this.mDegree);
        for (int i = 0; i < this.mDegree; i++) {
            iArr3[i][i] = 1;
        }
        for (int i2 = 0; i2 < this.mDegree; i2++) {
            for (int i3 = i2; i3 < this.mDegree; i3++) {
                iArr[(this.mDegree - 1) - i2][i3] = iArr[i2][i2];
            }
        }
        return null;
    }

    private void computeType() throws RuntimeException {
        if ((this.mDegree & 7) == 0) {
            throw new RuntimeException("The extension degree is divisible by 8!");
        }
        this.mType = 1;
        int i = 0;
        while (i != 1) {
            int i2 = (this.mType * this.mDegree) + 1;
            if (IntegerFunctions.isPrime(i2)) {
                i = IntegerFunctions.gcd((this.mType * this.mDegree) / IntegerFunctions.order(2, i2), this.mDegree);
            }
            this.mType++;
        }
        int i3 = this.mType - 1;
        this.mType = i3;
        if (i3 == 1) {
            int i4 = (this.mDegree << 1) + 1;
            if (IntegerFunctions.isPrime(i4)) {
                if (IntegerFunctions.gcd((this.mDegree << 1) / IntegerFunctions.order(2, i4), this.mDegree) == 1) {
                    this.mType++;
                }
            }
        }
    }

    private void computeMultMatrix() {
        int i;
        int i2;
        int i3 = this.mType;
        if ((i3 & 7) != 0) {
            int i4 = (i3 * this.mDegree) + 1;
            int[] iArr = new int[i4];
            int i5 = this.mType;
            if (i5 == 1) {
                i = 1;
            } else {
                i = i5 == 2 ? i4 - 1 : elementOfOrder(i5, i4);
            }
            int i6 = 0;
            int i7 = 1;
            while (true) {
                i2 = this.mType;
                if (i6 >= i2) {
                    break;
                }
                int i8 = i7;
                for (int i9 = 0; i9 < this.mDegree; i9++) {
                    iArr[i8] = i9;
                    i8 = (i8 << 1) % i4;
                    if (i8 < 0) {
                        i8 += i4;
                    }
                }
                i7 = (i7 * i) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                i6++;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new RuntimeException("only type 1 or type 2 implemented");
                }
                int i10 = 1;
                while (i10 < i4 - 1) {
                    int[][] iArr2 = this.mMult;
                    int i11 = i10 + 1;
                    if (iArr2[iArr[i11]][0] == -1) {
                        iArr2[iArr[i11]][0] = iArr[i4 - i10];
                    } else {
                        iArr2[iArr[i11]][1] = iArr[i4 - i10];
                    }
                    i10 = i11;
                }
                return;
            }
            int i12 = 1;
            while (i12 < i4 - 1) {
                int[][] iArr3 = this.mMult;
                int i13 = i12 + 1;
                if (iArr3[iArr[i13]][0] == -1) {
                    iArr3[iArr[i13]][0] = iArr[i4 - i12];
                } else {
                    iArr3[iArr[i13]][1] = iArr[i4 - i12];
                }
                i12 = i13;
            }
            int i14 = this.mDegree >> 1;
            for (int i15 = 1; i15 <= i14; i15++) {
                int[][] iArr4 = this.mMult;
                int i16 = i15 - 1;
                if (iArr4[i16][0] == -1) {
                    iArr4[i16][0] = (i14 + i15) - 1;
                } else {
                    iArr4[i16][1] = (i14 + i15) - 1;
                }
                int i17 = (i14 + i15) - 1;
                if (iArr4[i17][0] == -1) {
                    iArr4[i17][0] = i16;
                } else {
                    iArr4[i17][1] = i16;
                }
            }
            return;
        }
        throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
    }

    private int elementOfOrder(int i, int i2) {
        Random random = new Random();
        int i3 = 0;
        while (i3 == 0) {
            int i4 = i2 - 1;
            i3 = random.nextInt() % i4;
            if (i3 < 0) {
                i3 += i4;
            }
        }
        int order = IntegerFunctions.order(i3, i2);
        while (true) {
            if (order % i == 0 && order != 0) {
                break;
            }
            while (i3 == 0) {
                int i5 = i2 - 1;
                i3 = random.nextInt() % i5;
                if (i3 < 0) {
                    i3 += i5;
                }
            }
            order = IntegerFunctions.order(i3, i2);
        }
        int i6 = i3;
        for (int i7 = 2; i7 <= i / order; i7++) {
            i6 *= i3;
        }
        return i6;
    }
}
