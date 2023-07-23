package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.io.Streams;

/* loaded from: classes4.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefiniteLengthInputStream(InputStream inputStream, int i) {
        super(inputStream, i);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this._originalLength = i;
        this._remaining = i;
        if (i == 0) {
            setParentEofDetect(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.LimitedInputStream
    public int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int read = this._in.read();
        if (read < 0) {
            throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
        }
        int i = this._remaining - 1;
        this._remaining = i;
        if (i == 0) {
            setParentEofDetect(true);
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this._remaining;
        if (i3 == 0) {
            return -1;
        }
        int read = this._in.read(bArr, i, Math.min(i2, i3));
        if (read < 0) {
            throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
        }
        int i4 = this._remaining - read;
        this._remaining = i4;
        if (i4 == 0) {
            setParentEofDetect(true);
        }
        return read;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] toByteArray() throws IOException {
        int i = this._remaining;
        if (i == 0) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i];
        int readFully = i - Streams.readFully(this._in, bArr);
        this._remaining = readFully;
        if (readFully != 0) {
            throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
        }
        setParentEofDetect(true);
        return bArr;
    }
}
