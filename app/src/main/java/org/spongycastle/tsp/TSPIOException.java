package org.spongycastle.tsp;

import java.io.IOException;

/* loaded from: classes4.dex */
public class TSPIOException extends IOException {
    Throwable underlyingException;

    public TSPIOException(String str) {
        super(str);
    }

    public TSPIOException(String str, Throwable th) {
        super(str);
        this.underlyingException = th;
    }

    public Exception getUnderlyingException() {
        return (Exception) this.underlyingException;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.underlyingException;
    }
}
