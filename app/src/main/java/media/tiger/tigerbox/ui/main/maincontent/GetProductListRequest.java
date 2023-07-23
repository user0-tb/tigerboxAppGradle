package media.tiger.tigerbox.ui.main.maincontent;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.model.domain.ProductDomain;
import media.tiger.tigerbox.model.domain.ProductRowDomain;
import media.tiger.tigerbox.services.interfaces.AvailabilityService;

/* compiled from: GetProductListRequest.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0010J3\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/maincontent/GetProductListRequest;", "", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "availabilityService", "Lmedia/tiger/tigerbox/services/interfaces/AvailabilityService;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lmedia/tiger/tigerbox/services/interfaces/AvailabilityService;)V", "invoke", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "", "Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "mainContentList", "Lmedia/tiger/tigerbox/model/domain/ProductRowDomain;", "url", "", "(Lmedia/tiger/tigerbox/model/domain/ProductRowDomain;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestProductList", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetProductListRequest {
    private final AvailabilityService availabilityService;
    private final TigerBoxWebService tigerBoxWebService;

    @Inject
    public GetProductListRequest(TigerBoxWebService tigerBoxWebService, AvailabilityService availabilityService) {
        Intrinsics.checkNotNullParameter(tigerBoxWebService, "tigerBoxWebService");
        Intrinsics.checkNotNullParameter(availabilityService, "availabilityService");
        this.tigerBoxWebService = tigerBoxWebService;
        this.availabilityService = availabilityService;
    }

    public final Object invoke(ProductRowDomain productRowDomain, String str, Continuation<? super Either<? extends Failure, ? extends List<ProductDomain>>> continuation) {
        return requestProductList(productRowDomain, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object requestProductList(media.tiger.tigerbox.model.domain.ProductRowDomain r6, java.lang.String r7, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, ? extends java.util.List<media.tiger.tigerbox.model.domain.ProductDomain>>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest$requestProductList$1
            if (r0 == 0) goto L14
            r0 = r8
            media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest$requestProductList$1 r0 = (media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest$requestProductList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L19
        L14:
            media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest$requestProductList$1 r0 = new media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest$requestProductList$1
            r0.<init>(r5, r8)
        L19:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.L$2
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r6 = (media.tiger.tigerbox.infrastructure.functional.RequestUtils) r6
            java.lang.Object r7 = r0.L$1
            media.tiger.tigerbox.model.domain.ProductRowDomain r7 = (media.tiger.tigerbox.model.domain.ProductRowDomain) r7
            java.lang.Object r0 = r0.L$0
            media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest r0 = (media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L59
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            kotlin.ResultKt.throwOnFailure(r8)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r8 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r2 = r5.tigerBoxWebService
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r7 = r2.sendCompleteURLRequest(r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r5
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L59:
            media.tiger.tigerbox.data.network.ApiResponse r8 = (media.tiger.tigerbox.data.network.ApiResponse) r8
            media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest$requestProductList$2 r1 = new media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest$requestProductList$2
            r1.<init>()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            media.tiger.tigerbox.infrastructure.exception.ShopLayoutFailure$GetProductListNotSuccessful r0 = media.tiger.tigerbox.infrastructure.exception.ShopLayoutFailure.GetProductListNotSuccessful.INSTANCE
            media.tiger.tigerbox.infrastructure.exception.Failure r0 = (media.tiger.tigerbox.infrastructure.exception.Failure) r0
            media.tiger.tigerbox.infrastructure.functional.Either r6 = r6.requestMapperWithHeaderLink(r8, r1, r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest.requestProductList(media.tiger.tigerbox.model.domain.ProductRowDomain, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
