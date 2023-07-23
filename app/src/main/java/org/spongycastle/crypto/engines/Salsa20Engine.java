package org.spongycastle.crypto.engines;

import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.MaxBytesExceededException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.SkippingStreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;
    protected int[] x;

    /* JADX INFO: Access modifiers changed from: protected */
    public static int rotl(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    protected int getNonceSize() {
        return 8;
    }

    public Salsa20Engine() {
        this(20);
    }

    public Salsa20Engine(int i) {
        this.index = 0;
        this.engineState = new int[16];
        this.x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            setKey(null, iv);
        } else if (parameters instanceof KeyParameter) {
            setKey(((KeyParameter) parameters).getKey(), iv);
        } else {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
        }
        reset();
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds != 20) {
            return "Salsa20" + DownloadsManager.FOLDERS_SEPARATOR + this.rounds;
        }
        return "Salsa20";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.keyStream;
        int i = this.index;
        byte b2 = (byte) (b ^ bArr[i]);
        int i2 = (i + 1) & 63;
        this.index = i2;
        if (i2 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b2;
    }

    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void retreatCounter() {
        int[] iArr = this.engineState;
        if (iArr[8] == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i = iArr[8] - 1;
        iArr[8] = i;
        if (i == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        } else if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else {
            if (i3 + i2 > bArr2.length) {
                throw new OutputLengthException("output buffer too short");
            }
            if (limitExceeded(i2)) {
                throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
            }
            for (int i4 = 0; i4 < i2; i4++) {
                byte[] bArr3 = this.keyStream;
                int i5 = this.index;
                bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
                int i6 = (i5 + 1) & 63;
                this.index = i6;
                if (i6 == 0) {
                    advanceCounter();
                    generateKeyStream(this.keyStream);
                }
            }
            return i2;
        }
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long skip(long j) {
        long j2 = 0;
        if (j >= 0) {
            while (j2 < j) {
                int i = (this.index + 1) & 63;
                this.index = i;
                if (i == 0) {
                    advanceCounter();
                }
                j2++;
            }
        } else {
            while (j2 > j) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
                j2--;
            }
        }
        generateKeyStream(this.keyStream);
        return j;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long seekTo(long j) {
        reset();
        return skip(j);
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + this.index;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    protected long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[9] << 32) | (iArr[8] & 4294967295L);
    }

    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr != null) {
            int i = 16;
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            this.engineState[1] = Pack.littleEndianToInt(bArr, 0);
            this.engineState[2] = Pack.littleEndianToInt(bArr, 4);
            this.engineState[3] = Pack.littleEndianToInt(bArr, 8);
            this.engineState[4] = Pack.littleEndianToInt(bArr, 12);
            if (bArr.length == 32) {
                bArr3 = sigma;
            } else {
                bArr3 = tau;
                i = 0;
            }
            this.engineState[11] = Pack.littleEndianToInt(bArr, i);
            this.engineState[12] = Pack.littleEndianToInt(bArr, i + 4);
            this.engineState[13] = Pack.littleEndianToInt(bArr, i + 8);
            this.engineState[14] = Pack.littleEndianToInt(bArr, i + 12);
            this.engineState[0] = Pack.littleEndianToInt(bArr3, 0);
            this.engineState[5] = Pack.littleEndianToInt(bArr3, 4);
            this.engineState[10] = Pack.littleEndianToInt(bArr3, 8);
            this.engineState[15] = Pack.littleEndianToInt(bArr3, 12);
        }
        this.engineState[6] = Pack.littleEndianToInt(bArr2, 0);
        this.engineState[7] = Pack.littleEndianToInt(bArr2, 4);
    }

    protected void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.x);
        Pack.intToLittleEndian(this.x, bArr, 0);
    }

    public static void salsaCore(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = 7;
        int i10 = iArr[7];
        int i11 = iArr[8];
        int i12 = 9;
        int i13 = iArr[9];
        int i14 = iArr[10];
        int i15 = iArr[11];
        int i16 = iArr[12];
        int i17 = 13;
        int i18 = iArr[13];
        int i19 = iArr[14];
        int i20 = iArr[15];
        int i21 = i19;
        int i22 = i18;
        int i23 = i16;
        int i24 = i15;
        int i25 = i14;
        int i26 = i13;
        int i27 = i11;
        int i28 = i10;
        int i29 = i8;
        int i30 = i7;
        int i31 = i6;
        int i32 = i5;
        int i33 = i4;
        int i34 = i3;
        int i35 = i2;
        int i36 = i;
        while (i36 > 0) {
            int rotl = rotl(i35 + i23, i9) ^ i31;
            int rotl2 = i27 ^ rotl(rotl + i35, i12);
            int rotl3 = i23 ^ rotl(rotl2 + rotl, i17);
            int rotl4 = rotl(rotl3 + rotl2, 18) ^ i35;
            int rotl5 = i26 ^ rotl(i30 + i34, i9);
            int rotl6 = i22 ^ rotl(rotl5 + i30, i12);
            int rotl7 = i34 ^ rotl(rotl6 + rotl5, i17);
            int rotl8 = rotl(rotl7 + rotl6, 18) ^ i30;
            int rotl9 = i21 ^ rotl(i25 + i29, 7);
            int rotl10 = i33 ^ rotl(rotl9 + i25, 9);
            int rotl11 = i29 ^ rotl(rotl10 + rotl9, 13);
            int rotl12 = i25 ^ rotl(rotl11 + rotl10, 18);
            int rotl13 = i32 ^ rotl(i20 + i24, 7);
            int rotl14 = i28 ^ rotl(rotl13 + i20, 9);
            int i37 = i36;
            int rotl15 = i24 ^ rotl(rotl14 + rotl13, 13);
            int rotl16 = i20 ^ rotl(rotl15 + rotl14, 18);
            i34 = rotl7 ^ rotl(rotl4 + rotl13, 7);
            i33 = rotl10 ^ rotl(i34 + rotl4, 9);
            int rotl17 = rotl13 ^ rotl(i33 + i34, 13);
            int rotl18 = rotl4 ^ rotl(rotl17 + i33, 18);
            i29 = rotl11 ^ rotl(rotl8 + rotl, 7);
            i28 = rotl14 ^ rotl(i29 + rotl8, 9);
            int rotl19 = rotl(i28 + i29, 13) ^ rotl;
            i30 = rotl8 ^ rotl(rotl19 + i28, 18);
            i24 = rotl15 ^ rotl(rotl12 + rotl5, 7);
            int rotl20 = rotl(i24 + rotl12, 9) ^ rotl2;
            i26 = rotl5 ^ rotl(rotl20 + i24, 13);
            i25 = rotl12 ^ rotl(i26 + rotl20, 18);
            i23 = rotl3 ^ rotl(rotl16 + rotl9, 7);
            i22 = rotl6 ^ rotl(i23 + rotl16, 9);
            i21 = rotl9 ^ rotl(i22 + i23, 13);
            i20 = rotl16 ^ rotl(i21 + i22, 18);
            i32 = rotl17;
            i27 = rotl20;
            i35 = rotl18;
            i31 = rotl19;
            i17 = 13;
            i12 = 9;
            i9 = 7;
            i36 = i37 - 2;
        }
        iArr2[0] = i35 + iArr[0];
        iArr2[1] = i34 + iArr[1];
        iArr2[2] = i33 + iArr[2];
        iArr2[3] = i32 + iArr[3];
        iArr2[4] = i31 + iArr[4];
        iArr2[5] = i30 + iArr[5];
        iArr2[6] = i29 + iArr[6];
        iArr2[7] = i28 + iArr[7];
        iArr2[8] = i27 + iArr[8];
        iArr2[9] = i26 + iArr[9];
        iArr2[10] = i25 + iArr[10];
        iArr2[11] = i24 + iArr[11];
        iArr2[12] = i23 + iArr[12];
        iArr2[13] = i22 + iArr[13];
        iArr2[14] = i21 + iArr[14];
        iArr2[15] = i20 + iArr[15];
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    private boolean limitExceeded() {
        int i = this.cW0 + 1;
        this.cW0 = i;
        if (i == 0) {
            int i2 = this.cW1 + 1;
            this.cW1 = i2;
            if (i2 == 0) {
                int i3 = this.cW2 + 1;
                this.cW2 = i3;
                return (i3 & 32) != 0;
            }
        }
        return false;
    }

    private boolean limitExceeded(int i) {
        int i2 = this.cW0 + i;
        this.cW0 = i2;
        if (i2 >= i || i2 < 0) {
            return false;
        }
        int i3 = this.cW1 + 1;
        this.cW1 = i3;
        if (i3 == 0) {
            int i4 = this.cW2 + 1;
            this.cW2 = i4;
            return (i4 & 32) != 0;
        }
        return false;
    }
}
