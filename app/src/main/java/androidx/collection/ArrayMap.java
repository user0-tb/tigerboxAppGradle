package androidx.collection;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import j$.wrappers.C$r8$wrapper$java$util$function$BiConsumer$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$BiFunction$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$function$Function$VWRP;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V>, j$.util.Map {
    MapCollections<K, V> mCollections;

    @Override // j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, C$r8$wrapper$java$util$function$BiFunction$VWRP.convert(biFunction));
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, C$r8$wrapper$java$util$function$Function$VWRP.convert(function));
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, C$r8$wrapper$java$util$function$BiFunction$VWRP.convert(biFunction));
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(C$r8$wrapper$java$util$function$BiConsumer$VWRP.convert(biConsumer));
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, C$r8$wrapper$java$util$function$BiFunction$VWRP.convert(biFunction));
    }

    @Override // j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(C$r8$wrapper$java$util$function$BiFunction$VWRP.convert(biFunction));
    }

    public ArrayMap() {
    }

    public ArrayMap(int i) {
        super(i);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }

    private MapCollections<K, V> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new MapCollections<K, V>() { // from class: androidx.collection.ArrayMap.1
                @Override // androidx.collection.MapCollections
                protected int colGetSize() {
                    return ArrayMap.this.mSize;
                }

                @Override // androidx.collection.MapCollections
                protected Object colGetEntry(int i, int i2) {
                    return ArrayMap.this.mArray[(i << 1) + i2];
                }

                @Override // androidx.collection.MapCollections
                protected int colIndexOfKey(Object obj) {
                    return ArrayMap.this.indexOfKey(obj);
                }

                @Override // androidx.collection.MapCollections
                protected int colIndexOfValue(Object obj) {
                    return ArrayMap.this.indexOfValue(obj);
                }

                @Override // androidx.collection.MapCollections
                protected java.util.Map<K, V> colGetMap() {
                    return ArrayMap.this;
                }

                @Override // androidx.collection.MapCollections
                protected void colPut(K k, V v) {
                    ArrayMap.this.put(k, v);
                }

                @Override // androidx.collection.MapCollections
                protected V colSetValue(int i, V v) {
                    return ArrayMap.this.setValueAt(i, v);
                }

                @Override // androidx.collection.MapCollections
                protected void colRemoveAt(int i) {
                    ArrayMap.this.removeAt(i);
                }

                @Override // androidx.collection.MapCollections
                protected void colClear() {
                    ArrayMap.this.clear();
                }
            };
        }
        return this.mCollections;
    }

    public boolean containsAll(Collection<?> collection) {
        return MapCollections.containsAllHelper(this, collection);
    }

    @Override // java.util.Map, j$.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        ensureCapacity(this.mSize + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(Collection<?> collection) {
        return MapCollections.removeAllHelper(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return MapCollections.retainAllHelper(this, collection);
    }

    @Override // java.util.Map, j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return getCollection().getEntrySet();
    }

    @Override // java.util.Map, j$.util.Map
    public Set<K> keySet() {
        return getCollection().getKeySet();
    }

    @Override // java.util.Map, j$.util.Map
    public Collection<V> values() {
        return getCollection().getValues();
    }
}
