package org.spongycastle.jce.provider;

import org.spongycastle.jce.exception.ExtException;

/* loaded from: classes4.dex */
public class AnnotatedException extends Exception implements ExtException {
    private Throwable _underlyingException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnnotatedException(String str, Throwable th) {
        super(str);
        this._underlyingException = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnnotatedException(String str) {
        this(str, null);
    }

    Throwable getUnderlyingException() {
        return this._underlyingException;
    }

    @Override // java.lang.Throwable, org.spongycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this._underlyingException;
    }
}
