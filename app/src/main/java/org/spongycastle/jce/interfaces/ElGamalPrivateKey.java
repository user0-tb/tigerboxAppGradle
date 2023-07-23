package org.spongycastle.jce.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

/* loaded from: classes4.dex */
public interface ElGamalPrivateKey extends ElGamalKey, PrivateKey {
    BigInteger getX();
}
