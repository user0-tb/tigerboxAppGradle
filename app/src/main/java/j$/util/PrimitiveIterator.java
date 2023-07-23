package j$.util;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;

/* loaded from: classes2.dex */
public interface PrimitiveIterator extends java.util.Iterator {

    /* loaded from: classes2.dex */
    public interface OfDouble extends PrimitiveIterator {
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(DoubleConsumer doubleConsumer);

        @Override // java.util.Iterator
        Double next();

        double nextDouble();
    }

    /* loaded from: classes2.dex */
    public interface OfInt extends PrimitiveIterator {
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(IntConsumer intConsumer);

        @Override // java.util.Iterator
        Integer next();

        int nextInt();
    }

    /* loaded from: classes2.dex */
    public interface OfLong extends PrimitiveIterator {
        void forEachRemaining(Consumer consumer);

        void forEachRemaining(LongConsumer longConsumer);

        @Override // java.util.Iterator
        Long next();

        long nextLong();
    }

    void forEachRemaining(Object obj);
}
