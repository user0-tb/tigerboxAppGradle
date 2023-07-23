package org.spongycastle.operator;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public abstract class SymmetricKeyUnwrapper implements KeyUnwrapper {
    private AlgorithmIdentifier algorithmId;

    /* JADX INFO: Access modifiers changed from: protected */
    public SymmetricKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier) {
        this.algorithmId = algorithmIdentifier;
    }

    @Override // org.spongycastle.operator.KeyUnwrapper
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmId;
    }
}
