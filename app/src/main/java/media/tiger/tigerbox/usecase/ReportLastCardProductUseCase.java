package media.tiger.tigerbox.usecase;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.infrastructure.interactor.UseCase;

/* compiled from: ReportLastCardProductUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/usecase/ReportLastCardProductUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "Lmedia/tiger/tigerbox/usecase/ReportLastCardProductUseCase$RequestParams;", "", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/ReportLastCardProductUseCase$RequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RequestParams", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportLastCardProductUseCase extends UseCase<RequestParams, Unit> {
    private final TigerBoxWebService tigerBoxWebService;

    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    public /* bridge */ /* synthetic */ Object run(RequestParams requestParams, Continuation<? super Either<? extends Failure, ? extends Unit>> continuation) {
        return run2(requestParams, (Continuation<? super Either<? extends Failure, Unit>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ReportLastCardProductUseCase(TigerBoxWebService tigerBoxWebService, CoroutineDispatcher dispatcher) {
        super(dispatcher);
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
    public java.lang.Object run2(media.tiger.tigerbox.usecase.ReportLastCardProductUseCase.RequestParams r11, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, kotlin.Unit>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$1
            if (r0 == 0) goto L14
            r0 = r12
            media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$1 r0 = (media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$1 r0 = new media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$1
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
            goto L5c
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.throwOnFailure(r12)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r12 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r2 = r10.tigerBoxWebService
            java.lang.String r4 = r11.getReportUrl()
            media.tiger.tigerbox.model.domain.LastUsedMulticardProduct r5 = new media.tiger.tigerbox.model.domain.LastUsedMulticardProduct
            int r6 = r11.getUserId()
            int r11 = r11.getProductId()
            r5.<init>(r6, r11)
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r11 = r2.reportLastUsedCardProduct(r4, r5, r0)
            if (r11 != r1) goto L5a
            return r1
        L5a:
            r2 = r12
            r12 = r11
        L5c:
            r3 = r12
            media.tiger.tigerbox.data.network.ApiResponse r3 = (media.tiger.tigerbox.data.network.ApiResponse) r3
            media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2 r11 = new kotlin.jvm.functions.Function1<kotlin.Unit, kotlin.Unit>() { // from class: media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2
                static {
                    /*
                        media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2 r0 = new media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2) media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2.INSTANCE media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2.<init>():void");
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(kotlin.Unit r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "<anonymous parameter 0>"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2.invoke2(kotlin.Unit):void");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.Unit r1) {
                    /*
                        r0 = this;
                        kotlin.Unit r1 = (kotlin.Unit) r1
                        r0.invoke2(r1)
                        kotlin.Unit r1 = kotlin.Unit.INSTANCE
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$run$2.invoke(java.lang.Object):java.lang.Object");
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
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.ReportLastCardProductUseCase.run2(media.tiger.tigerbox.usecase.ReportLastCardProductUseCase$RequestParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: ReportLastCardProductUseCase.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/usecase/ReportLastCardProductUseCase$RequestParams;", "", "reportUrl", "", "userId", "", "productId", "(Ljava/lang/String;II)V", "getProductId", "()I", "getReportUrl", "()Ljava/lang/String;", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RequestParams {
        private final int productId;
        private final String reportUrl;
        private final int userId;

        public static /* synthetic */ RequestParams copy$default(RequestParams requestParams, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = requestParams.reportUrl;
            }
            if ((i3 & 2) != 0) {
                i = requestParams.userId;
            }
            if ((i3 & 4) != 0) {
                i2 = requestParams.productId;
            }
            return requestParams.copy(str, i, i2);
        }

        public final String component1() {
            return this.reportUrl;
        }

        public final int component2() {
            return this.userId;
        }

        public final int component3() {
            return this.productId;
        }

        public final RequestParams copy(String reportUrl, int i, int i2) {
            Intrinsics.checkNotNullParameter(reportUrl, "reportUrl");
            return new RequestParams(reportUrl, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RequestParams) {
                RequestParams requestParams = (RequestParams) obj;
                return Intrinsics.areEqual(this.reportUrl, requestParams.reportUrl) && this.userId == requestParams.userId && this.productId == requestParams.productId;
            }
            return false;
        }

        public int hashCode() {
            return (((this.reportUrl.hashCode() * 31) + this.userId) * 31) + this.productId;
        }

        public String toString() {
            return "RequestParams(reportUrl=" + this.reportUrl + ", userId=" + this.userId + ", productId=" + this.productId + ')';
        }

        public RequestParams(String reportUrl, int i, int i2) {
            Intrinsics.checkNotNullParameter(reportUrl, "reportUrl");
            this.reportUrl = reportUrl;
            this.userId = i;
            this.productId = i2;
        }

        public final String getReportUrl() {
            return this.reportUrl;
        }

        public final int getUserId() {
            return this.userId;
        }

        public final int getProductId() {
            return this.productId;
        }
    }
}
