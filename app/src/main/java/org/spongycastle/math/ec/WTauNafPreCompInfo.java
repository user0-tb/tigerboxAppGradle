package org.spongycastle.math.ec;

import org.spongycastle.math.ec.ECPoint;

/* loaded from: classes4.dex */
public class WTauNafPreCompInfo implements PreCompInfo {
    protected ECPoint.F2m[] preComp = null;

    public ECPoint.F2m[] getPreComp() {
        return this.preComp;
    }

    public void setPreComp(ECPoint.F2m[] f2mArr) {
        this.preComp = f2mArr;
    }
}
