package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class ECPrivateKeySpec extends ECKeySpec {
    private BigInteger d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.d = bigInteger;
    }

    public BigInteger getD() {
        return this.d;
    }
}
