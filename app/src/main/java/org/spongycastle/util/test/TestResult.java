package org.spongycastle.util.test;

/* loaded from: classes4.dex */
public interface TestResult {
    Throwable getException();

    boolean isSuccessful();

    String toString();
}
