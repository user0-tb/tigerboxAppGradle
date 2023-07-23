package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.stream.Node;

/* loaded from: classes2.dex */
abstract class MatchOps$BooleanTerminalSink implements Sink {
    boolean stop;
    boolean value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MatchOps$BooleanTerminalSink(MatchOps$MatchKind matchOps$MatchKind) {
        boolean z;
        z = matchOps$MatchKind.shortCircuitResult;
        this.value = !z;
    }

    @Override // j$.util.stream.Sink, j$.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        Node.CC.$default$acceptb(this);
        throw null;
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void accept(int i) {
        Node.CC.$default$accept(this);
        throw null;
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void accept(long j) {
        Node.CC.$default$accepta(this);
        throw null;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void begin(long j) {
    }

    @Override // j$.util.stream.Sink
    public boolean cancellationRequested() {
        return this.stop;
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void end() {
    }
}
