package j$.util;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;

/* loaded from: classes2.dex */
public interface Spliterator<T> {

    /* loaded from: classes2.dex */
    public interface OfDouble extends OfPrimitive {
        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(DoubleConsumer doubleConsumer);

        @Override // j$.util.Spliterator
        boolean tryAdvance(Consumer consumer);

        boolean tryAdvance(DoubleConsumer doubleConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        OfDouble trySplit();
    }

    /* loaded from: classes2.dex */
    public interface OfInt extends OfPrimitive {
        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(IntConsumer intConsumer);

        @Override // j$.util.Spliterator
        boolean tryAdvance(Consumer consumer);

        boolean tryAdvance(IntConsumer intConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        OfInt trySplit();
    }

    /* loaded from: classes2.dex */
    public interface OfLong extends OfPrimitive {
        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(LongConsumer longConsumer);

        @Override // j$.util.Spliterator
        boolean tryAdvance(Consumer consumer);

        boolean tryAdvance(LongConsumer longConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        OfLong trySplit();
    }

    /* loaded from: classes2.dex */
    public interface OfPrimitive extends Spliterator {
        void forEachRemaining(Object obj);

        boolean tryAdvance(Object obj);

        @Override // j$.util.Spliterator
        OfPrimitive trySplit();
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    java.util.Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer consumer);

    Spliterator trySplit();
}
