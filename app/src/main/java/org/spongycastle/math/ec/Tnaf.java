package org.spongycastle.math.ec;

import java.math.BigInteger;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Tnaf {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte POW_2_WIDTH = 16;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    Tnaf() {
    }

    static {
        BigInteger negate = ECConstants.ONE.negate();
        MINUS_ONE = negate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger negate2 = ECConstants.THREE.negate();
        MINUS_THREE = negate2;
        alpha0 = new ZTauElement[]{null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(negate2, negate), null, new ZTauElement(negate, negate), null, new ZTauElement(ECConstants.ONE, negate), null};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(ECConstants.ONE, ECConstants.ZERO), null, new ZTauElement(negate2, ECConstants.ONE), null, new ZTauElement(negate, ECConstants.ONE), null, new ZTauElement(ECConstants.ONE, ECConstants.ONE), null};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static BigInteger norm(byte b, ZTauElement zTauElement) {
        BigInteger multiply = zTauElement.u.multiply(zTauElement.u);
        BigInteger multiply2 = zTauElement.u.multiply(zTauElement.v);
        BigInteger shiftLeft = zTauElement.v.multiply(zTauElement.v).shiftLeft(1);
        if (b == 1) {
            return multiply.add(multiply2).add(shiftLeft);
        }
        if (b == -1) {
            return multiply.subtract(multiply2).add(shiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static SimpleBigDecimal norm(byte b, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        SimpleBigDecimal multiply = simpleBigDecimal.multiply(simpleBigDecimal);
        SimpleBigDecimal multiply2 = simpleBigDecimal.multiply(simpleBigDecimal2);
        SimpleBigDecimal shiftLeft = simpleBigDecimal2.multiply(simpleBigDecimal2).shiftLeft(1);
        if (b == 1) {
            return multiply.add(multiply2).add(shiftLeft);
        }
        if (b == -1) {
            return multiply.subtract(multiply2).add(shiftLeft);
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r5.compareTo(org.spongycastle.math.ec.Tnaf.MINUS_ONE) < 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r7.compareTo(org.spongycastle.math.ec.ECConstants.TWO) >= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
        if (r5.compareTo(org.spongycastle.math.ec.ECConstants.ONE) >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r7.compareTo(org.spongycastle.math.ec.Tnaf.MINUS_TWO) < 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.spongycastle.math.ec.ZTauElement round(org.spongycastle.math.ec.SimpleBigDecimal r7, org.spongycastle.math.ec.SimpleBigDecimal r8, byte r9) {
        /*
            int r0 = r7.getScale()
            int r1 = r8.getScale()
            if (r1 != r0) goto La7
            r0 = -1
            r1 = 1
            if (r9 == r1) goto L19
            if (r9 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "mu must be 1 or -1"
            r7.<init>(r8)
            throw r7
        L19:
            java.math.BigInteger r2 = r7.round()
            java.math.BigInteger r3 = r8.round()
            org.spongycastle.math.ec.SimpleBigDecimal r7 = r7.subtract(r2)
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r8.subtract(r3)
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r7.add(r7)
            if (r9 != r1) goto L34
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r4.add(r8)
            goto L38
        L34:
            org.spongycastle.math.ec.SimpleBigDecimal r4 = r4.subtract(r8)
        L38:
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r8.add(r8)
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r5.add(r8)
            org.spongycastle.math.ec.SimpleBigDecimal r8 = r5.add(r8)
            if (r9 != r1) goto L4f
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r7.subtract(r5)
            org.spongycastle.math.ec.SimpleBigDecimal r7 = r7.add(r8)
            goto L57
        L4f:
            org.spongycastle.math.ec.SimpleBigDecimal r5 = r7.add(r5)
            org.spongycastle.math.ec.SimpleBigDecimal r7 = r7.subtract(r8)
        L57:
            java.math.BigInteger r8 = org.spongycastle.math.ec.ECConstants.ONE
            int r8 = r4.compareTo(r8)
            r6 = 0
            if (r8 < 0) goto L69
            java.math.BigInteger r8 = org.spongycastle.math.ec.Tnaf.MINUS_ONE
            int r8 = r5.compareTo(r8)
            if (r8 >= 0) goto L73
            goto L71
        L69:
            java.math.BigInteger r8 = org.spongycastle.math.ec.ECConstants.TWO
            int r8 = r7.compareTo(r8)
            if (r8 < 0) goto L72
        L71:
            r6 = r9
        L72:
            r1 = 0
        L73:
            java.math.BigInteger r8 = org.spongycastle.math.ec.Tnaf.MINUS_ONE
            int r8 = r4.compareTo(r8)
            if (r8 >= 0) goto L84
            java.math.BigInteger r7 = org.spongycastle.math.ec.ECConstants.ONE
            int r7 = r5.compareTo(r7)
            if (r7 < 0) goto L8f
            goto L8c
        L84:
            java.math.BigInteger r8 = org.spongycastle.math.ec.Tnaf.MINUS_TWO
            int r7 = r7.compareTo(r8)
            if (r7 >= 0) goto L8e
        L8c:
            int r7 = -r9
            byte r6 = (byte) r7
        L8e:
            r0 = r1
        L8f:
            long r7 = (long) r0
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.math.BigInteger r7 = r2.add(r7)
            long r8 = (long) r6
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r3.add(r8)
            org.spongycastle.math.ec.ZTauElement r9 = new org.spongycastle.math.ec.ZTauElement
            r9.<init>(r7, r8)
            return r9
        La7:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "lambda0 and lambda1 do not have same scale"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.math.ec.Tnaf.round(org.spongycastle.math.ec.SimpleBigDecimal, org.spongycastle.math.ec.SimpleBigDecimal, byte):org.spongycastle.math.ec.ZTauElement");
    }

    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger shiftRight = add.shiftRight(i4);
        if (add.testBit(i4 - 1)) {
            shiftRight = shiftRight.add(ECConstants.ONE);
        }
        return new SimpleBigDecimal(shiftRight, i2);
    }

    public static byte[] tauAdicNaf(byte b, ZTauElement zTauElement) {
        BigInteger subtract;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = norm(b, zTauElement).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 : 34];
        BigInteger bigInteger = zTauElement.u;
        BigInteger bigInteger2 = zTauElement.v;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!bigInteger.equals(ECConstants.ZERO) || !bigInteger2.equals(ECConstants.ZERO)) {
                if (bigInteger.testBit(0)) {
                    bArr[i2] = (byte) ECConstants.TWO.subtract(bigInteger.subtract(bigInteger2.shiftLeft(1)).mod(ECConstants.FOUR)).intValue();
                    if (bArr[i2] == 1) {
                        bigInteger = bigInteger.clearBit(0);
                    } else {
                        bigInteger = bigInteger.add(ECConstants.ONE);
                    }
                    i = i2;
                } else {
                    bArr[i2] = 0;
                }
                BigInteger shiftRight = bigInteger.shiftRight(1);
                if (b == 1) {
                    subtract = bigInteger2.add(shiftRight);
                } else {
                    subtract = bigInteger2.subtract(shiftRight);
                }
                BigInteger negate = bigInteger.shiftRight(1).negate();
                i2++;
                bigInteger = subtract;
                bigInteger2 = negate;
            } else {
                int i3 = i + 1;
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, 0, bArr2, 0, i3);
                return bArr2;
            }
        }
    }

    public static ECPoint.F2m tau(ECPoint.F2m f2m) {
        return f2m.tau();
    }

    public static byte getMu(ECCurve.F2m f2m) {
        if (f2m.isKoblitz()) {
            return f2m.getA().isZero() ? (byte) -1 : (byte) 1;
        }
        throw new IllegalArgumentException("No Koblitz curve (ABC), TNAF multiplication not possible");
    }

    public static BigInteger[] getLucas(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b == 1 || b == -1) {
            if (z) {
                bigInteger = ECConstants.TWO;
                bigInteger2 = BigInteger.valueOf(b);
            } else {
                bigInteger = ECConstants.ZERO;
                bigInteger2 = ECConstants.ONE;
            }
            int i2 = 1;
            while (i2 < i) {
                i2++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    public static BigInteger getTw(byte b, int i) {
        if (i == 4) {
            if (b == 1) {
                return BigInteger.valueOf(6L);
            }
            return BigInteger.valueOf(10L);
        }
        BigInteger[] lucas = getLucas(b, i, false);
        BigInteger bit = ECConstants.ZERO.setBit(i);
        return ECConstants.TWO.multiply(lucas[0]).multiply(lucas[1].modInverse(bit)).mod(bit);
    }

    public static BigInteger[] getSi(ECCurve.F2m f2m) {
        if (!f2m.isKoblitz()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int m = f2m.getM();
        int intValue = f2m.getA().toBigInteger().intValue();
        byte mu = f2m.getMu();
        int shiftsForCofactor = getShiftsForCofactor(f2m.getCofactor());
        BigInteger[] lucas = getLucas(mu, (m + 3) - intValue, false);
        if (mu == 1) {
            lucas[0] = lucas[0].negate();
            lucas[1] = lucas[1].negate();
        }
        return new BigInteger[]{ECConstants.ONE.add(lucas[1]).shiftRight(shiftsForCofactor), ECConstants.ONE.add(lucas[0]).shiftRight(shiftsForCofactor).negate()};
    }

    protected static int getShiftsForCofactor(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(ECConstants.TWO)) {
                return 1;
            }
            if (bigInteger.equals(ECConstants.FOUR)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static ZTauElement partModReduction(BigInteger bigInteger, int i, byte b, BigInteger[] bigIntegerArr, byte b2, byte b3) {
        BigInteger subtract;
        if (b2 == 1) {
            subtract = bigIntegerArr[0].add(bigIntegerArr[1]);
        } else {
            subtract = bigIntegerArr[0].subtract(bigIntegerArr[1]);
        }
        BigInteger bigInteger2 = getLucas(b2, i, true)[1];
        ZTauElement round = round(approximateDivisionByN(bigInteger, bigIntegerArr[0], bigInteger2, b, i, b3), approximateDivisionByN(bigInteger, bigIntegerArr[1], bigInteger2, b, i, b3), b2);
        return new ZTauElement(bigInteger.subtract(subtract.multiply(round.u)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(round.v)), bigIntegerArr[1].multiply(round.u).subtract(bigIntegerArr[0].multiply(round.v)));
    }

    public static ECPoint.F2m multiplyRTnaf(ECPoint.F2m f2m, BigInteger bigInteger) {
        ECCurve.F2m f2m2 = (ECCurve.F2m) f2m.getCurve();
        return multiplyTnaf(f2m, partModReduction(bigInteger, f2m2.getM(), (byte) f2m2.getA().toBigInteger().intValue(), f2m2.getSi(), f2m2.getMu(), (byte) 10));
    }

    public static ECPoint.F2m multiplyTnaf(ECPoint.F2m f2m, ZTauElement zTauElement) {
        return multiplyFromTnaf(f2m, tauAdicNaf(((ECCurve.F2m) f2m.getCurve()).getMu(), zTauElement));
    }

    public static ECPoint.F2m multiplyFromTnaf(ECPoint.F2m f2m, byte[] bArr) {
        ECPoint.F2m f2m2 = (ECPoint.F2m) ((ECCurve.F2m) f2m.getCurve()).getInfinity();
        for (int length = bArr.length - 1; length >= 0; length--) {
            f2m2 = tau(f2m2);
            if (bArr[length] == 1) {
                f2m2 = f2m2.addSimple(f2m);
            } else if (bArr[length] == -1) {
                f2m2 = f2m2.subtractSimple(f2m);
            }
        }
        return f2m2;
    }

    public static byte[] tauAdicWNaf(byte b, ZTauElement zTauElement, byte b2, BigInteger bigInteger, BigInteger bigInteger2, ZTauElement[] zTauElementArr) {
        BigInteger subtract;
        int intValue;
        boolean z;
        if (b != 1 && b != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int bitLength = norm(b, zTauElement).bitLength();
        byte[] bArr = new byte[bitLength > 30 ? bitLength + 4 + b2 : b2 + 34];
        BigInteger shiftRight = bigInteger.shiftRight(1);
        BigInteger bigInteger3 = zTauElement.u;
        BigInteger bigInteger4 = zTauElement.v;
        int i = 0;
        while (true) {
            if (bigInteger3.equals(ECConstants.ZERO) && bigInteger4.equals(ECConstants.ZERO)) {
                return bArr;
            }
            if (bigInteger3.testBit(0)) {
                BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                if (mod.compareTo(shiftRight) >= 0) {
                    intValue = mod.subtract(bigInteger).intValue();
                } else {
                    intValue = mod.intValue();
                }
                byte b3 = (byte) intValue;
                bArr[i] = b3;
                if (b3 < 0) {
                    b3 = (byte) (-b3);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bigInteger3 = bigInteger3.subtract(zTauElementArr[b3].u);
                    bigInteger4 = bigInteger4.subtract(zTauElementArr[b3].v);
                } else {
                    bigInteger3 = bigInteger3.add(zTauElementArr[b3].u);
                    bigInteger4 = bigInteger4.add(zTauElementArr[b3].v);
                }
            } else {
                bArr[i] = 0;
            }
            if (b == 1) {
                subtract = bigInteger4.add(bigInteger3.shiftRight(1));
            } else {
                subtract = bigInteger4.subtract(bigInteger3.shiftRight(1));
            }
            BigInteger negate = bigInteger3.shiftRight(1).negate();
            i++;
            bigInteger3 = subtract;
            bigInteger4 = negate;
        }
    }

    public static ECPoint.F2m[] getPreComp(ECPoint.F2m f2m, byte b) {
        byte[][] bArr;
        ECPoint.F2m[] f2mArr = new ECPoint.F2m[16];
        f2mArr[1] = f2m;
        if (b == 0) {
            bArr = alpha0Tnaf;
        } else {
            bArr = alpha1Tnaf;
        }
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            f2mArr[i] = multiplyFromTnaf(f2m, bArr[i]);
        }
        f2m.getCurve().normalizeAll(f2mArr);
        return f2mArr;
    }
}
