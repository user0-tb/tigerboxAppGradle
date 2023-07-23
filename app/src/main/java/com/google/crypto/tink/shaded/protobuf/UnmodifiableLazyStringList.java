package com.google.crypto.tink.shaded.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import j$.wrappers.C$r8$wrapper$java$util$function$Consumer$VWRP;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {
    private final LazyStringList list;

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    public UnmodifiableLazyStringList(LazyStringList list) {
        this.list = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int index) {
        return (String) this.list.get(index);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public Object getRaw(int index) {
        return this.list.getRaw(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public ByteString getByteString(int index) {
        return this.list.getByteString(index);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(ByteString element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int index, ByteString element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public byte[] getByteArray(int index) {
        return this.list.getByteArray(index);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int index, byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> element) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements ListIterator<String>, Iterator {
        ListIterator<String> iter;
        final /* synthetic */ int val$index;

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
        }

        AnonymousClass1(final int val$index) {
            this.val$index = val$index;
            this.iter = UnmodifiableLazyStringList.this.list.listIterator(val$index);
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public String next() {
            return this.iter.next();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.iter.hasPrevious();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.iter.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.iter.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.iter.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(String o) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void add(String o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(final int index) {
        return new AnonymousClass1(index);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.UnmodifiableLazyStringList$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements java.util.Iterator<String>, Iterator {
        java.util.Iterator<String> iter;

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super String> consumer) {
            forEachRemaining(C$r8$wrapper$java$util$function$Consumer$VWRP.convert(consumer));
        }

        AnonymousClass2() {
            this.iter = UnmodifiableLazyStringList.this.list.iterator();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.iter.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public String next() {
            return this.iter.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<String> iterator() {
        return new AnonymousClass2();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void mergeFrom(LazyStringList other) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return Collections.unmodifiableList(this.list.asByteStringList());
    }
}
