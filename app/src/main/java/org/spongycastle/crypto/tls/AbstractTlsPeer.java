package org.spongycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AbstractTlsPeer implements TlsPeer {
    @Override // org.spongycastle.crypto.tls.TlsPeer
    public void notifyAlertRaised(short s, short s2, String str, Exception exc) {
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public void notifyAlertReceived(short s, short s2) {
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public void notifyHandshakeComplete() throws IOException {
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public boolean shouldUseGMTUnixTime() {
        return false;
    }

    @Override // org.spongycastle.crypto.tls.TlsPeer
    public void notifySecureRenegotiation(boolean z) throws IOException {
        if (!z) {
            throw new TlsFatalAlert((short) 40);
        }
    }
}
