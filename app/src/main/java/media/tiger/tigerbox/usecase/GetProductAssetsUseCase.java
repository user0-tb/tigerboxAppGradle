package media.tiger.tigerbox.usecase;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.infrastructure.interactor.RetryUseCase;
import media.tiger.tigerbox.model.dto.AssetProduct;

/* compiled from: GetProductAssetsUseCase.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ+\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/usecase/GetProductAssetsUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/RetryUseCase;", "Lmedia/tiger/tigerbox/usecase/GetProductAssetsParameters;", "", "Lmedia/tiger/tigerbox/model/dto/AssetProduct;", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/GetProductAssetsParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetProductAssetsUseCase extends RetryUseCase<GetProductAssetsParameters, List<? extends AssetProduct>> {
    private final TigerBoxWebService tigerBoxWebService;

    @Override // media.tiger.tigerbox.infrastructure.interactor.RetryUseCase
    public /* bridge */ /* synthetic */ Object run(GetProductAssetsParameters getProductAssetsParameters, Continuation<? super Either<? extends Failure, ? extends List<? extends AssetProduct>>> continuation) {
        return run2(getProductAssetsParameters, (Continuation<? super Either<? extends Failure, ? extends List<AssetProduct>>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetProductAssetsUseCase(TigerBoxWebService tigerBoxWebService, CoroutineDispatcher dispatcher) {
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
    public java.lang.Object run2(media.tiger.tigerbox.usecase.GetProductAssetsParameters r11, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, ? extends java.util.List<media.tiger.tigerbox.model.dto.AssetProduct>>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$1
            if (r0 == 0) goto L14
            r0 = r12
            media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$1 r0 = (media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$1 r0 = new media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$1
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
            goto L57
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.throwOnFailure(r12)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r12 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r2 = r10.tigerBoxWebService
            java.lang.String r4 = r11.getProductId()
            java.lang.String r5 = r11.getNfcId()
            java.lang.String r11 = r11.getNfcSecurityCode()
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r11 = r2.getProductAssets(r4, r5, r11, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r2 = r12
            r12 = r11
        L57:
            r3 = r12
            media.tiger.tigerbox.data.network.ApiResponse r3 = (media.tiger.tigerbox.data.network.ApiResponse) r3
            media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2 r11 = new kotlin.jvm.functions.Function1<java.util.List<? extends media.tiger.tigerbox.model.dto.AssetProduct>, java.util.List<? extends media.tiger.tigerbox.model.dto.AssetProduct>>() { // from class: media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2
                static {
                    /*
                        media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2 r0 = new media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2) media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2.INSTANCE media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2.<init>():void");
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final java.util.List<media.tiger.tigerbox.model.dto.AssetProduct> invoke2(java.util.List<media.tiger.tigerbox.model.dto.AssetProduct> r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "assetsList"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2.invoke2(java.util.List):java.util.List");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.util.List<? extends media.tiger.tigerbox.model.dto.AssetProduct> invoke(java.util.List<? extends media.tiger.tigerbox.model.dto.AssetProduct> r1) {
                    /*
                        r0 = this;
                        java.util.List r1 = (java.util.List) r1
                        java.util.List r1 = r0.invoke2(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductAssetsUseCase$run$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r4 = r11
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            media.tiger.tigerbox.infrastructure.functional.Either r11 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.requestMapper$default(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetProductAssetsUseCase.run2(media.tiger.tigerbox.usecase.GetProductAssetsParameters, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
