package org.spongycastle.openssl;

import java.io.IOException;

/* loaded from: classes4.dex */
public class PEMException extends IOException {
    Exception underlying;

    public PEMException(String str) {
        super(str);
    }

    public PEMException(String str, Exception exc) {
        super(str);
        this.underlying = exc;
    }

    public Exception getUnderlyingException() {
        return this.underlying;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlying;
    }
}
