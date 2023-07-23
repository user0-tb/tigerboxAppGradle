package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes3.dex */
public final class CoroutinesModule_ProvidesMainDispatcherFactory implements Factory<CoroutineDispatcher> {
    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesMainDispatcher();
    }

    public static CoroutinesModule_ProvidesMainDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineDispatcher providesMainDispatcher() {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.providesMainDispatcher());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final CoroutinesModule_ProvidesMainDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesMainDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
