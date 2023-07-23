package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;

/* loaded from: classes2.dex */
abstract class StreamSpliterators$ArrayBuffer {
    int index;

    /* loaded from: classes2.dex */
    final class OfDouble extends OfPrimitive implements DoubleConsumer {
        final double[] array;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfDouble(int i) {
            this.array = new double[i];
        }

        @Override // j$.util.function.DoubleConsumer
        public void accept(double d) {
            double[] dArr = this.array;
            int i = ((OfPrimitive) this).index;
            ((OfPrimitive) this).index = i + 1;
            dArr[i] = d;
        }

        @Override // j$.util.stream.StreamSpliterators$ArrayBuffer.OfPrimitive
        void forEach(Object obj, long j) {
            DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
            for (int i = 0; i < j; i++) {
                doubleConsumer.accept(this.array[i]);
            }
        }
    }

    /* loaded from: classes2.dex */
    final class OfInt extends OfPrimitive implements IntConsumer {
        final int[] array;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfInt(int i) {
            this.array = new int[i];
        }

        @Override // j$.util.function.IntConsumer
        public void accept(int i) {
            int[] iArr = this.array;
            int i2 = ((OfPrimitive) this).index;
            ((OfPrimitive) this).index = i2 + 1;
            iArr[i2] = i;
        }

        @Override // j$.util.stream.StreamSpliterators$ArrayBuffer.OfPrimitive
        public void forEach(Object obj, long j) {
            IntConsumer intConsumer = (IntConsumer) obj;
            for (int i = 0; i < j; i++) {
                intConsumer.accept(this.array[i]);
            }
        }
    }

    /* loaded from: classes2.dex */
    final class OfLong extends OfPrimitive implements LongConsumer {
        final long[] array;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfLong(int i) {
            this.array = new long[i];
        }

        @Override // j$.util.function.LongConsumer
        public void accept(long j) {
            long[] jArr = this.array;
            int i = ((OfPrimitive) this).index;
            ((OfPrimitive) this).index = i + 1;
            jArr[i] = j;
        }

        @Override // j$.util.stream.StreamSpliterators$ArrayBuffer.OfPrimitive
        public void forEach(Object obj, long j) {
            LongConsumer longConsumer = (LongConsumer) obj;
            for (int i = 0; i < j; i++) {
                longConsumer.accept(this.array[i]);
            }
        }
    }

    /* loaded from: classes2.dex */
    abstract class OfPrimitive extends StreamSpliterators$ArrayBuffer {
        int index;

        OfPrimitive() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void forEach(Object obj, long j);
    }

    /* loaded from: classes2.dex */
    final class OfRef extends StreamSpliterators$ArrayBuffer implements Consumer {
        final Object[] array;

        /* JADX INFO: Access modifiers changed from: package-private */
        public OfRef(int i) {
            this.array = new Object[i];
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            Object[] objArr = this.array;
            int i = this.index;
            this.index = i + 1;
            objArr[i] = obj;
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    StreamSpliterators$ArrayBuffer() {
    }
}
