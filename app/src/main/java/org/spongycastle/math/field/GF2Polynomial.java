package org.spongycastle.math.field;

import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
class GF2Polynomial implements Polynomial {
    protected final int[] exponents;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GF2Polynomial(int[] iArr) {
        this.exponents = Arrays.clone(iArr);
    }

    @Override // org.spongycastle.math.field.Polynomial
    public int getDegree() {
        int[] iArr = this.exponents;
        return iArr[iArr.length - 1];
    }

    @Override // org.spongycastle.math.field.Polynomial
    public int[] getExponentsPresent() {
        return Arrays.clone(this.exponents);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GF2Polynomial) {
            return Arrays.areEqual(this.exponents, ((GF2Polynomial) obj).exponents);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.exponents);
    }
}
