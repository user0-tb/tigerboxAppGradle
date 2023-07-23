package media.tiger.tigerbox.usecase;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.infrastructure.interactor.UseCase;
import media.tiger.tigerbox.model.domain.AccountSubscriptionDomain;

/* compiled from: GetSubscriptionsUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/usecase/GetSubscriptionsUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "Lmedia/tiger/tigerbox/usecase/GetSubscriptionsUseCase$RequestParams;", "Lmedia/tiger/tigerbox/model/domain/AccountSubscriptionDomain;", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/GetSubscriptionsUseCase$RequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RequestParams", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetSubscriptionsUseCase extends UseCase<RequestParams, AccountSubscriptionDomain> {
    private final TigerBoxWebService tigerBoxWebService;

    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    public /* bridge */ /* synthetic */ Object run(RequestParams requestParams, Continuation<? super Either<? extends Failure, ? extends AccountSubscriptionDomain>> continuation) {
        return run2(requestParams, (Continuation<? super Either<? extends Failure, AccountSubscriptionDomain>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetSubscriptionsUseCase(TigerBoxWebService tigerBoxWebService, CoroutineDispatcher dispatcher) {
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
    public java.lang.Object run2(media.tiger.tigerbox.usecase.GetSubscriptionsUseCase.RequestParams r11, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, media.tiger.tigerbox.model.domain.AccountSubscriptionDomain>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$1
            if (r0 == 0) goto L14
            r0 = r12
            media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$1 r0 = (media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$1 r0 = new media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$1
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
            java.lang.String r11 = r11.getAccountId()
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r11 = r2.getAccountSubscriptions(r11, r0)
            if (r11 != r1) goto L4d
            return r1
        L4d:
            r2 = r12
            r12 = r11
        L4f:
            r3 = r12
            media.tiger.tigerbox.data.network.ApiResponse r3 = (media.tiger.tigerbox.data.network.ApiResponse) r3
            media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2 r11 = new kotlin.jvm.functions.Function1<java.util.List<? extends media.tiger.tigerbox.model.dto.SubscriptionDto>, media.tiger.tigerbox.model.domain.AccountSubscriptionDomain>() { // from class: media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2
                static {
                    /*
                        media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2 r0 = new media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2) media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2.INSTANCE media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ media.tiger.tigerbox.model.domain.AccountSubscriptionDomain invoke(java.util.List<? extends media.tiger.tigerbox.model.dto.SubscriptionDto> r1) {
                    /*
                        r0 = this;
                        java.util.List r1 = (java.util.List) r1
                        media.tiger.tigerbox.model.domain.AccountSubscriptionDomain r1 = r0.invoke2(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2.invoke(java.lang.Object):java.lang.Object");
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final media.tiger.tigerbox.model.domain.AccountSubscriptionDomain invoke2(java.util.List<media.tiger.tigerbox.model.dto.SubscriptionDto> r10) {
                    /*
                        r9 = this;
                        r0 = 0
                        if (r10 == 0) goto L45
                        java.lang.Object r10 = kotlin.collections.CollectionsKt.firstOrNull(r10)
                        media.tiger.tigerbox.model.dto.SubscriptionDto r10 = (media.tiger.tigerbox.model.dto.SubscriptionDto) r10
                        if (r10 == 0) goto L45
                        java.lang.String r1 = r10.getValidUntil()
                        if (r1 == 0) goto L26
                        java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss"
                        java.util.Date r0 = media.tiger.tigerbox.utils.DateUtilsKt.toDate(r1, r0)
                        java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
                        java.util.Locale r2 = java.util.Locale.getDefault()
                        java.lang.String r3 = "dd.MM.yyyy"
                        r1.<init>(r3, r2)
                        java.lang.String r0 = r1.format(r0)
                    L26:
                        r4 = r0
                        media.tiger.tigerbox.model.domain.AccountSubscriptionDomain r0 = new media.tiger.tigerbox.model.domain.AccountSubscriptionDomain
                        int r2 = r10.getId()
                        java.lang.String r3 = r10.getValidUntil()
                        boolean r5 = r10.getActive()
                        java.lang.String r6 = r10.getSource()
                        int r7 = r10.getAccountId()
                        boolean r8 = r10.getRenewable()
                        r1 = r0
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    L45:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$run$2.invoke2(java.util.List):media.tiger.tigerbox.model.domain.AccountSubscriptionDomain");
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
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.GetSubscriptionsUseCase.run2(media.tiger.tigerbox.usecase.GetSubscriptionsUseCase$RequestParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: GetSubscriptionsUseCase.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/usecase/GetSubscriptionsUseCase$RequestParams;", "", "accountId", "", "(Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RequestParams {
        private final String accountId;

        public static /* synthetic */ RequestParams copy$default(RequestParams requestParams, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestParams.accountId;
            }
            return requestParams.copy(str);
        }

        public final String component1() {
            return this.accountId;
        }

        public final RequestParams copy(String accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            return new RequestParams(accountId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestParams) && Intrinsics.areEqual(this.accountId, ((RequestParams) obj).accountId);
        }

        public int hashCode() {
            return this.accountId.hashCode();
        }

        public String toString() {
            return "RequestParams(accountId=" + this.accountId + ')';
        }

        public RequestParams(String accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.accountId = accountId;
        }

        public final String getAccountId() {
            return this.accountId;
        }
    }
}
