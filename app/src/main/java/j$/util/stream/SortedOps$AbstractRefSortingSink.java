package j$.util.stream;

import j$.util.stream.Sink;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class SortedOps$AbstractRefSortingSink extends Sink.ChainedReference {
    protected boolean cancellationWasRequested;
    protected final Comparator comparator;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SortedOps$AbstractRefSortingSink(Sink sink, Comparator comparator) {
        super(sink);
        this.comparator = comparator;
    }

    @Override // j$.util.stream.Sink.ChainedReference, j$.util.stream.Sink
    public final boolean cancellationRequested() {
        this.cancellationWasRequested = true;
        return false;
    }
}
