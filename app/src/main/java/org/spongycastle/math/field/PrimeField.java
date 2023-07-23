package org.spongycastle.math.field;

import java.math.BigInteger;

/* loaded from: classes4.dex */
class PrimeField implements FiniteField {
    protected final BigInteger characteristic;

    @Override // org.spongycastle.math.field.FiniteField
    public int getDimension() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PrimeField(BigInteger bigInteger) {
        this.characteristic = bigInteger;
    }

    @Override // org.spongycastle.math.field.FiniteField
    public BigInteger getCharacteristic() {
        return this.characteristic;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrimeField) {
            return this.characteristic.equals(((PrimeField) obj).characteristic);
        }
        return false;
    }

    public int hashCode() {
        return this.characteristic.hashCode();
    }
}
