package media.tiger.tigerbox.usecase.accesstokenrepo;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.data.repository.AccessTokenRepository;

/* loaded from: classes4.dex */
public final class GetAccessTokenUseCase_Factory implements Factory<GetAccessTokenUseCase> {
    private final Provider<AccessTokenRepository> repositoryProvider;

    public GetAccessTokenUseCase_Factory(Provider<AccessTokenRepository> repositoryProvider) {
        this.repositoryProvider = repositoryProvider;
    }

    @Override // javax.inject.Provider
    public GetAccessTokenUseCase get() {
        return newInstance(this.repositoryProvider);
    }

    public static GetAccessTokenUseCase_Factory create(Provider<AccessTokenRepository> repositoryProvider) {
        return new GetAccessTokenUseCase_Factory(repositoryProvider);
    }

    public static GetAccessTokenUseCase newInstance(Provider<AccessTokenRepository> repository) {
        return new GetAccessTokenUseCase(repository);
    }
}
