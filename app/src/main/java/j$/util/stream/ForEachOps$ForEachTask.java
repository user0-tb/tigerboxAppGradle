package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class ForEachOps$ForEachTask extends CountedCompleter {
    private final PipelineHelper helper;
    private final Sink sink;
    private Spliterator spliterator;
    private long targetSize;

    ForEachOps$ForEachTask(ForEachOps$ForEachTask forEachOps$ForEachTask, Spliterator spliterator) {
        super(forEachOps$ForEachTask);
        this.spliterator = spliterator;
        this.sink = forEachOps$ForEachTask.sink;
        this.targetSize = forEachOps$ForEachTask.targetSize;
        this.helper = forEachOps$ForEachTask.helper;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ForEachOps$ForEachTask(PipelineHelper pipelineHelper, Spliterator spliterator, Sink sink) {
        super(null);
        this.sink = sink;
        this.helper = pipelineHelper;
        this.spliterator = spliterator;
        this.targetSize = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.spliterator;
        long estimateSize = spliterator.estimateSize();
        long j = this.targetSize;
        if (j == 0) {
            j = AbstractTask.suggestTargetSize(estimateSize);
            this.targetSize = j;
        }
        boolean isKnown = StreamOpFlag.SHORT_CIRCUIT.isKnown(this.helper.getStreamAndOpFlags());
        boolean z = false;
        Sink sink = this.sink;
        ForEachOps$ForEachTask forEachOps$ForEachTask = this;
        while (true) {
            if (isKnown && sink.cancellationRequested()) {
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                ForEachOps$ForEachTask forEachOps$ForEachTask2 = new ForEachOps$ForEachTask(forEachOps$ForEachTask, trySplit);
                forEachOps$ForEachTask.addToPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                } else {
                    ForEachOps$ForEachTask forEachOps$ForEachTask3 = forEachOps$ForEachTask;
                    forEachOps$ForEachTask = forEachOps$ForEachTask2;
                    forEachOps$ForEachTask2 = forEachOps$ForEachTask3;
                }
                z = !z;
                forEachOps$ForEachTask.fork();
                forEachOps$ForEachTask = forEachOps$ForEachTask2;
                estimateSize = spliterator.estimateSize();
            }
        }
        forEachOps$ForEachTask.helper.copyInto(sink, spliterator);
        forEachOps$ForEachTask.spliterator = null;
        forEachOps$ForEachTask.propagateCompletion();
    }
}
