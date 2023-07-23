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
import media.tiger.tigerbox.model.dto.DeviceInformation;
import okhttp3.MediaType;

/* compiled from: AssignProfileToAccountUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/usecase/AssignProfileToAccountUseCase;", "Lmedia/tiger/tigerbox/infrastructure/interactor/UseCase;", "Lmedia/tiger/tigerbox/usecase/AssignProfileToAccountUseCase$RequestParams;", "Lmedia/tiger/tigerbox/model/dto/DeviceInformation;", "tigerBoxWebService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;Lkotlinx/coroutines/CoroutineDispatcher;)V", "JSON_TYPE", "Lokhttp3/MediaType;", "run", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Lmedia/tiger/tigerbox/usecase/AssignProfileToAccountUseCase$RequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RequestParams", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssignProfileToAccountUseCase extends UseCase<RequestParams, DeviceInformation> {
    private final MediaType JSON_TYPE;
    private final TigerBoxWebService tigerBoxWebService;

    @Override // media.tiger.tigerbox.infrastructure.interactor.UseCase
    public /* bridge */ /* synthetic */ Object run(RequestParams requestParams, Continuation<? super Either<? extends Failure, ? extends DeviceInformation>> continuation) {
        return run2(requestParams, (Continuation<? super Either<? extends Failure, DeviceInformation>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public AssignProfileToAccountUseCase(TigerBoxWebService tigerBoxWebService, CoroutineDispatcher dispatcher) {
        super(dispatcher);
        Intrinsics.checkNotNullParameter(tigerBoxWebService, "tigerBoxWebService");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.tigerBoxWebService = tigerBoxWebService;
        this.JSON_TYPE = MediaType.Companion.parse("application/json; charset=UTF-8");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* renamed from: run  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object run2(media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase.RequestParams r11, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, media.tiger.tigerbox.model.dto.DeviceInformation>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$1
            if (r0 == 0) goto L14
            r0 = r12
            media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$1 r0 = (media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$1 r0 = new media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$1
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
            goto L71
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            kotlin.ResultKt.throwOnFailure(r12)
            media.tiger.tigerbox.infrastructure.functional.RequestUtils r12 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.INSTANCE
            media.tiger.tigerbox.data.network.TigerBoxWebService r2 = r10.tigerBoxWebService
            java.lang.String r4 = r11.getUrl()
            okhttp3.RequestBody$Companion r5 = okhttp3.RequestBody.Companion
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "{\n\"currentProfileId\": "
            r6.append(r7)
            int r11 = r11.getProfileId()
            r6.append(r11)
            java.lang.String r11 = "\n}"
            r6.append(r11)
            java.lang.String r11 = r6.toString()
            okhttp3.MediaType r6 = r10.JSON_TYPE
            okhttp3.RequestBody r11 = r5.create(r11, r6)
            r0.L$0 = r12
            r0.label = r3
            java.lang.Object r11 = r2.assignCurrentProfileToAccount(r4, r11, r0)
            if (r11 != r1) goto L6f
            return r1
        L6f:
            r2 = r12
            r12 = r11
        L71:
            r3 = r12
            media.tiger.tigerbox.data.network.ApiResponse r3 = (media.tiger.tigerbox.data.network.ApiResponse) r3
            media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2 r11 = new kotlin.jvm.functions.Function1<media.tiger.tigerbox.model.dto.DeviceInformation, media.tiger.tigerbox.model.dto.DeviceInformation>() { // from class: media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2
                static {
                    /*
                        media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2 r0 = new media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2) media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2.INSTANCE media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2.<init>():void");
                }

                @Override // kotlin.jvm.functions.Function1
                public final media.tiger.tigerbox.model.dto.DeviceInformation invoke(media.tiger.tigerbox.model.dto.DeviceInformation r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2.invoke(media.tiger.tigerbox.model.dto.DeviceInformation):media.tiger.tigerbox.model.dto.DeviceInformation");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ media.tiger.tigerbox.model.dto.DeviceInformation invoke(media.tiger.tigerbox.model.dto.DeviceInformation r1) {
                    /*
                        r0 = this;
                        media.tiger.tigerbox.model.dto.DeviceInformation r1 = (media.tiger.tigerbox.model.dto.DeviceInformation) r1
                        media.tiger.tigerbox.model.dto.DeviceInformation r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$run$2.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r4 = r11
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            media.tiger.tigerbox.model.dto.DeviceInformation r5 = new media.tiger.tigerbox.model.dto.DeviceInformation
            r5.<init>()
            media.tiger.tigerbox.infrastructure.exception.LoginFailure$SendProfileOfBoxNotSuccessful r11 = media.tiger.tigerbox.infrastructure.exception.LoginFailure.SendProfileOfBoxNotSuccessful.INSTANCE
            r6 = r11
            media.tiger.tigerbox.infrastructure.exception.Failure r6 = (media.tiger.tigerbox.infrastructure.exception.Failure) r6
            r7 = 0
            r8 = 16
            r9 = 0
            media.tiger.tigerbox.infrastructure.functional.Either r11 = media.tiger.tigerbox.infrastructure.functional.RequestUtils.requestMapper$default(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase.run2(media.tiger.tigerbox.usecase.AssignProfileToAccountUseCase$RequestParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: AssignProfileToAccountUseCase.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lmedia/tiger/tigerbox/usecase/AssignProfileToAccountUseCase$RequestParams;", "", "url", "", "profileId", "", "(Ljava/lang/String;I)V", "getProfileId", "()I", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RequestParams {
        private final int profileId;
        private final String url;

        public static /* synthetic */ RequestParams copy$default(RequestParams requestParams, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = requestParams.url;
            }
            if ((i2 & 2) != 0) {
                i = requestParams.profileId;
            }
            return requestParams.copy(str, i);
        }

        public final String component1() {
            return this.url;
        }

        public final int component2() {
            return this.profileId;
        }

        public final RequestParams copy(String url, int i) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new RequestParams(url, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RequestParams) {
                RequestParams requestParams = (RequestParams) obj;
                return Intrinsics.areEqual(this.url, requestParams.url) && this.profileId == requestParams.profileId;
            }
            return false;
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.profileId;
        }

        public String toString() {
            return "RequestParams(url=" + this.url + ", profileId=" + this.profileId + ')';
        }

        public RequestParams(String url, int i) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.profileId = i;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int getProfileId() {
            return this.profileId;
        }
    }
}
