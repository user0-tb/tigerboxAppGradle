package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.DoubleBinaryOperator;
import j$.util.stream.Node;
import j$.util.stream.Sink;

/* loaded from: classes2.dex */
class ReduceOps$11ReducingSink implements ReduceOps$AccumulatingSink, Sink.OfDouble {
    private double state;
    final /* synthetic */ double val$identity;
    final /* synthetic */ DoubleBinaryOperator val$operator;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReduceOps$11ReducingSink(double d, DoubleBinaryOperator doubleBinaryOperator) {
        this.val$identity = d;
        this.val$operator = doubleBinaryOperator;
    }

    @Override // j$.util.stream.Sink, j$.util.function.DoubleConsumer
    public void accept(double d) {
        this.state = this.val$operator.applyAsDouble(this.state, d);
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
    public /* synthetic */ void accept(Double d) {
        Node.CC.$default$accept(this, d);
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
        accept(((ReduceOps$11ReducingSink) reduceOps$AccumulatingSink).state);
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void end() {
    }

    @Override // j$.util.function.Supplier
    public Object get() {
        return Double.valueOf(this.state);
    }
}
