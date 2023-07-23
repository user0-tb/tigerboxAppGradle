package j$.wrappers;

import j$.util.function.BiConsumer;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$function$BiConsumer$-V-WRP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$function$BiConsumer$VWRP implements BiConsumer {
    final /* synthetic */ java.util.function.BiConsumer wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$function$BiConsumer$VWRP(java.util.function.BiConsumer biConsumer) {
        this.wrappedValue = biConsumer;
    }

    public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$function$BiConsumer$VWRP(biConsumer);
    }

    @Override // j$.util.function.BiConsumer
    public /* synthetic */ void accept(Object obj, Object obj2) {
        this.wrappedValue.accept(obj, obj2);
    }
}
