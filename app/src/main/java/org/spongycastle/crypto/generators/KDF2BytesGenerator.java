package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.Digest;

/* loaded from: classes4.dex */
public class KDF2BytesGenerator extends BaseKDFBytesGenerator {
    public KDF2BytesGenerator(Digest digest) {
        super(1, digest);
    }
}
