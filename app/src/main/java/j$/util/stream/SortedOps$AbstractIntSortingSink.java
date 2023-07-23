package j$.util.stream;

import j$.util.stream.Sink;

/* loaded from: classes2.dex */
abstract class SortedOps$AbstractIntSortingSink extends Sink.ChainedInt {
    protected boolean cancellationWasRequested;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SortedOps$AbstractIntSortingSink(Sink sink) {
        super(sink);
    }

    @Override // j$.util.stream.Sink.ChainedInt, j$.util.stream.Sink
    public final boolean cancellationRequested() {
        this.cancellationWasRequested = true;
        return false;
    }
}
