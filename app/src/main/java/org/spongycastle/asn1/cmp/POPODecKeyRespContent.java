package org.spongycastle.asn1.cmp;

import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;

/* loaded from: classes4.dex */
public class POPODecKeyRespContent extends ASN1Object {
    private ASN1Sequence content;

    private POPODecKeyRespContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static POPODecKeyRespContent getInstance(Object obj) {
        if (obj instanceof POPODecKeyRespContent) {
            return (POPODecKeyRespContent) obj;
        }
        if (obj != null) {
            return new POPODecKeyRespContent(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Integer[] toASN1IntegerArray() {
        int size = this.content.size();
        ASN1Integer[] aSN1IntegerArr = new ASN1Integer[size];
        for (int i = 0; i != size; i++) {
            aSN1IntegerArr[i] = ASN1Integer.getInstance(this.content.getObjectAt(i));
        }
        return aSN1IntegerArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }
}
