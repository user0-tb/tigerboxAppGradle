package org.spongycastle.operator;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public abstract class SymmetricKeyWrapper implements KeyWrapper {
    private AlgorithmIdentifier algorithmId;

    /* JADX INFO: Access modifiers changed from: protected */
    public SymmetricKeyWrapper(AlgorithmIdentifier algorithmIdentifier) {
        this.algorithmId = algorithmIdentifier;
    }

    @Override // org.spongycastle.operator.KeyWrapper
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmId;
    }
}
