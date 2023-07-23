package org.spongycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class ZSignedDigitR2LMultiplier extends AbstractECMultiplier {
    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    protected ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int bitLength = bigInteger.bitLength();
        int lowestSetBit = bigInteger.getLowestSetBit();
        ECPoint timesPow2 = eCPoint.timesPow2(lowestSetBit);
        while (true) {
            lowestSetBit++;
            if (lowestSetBit < bitLength) {
                infinity = infinity.add(bigInteger.testBit(lowestSetBit) ? timesPow2 : timesPow2.negate());
                timesPow2 = timesPow2.twice();
            } else {
                return infinity.add(timesPow2);
            }
        }
    }
}
