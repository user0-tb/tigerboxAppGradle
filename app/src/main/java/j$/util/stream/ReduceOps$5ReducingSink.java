package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntBinaryOperator;
import j$.util.stream.Node;
import j$.util.stream.Sink;

/* loaded from: classes2.dex */
class ReduceOps$5ReducingSink implements ReduceOps$AccumulatingSink, Sink.OfInt {
    private int state;
    final /* synthetic */ int val$identity;
    final /* synthetic */ IntBinaryOperator val$operator;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReduceOps$5ReducingSink(int i, IntBinaryOperator intBinaryOperator) {
        this.val$identity = i;
        this.val$operator = intBinaryOperator;
    }

    @Override // j$.util.stream.Sink, j$.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        Node.CC.$default$acceptb(this);
        throw null;
    }

    @Override // j$.util.stream.Sink
    public void accept(int i) {
        this.state = this.val$operator.applyAsInt(this.state, i);
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void accept(long j) {
        Node.CC.$default$accepta(this);
        throw null;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ void accept(Integer num) {
        Node.CC.$default$accept(this, num);
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
        accept(((ReduceOps$5ReducingSink) reduceOps$AccumulatingSink).state);
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void end() {
    }

    @Override // j$.util.function.Supplier
    public Object get() {
        return Integer.valueOf(this.state);
    }
}
