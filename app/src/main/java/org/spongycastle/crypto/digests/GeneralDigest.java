package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Memoable;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public abstract class GeneralDigest implements ExtendedDigest, Memoable {
    private static final int BYTE_LENGTH = 64;
    private long byteCount;
    private final byte[] xBuf;
    private int xBufOff;

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    protected abstract void processBlock();

    protected abstract void processLength(long j);

    protected abstract void processWord(byte[] bArr, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneralDigest() {
        this.xBuf = new byte[4];
        this.xBufOff = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneralDigest(GeneralDigest generalDigest) {
        this.xBuf = new byte[4];
        copyIn(generalDigest);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GeneralDigest(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.xBuf = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.xBufOff = Pack.bigEndianToInt(bArr, 4);
        this.byteCount = Pack.bigEndianToLong(bArr, 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void copyIn(GeneralDigest generalDigest) {
        byte[] bArr = generalDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = generalDigest.xBufOff;
        this.byteCount = generalDigest.byteCount;
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.xBuf;
        int i = this.xBufOff;
        int i2 = i + 1;
        this.xBufOff = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount++;
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        while (this.xBufOff != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.xBuf.length) {
            processWord(bArr, i);
            byte[] bArr2 = this.xBuf;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.byteCount += bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public void finish() {
        long j = this.byteCount << 3;
        update(Byte.MIN_VALUE);
        while (this.xBufOff != 0) {
            update((byte) 0);
        }
        processLength(j);
        processBlock();
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this.byteCount = 0L;
        this.xBufOff = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 4);
        Pack.longToBigEndian(this.byteCount, bArr, 8);
    }
}
