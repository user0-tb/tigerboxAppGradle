package j$.wrappers;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$Spliterator$OfDouble$-WRP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$Spliterator$OfDouble$WRP implements Spliterator.OfDouble {
    final /* synthetic */ Spliterator.OfDouble wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$Spliterator$OfDouble$WRP(Spliterator.OfDouble ofDouble) {
        this.wrappedValue = ofDouble;
    }

    public static /* synthetic */ Spliterator.OfDouble convert(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$Spliterator$OfDouble$WRP(ofDouble);
    }

    @Override // java.util.Spliterator
    public /* synthetic */ int characteristics() {
        return this.wrappedValue.characteristics();
    }

    @Override // java.util.Spliterator
    public /* synthetic */ long estimateSize() {
        return this.wrappedValue.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.wrappedValue.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.wrappedValue.forEachRemaining(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.wrappedValue.forEachRemaining(C$r8$wrapper$java$util$function$DoubleConsumer$VWRP.convert(doubleConsumer));
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

    @Override // java.util.Spliterator.OfPrimitive
    public /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.wrappedValue.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.wrappedValue.tryAdvance(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Spliterator.OfDouble
    /* renamed from: tryAdvance  reason: avoid collision after fix types in other method */
    public /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.wrappedValue.tryAdvance(C$r8$wrapper$java$util$function$DoubleConsumer$VWRP.convert(doubleConsumer));
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ Spliterator.OfDouble trySplit() {
        Spliterator.OfDouble trySplit = this.wrappedValue.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$Spliterator$OfDouble$WRP(trySplit);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C$r8$wrapper$java$util$Spliterator$OfPrimitive$WRP.convert(this.wrappedValue.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ java.util.Spliterator trySplit() {
        return C$r8$wrapper$java$util$Spliterator$WRP.convert(this.wrappedValue.trySplit());
    }
}
