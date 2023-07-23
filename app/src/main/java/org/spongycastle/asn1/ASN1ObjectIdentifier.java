package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class ASN1ObjectIdentifier extends ASN1Primitive {
    private static final long LONG_LIMIT = 72057594037927808L;
    private static ASN1ObjectIdentifier[][] cache = new ASN1ObjectIdentifier[256];
    private byte[] body;
    String identifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public static ASN1ObjectIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier)) {
            return (ASN1ObjectIdentifier) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Encodable aSN1Encodable = (ASN1Encodable) obj;
            if (aSN1Encodable.toASN1Primitive() instanceof ASN1ObjectIdentifier) {
                return (ASN1ObjectIdentifier) aSN1Encodable.toASN1Primitive();
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1ObjectIdentifier) fromByteArray((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static ASN1ObjectIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (z || (object instanceof ASN1ObjectIdentifier)) {
            return getInstance(object);
        }
        return fromOctetString(ASN1OctetString.getInstance(aSN1TaggedObject.getObject()).getOctets());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1ObjectIdentifier(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & 255;
            if (j <= LONG_LIMIT) {
                long j2 = j + (i2 & 127);
                if ((i2 & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.identifier = stringBuffer.toString();
        this.body = Arrays.clone(bArr);
    }

    public ASN1ObjectIdentifier(String str) {
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        }
        if (!isValidIdentifier(str)) {
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
        this.identifier = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1ObjectIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (!isValidBranchID(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.identifier = aSN1ObjectIdentifier.getId() + DownloadsManager.EXTENSION_SEPARATOR + str;
    }

    public String getId() {
        return this.identifier;
    }

    public ASN1ObjectIdentifier branch(String str) {
        return new ASN1ObjectIdentifier(this, str);
    }

    public boolean on(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String id = getId();
        String id2 = aSN1ObjectIdentifier.getId();
        return id.length() > id2.length() && id.charAt(id2.length()) == '.' && id.startsWith(id2);
    }

    private void writeField(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    private void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    private void doOutput(ByteArrayOutputStream byteArrayOutputStream) {
        OIDTokenizer oIDTokenizer = new OIDTokenizer(this.identifier);
        int parseInt = Integer.parseInt(oIDTokenizer.nextToken()) * 40;
        String nextToken = oIDTokenizer.nextToken();
        if (nextToken.length() <= 18) {
            writeField(byteArrayOutputStream, parseInt + Long.parseLong(nextToken));
        } else {
            writeField(byteArrayOutputStream, new BigInteger(nextToken).add(BigInteger.valueOf(parseInt)));
        }
        while (oIDTokenizer.hasMoreTokens()) {
            String nextToken2 = oIDTokenizer.nextToken();
            if (nextToken2.length() <= 18) {
                writeField(byteArrayOutputStream, Long.parseLong(nextToken2));
            } else {
                writeField(byteArrayOutputStream, new BigInteger(nextToken2));
            }
        }
    }

    protected synchronized byte[] getBody() {
        if (this.body == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            doOutput(byteArrayOutputStream);
            this.body = byteArrayOutputStream.toByteArray();
        }
        return this.body;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        int length = getBody().length;
        return StreamUtil.calculateBodyLength(length) + 1 + length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        byte[] body = getBody();
        aSN1OutputStream.write(6);
        aSN1OutputStream.writeLength(body.length);
        aSN1OutputStream.write(body);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        return this.identifier.hashCode();
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
            return this.identifier.equals(((ASN1ObjectIdentifier) aSN1Primitive).identifier);
        }
        return false;
    }

    public String toString() {
        return getId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r3 != '.') goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isValidBranchID(java.lang.String r5, int r6) {
        /*
            int r0 = r5.length()
            r1 = 0
        L5:
            r2 = 0
        L6:
            int r0 = r0 + (-1)
            if (r0 < r6) goto L1f
            char r3 = r5.charAt(r0)
            r4 = 48
            if (r4 > r3) goto L18
            r4 = 57
            if (r3 > r4) goto L18
            r2 = 1
            goto L6
        L18:
            r4 = 46
            if (r3 != r4) goto L1e
            if (r2 != 0) goto L5
        L1e:
            return r1
        L1f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.asn1.ASN1ObjectIdentifier.isValidBranchID(java.lang.String, int):boolean");
    }

    private static boolean isValidIdentifier(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return isValidBranchID(str, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1ObjectIdentifier fromOctetString(byte[] bArr) {
        if (bArr.length < 3) {
            return new ASN1ObjectIdentifier(bArr);
        }
        int i = bArr[bArr.length - 2] & 255;
        int i2 = bArr[bArr.length - 1] & Byte.MAX_VALUE;
        synchronized (cache) {
            ASN1ObjectIdentifier[][] aSN1ObjectIdentifierArr = cache;
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr2 = aSN1ObjectIdentifierArr[i];
            if (aSN1ObjectIdentifierArr2 == null) {
                aSN1ObjectIdentifierArr2 = new ASN1ObjectIdentifier[128];
                aSN1ObjectIdentifierArr[i] = aSN1ObjectIdentifierArr2;
            }
            ASN1ObjectIdentifier aSN1ObjectIdentifier = aSN1ObjectIdentifierArr2[i2];
            if (aSN1ObjectIdentifier == null) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(bArr);
                aSN1ObjectIdentifierArr2[i2] = aSN1ObjectIdentifier2;
                return aSN1ObjectIdentifier2;
            } else if (Arrays.areEqual(bArr, aSN1ObjectIdentifier.getBody())) {
                return aSN1ObjectIdentifier;
            } else {
                int i3 = (i + 1) & 255;
                ASN1ObjectIdentifier[][] aSN1ObjectIdentifierArr3 = cache;
                ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr4 = aSN1ObjectIdentifierArr3[i3];
                if (aSN1ObjectIdentifierArr4 == null) {
                    aSN1ObjectIdentifierArr4 = new ASN1ObjectIdentifier[128];
                    aSN1ObjectIdentifierArr3[i3] = aSN1ObjectIdentifierArr4;
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier3 = aSN1ObjectIdentifierArr4[i2];
                if (aSN1ObjectIdentifier3 == null) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(bArr);
                    aSN1ObjectIdentifierArr4[i2] = aSN1ObjectIdentifier4;
                    return aSN1ObjectIdentifier4;
                } else if (Arrays.areEqual(bArr, aSN1ObjectIdentifier3.getBody())) {
                    return aSN1ObjectIdentifier3;
                } else {
                    int i4 = (i2 + 1) & 127;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier5 = aSN1ObjectIdentifierArr4[i4];
                    if (aSN1ObjectIdentifier5 != null) {
                        return Arrays.areEqual(bArr, aSN1ObjectIdentifier5.getBody()) ? aSN1ObjectIdentifier5 : new ASN1ObjectIdentifier(bArr);
                    }
                    ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier(bArr);
                    aSN1ObjectIdentifierArr4[i4] = aSN1ObjectIdentifier6;
                    return aSN1ObjectIdentifier6;
                }
            }
        }
    }
}
