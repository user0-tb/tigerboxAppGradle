package media.tiger.tigerbox.usecase.tigerboxuserrepo;

import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.repository.TigerBoxAccountRepository;

/* loaded from: classes4.dex */
public final class FetchAccountInfoUseCase_Factory implements Factory<FetchAccountInfoUseCase> {
    private final Provider<CoroutineDispatcher> dispatcherProvider;
    private final Provider<TigerBoxAccountRepository> repositoryProvider;

    public FetchAccountInfoUseCase_Factory(Provider<TigerBoxAccountRepository> repositoryProvider, Provider<CoroutineDispatcher> dispatcherProvider) {
        this.repositoryProvider = repositoryProvider;
        this.dispatcherProvider = dispatcherProvider;
    }

    @Override // javax.inject.Provider
    public FetchAccountInfoUseCase get() {
        return newInstance(this.repositoryProvider.get(), this.dispatcherProvider.get());
    }

    public static FetchAccountInfoUseCase_Factory create(Provider<TigerBoxAccountRepository> repositoryProvider, Provider<CoroutineDispatcher> dispatcherProvider) {
        return new FetchAccountInfoUseCase_Factory(repositoryProvider, dispatcherProvider);
    }

    public static FetchAccountInfoUseCase newInstance(TigerBoxAccountRepository repository, CoroutineDispatcher dispatcher) {
        return new FetchAccountInfoUseCase(repository, dispatcher);
    }
}
