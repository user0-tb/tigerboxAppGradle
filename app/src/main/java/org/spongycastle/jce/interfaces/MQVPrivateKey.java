package org.spongycastle.jce.interfaces;

import java.security.PrivateKey;
import java.security.PublicKey;

/* loaded from: classes4.dex */
public interface MQVPrivateKey extends PrivateKey {
    PrivateKey getEphemeralPrivateKey();

    PublicKey getEphemeralPublicKey();

    PrivateKey getStaticPrivateKey();
}
