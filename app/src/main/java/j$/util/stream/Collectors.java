package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Supplier;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Collectors {
    static final Set CH_ID;

    /* loaded from: classes2.dex */
    static class CollectorImpl implements Collector {
        private final BiConsumer accumulator;
        private final Set characteristics;
        private final BinaryOperator combiner;
        private final Function finisher;
        private final Supplier supplier;

        CollectorImpl(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
            Set set2 = Collectors.CH_ID;
            Collectors$$ExternalSyntheticLambda53 collectors$$ExternalSyntheticLambda53 = new Function() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda53
                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    Set set3 = Collectors.CH_ID;
                    return obj;
                }
            };
            this.supplier = supplier;
            this.accumulator = biConsumer;
            this.combiner = binaryOperator;
            this.finisher = collectors$$ExternalSyntheticLambda53;
            this.characteristics = set;
        }

        @Override // j$.util.stream.Collector
        public BiConsumer accumulator() {
            return this.accumulator;
        }

        @Override // j$.util.stream.Collector
        public Set characteristics() {
            return this.characteristics;
        }

        @Override // j$.util.stream.Collector
        public BinaryOperator combiner() {
            return this.combiner;
        }

        @Override // j$.util.stream.Collector
        public Function finisher() {
            return this.finisher;
        }

        @Override // j$.util.stream.Collector
        public Supplier supplier() {
            return this.supplier;
        }
    }

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        CH_ID = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double computeFinalSum(double[] dArr) {
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double[] sumWithCompensation(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
        return dArr;
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new CollectorImpl(new Supplier() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda77
            @Override // j$.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }, new BiConsumer() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda20
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }
        }, new BinaryOperator() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda36
            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                List list = (List) obj;
                Set set = Collectors.CH_ID;
                list.addAll((List) obj2);
                return list;
            }
        }, CH_ID);
    }
}
