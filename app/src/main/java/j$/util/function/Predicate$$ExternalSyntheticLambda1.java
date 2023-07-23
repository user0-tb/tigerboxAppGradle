package j$.util.function;

import j$.util.function.Predicate;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class Predicate$$ExternalSyntheticLambda1 implements Predicate, BinaryOperator {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Predicate$$ExternalSyntheticLambda1(Predicate predicate) {
        this.$r8$classId = 0;
        this.f$0 = predicate;
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 1:
                return ((Comparator) this.f$0).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) this.f$0).compare(obj, obj2) <= 0 ? obj : obj2;
        }
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
    public boolean test(Object obj) {
        return !((Predicate) this.f$0).test(obj);
    }

    public /* synthetic */ Predicate$$ExternalSyntheticLambda1(Comparator comparator, int i) {
        this.$r8$classId = i;
        if (i != 2) {
            this.f$0 = comparator;
        } else {
            this.f$0 = comparator;
        }
    }
}
