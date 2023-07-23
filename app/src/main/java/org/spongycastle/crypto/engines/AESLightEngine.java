package org.spongycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.reflect.Array;
import okio.Utf8;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes4.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, 49, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, Ascii.DC2, Byte.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, Ascii.SUB, Ascii.ESC, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88, 81, -93, SignedBytes.MAX_POWER_OF_TWO, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, 16, -1, -13, -46, -51, Ascii.FF, 19, -20, 95, -105, 68, Ascii.ETB, -60, -89, 126, 61, 100, 93, Ascii.EM, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, Ascii.VT, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, Ascii.FS, -90, -76, -58, -24, -35, 116, Ascii.US, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, Ascii.SO, 97, 53, 87, -71, -122, -63, Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, Ascii.CR, -65, -26, 66, 104, 65, -103, 45, Ascii.SI, -80, 84, -69, Ascii.SYN};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, SignedBytes.MAX_POWER_OF_TWO, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, Ascii.VT, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, Ascii.SYN, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, Ascii.NAK, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, Ascii.RS, -113, -54, Utf8.REPLACEMENT_BYTE, Ascii.SI, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, Ascii.FS, 117, -33, 110, 71, -15, Ascii.SUB, 113, Ascii.GS, 41, -59, -119, 111, -73, 98, Ascii.SO, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, Ascii.US, -35, -88, 51, -120, 7, -57, 49, -79, Ascii.DC2, 16, 89, 39, Byte.MIN_VALUE, -20, 95, 96, 81, Byte.MAX_VALUE, -87, Ascii.EM, -75, 74, Ascii.CR, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, -42, 38, -31, 105, Ascii.DC4, 99, 85, 33, Ascii.FF, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, 47, 94, 188, 99, 198, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, 250, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};

    private static int FFmulX(int i) {
        return (((i & m1) >>> 7) * 27) ^ ((m2 & i) << 1);
    }

    private static int shift(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    private static int mcol(int i) {
        int FFmulX = FFmulX(i);
        return shift(i, 24) ^ ((FFmulX ^ shift(i ^ FFmulX, 8)) ^ shift(i, 16));
    }

    private static int inv_mcol(int i) {
        int FFmulX = FFmulX(i);
        int FFmulX2 = FFmulX(FFmulX);
        int FFmulX3 = FFmulX(FFmulX2);
        int i2 = i ^ FFmulX3;
        int shift = shift(FFmulX ^ i2, 8);
        return shift(i2, 24) ^ ((shift ^ (FFmulX3 ^ (FFmulX ^ FFmulX2))) ^ shift(FFmulX2 ^ i2, 16));
    }

    private static int subWord(int i) {
        byte[] bArr = S;
        return (bArr[(i >> 24) & 255] << Ascii.CAN) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int length = bArr.length / 4;
        if ((length != 4 && length != 6 && length != 8) || length * 4 != bArr.length) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length + 6;
        this.ROUNDS = i;
        int[][] iArr = (int[][]) Array.newInstance(int.class, i + 1, 4);
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            iArr[i3 >> 2][i3 & 3] = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | (bArr[i2 + 3] << Ascii.CAN);
            i2 += 4;
            i3++;
        }
        int i4 = (this.ROUNDS + 1) << 2;
        for (int i5 = length; i5 < i4; i5++) {
            int i6 = i5 - 1;
            int i7 = iArr[i6 >> 2][i6 & 3];
            int i8 = i5 % length;
            if (i8 == 0) {
                i7 = subWord(shift(i7, 8)) ^ rcon[(i5 / length) - 1];
            } else if (length > 6 && i8 == 4) {
                i7 = subWord(i7);
            }
            int i9 = i5 - length;
            iArr[i5 >> 2][i5 & 3] = i7 ^ iArr[i9 >> 2][i9 & 3];
        }
        if (!z) {
            for (int i10 = 1; i10 < this.ROUNDS; i10++) {
                for (int i11 = 0; i11 < 4; i11++) {
                    iArr[i10][i11] = inv_mcol(iArr[i10][i11]);
                }
            }
        }
        return iArr;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
            this.forEncryption = z;
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            unpackBlock(bArr, i);
            encryptBlock(this.WorkingKey);
            packBlock(bArr2, i2);
            return 16;
        }
        unpackBlock(bArr, i);
        decryptBlock(this.WorkingKey);
        packBlock(bArr2, i2);
        return 16;
    }

    private void unpackBlock(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.C0 = i3;
        int i4 = i2 + 1;
        int i5 = i3 | ((bArr[i2] & 255) << 8);
        this.C0 = i5;
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.C0 = i7;
        int i8 = i6 + 1;
        this.C0 = i7 | (bArr[i6] << Ascii.CAN);
        int i9 = i8 + 1;
        int i10 = bArr[i8] & 255;
        this.C1 = i10;
        int i11 = i9 + 1;
        int i12 = ((bArr[i9] & 255) << 8) | i10;
        this.C1 = i12;
        int i13 = i11 + 1;
        int i14 = i12 | ((bArr[i11] & 255) << 16);
        this.C1 = i14;
        int i15 = i13 + 1;
        this.C1 = i14 | (bArr[i13] << Ascii.CAN);
        int i16 = i15 + 1;
        int i17 = bArr[i15] & 255;
        this.C2 = i17;
        int i18 = i16 + 1;
        int i19 = ((bArr[i16] & 255) << 8) | i17;
        this.C2 = i19;
        int i20 = i18 + 1;
        int i21 = i19 | ((bArr[i18] & 255) << 16);
        this.C2 = i21;
        int i22 = i20 + 1;
        this.C2 = i21 | (bArr[i20] << Ascii.CAN);
        int i23 = i22 + 1;
        int i24 = bArr[i22] & 255;
        this.C3 = i24;
        int i25 = i23 + 1;
        int i26 = ((bArr[i23] & 255) << 8) | i24;
        this.C3 = i26;
        int i27 = i26 | ((bArr[i25] & 255) << 16);
        this.C3 = i27;
        this.C3 = (bArr[i25 + 1] << Ascii.CAN) | i27;
    }

    private void packBlock(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = this.C0;
        bArr[i] = (byte) i3;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i3 >> 24);
        int i7 = i6 + 1;
        int i8 = this.C1;
        bArr[i6] = (byte) i8;
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i8 >> 24);
        int i12 = i11 + 1;
        int i13 = this.C2;
        bArr[i11] = (byte) i13;
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i13 >> 16);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (i13 >> 24);
        int i17 = i16 + 1;
        int i18 = this.C3;
        bArr[i16] = (byte) i18;
        int i19 = i17 + 1;
        bArr[i17] = (byte) (i18 >> 8);
        bArr[i19] = (byte) (i18 >> 16);
        bArr[i19 + 1] = (byte) (i18 >> 24);
    }

    private void encryptBlock(int[][] iArr) {
        int i = this.C0 ^ iArr[0][0];
        int i2 = this.C1 ^ iArr[0][1];
        int i3 = this.C2 ^ iArr[0][2];
        int i4 = this.C3 ^ iArr[0][3];
        int i5 = 1;
        while (i5 < this.ROUNDS - 1) {
            byte[] bArr = S;
            int mcol = mcol((((bArr[i & 255] & 255) ^ ((bArr[(i2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr[(i4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][0];
            int mcol2 = mcol((((bArr[i2 & 255] & 255) ^ ((bArr[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr[(i >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][1];
            int mcol3 = mcol((((bArr[i3 & 255] & 255) ^ ((bArr[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i >> 16) & 255] & 255) << 16)) ^ (bArr[(i2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][2];
            int i6 = i5 + 1;
            int mcol4 = mcol(((((bArr[(i >> 8) & 255] & 255) << 8) ^ (bArr[i4 & 255] & 255)) ^ ((bArr[(i2 >> 16) & 255] & 255) << 16)) ^ (bArr[(i3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][3];
            int mcol5 = mcol((((bArr[mcol & 255] & 255) ^ ((bArr[(mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][0];
            int mcol6 = mcol((((bArr[mcol2 & 255] & 255) ^ ((bArr[(mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][1];
            int i7 = i6 + 1;
            int mcol7 = mcol((((bArr[mcol4 & 255] & 255) ^ ((bArr[(mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][3];
            i2 = mcol6;
            i4 = mcol7;
            i = mcol5;
            i3 = mcol((((bArr[mcol3 & 255] & 255) ^ ((bArr[(mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(mcol >> 16) & 255] & 255) << 16)) ^ (bArr[(mcol2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][2];
            i5 = i7;
        }
        byte[] bArr2 = S;
        int mcol8 = mcol((((bArr2[i & 255] & 255) ^ ((bArr2[(i2 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][0];
        int mcol9 = mcol((((bArr2[i2 & 255] & 255) ^ ((bArr2[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i4 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][1];
        int mcol10 = mcol((((bArr2[i3 & 255] & 255) ^ ((bArr2[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i >> 16) & 255] & 255) << 16)) ^ (bArr2[(i2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][2];
        int i8 = i5 + 1;
        int mcol11 = mcol(((((bArr2[(i >> 8) & 255] & 255) << 8) ^ (bArr2[i4 & 255] & 255)) ^ ((bArr2[(i2 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i5][3];
        this.C0 = iArr[i8][0] ^ ((((bArr2[mcol8 & 255] & 255) ^ ((bArr2[(mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol11 >> 24) & 255] << Ascii.CAN));
        this.C1 = ((((bArr2[mcol9 & 255] & 255) ^ ((bArr2[(mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol8 >> 24) & 255] << Ascii.CAN)) ^ iArr[i8][1];
        this.C2 = ((((bArr2[mcol10 & 255] & 255) ^ ((bArr2[(mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol8 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol9 >> 24) & 255] << Ascii.CAN)) ^ iArr[i8][2];
        this.C3 = iArr[i8][3] ^ ((((bArr2[mcol11 & 255] & 255) ^ ((bArr2[(mcol8 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(mcol10 >> 24) & 255] << Ascii.CAN));
    }

    private void decryptBlock(int[][] iArr) {
        int i = this.C0;
        int i2 = this.ROUNDS;
        int i3 = i ^ iArr[i2][0];
        int i4 = this.C1 ^ iArr[i2][1];
        int i5 = this.C2 ^ iArr[i2][2];
        int i6 = i2 - 1;
        int i7 = iArr[i2][3] ^ this.C3;
        while (i6 > 1) {
            byte[] bArr = Si;
            int inv_mcol = inv_mcol((((bArr[i3 & 255] & 255) ^ ((bArr[(i7 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr[(i4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][0];
            int inv_mcol2 = inv_mcol((((bArr[i4 & 255] & 255) ^ ((bArr[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i7 >> 16) & 255] & 255) << 16)) ^ (bArr[(i5 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][1];
            int inv_mcol3 = inv_mcol((((bArr[i5 & 255] & 255) ^ ((bArr[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr[(i7 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][2];
            int i8 = i6 - 1;
            int inv_mcol4 = inv_mcol((bArr[(i3 >> 24) & 255] << Ascii.CAN) ^ (((bArr[i7 & 255] & 255) ^ ((bArr[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i4 >> 16) & 255] & 255) << 16))) ^ iArr[i6][3];
            int inv_mcol5 = inv_mcol((((bArr[inv_mcol & 255] & 255) ^ ((bArr[(inv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol2 >> 24) & 255] << Ascii.CAN)) ^ iArr[i8][0];
            int inv_mcol6 = inv_mcol((((bArr[inv_mcol2 & 255] & 255) ^ ((bArr[(inv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol3 >> 24) & 255] << Ascii.CAN)) ^ iArr[i8][1];
            int inv_mcol7 = inv_mcol((((bArr[inv_mcol4 & 255] & 255) ^ ((bArr[(inv_mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol >> 24) & 255] << Ascii.CAN));
            int i9 = i8 - 1;
            i7 = iArr[i8][3] ^ inv_mcol7;
            i3 = inv_mcol5;
            i4 = inv_mcol6;
            i5 = inv_mcol((((bArr[inv_mcol3 & 255] & 255) ^ ((bArr[(inv_mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(inv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr[(inv_mcol4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i8][2];
            i6 = i9;
        }
        byte[] bArr2 = Si;
        int inv_mcol8 = inv_mcol((((bArr2[i3 & 255] & 255) ^ ((bArr2[(i7 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i5 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i4 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][0];
        int inv_mcol9 = inv_mcol((((bArr2[i4 & 255] & 255) ^ ((bArr2[(i3 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i7 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i5 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][1];
        int inv_mcol10 = inv_mcol((((bArr2[i5 & 255] & 255) ^ ((bArr2[(i4 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i3 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i7 >> 24) & 255] << Ascii.CAN)) ^ iArr[i6][2];
        int inv_mcol11 = inv_mcol((bArr2[(i3 >> 24) & 255] << Ascii.CAN) ^ (((bArr2[i7 & 255] & 255) ^ ((bArr2[(i5 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i4 >> 16) & 255] & 255) << 16))) ^ iArr[i6][3];
        this.C0 = ((((bArr2[inv_mcol8 & 255] & 255) ^ ((bArr2[(inv_mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(inv_mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(inv_mcol9 >> 24) & 255] << Ascii.CAN)) ^ iArr[0][0];
        this.C1 = ((((bArr2[inv_mcol9 & 255] & 255) ^ ((bArr2[(inv_mcol8 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(inv_mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(inv_mcol10 >> 24) & 255] << Ascii.CAN)) ^ iArr[0][1];
        this.C2 = ((((bArr2[inv_mcol10 & 255] & 255) ^ ((bArr2[(inv_mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(inv_mcol8 >> 16) & 255] & 255) << 16)) ^ (bArr2[(inv_mcol11 >> 24) & 255] << Ascii.CAN)) ^ iArr[0][2];
        this.C3 = iArr[0][3] ^ ((((bArr2[inv_mcol11 & 255] & 255) ^ ((bArr2[(inv_mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(inv_mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(inv_mcol8 >> 24) & 255] << Ascii.CAN));
    }
}
