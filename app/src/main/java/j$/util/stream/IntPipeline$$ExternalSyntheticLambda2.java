package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class IntPipeline$$ExternalSyntheticLambda2 implements BinaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BiConsumer f$0;

    public /* synthetic */ IntPipeline$$ExternalSyntheticLambda2(BiConsumer biConsumer, int i) {
        this.$r8$classId = i;
        if (i == 1) {
            this.f$0 = biConsumer;
        } else if (i != 2) {
            this.f$0 = biConsumer;
        } else {
            this.f$0 = biConsumer;
        }
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.accept(obj, obj2);
                return obj;
            case 1:
                this.f$0.accept(obj, obj2);
                return obj;
            default:
                this.f$0.accept(obj, obj2);
                return obj;
        }
    }
}
