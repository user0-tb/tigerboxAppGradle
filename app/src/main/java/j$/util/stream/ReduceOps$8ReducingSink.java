package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.LongBinaryOperator;
import j$.util.stream.Node;
import j$.util.stream.Sink;

/* loaded from: classes2.dex */
class ReduceOps$8ReducingSink implements ReduceOps$AccumulatingSink, Sink.OfLong {
    private long state;
    final /* synthetic */ long val$identity;
    final /* synthetic */ LongBinaryOperator val$operator;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReduceOps$8ReducingSink(long j, LongBinaryOperator longBinaryOperator) {
        this.val$identity = j;
        this.val$operator = longBinaryOperator;
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
    public void accept(long j) {
        this.state = this.val$operator.applyAsLong(this.state, j);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ void accept(Long l) {
        Node.CC.$default$accept(this, l);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Sink
    public void begin(long j) {
        this.state = this.val$identity;
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ boolean cancellationRequested() {
        return false;
    }

    @Override // j$.util.stream.ReduceOps$AccumulatingSink
    public void combine(ReduceOps$AccumulatingSink reduceOps$AccumulatingSink) {
        accept(((ReduceOps$8ReducingSink) reduceOps$AccumulatingSink).state);
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void end() {
    }

    @Override // j$.util.function.Supplier
    public Object get() {
        return Long.valueOf(this.state);
    }
}
