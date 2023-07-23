package j$.util.stream;

import j$.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
class ReduceOps$5 extends ReduceOps$ReduceOp {
    final /* synthetic */ int val$identity;
    final /* synthetic */ IntBinaryOperator val$operator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReduceOps$5(StreamShape streamShape, IntBinaryOperator intBinaryOperator, int i) {
        super(streamShape);
        this.val$operator = intBinaryOperator;
        this.val$identity = i;
    }

    @Override // j$.util.stream.ReduceOps$ReduceOp
    public ReduceOps$AccumulatingSink makeSink() {
        return new ReduceOps$5ReducingSink(this.val$identity, this.val$operator);
    }
}
