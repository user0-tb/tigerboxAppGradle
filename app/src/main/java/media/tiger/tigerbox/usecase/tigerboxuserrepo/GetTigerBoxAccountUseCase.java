package media.tiger.tigerbox.usecase.tigerboxuserrepo;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.data.repository.TigerBoxAccountRepository;
import media.tiger.tigerbox.model.domain.TigerBoxAccountDomain;

/* compiled from: GetTigerBoxAccountUseCase.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/usecase/tigerboxuserrepo/GetTigerBoxAccountUseCase;", "", "repository", "Lmedia/tiger/tigerbox/data/repository/TigerBoxAccountRepository;", "(Lmedia/tiger/tigerbox/data/repository/TigerBoxAccountRepository;)V", "invoke", "Lmedia/tiger/tigerbox/model/domain/TigerBoxAccountDomain;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetTigerBoxAccountUseCase {
    private final TigerBoxAccountRepository repository;

    @Inject
    public GetTigerBoxAccountUseCase(TigerBoxAccountRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    public final TigerBoxAccountDomain invoke() {
        return new TigerBoxAccountDomain(this.repository.getTigerBoxUser(), this.repository.getTigerBoxProfiles());
    }
}
