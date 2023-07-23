package media.tiger.tigerbox.usecase.tigerboxuserrepo;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.data.repository.TigerBoxAccountRepository;

/* loaded from: classes4.dex */
public final class GetTigerBoxAccountUseCase_Factory implements Factory<GetTigerBoxAccountUseCase> {
    private final Provider<TigerBoxAccountRepository> repositoryProvider;

    public GetTigerBoxAccountUseCase_Factory(Provider<TigerBoxAccountRepository> repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    @Override // javax.inject.Provider
    public GetTigerBoxAccountUseCase get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static GetTigerBoxAccountUseCase_Factory create(Provider<TigerBoxAccountRepository> repositoryProvider) {
        return new GetTigerBoxAccountUseCase_Factory(repositoryProvider);
    }

    public static GetTigerBoxAccountUseCase newInstance(TigerBoxAccountRepository repository) {
        return new GetTigerBoxAccountUseCase(repository);
    }
}
