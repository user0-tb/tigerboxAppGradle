package media.tiger.tigerbox.usecase.accesstokenrepo;

import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.data.repository.AccessTokenRepository;
import media.tiger.tigerbox.model.domain.AccessTokenDomain;

/* compiled from: GetAccessTokenUseCase.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0086\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lmedia/tiger/tigerbox/usecase/accesstokenrepo/GetAccessTokenUseCase;", "", "repository", "Ljavax/inject/Provider;", "Lmedia/tiger/tigerbox/data/repository/AccessTokenRepository;", "(Ljavax/inject/Provider;)V", "invoke", "Lmedia/tiger/tigerbox/model/domain/AccessTokenDomain;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetAccessTokenUseCase {
    private final Provider<AccessTokenRepository> repository;

    @Inject
    public GetAccessTokenUseCase(Provider<AccessTokenRepository> repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final AccessTokenDomain invoke() {
        return this.repository.get().getTokens();
    }
}
