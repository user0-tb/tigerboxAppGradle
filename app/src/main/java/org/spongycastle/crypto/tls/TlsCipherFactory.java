package org.spongycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface TlsCipherFactory {
    TlsCipher createCipher(TlsContext tlsContext, int i, int i2) throws IOException;
}
