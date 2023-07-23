package j$.wrappers;

import j$.util.function.Function;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$function$Function$-V-WRP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$function$Function$VWRP implements Function {
    final /* synthetic */ java.util.function.Function wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$function$Function$VWRP(java.util.function.Function function) {
        this.wrappedValue = function;
    }

    public static /* synthetic */ Function convert(java.util.function.Function function) {
        if (function == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$function$Function$VWRP(function);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Object apply(Object obj) {
        return this.wrappedValue.apply(obj);
    }
}
