package j$.util.stream;

import j$.util.function.IntConsumer;
import j$.util.stream.IntPipeline;

/* loaded from: classes2.dex */
public final /* synthetic */ class IntPipeline$$ExternalSyntheticLambda6 implements IntConsumer {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;

    @Override // j$.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.$r8$classId) {
            case 0:
                ((Sink) this.f$0).accept(i);
                return;
            default:
                ((IntPipeline.AnonymousClass1.C00361) this.f$0).downstream.accept(i);
                return;
        }
    }
}
