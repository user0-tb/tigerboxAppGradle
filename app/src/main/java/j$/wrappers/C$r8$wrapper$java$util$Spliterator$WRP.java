package j$.wrappers;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$Spliterator$-WRP */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$Spliterator$WRP implements Spliterator {
    final /* synthetic */ j$.util.Spliterator wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$Spliterator$WRP(j$.util.Spliterator spliterator) {
        this.wrappedValue = spliterator;
    }

    public static /* synthetic */ Spliterator convert(j$.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$Spliterator$WRP(spliterator);
    }

    @Override // java.util.Spliterator
    public /* synthetic */ int characteristics() {
        return this.wrappedValue.characteristics();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ long estimateSize() {
        return this.wrappedValue.estimateSize();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.wrappedValue.forEachRemaining(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Spliterator
    public /* synthetic */ Comparator getComparator() {
        return this.wrappedValue.getComparator();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return this.wrappedValue.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return this.wrappedValue.hasCharacteristics(i);
    }

    @Override // java.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.wrappedValue.tryAdvance(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Spliterator
    public /* synthetic */ Spliterator trySplit() {
        return convert(this.wrappedValue.trySplit());
    }
}
