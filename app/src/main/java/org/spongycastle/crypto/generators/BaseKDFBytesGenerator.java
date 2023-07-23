package org.spongycastle.crypto.generators;

import androidx.core.view.InputDeviceCompat;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.DigestDerivationFunction;
import org.spongycastle.crypto.params.ISO18033KDFParameters;
import org.spongycastle.crypto.params.KDFParameters;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class BaseKDFBytesGenerator implements DigestDerivationFunction {
    private int counterStart;
    private Digest digest;
    private byte[] iv;
    private byte[] shared;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseKDFBytesGenerator(int i, Digest digest) {
        this.counterStart = i;
        this.digest = digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFParameters) {
            KDFParameters kDFParameters = (KDFParameters) derivationParameters;
            this.shared = kDFParameters.getSharedSecret();
            this.iv = kDFParameters.getIV();
        } else if (derivationParameters instanceof ISO18033KDFParameters) {
            this.shared = ((ISO18033KDFParameters) derivationParameters).getSeed();
            this.iv = null;
        } else {
            throw new IllegalArgumentException("KDF parameters required for KDF2Generator");
        }
    }

    @Override // org.spongycastle.crypto.DigestDerivationFunction
    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 < i4) {
            throw new DataLengthException("output buffer too small");
        }
        long j = i3;
        int digestSize = this.digest.getDigestSize();
        if (j > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j2 = digestSize;
        int i5 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        byte[] bArr3 = new byte[4];
        Pack.intToBigEndian(this.counterStart, bArr3, 0);
        int i6 = this.counterStart & InputDeviceCompat.SOURCE_ANY;
        for (int i7 = 0; i7 < i5; i7++) {
            Digest digest = this.digest;
            byte[] bArr4 = this.shared;
            digest.update(bArr4, 0, bArr4.length);
            this.digest.update(bArr3, 0, 4);
            byte[] bArr5 = this.iv;
            if (bArr5 != null) {
                this.digest.update(bArr5, 0, bArr5.length);
            }
            this.digest.doFinal(bArr2, 0);
            if (i3 > digestSize) {
                System.arraycopy(bArr2, 0, bArr, i4, digestSize);
                i4 += digestSize;
                i3 -= digestSize;
            } else {
                System.arraycopy(bArr2, 0, bArr, i4, i3);
            }
            byte b = (byte) (bArr3[3] + 1);
            bArr3[3] = b;
            if (b == 0) {
                i6 += 256;
                Pack.intToBigEndian(i6, bArr3, 0);
            }
        }
        this.digest.reset();
        return (int) j;
    }
}
