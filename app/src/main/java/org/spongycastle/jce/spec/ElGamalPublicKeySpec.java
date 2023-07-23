package org.spongycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {
    private BigInteger y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.y = bigInteger;
    }

    public BigInteger getY() {
        return this.y;
    }
}
