package kotlin.collections;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.wrappers.C$r8$wrapper$java$util$function$Consumer$VWRP;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: AbstractMap.kt */
@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0002\u001a\u00020\u0003H\u0096\u0002J\u000e\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"kotlin/collections/AbstractMap$values$1$iterator$1", "", "hasNext", "", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AbstractMap$values$1$iterator$1<V> implements Iterator<V>, KMappedMarker, j$.util.Iterator {
    final /* synthetic */ Iterator<Map.Entry<K, V>> $entryIterator;

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractMap$values$1$iterator$1(java.util.Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.$entryIterator = it;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.$entryIterator.hasNext();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public V next() {
        return (V) ((Map.Entry) this.$entryIterator.next()).getValue();
    }
}
