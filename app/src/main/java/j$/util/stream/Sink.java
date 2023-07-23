package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;
import j$.util.stream.Node;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface Sink extends Consumer {

    /* loaded from: classes2.dex */
    public abstract class ChainedDouble implements OfDouble {
        protected final Sink downstream;

        public ChainedDouble(Sink sink) {
            Objects.requireNonNull(sink);
            this.downstream = sink;
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
        public /* synthetic */ void accept(Double d) {
            Node.CC.$default$accept(this, d);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    public abstract class ChainedInt implements OfInt {
        protected final Sink downstream;

        public ChainedInt(Sink sink) {
            Objects.requireNonNull(sink);
            this.downstream = sink;
        }

        @Override // j$.util.stream.Sink, j$.util.function.DoubleConsumer
        public /* synthetic */ void accept(double d) {
            Node.CC.$default$acceptb(this);
            throw null;
        }

        @Override // j$.util.stream.Sink
        public /* synthetic */ void accept(long j) {
            Node.CC.$default$accepta(this);
            throw null;
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ void accept(Integer num) {
            Node.CC.$default$accept(this, num);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    public abstract class ChainedLong implements OfLong {
        protected final Sink downstream;

        public ChainedLong(Sink sink) {
            Objects.requireNonNull(sink);
            this.downstream = sink;
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

        @Override // j$.util.function.Consumer
        public /* synthetic */ void accept(Long l) {
            Node.CC.$default$accept(this, l);
        }

        @Override // j$.util.function.Consumer
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    public abstract class ChainedReference implements Sink {
        protected final Sink downstream;

        public ChainedReference(Sink sink) {
            Objects.requireNonNull(sink);
            this.downstream = sink;
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
        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.stream.Sink
        public boolean cancellationRequested() {
            return this.downstream.cancellationRequested();
        }

        @Override // j$.util.stream.Sink
        public void end() {
            this.downstream.end();
        }
    }

    /* loaded from: classes2.dex */
    public interface OfDouble extends Sink, DoubleConsumer {
        @Override // j$.util.stream.Sink, j$.util.function.DoubleConsumer
        void accept(double d);
    }

    /* loaded from: classes2.dex */
    public interface OfInt extends Sink, IntConsumer {
        @Override // j$.util.stream.Sink
        void accept(int i);
    }

    /* loaded from: classes2.dex */
    public interface OfLong extends Sink, LongConsumer {
        @Override // j$.util.stream.Sink
        void accept(long j);
    }

    void accept(double d);

    void accept(int i);

    void accept(long j);

    void begin(long j);

    boolean cancellationRequested();

    void end();
}
