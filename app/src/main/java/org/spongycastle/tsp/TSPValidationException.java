package org.spongycastle.tsp;

/* loaded from: classes4.dex */
public class TSPValidationException extends TSPException {
    private int failureCode;

    public TSPValidationException(String str) {
        super(str);
        this.failureCode = -1;
    }

    public TSPValidationException(String str, int i) {
        super(str);
        this.failureCode = -1;
        this.failureCode = i;
    }

    public int getFailureCode() {
        return this.failureCode;
    }
}
