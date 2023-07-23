package media.tiger.tigerbox.usecase.accesstokenrepo;

import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.repository.AccessTokenRepository;
import media.tiger.tigerbox.data.repository.TigerBoxAccountRepository;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.infrastructure.interactor.UseCase;

/* compiled from: RemoveAccountDataUseCase.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B-\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/usecase/accesstokenrepo/RemoveAccountDataUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "", "accessTokenRepository", "Ljavax/inject/Provider;", "Lmedia/tiger/tigerbox/data/repository/AccessTokenRepository;", "tigerBoxAccountRepository", "Lmedia/tiger/tigerbox/data/repository/TigerBoxAccountRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either$Right;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoveAccountDataUseCase extends UseCase<Unit, Unit> {
    private final Provider<AccessTokenRepository> accessTokenRepository;
    private final Provider<TigerBoxAccountRepository> tigerBoxAccountRepository;

    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    public /* bridge */ /* synthetic */ Object run(Unit unit, Continuation<? super Either<? extends Failure, ? extends Unit>> continuation) {
        return run2(unit, (Continuation<? super Either.Right<Unit>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public RemoveAccountDataUseCase(Provider<AccessTokenRepository> accessTokenRepository, Provider<TigerBoxAccountRepository> tigerBoxAccountRepository, CoroutineDispatcher dispatcher) {
        super(dispatcher);
        Intrinsics.checkNotNullParameter(accessTokenRepository, "accessTokenRepository");
        Intrinsics.checkNotNullParameter(tigerBoxAccountRepository, "tigerBoxAccountRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.accessTokenRepository = accessTokenRepository;
        this.tigerBoxAccountRepository = tigerBoxAccountRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
    /* renamed from: run  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object run2(kotlin.Unit r5, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either.Right<kotlin.Unit>> r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase$run$1
            if (r5 == 0) goto L14
            r5 = r6
            media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase$run$1 r5 = (media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase$run$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L14
            int r6 = r5.label
            int r6 = r6 - r1
            r5.label = r6
            goto L19
        L14:
            media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase$run$1 r5 = new media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase$run$1
            r5.<init>(r4, r6)
        L19:
            java.lang.Object r6 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            kotlin.ResultKt.throwOnFailure(r6)
            goto L68
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            java.lang.Object r1 = r5.L$0
            media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase r1 = (media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L54
        L3d:
            kotlin.ResultKt.throwOnFailure(r6)
            javax.inject.Provider<media.tiger.tigerbox.data.repository.AccessTokenRepository> r6 = r4.accessTokenRepository
            java.lang.Object r6 = r6.get()
            media.tiger.tigerbox.data.repository.AccessTokenRepository r6 = (media.tiger.tigerbox.data.repository.AccessTokenRepository) r6
            r5.L$0 = r4
            r5.label = r3
            java.lang.Object r6 = r6.removeAccessToken(r5)
            if (r6 != r0) goto L53
            return r0
        L53:
            r1 = r4
        L54:
            javax.inject.Provider<media.tiger.tigerbox.data.repository.TigerBoxAccountRepository> r6 = r1.tigerBoxAccountRepository
            java.lang.Object r6 = r6.get()
            media.tiger.tigerbox.data.repository.TigerBoxAccountRepository r6 = (media.tiger.tigerbox.data.repository.TigerBoxAccountRepository) r6
            r1 = 0
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r5 = r6.removeTigerBoxAccountInfo(r5)
            if (r5 != r0) goto L68
            return r0
        L68:
            media.tiger.tigerbox.infrastructure.functional.Either$Right r5 = new media.tiger.tigerbox.infrastructure.functional.Either$Right
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase.run2(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
