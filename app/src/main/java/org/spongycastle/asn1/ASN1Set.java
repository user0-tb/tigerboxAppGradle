package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes4.dex */
public abstract class ASN1Set extends ASN1Primitive {
    private boolean isSorted;
    private Vector set;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public abstract void encode(ASN1OutputStream aSN1OutputStream) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return true;
    }

    public static ASN1Set getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Set)) {
            return (ASN1Set) obj;
        }
        if (obj instanceof ASN1SetParser) {
            return getInstance(((ASN1SetParser) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Set) {
                return (ASN1Set) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public static ASN1Set getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            if (!aSN1TaggedObject.isExplicit()) {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            }
            return (ASN1Set) aSN1TaggedObject.getObject();
        } else if (aSN1TaggedObject.isExplicit()) {
            if (aSN1TaggedObject instanceof BERTaggedObject) {
                return new BERSet(aSN1TaggedObject.getObject());
            }
            return new DLSet(aSN1TaggedObject.getObject());
        } else if (aSN1TaggedObject.getObject() instanceof ASN1Set) {
            return (ASN1Set) aSN1TaggedObject.getObject();
        } else {
            if (aSN1TaggedObject.getObject() instanceof ASN1Sequence) {
                ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1TaggedObject.getObject();
                if (aSN1TaggedObject instanceof BERTaggedObject) {
                    return new BERSet(aSN1Sequence.toArray());
                }
                return new DLSet(aSN1Sequence.toArray());
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + aSN1TaggedObject.getClass().getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Set() {
        this.set = new Vector();
        this.isSorted = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Set(ASN1Encodable aSN1Encodable) {
        Vector vector = new Vector();
        this.set = vector;
        this.isSorted = false;
        vector.addElement(aSN1Encodable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Set(ASN1EncodableVector aSN1EncodableVector, boolean z) {
        this.set = new Vector();
        this.isSorted = false;
        for (int i = 0; i != aSN1EncodableVector.size(); i++) {
            this.set.addElement(aSN1EncodableVector.get(i));
        }
        if (z) {
            sort();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ASN1Set(ASN1Encodable[] aSN1EncodableArr, boolean z) {
        this.set = new Vector();
        this.isSorted = false;
        for (int i = 0; i != aSN1EncodableArr.length; i++) {
            this.set.addElement(aSN1EncodableArr[i]);
        }
        if (z) {
            sort();
        }
    }

    public Enumeration getObjects() {
        return this.set.elements();
    }

    public ASN1Encodable getObjectAt(int i) {
        return (ASN1Encodable) this.set.elementAt(i);
    }

    public int size() {
        return this.set.size();
    }

    public ASN1Encodable[] toArray() {
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[size()];
        for (int i = 0; i != size(); i++) {
            aSN1EncodableArr[i] = getObjectAt(i);
        }
        return aSN1EncodableArr;
    }

    public ASN1SetParser parser() {
        return new ASN1SetParser() { // from class: org.spongycastle.asn1.ASN1Set.1
            private int index;
            private final int max;

            {
                this.max = ASN1Set.this.size();
            }

            @Override // org.spongycastle.asn1.ASN1SetParser
            public ASN1Encodable readObject() throws IOException {
                int i = this.index;
                if (i == this.max) {
                    return null;
                }
                ASN1Set aSN1Set = ASN1Set.this;
                this.index = i + 1;
                ASN1Encodable objectAt = aSN1Set.getObjectAt(i);
                if (objectAt instanceof ASN1Sequence) {
                    return ((ASN1Sequence) objectAt).parser();
                }
                return objectAt instanceof ASN1Set ? ((ASN1Set) objectAt).parser() : objectAt;
            }

            @Override // org.spongycastle.asn1.InMemoryRepresentable
            public ASN1Primitive getLoadedObject() {
                return this;
            }

            @Override // org.spongycastle.asn1.ASN1Encodable
            public ASN1Primitive toASN1Primitive() {
                return this;
            }
        };
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        Enumeration objects = getObjects();
        int size = size();
        while (objects.hasMoreElements()) {
            size = (size * 17) ^ getNext(objects).hashCode();
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        if (this.isSorted) {
            DERSet dERSet = new DERSet();
            dERSet.set = this.set;
            return dERSet;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.set.size(); i++) {
            vector.addElement(this.set.elementAt(i));
        }
        DERSet dERSet2 = new DERSet();
        dERSet2.set = vector;
        dERSet2.sort();
        return dERSet2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        DLSet dLSet = new DLSet();
        dLSet.set = this.set;
        return dLSet;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Set) {
            ASN1Set aSN1Set = (ASN1Set) aSN1Primitive;
            if (size() != aSN1Set.size()) {
                return false;
            }
            Enumeration objects = getObjects();
            Enumeration objects2 = aSN1Set.getObjects();
            while (objects.hasMoreElements()) {
                ASN1Encodable next = getNext(objects);
                ASN1Encodable next2 = getNext(objects2);
                ASN1Primitive aSN1Primitive2 = next.toASN1Primitive();
                ASN1Primitive aSN1Primitive3 = next2.toASN1Primitive();
                if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.equals(aSN1Primitive3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private ASN1Encodable getNext(Enumeration enumeration) {
        ASN1Encodable aSN1Encodable = (ASN1Encodable) enumeration.nextElement();
        return aSN1Encodable == null ? DERNull.INSTANCE : aSN1Encodable;
    }

    private boolean lessThanOrEqual(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != min; i++) {
            if (bArr[i] != bArr2[i]) {
                return (bArr[i] & 255) < (bArr2[i] & 255);
            }
        }
        return min == bArr.length;
    }

    private byte[] getEncoded(ASN1Encodable aSN1Encodable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ASN1OutputStream(byteArrayOutputStream).writeObject(aSN1Encodable);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    protected void sort() {
        if (this.isSorted) {
            return;
        }
        this.isSorted = true;
        if (this.set.size() > 1) {
            int size = this.set.size() - 1;
            boolean z = true;
            while (z) {
                int i = 0;
                byte[] encoded = getEncoded((ASN1Encodable) this.set.elementAt(0));
                z = false;
                int i2 = 0;
                while (i2 != size) {
                    int i3 = i2 + 1;
                    byte[] encoded2 = getEncoded((ASN1Encodable) this.set.elementAt(i3));
                    if (lessThanOrEqual(encoded, encoded2)) {
                        encoded = encoded2;
                    } else {
                        Object elementAt = this.set.elementAt(i2);
                        Vector vector = this.set;
                        vector.setElementAt(vector.elementAt(i3), i2);
                        this.set.setElementAt(elementAt, i3);
                        i = i2;
                        z = true;
                    }
                    i2 = i3;
                }
                size = i;
            }
        }
    }

    public String toString() {
        return this.set.toString();
    }
}
