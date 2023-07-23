package org.spongycastle.asn1;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class DERInteger extends ASN1Integer {
    public DERInteger(byte[] bArr) {
        super(bArr, true);
    }

    public DERInteger(BigInteger bigInteger) {
        super(bigInteger);
    }

    public DERInteger(long j) {
        super(j);
    }
}
