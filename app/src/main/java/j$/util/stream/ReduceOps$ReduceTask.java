package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class ReduceOps$ReduceTask extends AbstractTask {
    private final ReduceOps$ReduceOp op;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReduceOps$ReduceTask(ReduceOps$ReduceOp reduceOps$ReduceOp, PipelineHelper pipelineHelper, Spliterator spliterator) {
        super(pipelineHelper, spliterator);
        this.op = reduceOps$ReduceOp;
    }

    ReduceOps$ReduceTask(ReduceOps$ReduceTask reduceOps$ReduceTask, Spliterator spliterator) {
        super(reduceOps$ReduceTask, spliterator);
        this.op = reduceOps$ReduceTask.op;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractTask
    public Object doLeaf() {
        PipelineHelper pipelineHelper = this.helper;
        ReduceOps$AccumulatingSink makeSink = this.op.makeSink();
        pipelineHelper.wrapAndCopyInto(makeSink, this.spliterator);
        return makeSink;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractTask
    public AbstractTask makeChild(Spliterator spliterator) {
        return new ReduceOps$ReduceTask(this, spliterator);
    }

    @Override // j$.util.stream.AbstractTask, java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        if (!isLeaf()) {
            ReduceOps$AccumulatingSink reduceOps$AccumulatingSink = (ReduceOps$AccumulatingSink) ((ReduceOps$ReduceTask) this.leftChild).getLocalResult();
            reduceOps$AccumulatingSink.combine((ReduceOps$AccumulatingSink) ((ReduceOps$ReduceTask) this.rightChild).getLocalResult());
            setLocalResult(reduceOps$AccumulatingSink);
        }
        this.spliterator = null;
        this.rightChild = null;
        this.leftChild = null;
    }
}
