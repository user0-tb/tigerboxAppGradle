package org.spongycastle.operator;

import org.spongycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes4.dex */
public interface InputDecryptorProvider {
    InputDecryptor get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException;
}
