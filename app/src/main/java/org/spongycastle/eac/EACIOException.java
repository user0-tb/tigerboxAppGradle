package org.spongycastle.eac;

import java.io.IOException;

/* loaded from: classes4.dex */
public class EACIOException extends IOException {
    private Throwable cause;

    public EACIOException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public EACIOException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
