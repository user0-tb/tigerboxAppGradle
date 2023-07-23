package media.tiger.tigerbox.infrastructure.functional;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.infrastructure.functional.Either;

/* compiled from: Either.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aH\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\u0001\u001aT\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u00070\u0001\u001a*\u0010\f\u001a\u00020\r\"\b\b\u0000\u0010\b*\u00020\r\"\b\b\u0001\u0010\n*\u00020\r*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u0007\u001a/\u0010\u000e\u001a\u0002H\n\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072\u0006\u0010\u000f\u001a\u0002H\n¢\u0006\u0002\u0010\u0010\u001aH\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0007\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\t0\u0001\u001aQ\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u0011H\b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00160\u0001\u001aQ\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\n*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\n0\u00072!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00160\u0001¨\u0006\u0019"}, d2 = {"c", "Lkotlin/Function1;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "C", "B", "f", "flatMap", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "L", ExifInterface.GPS_DIRECTION_TRUE, "R", "fn", "get", "", "getOrElse", "value", "(Lmedia/tiger/tigerbox/infrastructure/functional/Either;Ljava/lang/Object;)Ljava/lang/Object;", "map", "onFailure", "Lkotlin/ParameterName;", "name", "failure", "", "onSuccess", "success", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EitherKt {
    public static final <A, B, C> Function1<A, C> c(final Function1<? super A, ? extends B> function1, final Function1<? super B, ? extends C> f) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        return new Function1<A, C>() { // from class: media.tiger.tigerbox.infrastructure.functional.EitherKt$c$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final C invoke(A a) {
                return f.invoke(function1.invoke(a));
            }
        };
    }

    public static final <T, L, R> Either<L, T> flatMap(Either<? extends L, ? extends R> either, Function1<? super R, ? extends Either<? extends L, ? extends T>> fn) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(fn, "fn");
        if (either instanceof Either.Left) {
            return new Either.Left(((Either.Left) either).getA());
        }
        if (either instanceof Either.Right) {
            return (Either) ((Either<? extends L, ? extends T>) fn.invoke((Object) ((Either.Right) either).getB()));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <L, R> Object get(Either<? extends L, ? extends R> either) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return ((Either.Left) either).getA();
        }
        if (either instanceof Either.Right) {
            return ((Either.Right) either).getB();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T, L, R> Either<L, T> map(Either<? extends L, ? extends R> either, Function1<? super R, ? extends T> fn) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(fn, "fn");
        return flatMap(either, c(fn, new EitherKt$map$1(either)));
    }

    public static final <L, R> R getOrElse(Either<? extends L, ? extends R> either, R r) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        if (either instanceof Either.Left) {
            return r;
        }
        if (either instanceof Either.Right) {
            return (R) ((Either.Right) either).getB();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <L, R> Either<L, R> onFailure(Either<? extends L, ? extends R> either, Function1<? super L, Unit> fn) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(fn, "fn");
        if (either instanceof Either.Left) {
            fn.invoke((Object) ((Either.Left) either).getA());
        }
        return either;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <L, R> Either<L, R> onSuccess(Either<? extends L, ? extends R> either, Function1<? super R, Unit> fn) {
        Intrinsics.checkNotNullParameter(either, "<this>");
        Intrinsics.checkNotNullParameter(fn, "fn");
        if (either instanceof Either.Right) {
            fn.invoke((Object) ((Either.Right) either).getB());
        }
        return either;
    }
}
