package org.spongycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes4.dex */
public class AbstractTlsCipherFactory implements TlsCipherFactory {
    @Override // org.spongycastle.crypto.tls.TlsCipherFactory
    public TlsCipher createCipher(TlsContext tlsContext, int i, int i2) throws IOException {
        throw new TlsFatalAlert((short) 80);
    }
}
