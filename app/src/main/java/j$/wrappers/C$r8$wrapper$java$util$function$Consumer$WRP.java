package j$.wrappers;

import java.util.function.Consumer;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$function$Consumer$-WRP */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$function$Consumer$WRP implements Consumer {
    final /* synthetic */ j$.util.function.Consumer wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$function$Consumer$WRP(j$.util.function.Consumer consumer) {
        this.wrappedValue = consumer;
    }

    public static /* synthetic */ Consumer convert(j$.util.function.Consumer consumer) {
        if (consumer == null) {
            return null;
        }
        return consumer instanceof C$r8$wrapper$java$util$function$Consumer$VWRP ? ((C$r8$wrapper$java$util$function$Consumer$VWRP) consumer).wrappedValue : new C$r8$wrapper$java$util$function$Consumer$WRP(consumer);
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ void accept(Object obj) {
        this.wrappedValue.accept(obj);
    }

    @Override // java.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return convert(this.wrappedValue.andThen(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer)));
    }
}
