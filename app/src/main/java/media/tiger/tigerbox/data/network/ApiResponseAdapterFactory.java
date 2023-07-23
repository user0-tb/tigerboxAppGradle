package media.tiger.tigerbox.data.network;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* compiled from: ApiResponseAdapterFactory.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lmedia/tiger/tigerbox/data/network/ApiResponseAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "()V", "get", "Lretrofit2/CallAdapter;", "returnType", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApiResponseAdapterFactory extends CallAdapter.Factory {
    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (Intrinsics.areEqual(Call.class, CallAdapter.Factory.getRawType(returnType))) {
            if (!(returnType instanceof ParameterizedType)) {
                throw new IllegalStateException("return type must be parameterized as Call<ApiResponse<<Foo>> or Call<ApiResponse<out Foo>>".toString());
            }
            Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) returnType);
            if (Intrinsics.areEqual(CallAdapter.Factory.getRawType(parameterUpperBound), ApiResponse.class)) {
                if (!(parameterUpperBound instanceof ParameterizedType)) {
                    throw new IllegalStateException("Response must be parameterized as ApiResponse<Foo> or ApiResponse<out Foo>".toString());
                }
                Type successBodyType = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                Intrinsics.checkNotNullExpressionValue(successBodyType, "successBodyType");
                return new ApiResponseAdapter(successBodyType);
            }
            return null;
        }
        return null;
    }
}
