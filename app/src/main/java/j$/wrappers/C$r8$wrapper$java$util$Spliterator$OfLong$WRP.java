package j$.wrappers;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$Spliterator$OfLong$-WRP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$Spliterator$OfLong$WRP implements Spliterator.OfLong {
    final /* synthetic */ Spliterator.OfLong wrappedValue;

    private /* synthetic */ C$r8$wrapper$java$util$Spliterator$OfLong$WRP(Spliterator.OfLong ofLong) {
        this.wrappedValue = ofLong;
    }

    public static /* synthetic */ Spliterator.OfLong convert(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$Spliterator$OfLong$WRP(ofLong);
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
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.wrappedValue.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.wrappedValue.forEachRemaining(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.wrappedValue.forEachRemaining(C$r8$wrapper$java$util$function$LongConsumer$VWRP.convert(longConsumer));
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
    public /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.wrappedValue.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.wrappedValue.tryAdvance(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Spliterator.OfLong
    /* renamed from: tryAdvance  reason: avoid collision after fix types in other method */
    public /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.wrappedValue.tryAdvance(C$r8$wrapper$java$util$function$LongConsumer$VWRP.convert(longConsumer));
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ Spliterator.OfLong trySplit() {
        Spliterator.OfLong trySplit = this.wrappedValue.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$Spliterator$OfLong$WRP(trySplit);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C$r8$wrapper$java$util$Spliterator$OfPrimitive$WRP.convert(this.wrappedValue.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public /* synthetic */ java.util.Spliterator trySplit() {
        return C$r8$wrapper$java$util$Spliterator$WRP.convert(this.wrappedValue.trySplit());
    }
}
