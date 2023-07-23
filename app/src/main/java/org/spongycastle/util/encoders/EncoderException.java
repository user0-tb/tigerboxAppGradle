package org.spongycastle.util.encoders;

/* loaded from: classes4.dex */
public class EncoderException extends IllegalStateException {
    private Throwable cause;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EncoderException(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
