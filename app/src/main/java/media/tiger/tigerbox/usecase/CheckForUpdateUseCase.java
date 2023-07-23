package media.tiger.tigerbox.usecase;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.network.OtaWebService;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.infrastructure.interactor.UseCase;
import media.tiger.tigerbox.infrastructure.properties.ConfigurationProperties;
import media.tiger.tigerbox.model.domain.LatestRelease;
import media.tiger.tigerbox.utils.DateUtilsKt;

/* compiled from: CheckForUpdateUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/usecase/CheckForUpdateUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "", "Lmedia/tiger/tigerbox/model/domain/LatestRelease;", "otaWebService", "Lmedia/tiger/tigerbox/data/network/OtaWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "configurationProperties", "Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties;", "(Lmedia/tiger/tigerbox/data/network/OtaWebService;Lkotlinx/coroutines/CoroutineDispatcher;Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties;)V", "defaultRelease", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckForUpdateUseCase extends UseCase<Unit, LatestRelease> {
    private final LatestRelease defaultRelease;
    private final OtaWebService otaWebService;

    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    public /* bridge */ /* synthetic */ Object run(Unit unit, Continuation<? super Either<? extends Failure, ? extends LatestRelease>> continuation) {
        return run2(unit, (Continuation<? super Either<? extends Failure, LatestRelease>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public CheckForUpdateUseCase(OtaWebService otaWebService, CoroutineDispatcher dispatcher, ConfigurationProperties configurationProperties) {
        super(dispatcher);
        Intrinsics.checkNotNullParameter(otaWebService, "otaWebService");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(configurationProperties, "configurationProperties");
        this.otaWebService = otaWebService;
        this.defaultRelease = new LatestRelease(configurationProperties.getProperty("software.version.code"), DateUtilsKt.toDate$default(configurationProperties.getProperty("software.version.date"), null, 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* renamed from: run  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object run2(kotlin.Unit r9, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, media.tiger.tigerbox.model.domain.LatestRelease>> r10) {
        /*
            r8 = this;
            boolean r9 = r10 instanceof media.tiger.tigerbox.usecase.CheckForUpdateUseCase$run$1
            if (r9 == 0) goto L14
            r9 = r10
            media.tiger.tigerbox.usecase.CheckForUpdateUseCase$run$1 r9 = (media.tiger.tigerbox.usecase.CheckForUpdateUseCase$run$1) r9
            int r0 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L14
            int r10 = r9.label
            int r10 = r10 - r1
            r9.label = r10
            goto L19
        L14:
            media.tiger.tigerbox.usecase.CheckForUpdateUseCase$run$1 r9 = new media.tiger.tigerbox.usecase.CheckForUpdateUseCase$run$1
            r9.<init>(r8, r10)
        L19:
            java.lang.Object r10 = r9.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r0 = r9.L$1
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r0 = (media.tiger.tigerbox.infrastructure.functional.RequestUtils) r0
            java.lang.Object r9 = r9.L$0
            media.tiger.tigerbox.usecase.CheckForUpdateUseCase r9 = (media.tiger.tigerbox.usecase.CheckForUpdateUseCase) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L51
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            kotlin.ResultKt.throwOnFailure(r10)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r10 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.OtaWebService r1 = r8.otaWebService
            r9.L$0 = r8
            r9.L$1 = r10
            r9.label = r2
            java.lang.Object r9 = r1.checkForUpdate(r9)
            if (r9 != r0) goto L4e
            return r0
        L4e:
            r0 = r10
            r10 = r9
            r9 = r8
        L51:
            r1 = r10
            media.tiger.tigerbox.data.network.ApiResponse r1 = (media.tiger.tigerbox.data.network.ApiResponse) r1
            media.tiger.tigerbox.usecase.CheckForUpdateUseCase$run$2 r10 = new media.tiger.tigerbox.usecase.CheckForUpdateUseCase$run$2
            r10.<init>()
            r2 = r10
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            media.tiger.tigerbox.model.domain.LatestRelease r3 = r9.defaultRelease
            media.tiger.tigerbox.infrastructure.exception.Failure$ServerError r9 = media.tiger.tigerbox.infrastructure.exception.Failure.ServerError.INSTANCE
            r4 = r9
            media.tiger.tigerbox.infrastructure.exception.Failure r4 = (media.tiger.tigerbox.infrastructure.exception.Failure) r4
            r5 = 0
            r6 = 16
            r7 = 0
            media.tiger.tigerbox.infrastructure.functional.Either r9 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.requestMapper$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.CheckForUpdateUseCase.run2(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
