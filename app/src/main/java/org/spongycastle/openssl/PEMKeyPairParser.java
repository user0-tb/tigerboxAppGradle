package org.spongycastle.openssl;

import java.io.IOException;

/* loaded from: classes4.dex */
interface PEMKeyPairParser {
    PEMKeyPair parse(byte[] bArr) throws IOException;
}
