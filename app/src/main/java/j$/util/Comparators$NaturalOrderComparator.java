package j$.util;

import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.wrappers.C$r8$wrapper$java$util$function$Function$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$ToDoubleFunction$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$ToIntFunction$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$ToLongFunction$VWRP;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public enum Comparators$NaturalOrderComparator implements java.util.Comparator, Comparator {
    INSTANCE;

    @Override // java.util.Comparator, j$.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public java.util.Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing(this, function);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function) {
        return Comparator.CC.$default$thenComparing(this, C$r8$wrapper$java$util$function$Function$VWRP.convert(function));
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, C$r8$wrapper$java$util$function$ToDoubleFunction$VWRP.convert(toDoubleFunction));
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, C$r8$wrapper$java$util$function$ToIntFunction$VWRP.convert(toIntFunction));
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, C$r8$wrapper$java$util$function$ToLongFunction$VWRP.convert(toLongFunction));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, C$r8$wrapper$java$util$function$Function$VWRP.convert(function), comparator);
    }
}
