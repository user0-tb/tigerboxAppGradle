package org.spongycastle.crypto.engines;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class CramerShoupCiphertext {
    BigInteger e;
    BigInteger u1;
    BigInteger u2;
    BigInteger v;

    public CramerShoupCiphertext() {
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.u1 = bigInteger;
        this.u2 = bigInteger2;
        this.e = bigInteger3;
        this.v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int byteArrayToInt = byteArrayToInt(bArr2);
        byte[] bArr3 = new byte[byteArrayToInt];
        System.arraycopy(bArr, 4, bArr3, 0, byteArrayToInt);
        int i = byteArrayToInt + 4;
        this.u1 = new BigInteger(bArr3);
        System.arraycopy(bArr, i, bArr2, 0, 4);
        int byteArrayToInt2 = byteArrayToInt(bArr2);
        byte[] bArr4 = new byte[byteArrayToInt2];
        int i2 = i + 4;
        System.arraycopy(bArr, i2, bArr4, 0, byteArrayToInt2);
        int i3 = i2 + byteArrayToInt2;
        this.u2 = new BigInteger(bArr4);
        System.arraycopy(bArr, i3, bArr2, 0, 4);
        int byteArrayToInt3 = byteArrayToInt(bArr2);
        byte[] bArr5 = new byte[byteArrayToInt3];
        int i4 = i3 + 4;
        System.arraycopy(bArr, i4, bArr5, 0, byteArrayToInt3);
        int i5 = i4 + byteArrayToInt3;
        this.e = new BigInteger(bArr5);
        System.arraycopy(bArr, i5, bArr2, 0, 4);
        int byteArrayToInt4 = byteArrayToInt(bArr2);
        byte[] bArr6 = new byte[byteArrayToInt4];
        System.arraycopy(bArr, i5 + 4, bArr6, 0, byteArrayToInt4);
        this.v = new BigInteger(bArr6);
    }

    public BigInteger getU1() {
        return this.u1;
    }

    public void setU1(BigInteger bigInteger) {
        this.u1 = bigInteger;
    }

    public BigInteger getU2() {
        return this.u2;
    }

    public void setU2(BigInteger bigInteger) {
        this.u2 = bigInteger;
    }

    public BigInteger getE() {
        return this.e;
    }

    public void setE(BigInteger bigInteger) {
        this.e = bigInteger;
    }

    public BigInteger getV() {
        return this.v;
    }

    public void setV(BigInteger bigInteger) {
        this.v = bigInteger;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.u1.toString());
        stringBuffer.append("\nu2: " + this.u2.toString());
        stringBuffer.append("\ne: " + this.e.toString());
        stringBuffer.append("\nv: " + this.v.toString());
        return stringBuffer.toString();
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        System.arraycopy(intToByteArray(length), 0, bArr, 0, 4);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        int i = length + 4;
        System.arraycopy(intToByteArray(length2), 0, bArr, i, 4);
        int i2 = i + 4;
        System.arraycopy(byteArray2, 0, bArr, i2, length2);
        int i3 = i2 + length2;
        System.arraycopy(intToByteArray(length3), 0, bArr, i3, 4);
        int i4 = i3 + 4;
        System.arraycopy(byteArray3, 0, bArr, i4, length3);
        int i5 = i4 + length3;
        System.arraycopy(intToByteArray(length4), 0, bArr, i5, 4);
        System.arraycopy(byteArray4, 0, bArr, i5 + 4, length4);
        return bArr;
    }

    private byte[] intToByteArray(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[3 - i2] = (byte) (i >>> (i2 * 8));
        }
        return bArr;
    }

    private int byteArrayToInt(byte[] bArr) {
        if (bArr.length != 4) {
            return -1;
        }
        int i = 0;
        for (int i2 = 3; i2 >= 0; i2--) {
            i += bArr[i2] << ((3 - i2) * 8);
        }
        return i;
    }
}
