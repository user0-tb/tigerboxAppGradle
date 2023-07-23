package j$.util.stream;

import j$.lang.Iterable$CC$$IA$1;
import j$.lang.Iterable$CC$$IA$2;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.IntFunction;
import j$.util.function.LongConsumer;
import j$.util.function.Predicate;
import j$.util.stream.Sink;
import j$.wrappers.C$r8$wrapper$java$util$function$IntPredicate$VWRP;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface Node {

    /* renamed from: j$.util.stream.Node$-CC */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static void $default$accept(Sink.OfDouble ofDouble, Double d) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(ofDouble.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
                throw null;
            } else {
                ofDouble.accept(d.doubleValue());
            }
        }

        public static void $default$accept(Sink.OfInt ofInt, Integer num) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(ofInt.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
                throw null;
            } else {
                ofInt.accept(num.intValue());
            }
        }

        public static void $default$accept(Sink.OfLong ofLong, Long l) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(ofLong.getClass(), "{0} calling Sink.OfLong.accept(Long)");
                throw null;
            } else {
                ofLong.accept(l.longValue());
            }
        }

        public static void $default$accept(Sink sink) {
            throw new IllegalStateException("called wrong accept method");
        }

        public static void $default$accepta(Sink sink) {
            throw new IllegalStateException("called wrong accept method");
        }

        public static void $default$acceptb(Sink sink) {
            throw new IllegalStateException("called wrong accept method");
        }

        public static Object[] $default$asArray(OfPrimitive ofPrimitive, IntFunction intFunction) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(ofPrimitive.getClass(), "{0} calling Node.OfPrimitive.asArray");
                throw null;
            } else if (ofPrimitive.count() < 2147483639) {
                Object[] objArr = (Object[]) intFunction.apply((int) ofPrimitive.count());
                ofPrimitive.copyInto(objArr, 0);
                return objArr;
            } else {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
        }

        public static void $default$copyInto(OfDouble ofDouble, Double[] dArr, int i) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(ofDouble.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
                throw null;
            }
            double[] dArr2 = (double[]) ofDouble.asPrimitiveArray();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
        }

        public static void $default$copyInto(OfInt ofInt, Integer[] numArr, int i) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(ofInt.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
                throw null;
            }
            int[] iArr = (int[]) ofInt.asPrimitiveArray();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
        }

        public static void $default$copyInto(OfLong ofLong, Long[] lArr, int i) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(ofLong.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
                throw null;
            }
            long[] jArr = (long[]) ofLong.asPrimitiveArray();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                lArr[i + i2] = Long.valueOf(jArr[i2]);
            }
        }

        public static void $default$forEach(OfDouble ofDouble, Consumer consumer) {
            if (consumer instanceof DoubleConsumer) {
                ofDouble.forEach((DoubleConsumer) consumer);
            } else if (Tripwire.ENABLED) {
                Tripwire.trip(ofDouble.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            } else {
                ((Spliterator.OfDouble) ofDouble.spliterator()).forEachRemaining(consumer);
            }
        }

        public static void $default$forEach(OfInt ofInt, Consumer consumer) {
            if (consumer instanceof IntConsumer) {
                ofInt.forEach((IntConsumer) consumer);
            } else if (Tripwire.ENABLED) {
                Tripwire.trip(ofInt.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            } else {
                ((Spliterator.OfInt) ofInt.spliterator()).forEachRemaining(consumer);
            }
        }

        public static void $default$forEach(OfLong ofLong, Consumer consumer) {
            if (consumer instanceof LongConsumer) {
                ofLong.forEach((LongConsumer) consumer);
            } else if (Tripwire.ENABLED) {
                Tripwire.trip(ofLong.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            } else {
                ((Spliterator.OfLong) ofLong.spliterator()).forEachRemaining(consumer);
            }
        }

        public static OfDouble $default$truncate(OfDouble ofDouble, long j, long j2, IntFunction intFunction) {
            if (j == 0 && j2 == ofDouble.count()) {
                return ofDouble;
            }
            long j3 = j2 - j;
            Spliterator.OfDouble ofDouble2 = (Spliterator.OfDouble) ofDouble.spliterator();
            Builder.OfDouble doubleBuilder = Nodes.doubleBuilder(j3);
            doubleBuilder.begin(j3);
            for (int i = 0; i < j && ofDouble2.tryAdvance((DoubleConsumer) new DoubleConsumer() { // from class: j$.util.stream.Node$OfDouble$$ExternalSyntheticLambda0
                @Override // j$.util.function.DoubleConsumer
                public final void accept(double d) {
                }
            }); i++) {
            }
            for (int i2 = 0; i2 < j3 && ofDouble2.tryAdvance((DoubleConsumer) doubleBuilder); i2++) {
            }
            doubleBuilder.end();
            return doubleBuilder.build();
        }

        public static OfInt $default$truncate(OfInt ofInt, long j, long j2, IntFunction intFunction) {
            if (j == 0 && j2 == ofInt.count()) {
                return ofInt;
            }
            long j3 = j2 - j;
            Spliterator.OfInt ofInt2 = (Spliterator.OfInt) ofInt.spliterator();
            Builder.OfInt intBuilder = Nodes.intBuilder(j3);
            intBuilder.begin(j3);
            for (int i = 0; i < j && ofInt2.tryAdvance((IntConsumer) new IntConsumer() { // from class: j$.util.stream.Node$OfInt$$ExternalSyntheticLambda0
                @Override // j$.util.function.IntConsumer
                public final void accept(int i2) {
                }
            }); i++) {
            }
            for (int i2 = 0; i2 < j3 && ofInt2.tryAdvance((IntConsumer) intBuilder); i2++) {
            }
            intBuilder.end();
            return intBuilder.build();
        }

        public static OfLong $default$truncate(OfLong ofLong, long j, long j2, IntFunction intFunction) {
            if (j == 0 && j2 == ofLong.count()) {
                return ofLong;
            }
            long j3 = j2 - j;
            Spliterator.OfLong ofLong2 = (Spliterator.OfLong) ofLong.spliterator();
            Builder.OfLong longBuilder = Nodes.longBuilder(j3);
            longBuilder.begin(j3);
            for (int i = 0; i < j && ofLong2.tryAdvance((LongConsumer) new LongConsumer() { // from class: j$.util.stream.Node$OfLong$$ExternalSyntheticLambda0
                @Override // j$.util.function.LongConsumer
                public final void accept(long j4) {
                }
            }); i++) {
            }
            for (int i2 = 0; i2 < j3 && ofLong2.tryAdvance((LongConsumer) longBuilder); i2++) {
            }
            longBuilder.end();
            return longBuilder.build();
        }

        public static Node $default$truncate(Node node, long j, long j2, IntFunction intFunction) {
            if (j == 0 && j2 == node.count()) {
                return node;
            }
            Spliterator spliterator = node.spliterator();
            long j3 = j2 - j;
            Builder builder = Nodes.builder(j3, intFunction);
            builder.begin(j3);
            for (int i = 0; i < j && spliterator.tryAdvance(new Consumer() { // from class: j$.util.stream.Node$$ExternalSyntheticLambda0
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                }

                @Override // j$.util.function.Consumer
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            }); i++) {
            }
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(builder); i2++) {
            }
            builder.end();
            return builder.build();
        }

        public static TerminalOp makeDouble(C$r8$wrapper$java$util$function$IntPredicate$VWRP c$r8$wrapper$java$util$function$IntPredicate$VWRP, MatchOps$MatchKind matchOps$MatchKind) {
            Objects.requireNonNull(c$r8$wrapper$java$util$function$IntPredicate$VWRP);
            Objects.requireNonNull(matchOps$MatchKind);
            return new MatchOps$MatchOp(StreamShape.DOUBLE_VALUE, matchOps$MatchKind, new MatchOps$$ExternalSyntheticLambda0(matchOps$MatchKind, c$r8$wrapper$java$util$function$IntPredicate$VWRP));
        }

        public static TerminalOp makeInt(C$r8$wrapper$java$util$function$IntPredicate$VWRP c$r8$wrapper$java$util$function$IntPredicate$VWRP, MatchOps$MatchKind matchOps$MatchKind) {
            Objects.requireNonNull(c$r8$wrapper$java$util$function$IntPredicate$VWRP);
            Objects.requireNonNull(matchOps$MatchKind);
            return new MatchOps$MatchOp(StreamShape.INT_VALUE, matchOps$MatchKind, new MatchOps$$ExternalSyntheticLambda0(matchOps$MatchKind, c$r8$wrapper$java$util$function$IntPredicate$VWRP, (Iterable$CC$$IA$1) null));
        }

        public static TerminalOp makeLong(C$r8$wrapper$java$util$function$IntPredicate$VWRP c$r8$wrapper$java$util$function$IntPredicate$VWRP, MatchOps$MatchKind matchOps$MatchKind) {
            Objects.requireNonNull(c$r8$wrapper$java$util$function$IntPredicate$VWRP);
            Objects.requireNonNull(matchOps$MatchKind);
            return new MatchOps$MatchOp(StreamShape.LONG_VALUE, matchOps$MatchKind, new MatchOps$$ExternalSyntheticLambda0(matchOps$MatchKind, c$r8$wrapper$java$util$function$IntPredicate$VWRP, (Iterable$CC$$IA$2) null));
        }

        public static TerminalOp makeRef(Predicate predicate, MatchOps$MatchKind matchOps$MatchKind) {
            Objects.requireNonNull(predicate);
            Objects.requireNonNull(matchOps$MatchKind);
            return new MatchOps$MatchOp(StreamShape.REFERENCE, matchOps$MatchKind, new MatchOps$$ExternalSyntheticLambda0(matchOps$MatchKind, predicate));
        }
    }

    /* loaded from: classes2.dex */
    public interface Builder extends Sink {

        /* loaded from: classes2.dex */
        public interface OfDouble extends Builder, Sink.OfDouble {
            @Override // j$.util.stream.Node.Builder
            OfDouble build();
        }

        /* loaded from: classes2.dex */
        public interface OfInt extends Builder, Sink.OfInt {
            @Override // j$.util.stream.Node.Builder
            OfInt build();
        }

        /* loaded from: classes2.dex */
        public interface OfLong extends Builder, Sink.OfLong {
            @Override // j$.util.stream.Node.Builder
            OfLong build();
        }

        Node build();
    }

    /* loaded from: classes2.dex */
    public interface OfDouble extends OfPrimitive {
    }

    /* loaded from: classes2.dex */
    public interface OfInt extends OfPrimitive {
    }

    /* loaded from: classes2.dex */
    public interface OfLong extends OfPrimitive {
    }

    /* loaded from: classes2.dex */
    public interface OfPrimitive extends Node {
        Object asPrimitiveArray();

        void copyInto(Object obj, int i);

        void forEach(Object obj);

        @Override // j$.util.stream.Node
        OfPrimitive getChild(int i);

        Object newArray(int i);

        @Override // j$.util.stream.Node
        Spliterator.OfPrimitive spliterator();
    }

    Object[] asArray(IntFunction intFunction);

    void copyInto(Object[] objArr, int i);

    long count();

    void forEach(Consumer consumer);

    Node getChild(int i);

    int getChildCount();

    Spliterator spliterator();

    Node truncate(long j, long j2, IntFunction intFunction);
}
