package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes3.dex */
public final class CoroutinesModule_ProvidesDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesDefaultDispatcher();
    }

    public static CoroutinesModule_ProvidesDefaultDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineDispatcher providesDefaultDispatcher() {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.providesDefaultDispatcher());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final CoroutinesModule_ProvidesDefaultDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesDefaultDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
