package org.spongycastle.math.ec.endo;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public interface GLVEndomorphism extends ECEndomorphism {
    BigInteger[] decomposeScalar(BigInteger bigInteger);
}
