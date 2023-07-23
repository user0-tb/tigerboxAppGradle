package org.spongycastle.math.ec.endo;

import org.spongycastle.math.ec.ECPointMap;

/* loaded from: classes4.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
