package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class ASN1Object implements ASN1Encodable {
    @Override // org.spongycastle.asn1.ASN1Encodable
    public abstract ASN1Primitive toASN1Primitive();

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ASN1OutputStream(byteArrayOutputStream).writeObject(this);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] getEncoded(String str) throws IOException {
        if (str.equals(ASN1Encoding.DER)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new DEROutputStream(byteArrayOutputStream).writeObject(this);
            return byteArrayOutputStream.toByteArray();
        } else if (str.equals(ASN1Encoding.DL)) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            new DLOutputStream(byteArrayOutputStream2).writeObject(this);
            return byteArrayOutputStream2.toByteArray();
        } else {
            return getEncoded();
        }
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ASN1Encodable) {
            return toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive());
        }
        return false;
    }

    public ASN1Primitive toASN1Object() {
        return toASN1Primitive();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean hasEncodedTagValue(Object obj, int i) {
        return (obj instanceof byte[]) && ((byte[]) obj)[0] == i;
    }
}
