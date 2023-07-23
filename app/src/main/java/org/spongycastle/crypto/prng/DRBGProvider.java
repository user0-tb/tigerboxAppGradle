package org.spongycastle.crypto.prng;

import org.spongycastle.crypto.prng.drbg.SP80090DRBG;

/* loaded from: classes4.dex */
interface DRBGProvider {
    SP80090DRBG get(EntropySource entropySource);
}
