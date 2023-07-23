package org.spongycastle.crypto.signers;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.Hashtable;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.SignerWithRecovery;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
public class ISO9796d2Signer implements SignerWithRecovery {
    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private static Hashtable trailerMap;
    private byte[] block;
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int keyBits;
    private byte[] mBuf;
    private int messageLength;
    private byte[] preBlock;
    private byte[] preSig;
    private byte[] recoveredMessage;
    private int trailer;

    static {
        Hashtable hashtable = new Hashtable();
        trailerMap = hashtable;
        hashtable.put("RIPEMD128", Integers.valueOf(13004));
        trailerMap.put("RIPEMD160", Integers.valueOf(12748));
        trailerMap.put("SHA-1", Integers.valueOf(13260));
        trailerMap.put("SHA-256", Integers.valueOf(13516));
        trailerMap.put("SHA-384", Integers.valueOf(14028));
        trailerMap.put("SHA-512", Integers.valueOf(13772));
        trailerMap.put("Whirlpool", Integers.valueOf(14284));
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, boolean z) {
        this.cipher = asymmetricBlockCipher;
        this.digest = digest;
        if (z) {
            this.trailer = 188;
            return;
        }
        Integer num = (Integer) trailerMap.get(digest.getAlgorithmName());
        if (num != null) {
            this.trailer = num.intValue();
            return;
        }
        throw new IllegalArgumentException("no valid trailer for digest");
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, false);
    }

    @Override // org.spongycastle.crypto.Signer
    public void init(boolean z, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) cipherParameters;
        this.cipher.init(z, rSAKeyParameters);
        int bitLength = rSAKeyParameters.getModulus().bitLength();
        this.keyBits = bitLength;
        byte[] bArr = new byte[(bitLength + 7) / 8];
        this.block = bArr;
        if (this.trailer == 188) {
            this.mBuf = new byte[(bArr.length - this.digest.getDigestSize()) - 2];
        } else {
            this.mBuf = new byte[(bArr.length - this.digest.getDigestSize()) - 3];
        }
        reset();
    }

    private boolean isSameAs(byte[] bArr, byte[] bArr2) {
        boolean z;
        int i = this.messageLength;
        byte[] bArr3 = this.mBuf;
        if (i > bArr3.length) {
            z = bArr3.length <= bArr2.length;
            for (int i2 = 0; i2 != this.mBuf.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                }
            }
        } else {
            z = i == bArr2.length;
            for (int i3 = 0; i3 != bArr2.length; i3++) {
                if (bArr[i3] != bArr2[i3]) {
                    z = false;
                }
            }
        }
        return z;
    }

    private void clearBlock(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public void updateWithRecoveredMessage(byte[] bArr) throws InvalidCipherTextException {
        byte[] processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
        if (((processBlock[0] & 192) ^ 64) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        if (((processBlock[processBlock.length - 1] & Ascii.SI) ^ 12) != 0) {
            throw new InvalidCipherTextException("malformed signature");
        }
        int i = 2;
        if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            int i2 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
            Integer num = (Integer) trailerMap.get(this.digest.getAlgorithmName());
            if (num != null) {
                if (i2 != num.intValue()) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i2);
                }
            } else {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
        }
        int i3 = 0;
        while (i3 != processBlock.length && ((processBlock[i3] & Ascii.SI) ^ 10) != 0) {
            i3++;
        }
        int i4 = i3 + 1;
        int length = ((processBlock.length - i) - this.digest.getDigestSize()) - i4;
        if (length <= 0) {
            throw new InvalidCipherTextException("malformed block");
        }
        if ((processBlock[0] & 32) == 0) {
            this.fullMessage = true;
            byte[] bArr2 = new byte[length];
            this.recoveredMessage = bArr2;
            System.arraycopy(processBlock, i4, bArr2, 0, bArr2.length);
        } else {
            this.fullMessage = false;
            byte[] bArr3 = new byte[length];
            this.recoveredMessage = bArr3;
            System.arraycopy(processBlock, i4, bArr3, 0, bArr3.length);
        }
        this.preSig = bArr;
        this.preBlock = processBlock;
        Digest digest = this.digest;
        byte[] bArr4 = this.recoveredMessage;
        digest.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.recoveredMessage;
        this.messageLength = bArr5.length;
        System.arraycopy(bArr5, 0, this.mBuf, 0, bArr5.length);
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte b) {
        this.digest.update(b);
        int i = this.messageLength;
        byte[] bArr = this.mBuf;
        if (i < bArr.length) {
            bArr[i] = b;
        }
        this.messageLength = i + 1;
    }

    @Override // org.spongycastle.crypto.Signer
    public void update(byte[] bArr, int i, int i2) {
        while (i2 > 0 && this.messageLength < this.mBuf.length) {
            update(bArr[i]);
            i++;
            i2--;
        }
        this.digest.update(bArr, i, i2);
        this.messageLength += i2;
    }

    @Override // org.spongycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        this.messageLength = 0;
        clearBlock(this.mBuf);
        byte[] bArr = this.recoveredMessage;
        if (bArr != null) {
            clearBlock(bArr);
        }
        this.recoveredMessage = null;
        this.fullMessage = false;
        if (this.preSig != null) {
            this.preSig = null;
            clearBlock(this.preBlock);
            this.preBlock = null;
        }
    }

    @Override // org.spongycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        int i;
        int i2;
        byte b;
        int i3;
        byte[] bArr;
        int digestSize = this.digest.getDigestSize();
        if (this.trailer == 188) {
            byte[] bArr2 = this.block;
            i2 = (bArr2.length - digestSize) - 1;
            this.digest.doFinal(bArr2, i2);
            this.block[bArr.length - 1] = PSSSigner.TRAILER_IMPLICIT;
            i = 8;
        } else {
            i = 16;
            byte[] bArr3 = this.block;
            int length = (bArr3.length - digestSize) - 2;
            this.digest.doFinal(bArr3, length);
            byte[] bArr4 = this.block;
            int i4 = this.trailer;
            bArr4[bArr4.length - 2] = (byte) (i4 >>> 8);
            bArr4[bArr4.length - 1] = (byte) i4;
            i2 = length;
        }
        int i5 = this.messageLength;
        int i6 = ((((digestSize + i5) * 8) + i) + 4) - this.keyBits;
        if (i6 > 0) {
            int i7 = i5 - ((i6 + 7) / 8);
            b = 96;
            i3 = i2 - i7;
            System.arraycopy(this.mBuf, 0, this.block, i3, i7);
        } else {
            b = SignedBytes.MAX_POWER_OF_TWO;
            i3 = i2 - i5;
            System.arraycopy(this.mBuf, 0, this.block, i3, i5);
        }
        int i8 = i3 - 1;
        if (i8 > 0) {
            for (int i9 = i8; i9 != 0; i9--) {
                this.block[i9] = -69;
            }
            byte[] bArr5 = this.block;
            bArr5[i8] = (byte) (bArr5[i8] ^ 1);
            bArr5[0] = Ascii.VT;
            bArr5[0] = (byte) (b | bArr5[0]);
        } else {
            byte[] bArr6 = this.block;
            bArr6[0] = 10;
            bArr6[0] = (byte) (b | bArr6[0]);
        }
        AsymmetricBlockCipher asymmetricBlockCipher = this.cipher;
        byte[] bArr7 = this.block;
        byte[] processBlock = asymmetricBlockCipher.processBlock(bArr7, 0, bArr7.length);
        clearBlock(this.mBuf);
        clearBlock(this.block);
        return processBlock;
    }

    @Override // org.spongycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        byte[] processBlock;
        byte[] bArr2 = this.preSig;
        if (bArr2 == null) {
            try {
                processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            } catch (Exception unused) {
                return false;
            }
        } else if (!Arrays.areEqual(bArr2, bArr)) {
            throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
        } else {
            processBlock = this.preBlock;
            this.preSig = null;
            this.preBlock = null;
        }
        if (((processBlock[0] & 192) ^ 64) != 0) {
            return returnFalse(processBlock);
        }
        if (((processBlock[processBlock.length - 1] & Ascii.SI) ^ 12) != 0) {
            return returnFalse(processBlock);
        }
        int i = 2;
        if (((processBlock[processBlock.length - 1] & 255) ^ 188) == 0) {
            i = 1;
        } else {
            int i2 = ((processBlock[processBlock.length - 2] & 255) << 8) | (processBlock[processBlock.length - 1] & 255);
            Integer num = (Integer) trailerMap.get(this.digest.getAlgorithmName());
            if (num != null) {
                if (i2 != num.intValue()) {
                    throw new IllegalStateException("signer initialised with wrong digest for trailer " + i2);
                }
            } else {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
        }
        int i3 = 0;
        while (i3 != processBlock.length && ((processBlock[i3] & Ascii.SI) ^ 10) != 0) {
            i3++;
        }
        int i4 = i3 + 1;
        int digestSize = this.digest.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int length = (processBlock.length - i) - digestSize;
        int i5 = length - i4;
        if (i5 <= 0) {
            return returnFalse(processBlock);
        }
        if ((processBlock[0] & 32) == 0) {
            this.fullMessage = true;
            if (this.messageLength > i5) {
                return returnFalse(processBlock);
            }
            this.digest.reset();
            this.digest.update(processBlock, i4, i5);
            this.digest.doFinal(bArr3, 0);
            boolean z = true;
            for (int i6 = 0; i6 != digestSize; i6++) {
                int i7 = length + i6;
                processBlock[i7] = (byte) (processBlock[i7] ^ bArr3[i6]);
                if (processBlock[i7] != 0) {
                    z = false;
                }
            }
            if (!z) {
                return returnFalse(processBlock);
            }
            byte[] bArr4 = new byte[i5];
            this.recoveredMessage = bArr4;
            System.arraycopy(processBlock, i4, bArr4, 0, bArr4.length);
        } else {
            this.fullMessage = false;
            this.digest.doFinal(bArr3, 0);
            boolean z2 = true;
            for (int i8 = 0; i8 != digestSize; i8++) {
                int i9 = length + i8;
                processBlock[i9] = (byte) (processBlock[i9] ^ bArr3[i8]);
                if (processBlock[i9] != 0) {
                    z2 = false;
                }
            }
            if (!z2) {
                return returnFalse(processBlock);
            }
            byte[] bArr5 = new byte[i5];
            this.recoveredMessage = bArr5;
            System.arraycopy(processBlock, i4, bArr5, 0, bArr5.length);
        }
        if (this.messageLength != 0 && !isSameAs(this.mBuf, this.recoveredMessage)) {
            return returnFalse(processBlock);
        }
        clearBlock(this.mBuf);
        clearBlock(processBlock);
        return true;
    }

    private boolean returnFalse(byte[] bArr) {
        clearBlock(this.mBuf);
        clearBlock(bArr);
        return false;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public boolean hasFullMessage() {
        return this.fullMessage;
    }

    @Override // org.spongycastle.crypto.SignerWithRecovery
    public byte[] getRecoveredMessage() {
        return this.recoveredMessage;
    }
}
