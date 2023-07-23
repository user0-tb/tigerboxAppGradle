package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes3.dex */
public final class CoroutinesModule_ProvidesIoDispatcherFactory implements Factory<CoroutineDispatcher> {
    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesIoDispatcher();
    }

    public static CoroutinesModule_ProvidesIoDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineDispatcher providesIoDispatcher() {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.providesIoDispatcher());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final CoroutinesModule_ProvidesIoDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
