package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RC5Parameters;

/* loaded from: classes4.dex */
public class RC532Engine implements BlockCipher {
    private static final int P32 = -1209970333;
    private static final int Q32 = -1640531527;
    private boolean forEncryption;
    private int _noRounds = 12;
    private int[] _S = null;

    private int rotateLeft(int i, int i2) {
        int i3 = i2 & 31;
        return (i >>> (32 - i3)) | (i << i3);
    }

    private int rotateRight(int i, int i2) {
        int i3 = i2 & 31;
        return (i << (32 - i3)) | (i >>> i3);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-32";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof RC5Parameters) {
            RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
            this._noRounds = rC5Parameters.getRounds();
            setKey(rC5Parameters.getKey());
        } else if (cipherParameters instanceof KeyParameter) {
            setKey(((KeyParameter) cipherParameters).getKey());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC532 init - " + cipherParameters.getClass().getName());
        }
        this.forEncryption = z;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return this.forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
    }

    private void setKey(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr2[i2] = iArr2[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[(this._noRounds + 1) * 2];
        this._S = iArr3;
        iArr3[0] = P32;
        int i3 = 1;
        while (true) {
            iArr = this._S;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = iArr[i3 - 1] + Q32;
            i3++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length2; i8++) {
            int[] iArr4 = this._S;
            i5 = rotateLeft(iArr4[i4] + i5 + i6, 3);
            iArr4[i4] = i5;
            i6 = rotateLeft(iArr2[i7] + i5 + i6, i6 + i5);
            iArr2[i7] = i6;
            i4 = (i4 + 1) % this._S.length;
            i7 = (i7 + 1) % length;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int bytesToWord = bytesToWord(bArr, i) + this._S[0];
        int bytesToWord2 = bytesToWord(bArr, i + 4) + this._S[1];
        for (int i3 = 1; i3 <= this._noRounds; i3++) {
            int i4 = i3 * 2;
            bytesToWord = rotateLeft(bytesToWord ^ bytesToWord2, bytesToWord2) + this._S[i4];
            bytesToWord2 = rotateLeft(bytesToWord2 ^ bytesToWord, bytesToWord) + this._S[i4 + 1];
        }
        wordToBytes(bytesToWord, bArr2, i2);
        wordToBytes(bytesToWord2, bArr2, i2 + 4);
        return 8;
    }

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int bytesToWord = bytesToWord(bArr, i);
        int bytesToWord2 = bytesToWord(bArr, i + 4);
        for (int i3 = this._noRounds; i3 >= 1; i3--) {
            int i4 = i3 * 2;
            bytesToWord2 = rotateRight(bytesToWord2 - this._S[i4 + 1], bytesToWord) ^ bytesToWord;
            bytesToWord = rotateRight(bytesToWord - this._S[i4], bytesToWord2) ^ bytesToWord2;
        }
        wordToBytes(bytesToWord - this._S[0], bArr2, i2);
        wordToBytes(bytesToWord2 - this._S[1], bArr2, i2 + 4);
        return 8;
    }

    private int bytesToWord(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private void wordToBytes(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }
}
