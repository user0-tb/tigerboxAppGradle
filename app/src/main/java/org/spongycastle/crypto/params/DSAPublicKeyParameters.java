package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class DSAPublicKeyParameters extends DSAKeyParameters {
    private BigInteger y;

    public DSAPublicKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(false, dSAParameters);
        this.y = bigInteger;
    }

    public BigInteger getY() {
        return this.y;
    }
}
