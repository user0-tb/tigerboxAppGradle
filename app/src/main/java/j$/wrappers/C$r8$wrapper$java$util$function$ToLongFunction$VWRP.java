package j$.wrappers;

import j$.util.function.ToLongFunction;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$function$ToLongFunction$-V-WRP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$function$ToLongFunction$VWRP implements ToLongFunction {
    final /* synthetic */ java.util.function.ToLongFunction wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$function$ToLongFunction$VWRP(java.util.function.ToLongFunction toLongFunction) {
        this.wrappedValue = toLongFunction;
    }

    public static /* synthetic */ ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
        if (toLongFunction == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$function$ToLongFunction$VWRP(toLongFunction);
    }

    @Override // j$.util.function.ToLongFunction
    public /* synthetic */ long applyAsLong(Object obj) {
        return this.wrappedValue.applyAsLong(obj);
    }
}
