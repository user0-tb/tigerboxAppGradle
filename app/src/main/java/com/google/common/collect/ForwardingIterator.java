package com.google.common.collect;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.wrappers.C$r8$wrapper$java$util$function$Consumer$VWRP;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T>, j$.util.Iterator {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    public abstract Iterator<T> delegate();

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return delegate().hasNext();
    }

    @ParametricNullness
    public T next() {
        return delegate().next();
    }

    public void remove() {
        delegate().remove();
    }
}
