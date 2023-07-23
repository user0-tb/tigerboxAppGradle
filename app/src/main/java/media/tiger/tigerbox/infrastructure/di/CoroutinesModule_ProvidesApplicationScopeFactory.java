package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class CoroutinesModule_ProvidesApplicationScopeFactory implements Factory<CoroutineScope> {
    private final Provider<CoroutineDispatcher> defaultDispatcherProvider;

    public CoroutinesModule_ProvidesApplicationScopeFactory(Provider<CoroutineDispatcher> defaultDispatcherProvider) {
        this.defaultDispatcherProvider = defaultDispatcherProvider;
    }

    @Override // javax.inject.Provider
    public CoroutineScope get() {
        return providesApplicationScope(this.defaultDispatcherProvider.get());
    }

    public static CoroutinesModule_ProvidesApplicationScopeFactory create(Provider<CoroutineDispatcher> defaultDispatcherProvider) {
        return new CoroutinesModule_ProvidesApplicationScopeFactory(defaultDispatcherProvider);
    }

    public static CoroutineScope providesApplicationScope(CoroutineDispatcher defaultDispatcher) {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(CoroutinesModule.INSTANCE.providesApplicationScope(defaultDispatcher));
    }
}
