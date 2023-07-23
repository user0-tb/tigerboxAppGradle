package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface BaseStream extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    BaseStream onClose(Runnable runnable);

    BaseStream parallel();

    BaseStream sequential();

    Spliterator spliterator();

    BaseStream unordered();
}
