package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class FindOps$$ExternalSyntheticLambda3 implements Predicate {
    public static final /* synthetic */ FindOps$$ExternalSyntheticLambda3 INSTANCE = new FindOps$$ExternalSyntheticLambda3();

    private /* synthetic */ FindOps$$ExternalSyntheticLambda3() {
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        return ((OptionalLong) obj).isPresent();
    }
}
