package org.spongycastle.jce.spec;

import java.security.spec.KeySpec;

/* loaded from: classes4.dex */
public class ElGamalKeySpec implements KeySpec {
    private ElGamalParameterSpec spec;

    public ElGamalKeySpec(ElGamalParameterSpec elGamalParameterSpec) {
        this.spec = elGamalParameterSpec;
    }

    public ElGamalParameterSpec getParams() {
        return this.spec;
    }
}
