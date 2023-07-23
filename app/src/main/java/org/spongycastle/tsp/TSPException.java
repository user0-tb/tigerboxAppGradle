package org.spongycastle.tsp;

/* loaded from: classes4.dex */
public class TSPException extends Exception {
    Throwable underlyingException;

    public TSPException(String str) {
        super(str);
    }

    public TSPException(String str, Throwable th) {
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
