package org.spongycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

/* loaded from: classes4.dex */
public interface ElGamalPublicKey extends ElGamalKey, PublicKey {
    BigInteger getY();
}
