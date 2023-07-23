package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes3.dex */
public final class CoroutinesModule_ProvidesMainImmediateDispatcherFactory implements Factory<CoroutineDispatcher> {
    @Override // javax.inject.Provider
    public CoroutineDispatcher get() {
        return providesMainImmediateDispatcher();
    }

    public static CoroutinesModule_ProvidesMainImmediateDispatcherFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineDispatcher providesMainImmediateDispatcher() {
        return (CoroutineDispatcher) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.providesMainImmediateDispatcher());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final CoroutinesModule_ProvidesMainImmediateDispatcherFactory INSTANCE = new CoroutinesModule_ProvidesMainImmediateDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
