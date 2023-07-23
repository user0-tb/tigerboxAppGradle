package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {
    private BigInteger c;
    private BigInteger d;
    private BigInteger h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.c = bigInteger;
        this.d = bigInteger2;
        this.h = bigInteger3;
    }

    public BigInteger getC() {
        return this.c;
    }

    public BigInteger getD() {
        return this.d;
    }

    public BigInteger getH() {
        return this.h;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.c.hashCode() ^ this.d.hashCode()) ^ this.h.hashCode()) ^ super.hashCode();
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupPublicKeyParameters) {
            CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
            return cramerShoupPublicKeyParameters.getC().equals(this.c) && cramerShoupPublicKeyParameters.getD().equals(this.d) && cramerShoupPublicKeyParameters.getH().equals(this.h) && super.equals(obj);
        }
        return false;
    }
}
