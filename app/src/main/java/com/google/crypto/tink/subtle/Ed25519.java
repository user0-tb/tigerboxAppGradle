package com.google.crypto.tink.subtle;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Ed25519 {
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final CachedXYT CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final PartialXYZT NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    static final byte[] GROUP_ORDER = {-19, -45, -11, 92, Ascii.SUB, 99, Ascii.DC2, 88, -42, -100, -9, -94, -34, -7, -34, Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    private static int eq(int a, int b) {
        int i = (~(a ^ b)) & 255;
        int i2 = i & (i << 4);
        int i3 = i2 & (i2 << 2);
        return ((i3 & (i3 << 1)) >> 7) & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class XYZ {
        final long[] x;
        final long[] y;
        final long[] z;

        XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        XYZ(long[] x, long[] y, long[] z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        XYZ(XYZ xyz) {
            this.x = Arrays.copyOf(xyz.x, 10);
            this.y = Arrays.copyOf(xyz.y, 10);
            this.z = Arrays.copyOf(xyz.z, 10);
        }

        XYZ(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        static XYZ fromPartialXYZT(XYZ out, PartialXYZT in) {
            Field25519.mult(out.x, in.xyz.x, in.t);
            Field25519.mult(out.y, in.xyz.y, in.xyz.z);
            Field25519.mult(out.z, in.xyz.z, in.t);
            return out;
        }

        byte[] toBytes() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            Field25519.inverse(jArr, this.z);
            Field25519.mult(jArr2, this.x, jArr);
            Field25519.mult(jArr3, this.y, jArr);
            byte[] contract = Field25519.contract(jArr3);
            contract[31] = (byte) ((Ed25519.getLsb(jArr2) << 7) ^ contract[31]);
            return contract;
        }

        boolean isOnCurve() {
            long[] jArr = new long[10];
            Field25519.square(jArr, this.x);
            long[] jArr2 = new long[10];
            Field25519.square(jArr2, this.y);
            long[] jArr3 = new long[10];
            Field25519.square(jArr3, this.z);
            long[] jArr4 = new long[10];
            Field25519.square(jArr4, jArr3);
            long[] jArr5 = new long[10];
            Field25519.sub(jArr5, jArr2, jArr);
            Field25519.mult(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            Field25519.mult(jArr6, jArr, jArr2);
            Field25519.mult(jArr6, jArr6, Ed25519Constants.D);
            Field25519.sum(jArr6, jArr4);
            Field25519.reduce(jArr6, jArr6);
            return Bytes.equal(Field25519.contract(jArr5), Field25519.contract(jArr6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class XYZT {
        final long[] t;
        final XYZ xyz;

        XYZT() {
            this(new XYZ(), new long[10]);
        }

        XYZT(XYZ xyz, long[] t) {
            this.xyz = xyz;
            this.t = t;
        }

        XYZT(PartialXYZT partialXYZT) {
            this();
            fromPartialXYZT(this, partialXYZT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromPartialXYZT(XYZT out, PartialXYZT in) {
            Field25519.mult(out.xyz.x, in.xyz.x, in.t);
            Field25519.mult(out.xyz.y, in.xyz.y, in.xyz.z);
            Field25519.mult(out.xyz.z, in.xyz.z, in.t);
            Field25519.mult(out.t, in.xyz.x, in.xyz.y);
            return out;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static XYZT fromBytesNegateVarTime(byte[] s) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] expand = Field25519.expand(s);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            Field25519.square(jArr4, expand);
            Field25519.mult(jArr5, jArr4, Ed25519Constants.D);
            Field25519.sub(jArr4, jArr4, jArr2);
            Field25519.sum(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            Field25519.square(jArr8, jArr5);
            Field25519.mult(jArr8, jArr8, jArr5);
            Field25519.square(jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr5);
            Field25519.mult(jArr, jArr, jArr4);
            Ed25519.pow2252m3(jArr, jArr);
            Field25519.mult(jArr, jArr, jArr8);
            Field25519.mult(jArr, jArr, jArr4);
            Field25519.square(jArr6, jArr);
            Field25519.mult(jArr6, jArr6, jArr5);
            Field25519.sub(jArr7, jArr6, jArr4);
            if (Ed25519.isNonZeroVarTime(jArr7)) {
                Field25519.sum(jArr7, jArr6, jArr4);
                if (Ed25519.isNonZeroVarTime(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                Field25519.mult(jArr, jArr, Ed25519Constants.SQRTM1);
            }
            if (Ed25519.isNonZeroVarTime(jArr) || ((s[31] & 255) >> 7) == 0) {
                if (Ed25519.getLsb(jArr) == ((s[31] & 255) >> 7)) {
                    Ed25519.neg(jArr, jArr);
                }
                Field25519.mult(jArr3, jArr, expand);
                return new XYZT(new XYZ(jArr, expand, jArr2), jArr3);
            }
            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class PartialXYZT {
        final long[] t;
        final XYZ xyz;

        PartialXYZT() {
            this(new XYZ(), new long[10]);
        }

        PartialXYZT(XYZ xyz, long[] t) {
            this.xyz = xyz;
            this.t = t;
        }

        PartialXYZT(PartialXYZT other) {
            this.xyz = new XYZ(other.xyz);
            this.t = Arrays.copyOf(other.t, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CachedXYT(long[] yPlusX, long[] yMinusX, long[] t2d) {
            this.yPlusX = yPlusX;
            this.yMinusX = yMinusX;
            this.t2d = t2d;
        }

        CachedXYT(CachedXYT other) {
            this.yPlusX = Arrays.copyOf(other.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(other.yMinusX, 10);
            this.t2d = Arrays.copyOf(other.t2d, 10);
        }

        void multByZ(long[] output, long[] in) {
            System.arraycopy(in, 0, output, 0, 10);
        }

        void copyConditional(CachedXYT other, int icopy) {
            Curve25519.copyConditional(this.yPlusX, other.yPlusX, icopy);
            Curve25519.copyConditional(this.yMinusX, other.yMinusX, icopy);
            Curve25519.copyConditional(this.t2d, other.t2d, icopy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class CachedXYZT extends CachedXYT {
        private final long[] z;

        CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        CachedXYZT(XYZT xyzt) {
            this();
            Field25519.sum(this.yPlusX, xyzt.xyz.y, xyzt.xyz.x);
            Field25519.sub(this.yMinusX, xyzt.xyz.y, xyzt.xyz.x);
            System.arraycopy(xyzt.xyz.z, 0, this.z, 0, 10);
            Field25519.mult(this.t2d, xyzt.t, Ed25519Constants.D2);
        }

        CachedXYZT(long[] yPlusX, long[] yMinusX, long[] z, long[] t2d) {
            super(yPlusX, yMinusX, t2d);
            this.z = z;
        }

        @Override // com.google.crypto.tink.subtle.Ed25519.CachedXYT
        public void multByZ(long[] output, long[] in) {
            Field25519.mult(output, in, this.z);
        }
    }

    private static void add(PartialXYZT partialXYZT, XYZT extended, CachedXYT cached) {
        long[] jArr = new long[10];
        Field25519.sum(partialXYZT.xyz.x, extended.xyz.y, extended.xyz.x);
        Field25519.sub(partialXYZT.xyz.y, extended.xyz.y, extended.xyz.x);
        Field25519.mult(partialXYZT.xyz.y, partialXYZT.xyz.y, cached.yMinusX);
        Field25519.mult(partialXYZT.xyz.z, partialXYZT.xyz.x, cached.yPlusX);
        Field25519.mult(partialXYZT.t, extended.t, cached.t2d);
        cached.multByZ(partialXYZT.xyz.x, extended.xyz.z);
        Field25519.sum(jArr, partialXYZT.xyz.x, partialXYZT.xyz.x);
        Field25519.sub(partialXYZT.xyz.x, partialXYZT.xyz.z, partialXYZT.xyz.y);
        Field25519.sum(partialXYZT.xyz.y, partialXYZT.xyz.z, partialXYZT.xyz.y);
        Field25519.sum(partialXYZT.xyz.z, jArr, partialXYZT.t);
        Field25519.sub(partialXYZT.t, jArr, partialXYZT.t);
    }

    private static void sub(PartialXYZT partialXYZT, XYZT extended, CachedXYT cached) {
        long[] jArr = new long[10];
        Field25519.sum(partialXYZT.xyz.x, extended.xyz.y, extended.xyz.x);
        Field25519.sub(partialXYZT.xyz.y, extended.xyz.y, extended.xyz.x);
        Field25519.mult(partialXYZT.xyz.y, partialXYZT.xyz.y, cached.yPlusX);
        Field25519.mult(partialXYZT.xyz.z, partialXYZT.xyz.x, cached.yMinusX);
        Field25519.mult(partialXYZT.t, extended.t, cached.t2d);
        cached.multByZ(partialXYZT.xyz.x, extended.xyz.z);
        Field25519.sum(jArr, partialXYZT.xyz.x, partialXYZT.xyz.x);
        Field25519.sub(partialXYZT.xyz.x, partialXYZT.xyz.z, partialXYZT.xyz.y);
        Field25519.sum(partialXYZT.xyz.y, partialXYZT.xyz.z, partialXYZT.xyz.y);
        Field25519.sub(partialXYZT.xyz.z, jArr, partialXYZT.t);
        Field25519.sum(partialXYZT.t, jArr, partialXYZT.t);
    }

    private static void doubleXYZ(PartialXYZT partialXYZT, XYZ p) {
        long[] jArr = new long[10];
        Field25519.square(partialXYZT.xyz.x, p.x);
        Field25519.square(partialXYZT.xyz.z, p.y);
        Field25519.square(partialXYZT.t, p.z);
        Field25519.sum(partialXYZT.t, partialXYZT.t, partialXYZT.t);
        Field25519.sum(partialXYZT.xyz.y, p.x, p.y);
        Field25519.square(jArr, partialXYZT.xyz.y);
        Field25519.sum(partialXYZT.xyz.y, partialXYZT.xyz.z, partialXYZT.xyz.x);
        Field25519.sub(partialXYZT.xyz.z, partialXYZT.xyz.z, partialXYZT.xyz.x);
        Field25519.sub(partialXYZT.xyz.x, jArr, partialXYZT.xyz.y);
        Field25519.sub(partialXYZT.t, partialXYZT.t, partialXYZT.xyz.z);
    }

    private static void doubleXYZT(PartialXYZT partialXYZT, XYZT p) {
        doubleXYZ(partialXYZT, p.xyz);
    }

    private static void select(CachedXYT t, int pos, byte b) {
        int i = (b & 255) >> 7;
        int i2 = b - (((-i) & b) << 1);
        t.copyConditional(Ed25519Constants.B_TABLE[pos][0], eq(i2, 1));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][1], eq(i2, 2));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][2], eq(i2, 3));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][3], eq(i2, 4));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][4], eq(i2, 5));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][5], eq(i2, 6));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][6], eq(i2, 7));
        t.copyConditional(Ed25519Constants.B_TABLE[pos][7], eq(i2, 8));
        long[] copyOf = Arrays.copyOf(t.yMinusX, 10);
        long[] copyOf2 = Arrays.copyOf(t.yPlusX, 10);
        long[] copyOf3 = Arrays.copyOf(t.t2d, 10);
        neg(copyOf3, copyOf3);
        t.copyConditional(new CachedXYT(copyOf, copyOf2, copyOf3), i);
    }

    private static XYZ scalarMultWithBase(byte[] a) {
        int i;
        byte[] bArr = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 * 2;
            bArr[i3 + 0] = (byte) (((a[i2] & 255) >> 0) & 15);
            bArr[i3 + 1] = (byte) (((a[i2] & 255) >> 4) & 15);
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 63; i5++) {
            bArr[i5] = (byte) (bArr[i5] + i4);
            i4 = (bArr[i5] + 8) >> 4;
            bArr[i5] = (byte) (bArr[i5] - (i4 << 4));
        }
        bArr[63] = (byte) (bArr[63] + i4);
        PartialXYZT partialXYZT = new PartialXYZT(NEUTRAL);
        XYZT xyzt = new XYZT();
        for (i = 1; i < 64; i += 2) {
            CachedXYT cachedXYT = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT, i / 2, bArr[i]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT);
        }
        XYZ xyz = new XYZ();
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        doubleXYZ(partialXYZT, XYZ.fromPartialXYZT(xyz, partialXYZT));
        for (int i6 = 0; i6 < 64; i6 += 2) {
            CachedXYT cachedXYT2 = new CachedXYT(CACHED_NEUTRAL);
            select(cachedXYT2, i6 / 2, bArr[i6]);
            add(partialXYZT, XYZT.fromPartialXYZT(xyzt, partialXYZT), cachedXYT2);
        }
        XYZ xyz2 = new XYZ(partialXYZT);
        if (xyz2.isOnCurve()) {
            return xyz2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] scalarMultWithBaseToBytes(byte[] a) {
        return scalarMultWithBase(a).toBytes();
    }

    private static byte[] slide(byte[] a) {
        int i;
        byte[] bArr = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr[i2] = (byte) (1 & ((a[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    if (bArr[i] != 0) {
                        if (bArr[i3] + (bArr[i] << i4) <= 15) {
                            bArr[i3] = (byte) (bArr[i3] + (bArr[i] << i4));
                            bArr[i] = 0;
                        } else if (bArr[i3] - (bArr[i] << i4) >= -15) {
                            bArr[i3] = (byte) (bArr[i3] - (bArr[i] << i4));
                            while (true) {
                                if (i >= 256) {
                                    break;
                                } else if (bArr[i] == 0) {
                                    bArr[i] = 1;
                                    break;
                                } else {
                                    bArr[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr;
    }

    private static XYZ doubleScalarMultVarTime(byte[] a, XYZT pointA, byte[] b) {
        CachedXYZT[] cachedXYZTArr = new CachedXYZT[8];
        cachedXYZTArr[0] = new CachedXYZT(pointA);
        PartialXYZT partialXYZT = new PartialXYZT();
        doubleXYZT(partialXYZT, pointA);
        XYZT xyzt = new XYZT(partialXYZT);
        for (int i = 1; i < 8; i++) {
            add(partialXYZT, xyzt, cachedXYZTArr[i - 1]);
            cachedXYZTArr[i] = new CachedXYZT(new XYZT(partialXYZT));
        }
        byte[] slide = slide(a);
        byte[] slide2 = slide(b);
        PartialXYZT partialXYZT2 = new PartialXYZT(NEUTRAL);
        XYZT xyzt2 = new XYZT();
        int i2 = 255;
        while (i2 >= 0 && slide[i2] == 0 && slide2[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            doubleXYZ(partialXYZT2, new XYZ(partialXYZT2));
            if (slide[i2] > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), cachedXYZTArr[slide[i2] / 2]);
            } else if (slide[i2] < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), cachedXYZTArr[(-slide[i2]) / 2]);
            }
            if (slide2[i2] > 0) {
                add(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), Ed25519Constants.B2[slide2[i2] / 2]);
            } else if (slide2[i2] < 0) {
                sub(partialXYZT2, XYZT.fromPartialXYZT(xyzt2, partialXYZT2), Ed25519Constants.B2[(-slide2[i2]) / 2]);
            }
            i2--;
        }
        return new XYZ(partialXYZT2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNonZeroVarTime(long[] in) {
        long[] jArr = new long[in.length + 1];
        System.arraycopy(in, 0, jArr, 0, in.length);
        Field25519.reduceCoefficients(jArr);
        for (byte b : Field25519.contract(jArr)) {
            if (b != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLsb(long[] in) {
        return Field25519.contract(in)[0] & 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void neg(long[] out, long[] in) {
        for (int i = 0; i < in.length; i++) {
            out[i] = -in[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void pow2252m3(long[] out, long[] in) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        Field25519.square(jArr, in);
        Field25519.square(jArr2, jArr);
        for (int i = 1; i < 2; i++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr2, in, jArr2);
        Field25519.mult(jArr, jArr, jArr2);
        Field25519.square(jArr, jArr);
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i2 = 1; i2 < 5; i2++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i3 = 1; i3 < 10; i3++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr2, jArr2, jArr);
        Field25519.square(jArr3, jArr2);
        for (int i4 = 1; i4 < 20; i4++) {
            Field25519.square(jArr3, jArr3);
        }
        Field25519.mult(jArr2, jArr3, jArr2);
        Field25519.square(jArr2, jArr2);
        for (int i5 = 1; i5 < 10; i5++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr2, jArr);
        for (int i6 = 1; i6 < 50; i6++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr2, jArr2, jArr);
        Field25519.square(jArr3, jArr2);
        for (int i7 = 1; i7 < 100; i7++) {
            Field25519.square(jArr3, jArr3);
        }
        Field25519.mult(jArr2, jArr3, jArr2);
        Field25519.square(jArr2, jArr2);
        for (int i8 = 1; i8 < 50; i8++) {
            Field25519.square(jArr2, jArr2);
        }
        Field25519.mult(jArr, jArr2, jArr);
        Field25519.square(jArr, jArr);
        for (int i9 = 1; i9 < 2; i9++) {
            Field25519.square(jArr, jArr);
        }
        Field25519.mult(out, jArr, in);
    }

    private static long load3(byte[] in, int idx) {
        return ((in[idx + 2] & 255) << 16) | (in[idx] & 255) | ((in[idx + 1] & 255) << 8);
    }

    private static long load4(byte[] in, int idx) {
        return ((in[idx + 3] & 255) << 24) | load3(in, idx);
    }

    private static void reduce(byte[] s) {
        long load3 = (load3(s, 47) >> 2) & 2097151;
        long load4 = (load4(s, 49) >> 7) & 2097151;
        long load42 = (load4(s, 52) >> 4) & 2097151;
        long load32 = (load3(s, 55) >> 1) & 2097151;
        long load43 = (load4(s, 57) >> 6) & 2097151;
        long load44 = load4(s, 60) >> 3;
        long load33 = (load3(s, 42) & 2097151) - (load44 * 683901);
        long load34 = ((load3(s, 26) >> 2) & 2097151) + (load43 * 666643);
        long load45 = ((load4(s, 28) >> 7) & 2097151) + (load44 * 666643) + (load43 * 470296);
        long load46 = ((load4(s, 31) >> 4) & 2097151) + (load44 * 470296) + (load43 * 654183);
        long load35 = (((load3(s, 34) >> 1) & 2097151) + (load44 * 654183)) - (load43 * 997805);
        long load36 = (((load3(s, 39) >> 3) & 2097151) + (load44 * 136657)) - (load43 * 683901);
        long load47 = ((load4(s, 23) >> 5) & 2097151) + (load32 * 666643);
        long load48 = ((((load4(s, 36) >> 6) & 2097151) - (load44 * 997805)) + (load43 * 136657)) - (load32 * 683901);
        long load37 = (load3(s, 21) & 2097151) + (load42 * 666643);
        long load38 = ((load3(s, 18) >> 3) & 2097151) + (load4 * 666643);
        long j = ((load46 - (load32 * 997805)) + (load42 * 136657)) - (load4 * 683901);
        long load49 = ((load4(s, 15) >> 6) & 2097151) + (load3 * 666643);
        long j2 = load38 + (load3 * 470296);
        long j3 = load37 + (load4 * 470296) + (load3 * 654183);
        long j4 = ((load47 + (load42 * 470296)) + (load4 * 654183)) - (load3 * 997805);
        long j5 = (((load34 + (load32 * 470296)) + (load42 * 654183)) - (load4 * 997805)) + (load3 * 136657);
        long j6 = (((load45 + (load32 * 654183)) - (load42 * 997805)) + (load4 * 136657)) - (load3 * 683901);
        long j7 = (load49 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j8 = j2 + j7;
        long j9 = load49 - (j7 << 21);
        long j10 = (j3 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j11 = j4 + j10;
        long j12 = j3 - (j10 << 21);
        long j13 = (j5 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j14 = j6 + j13;
        long j15 = j5 - (j13 << 21);
        long j16 = (j + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j17 = ((load35 + (load32 * 136657)) - (load42 * 683901)) + j16;
        long j18 = j - (j16 << 21);
        long j19 = (load48 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j20 = load36 + j19;
        long j21 = load48 - (j19 << 21);
        long j22 = (load33 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long load410 = ((load4(s, 44) >> 5) & 2097151) + j22;
        long j23 = load33 - (j22 << 21);
        long j24 = (j8 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j25 = j12 + j24;
        long j26 = j8 - (j24 << 21);
        long j27 = (j11 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j28 = j15 + j27;
        long j29 = j11 - (j27 << 21);
        long j30 = (j14 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j31 = j18 + j30;
        long j32 = j14 - (j30 << 21);
        long j33 = (j17 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j34 = j21 + j33;
        long j35 = j17 - (j33 << 21);
        long j36 = (j20 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j37 = j23 + j36;
        long j38 = j20 - (j36 << 21);
        long load39 = ((load3(s, 13) >> 1) & 2097151) + (load410 * 666643);
        long j39 = j28 - (load410 * 683901);
        long load411 = ((load4(s, 10) >> 4) & 2097151) + (j37 * 666643);
        long load412 = ((load4(s, 7) >> 7) & 2097151) + (j38 * 666643);
        long j40 = ((j25 - (load410 * 997805)) + (j37 * 136657)) - (j38 * 683901);
        long load310 = ((load3(s, 5) >> 2) & 2097151) + (j34 * 666643);
        long load413 = ((load4(s, 2) >> 5) & 2097151) + (j35 * 666643);
        long j41 = ((((j9 + (load410 * 470296)) + (j37 * 654183)) - (j38 * 997805)) + (j34 * 136657)) - (j35 * 683901);
        long load311 = (load3(s, 0) & 2097151) + (j31 * 666643);
        long j42 = load413 + (j31 * 470296);
        long j43 = load310 + (j35 * 470296) + (j31 * 654183);
        long j44 = ((load412 + (j34 * 470296)) + (j35 * 654183)) - (j31 * 997805);
        long j45 = (((load411 + (j38 * 470296)) + (j34 * 654183)) - (j35 * 997805)) + (j31 * 136657);
        long j46 = ((((load39 + (j37 * 470296)) + (j38 * 654183)) - (j34 * 997805)) + (j35 * 136657)) - (j31 * 683901);
        long j47 = (load311 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j48 = j42 + j47;
        long j49 = load311 - (j47 << 21);
        long j50 = (j43 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j51 = j44 + j50;
        long j52 = j43 - (j50 << 21);
        long j53 = (j45 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j54 = j46 + j53;
        long j55 = j45 - (j53 << 21);
        long j56 = (j41 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j57 = ((((j26 + (load410 * 654183)) - (j37 * 997805)) + (j38 * 136657)) - (j34 * 683901)) + j56;
        long j58 = j41 - (j56 << 21);
        long j59 = (j40 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j60 = ((j29 + (load410 * 136657)) - (j37 * 683901)) + j59;
        long j61 = j40 - (j59 << 21);
        long j62 = (j39 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j63 = j32 + j62;
        long j64 = j39 - (j62 << 21);
        long j65 = (j48 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j66 = j52 + j65;
        long j67 = j48 - (j65 << 21);
        long j68 = (j51 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j69 = j55 + j68;
        long j70 = j51 - (j68 << 21);
        long j71 = (j54 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j72 = j58 + j71;
        long j73 = j54 - (j71 << 21);
        long j74 = (j57 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j75 = j61 + j74;
        long j76 = j57 - (j74 << 21);
        long j77 = (j60 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j78 = j64 + j77;
        long j79 = j60 - (j77 << 21);
        long j80 = (j63 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j81 = j80 + 0;
        long j82 = j49 + (j81 * 666643);
        long j83 = j67 + (j81 * 470296);
        long j84 = j66 + (j81 * 654183);
        long j85 = j70 - (j81 * 997805);
        long j86 = j73 - (j81 * 683901);
        long j87 = j82 >> 21;
        long j88 = j83 + j87;
        long j89 = j82 - (j87 << 21);
        long j90 = j88 >> 21;
        long j91 = j84 + j90;
        long j92 = j88 - (j90 << 21);
        long j93 = j91 >> 21;
        long j94 = j85 + j93;
        long j95 = j91 - (j93 << 21);
        long j96 = j94 >> 21;
        long j97 = j69 + (j81 * 136657) + j96;
        long j98 = j94 - (j96 << 21);
        long j99 = j97 >> 21;
        long j100 = j86 + j99;
        long j101 = j97 - (j99 << 21);
        long j102 = j100 >> 21;
        long j103 = j72 + j102;
        long j104 = j100 - (j102 << 21);
        long j105 = j103 >> 21;
        long j106 = j76 + j105;
        long j107 = j103 - (j105 << 21);
        long j108 = j106 >> 21;
        long j109 = j75 + j108;
        long j110 = j106 - (j108 << 21);
        long j111 = j109 >> 21;
        long j112 = j79 + j111;
        long j113 = j109 - (j111 << 21);
        long j114 = j112 >> 21;
        long j115 = j78 + j114;
        long j116 = j112 - (j114 << 21);
        long j117 = j115 >> 21;
        long j118 = (j63 - (j80 << 21)) + j117;
        long j119 = j115 - (j117 << 21);
        long j120 = j118 >> 21;
        long j121 = j120 + 0;
        long j122 = j118 - (j120 << 21);
        long j123 = j89 + (666643 * j121);
        long j124 = j123 >> 21;
        long j125 = j92 + (470296 * j121) + j124;
        long j126 = j123 - (j124 << 21);
        long j127 = j125 >> 21;
        long j128 = j95 + (654183 * j121) + j127;
        long j129 = j125 - (j127 << 21);
        long j130 = j128 >> 21;
        long j131 = (j98 - (997805 * j121)) + j130;
        long j132 = j128 - (j130 << 21);
        long j133 = j131 >> 21;
        long j134 = j101 + (136657 * j121) + j133;
        long j135 = j131 - (j133 << 21);
        long j136 = j134 >> 21;
        long j137 = (j104 - (j121 * 683901)) + j136;
        long j138 = j134 - (j136 << 21);
        long j139 = j137 >> 21;
        long j140 = j107 + j139;
        long j141 = j137 - (j139 << 21);
        long j142 = j140 >> 21;
        long j143 = j110 + j142;
        long j144 = j140 - (j142 << 21);
        long j145 = j143 >> 21;
        long j146 = j113 + j145;
        long j147 = j143 - (j145 << 21);
        long j148 = j146 >> 21;
        long j149 = j116 + j148;
        long j150 = j146 - (j148 << 21);
        long j151 = j149 >> 21;
        long j152 = j119 + j151;
        long j153 = j149 - (j151 << 21);
        long j154 = j152 >> 21;
        long j155 = j122 + j154;
        long j156 = j152 - (j154 << 21);
        s[0] = (byte) j126;
        s[1] = (byte) (j126 >> 8);
        s[2] = (byte) ((j126 >> 16) | (j129 << 5));
        s[3] = (byte) (j129 >> 3);
        s[4] = (byte) (j129 >> 11);
        s[5] = (byte) ((j129 >> 19) | (j132 << 2));
        s[6] = (byte) (j132 >> 6);
        s[7] = (byte) ((j132 >> 14) | (j135 << 7));
        s[8] = (byte) (j135 >> 1);
        s[9] = (byte) (j135 >> 9);
        s[10] = (byte) ((j135 >> 17) | (j138 << 4));
        s[11] = (byte) (j138 >> 4);
        s[12] = (byte) (j138 >> 12);
        s[13] = (byte) ((j138 >> 20) | (j141 << 1));
        s[14] = (byte) (j141 >> 7);
        s[15] = (byte) ((j141 >> 15) | (j144 << 6));
        s[16] = (byte) (j144 >> 2);
        s[17] = (byte) (j144 >> 10);
        s[18] = (byte) ((j144 >> 18) | (j147 << 3));
        s[19] = (byte) (j147 >> 5);
        s[20] = (byte) (j147 >> 13);
        s[21] = (byte) j150;
        s[22] = (byte) (j150 >> 8);
        s[23] = (byte) ((j150 >> 16) | (j153 << 5));
        s[24] = (byte) (j153 >> 3);
        s[25] = (byte) (j153 >> 11);
        s[26] = (byte) ((j153 >> 19) | (j156 << 2));
        s[27] = (byte) (j156 >> 6);
        s[28] = (byte) ((j156 >> 14) | (j155 << 7));
        s[29] = (byte) (j155 >> 1);
        s[30] = (byte) (j155 >> 9);
        s[31] = (byte) (j155 >> 17);
    }

    private static void mulAdd(byte[] s, byte[] a, byte[] b, byte[] c) {
        long load3 = load3(a, 0) & 2097151;
        long load4 = (load4(a, 2) >> 5) & 2097151;
        long load32 = (load3(a, 5) >> 2) & 2097151;
        long load42 = (load4(a, 7) >> 7) & 2097151;
        long load43 = (load4(a, 10) >> 4) & 2097151;
        long load33 = (load3(a, 13) >> 1) & 2097151;
        long load44 = (load4(a, 15) >> 6) & 2097151;
        long load34 = (load3(a, 18) >> 3) & 2097151;
        long load35 = load3(a, 21) & 2097151;
        long load45 = (load4(a, 23) >> 5) & 2097151;
        long load36 = (load3(a, 26) >> 2) & 2097151;
        long load46 = load4(a, 28) >> 7;
        long load37 = load3(b, 0) & 2097151;
        long load47 = (load4(b, 2) >> 5) & 2097151;
        long load38 = (load3(b, 5) >> 2) & 2097151;
        long load48 = (load4(b, 7) >> 7) & 2097151;
        long load49 = (load4(b, 10) >> 4) & 2097151;
        long load39 = (load3(b, 13) >> 1) & 2097151;
        long load410 = (load4(b, 15) >> 6) & 2097151;
        long load310 = (load3(b, 18) >> 3) & 2097151;
        long load311 = load3(b, 21) & 2097151;
        long load411 = (load4(b, 23) >> 5) & 2097151;
        long load312 = (load3(b, 26) >> 2) & 2097151;
        long load412 = load4(b, 28) >> 7;
        long load313 = (load3(c, 26) >> 2) & 2097151;
        long load314 = (load3(c, 0) & 2097151) + (load3 * load37);
        long load413 = ((load4(c, 2) >> 5) & 2097151) + (load3 * load47) + (load4 * load37);
        long load315 = ((load3(c, 5) >> 2) & 2097151) + (load3 * load38) + (load4 * load47) + (load32 * load37);
        long load414 = ((load4(c, 7) >> 7) & 2097151) + (load3 * load48) + (load4 * load38) + (load32 * load47) + (load42 * load37);
        long load415 = ((load4(c, 10) >> 4) & 2097151) + (load3 * load49) + (load4 * load48) + (load32 * load38) + (load42 * load47) + (load43 * load37);
        long load316 = ((load3(c, 13) >> 1) & 2097151) + (load3 * load39) + (load4 * load49) + (load32 * load48) + (load42 * load38) + (load43 * load47) + (load33 * load37);
        long load416 = ((load4(c, 15) >> 6) & 2097151) + (load3 * load410) + (load4 * load39) + (load32 * load49) + (load42 * load48) + (load43 * load38) + (load33 * load47) + (load44 * load37);
        long load317 = ((load3(c, 18) >> 3) & 2097151) + (load3 * load310) + (load4 * load410) + (load32 * load39) + (load42 * load49) + (load43 * load48) + (load33 * load38) + (load44 * load47) + (load34 * load37);
        long load318 = (load3(c, 21) & 2097151) + (load3 * load311) + (load4 * load310) + (load32 * load410) + (load42 * load39) + (load43 * load49) + (load33 * load48) + (load44 * load38) + (load34 * load47) + (load35 * load37);
        long load417 = ((load4(c, 23) >> 5) & 2097151) + (load3 * load411) + (load4 * load311) + (load32 * load310) + (load42 * load410) + (load43 * load39) + (load33 * load49) + (load44 * load48) + (load34 * load38) + (load35 * load47) + (load45 * load37);
        long j = load313 + (load3 * load312) + (load4 * load411) + (load32 * load311) + (load42 * load310) + (load43 * load410) + (load33 * load39) + (load44 * load49) + (load34 * load48) + (load35 * load38) + (load45 * load47) + (load36 * load37);
        long j2 = (load4 * load412) + (load32 * load312) + (load42 * load411) + (load43 * load311) + (load33 * load310) + (load44 * load410) + (load34 * load39) + (load35 * load49) + (load45 * load48) + (load36 * load38) + (load47 * load46);
        long j3 = (load42 * load412) + (load43 * load312) + (load33 * load411) + (load44 * load311) + (load34 * load310) + (load35 * load410) + (load45 * load39) + (load36 * load49) + (load48 * load46);
        long j4 = (load33 * load412) + (load44 * load312) + (load34 * load411) + (load35 * load311) + (load45 * load310) + (load36 * load410) + (load39 * load46);
        long j5 = (load34 * load412) + (load35 * load312) + (load45 * load411) + (load36 * load311) + (load310 * load46);
        long j6 = (load45 * load412) + (load36 * load312) + (load411 * load46);
        long j7 = load46 * load412;
        long j8 = (load314 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j9 = load413 + j8;
        long j10 = load314 - (j8 << 21);
        long j11 = (load315 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j12 = load414 + j11;
        long j13 = load315 - (j11 << 21);
        long j14 = (load415 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j15 = load316 + j14;
        long j16 = load415 - (j14 << 21);
        long j17 = (load416 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j18 = load317 + j17;
        long j19 = load416 - (j17 << 21);
        long j20 = (load318 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j21 = load417 + j20;
        long j22 = load318 - (j20 << 21);
        long j23 = (j + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long load418 = (load4(c, 28) >> 7) + (load3 * load412) + (load4 * load312) + (load32 * load411) + (load42 * load311) + (load43 * load310) + (load33 * load410) + (load44 * load39) + (load34 * load49) + (load35 * load48) + (load45 * load38) + (load36 * load47) + (load37 * load46) + j23;
        long j24 = j - (j23 << 21);
        long j25 = (j2 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j26 = (load32 * load412) + (load42 * load312) + (load43 * load411) + (load33 * load311) + (load44 * load310) + (load34 * load410) + (load35 * load39) + (load45 * load49) + (load36 * load48) + (load38 * load46) + j25;
        long j27 = j2 - (j25 << 21);
        long j28 = (j3 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j29 = (load43 * load412) + (load33 * load312) + (load44 * load411) + (load34 * load311) + (load35 * load310) + (load45 * load410) + (load36 * load39) + (load49 * load46) + j28;
        long j30 = j3 - (j28 << 21);
        long j31 = (j4 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j32 = (load44 * load412) + (load34 * load312) + (load35 * load411) + (load45 * load311) + (load36 * load310) + (load410 * load46) + j31;
        long j33 = j4 - (j31 << 21);
        long j34 = (j5 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j35 = (load35 * load412) + (load45 * load312) + (load36 * load411) + (load311 * load46) + j34;
        long j36 = j5 - (j34 << 21);
        long j37 = (j6 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j38 = (load36 * load412) + (load312 * load46) + j37;
        long j39 = j6 - (j37 << 21);
        long j40 = (j7 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j41 = j40 + 0;
        long j42 = j7 - (j40 << 21);
        long j43 = (j9 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j44 = j13 + j43;
        long j45 = j9 - (j43 << 21);
        long j46 = (j12 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j47 = j16 + j46;
        long j48 = j12 - (j46 << 21);
        long j49 = (j15 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j50 = j19 + j49;
        long j51 = j15 - (j49 << 21);
        long j52 = (j18 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j53 = j22 + j52;
        long j54 = j18 - (j52 << 21);
        long j55 = (j21 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j56 = j24 + j55;
        long j57 = j21 - (j55 << 21);
        long j58 = (load418 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j59 = j27 + j58;
        long j60 = load418 - (j58 << 21);
        long j61 = (j26 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j62 = j30 + j61;
        long j63 = j26 - (j61 << 21);
        long j64 = (j29 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j65 = j33 + j64;
        long j66 = j29 - (j64 << 21);
        long j67 = (j32 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j68 = j36 + j67;
        long j69 = j32 - (j67 << 21);
        long j70 = (j35 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j71 = j39 + j70;
        long j72 = j35 - (j70 << 21);
        long j73 = (j38 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j74 = j42 + j73;
        long j75 = j38 - (j73 << 21);
        long j76 = j65 - (j41 * 683901);
        long j77 = ((j62 - (j41 * 997805)) + (j74 * 136657)) - (j75 * 683901);
        long j78 = ((((j59 + (j41 * 470296)) + (j74 * 654183)) - (j75 * 997805)) + (j71 * 136657)) - (j72 * 683901);
        long j79 = j50 + (j68 * 666643);
        long j80 = j54 + (j72 * 666643) + (j68 * 470296);
        long j81 = j53 + (j71 * 666643) + (j72 * 470296) + (j68 * 654183);
        long j82 = (((j57 + (j75 * 666643)) + (j71 * 470296)) + (j72 * 654183)) - (j68 * 997805);
        long j83 = ((((j56 + (j74 * 666643)) + (j75 * 470296)) + (j71 * 654183)) - (j72 * 997805)) + (j68 * 136657);
        long j84 = (((((j60 + (j41 * 666643)) + (j74 * 470296)) + (j75 * 654183)) - (j71 * 997805)) + (j72 * 136657)) - (j68 * 683901);
        long j85 = (j79 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j86 = j80 + j85;
        long j87 = j79 - (j85 << 21);
        long j88 = (j81 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j89 = j82 + j88;
        long j90 = j81 - (j88 << 21);
        long j91 = (j83 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j92 = j84 + j91;
        long j93 = j83 - (j91 << 21);
        long j94 = (j78 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j95 = ((((j63 + (j41 * 654183)) - (j74 * 997805)) + (j75 * 136657)) - (j71 * 683901)) + j94;
        long j96 = j78 - (j94 << 21);
        long j97 = (j77 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j98 = ((j66 + (j41 * 136657)) - (j74 * 683901)) + j97;
        long j99 = j77 - (j97 << 21);
        long j100 = (j76 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j101 = j69 + j100;
        long j102 = j76 - (j100 << 21);
        long j103 = (j86 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j104 = j90 + j103;
        long j105 = j86 - (j103 << 21);
        long j106 = (j89 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j107 = j93 + j106;
        long j108 = j89 - (j106 << 21);
        long j109 = (j92 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j110 = j96 + j109;
        long j111 = j92 - (j109 << 21);
        long j112 = (j95 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j113 = j99 + j112;
        long j114 = j95 - (j112 << 21);
        long j115 = (j98 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j116 = j102 + j115;
        long j117 = j98 - (j115 << 21);
        long j118 = j107 - (j101 * 683901);
        long j119 = ((j104 - (j101 * 997805)) + (j116 * 136657)) - (j117 * 683901);
        long j120 = ((((j87 + (j101 * 470296)) + (j116 * 654183)) - (j117 * 997805)) + (j113 * 136657)) - (j114 * 683901);
        long j121 = j10 + (j110 * 666643);
        long j122 = j45 + (j114 * 666643) + (j110 * 470296);
        long j123 = j44 + (j113 * 666643) + (j114 * 470296) + (j110 * 654183);
        long j124 = (((j48 + (j117 * 666643)) + (j113 * 470296)) + (j114 * 654183)) - (j110 * 997805);
        long j125 = ((((j47 + (j116 * 666643)) + (j117 * 470296)) + (j113 * 654183)) - (j114 * 997805)) + (j110 * 136657);
        long j126 = (((((j51 + (j101 * 666643)) + (j116 * 470296)) + (j117 * 654183)) - (j113 * 997805)) + (j114 * 136657)) - (j110 * 683901);
        long j127 = (j121 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j128 = j122 + j127;
        long j129 = j121 - (j127 << 21);
        long j130 = (j123 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j131 = j124 + j130;
        long j132 = j123 - (j130 << 21);
        long j133 = (j125 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j134 = j126 + j133;
        long j135 = j125 - (j133 << 21);
        long j136 = (j120 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j137 = ((((j105 + (j101 * 654183)) - (j116 * 997805)) + (j117 * 136657)) - (j113 * 683901)) + j136;
        long j138 = j120 - (j136 << 21);
        long j139 = (j119 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j140 = ((j108 + (j101 * 136657)) - (j116 * 683901)) + j139;
        long j141 = j119 - (j139 << 21);
        long j142 = (j118 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j143 = j111 + j142;
        long j144 = j118 - (j142 << 21);
        long j145 = (j128 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j146 = j132 + j145;
        long j147 = j128 - (j145 << 21);
        long j148 = (j131 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j149 = j135 + j148;
        long j150 = j131 - (j148 << 21);
        long j151 = (j134 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j152 = j138 + j151;
        long j153 = j134 - (j151 << 21);
        long j154 = (j137 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j155 = j141 + j154;
        long j156 = j137 - (j154 << 21);
        long j157 = (j140 + PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) >> 21;
        long j158 = j144 + j157;
        long j159 = j140 - (j157 << 21);
        long j160 = (PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j143) >> 21;
        long j161 = 0 + j160;
        long j162 = j129 + (j161 * 666643);
        long j163 = j147 + (j161 * 470296);
        long j164 = j146 + (j161 * 654183);
        long j165 = j150 - (j161 * 997805);
        long j166 = j153 - (j161 * 683901);
        long j167 = j162 >> 21;
        long j168 = j163 + j167;
        long j169 = j162 - (j167 << 21);
        long j170 = j168 >> 21;
        long j171 = j164 + j170;
        long j172 = j168 - (j170 << 21);
        long j173 = j171 >> 21;
        long j174 = j165 + j173;
        long j175 = j171 - (j173 << 21);
        long j176 = j174 >> 21;
        long j177 = j149 + (j161 * 136657) + j176;
        long j178 = j174 - (j176 << 21);
        long j179 = j177 >> 21;
        long j180 = j166 + j179;
        long j181 = j177 - (j179 << 21);
        long j182 = j180 >> 21;
        long j183 = j152 + j182;
        long j184 = j180 - (j182 << 21);
        long j185 = j183 >> 21;
        long j186 = j156 + j185;
        long j187 = j183 - (j185 << 21);
        long j188 = j186 >> 21;
        long j189 = j155 + j188;
        long j190 = j186 - (j188 << 21);
        long j191 = j189 >> 21;
        long j192 = j159 + j191;
        long j193 = j189 - (j191 << 21);
        long j194 = j192 >> 21;
        long j195 = j158 + j194;
        long j196 = j192 - (j194 << 21);
        long j197 = j195 >> 21;
        long j198 = (j143 - (j160 << 21)) + j197;
        long j199 = j195 - (j197 << 21);
        long j200 = j198 >> 21;
        long j201 = 0 + j200;
        long j202 = j198 - (j200 << 21);
        long j203 = j169 + (666643 * j201);
        long j204 = j203 >> 21;
        long j205 = j172 + (470296 * j201) + j204;
        long j206 = j203 - (j204 << 21);
        long j207 = j205 >> 21;
        long j208 = j175 + (654183 * j201) + j207;
        long j209 = j205 - (j207 << 21);
        long j210 = j208 >> 21;
        long j211 = (j178 - (997805 * j201)) + j210;
        long j212 = j208 - (j210 << 21);
        long j213 = j211 >> 21;
        long j214 = j181 + (136657 * j201) + j213;
        long j215 = j211 - (j213 << 21);
        long j216 = j214 >> 21;
        long j217 = (j184 - (j201 * 683901)) + j216;
        long j218 = j214 - (j216 << 21);
        long j219 = j217 >> 21;
        long j220 = j187 + j219;
        long j221 = j217 - (j219 << 21);
        long j222 = j220 >> 21;
        long j223 = j190 + j222;
        long j224 = j220 - (j222 << 21);
        long j225 = j223 >> 21;
        long j226 = j193 + j225;
        long j227 = j223 - (j225 << 21);
        long j228 = j226 >> 21;
        long j229 = j196 + j228;
        long j230 = j226 - (j228 << 21);
        long j231 = j229 >> 21;
        long j232 = j199 + j231;
        long j233 = j229 - (j231 << 21);
        long j234 = j232 >> 21;
        long j235 = j202 + j234;
        long j236 = j232 - (j234 << 21);
        s[0] = (byte) j206;
        s[1] = (byte) (j206 >> 8);
        s[2] = (byte) ((j206 >> 16) | (j209 << 5));
        s[3] = (byte) (j209 >> 3);
        s[4] = (byte) (j209 >> 11);
        s[5] = (byte) ((j209 >> 19) | (j212 << 2));
        s[6] = (byte) (j212 >> 6);
        s[7] = (byte) ((j212 >> 14) | (j215 << 7));
        s[8] = (byte) (j215 >> 1);
        s[9] = (byte) (j215 >> 9);
        s[10] = (byte) ((j215 >> 17) | (j218 << 4));
        s[11] = (byte) (j218 >> 4);
        s[12] = (byte) (j218 >> 12);
        s[13] = (byte) ((j218 >> 20) | (j221 << 1));
        s[14] = (byte) (j221 >> 7);
        s[15] = (byte) ((j221 >> 15) | (j224 << 6));
        s[16] = (byte) (j224 >> 2);
        s[17] = (byte) (j224 >> 10);
        s[18] = (byte) ((j224 >> 18) | (j227 << 3));
        s[19] = (byte) (j227 >> 5);
        s[20] = (byte) (j227 >> 13);
        s[21] = (byte) j230;
        s[22] = (byte) (j230 >> 8);
        s[23] = (byte) ((j230 >> 16) | (j233 << 5));
        s[24] = (byte) (j233 >> 3);
        s[25] = (byte) (j233 >> 11);
        s[26] = (byte) ((j233 >> 19) | (j236 << 2));
        s[27] = (byte) (j236 >> 6);
        s[28] = (byte) ((j236 >> 14) | (j235 << 7));
        s[29] = (byte) (j235 >> 1);
        s[30] = (byte) (j235 >> 9);
        s[31] = (byte) (j235 >> 17);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] getHashedScalar(final byte[] privateKey) throws GeneralSecurityException {
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(privateKey, 0, 32);
        byte[] digest = engineFactory.digest();
        digest[0] = (byte) (digest[0] & 248);
        digest[31] = (byte) (digest[31] & Byte.MAX_VALUE);
        digest[31] = (byte) (digest[31] | SignedBytes.MAX_POWER_OF_TWO);
        return digest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] sign(final byte[] message, final byte[] publicKey, final byte[] hashedPrivateKey) throws GeneralSecurityException {
        byte[] copyOfRange = Arrays.copyOfRange(message, 0, message.length);
        MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        engineFactory.update(hashedPrivateKey, 32, 32);
        engineFactory.update(copyOfRange);
        byte[] digest = engineFactory.digest();
        reduce(digest);
        byte[] copyOfRange2 = Arrays.copyOfRange(scalarMultWithBase(digest).toBytes(), 0, 32);
        engineFactory.reset();
        engineFactory.update(copyOfRange2);
        engineFactory.update(publicKey);
        engineFactory.update(copyOfRange);
        byte[] digest2 = engineFactory.digest();
        reduce(digest2);
        byte[] bArr = new byte[32];
        mulAdd(bArr, digest2, hashedPrivateKey, digest);
        return Bytes.concat(copyOfRange2, bArr);
    }

    private static boolean isSmallerThanGroupOrder(byte[] s) {
        for (int i = 31; i >= 0; i--) {
            int i2 = s[i] & 255;
            int i3 = GROUP_ORDER[i] & 255;
            if (i2 != i3) {
                return i2 < i3;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean verify(final byte[] message, final byte[] signature, final byte[] publicKey) throws GeneralSecurityException {
        if (signature.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(signature, 32, 64);
        if (isSmallerThanGroupOrder(copyOfRange)) {
            MessageDigest engineFactory = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
            engineFactory.update(signature, 0, 32);
            engineFactory.update(publicKey);
            engineFactory.update(message);
            byte[] digest = engineFactory.digest();
            reduce(digest);
            byte[] bytes = doubleScalarMultVarTime(digest, XYZT.fromBytesNegateVarTime(publicKey), copyOfRange).toBytes();
            for (int i = 0; i < 32; i++) {
                if (bytes[i] != signature[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private Ed25519() {
    }
}
