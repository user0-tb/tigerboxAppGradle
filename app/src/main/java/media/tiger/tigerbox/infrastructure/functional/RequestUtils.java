package media.tiger.tigerbox.infrastructure.functional;

import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.data.network.ApiResponse;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;

/* compiled from: RequestUtils.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jg\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\u000b2\u0006\u0010\f\u001a\u0002H\u00062\b\b\u0002\u0010\r\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J_\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u0002H\u00060\u00132\u0006\u0010\f\u001a\u0002H\u00062\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/functional/RequestUtils;", "", "()V", "requestMapper", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "R", ExifInterface.GPS_DIRECTION_TRUE, "response", "Lmedia/tiger/tigerbox/data/network/ApiResponse;", "transform", "Lkotlin/Function1;", "default", "errorResponse", "onError", "Lkotlin/Function0;", "", "(Lmedia/tiger/tigerbox/data/network/ApiResponse;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lmedia/tiger/tigerbox/infrastructure/exception/Failure;Lkotlin/jvm/functions/Function0;)Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "requestMapperWithHeaderLink", "Lkotlin/Function2;", "", "(Lmedia/tiger/tigerbox/data/network/ApiResponse;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lmedia/tiger/tigerbox/infrastructure/exception/Failure;)Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequestUtils {
    public static final RequestUtils INSTANCE = new RequestUtils();

    private RequestUtils() {
    }

    public static /* synthetic */ Either requestMapper$default(RequestUtils requestUtils, ApiResponse apiResponse, Function1 function1, Object obj, Failure failure, Function0 function0, int i, Object obj2) {
        if ((i & 8) != 0) {
            failure = Failure.DefaultError.INSTANCE;
        }
        Failure failure2 = failure;
        RequestUtils$requestMapper$1 requestUtils$requestMapper$1 = function0;
        if ((i & 16) != 0) {
            requestUtils$requestMapper$1 = new Function0<Unit>() { // from class: media.tiger.tigerbox.infrastructure.functional.RequestUtils$requestMapper$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        return requestUtils.requestMapper(apiResponse, function1, obj, failure2, requestUtils$requestMapper$1);
    }

    public final <T, R> Either<Failure, R> requestMapper(ApiResponse<? extends T> response, Function1<? super T, ? extends R> transform, R r, Failure errorResponse, Function0<Unit> onError) {
        Either.Left left;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        Intrinsics.checkNotNullParameter(onError, "onError");
        try {
            if (response instanceof ApiResponse.ApiSuccessResponse) {
                R invoke = transform.invoke((Object) ((ApiResponse.ApiSuccessResponse) response).getBody());
                if (invoke != null) {
                    r = invoke;
                }
                return new Either.Right(r);
            } else if (response instanceof ApiResponse.ApiSuccessEmptyResponse) {
                onError.invoke();
                errorResponse.setErrorMessage("ApiSuccessEmptyResponse");
                return new Either.Left(Failure.EmptyError.INSTANCE);
            } else if (response instanceof ApiResponse.ApiErrorResponse) {
                onError.invoke();
                errorResponse.setErrorCode(((ApiResponse.ApiErrorResponse) response).getErrorCode());
                errorResponse.setErrorMessage(((ApiResponse.ApiErrorResponse) response).getErrorMessage());
                return new Either.Left(errorResponse);
            } else if (response instanceof ApiResponse.ApiNetworkErrorResponse) {
                onError.invoke();
                errorResponse.setException(((ApiResponse.ApiNetworkErrorResponse) response).getException());
                IOException exception = ((ApiResponse.ApiNetworkErrorResponse) response).getException();
                boolean z = true;
                if (!(exception instanceof UnknownHostException ? true : exception instanceof SocketTimeoutException)) {
                    z = exception instanceof ConnectException;
                }
                if (z) {
                    Failure.NetworkConnection networkConnection = Failure.NetworkConnection.INSTANCE;
                    networkConnection.setException(((ApiResponse.ApiNetworkErrorResponse) response).getException());
                    left = new Either.Left(networkConnection);
                } else {
                    left = new Either.Left(errorResponse);
                }
                return left;
            } else if (response instanceof ApiResponse.ApiUnknownErrorResponse) {
                onError.invoke();
                errorResponse.setErrorMessage("ApiUnknownErrorResponse");
                errorResponse.setException(((ApiResponse.ApiUnknownErrorResponse) response).getException());
                return new Either.Left(errorResponse);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th) {
            onError.invoke();
            Failure.RequestMappingError requestMappingError = Failure.RequestMappingError.INSTANCE;
            requestMappingError.setException(th);
            return new Either.Left(requestMappingError);
        }
    }

    public static /* synthetic */ Either requestMapperWithHeaderLink$default(RequestUtils requestUtils, ApiResponse apiResponse, Function2 function2, Object obj, Failure failure, int i, Object obj2) {
        if ((i & 8) != 0) {
            failure = Failure.DefaultError.INSTANCE;
        }
        return requestUtils.requestMapperWithHeaderLink(apiResponse, function2, obj, failure);
    }

    public final <T, R> Either<Failure, R> requestMapperWithHeaderLink(ApiResponse<? extends T> response, Function2<? super T, ? super String, ? extends R> transform, R r, Failure errorResponse) {
        Either.Left left;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        try {
            if (response instanceof ApiResponse.ApiSuccessResponse) {
                R invoke = transform.invoke((Object) ((ApiResponse.ApiSuccessResponse) response).getBody(), ((ApiResponse.ApiSuccessResponse) response).getLink());
                if (invoke != null) {
                    r = invoke;
                }
                return new Either.Right(r);
            } else if (response instanceof ApiResponse.ApiSuccessEmptyResponse) {
                errorResponse.setErrorMessage("ApiSuccessEmptyResponse");
                return new Either.Left(Failure.EmptyError.INSTANCE);
            } else if (response instanceof ApiResponse.ApiErrorResponse) {
                errorResponse.setErrorCode(((ApiResponse.ApiErrorResponse) response).getErrorCode());
                errorResponse.setErrorMessage(((ApiResponse.ApiErrorResponse) response).getErrorMessage());
                return new Either.Left(errorResponse);
            } else if (response instanceof ApiResponse.ApiNetworkErrorResponse) {
                errorResponse.setException(((ApiResponse.ApiNetworkErrorResponse) response).getException());
                IOException exception = ((ApiResponse.ApiNetworkErrorResponse) response).getException();
                boolean z = true;
                if (!(exception instanceof UnknownHostException ? true : exception instanceof SocketTimeoutException)) {
                    z = exception instanceof ConnectException;
                }
                if (z) {
                    Failure.NetworkConnection networkConnection = Failure.NetworkConnection.INSTANCE;
                    networkConnection.setException(((ApiResponse.ApiNetworkErrorResponse) response).getException());
                    left = new Either.Left(networkConnection);
                } else {
                    left = new Either.Left(errorResponse);
                }
                return left;
            } else if (response instanceof ApiResponse.ApiUnknownErrorResponse) {
                errorResponse.setErrorMessage("ApiUnknownErrorResponse");
                errorResponse.setException(((ApiResponse.ApiUnknownErrorResponse) response).getException());
                return new Either.Left(errorResponse);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Throwable th) {
            Failure.RequestMappingError requestMappingError = Failure.RequestMappingError.INSTANCE;
            requestMappingError.setException(th);
            return new Either.Left(requestMappingError);
        }
    }
}
