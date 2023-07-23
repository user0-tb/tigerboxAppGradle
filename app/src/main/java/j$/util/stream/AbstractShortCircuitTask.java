package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
abstract class AbstractShortCircuitTask extends AbstractTask {
    protected volatile boolean canceled;
    protected final AtomicReference sharedResult;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractShortCircuitTask(AbstractShortCircuitTask abstractShortCircuitTask, Spliterator spliterator) {
        super(abstractShortCircuitTask, spliterator);
        this.sharedResult = abstractShortCircuitTask.sharedResult;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractShortCircuitTask(PipelineHelper pipelineHelper, Spliterator spliterator) {
        super(pipelineHelper, spliterator);
        this.sharedResult = new AtomicReference(null);
    }

    protected void cancel() {
        this.canceled = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancelLaterNodes() {
        AbstractShortCircuitTask abstractShortCircuitTask = this;
        for (AbstractShortCircuitTask abstractShortCircuitTask2 = (AbstractShortCircuitTask) getParent(); abstractShortCircuitTask2 != null; abstractShortCircuitTask2 = (AbstractShortCircuitTask) abstractShortCircuitTask2.getParent()) {
            if (abstractShortCircuitTask2.leftChild == abstractShortCircuitTask) {
                AbstractShortCircuitTask abstractShortCircuitTask3 = (AbstractShortCircuitTask) abstractShortCircuitTask2.rightChild;
                if (!abstractShortCircuitTask3.canceled) {
                    abstractShortCircuitTask3.cancel();
                }
            }
            abstractShortCircuitTask = abstractShortCircuitTask2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        r8 = r7.doLeaf();
     */
    @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void compute() {
        /*
            r10 = this;
            j$.util.Spliterator r0 = r10.spliterator
            long r1 = r0.estimateSize()
            long r3 = r10.targetSize
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto Lf
            goto L15
        Lf:
            long r3 = j$.util.stream.AbstractTask.suggestTargetSize(r1)
            r10.targetSize = r3
        L15:
            r5 = 0
            java.util.concurrent.atomic.AtomicReference r6 = r10.sharedResult
            r7 = r10
        L19:
            java.lang.Object r8 = r6.get()
            if (r8 != 0) goto L6f
            boolean r8 = r7.canceled
            if (r8 != 0) goto L34
            j$.util.stream.AbstractTask r9 = r7.getParent()
        L27:
            j$.util.stream.AbstractShortCircuitTask r9 = (j$.util.stream.AbstractShortCircuitTask) r9
            if (r8 != 0) goto L34
            if (r9 == 0) goto L34
            boolean r8 = r9.canceled
            j$.util.stream.AbstractTask r9 = r9.getParent()
            goto L27
        L34:
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.getEmptyResult()
            goto L6f
        L3b:
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 <= 0) goto L6b
            j$.util.Spliterator r1 = r0.trySplit()
            if (r1 != 0) goto L46
            goto L6b
        L46:
            j$.util.stream.AbstractTask r2 = r7.makeChild(r1)
            j$.util.stream.AbstractShortCircuitTask r2 = (j$.util.stream.AbstractShortCircuitTask) r2
            r7.leftChild = r2
            j$.util.stream.AbstractTask r8 = r7.makeChild(r0)
            j$.util.stream.AbstractShortCircuitTask r8 = (j$.util.stream.AbstractShortCircuitTask) r8
            r7.rightChild = r8
            r9 = 1
            r7.setPendingCount(r9)
            if (r5 == 0) goto L60
            r0 = r1
            r7 = r2
            r2 = r8
            goto L61
        L60:
            r7 = r8
        L61:
            r5 = r5 ^ 1
            r2.fork()
            long r1 = r0.estimateSize()
            goto L19
        L6b:
            java.lang.Object r8 = r7.doLeaf()
        L6f:
            r7.setLocalResult(r8)
            r7.tryComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.AbstractShortCircuitTask.compute():void");
    }

    protected abstract Object getEmptyResult();

    @Override // j$.util.stream.AbstractTask
    public Object getLocalResult() {
        if (isRoot()) {
            Object obj = this.sharedResult.get();
            return obj == null ? getEmptyResult() : obj;
        }
        return super.getLocalResult();
    }

    @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return getLocalResult();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractTask
    public void setLocalResult(Object obj) {
        if (!isRoot()) {
            super.setLocalResult(obj);
        } else if (obj != null) {
            this.sharedResult.compareAndSet(null, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void shortCircuit(Object obj) {
        if (obj != null) {
            this.sharedResult.compareAndSet(null, obj);
        }
    }
}
