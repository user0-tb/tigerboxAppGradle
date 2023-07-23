package org.spongycastle.cms;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.util.io.Streams;

/* loaded from: classes4.dex */
public class CMSTypedStream {
    private static final int BUF_SIZ = 32768;
    private final InputStream _in;
    private final ASN1ObjectIdentifier _oid;

    public CMSTypedStream(InputStream inputStream) {
        this(PKCSObjectIdentifiers.data.getId(), inputStream, 32768);
    }

    public CMSTypedStream(String str, InputStream inputStream) {
        this(new ASN1ObjectIdentifier(str), inputStream, 32768);
    }

    public CMSTypedStream(String str, InputStream inputStream, int i) {
        this(new ASN1ObjectIdentifier(str), inputStream, i);
    }

    public CMSTypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, InputStream inputStream) {
        this(aSN1ObjectIdentifier, inputStream, 32768);
    }

    public CMSTypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, InputStream inputStream, int i) {
        this._oid = aSN1ObjectIdentifier;
        this._in = new FullReaderStream(new BufferedInputStream(inputStream, i));
    }

    public ASN1ObjectIdentifier getContentType() {
        return this._oid;
    }

    public InputStream getContentStream() {
        return this._in;
    }

    public void drain() throws IOException {
        Streams.drain(this._in);
        this._in.close();
    }

    /* loaded from: classes4.dex */
    private static class FullReaderStream extends FilterInputStream {
        FullReaderStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int readFully = Streams.readFully(((FilterInputStream) this).in, bArr, i, i2);
            if (readFully > 0) {
                return readFully;
            }
            return -1;
        }
    }
}
