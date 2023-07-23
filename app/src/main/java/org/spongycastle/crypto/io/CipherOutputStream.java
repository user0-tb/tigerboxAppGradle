package org.spongycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.modes.AEADBlockCipher;

/* loaded from: classes4.dex */
public class CipherOutputStream extends FilterOutputStream {
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private BufferedBlockCipher bufferedBlockCipher;
    private final byte[] oneByte;
    private StreamCipher streamCipher;

    public CipherOutputStream(OutputStream outputStream, BufferedBlockCipher bufferedBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.bufferedBlockCipher = bufferedBlockCipher;
    }

    public CipherOutputStream(OutputStream outputStream, StreamCipher streamCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.streamCipher = streamCipher;
    }

    public CipherOutputStream(OutputStream outputStream, AEADBlockCipher aEADBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.aeadBlockCipher = aEADBlockCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.oneByte;
        byte b = (byte) i;
        bArr[0] = b;
        if (this.streamCipher != null) {
            this.out.write(this.streamCipher.returnByte(b));
        } else {
            write(bArr, 0, 1);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ensureCapacity(i2, false);
        BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
        if (bufferedBlockCipher != null) {
            int processBytes = bufferedBlockCipher.processBytes(bArr, i, i2, this.buf, 0);
            if (processBytes != 0) {
                this.out.write(this.buf, 0, processBytes);
                return;
            }
            return;
        }
        AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
        if (aEADBlockCipher != null) {
            int processBytes2 = aEADBlockCipher.processBytes(bArr, i, i2, this.buf, 0);
            if (processBytes2 != 0) {
                this.out.write(this.buf, 0, processBytes2);
                return;
            }
            return;
        }
        this.streamCipher.processBytes(bArr, i, i2, this.buf, 0);
        this.out.write(this.buf, 0, i2);
    }

    private void ensureCapacity(int i, boolean z) {
        if (z) {
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                i = bufferedBlockCipher.getOutputSize(i);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    i = aEADBlockCipher.getOutputSize(i);
                }
            }
        } else {
            BufferedBlockCipher bufferedBlockCipher2 = this.bufferedBlockCipher;
            if (bufferedBlockCipher2 != null) {
                i = bufferedBlockCipher2.getUpdateOutputSize(i);
            } else {
                AEADBlockCipher aEADBlockCipher2 = this.aeadBlockCipher;
                if (aEADBlockCipher2 != null) {
                    i = aEADBlockCipher2.getUpdateOutputSize(i);
                }
            }
        }
        byte[] bArr = this.buf;
        if (bArr == null || bArr.length < i) {
            this.buf = new byte[i];
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            r4.ensureCapacity(r0, r1)
            org.spongycastle.crypto.BufferedBlockCipher r1 = r4.bufferedBlockCipher     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            if (r1 == 0) goto L19
            byte[] r2 = r4.buf     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            int r1 = r1.doFinal(r2, r0)     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            if (r1 == 0) goto L2c
            java.io.OutputStream r2 = r4.out     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            byte[] r3 = r4.buf     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            r2.write(r3, r0, r1)     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            goto L2c
        L19:
            org.spongycastle.crypto.modes.AEADBlockCipher r1 = r4.aeadBlockCipher     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            if (r1 == 0) goto L2c
            byte[] r2 = r4.buf     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            int r1 = r1.doFinal(r2, r0)     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            if (r1 == 0) goto L2c
            java.io.OutputStream r2 = r4.out     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            byte[] r3 = r4.buf     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
            r2.write(r3, r0, r1)     // Catch: java.lang.Exception -> L2e org.spongycastle.crypto.InvalidCipherTextException -> L37
        L2c:
            r0 = 0
            goto L40
        L2e:
            r0 = move-exception
            org.spongycastle.crypto.io.CipherIOException r1 = new org.spongycastle.crypto.io.CipherIOException
            java.lang.String r2 = "Error closing stream: "
            r1.<init>(r2, r0)
            goto L3f
        L37:
            r0 = move-exception
            org.spongycastle.crypto.io.InvalidCipherTextIOException r1 = new org.spongycastle.crypto.io.InvalidCipherTextIOException
            java.lang.String r2 = "Error finalising cipher data"
            r1.<init>(r2, r0)
        L3f:
            r0 = r1
        L40:
            r4.flush()     // Catch: java.io.IOException -> L49
            java.io.OutputStream r1 = r4.out     // Catch: java.io.IOException -> L49
            r1.close()     // Catch: java.io.IOException -> L49
            goto L4d
        L49:
            r1 = move-exception
            if (r0 != 0) goto L4d
            r0 = r1
        L4d:
            if (r0 != 0) goto L50
            return
        L50:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.io.CipherOutputStream.close():void");
    }
}
