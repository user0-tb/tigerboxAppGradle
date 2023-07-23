package j$.util.stream;

import j$.util.Optional;
import j$.util.OptionalDouble;
import j$.util.OptionalInt;
import j$.util.OptionalLong;
import j$.util.function.Consumer;
import j$.util.stream.Node;
import j$.util.stream.Sink;

/* loaded from: classes2.dex */
abstract class FindOps$FindSink implements TerminalSink {
    boolean hasValue;
    Object value;

    /* loaded from: classes2.dex */
    final class OfDouble extends FindOps$FindSink implements Sink.OfDouble {
        @Override // j$.util.stream.FindOps$FindSink, j$.util.stream.Sink, j$.util.function.DoubleConsumer
        public void accept(double d) {
            accept(Double.valueOf(d));
        }

        @Override // j$.util.function.Supplier
        public Object get() {
            if (this.hasValue) {
                return OptionalDouble.of(((Double) this.value).doubleValue());
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    final class OfInt extends FindOps$FindSink implements Sink.OfInt {
        @Override // j$.util.stream.FindOps$FindSink, j$.util.stream.Sink
        public void accept(int i) {
            accept(Integer.valueOf(i));
        }

        @Override // j$.util.function.Supplier
        public Object get() {
            if (this.hasValue) {
                return OptionalInt.of(((Integer) this.value).intValue());
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    final class OfLong extends FindOps$FindSink implements Sink.OfLong {
        @Override // j$.util.stream.FindOps$FindSink, j$.util.stream.Sink
        public void accept(long j) {
            accept(Long.valueOf(j));
        }

        @Override // j$.util.function.Supplier
        public Object get() {
            if (this.hasValue) {
                return OptionalLong.of(((Long) this.value).longValue());
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    final class OfRef extends FindOps$FindSink {
        @Override // j$.util.function.Supplier
        public Object get() {
            if (this.hasValue) {
                return Optional.of(this.value);
            }
            return null;
        }
    }

    FindOps$FindSink() {
    }

    @Override // j$.util.stream.Sink, j$.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d) {
        Node.CC.$default$acceptb(this);
        throw null;
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void accept(int i) {
        Node.CC.$default$accept(this);
        throw null;
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void accept(long j) {
        Node.CC.$default$accepta(this);
        throw null;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
        if (this.hasValue) {
            return;
        }
        this.hasValue = true;
        this.value = obj;
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void begin(long j) {
    }

    @Override // j$.util.stream.Sink
    public boolean cancellationRequested() {
        return this.hasValue;
    }

    @Override // j$.util.stream.Sink
    public /* synthetic */ void end() {
    }
}
