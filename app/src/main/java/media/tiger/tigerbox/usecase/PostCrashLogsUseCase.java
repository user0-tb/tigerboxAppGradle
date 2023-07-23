package media.tiger.tigerbox.usecase;

import java.io.File;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.infrastructure.interactor.RetryUseCase;

/* compiled from: PostCrashLogsUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmedia/tiger/tigerbox/usecase/PostCrashLogsUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/RetryUseCase;", "Lmedia/tiger/tigerbox/usecase/CrashLogsUseCaseParameters;", "Ljava/io/File;", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/CrashLogsUseCaseParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PostCrashLogsUseCase extends RetryUseCase<CrashLogsUseCaseParameters, File> {
    private final TigerBoxWebService tigerBoxWebService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public PostCrashLogsUseCase(TigerBoxWebService tigerBoxWebService, CoroutineDispatcher dispatcher) {
        super(dispatcher, 3);
        Intrinsics.checkNotNullParameter(tigerBoxWebService, "tigerBoxWebService");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.tigerBoxWebService = tigerBoxWebService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // media.tiger.tigerbox.infrastructure.interactor.RetryUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object run(final media.tiger.tigerbox.usecase.CrashLogsUseCaseParameters r11, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, ? extends java.io.File>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof media.tiger.tigerbox.usecase.PostCrashLogsUseCase$run$1
            if (r0 == 0) goto L14
            r0 = r12
            media.tiger.tigerbox.usecase.PostCrashLogsUseCase$run$1 r0 = (media.tiger.tigerbox.usecase.PostCrashLogsUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            media.tiger.tigerbox.usecase.PostCrashLogsUseCase$run$1 r0 = new media.tiger.tigerbox.usecase.PostCrashLogsUseCase$run$1
            r0.<init>(r10, r12)
        L19:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r11 = r6.L$1
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r11 = (media.tiger.tigerbox.infrastructure.functional.RequestUtils) r11
            java.lang.Object r0 = r6.L$0
            media.tiger.tigerbox.usecase.CrashLogsUseCaseParameters r0 = (media.tiger.tigerbox.usecase.CrashLogsUseCaseParameters) r0
            kotlin.ResultKt.throwOnFailure(r12)
            r2 = r11
            r11 = r0
            goto L69
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            kotlin.ResultKt.throwOnFailure(r12)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r12 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r1 = r10.tigerBoxWebService
            okhttp3.RequestBody r3 = r11.getDeviceCpuIdRequestBody()
            okhttp3.RequestBody r4 = r11.getDeviceCredentialRequestBody()
            java.util.List r5 = r11.getFilesMultipartBodyParts()
            r7 = 0
            r8 = 8
            r9 = 0
            r6.L$0 = r11
            r6.L$1 = r12
            r6.label = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r9
            java.lang.Object r1 = media.tiger.tigerbox.data.network.TigerBoxWebService.DefaultImpls.uploadLogFiles$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 != r0) goto L67
            return r0
        L67:
            r2 = r12
            r12 = r1
        L69:
            r3 = r12
            media.tiger.tigerbox.data.network.ApiResponse r3 = (media.tiger.tigerbox.data.network.ApiResponse) r3
            media.tiger.tigerbox.usecase.PostCrashLogsUseCase$run$2 r12 = new media.tiger.tigerbox.usecase.PostCrashLogsUseCase$run$2
            r12.<init>()
            r4 = r12
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            media.tiger.tigerbox.infrastructure.functional.Either r11 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.requestMapper$default(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.PostCrashLogsUseCase.run(media.tiger.tigerbox.usecase.CrashLogsUseCaseParameters, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
