package j$.wrappers;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$Spliterator$OfInt$-WRP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$Spliterator$OfInt$WRP implements Spliterator.OfInt {
    final /* synthetic */ Spliterator.OfInt wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$Spliterator$OfInt$WRP(Spliterator.OfInt ofInt) {
        this.wrappedValue = ofInt;
    }

    public static /* synthetic */ Spliterator.OfInt convert(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$Spliterator$OfInt$WRP(ofInt);
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
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.wrappedValue.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.wrappedValue.forEachRemaining(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.wrappedValue.forEachRemaining(C$r8$wrapper$java$util$function$IntConsumer$VWRP.convert(intConsumer));
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
    public /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.wrappedValue.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.wrappedValue.tryAdvance(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Spliterator.OfInt
    /* renamed from: tryAdvance  reason: avoid collision after fix types in other method */
    public /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.wrappedValue.tryAdvance(C$r8$wrapper$java$util$function$IntConsumer$VWRP.convert(intConsumer));
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ Spliterator.OfInt trySplit() {
        Spliterator.OfInt trySplit = this.wrappedValue.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$Spliterator$OfInt$WRP(trySplit);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C$r8$wrapper$java$util$Spliterator$OfPrimitive$WRP.convert(this.wrappedValue.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ java.util.Spliterator trySplit() {
        return C$r8$wrapper$java$util$Spliterator$WRP.convert(this.wrappedValue.trySplit());
    }
}
