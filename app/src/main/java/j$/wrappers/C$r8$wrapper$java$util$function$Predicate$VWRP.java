package j$.wrappers;

import j$.util.function.Predicate;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$function$Predicate$-V-WRP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$function$Predicate$VWRP implements Predicate {
    final /* synthetic */ java.util.function.Predicate wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$function$Predicate$VWRP(java.util.function.Predicate predicate) {
        this.wrappedValue = predicate;
    }

    public static /* synthetic */ Predicate convert(java.util.function.Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof C$r8$wrapper$java$util$function$Predicate$WRP ? ((C$r8$wrapper$java$util$function$Predicate$WRP) predicate).wrappedValue : new C$r8$wrapper$java$util$function$Predicate$VWRP(predicate);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return convert(this.wrappedValue.and(C$r8$wrapper$java$util$function$Predicate$WRP.convert(predicate)));
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return convert(this.wrappedValue.negate());
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return convert(this.wrappedValue.or(C$r8$wrapper$java$util$function$Predicate$WRP.convert(predicate)));
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ boolean test(Object obj) {
        return this.wrappedValue.test(obj);
    }
}
