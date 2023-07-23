package media.tiger.tigerbox.usecase.accesstokenrepo;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.repository.AccessTokenRepository;

/* loaded from: classes4.dex */
public final class FetchAndStoreAccessTokenUseCase_Factory implements Factory<FetchAndStoreAccessTokenUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<AccessTokenRepository> repositoryProvider;

    public FetchAndStoreAccessTokenUseCase_Factory(Provider<AccessTokenRepository> repositoryProvider, Provider<CoroutineDispatcher> dispatcherProvider) {
        this.repositoryProvider = repositoryProvider;
        this.dispatcherProvider = dispatcherProvider;
    }

    @Override // javax.inject.Provider
    public FetchAndStoreAccessTokenUseCase get() {
        return newInstance(this.repositoryProvider.get(), this.dispatcherProvider.get());
    }

    public static FetchAndStoreAccessTokenUseCase_Factory create(Provider<AccessTokenRepository> repositoryProvider, Provider<CoroutineDispatcher> dispatcherProvider) {
        return new FetchAndStoreAccessTokenUseCase_Factory(repositoryProvider, dispatcherProvider);
    }

    public static FetchAndStoreAccessTokenUseCase newInstance(AccessTokenRepository repository, CoroutineDispatcher dispatcher) {
        return new FetchAndStoreAccessTokenUseCase(repository, dispatcher);
    }
}
