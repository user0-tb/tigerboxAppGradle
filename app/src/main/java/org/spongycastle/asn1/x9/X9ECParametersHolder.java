package org.spongycastle.asn1.x9;

/* loaded from: classes4.dex */
public abstract class X9ECParametersHolder {
    private X9ECParameters params;

    protected abstract X9ECParameters createParameters();

    public X9ECParameters getParameters() {
        if (this.params == null) {
            this.params = createParameters();
        }
        return this.params;
    }
}
