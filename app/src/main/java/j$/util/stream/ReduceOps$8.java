package j$.util.stream;

import j$.util.function.LongBinaryOperator;

/* loaded from: classes2.dex */
class ReduceOps$8 extends ReduceOps$ReduceOp {
    final /* synthetic */ long val$identity;
    final /* synthetic */ LongBinaryOperator val$operator;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReduceOps$8(StreamShape streamShape, LongBinaryOperator longBinaryOperator, long j) {
        super(streamShape);
        this.val$operator = longBinaryOperator;
        this.val$identity = j;
    }

    @Override // j$.util.stream.ReduceOps$ReduceOp
    public ReduceOps$AccumulatingSink makeSink() {
        return new ReduceOps$8ReducingSink(this.val$identity, this.val$operator);
    }
}
