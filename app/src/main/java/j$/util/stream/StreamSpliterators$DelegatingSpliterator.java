package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;
import j$.util.function.Supplier;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class StreamSpliterators$DelegatingSpliterator implements Spliterator {
    private Spliterator s;
    private final Supplier supplier;

    /* loaded from: classes2.dex */
    final class OfDouble extends OfPrimitive implements Spliterator.OfDouble {
        /* JADX INFO: Access modifiers changed from: package-private */
        public OfDouble(Supplier supplier) {
            super(supplier);
        }

        @Override // j$.util.Spliterator.OfDouble
        public void forEachRemaining(DoubleConsumer doubleConsumer) {
            ((Spliterator.OfPrimitive) get()).forEachRemaining(doubleConsumer);
        }
    }

    /* loaded from: classes2.dex */
    final class OfInt extends OfPrimitive implements Spliterator.OfInt {
        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt(Supplier supplier) {
            super(supplier);
        }

        @Override // j$.util.Spliterator.OfInt
        public void forEachRemaining(IntConsumer intConsumer) {
            ((Spliterator.OfPrimitive) get()).forEachRemaining(intConsumer);
        }
    }

    /* loaded from: classes2.dex */
    final class OfLong extends OfPrimitive implements Spliterator.OfLong {
        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong(Supplier supplier) {
            super(supplier);
        }

        @Override // j$.util.Spliterator.OfLong
        public void forEachRemaining(LongConsumer longConsumer) {
            ((Spliterator.OfPrimitive) get()).forEachRemaining(longConsumer);
        }
    }

    /* loaded from: classes2.dex */
    abstract class OfPrimitive extends StreamSpliterators$DelegatingSpliterator implements Spliterator.OfPrimitive {
        OfPrimitive(Supplier supplier) {
            super(supplier);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public void forEachRemaining(Object obj) {
            ((Spliterator.OfPrimitive) get()).forEachRemaining(obj);
        }

        public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
            return tryAdvance((Object) doubleConsumer);
        }

        public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
            return tryAdvance((Object) intConsumer);
        }

        public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
            return tryAdvance((Object) longConsumer);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public boolean tryAdvance(Object obj) {
            return ((Spliterator.OfPrimitive) get()).tryAdvance(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreamSpliterators$DelegatingSpliterator(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return get().characteristics();
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        return get().estimateSize();
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        get().forEachRemaining(consumer);
    }

    Spliterator get() {
        if (this.s == null) {
            this.s = (Spliterator) this.supplier.get();
        }
        return this.s;
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        return get().getComparator();
    }

    @Override // j$.util.Spliterator
    public long getExactSizeIfKnown() {
        return get().getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i) {
        return Objects.$default$hasCharacteristics(this, i);
    }

    public String toString() {
        return getClass().getName() + "[" + get() + "]";
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        return get().tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
        return (Spliterator.OfDouble) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return (Spliterator.OfPrimitive) trySplit();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        return get().trySplit();
    }
}
