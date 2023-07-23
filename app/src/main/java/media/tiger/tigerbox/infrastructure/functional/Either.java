package media.tiger.tigerbox.infrastructure.functional;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Either.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\u0015\u0016B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J.\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000e\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u000f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0013\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007\u0082\u0001\u0002\u000e\u0012¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "L", "R", "", "()V", "isLeft", "", "()Z", "isRight", "fold", "fnL", "Lkotlin/Function1;", "fnR", TtmlNode.LEFT, "Lmedia/tiger/tigerbox/infrastructure/functional/Either$Left;", "a", "(Ljava/lang/Object;)Lmedia/tiger/tigerbox/infrastructure/functional/Either$Left;", TtmlNode.RIGHT, "Lmedia/tiger/tigerbox/infrastructure/functional/Either$Right;", "b", "(Ljava/lang/Object;)Lmedia/tiger/tigerbox/infrastructure/functional/Either$Right;", "Left", "Right", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Either<L, R> {
    public /* synthetic */ Either(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Either() {
    }

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/functional/Either$Left;", "L", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "", "a", "(Ljava/lang/Object;)V", "getA", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lmedia/tiger/tigerbox/infrastructure/functional/Either$Left;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Left<L> extends Either {
        private final L a;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Left copy$default(Left left, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = left.a;
            }
            return left.copy(obj);
        }

        public final L component1() {
            return this.a;
        }

        public final Left<L> copy(L l) {
            return new Left<>(l);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Left) && Intrinsics.areEqual(this.a, ((Left) obj).a);
        }

        public int hashCode() {
            L l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public String toString() {
            return "Left(a=" + this.a + ')';
        }

        public Left(L l) {
            super(null);
            this.a = l;
        }

        public final L getA() {
            return this.a;
        }
    }

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/functional/Either$Right;", "R", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "", "b", "(Ljava/lang/Object;)V", "getB", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lmedia/tiger/tigerbox/infrastructure/functional/Either$Right;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Right<R> extends Either {
        private final R b;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Right copy$default(Right right, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = right.b;
            }
            return right.copy(obj);
        }

        public final R component1() {
            return this.b;
        }

        public final Right<R> copy(R r) {
            return new Right<>(r);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Right) && Intrinsics.areEqual(this.b, ((Right) obj).b);
        }

        public int hashCode() {
            R r = this.b;
            if (r == null) {
                return 0;
            }
            return r.hashCode();
        }

        public String toString() {
            return "Right(b=" + this.b + ')';
        }

        public Right(R r) {
            super(null);
            this.b = r;
        }

        public final R getB() {
            return this.b;
        }
    }

    public final boolean isRight() {
        return this instanceof Right;
    }

    public final boolean isLeft() {
        return this instanceof Left;
    }

    public final <L> Left<L> left(L l) {
        return new Left<>(l);
    }

    public final <R> Right<R> right(R r) {
        return new Right<>(r);
    }

    public final Object fold(Function1<? super L, ? extends Object> fnL, Function1<? super R, ? extends Object> fnR) {
        Intrinsics.checkNotNullParameter(fnL, "fnL");
        Intrinsics.checkNotNullParameter(fnR, "fnR");
        if (this instanceof Left) {
            return fnL.invoke((Object) ((Left) this).getA());
        }
        if (this instanceof Right) {
            return fnR.invoke((Object) ((Right) this).getB());
        }
        throw new NoWhenBranchMatchedException();
    }
}
