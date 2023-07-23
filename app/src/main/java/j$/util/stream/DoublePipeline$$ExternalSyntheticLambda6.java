package j$.util.stream;

import j$.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class DoublePipeline$$ExternalSyntheticLambda6 implements DoubleConsumer {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;

    @Override // j$.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.$r8$classId) {
            case 0:
                ((Sink) this.f$0).accept(d);
                return;
            default:
                ((DoublePipeline$1$1) this.f$0).downstream.accept(d);
                return;
        }
    }
}
