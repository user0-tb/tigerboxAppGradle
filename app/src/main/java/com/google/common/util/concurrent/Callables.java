package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Callables {
    private Callables() {
    }

    public static <T> Callable<T> returning(@ParametricNullness final T t) {
        return new Callable<T>() { // from class: com.google.common.util.concurrent.Callables.1
            @Override // java.util.concurrent.Callable
            @ParametricNullness
            public T call() {
                return (T) t;
            }
        };
    }

    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(listeningExecutorService);
        return new AsyncCallable<T>() { // from class: com.google.common.util.concurrent.Callables.2
            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture<T> call() throws Exception {
                return ListeningExecutorService.this.submit((Callable) callable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> Callable<T> threadRenaming(final Callable<T> callable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(callable);
        return new Callable<T>() { // from class: com.google.common.util.concurrent.Callables.3
            @Override // java.util.concurrent.Callable
            @ParametricNullness
            public T call() throws Exception {
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                boolean trySetName = Callables.trySetName((String) Supplier.this.get(), currentThread);
                try {
                    return (T) callable.call();
                } finally {
                    if (trySetName) {
                        Callables.trySetName(name, currentThread);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable threadRenaming(final Runnable runnable, final Supplier<String> supplier) {
        Preconditions.checkNotNull(supplier);
        Preconditions.checkNotNull(runnable);
        return new Runnable() { // from class: com.google.common.util.concurrent.Callables.4
            @Override // java.lang.Runnable
            public void run() {
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                boolean trySetName = Callables.trySetName((String) Supplier.this.get(), currentThread);
                try {
                    runnable.run();
                } finally {
                    if (trySetName) {
                        Callables.trySetName(name, currentThread);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean trySetName(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
