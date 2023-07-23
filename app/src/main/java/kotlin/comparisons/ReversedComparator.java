package kotlin.comparisons;

import androidx.exifinterface.media.ExifInterface;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.wrappers.C$r8$wrapper$java$util$function$Function$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$ToDoubleFunction$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$ToIntFunction$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$ToLongFunction$VWRP;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0003B\u001d\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlin/comparisons/ReversedComparator;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Ljava/util/Comparator;)V", "getComparator", "()Ljava/util/Comparator;", "compare", "", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;)I", "reversed", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
final class ReversedComparator<T> implements Comparator<T>, j$.util.Comparator {
    private final Comparator<T> comparator;

    @Override // j$.util.Comparator
    public /* synthetic */ Comparator thenComparing(Function function) {
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
        return thenComparing(C$r8$wrapper$java$util$function$Function$VWRP.convert(function));
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
        return thenComparing(C$r8$wrapper$java$util$function$Function$VWRP.convert(function), comparator);
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return thenComparingDouble(C$r8$wrapper$java$util$function$ToDoubleFunction$VWRP.convert(toDoubleFunction));
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingInt(java.util.function.ToIntFunction toIntFunction) {
        return thenComparingInt(C$r8$wrapper$java$util$function$ToIntFunction$VWRP.convert(toIntFunction));
    }

    @Override // j$.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public /* synthetic */ java.util.Comparator thenComparingLong(java.util.function.ToLongFunction toLongFunction) {
        return thenComparingLong(C$r8$wrapper$java$util$function$ToLongFunction$VWRP.convert(toLongFunction));
    }

    public ReversedComparator(java.util.Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.comparator = comparator;
    }

    public final java.util.Comparator<T> getComparator() {
        return this.comparator;
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public int compare(T t, T t2) {
        return this.comparator.compare(t2, t);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final java.util.Comparator<T> reversed() {
        return this.comparator;
    }
}
