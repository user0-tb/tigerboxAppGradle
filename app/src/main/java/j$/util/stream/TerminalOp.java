package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
interface TerminalOp {
    Object evaluateParallel(PipelineHelper pipelineHelper, Spliterator spliterator);

    Object evaluateSequential(PipelineHelper pipelineHelper, Spliterator spliterator);

    int getOpFlags();
}
