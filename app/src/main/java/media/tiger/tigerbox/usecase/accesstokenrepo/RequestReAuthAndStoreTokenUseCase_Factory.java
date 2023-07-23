package media.tiger.tigerbox.usecase.accesstokenrepo;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.repository.AccessTokenRepository;

/* loaded from: classes4.dex */
public final class RequestReAuthAndStoreTokenUseCase_Factory implements Factory<RequestReAuthAndStoreTokenUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<AccessTokenRepository> repositoryProvider;

    public RequestReAuthAndStoreTokenUseCase_Factory(Provider<AccessTokenRepository> repositoryProvider, Provider<CoroutineDispatcher> dispatcherProvider) {
        this.repositoryProvider = repositoryProvider;
        this.dispatcherProvider = dispatcherProvider;
    }

    @Override // javax.inject.Provider
    public RequestReAuthAndStoreTokenUseCase get() {
        return newInstance(this.repositoryProvider, this.dispatcherProvider.get());
    }

    public static RequestReAuthAndStoreTokenUseCase_Factory create(Provider<AccessTokenRepository> repositoryProvider, Provider<CoroutineDispatcher> dispatcherProvider) {
        return new RequestReAuthAndStoreTokenUseCase_Factory(repositoryProvider, dispatcherProvider);
    }

    public static RequestReAuthAndStoreTokenUseCase newInstance(Provider<AccessTokenRepository> repository, CoroutineDispatcher dispatcher) {
        return new RequestReAuthAndStoreTokenUseCase(repository, dispatcher);
    }
}
