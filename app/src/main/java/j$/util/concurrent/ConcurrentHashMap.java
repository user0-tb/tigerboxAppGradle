package j$.util.concurrent;

import j$.util.Collection;
import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.stream.StreamSupport;
import j$.wrappers.C$r8$wrapper$java$util$Spliterator$WRP;
import j$.wrappers.C$r8$wrapper$java$util$function$BiConsumer$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$BiFunction$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$Consumer$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$Function$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$IntFunction$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$Predicate$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$stream$Stream$WRP;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {
    private static final long ABASE;
    private static final int ASHIFT;
    private static final long BASECOUNT;
    private static final long CELLSBUSY;
    private static final long CELLVALUE;
    static final int NCPU = Runtime.getRuntime().availableProcessors();
    private static final long SIZECTL;
    private static final long TRANSFERINDEX;
    private static final Unsafe U;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    private volatile transient long baseCount;
    private volatile transient int cellsBusy;
    private volatile transient CounterCell[] counterCells;
    private transient EntrySetView entrySet;
    private transient KeySetView keySet;
    private volatile transient Node[] nextTable;
    private volatile transient int sizeCtl;
    volatile transient Node[] table;
    private volatile transient int transferIndex;
    private transient ValuesView values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class BaseIterator extends Traverser {
        Node lastReturned;
        final ConcurrentHashMap map;

        BaseIterator(Node[] nodeArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3);
            this.map = concurrentHashMap;
            advance();
        }

        public final boolean hasMoreElements() {
            return this.next != null;
        }

        public final boolean hasNext() {
            return this.next != null;
        }

        public final void remove() {
            Node node = this.lastReturned;
            if (node == null) {
                throw new IllegalStateException();
            }
            this.lastReturned = null;
            this.map.replaceNode(node.key, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CounterCell {
        volatile long value;

        CounterCell(long j) {
            this.value = j;
        }
    }

    /* loaded from: classes2.dex */
    static final class EntryIterator extends BaseIterator implements Iterator, j$.util.Iterator {
        EntryIterator(Node[] nodeArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3, concurrentHashMap);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Object next() {
            Node node = this.next;
            if (node != null) {
                Object obj = node.key;
                Object obj2 = node.val;
                this.lastReturned = node;
                advance();
                return new MapEntry(obj, obj2, this.map);
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes2.dex */
    static final class EntrySetView extends CollectionView implements Set, Collection {
        EntrySetView(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(Map.Entry entry) {
            return this.map.putVal(entry.getKey(), entry.getValue(), false) == null;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(java.util.Collection collection) {
            java.util.Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (add((Map.Entry) it.next())) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            Object value;
            return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.map.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public void forEach(Consumer consumer) {
            Objects.requireNonNull(consumer);
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(new MapEntry(advance.key, advance.val, this.map));
            }
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Node[] nodeArr = this.map.table;
            int i = 0;
            if (nodeArr != null) {
                Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
                while (true) {
                    Node advance = traverser.advance();
                    if (advance == null) {
                        break;
                    }
                    i += advance.hashCode();
                }
            }
            return i;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new EntryIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream parallelStream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), true);
            return C$r8$wrapper$java$util$stream$Stream$WRP.convert(stream);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.map.remove(key, value);
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return j$.util.Objects.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return j$.util.Objects.$default$removeIf(this, C$r8$wrapper$java$util$function$Predicate$VWRP.convert(predicate));
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.lang.Iterable
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new EntrySpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L, concurrentHashMap);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ java.util.Spliterator spliterator() {
            return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), false);
            return stream;
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream stream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), false);
            return C$r8$wrapper$java$util$stream$Stream$WRP.convert(stream);
        }

        public Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) C$r8$wrapper$java$util$function$IntFunction$VWRP.convert(intFunction).apply(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class EntrySpliterator extends Traverser implements Spliterator {
        long est;
        final ConcurrentHashMap map;

        EntrySpliterator(Node[] nodeArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3);
            this.map = concurrentHashMap;
            this.est = j;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4353;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(new MapEntry(advance.key, advance.val, this.map));
            }
        }

        @Override // j$.util.Spliterator
        public Comparator getComparator() {
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return j$.util.Objects.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return j$.util.Objects.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            Objects.requireNonNull(consumer);
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(new MapEntry(advance.key, advance.val, this.map));
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i = this.baseIndex;
            int i2 = this.baseLimit;
            int i3 = (i + i2) >>> 1;
            if (i3 <= i) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i4 = this.baseSize;
            this.baseLimit = i3;
            long j = this.est >>> 1;
            this.est = j;
            return new EntrySpliterator(nodeArr, i4, i3, i2, j, this.map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ForwardingNode extends Node {
        final Node[] nextTable;

        ForwardingNode(Node[] nodeArr) {
            super(-1, null, null, null);
            this.nextTable = nodeArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
            if ((r0 instanceof j$.util.concurrent.ConcurrentHashMap.ForwardingNode) == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
            r0 = ((j$.util.concurrent.ConcurrentHashMap.ForwardingNode) r0).nextTable;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
            return r0.find(r5, r6);
         */
        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        j$.util.concurrent.ConcurrentHashMap.Node find(int r5, java.lang.Object r6) {
            /*
                r4 = this;
                j$.util.concurrent.ConcurrentHashMap$Node[] r0 = r4.nextTable
            L2:
                r1 = 0
                if (r0 == 0) goto L37
                int r2 = r0.length
                if (r2 == 0) goto L37
                int r2 = r2 + (-1)
                r2 = r2 & r5
                j$.util.concurrent.ConcurrentHashMap$Node r0 = j$.util.concurrent.ConcurrentHashMap.tabAt(r0, r2)
                if (r0 != 0) goto L12
                goto L37
            L12:
                int r2 = r0.hash
                if (r2 != r5) goto L23
                java.lang.Object r3 = r0.key
                if (r3 == r6) goto L22
                if (r3 == 0) goto L23
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L23
            L22:
                return r0
            L23:
                if (r2 >= 0) goto L33
                boolean r1 = r0 instanceof j$.util.concurrent.ConcurrentHashMap.ForwardingNode
                if (r1 == 0) goto L2e
                j$.util.concurrent.ConcurrentHashMap$ForwardingNode r0 = (j$.util.concurrent.ConcurrentHashMap.ForwardingNode) r0
                j$.util.concurrent.ConcurrentHashMap$Node[] r0 = r0.nextTable
                goto L2
            L2e:
                j$.util.concurrent.ConcurrentHashMap$Node r5 = r0.find(r5, r6)
                return r5
            L33:
                j$.util.concurrent.ConcurrentHashMap$Node r0 = r0.next
                if (r0 != 0) goto L12
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.ForwardingNode.find(int, java.lang.Object):j$.util.concurrent.ConcurrentHashMap$Node");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class KeyIterator extends BaseIterator implements java.util.Iterator, Enumeration, j$.util.Iterator {
        KeyIterator(Node[] nodeArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3, concurrentHashMap);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Node node = this.next;
            if (node != null) {
                Object obj = node.key;
                this.lastReturned = node;
                advance();
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return next();
        }
    }

    /* loaded from: classes2.dex */
    public static class KeySetView extends CollectionView implements Set, Collection {
        KeySetView(ConcurrentHashMap concurrentHashMap, Object obj) {
            super(concurrentHashMap);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(java.util.Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public void forEach(Consumer consumer) {
            Objects.requireNonNull(consumer);
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(advance.key);
            }
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            java.util.Iterator it = iterator();
            int i = 0;
            while (((BaseIterator) it).hasNext()) {
                i += ((KeyIterator) it).next().hashCode();
            }
            return i;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new KeyIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream parallelStream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), true);
            return C$r8$wrapper$java$util$stream$Stream$WRP.convert(stream);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return j$.util.Objects.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return j$.util.Objects.$default$removeIf(this, C$r8$wrapper$java$util$function$Predicate$VWRP.convert(predicate));
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.lang.Iterable
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new KeySpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ java.util.Spliterator spliterator() {
            return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), false);
            return stream;
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream stream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), false);
            return C$r8$wrapper$java$util$stream$Stream$WRP.convert(stream);
        }

        public Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) C$r8$wrapper$java$util$function$IntFunction$VWRP.convert(intFunction).apply(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class KeySpliterator extends Traverser implements Spliterator {
        long est;

        KeySpliterator(Node[] nodeArr, int i, int i2, int i3, long j) {
            super(nodeArr, i, i2, i3);
            this.est = j;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4353;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(advance.key);
            }
        }

        @Override // j$.util.Spliterator
        public Comparator getComparator() {
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return j$.util.Objects.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return j$.util.Objects.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            Objects.requireNonNull(consumer);
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(advance.key);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i = this.baseIndex;
            int i2 = this.baseLimit;
            int i3 = (i + i2) >>> 1;
            if (i3 <= i) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i4 = this.baseSize;
            this.baseLimit = i3;
            long j = this.est >>> 1;
            this.est = j;
            return new KeySpliterator(nodeArr, i4, i3, i2, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MapEntry implements Map.Entry {
        final Object key;
        final ConcurrentHashMap map;
        Object val;

        MapEntry(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
            this.key = obj;
            this.val = obj2;
            this.map = concurrentHashMap;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            Object obj2;
            Object obj3;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.key) || key.equals(obj2)) && (value == (obj3 = this.val) || value.equals(obj3));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.val;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.val.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Objects.requireNonNull(obj);
            Object obj2 = this.val;
            this.val = obj;
            this.map.put(this.key, obj);
            return obj2;
        }

        public String toString() {
            return this.key + "=" + this.val;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Node implements Map.Entry {
        final int hash;
        final Object key;
        volatile Node next;
        volatile Object val;

        Node(int i, Object obj, Object obj2, Node node) {
            this.hash = i;
            this.key = obj;
            this.val = obj2;
            this.next = node;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            Object obj2;
            Object obj3;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.key) || key.equals(obj2)) && (value == (obj3 = this.val) || value.equals(obj3));
        }

        Node find(int i, Object obj) {
            Object obj2;
            Node node = this;
            do {
                if (node.hash == i && ((obj2 = node.key) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return node;
                }
                node = node.next;
            } while (node != null);
            return null;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.val;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.key.hashCode() ^ this.val.hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final String toString() {
            return this.key + "=" + this.val;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ReservationNode extends Node {
        ReservationNode() {
            super(-3, null, null, null);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        Node find(int i, Object obj) {
            return null;
        }
    }

    /* loaded from: classes2.dex */
    static class Segment extends ReentrantLock {
        Segment(float f) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TableStack {
        int index;
        int length;
        TableStack next;
        Node[] tab;

        TableStack() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class Traverser {
        int baseIndex;
        int baseLimit;
        final int baseSize;
        int index;
        Node next = null;
        TableStack spare;
        TableStack stack;
        Node[] tab;

        Traverser(Node[] nodeArr, int i, int i2, int i3) {
            this.tab = nodeArr;
            this.baseSize = i;
            this.index = i2;
            this.baseIndex = i2;
            this.baseLimit = i3;
        }

        final Node advance() {
            Node[] nodeArr;
            int length;
            int i;
            TableStack tableStack;
            Node node = this.next;
            if (node != null) {
                node = node.next;
            }
            while (node == null) {
                if (this.baseIndex >= this.baseLimit || (nodeArr = this.tab) == null || (length = nodeArr.length) <= (i = this.index) || i < 0) {
                    this.next = null;
                    return null;
                }
                Node tabAt = ConcurrentHashMap.tabAt(nodeArr, i);
                if (tabAt == null || tabAt.hash >= 0) {
                    node = tabAt;
                } else if (tabAt instanceof ForwardingNode) {
                    this.tab = ((ForwardingNode) tabAt).nextTable;
                    TableStack tableStack2 = this.spare;
                    if (tableStack2 != null) {
                        this.spare = tableStack2.next;
                    } else {
                        tableStack2 = new TableStack();
                    }
                    tableStack2.tab = nodeArr;
                    tableStack2.length = length;
                    tableStack2.index = i;
                    tableStack2.next = this.stack;
                    this.stack = tableStack2;
                    node = null;
                } else {
                    node = tabAt instanceof TreeBin ? ((TreeBin) tabAt).first : null;
                }
                if (this.stack != null) {
                    while (true) {
                        tableStack = this.stack;
                        if (tableStack == null) {
                            break;
                        }
                        int i2 = this.index;
                        int i3 = tableStack.length;
                        int i4 = i2 + i3;
                        this.index = i4;
                        if (i4 < length) {
                            break;
                        }
                        this.index = tableStack.index;
                        this.tab = tableStack.tab;
                        tableStack.tab = null;
                        TableStack tableStack3 = tableStack.next;
                        tableStack.next = this.spare;
                        this.stack = tableStack3;
                        this.spare = tableStack;
                        length = i3;
                    }
                    if (tableStack == null) {
                        int i5 = this.index + this.baseSize;
                        this.index = i5;
                        if (i5 >= length) {
                            int i6 = this.baseIndex + 1;
                            this.baseIndex = i6;
                            this.index = i6;
                        }
                    }
                } else {
                    int i7 = i + this.baseSize;
                    this.index = i7;
                    if (i7 >= length) {
                        int i8 = this.baseIndex + 1;
                        this.baseIndex = i8;
                        this.index = i8;
                    }
                }
            }
            this.next = node;
            return node;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TreeBin extends Node {
        private static final long LOCKSTATE;
        private static final Unsafe U;
        volatile TreeNode first;
        volatile int lockState;
        TreeNode root;
        volatile Thread waiter;

        static {
            try {
                Unsafe unsafe = DesugarUnsafe.getUnsafe();
                U = unsafe;
                LOCKSTATE = unsafe.objectFieldOffset(TreeBin.class.getDeclaredField("lockState"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        TreeBin(TreeNode treeNode) {
            super(-2, null, null, null);
            int compareComparables;
            int tieBreakOrder;
            this.first = treeNode;
            TreeNode treeNode2 = null;
            while (treeNode != null) {
                TreeNode treeNode3 = (TreeNode) treeNode.next;
                treeNode.right = null;
                treeNode.left = null;
                if (treeNode2 == null) {
                    treeNode.parent = null;
                    treeNode.red = false;
                } else {
                    Object obj = treeNode.key;
                    int i = treeNode.hash;
                    TreeNode treeNode4 = treeNode2;
                    Class cls = null;
                    while (true) {
                        Object obj2 = treeNode4.key;
                        int i2 = treeNode4.hash;
                        tieBreakOrder = i2 > i ? -1 : i2 < i ? 1 : ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) ? tieBreakOrder(obj, obj2) : compareComparables;
                        TreeNode treeNode5 = tieBreakOrder <= 0 ? treeNode4.left : treeNode4.right;
                        if (treeNode5 == null) {
                            break;
                        }
                        treeNode4 = treeNode5;
                    }
                    treeNode.parent = treeNode4;
                    if (tieBreakOrder <= 0) {
                        treeNode4.left = treeNode;
                    } else {
                        treeNode4.right = treeNode;
                    }
                    treeNode = balanceInsertion(treeNode2, treeNode);
                }
                treeNode2 = treeNode;
                treeNode = treeNode3;
            }
            this.root = treeNode2;
        }

        static TreeNode balanceDeletion(TreeNode treeNode, TreeNode treeNode2) {
            while (treeNode2 != null && treeNode2 != treeNode) {
                TreeNode treeNode3 = treeNode2.parent;
                if (treeNode3 == null) {
                    treeNode2.red = false;
                    return treeNode2;
                } else if (treeNode2.red) {
                    treeNode2.red = false;
                    return treeNode;
                } else {
                    TreeNode treeNode4 = treeNode3.left;
                    TreeNode treeNode5 = null;
                    if (treeNode4 == treeNode2) {
                        treeNode4 = treeNode3.right;
                        if (treeNode4 != null && treeNode4.red) {
                            treeNode4.red = false;
                            treeNode3.red = true;
                            treeNode = rotateLeft(treeNode, treeNode3);
                            treeNode3 = treeNode2.parent;
                            treeNode4 = treeNode3 == null ? null : treeNode3.right;
                        }
                        if (treeNode4 == null) {
                            treeNode2 = treeNode3;
                        } else {
                            TreeNode treeNode6 = treeNode4.left;
                            TreeNode treeNode7 = treeNode4.right;
                            if ((treeNode7 != null && treeNode7.red) || (treeNode6 != null && treeNode6.red)) {
                                if (treeNode7 == null || !treeNode7.red) {
                                    if (treeNode6 != null) {
                                        treeNode6.red = false;
                                    }
                                    treeNode4.red = true;
                                    treeNode = rotateRight(treeNode, treeNode4);
                                    treeNode3 = treeNode2.parent;
                                    if (treeNode3 != null) {
                                        treeNode5 = treeNode3.right;
                                    }
                                } else {
                                    treeNode5 = treeNode4;
                                }
                                if (treeNode5 != null) {
                                    treeNode5.red = treeNode3 == null ? false : treeNode3.red;
                                    TreeNode treeNode8 = treeNode5.right;
                                    if (treeNode8 != null) {
                                        treeNode8.red = false;
                                    }
                                }
                                if (treeNode3 != null) {
                                    treeNode3.red = false;
                                    treeNode = rotateLeft(treeNode, treeNode3);
                                }
                                treeNode2 = treeNode;
                                treeNode = treeNode2;
                            }
                            treeNode4.red = true;
                            treeNode2 = treeNode3;
                        }
                    } else {
                        if (treeNode4 != null && treeNode4.red) {
                            treeNode4.red = false;
                            treeNode3.red = true;
                            treeNode = rotateRight(treeNode, treeNode3);
                            treeNode3 = treeNode2.parent;
                            treeNode4 = treeNode3 == null ? null : treeNode3.left;
                        }
                        if (treeNode4 == null) {
                            treeNode2 = treeNode3;
                        } else {
                            TreeNode treeNode9 = treeNode4.left;
                            TreeNode treeNode10 = treeNode4.right;
                            if ((treeNode9 != null && treeNode9.red) || (treeNode10 != null && treeNode10.red)) {
                                if (treeNode9 == null || !treeNode9.red) {
                                    if (treeNode10 != null) {
                                        treeNode10.red = false;
                                    }
                                    treeNode4.red = true;
                                    treeNode = rotateLeft(treeNode, treeNode4);
                                    treeNode3 = treeNode2.parent;
                                    if (treeNode3 != null) {
                                        treeNode5 = treeNode3.left;
                                    }
                                } else {
                                    treeNode5 = treeNode4;
                                }
                                if (treeNode5 != null) {
                                    treeNode5.red = treeNode3 == null ? false : treeNode3.red;
                                    TreeNode treeNode11 = treeNode5.left;
                                    if (treeNode11 != null) {
                                        treeNode11.red = false;
                                    }
                                }
                                if (treeNode3 != null) {
                                    treeNode3.red = false;
                                    treeNode = rotateRight(treeNode, treeNode3);
                                }
                                treeNode2 = treeNode;
                                treeNode = treeNode2;
                            }
                            treeNode4.red = true;
                            treeNode2 = treeNode3;
                        }
                    }
                }
            }
            return treeNode;
        }

        static TreeNode balanceInsertion(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3;
            treeNode2.red = true;
            while (true) {
                TreeNode treeNode4 = treeNode2.parent;
                if (treeNode4 == null) {
                    treeNode2.red = false;
                    return treeNode2;
                } else if (!treeNode4.red || (treeNode3 = treeNode4.parent) == null) {
                    break;
                } else {
                    TreeNode treeNode5 = treeNode3.left;
                    if (treeNode4 == treeNode5) {
                        treeNode5 = treeNode3.right;
                        if (treeNode5 == null || !treeNode5.red) {
                            if (treeNode2 == treeNode4.right) {
                                treeNode = rotateLeft(treeNode, treeNode4);
                                TreeNode treeNode6 = treeNode4.parent;
                                treeNode3 = treeNode6 == null ? null : treeNode6.parent;
                                treeNode4 = treeNode6;
                                treeNode2 = treeNode4;
                            }
                            if (treeNode4 != null) {
                                treeNode4.red = false;
                                if (treeNode3 != null) {
                                    treeNode3.red = true;
                                    treeNode = rotateRight(treeNode, treeNode3);
                                }
                            }
                        } else {
                            treeNode5.red = false;
                            treeNode4.red = false;
                            treeNode3.red = true;
                            treeNode2 = treeNode3;
                        }
                    } else if (treeNode5 == null || !treeNode5.red) {
                        if (treeNode2 == treeNode4.left) {
                            treeNode = rotateRight(treeNode, treeNode4);
                            TreeNode treeNode7 = treeNode4.parent;
                            treeNode3 = treeNode7 == null ? null : treeNode7.parent;
                            treeNode4 = treeNode7;
                            treeNode2 = treeNode4;
                        }
                        if (treeNode4 != null) {
                            treeNode4.red = false;
                            if (treeNode3 != null) {
                                treeNode3.red = true;
                                treeNode = rotateLeft(treeNode, treeNode3);
                            }
                        }
                    } else {
                        treeNode5.red = false;
                        treeNode4.red = false;
                        treeNode3.red = true;
                        treeNode2 = treeNode3;
                    }
                }
            }
            return treeNode;
        }

        private final void contendedLock() {
            boolean z = false;
            while (true) {
                int i = this.lockState;
                if ((i & (-3)) == 0) {
                    if (U.compareAndSwapInt(this, LOCKSTATE, i, 1)) {
                        break;
                    }
                } else if ((i & 2) == 0) {
                    if (U.compareAndSwapInt(this, LOCKSTATE, i, i | 2)) {
                        z = true;
                        this.waiter = Thread.currentThread();
                    }
                } else if (z) {
                    LockSupport.park(this);
                }
            }
            if (z) {
                this.waiter = null;
            }
        }

        private final void lockRoot() {
            if (U.compareAndSwapInt(this, LOCKSTATE, 0, 1)) {
                return;
            }
            contendedLock();
        }

        static TreeNode rotateLeft(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3 = treeNode2.right;
            if (treeNode3 != null) {
                TreeNode treeNode4 = treeNode3.left;
                treeNode2.right = treeNode4;
                if (treeNode4 != null) {
                    treeNode4.parent = treeNode2;
                }
                TreeNode treeNode5 = treeNode2.parent;
                treeNode3.parent = treeNode5;
                if (treeNode5 == null) {
                    treeNode3.red = false;
                    treeNode = treeNode3;
                } else if (treeNode5.left == treeNode2) {
                    treeNode5.left = treeNode3;
                } else {
                    treeNode5.right = treeNode3;
                }
                treeNode3.left = treeNode2;
                treeNode2.parent = treeNode3;
            }
            return treeNode;
        }

        static TreeNode rotateRight(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3 = treeNode2.left;
            if (treeNode3 != null) {
                TreeNode treeNode4 = treeNode3.right;
                treeNode2.left = treeNode4;
                if (treeNode4 != null) {
                    treeNode4.parent = treeNode2;
                }
                TreeNode treeNode5 = treeNode2.parent;
                treeNode3.parent = treeNode5;
                if (treeNode5 == null) {
                    treeNode3.red = false;
                    treeNode = treeNode3;
                } else if (treeNode5.right == treeNode2) {
                    treeNode5.right = treeNode3;
                } else {
                    treeNode5.left = treeNode3;
                }
                treeNode3.right = treeNode2;
                treeNode2.parent = treeNode3;
            }
            return treeNode;
        }

        static int tieBreakOrder(Object obj, Object obj2) {
            int compareTo;
            return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        final Node find(int i, Object obj) {
            Object obj2;
            Thread thread;
            Thread thread2;
            Node node = this.first;
            while (true) {
                TreeNode treeNode = null;
                if (node == null) {
                    return null;
                }
                int i2 = this.lockState;
                if ((i2 & 3) == 0) {
                    Unsafe unsafe = U;
                    long j = LOCKSTATE;
                    if (unsafe.compareAndSwapInt(this, j, i2, i2 + 4)) {
                        try {
                            TreeNode treeNode2 = this.root;
                            if (treeNode2 != null) {
                                treeNode = treeNode2.findTreeNode(i, obj, null);
                            }
                            if (DesugarUnsafe.getAndAddInt(unsafe, this, j, -4) == 6 && (thread2 = this.waiter) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return treeNode;
                        } catch (Throwable th) {
                            if (DesugarUnsafe.getAndAddInt(U, this, LOCKSTATE, -4) == 6 && (thread = this.waiter) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else if (node.hash != i || ((obj2 = node.key) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    node = node.next;
                }
            }
            return node;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final j$.util.concurrent.ConcurrentHashMap.TreeNode putTreeVal(int r16, java.lang.Object r17, java.lang.Object r18) {
            /*
                r15 = this;
                r1 = r15
                r0 = r16
                r4 = r17
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r1.root
                r8 = 0
                r9 = 0
                r10 = r2
                r2 = r8
                r3 = 0
            Lc:
                if (r10 != 0) goto L22
                j$.util.concurrent.ConcurrentHashMap$TreeNode r9 = new j$.util.concurrent.ConcurrentHashMap$TreeNode
                r6 = 0
                r7 = 0
                r2 = r9
                r3 = r16
                r4 = r17
                r5 = r18
                r2.<init>(r3, r4, r5, r6, r7)
                r1.root = r9
                r1.first = r9
                goto La3
            L22:
                int r5 = r10.hash
                r11 = 1
                if (r5 <= r0) goto L2a
                r5 = -1
                r12 = -1
                goto L69
            L2a:
                if (r5 >= r0) goto L2e
                r12 = 1
                goto L69
            L2e:
                java.lang.Object r5 = r10.key
                if (r5 == r4) goto Lab
                if (r5 == 0) goto L3c
                boolean r6 = r4.equals(r5)
                if (r6 == 0) goto L3c
                goto Lab
            L3c:
                if (r2 != 0) goto L44
                java.lang.Class r2 = j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r17)
                if (r2 == 0) goto L4a
            L44:
                int r6 = j$.util.concurrent.ConcurrentHashMap.compareComparables(r2, r4, r5)
                if (r6 != 0) goto L68
            L4a:
                if (r3 != 0) goto L62
                j$.util.concurrent.ConcurrentHashMap$TreeNode r3 = r10.left
                if (r3 == 0) goto L56
                j$.util.concurrent.ConcurrentHashMap$TreeNode r3 = r3.findTreeNode(r0, r4, r2)
                if (r3 != 0) goto L60
            L56:
                j$.util.concurrent.ConcurrentHashMap$TreeNode r3 = r10.right
                if (r3 == 0) goto L61
                j$.util.concurrent.ConcurrentHashMap$TreeNode r3 = r3.findTreeNode(r0, r4, r2)
                if (r3 == 0) goto L61
            L60:
                return r3
            L61:
                r3 = 1
            L62:
                int r5 = tieBreakOrder(r4, r5)
                r12 = r5
                goto L69
            L68:
                r12 = r6
            L69:
                if (r12 > 0) goto L6e
                j$.util.concurrent.ConcurrentHashMap$TreeNode r5 = r10.left
                goto L70
            L6e:
                j$.util.concurrent.ConcurrentHashMap$TreeNode r5 = r10.right
            L70:
                if (r5 != 0) goto La8
                j$.util.concurrent.ConcurrentHashMap$TreeNode r13 = r1.first
                j$.util.concurrent.ConcurrentHashMap$TreeNode r14 = new j$.util.concurrent.ConcurrentHashMap$TreeNode
                r2 = r14
                r3 = r16
                r4 = r17
                r5 = r18
                r6 = r13
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                r1.first = r14
                if (r13 == 0) goto L88
                r13.prev = r14
            L88:
                if (r12 > 0) goto L8d
                r10.left = r14
                goto L8f
            L8d:
                r10.right = r14
            L8f:
                boolean r0 = r10.red
                if (r0 != 0) goto L96
                r14.red = r11
                goto La3
            L96:
                r15.lockRoot()
                j$.util.concurrent.ConcurrentHashMap$TreeNode r0 = r1.root     // Catch: java.lang.Throwable -> La4
                j$.util.concurrent.ConcurrentHashMap$TreeNode r0 = balanceInsertion(r0, r14)     // Catch: java.lang.Throwable -> La4
                r1.root = r0     // Catch: java.lang.Throwable -> La4
                r1.lockState = r9
            La3:
                return r8
            La4:
                r0 = move-exception
                r1.lockState = r9
                throw r0
            La8:
                r10 = r5
                goto Lc
            Lab:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.TreeBin.putTreeVal(int, java.lang.Object, java.lang.Object):j$.util.concurrent.ConcurrentHashMap$TreeNode");
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean removeTreeNode(j$.util.concurrent.ConcurrentHashMap.TreeNode r11) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.TreeBin.removeTreeNode(j$.util.concurrent.ConcurrentHashMap$TreeNode):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TreeNode extends Node {
        TreeNode left;
        TreeNode parent;
        TreeNode prev;
        boolean red;
        TreeNode right;

        TreeNode(int i, Object obj, Object obj2, Node node, TreeNode treeNode) {
            super(i, obj, obj2, node);
            this.parent = treeNode;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        Node find(int i, Object obj) {
            return findTreeNode(i, obj, null);
        }

        final TreeNode findTreeNode(int i, Object obj, Class cls) {
            int compareComparables;
            if (obj != null) {
                TreeNode treeNode = this;
                do {
                    TreeNode treeNode2 = treeNode.left;
                    TreeNode treeNode3 = treeNode.right;
                    int i2 = treeNode.hash;
                    if (i2 <= i) {
                        if (i2 >= i) {
                            Object obj2 = treeNode.key;
                            if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                                return treeNode;
                            }
                            if (treeNode2 != null) {
                                if (treeNode3 != null) {
                                    if ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) {
                                        TreeNode findTreeNode = treeNode3.findTreeNode(i, obj, cls);
                                        if (findTreeNode != null) {
                                            return findTreeNode;
                                        }
                                    } else if (compareComparables >= 0) {
                                        treeNode2 = treeNode3;
                                    }
                                }
                            }
                        }
                        treeNode = treeNode3;
                        continue;
                    }
                    treeNode = treeNode2;
                    continue;
                } while (treeNode != null);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ValueIterator extends BaseIterator implements java.util.Iterator, Enumeration, j$.util.Iterator {
        ValueIterator(Node[] nodeArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3, concurrentHashMap);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Node node = this.next;
            if (node != null) {
                Object obj = node.val;
                this.lastReturned = node;
                advance();
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ValueSpliterator extends Traverser implements Spliterator {
        long est;

        ValueSpliterator(Node[] nodeArr, int i, int i2, int i3, long j) {
            super(nodeArr, i, i2, i3);
            this.est = j;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4352;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(advance.val);
            }
        }

        @Override // j$.util.Spliterator
        public Comparator getComparator() {
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return j$.util.Objects.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return j$.util.Objects.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            Objects.requireNonNull(consumer);
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(advance.val);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i = this.baseIndex;
            int i2 = this.baseLimit;
            int i3 = (i + i2) >>> 1;
            if (i3 <= i) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i4 = this.baseSize;
            this.baseLimit = i3;
            long j = this.est >>> 1;
            this.est = j;
            return new ValueSpliterator(nodeArr, i4, i3, i2, j);
        }
    }

    /* loaded from: classes2.dex */
    static final class ValuesView extends CollectionView implements Collection {
        ValuesView(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(java.util.Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public final boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public void forEach(Consumer consumer) {
            Objects.requireNonNull(consumer);
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                }
                consumer.accept(advance.val);
            }
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new ValueIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream parallelStream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), true);
            return C$r8$wrapper$java$util$stream$Stream$WRP.convert(stream);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            BaseIterator baseIterator;
            if (obj != null) {
                java.util.Iterator it = iterator();
                do {
                    baseIterator = (BaseIterator) it;
                    if (!baseIterator.hasNext()) {
                        return false;
                    }
                } while (!obj.equals(((ValueIterator) it).next()));
                baseIterator.remove();
                return true;
            }
            return false;
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return j$.util.Objects.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return j$.util.Objects.$default$removeIf(this, C$r8$wrapper$java$util$function$Predicate$VWRP.convert(predicate));
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.Iterable
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new ValueSpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public /* synthetic */ java.util.Spliterator spliterator() {
            return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), false);
            return stream;
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream stream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), false);
            return C$r8$wrapper$java$util$stream$Stream$WRP.convert(stream);
        }

        public Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) C$r8$wrapper$java$util$function$IntFunction$VWRP.convert(intFunction).apply(0));
        }
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", Segment[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe unsafe = DesugarUnsafe.getUnsafe();
            U = unsafe;
            SIZECTL = unsafe.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            TRANSFERINDEX = unsafe.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            BASECOUNT = unsafe.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            CELLSBUSY = unsafe.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            CELLVALUE = unsafe.objectFieldOffset(CounterCell.class.getDeclaredField("value"));
            ABASE = unsafe.arrayBaseOffset(Node[].class);
            int arrayIndexScale = unsafe.arrayIndexScale(Node[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
                throw new Error("data type scale not a power of two");
            }
            ASHIFT = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.sizeCtl = i >= 536870912 ? 1073741824 : tableSizeFor(i + (i >>> 1) + 1);
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        long j = (long) (((i < i2 ? i2 : i) / f) + 1.0d);
        this.sizeCtl = j >= 1073741824 ? 1073741824 : tableSizeFor((int) j);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addCount(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.ConcurrentHashMap$CounterCell[] r0 = r11.counterCells
            if (r0 != 0) goto L14
            sun.misc.Unsafe r1 = j$.util.concurrent.ConcurrentHashMap.U
            long r3 = j$.util.concurrent.ConcurrentHashMap.BASECOUNT
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L3b
        L14:
            r1 = 1
            if (r0 == 0) goto L94
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L94
            int r3 = j$.util.concurrent.ThreadLocalRandom.getProbe()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L94
            sun.misc.Unsafe r3 = j$.util.concurrent.ConcurrentHashMap.U
            long r5 = j$.util.concurrent.ConcurrentHashMap.CELLVALUE
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L34
            r1 = r0
            goto L94
        L34:
            if (r14 > r1) goto L37
            return
        L37:
            long r9 = r11.sumCount()
        L3b:
            if (r14 < 0) goto L93
        L3d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L93
            j$.util.concurrent.ConcurrentHashMap$Node[] r12 = r11.table
            if (r12 == 0) goto L93
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L93
            int r13 = resizeStamp(r13)
            if (r4 >= 0) goto L7b
            int r14 = r4 >>> 16
            if (r14 != r13) goto L93
            int r14 = r13 + 1
            if (r4 == r14) goto L93
            r14 = 65535(0xffff, float:9.1834E-41)
            int r13 = r13 + r14
            if (r4 == r13) goto L93
            j$.util.concurrent.ConcurrentHashMap$Node[] r13 = r11.nextTable
            if (r13 == 0) goto L93
            int r14 = r11.transferIndex
            if (r14 > 0) goto L6a
            goto L93
        L6a:
            sun.misc.Unsafe r0 = j$.util.concurrent.ConcurrentHashMap.U
            long r2 = j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L8e
            r11.transfer(r12, r13)
            goto L8e
        L7b:
            sun.misc.Unsafe r0 = j$.util.concurrent.ConcurrentHashMap.U
            long r2 = j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r13 = r13 << 16
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L8e
            r13 = 0
            r11.transfer(r12, r13)
        L8e:
            long r9 = r11.sumCount()
            goto L3d
        L93:
            return
        L94:
            r11.fullAddCount(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.addCount(long, int):void");
    }

    static final boolean casTabAt(Node[] nodeArr, int i, Node node, Node node2) {
        return U.compareAndSwapObject(nodeArr, (i << ASHIFT) + ABASE, (Object) null, node2);
    }

    static Class comparableClassFor(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    static int compareComparables(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r24.counterCells != r7) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009d, code lost:
        r1 = new j$.util.concurrent.ConcurrentHashMap.CounterCell[r8 << 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
        if (r2 >= r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a4, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
        r24.counterCells = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void fullAddCount(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.fullAddCount(long, boolean):void");
    }

    private final Node[] initTable() {
        while (true) {
            Node[] nodeArr = this.table;
            if (nodeArr != null && nodeArr.length != 0) {
                return nodeArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else if (U.compareAndSwapInt(this, SIZECTL, i, -1)) {
                try {
                    Node[] nodeArr2 = this.table;
                    if (nodeArr2 == null || nodeArr2.length == 0) {
                        int i2 = i > 0 ? i : 16;
                        Node[] nodeArr3 = new Node[i2];
                        this.table = nodeArr3;
                        i = i2 - (i2 >>> 2);
                        nodeArr2 = nodeArr3;
                    }
                    this.sizeCtl = i;
                    return nodeArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i;
                    throw th;
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        int tableSizeFor;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        Node node = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j3++;
            node = new Node(spread(readObject.hashCode()), readObject, readObject2, node);
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        if (j3 >= 536870912) {
            tableSizeFor = 1073741824;
        } else {
            int i = (int) j3;
            tableSizeFor = tableSizeFor(i + (i >>> 1) + 1);
        }
        Node[] nodeArr = new Node[tableSizeFor];
        int i2 = tableSizeFor - 1;
        while (node != null) {
            Node node2 = node.next;
            int i3 = node.hash;
            int i4 = i3 & i2;
            Node tabAt = tabAt(nodeArr, i4);
            if (tabAt == null) {
                z = true;
            } else {
                Object obj2 = node.key;
                if (tabAt.hash >= 0) {
                    int i5 = 0;
                    for (Node node3 = tabAt; node3 != null; node3 = node3.next) {
                        if (node3.hash == i3 && ((obj = node3.key) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    z = true;
                    if (z && i5 >= 8) {
                        j2++;
                        node.next = tabAt;
                        Node node4 = node;
                        TreeNode treeNode = null;
                        TreeNode treeNode2 = null;
                        while (node4 != null) {
                            long j4 = j2;
                            TreeNode treeNode3 = new TreeNode(node4.hash, node4.key, node4.val, null, null);
                            treeNode3.prev = treeNode2;
                            if (treeNode2 == null) {
                                treeNode = treeNode3;
                            } else {
                                treeNode2.next = treeNode3;
                            }
                            node4 = node4.next;
                            treeNode2 = treeNode3;
                            j2 = j4;
                        }
                        setTabAt(nodeArr, i4, new TreeBin(treeNode));
                    }
                } else if (((TreeBin) tabAt).putTreeVal(i3, obj2, node.val) == null) {
                    j2 += j;
                }
                z = false;
            }
            if (z) {
                j2++;
                node.next = tabAt;
                setTabAt(nodeArr, i4, node);
            }
            j = 1;
            node = node2;
        }
        this.table = nodeArr;
        this.sizeCtl = tableSizeFor - (tableSizeFor >>> 2);
        this.baseCount = j2;
    }

    static final int resizeStamp(int i) {
        return Integer.numberOfLeadingZeros(i) | 32768;
    }

    static final void setTabAt(Node[] nodeArr, int i, Node node) {
        U.putObjectVolatile(nodeArr, (i << ASHIFT) + ABASE, node);
    }

    static final int spread(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    static final Node tabAt(Node[] nodeArr, int i) {
        return (Node) U.getObjectVolatile(nodeArr, (i << ASHIFT) + ABASE);
    }

    private static final int tableSizeFor(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 0) {
            return 1;
        }
        if (i7 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r13v14, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r6v20, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r6v25, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    private final void transfer(Node[] nodeArr, Node[] nodeArr2) {
        Node[] nodeArr3;
        Node[] nodeArr4;
        int i;
        int i2;
        int i3;
        int i4;
        ForwardingNode forwardingNode;
        TreeNode treeNode;
        int i5;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = nodeArr.length;
        int i6 = NCPU;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        int i8 = i7 < 16 ? 16 : i7;
        if (nodeArr2 == null) {
            try {
                Node[] nodeArr5 = new Node[length << 1];
                concurrentHashMap.nextTable = nodeArr5;
                concurrentHashMap.transferIndex = length;
                nodeArr3 = nodeArr5;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            nodeArr3 = nodeArr2;
        }
        int length2 = nodeArr3.length;
        ForwardingNode forwardingNode2 = new ForwardingNode(nodeArr3);
        Node[] nodeArr6 = nodeArr;
        int i9 = 0;
        int i10 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                int i11 = i9 - 1;
                if (i11 >= i10 || z2) {
                    nodeArr4 = nodeArr6;
                    i9 = i11;
                    i10 = i10;
                } else {
                    int i12 = concurrentHashMap.transferIndex;
                    if (i12 <= 0) {
                        nodeArr4 = nodeArr6;
                        i9 = -1;
                    } else {
                        Unsafe unsafe = U;
                        long j = TRANSFERINDEX;
                        int i13 = i12 > i8 ? i12 - i8 : 0;
                        nodeArr4 = nodeArr6;
                        i = i10;
                        if (unsafe.compareAndSwapInt(this, j, i12, i13)) {
                            i9 = i12 - 1;
                            i10 = i13;
                        } else {
                            nodeArr6 = nodeArr4;
                            i9 = i11;
                            i10 = i;
                        }
                    }
                }
                nodeArr6 = nodeArr4;
                z = false;
            } else {
                Node[] nodeArr7 = nodeArr6;
                i = i10;
                TreeNode treeNode2 = null;
                if (i9 < 0 || i9 >= length || (i2 = i9 + length) >= length2) {
                    int i14 = i8;
                    int i15 = length2;
                    ForwardingNode forwardingNode3 = forwardingNode2;
                    if (z2) {
                        this.nextTable = null;
                        this.table = nodeArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    Unsafe unsafe2 = U;
                    long j2 = SIZECTL;
                    int i16 = this.sizeCtl;
                    int i17 = i9;
                    if (!unsafe2.compareAndSwapInt(this, j2, i16, i16 - 1)) {
                        forwardingNode2 = forwardingNode3;
                        concurrentHashMap = this;
                        i9 = i17;
                        nodeArr6 = nodeArr7;
                        i10 = i;
                        i8 = i14;
                        length2 = i15;
                    } else if (i16 - 2 != (resizeStamp(length) << 16)) {
                        return;
                    } else {
                        forwardingNode2 = forwardingNode3;
                        i9 = length;
                        concurrentHashMap = this;
                        nodeArr6 = nodeArr7;
                        i10 = i;
                        i8 = i14;
                        length2 = i15;
                        z = true;
                        z2 = true;
                    }
                } else {
                    Node tabAt = tabAt(nodeArr7, i9);
                    if (tabAt == null) {
                        z = casTabAt(nodeArr7, i9, null, forwardingNode2);
                        nodeArr6 = nodeArr7;
                        i10 = i;
                    } else {
                        int i18 = tabAt.hash;
                        if (i18 == -1) {
                            nodeArr6 = nodeArr7;
                            i10 = i;
                            z = true;
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(nodeArr7, i9) == tabAt) {
                                    if (i18 >= 0) {
                                        int i19 = i18 & length;
                                        TreeNode treeNode3 = tabAt;
                                        for (TreeNode treeNode4 = tabAt.next; treeNode4 != null; treeNode4 = treeNode4.next) {
                                            int i20 = treeNode4.hash & length;
                                            if (i20 != i19) {
                                                treeNode3 = treeNode4;
                                                i19 = i20;
                                            }
                                        }
                                        if (i19 == 0) {
                                            treeNode = null;
                                            treeNode2 = treeNode3;
                                        } else {
                                            treeNode = treeNode3;
                                        }
                                        Node node = tabAt;
                                        while (node != treeNode3) {
                                            int i21 = node.hash;
                                            TreeNode treeNode5 = treeNode3;
                                            Object obj = node.key;
                                            int i22 = i8;
                                            Object obj2 = node.val;
                                            if ((i21 & length) == 0) {
                                                i5 = length2;
                                                treeNode2 = new Node(i21, obj, obj2, treeNode2);
                                            } else {
                                                i5 = length2;
                                                treeNode = new Node(i21, obj, obj2, treeNode);
                                            }
                                            node = node.next;
                                            treeNode3 = treeNode5;
                                            i8 = i22;
                                            length2 = i5;
                                        }
                                        i3 = i8;
                                        i4 = length2;
                                        setTabAt(nodeArr3, i9, treeNode2);
                                        setTabAt(nodeArr3, i2, treeNode);
                                        setTabAt(nodeArr7, i9, forwardingNode2);
                                        forwardingNode = forwardingNode2;
                                        nodeArr6 = nodeArr7;
                                    } else {
                                        i3 = i8;
                                        i4 = length2;
                                        if (tabAt instanceof TreeBin) {
                                            TreeBin treeBin = (TreeBin) tabAt;
                                            TreeNode treeNode6 = null;
                                            TreeNode treeNode7 = null;
                                            Node node2 = treeBin.first;
                                            int i23 = 0;
                                            int i24 = 0;
                                            TreeNode treeNode8 = null;
                                            while (node2 != null) {
                                                TreeBin treeBin2 = treeBin;
                                                int i25 = node2.hash;
                                                ForwardingNode forwardingNode4 = forwardingNode2;
                                                TreeNode treeNode9 = new TreeNode(i25, node2.key, node2.val, null, null);
                                                if ((i25 & length) == 0) {
                                                    treeNode9.prev = treeNode7;
                                                    if (treeNode7 == null) {
                                                        treeNode2 = treeNode9;
                                                    } else {
                                                        treeNode7.next = treeNode9;
                                                    }
                                                    i23++;
                                                    treeNode7 = treeNode9;
                                                } else {
                                                    treeNode9.prev = treeNode6;
                                                    if (treeNode6 == null) {
                                                        treeNode8 = treeNode9;
                                                    } else {
                                                        treeNode6.next = treeNode9;
                                                    }
                                                    i24++;
                                                    treeNode6 = treeNode9;
                                                }
                                                node2 = node2.next;
                                                treeBin = treeBin2;
                                                forwardingNode2 = forwardingNode4;
                                            }
                                            TreeBin treeBin3 = treeBin;
                                            ForwardingNode forwardingNode5 = forwardingNode2;
                                            Node untreeify = i23 <= 6 ? untreeify(treeNode2) : i24 != 0 ? new TreeBin(treeNode2) : treeBin3;
                                            Node untreeify2 = i24 <= 6 ? untreeify(treeNode8) : i23 != 0 ? new TreeBin(treeNode8) : treeBin3;
                                            setTabAt(nodeArr3, i9, untreeify);
                                            setTabAt(nodeArr3, i2, untreeify2);
                                            forwardingNode = forwardingNode5;
                                            setTabAt(nodeArr, i9, forwardingNode);
                                            nodeArr6 = nodeArr;
                                        }
                                    }
                                    z = true;
                                } else {
                                    i3 = i8;
                                    i4 = length2;
                                }
                                forwardingNode = forwardingNode2;
                                nodeArr6 = nodeArr7;
                            }
                            forwardingNode2 = forwardingNode;
                            i10 = i;
                            i8 = i3;
                            length2 = i4;
                            concurrentHashMap = this;
                        }
                    }
                }
            }
        }
    }

    private final void treeifyBin(Node[] nodeArr, int i) {
        int length = nodeArr.length;
        if (length < 64) {
            tryPresize(length << 1);
            return;
        }
        Node tabAt = tabAt(nodeArr, i);
        if (tabAt == null || tabAt.hash < 0) {
            return;
        }
        synchronized (tabAt) {
            if (tabAt(nodeArr, i) == tabAt) {
                TreeNode treeNode = null;
                Node node = tabAt;
                TreeNode treeNode2 = null;
                while (node != null) {
                    TreeNode treeNode3 = new TreeNode(node.hash, node.key, node.val, null, null);
                    treeNode3.prev = treeNode2;
                    if (treeNode2 == null) {
                        treeNode = treeNode3;
                    } else {
                        treeNode2.next = treeNode3;
                    }
                    node = node.next;
                    treeNode2 = treeNode3;
                }
                setTabAt(nodeArr, i, new TreeBin(treeNode));
            }
        }
    }

    private final void tryPresize(int i) {
        int length;
        Node[] nodeArr;
        int tableSizeFor = i >= 536870912 ? 1073741824 : tableSizeFor(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                return;
            }
            Node[] nodeArr2 = this.table;
            if (nodeArr2 == null || (length = nodeArr2.length) == 0) {
                int i3 = i2 > tableSizeFor ? i2 : tableSizeFor;
                if (U.compareAndSwapInt(this, SIZECTL, i2, -1)) {
                    try {
                        if (this.table == nodeArr2) {
                            this.table = new Node[i3];
                            i2 = i3 - (i3 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i2;
                    }
                } else {
                    continue;
                }
            } else if (tableSizeFor <= i2 || length >= 1073741824) {
                return;
            } else {
                if (nodeArr2 == this.table) {
                    int resizeStamp = resizeStamp(length);
                    if (i2 < 0) {
                        if ((i2 >>> 16) != resizeStamp || i2 == resizeStamp + 1 || i2 == resizeStamp + 65535 || (nodeArr = this.nextTable) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (U.compareAndSwapInt(this, SIZECTL, i2, i2 + 1)) {
                            transfer(nodeArr2, nodeArr);
                        }
                    } else if (U.compareAndSwapInt(this, SIZECTL, i2, (resizeStamp << 16) + 2)) {
                        transfer(nodeArr2, null);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    static Node untreeify(Node node) {
        Node node2 = null;
        Node node3 = null;
        while (node != null) {
            Node node4 = new Node(node.hash, node.key, node.val, null);
            if (node3 == null) {
                node2 = node4;
            } else {
                node3.next = node4;
            }
            node = node.next;
            node3 = node4;
        }
        return node2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 1;
        int i2 = 0;
        while (i < 16) {
            i2++;
            i <<= 1;
        }
        int i3 = 32 - i2;
        int i4 = i - 1;
        Segment[] segmentArr = new Segment[16];
        for (int i5 = 0; i5 < 16; i5++) {
            segmentArr[i5] = new Segment(0.75f);
        }
        objectOutputStream.putFields().put("segments", segmentArr);
        objectOutputStream.putFields().put("segmentShift", i3);
        objectOutputStream.putFields().put("segmentMask", i4);
        objectOutputStream.writeFields();
        Node[] nodeArr = this.table;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                objectOutputStream.writeObject(advance.key);
                objectOutputStream.writeObject(advance.val);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void clear() {
        Node tabAt;
        Node[] nodeArr = this.table;
        long j = 0;
        loop0: while (true) {
            int i = 0;
            while (nodeArr != null && i < nodeArr.length) {
                tabAt = tabAt(nodeArr, i);
                if (tabAt == null) {
                    i++;
                } else {
                    int i2 = tabAt.hash;
                    if (i2 == -1) {
                        break;
                    }
                    synchronized (tabAt) {
                        if (tabAt(nodeArr, i) == tabAt) {
                            for (Node node = i2 >= 0 ? tabAt : tabAt instanceof TreeBin ? ((TreeBin) tabAt).first : null; node != null; node = node.next) {
                                j--;
                            }
                            setTabAt(nodeArr, i, null);
                            i++;
                        }
                    }
                }
            }
            nodeArr = helpTransfer(nodeArr, tabAt);
        }
        if (j != 0) {
            addCount(j, -1);
        }
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        int i;
        Node node;
        Object obj2;
        Object obj3;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int spread = spread(obj.hashCode());
        Node[] nodeArr = this.table;
        int i2 = 0;
        Object obj4 = null;
        int i3 = 0;
        while (true) {
            if (nodeArr != null) {
                int length = nodeArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & spread;
                    Node tabAt = tabAt(nodeArr, i4);
                    if (tabAt == null) {
                        ReservationNode reservationNode = new ReservationNode();
                        synchronized (reservationNode) {
                            if (casTabAt(nodeArr, i4, null, reservationNode)) {
                                Object apply = biFunction.apply(obj, null);
                                if (apply != null) {
                                    node = new Node(spread, obj, apply, null);
                                    i = 1;
                                } else {
                                    i = i2;
                                    node = null;
                                }
                                setTabAt(nodeArr, i4, node);
                                i2 = i;
                                obj4 = apply;
                                i3 = 1;
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    } else {
                        int i5 = tabAt.hash;
                        if (i5 == -1) {
                            nodeArr = helpTransfer(nodeArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(nodeArr, i4) == tabAt) {
                                    if (i5 >= 0) {
                                        Node node2 = null;
                                        Node node3 = tabAt;
                                        int i6 = 1;
                                        while (true) {
                                            if (node3.hash != spread || ((obj3 = node3.key) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                Node node4 = node3.next;
                                                if (node4 == null) {
                                                    Object apply2 = biFunction.apply(obj, null);
                                                    if (apply2 != null) {
                                                        node3.next = new Node(spread, obj, apply2, null);
                                                        i2 = 1;
                                                    }
                                                    obj2 = apply2;
                                                } else {
                                                    i6++;
                                                    node2 = node3;
                                                    node3 = node4;
                                                }
                                            }
                                        }
                                        obj2 = biFunction.apply(obj, node3.val);
                                        if (obj2 != null) {
                                            node3.val = obj2;
                                        } else {
                                            Node node5 = node3.next;
                                            if (node2 != null) {
                                                node2.next = node5;
                                            } else {
                                                setTabAt(nodeArr, i4, node5);
                                            }
                                            i2 = -1;
                                        }
                                        i3 = i6;
                                        obj4 = obj2;
                                    } else if (tabAt instanceof TreeBin) {
                                        TreeBin treeBin = (TreeBin) tabAt;
                                        TreeNode treeNode = treeBin.root;
                                        TreeNode findTreeNode = treeNode != null ? treeNode.findTreeNode(spread, obj, null) : null;
                                        Object apply3 = biFunction.apply(obj, findTreeNode == null ? null : findTreeNode.val);
                                        if (apply3 != null) {
                                            if (findTreeNode != null) {
                                                findTreeNode.val = apply3;
                                            } else {
                                                treeBin.putTreeVal(spread, obj, apply3);
                                                i2 = 1;
                                            }
                                        } else if (findTreeNode != null) {
                                            if (treeBin.removeTreeNode(findTreeNode)) {
                                                setTabAt(nodeArr, i4, untreeify(treeBin.first));
                                            }
                                            i2 = -1;
                                        }
                                        obj4 = apply3;
                                        i3 = 1;
                                    }
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    treeifyBin(nodeArr, i4);
                                }
                            }
                        }
                    }
                }
            }
            nodeArr = initTable();
        }
        if (i2 != 0) {
            addCount(i2, i3);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, C$r8$wrapper$java$util$function$BiFunction$VWRP.convert(biFunction));
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        int i;
        Object apply;
        TreeNode findTreeNode;
        Object obj2;
        Object obj3;
        if (obj == null || function == null) {
            throw null;
        }
        int spread = spread(obj.hashCode());
        Node[] nodeArr = this.table;
        Object obj4 = null;
        int i2 = 0;
        while (true) {
            if (nodeArr != null) {
                int length = nodeArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & spread;
                    Node tabAt = tabAt(nodeArr, i3);
                    boolean z = true;
                    if (tabAt == null) {
                        ReservationNode reservationNode = new ReservationNode();
                        synchronized (reservationNode) {
                            if (casTabAt(nodeArr, i3, null, reservationNode)) {
                                Object apply2 = function.apply(obj);
                                setTabAt(nodeArr, i3, apply2 != null ? new Node(spread, obj, apply2, null) : null);
                                obj4 = apply2;
                                i2 = 1;
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    } else {
                        int i4 = tabAt.hash;
                        if (i4 == -1) {
                            nodeArr = helpTransfer(nodeArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(nodeArr, i3) == tabAt) {
                                    if (i4 >= 0) {
                                        Node node = tabAt;
                                        i = 1;
                                        while (true) {
                                            if (node.hash != spread || ((obj3 = node.key) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                Node node2 = node.next;
                                                if (node2 == null) {
                                                    apply = function.apply(obj);
                                                    if (apply != null) {
                                                        node.next = new Node(spread, obj, apply, null);
                                                    }
                                                } else {
                                                    i++;
                                                    node = node2;
                                                }
                                            }
                                        }
                                        obj2 = node.val;
                                        z = false;
                                        int i5 = i;
                                        obj4 = obj2;
                                        i2 = i5;
                                    } else if (tabAt instanceof TreeBin) {
                                        i = 2;
                                        TreeBin treeBin = (TreeBin) tabAt;
                                        TreeNode treeNode = treeBin.root;
                                        if (treeNode == null || (findTreeNode = treeNode.findTreeNode(spread, obj, null)) == null) {
                                            apply = function.apply(obj);
                                            if (apply != null) {
                                                treeBin.putTreeVal(spread, obj, apply);
                                                i2 = i;
                                                obj4 = apply;
                                            }
                                            z = false;
                                            i2 = i;
                                            obj4 = apply;
                                        } else {
                                            obj2 = findTreeNode.val;
                                            z = false;
                                            int i52 = i;
                                            obj4 = obj2;
                                            i2 = i52;
                                        }
                                    }
                                }
                                z = false;
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    treeifyBin(nodeArr, i3);
                                }
                                if (!z) {
                                    return obj4;
                                }
                            }
                        }
                    }
                }
            }
            nodeArr = initTable();
        }
        if (obj4 != null) {
            addCount(1L, i2);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, C$r8$wrapper$java$util$function$Function$VWRP.convert(function));
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        TreeNode findTreeNode;
        Node untreeify;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int spread = spread(obj.hashCode());
        Node[] nodeArr = this.table;
        int i = 0;
        Object obj3 = null;
        int i2 = 0;
        while (true) {
            if (nodeArr != null) {
                int length = nodeArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & spread;
                    Node tabAt = tabAt(nodeArr, i3);
                    if (tabAt == null) {
                        break;
                    }
                    int i4 = tabAt.hash;
                    if (i4 == -1) {
                        nodeArr = helpTransfer(nodeArr, tabAt);
                    } else {
                        synchronized (tabAt) {
                            if (tabAt(nodeArr, i3) == tabAt) {
                                if (i4 >= 0) {
                                    i2 = 1;
                                    Node node = null;
                                    Node node2 = tabAt;
                                    while (true) {
                                        if (node2.hash != spread || ((obj2 = node2.key) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                            Node node3 = node2.next;
                                            if (node3 == null) {
                                                break;
                                            }
                                            i2++;
                                            node = node2;
                                            node2 = node3;
                                        }
                                    }
                                    obj3 = biFunction.apply(obj, node2.val);
                                    if (obj3 != null) {
                                        node2.val = obj3;
                                    } else {
                                        untreeify = node2.next;
                                        if (node != null) {
                                            node.next = untreeify;
                                            i = -1;
                                        }
                                        setTabAt(nodeArr, i3, untreeify);
                                        i = -1;
                                    }
                                } else if (tabAt instanceof TreeBin) {
                                    i2 = 2;
                                    TreeBin treeBin = (TreeBin) tabAt;
                                    TreeNode treeNode = treeBin.root;
                                    if (treeNode != null && (findTreeNode = treeNode.findTreeNode(spread, obj, null)) != null) {
                                        obj3 = biFunction.apply(obj, findTreeNode.val);
                                        if (obj3 != null) {
                                            findTreeNode.val = obj3;
                                        } else {
                                            if (treeBin.removeTreeNode(findTreeNode)) {
                                                untreeify = untreeify(treeBin.first);
                                                setTabAt(nodeArr, i3, untreeify);
                                            }
                                            i = -1;
                                        }
                                    }
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            nodeArr = initTable();
        }
        if (i != 0) {
            addCount(i, i2);
        }
        return obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, C$r8$wrapper$java$util$function$BiFunction$VWRP.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsValue(Object obj) {
        Objects.requireNonNull(obj);
        Node[] nodeArr = this.table;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                Object obj2 = advance.val;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        EntrySetView entrySetView = this.entrySet;
        if (entrySetView != null) {
            return entrySetView;
        }
        EntrySetView entrySetView2 = new EntrySetView(this);
        this.entrySet = entrySetView2;
        return entrySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        V value;
        V v;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                Node[] nodeArr = this.table;
                int length = nodeArr == null ? 0 : nodeArr.length;
                Traverser traverser = new Traverser(nodeArr, length, 0, length);
                while (true) {
                    Node advance = traverser.advance();
                    if (advance == null) {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    Object obj2 = advance.val;
                    Object obj3 = map.get(advance.key);
                    if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                        break;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public void forEach(BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        Node[] nodeArr = this.table;
        if (nodeArr == null) {
            return;
        }
        Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
        while (true) {
            Node advance = traverser.advance();
            if (advance == null) {
                return;
            }
            biConsumer.accept(advance.key, advance.val);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(C$r8$wrapper$java$util$function$BiConsumer$VWRP.convert(biConsumer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.val;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.ConcurrentHashMap$Node[] r1 = r4.table
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.ConcurrentHashMap$Node r1 = tabAt(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.hash
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.key
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.val
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.ConcurrentHashMap$Node r5 = r1.find(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.val
        L36:
            return r2
        L37:
            j$.util.concurrent.ConcurrentHashMap$Node r1 = r1.next
            if (r1 == 0) goto L4e
            int r3 = r1.hash
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.key
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.val
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int hashCode() {
        Node[] nodeArr = this.table;
        int i = 0;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                i += advance.val.hashCode() ^ advance.key.hashCode();
            }
        }
        return i;
    }

    final Node[] helpTransfer(Node[] nodeArr, Node node) {
        Node[] nodeArr2;
        int i;
        if (!(node instanceof ForwardingNode) || (nodeArr2 = ((ForwardingNode) node).nextTable) == null) {
            return this.table;
        }
        int resizeStamp = resizeStamp(nodeArr.length);
        while (true) {
            if (nodeArr2 != this.nextTable || this.table != nodeArr || (i = this.sizeCtl) >= 0 || (i >>> 16) != resizeStamp || i == resizeStamp + 1 || i == 65535 + resizeStamp || this.transferIndex <= 0) {
                break;
            } else if (U.compareAndSwapInt(this, SIZECTL, i, i + 1)) {
                transfer(nodeArr, nodeArr2);
                break;
            }
        }
        return nodeArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return sumCount() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set keySet() {
        KeySetView keySetView = this.keySet;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.keySet = keySetView2;
        return keySetView2;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i;
        Object obj3;
        Object obj4;
        Object obj5 = obj2;
        if (obj == null || obj5 == null || biFunction == null) {
            throw null;
        }
        int spread = spread(obj.hashCode());
        Node[] nodeArr = this.table;
        int i2 = 0;
        Object obj6 = null;
        int i3 = 0;
        while (true) {
            if (nodeArr != null) {
                int length = nodeArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & spread;
                    Node tabAt = tabAt(nodeArr, i4);
                    i = 1;
                    if (tabAt != null) {
                        int i5 = tabAt.hash;
                        if (i5 == -1) {
                            nodeArr = helpTransfer(nodeArr, tabAt);
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(nodeArr, i4) == tabAt) {
                                    if (i5 >= 0) {
                                        Node node = null;
                                        Node node2 = tabAt;
                                        int i6 = 1;
                                        while (true) {
                                            if (node2.hash != spread || ((obj4 = node2.key) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                Node node3 = node2.next;
                                                if (node3 == null) {
                                                    node2.next = new Node(spread, obj, obj5, null);
                                                    obj3 = obj5;
                                                    break;
                                                }
                                                i6++;
                                                node = node2;
                                                node2 = node3;
                                            }
                                        }
                                        Object apply = biFunction.apply(node2.val, obj5);
                                        if (apply != null) {
                                            node2.val = apply;
                                        } else {
                                            Node node4 = node2.next;
                                            if (node != null) {
                                                node.next = node4;
                                            } else {
                                                setTabAt(nodeArr, i4, node4);
                                            }
                                            i2 = -1;
                                        }
                                        i = i2;
                                        obj3 = apply;
                                        i3 = i6;
                                        obj6 = obj3;
                                        i2 = i;
                                    } else if (tabAt instanceof TreeBin) {
                                        i3 = 2;
                                        TreeBin treeBin = (TreeBin) tabAt;
                                        TreeNode treeNode = treeBin.root;
                                        TreeNode findTreeNode = treeNode == null ? null : treeNode.findTreeNode(spread, obj, null);
                                        Object apply2 = findTreeNode == null ? obj5 : biFunction.apply(findTreeNode.val, obj5);
                                        if (apply2 != null) {
                                            if (findTreeNode != null) {
                                                findTreeNode.val = apply2;
                                            } else {
                                                treeBin.putTreeVal(spread, obj, apply2);
                                                i2 = 1;
                                            }
                                        } else if (findTreeNode != null) {
                                            if (treeBin.removeTreeNode(findTreeNode)) {
                                                setTabAt(nodeArr, i4, untreeify(treeBin.first));
                                            }
                                            i2 = -1;
                                        }
                                        obj6 = apply2;
                                    }
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    treeifyBin(nodeArr, i4);
                                }
                                i = i2;
                                obj5 = obj6;
                            }
                        }
                    } else if (casTabAt(nodeArr, i4, null, new Node(spread, obj, obj5, null))) {
                        break;
                    }
                }
            }
            nodeArr = initTable();
        }
        if (i != 0) {
            addCount(i, i3);
        }
        return obj5;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, C$r8$wrapper$java$util$function$BiFunction$VWRP.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V put(K k, V v) {
        return (V) putVal(k, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void putAll(Map map) {
        tryPresize(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            putVal(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k, V v) {
        return (V) putVal(k, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r11 == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object putVal(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L98
            if (r10 == 0) goto L98
            int r1 = r9.hashCode()
            int r1 = spread(r1)
            r2 = 0
            j$.util.concurrent.ConcurrentHashMap$Node[] r3 = r8.table
        L10:
            if (r3 == 0) goto L92
            int r4 = r3.length
            if (r4 != 0) goto L17
            goto L92
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.ConcurrentHashMap$Node r5 = tabAt(r3, r4)
            if (r5 != 0) goto L2c
            j$.util.concurrent.ConcurrentHashMap$Node r5 = new j$.util.concurrent.ConcurrentHashMap$Node
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = casTabAt(r3, r4, r0, r5)
            if (r4 == 0) goto L10
            goto L89
        L2c:
            int r6 = r5.hash
            r7 = -1
            if (r6 != r7) goto L36
            j$.util.concurrent.ConcurrentHashMap$Node[] r3 = r8.helpTransfer(r3, r5)
            goto L10
        L36:
            monitor-enter(r5)
            j$.util.concurrent.ConcurrentHashMap$Node r7 = tabAt(r3, r4)     // Catch: java.lang.Throwable -> L8f
            if (r7 != r5) goto L7b
            if (r6 < 0) goto L68
            r2 = 1
            r6 = r5
        L41:
            int r7 = r6.hash     // Catch: java.lang.Throwable -> L8f
            if (r7 != r1) goto L58
            java.lang.Object r7 = r6.key     // Catch: java.lang.Throwable -> L8f
            if (r7 == r9) goto L51
            if (r7 == 0) goto L58
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L8f
            if (r7 == 0) goto L58
        L51:
            java.lang.Object r7 = r6.val     // Catch: java.lang.Throwable -> L8f
            if (r11 != 0) goto L7c
        L55:
            r6.val = r10     // Catch: java.lang.Throwable -> L8f
            goto L7c
        L58:
            j$.util.concurrent.ConcurrentHashMap$Node r7 = r6.next     // Catch: java.lang.Throwable -> L8f
            if (r7 != 0) goto L64
            j$.util.concurrent.ConcurrentHashMap$Node r7 = new j$.util.concurrent.ConcurrentHashMap$Node     // Catch: java.lang.Throwable -> L8f
            r7.<init>(r1, r9, r10, r0)     // Catch: java.lang.Throwable -> L8f
            r6.next = r7     // Catch: java.lang.Throwable -> L8f
            goto L7b
        L64:
            int r2 = r2 + 1
            r6 = r7
            goto L41
        L68:
            boolean r6 = r5 instanceof j$.util.concurrent.ConcurrentHashMap.TreeBin     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L7b
            r2 = 2
            r6 = r5
            j$.util.concurrent.ConcurrentHashMap$TreeBin r6 = (j$.util.concurrent.ConcurrentHashMap.TreeBin) r6     // Catch: java.lang.Throwable -> L8f
            j$.util.concurrent.ConcurrentHashMap$TreeNode r6 = r6.putTreeVal(r1, r9, r10)     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L7b
            java.lang.Object r7 = r6.val     // Catch: java.lang.Throwable -> L8f
            if (r11 != 0) goto L7c
            goto L55
        L7b:
            r7 = r0
        L7c:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L10
            r9 = 8
            if (r2 < r9) goto L86
            r8.treeifyBin(r3, r4)
        L86:
            if (r7 == 0) goto L89
            return r7
        L89:
            r9 = 1
            r8.addCount(r9, r2)
            return r0
        L8f:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L8f
            throw r9
        L92:
            j$.util.concurrent.ConcurrentHashMap$Node[] r3 = r8.initTable()
            goto L10
        L98:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.putVal(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V remove(Object obj) {
        return (V) replaceNode(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        return (obj2 == null || replaceNode(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return replaceNode(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(K k, V v, V v2) {
        if (k == null || v == null || v2 == null) {
            throw null;
        }
        return replaceNode(k, v2, v) != null;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        Objects.requireNonNull(biFunction);
        Node[] nodeArr = this.table;
        if (nodeArr == null) {
            return;
        }
        Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
        while (true) {
            Node advance = traverser.advance();
            if (advance == null) {
                return;
            }
            Object obj = advance.val;
            Object obj2 = advance.key;
            do {
                Object apply = biFunction.apply(obj2, obj);
                Objects.requireNonNull(apply);
                if (replaceNode(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(C$r8$wrapper$java$util$function$BiFunction$VWRP.convert(biFunction));
    }

    final Object replaceNode(Object obj, Object obj2, Object obj3) {
        int length;
        int i;
        Node tabAt;
        Object obj4;
        TreeNode findTreeNode;
        Node untreeify;
        Object obj5;
        int spread = spread(obj.hashCode());
        Node[] nodeArr = this.table;
        while (true) {
            if (nodeArr == null || (length = nodeArr.length) == 0 || (tabAt = tabAt(nodeArr, (i = (length - 1) & spread))) == null) {
                break;
            }
            int i2 = tabAt.hash;
            if (i2 == -1) {
                nodeArr = helpTransfer(nodeArr, tabAt);
            } else {
                boolean z = false;
                synchronized (tabAt) {
                    if (tabAt(nodeArr, i) == tabAt) {
                        if (i2 >= 0) {
                            Node node = null;
                            Node node2 = tabAt;
                            while (true) {
                                if (node2.hash != spread || ((obj5 = node2.key) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                    Node node3 = node2.next;
                                    if (node3 == null) {
                                        break;
                                    }
                                    node = node2;
                                    node2 = node3;
                                }
                            }
                            obj4 = node2.val;
                            if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                if (obj2 != null) {
                                    node2.val = obj2;
                                } else if (node != null) {
                                    node.next = node2.next;
                                } else {
                                    untreeify = node2.next;
                                    setTabAt(nodeArr, i, untreeify);
                                }
                                z = true;
                            }
                            obj4 = null;
                            z = true;
                        } else if (tabAt instanceof TreeBin) {
                            TreeBin treeBin = (TreeBin) tabAt;
                            TreeNode treeNode = treeBin.root;
                            if (treeNode != null && (findTreeNode = treeNode.findTreeNode(spread, obj, null)) != null) {
                                obj4 = findTreeNode.val;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        findTreeNode.val = obj2;
                                    } else if (treeBin.removeTreeNode(findTreeNode)) {
                                        untreeify = untreeify(treeBin.first);
                                        setTabAt(nodeArr, i, untreeify);
                                    }
                                    z = true;
                                }
                            }
                            obj4 = null;
                            z = true;
                        }
                    }
                    obj4 = null;
                }
                if (z) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            addCount(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0;
        }
        if (sumCount > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) sumCount;
    }

    final long sumCount() {
        CounterCell[] counterCellArr = this.counterCells;
        long j = this.baseCount;
        if (counterCellArr != null) {
            for (CounterCell counterCell : counterCellArr) {
                if (counterCell != null) {
                    j += counterCell.value;
                }
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        Node[] nodeArr = this.table;
        int length = nodeArr == null ? 0 : nodeArr.length;
        Traverser traverser = new Traverser(nodeArr, length, 0, length);
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Node advance = traverser.advance();
        if (advance != null) {
            while (true) {
                Object obj = advance.key;
                Object obj2 = advance.val;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                sb.append(',');
                sb.append(' ');
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public java.util.Collection<V> values() {
        ValuesView valuesView = this.values;
        if (valuesView != null) {
            return valuesView;
        }
        ValuesView valuesView2 = new ValuesView(this);
        this.values = valuesView2;
        return valuesView2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class CollectionView implements java.util.Collection, Serializable {
        final ConcurrentHashMap map;

        CollectionView(ConcurrentHashMap concurrentHashMap) {
            this.map = concurrentHashMap;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.map.clear();
        }

        @Override // java.util.Collection
        public abstract boolean contains(Object obj);

        /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
        @Override // java.util.Collection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean containsAll(java.util.Collection r2) {
            /*
                r1 = this;
                if (r2 == r1) goto L1a
                java.util.Iterator r2 = r2.iterator()
            L6:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1a
                java.lang.Object r0 = r2.next()
                if (r0 == 0) goto L18
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L6
            L18:
                r2 = 0
                return r2
            L1a:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.CollectionView.containsAll(java.util.Collection):boolean");
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.map.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public abstract java.util.Iterator iterator();

        @Override // java.util.Collection
        public final boolean removeAll(java.util.Collection collection) {
            Objects.requireNonNull(collection);
            java.util.Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(java.util.Collection collection) {
            Objects.requireNonNull(collection);
            java.util.Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return this.map.size();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            long sumCount = this.map.sumCount();
            if (sumCount < 0) {
                sumCount = 0;
            }
            if (sumCount <= 2147483639) {
                int i = (int) sumCount;
                Object[] objArr = new Object[i];
                int i2 = 0;
                java.util.Iterator it = iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (i2 == i) {
                        if (i >= 2147483639) {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                        int i3 = i < 1073741819 ? (i >>> 1) + 1 + i : 2147483639;
                        objArr = Arrays.copyOf(objArr, i3);
                        i = i3;
                    }
                    objArr[i2] = next;
                    i2++;
                }
                return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
            }
            throw new OutOfMemoryError("Required array size too large");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            java.util.Iterator it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    sb.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(',');
                    sb.append(' ');
                }
            }
            sb.append(']');
            return sb.toString();
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            long sumCount = this.map.sumCount();
            if (sumCount < 0) {
                sumCount = 0;
            }
            if (sumCount <= 2147483639) {
                int i = (int) sumCount;
                Object[] objArr2 = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
                int length = objArr2.length;
                int i2 = 0;
                java.util.Iterator it = iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (i2 == length) {
                        if (length >= 2147483639) {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                        int i3 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        length = i3;
                    }
                    objArr2[i2] = next;
                    i2++;
                }
                if (objArr != objArr2 || i2 >= length) {
                    return i2 == length ? objArr2 : Arrays.copyOf(objArr2, i2);
                }
                objArr2[i2] = null;
                return objArr2;
            }
            throw new OutOfMemoryError("Required array size too large");
        }
    }
}
