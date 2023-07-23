package j$.util.stream;

import j$.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class LongPipeline$$ExternalSyntheticLambda7 implements LongConsumer {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;

    @Override // j$.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.$r8$classId) {
            case 0:
                ((Sink) this.f$0).accept(j);
                return;
            default:
                ((LongPipeline$1$1) this.f$0).downstream.accept(j);
                return;
        }
    }
}
