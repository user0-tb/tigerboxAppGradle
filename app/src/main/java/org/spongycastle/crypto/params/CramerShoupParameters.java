package org.spongycastle.crypto.params;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;

/* loaded from: classes4.dex */
public class CramerShoupParameters implements CipherParameters {
    private Digest H;
    private BigInteger g1;
    private BigInteger g2;
    private BigInteger p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.p = bigInteger;
        this.g1 = bigInteger2;
        this.g2 = bigInteger3;
        this.H = digest;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAParameters) {
            CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
            return cramerShoupParameters.getP().equals(this.p) && cramerShoupParameters.getG1().equals(this.g1) && cramerShoupParameters.getG2().equals(this.g2);
        }
        return false;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }

    public BigInteger getG1() {
        return this.g1;
    }

    public BigInteger getG2() {
        return this.g2;
    }

    public BigInteger getP() {
        return this.p;
    }

    public Digest getH() {
        this.H.reset();
        return this.H;
    }
}
