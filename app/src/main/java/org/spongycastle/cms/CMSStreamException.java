package org.spongycastle.cms;

import java.io.IOException;

/* loaded from: classes4.dex */
public class CMSStreamException extends IOException {
    private final Throwable underlying;

    CMSStreamException(String str) {
        super(str);
        this.underlying = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CMSStreamException(String str, Throwable th) {
        super(str);
        this.underlying = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlying;
    }
}
