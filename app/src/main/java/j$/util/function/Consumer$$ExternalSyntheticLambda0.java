package j$.util.function;

import j$.util.function.Consumer;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class Consumer$$ExternalSyntheticLambda0 implements Consumer, BiConsumer {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Consumer$$ExternalSyntheticLambda0(Consumer consumer, Consumer consumer2) {
        this.f$0 = consumer;
        this.f$1 = consumer2;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.f$0).accept(obj);
        ((Consumer) this.f$1).accept(obj);
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Consumer$$ExternalSyntheticLambda0(ConcurrentMap concurrentMap, BiFunction biFunction) {
        this.f$0 = concurrentMap;
        this.f$1 = biFunction;
    }

    @Override // j$.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        ConcurrentMap concurrentMap = (ConcurrentMap) this.f$0;
        BiFunction biFunction = (BiFunction) this.f$1;
        while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
        }
    }
}
