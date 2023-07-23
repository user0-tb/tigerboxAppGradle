package org.spongycastle.asn1.ocsp;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.X500Name;

/* loaded from: classes4.dex */
public class ServiceLocator extends ASN1Object {
    X500Name issuer;
    ASN1Primitive locator;

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.issuer);
        ASN1Primitive aSN1Primitive = this.locator;
        if (aSN1Primitive != null) {
            aSN1EncodableVector.add(aSN1Primitive);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
