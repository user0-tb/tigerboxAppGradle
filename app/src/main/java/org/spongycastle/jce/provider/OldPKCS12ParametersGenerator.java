package org.spongycastle.jce.provider;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* compiled from: BrokenPBE.java */
/* loaded from: classes4.dex */
class OldPKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;
    private int u;
    private int v;

    public OldPKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof MD5Digest) {
            this.u = 16;
            this.v = 64;
        } else if (digest instanceof SHA1Digest) {
            this.u = 20;
            this.v = 64;
        } else if (digest instanceof RIPEMD160Digest) {
            this.u = 20;
            this.v = 64;
        } else {
            throw new IllegalArgumentException("Digest " + digest.getAlgorithmName() + " unsupported");
        }
    }

    private void adjust(byte[] bArr, int i, byte[] bArr2) {
        int i2 = (bArr2[bArr2.length - 1] & 255) + (bArr[(bArr2.length + i) - 1] & 255) + 1;
        bArr[(bArr2.length + i) - 1] = (byte) i2;
        int i3 = i2 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i4 = i + length;
            int i5 = i3 + (bArr2[length] & 255) + (bArr[i4] & 255);
            bArr[i4] = (byte) i5;
            i3 = i5 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        int i3 = this.v;
        byte[] bArr3 = new byte[i3];
        byte[] bArr4 = new byte[i2];
        int i4 = 0;
        for (int i5 = 0; i5 != i3; i5++) {
            bArr3[i5] = (byte) i;
        }
        if (this.salt == null || this.salt.length == 0) {
            bArr = new byte[0];
        } else {
            int i6 = this.v;
            int length = this.salt.length;
            int i7 = this.v;
            int i8 = i6 * (((length + i7) - 1) / i7);
            bArr = new byte[i8];
            for (int i9 = 0; i9 != i8; i9++) {
                bArr[i9] = this.salt[i9 % this.salt.length];
            }
        }
        if (this.password == null || this.password.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i10 = this.v;
            int length2 = this.password.length;
            int i11 = this.v;
            int i12 = i10 * (((length2 + i11) - 1) / i11);
            bArr2 = new byte[i12];
            for (int i13 = 0; i13 != i12; i13++) {
                bArr2[i13] = this.password[i13 % this.password.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr5 = new byte[length3];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        int i14 = this.v;
        byte[] bArr6 = new byte[i14];
        int i15 = this.u;
        int i16 = ((i2 + i15) - 1) / i15;
        int i17 = 1;
        while (i17 <= i16) {
            int i18 = this.u;
            byte[] bArr7 = new byte[i18];
            this.digest.update(bArr3, i4, i3);
            this.digest.update(bArr5, i4, length3);
            this.digest.doFinal(bArr7, i4);
            for (int i19 = 1; i19 != this.iterationCount; i19++) {
                this.digest.update(bArr7, i4, i18);
                this.digest.doFinal(bArr7, i4);
            }
            for (int i20 = 0; i20 != i14; i20++) {
                bArr6[i17] = bArr7[i20 % i18];
            }
            int i21 = 0;
            while (true) {
                int i22 = this.v;
                if (i21 == length3 / i22) {
                    break;
                }
                adjust(bArr5, i22 * i21, bArr6);
                i21++;
            }
            if (i17 == i16) {
                int i23 = i17 - 1;
                int i24 = this.u;
                System.arraycopy(bArr7, 0, bArr4, i23 * i24, i2 - (i23 * i24));
            } else {
                System.arraycopy(bArr7, 0, bArr4, (i17 - 1) * this.u, i18);
            }
            i17++;
            i4 = 0;
        }
        return bArr4;
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(generateDerivedKey(1, i2), 0, i2);
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i3);
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i3), generateDerivedKey(2, i4), 0, i4);
    }

    @Override // org.spongycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i) {
        int i2 = i / 8;
        return new KeyParameter(generateDerivedKey(3, i2), 0, i2);
    }
}
