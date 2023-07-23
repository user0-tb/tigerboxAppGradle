package j$.util;

import j$.util.Comparator;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;
import j$.util.function.IntConsumer;
import j$.util.function.LongConsumer;
import j$.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public abstract class Objects {
    public static void $default$forEach(java.util.Collection collection, Consumer consumer) {
        java.util.Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    public static void $default$forEachRemaining(Spliterator.OfDouble ofDouble, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            ofDouble.forEachRemaining((DoubleConsumer) consumer);
        } else if (Tripwire.ENABLED) {
            Tripwire.trip(ofDouble.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            java.util.Objects.requireNonNull(consumer);
            ofDouble.forEachRemaining((DoubleConsumer) new PrimitiveIterator$OfDouble$$ExternalSyntheticLambda0(consumer));
        }
    }

    public static long $default$getExactSizeIfKnown(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean $default$hasCharacteristics(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
        if (DesugarCollections.SYNCHRONIZED_COLLECTION.isInstance(collection)) {
            return DesugarCollections.removeIf(collection, predicate);
        }
        java.util.Objects.requireNonNull(predicate);
        boolean z = false;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean $default$tryAdvance(Spliterator.OfDouble ofDouble, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return ofDouble.tryAdvance((DoubleConsumer) consumer);
        }
        if (Tripwire.ENABLED) {
            Tripwire.trip(ofDouble.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        java.util.Objects.requireNonNull(consumer);
        return ofDouble.tryAdvance((DoubleConsumer) new PrimitiveIterator$OfDouble$$ExternalSyntheticLambda0(consumer));
    }

    public static java.util.Optional convert(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? java.util.Optional.of(optional.get()) : java.util.Optional.empty();
    }

    public static java.util.OptionalDouble convert(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? java.util.OptionalDouble.of(optionalDouble.getAsDouble()) : java.util.OptionalDouble.empty();
    }

    public static java.util.OptionalInt convert(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? java.util.OptionalInt.of(optionalInt.getAsInt()) : java.util.OptionalInt.empty();
    }

    public static java.util.OptionalLong convert(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? java.util.OptionalLong.of(optionalLong.getAsLong()) : java.util.OptionalLong.empty();
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void sort(List list, java.util.Comparator comparator) {
        if (DesugarCollections.SYNCHRONIZED_LIST.isInstance(list)) {
            DesugarCollections.sort(list, comparator);
            return;
        }
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }

    public static /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public static void $default$forEachRemaining(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            ofInt.forEachRemaining((IntConsumer) consumer);
        } else if (Tripwire.ENABLED) {
            Tripwire.trip(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            java.util.Objects.requireNonNull(consumer);
            ofInt.forEachRemaining((IntConsumer) new PrimitiveIterator$OfInt$$ExternalSyntheticLambda0(consumer));
        }
    }

    public static boolean $default$tryAdvance(Spliterator.OfInt ofInt, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return ofInt.tryAdvance((IntConsumer) consumer);
        }
        if (Tripwire.ENABLED) {
            Tripwire.trip(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        java.util.Objects.requireNonNull(consumer);
        return ofInt.tryAdvance((IntConsumer) new PrimitiveIterator$OfInt$$ExternalSyntheticLambda0(consumer));
    }

    public static void $default$forEachRemaining(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            ofLong.forEachRemaining((LongConsumer) consumer);
        } else if (Tripwire.ENABLED) {
            Tripwire.trip(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            java.util.Objects.requireNonNull(consumer);
            ofLong.forEachRemaining((LongConsumer) new PrimitiveIterator$OfLong$$ExternalSyntheticLambda0(consumer));
        }
    }

    public static boolean $default$tryAdvance(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return ofLong.tryAdvance((LongConsumer) consumer);
        }
        if (Tripwire.ENABLED) {
            Tripwire.trip(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        java.util.Objects.requireNonNull(consumer);
        return ofLong.tryAdvance((LongConsumer) new PrimitiveIterator$OfLong$$ExternalSyntheticLambda0(consumer));
    }
}
