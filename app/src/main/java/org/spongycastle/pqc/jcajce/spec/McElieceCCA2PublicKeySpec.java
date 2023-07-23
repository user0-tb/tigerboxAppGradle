package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* loaded from: classes4.dex */
public class McElieceCCA2PublicKeySpec implements KeySpec {
    private GF2Matrix matrixG;
    private int n;
    private String oid;
    private int t;

    public McElieceCCA2PublicKeySpec(String str, int i, int i2, GF2Matrix gF2Matrix) {
        this.oid = str;
        this.n = i;
        this.t = i2;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public McElieceCCA2PublicKeySpec(String str, int i, int i2, byte[] bArr) {
        this.oid = str;
        this.n = i;
        this.t = i2;
        this.matrixG = new GF2Matrix(bArr);
    }

    public int getN() {
        return this.n;
    }

    public int getT() {
        return this.t;
    }

    public GF2Matrix getMatrixG() {
        return this.matrixG;
    }

    public String getOIDString() {
        return this.oid;
    }
}
