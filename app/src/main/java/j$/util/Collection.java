package j$.util;

import j$.lang.Iterable;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public interface Collection extends Iterable {

    /* renamed from: j$.util.Collection$-EL */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class EL {
        public static /* synthetic */ void forEach(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
            } else {
                Objects.$default$forEach(collection, consumer);
            }
        }

        public static /* synthetic */ boolean removeIf(java.util.Collection collection, Predicate predicate) {
            return collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : Objects.$default$removeIf(collection, predicate);
        }

        public static Spliterator spliterator(java.util.Collection collection) {
            if (collection instanceof Collection) {
                return ((Collection) collection).spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
                java.util.Objects.requireNonNull(linkedHashSet);
                return new Spliterators.IteratorSpliterator(linkedHashSet, 17);
            } else if (collection instanceof SortedSet) {
                final SortedSet sortedSet = (SortedSet) collection;
                return new Spliterators.IteratorSpliterator(sortedSet, 21) { // from class: j$.util.SortedSet$1
                    @Override // j$.util.Spliterators.IteratorSpliterator, j$.util.Spliterator
                    public java.util.Comparator getComparator() {
                        return sortedSet.comparator();
                    }
                };
            } else if (collection instanceof Set) {
                Set set = (Set) collection;
                java.util.Objects.requireNonNull(set);
                return new Spliterators.IteratorSpliterator(set, 1);
            } else if (collection instanceof List) {
                List list = (List) collection;
                java.util.Objects.requireNonNull(list);
                return new Spliterators.IteratorSpliterator(list, 16);
            } else {
                java.util.Objects.requireNonNull(collection);
                return new Spliterators.IteratorSpliterator(collection, 0);
            }
        }
    }

    @Override // j$.lang.Iterable
    void forEach(Consumer consumer);

    boolean removeIf(Predicate predicate);

    @Override // j$.lang.Iterable
    Spliterator spliterator();

    Stream stream();
}
