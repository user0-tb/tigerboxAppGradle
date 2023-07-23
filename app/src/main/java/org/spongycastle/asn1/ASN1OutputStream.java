package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class ASN1OutputStream {
    private OutputStream os;

    public ASN1OutputStream(OutputStream outputStream) {
        this.os = outputStream;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeLength(int i) throws IOException {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            write((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                write((byte) (i >> i4));
            }
            return;
        }
        write((byte) i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void write(int i) throws IOException {
        this.os.write(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void write(byte[] bArr) throws IOException {
        this.os.write(bArr);
    }

    void write(byte[] bArr, int i, int i2) throws IOException {
        this.os.write(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeEncoded(int i, byte[] bArr) throws IOException {
        write(i);
        writeLength(bArr.length);
        write(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeTag(int i, int i2) throws IOException {
        if (i2 < 31) {
            write(i | i2);
            return;
        }
        write(i | 31);
        if (i2 < 128) {
            write(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        write(bArr, i3, 5 - i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeEncoded(int i, int i2, byte[] bArr) throws IOException {
        writeTag(i, i2);
        writeLength(bArr.length);
        write(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void writeNull() throws IOException {
        this.os.write(5);
        this.os.write(0);
    }

    public void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable != null) {
            aSN1Encodable.toASN1Primitive().encode(this);
            return;
        }
        throw new IOException("null object detected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeImplicitObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive != null) {
            aSN1Primitive.encode(new ImplicitOutputStream(this.os));
            return;
        }
        throw new IOException("null object detected");
    }

    public void close() throws IOException {
        this.os.close();
    }

    public void flush() throws IOException {
        this.os.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1OutputStream getDERSubStream() {
        return new DEROutputStream(this.os);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1OutputStream getDLSubStream() {
        return new DLOutputStream(this.os);
    }

    /* loaded from: classes4.dex */
    private class ImplicitOutputStream extends ASN1OutputStream {
        private boolean first;

        public ImplicitOutputStream(OutputStream outputStream) {
            super(outputStream);
            this.first = true;
        }

        @Override // org.spongycastle.asn1.ASN1OutputStream
        public void write(int i) throws IOException {
            if (this.first) {
                this.first = false;
            } else {
                super.write(i);
            }
        }
    }
}
