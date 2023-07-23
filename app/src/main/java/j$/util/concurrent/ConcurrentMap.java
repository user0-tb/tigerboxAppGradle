package j$.util.concurrent;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer$$ExternalSyntheticLambda0;
import j$.util.function.Function;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface ConcurrentMap<K, V> extends Map<K, V> {

    /* renamed from: j$.util.concurrent.ConcurrentMap$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$compute(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            while (true) {
                Object obj2 = concurrentMap.get(obj);
                while (true) {
                    Object apply = biFunction.apply(obj, obj2);
                    if (apply == null) {
                        if ((obj2 == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, obj2)) {
                            return null;
                        }
                    } else if (obj2 == null) {
                        obj2 = concurrentMap.putIfAbsent(obj, apply);
                        if (obj2 == null) {
                            return apply;
                        }
                    } else if (concurrentMap.replace(obj, obj2, apply)) {
                        return apply;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfAbsent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Function function) {
            Object apply;
            Objects.requireNonNull(function);
            Object obj2 = concurrentMap.get(obj);
            return (obj2 == null && (apply = function.apply(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfPresent(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            while (true) {
                Object obj2 = concurrentMap.get(obj);
                if (obj2 == null) {
                    return obj2;
                }
                Object apply = biFunction.apply(obj, obj2);
                if (apply != null) {
                    if (concurrentMap.replace(obj, obj2, apply)) {
                        return apply;
                    }
                } else if (concurrentMap.remove(obj, obj2)) {
                    return null;
                }
            }
        }

        public static void $default$forEach(java.util.concurrent.ConcurrentMap concurrentMap, BiConsumer biConsumer) {
            Objects.requireNonNull(biConsumer);
            for (Map.Entry<K, V> entry : concurrentMap.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (IllegalStateException unused) {
                }
            }
        }

        public static Object $default$getOrDefault(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Object obj2) {
            Object obj3 = concurrentMap.get(obj);
            return obj3 != null ? obj3 : obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$merge(java.util.concurrent.ConcurrentMap concurrentMap, Object obj, Object obj2, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Objects.requireNonNull(obj2);
            while (true) {
                Object obj3 = concurrentMap.get(obj);
                while (obj3 == null) {
                    obj3 = concurrentMap.putIfAbsent(obj, obj2);
                    if (obj3 == null) {
                        return obj2;
                    }
                }
                Object apply = biFunction.apply(obj3, obj2);
                if (apply != null) {
                    if (concurrentMap.replace(obj, obj3, apply)) {
                        return apply;
                    }
                } else if (concurrentMap.remove(obj, obj3)) {
                    return null;
                }
            }
        }

        public static void $default$replaceAll(java.util.concurrent.ConcurrentMap concurrentMap, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Consumer$$ExternalSyntheticLambda0 consumer$$ExternalSyntheticLambda0 = new Consumer$$ExternalSyntheticLambda0(concurrentMap, biFunction);
            if (concurrentMap instanceof ConcurrentMap) {
                ((ConcurrentMap) concurrentMap).forEach(consumer$$ExternalSyntheticLambda0);
            } else {
                $default$forEach(concurrentMap, consumer$$ExternalSyntheticLambda0);
            }
        }
    }

    @Override // j$.util.Map
    V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    @Override // j$.util.Map
    V computeIfAbsent(K k, Function<? super K, ? extends V> function);

    @Override // j$.util.Map
    V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction);

    @Override // j$.util.Map
    void forEach(BiConsumer<? super K, ? super V> biConsumer);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V getOrDefault(Object obj, V v);

    @Override // j$.util.Map
    V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V putIfAbsent(K k, V v);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    boolean remove(Object obj, Object obj2);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    V replace(K k, V v);

    @Override // java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    boolean replace(K k, V v, V v2);

    @Override // j$.util.Map
    void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction);
}
