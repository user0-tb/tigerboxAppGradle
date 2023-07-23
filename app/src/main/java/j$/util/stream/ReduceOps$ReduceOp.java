package j$.util.stream;

import j$.util.Spliterator;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class ReduceOps$ReduceOp implements TerminalOp {
    private final StreamShape inputShape;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReduceOps$ReduceOp(StreamShape streamShape) {
        this.inputShape = streamShape;
    }

    @Override // j$.util.stream.TerminalOp
    public Object evaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator) {
        return ((ReduceOps$AccumulatingSink) new ReduceOps$ReduceTask(this, pipelineHelper, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.TerminalOp
    public Object evaluateSequential(PipelineHelper pipelineHelper, Spliterator spliterator) {
        ReduceOps$AccumulatingSink makeSink = makeSink();
        AbstractPipeline abstractPipeline = (AbstractPipeline) pipelineHelper;
        Objects.requireNonNull(makeSink);
        abstractPipeline.copyInto(abstractPipeline.wrapSink(makeSink), spliterator);
        return makeSink.get();
    }

    @Override // j$.util.stream.TerminalOp
    public /* synthetic */ int getOpFlags() {
        return 0;
    }

    public abstract ReduceOps$AccumulatingSink makeSink();
}
