package org.spongycastle.util.test;

import java.io.PrintStream;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public abstract class SimpleTest implements Test {
    @Override // org.spongycastle.util.test.Test
    public abstract String getName();

    public abstract void performTest() throws Exception;

    private TestResult success() {
        return SimpleTestResult.successful(this, "Okay");
    }

    protected void fail(String str) {
        throw new TestFailedException(SimpleTestResult.failed(this, str));
    }

    protected void fail(String str, Throwable th) {
        throw new TestFailedException(SimpleTestResult.failed(this, str, th));
    }

    protected void fail(String str, Object obj, Object obj2) {
        throw new TestFailedException(SimpleTestResult.failed(this, str, obj, obj2));
    }

    protected boolean areEqual(byte[] bArr, byte[] bArr2) {
        return Arrays.areEqual(bArr, bArr2);
    }

    @Override // org.spongycastle.util.test.Test
    public TestResult perform() {
        try {
            performTest();
            return success();
        } catch (TestFailedException e) {
            return e.getResult();
        } catch (Exception e2) {
            return SimpleTestResult.failed(this, "Exception: " + e2, e2);
        }
    }

    protected static void runTest(Test test) {
        runTest(test, System.out);
    }

    protected static void runTest(Test test, PrintStream printStream) {
        TestResult perform = test.perform();
        printStream.println(perform.toString());
        if (perform.getException() != null) {
            perform.getException().printStackTrace(printStream);
        }
    }
}
