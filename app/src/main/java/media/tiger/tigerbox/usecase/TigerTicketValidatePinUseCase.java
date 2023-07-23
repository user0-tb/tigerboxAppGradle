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
import media.tiger.tigerbox.model.domain.PinInfo;

/* compiled from: TigerTicketValidatePinUseCase.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/usecase/TigerTicketValidatePinUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "Lmedia/tiger/tigerbox/usecase/TigerTicketValidatePinUseCase$RequestParams;", "Lmedia/tiger/tigerbox/model/domain/PinInfo;", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "extractNumber", "", "str", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/TigerTicketValidatePinUseCase$RequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RequestParams", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TigerTicketValidatePinUseCase extends UseCase<RequestParams, PinInfo> {
    private final TigerBoxWebService tigerBoxWebService;

    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    public /* bridge */ /* synthetic */ Object run(RequestParams requestParams, Continuation<? super Either<? extends Failure, ? extends PinInfo>> continuation) {
        return run2(requestParams, (Continuation<? super Either<? extends Failure, PinInfo>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public TigerTicketValidatePinUseCase(TigerBoxWebService tigerBoxWebService, CoroutineDispatcher dispatcher) {
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
    public java.lang.Object run2(media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase.RequestParams r13, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, media.tiger.tigerbox.model.domain.PinInfo>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$1
            if (r0 == 0) goto L14
            r0 = r14
            media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$1 r0 = (media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L19
        L14:
            media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$1 r0 = new media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$1
            r0.<init>(r12, r14)
        L19:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r13 = r0.L$0
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r13 = (media.tiger.tigerbox.infrastructure.functional.RequestUtils) r13
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = r13
            goto L53
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            kotlin.ResultKt.throwOnFailure(r14)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r14 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r2 = r12.tigerBoxWebService
            java.lang.String r4 = r13.getCodeNumber()
            java.lang.String r13 = r13.getPinNumber()
            r0.L$0 = r14
            r0.label = r3
            java.lang.Object r13 = r2.validateTicket(r4, r13, r0)
            if (r13 != r1) goto L51
            return r1
        L51:
            r2 = r14
            r14 = r13
        L53:
            r3 = r14
            media.tiger.tigerbox.data.network.ApiResponse r3 = (media.tiger.tigerbox.data.network.ApiResponse) r3
            media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2 r13 = new kotlin.jvm.functions.Function1<media.tiger.tigerbox.model.domain.TigerTicketValidationResponse, media.tiger.tigerbox.model.domain.PinInfo>() { // from class: media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2
                static {
                    /*
                        media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2 r0 = new media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2) media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2.INSTANCE media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ media.tiger.tigerbox.model.domain.PinInfo invoke(media.tiger.tigerbox.model.domain.TigerTicketValidationResponse r1) {
                    /*
                        r0 = this;
                        media.tiger.tigerbox.model.domain.TigerTicketValidationResponse r1 = (media.tiger.tigerbox.model.domain.TigerTicketValidationResponse) r1
                        media.tiger.tigerbox.model.domain.PinInfo r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2.invoke(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function1
                public final media.tiger.tigerbox.model.domain.PinInfo invoke(media.tiger.tigerbox.model.domain.TigerTicketValidationResponse r5) {
                    /*
                        r4 = this;
                        java.lang.String r0 = "response"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                        timber.log.Timber$Forest r0 = timber.log.Timber.Forest
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "TigerTicketValidatePinUseCase response "
                        r1.append(r2)
                        r1.append(r5)
                        java.lang.String r1 = r1.toString()
                        r2 = 0
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r0.i(r1, r2)
                        media.tiger.tigerbox.model.domain.PinInfo r0 = new media.tiger.tigerbox.model.domain.PinInfo
                        boolean r1 = r5.getValid()
                        int r2 = r5.getCode()
                        java.lang.String r3 = r5.getValue()
                        if (r3 == 0) goto L33
                        java.lang.Integer r3 = kotlin.text.StringsKt.toIntOrNull(r3)
                        goto L34
                    L33:
                        r3 = 0
                    L34:
                        if (r3 != 0) goto L38
                        r3 = -1
                        goto L40
                    L38:
                        java.lang.String r3 = r5.getValue()
                        int r3 = java.lang.Integer.parseInt(r3)
                    L40:
                        int r5 = r5.getErrorCode()
                        r0.<init>(r1, r2, r3, r5)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$run$2.invoke(media.tiger.tigerbox.model.domain.TigerTicketValidationResponse):media.tiger.tigerbox.model.domain.PinInfo");
                }
            }
            r4 = r13
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            media.tiger.tigerbox.model.domain.PinInfo r13 = new media.tiger.tigerbox.model.domain.PinInfo
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            media.tiger.tigerbox.infrastructure.functional.Either r13 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.requestMapper$default(r2, r3, r4, r5, r6, r7, r8, r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase.run2(media.tiger.tigerbox.usecase.TigerTicketValidatePinUseCase$RequestParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: TigerTicketValidatePinUseCase.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/usecase/TigerTicketValidatePinUseCase$RequestParams;", "", "codeNumber", "", "pinNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getCodeNumber", "()Ljava/lang/String;", "getPinNumber", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RequestParams {
        private final String codeNumber;
        private final String pinNumber;

        public static /* synthetic */ RequestParams copy$default(RequestParams requestParams, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestParams.codeNumber;
            }
            if ((i & 2) != 0) {
                str2 = requestParams.pinNumber;
            }
            return requestParams.copy(str, str2);
        }

        public final String component1() {
            return this.codeNumber;
        }

        public final String component2() {
            return this.pinNumber;
        }

        public final RequestParams copy(String codeNumber, String pinNumber) {
            Intrinsics.checkNotNullParameter(codeNumber, "codeNumber");
            Intrinsics.checkNotNullParameter(pinNumber, "pinNumber");
            return new RequestParams(codeNumber, pinNumber);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RequestParams) {
                RequestParams requestParams = (RequestParams) obj;
                return Intrinsics.areEqual(this.codeNumber, requestParams.codeNumber) && Intrinsics.areEqual(this.pinNumber, requestParams.pinNumber);
            }
            return false;
        }

        public int hashCode() {
            return (this.codeNumber.hashCode() * 31) + this.pinNumber.hashCode();
        }

        public String toString() {
            return "RequestParams(codeNumber=" + this.codeNumber + ", pinNumber=" + this.pinNumber + ')';
        }

        public RequestParams(String codeNumber, String pinNumber) {
            Intrinsics.checkNotNullParameter(codeNumber, "codeNumber");
            Intrinsics.checkNotNullParameter(pinNumber, "pinNumber");
            this.codeNumber = codeNumber;
            this.pinNumber = pinNumber;
        }

        public final String getCodeNumber() {
            return this.codeNumber;
        }

        public final String getPinNumber() {
            return this.pinNumber;
        }
    }

    private final String extractNumber(String str) {
        if (str != null) {
            if (str.length() == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
            boolean z = false;
            for (char c : charArray) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                    z = true;
                } else if (z) {
                    break;
                }
            }
            return sb.toString();
        }
        return "";
    }
}
