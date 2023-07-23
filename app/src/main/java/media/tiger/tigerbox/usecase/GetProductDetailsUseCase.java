package media.tiger.tigerbox.usecase;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.infrastructure.interactor.RetryUseCase;
import media.tiger.tigerbox.model.domain.ProductDetails;

/* compiled from: GetProductDetailsUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmedia/tiger/tigerbox/usecase/GetProductDetailsUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/RetryUseCase;", "Lmedia/tiger/tigerbox/usecase/GetProductDetailsParameters;", "Lmedia/tiger/tigerbox/model/domain/ProductDetails;", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/GetProductDetailsParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetProductDetailsUseCase extends RetryUseCase<GetProductDetailsParameters, ProductDetails> {
    private final TigerBoxWebService tigerBoxWebService;

    @Override // media.tiger.tigerbox.infrastructure.interactor.RetryUseCase
    public /* bridge */ /* synthetic */ Object run(GetProductDetailsParameters getProductDetailsParameters, Continuation<? super Either<? extends Failure, ? extends ProductDetails>> continuation) {
        return run2(getProductDetailsParameters, (Continuation<? super Either<? extends Failure, ProductDetails>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetProductDetailsUseCase(TigerBoxWebService tigerBoxWebService, CoroutineDispatcher dispatcher) {
        super(dispatcher, 3);
        Intrinsics.checkNotNullParameter(tigerBoxWebService, "tigerBoxWebService");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.tigerBoxWebService = tigerBoxWebService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: run  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object run2(media.tiger.tigerbox.usecase.GetProductDetailsParameters r11, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, media.tiger.tigerbox.model.domain.ProductDetails>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$1
            if (r0 == 0) goto L14
            r0 = r12
            media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$1 r0 = (media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$1 r0 = new media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$1
            r0.<init>(r10, r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r11 = r0.L$0
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r11 = (media.tiger.tigerbox.infrastructure.functional.RequestUtils) r11
            kotlin.ResultKt.throwOnFailure(r12)
            r2 = r11
            goto L4f
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.throwOnFailure(r12)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r12 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r2 = r10.tigerBoxWebService
            java.lang.String r11 = r11.getProductId()
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r11 = r2.getProductDetails(r11, r0)
            if (r11 != r1) goto L4d
            return r1
        L4d:
            r2 = r12
            r12 = r11
        L4f:
            r3 = r12
            media.tiger.tigerbox.data.network.ApiResponse r3 = (media.tiger.tigerbox.data.network.ApiResponse) r3
            media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2 r11 = new kotlin.jvm.functions.Function1<media.tiger.tigerbox.model.dto.ProductDetailsDto, media.tiger.tigerbox.model.domain.ProductDetails>() { // from class: media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2
                static {
                    /*
                        media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2 r0 = new media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2) media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2.INSTANCE media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ media.tiger.tigerbox.model.domain.ProductDetails invoke(media.tiger.tigerbox.model.dto.ProductDetailsDto r1) {
                    /*
                        r0 = this;
                        media.tiger.tigerbox.model.dto.ProductDetailsDto r1 = (media.tiger.tigerbox.model.dto.ProductDetailsDto) r1
                        media.tiger.tigerbox.model.domain.ProductDetails r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2.invoke(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function1
                public final media.tiger.tigerbox.model.domain.ProductDetails invoke(media.tiger.tigerbox.model.dto.ProductDetailsDto r9) {
                    /*
                        r8 = this;
                        java.lang.String r0 = "dto"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                        media.tiger.tigerbox.model.domain.ProductDetails r0 = new media.tiger.tigerbox.model.domain.ProductDetails
                        int r2 = r9.getId()
                        java.lang.String r1 = r9.getProductType()
                        java.lang.String r3 = ""
                        if (r1 != 0) goto L15
                        r4 = r3
                        goto L16
                    L15:
                        r4 = r1
                    L16:
                        java.lang.String r1 = r9.getTitle()
                        if (r1 != 0) goto L1e
                        r5 = r3
                        goto L1f
                    L1e:
                        r5 = r1
                    L1f:
                        java.lang.String r1 = r9.getDescription()
                        if (r1 != 0) goto L27
                        r6 = r3
                        goto L28
                    L27:
                        r6 = r1
                    L28:
                        java.lang.String r1 = r9.getLanguage()
                        if (r1 != 0) goto L30
                        r7 = r3
                        goto L31
                    L30:
                        r7 = r1
                    L31:
                        java.lang.String r9 = r9.getAuthor()
                        if (r9 != 0) goto L38
                        r9 = r3
                    L38:
                        r1 = r0
                        r3 = r4
                        r4 = r5
                        r5 = r6
                        r6 = r7
                        r7 = r9
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductDetailsUseCase$run$2.invoke(media.tiger.tigerbox.model.dto.ProductDetailsDto):media.tiger.tigerbox.model.domain.ProductDetails");
                }
            }
            r4 = r11
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            media.tiger.tigerbox.infrastructure.functional.Either r11 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.requestMapper$default(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductDetailsUseCase.run2(media.tiger.tigerbox.usecase.GetProductDetailsParameters, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
