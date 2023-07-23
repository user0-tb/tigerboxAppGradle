package media.tiger.tigerbox.usecase;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.data.repository.TigerBoxAccountRepository;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.infrastructure.interactor.UseCase;
import media.tiger.tigerbox.model.dto.DeviceInformation;

/* compiled from: AssignBoxToAccountUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/usecase/AssignBoxToAccountUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "Lmedia/tiger/tigerbox/usecase/AssignBoxToAccountParameters;", "Lmedia/tiger/tigerbox/model/dto/DeviceInformation;", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "tigerBoxAccountRepository", "Lmedia/tiger/tigerbox/data/repository/TigerBoxAccountRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lmedia/tiger/tigerbox/data/repository/TigerBoxAccountRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/AssignBoxToAccountParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssignBoxToAccountUseCase extends UseCase<AssignBoxToAccountParameters, DeviceInformation> {
    private final TigerBoxAccountRepository tigerBoxAccountRepository;
    private final TigerBoxWebService tigerBoxWebService;

    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    public /* bridge */ /* synthetic */ Object run(AssignBoxToAccountParameters assignBoxToAccountParameters, Continuation<? super Either<? extends Failure, ? extends DeviceInformation>> continuation) {
        return run2(assignBoxToAccountParameters, (Continuation<? super Either<? extends Failure, DeviceInformation>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public AssignBoxToAccountUseCase(TigerBoxWebService tigerBoxWebService, TigerBoxAccountRepository tigerBoxAccountRepository, CoroutineDispatcher dispatcher) {
        super(dispatcher);
        Intrinsics.checkNotNullParameter(tigerBoxWebService, "tigerBoxWebService");
        Intrinsics.checkNotNullParameter(tigerBoxAccountRepository, "tigerBoxAccountRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.tigerBoxWebService = tigerBoxWebService;
        this.tigerBoxAccountRepository = tigerBoxAccountRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* renamed from: run  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object run2(media.tiger.tigerbox.usecase.AssignBoxToAccountParameters r11, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, media.tiger.tigerbox.model.dto.DeviceInformation>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase$run$1
            if (r0 == 0) goto L14
            r0 = r12
            media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase$run$1 r0 = (media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase$run$1 r0 = new media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase$run$1
            r0.<init>(r10, r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.L$1
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r11 = (media.tiger.tigerbox.infrastructure.functional.RequestUtils) r11
            java.lang.Object r0 = r0.L$0
            media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase r0 = (media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase) r0
            kotlin.ResultKt.throwOnFailure(r12)
            r2 = r11
            goto L5a
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            kotlin.ResultKt.throwOnFailure(r12)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r12 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r2 = r10.tigerBoxWebService
            java.lang.String r4 = r11.getDeviceId()
            java.lang.String r11 = r11.getDeviceCredential()
            r0.L$0 = r10
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r11 = r2.assignDeviceToAccount(r4, r11, r0)
            if (r11 != r1) goto L57
            return r1
        L57:
            r0 = r10
            r2 = r12
            r12 = r11
        L5a:
            r3 = r12
            media.tiger.tigerbox.data.network.ApiResponse r3 = (media.tiger.tigerbox.data.network.ApiResponse) r3
            media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase$run$2 r11 = new media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase$run$2
            r11.<init>()
            r4 = r11
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            media.tiger.tigerbox.model.dto.DeviceInformation r5 = new media.tiger.tigerbox.model.dto.DeviceInformation
            r5.<init>()
            media.tiger.tigerbox.infrastructure.exception.LoginFailure$AssociationOfBoxAndAccountNotSuccessful r11 = media.tiger.tigerbox.infrastructure.exception.LoginFailure.AssociationOfBoxAndAccountNotSuccessful.INSTANCE
            r6 = r11
            media.tiger.tigerbox.infrastructure.exception.Failure r6 = (media.tiger.tigerbox.infrastructure.exception.Failure) r6
            r7 = 0
            r8 = 16
            r9 = 0
            media.tiger.tigerbox.infrastructure.functional.Either r11 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.requestMapper$default(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.AssignBoxToAccountUseCase.run2(media.tiger.tigerbox.usecase.AssignBoxToAccountParameters, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
