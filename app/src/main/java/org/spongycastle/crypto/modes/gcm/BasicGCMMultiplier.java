package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class BasicGCMMultiplier implements GCMMultiplier {
    private byte[] H;

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.H = Arrays.clone(bArr);
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        GCMUtil.multiply(bArr, this.H);
    }
}
