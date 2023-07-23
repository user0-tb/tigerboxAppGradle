package j$.util.function;

import java.util.Objects;

/* loaded from: classes2.dex */
public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
            Objects.requireNonNull(predicate2);
            return new Predicate$$ExternalSyntheticLambda2(predicate, predicate2, 0);
        }

        public static Predicate $default$negate(Predicate predicate) {
            return new Predicate$$ExternalSyntheticLambda1(predicate);
        }

        public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
            Objects.requireNonNull(predicate2);
            return new Predicate$$ExternalSyntheticLambda2(predicate, predicate2, 1);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
