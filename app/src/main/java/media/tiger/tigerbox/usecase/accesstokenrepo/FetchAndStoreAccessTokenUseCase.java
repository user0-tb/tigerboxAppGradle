package media.tiger.tigerbox.usecase.accesstokenrepo;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.repository.AccessTokenRepository;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.infrastructure.interactor.UseCase;
import media.tiger.tigerbox.model.domain.AccessTokenDomain;

/* compiled from: FetchAndStoreAccessTokenUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmedia/tiger/tigerbox/usecase/accesstokenrepo/FetchAndStoreAccessTokenUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "Lmedia/tiger/tigerbox/usecase/accesstokenrepo/GetTokenParameters;", "Lmedia/tiger/tigerbox/model/domain/AccessTokenDomain;", "repository", "Lmedia/tiger/tigerbox/data/repository/AccessTokenRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/repository/AccessTokenRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/accesstokenrepo/GetTokenParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FetchAndStoreAccessTokenUseCase extends UseCase<GetTokenParameters, AccessTokenDomain> {
    private final AccessTokenRepository repository;

    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    public /* bridge */ /* synthetic */ Object run(GetTokenParameters getTokenParameters, Continuation<? super Either<? extends Failure, ? extends AccessTokenDomain>> continuation) {
        return run2(getTokenParameters, (Continuation<? super Either<? extends Failure, AccessTokenDomain>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public FetchAndStoreAccessTokenUseCase(AccessTokenRepository repository, CoroutineDispatcher dispatcher) {
        super(dispatcher);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.repository = repository;
    }

    /* renamed from: run  reason: avoid collision after fix types in other method */
    public Object run2(GetTokenParameters getTokenParameters, Continuation<? super Either<? extends Failure, AccessTokenDomain>> continuation) {
        return this.repository.requestAccessTokens(getTokenParameters, continuation);
    }
}
