package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public interface ECMultiplier {
    ECPoint multiply(ECPoint eCPoint, BigInteger bigInteger);
}
