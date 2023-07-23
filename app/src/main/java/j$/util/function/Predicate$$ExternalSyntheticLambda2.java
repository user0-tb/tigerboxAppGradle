package j$.util.function;

import j$.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class Predicate$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Predicate f$0;
    public final /* synthetic */ Predicate f$1;

    public /* synthetic */ Predicate$$ExternalSyntheticLambda2(Predicate predicate, Predicate predicate2, int i) {
        this.$r8$classId = i;
        if (i != 1) {
            this.f$0 = predicate;
            this.f$1 = predicate2;
            return;
        }
        this.f$0 = predicate;
        this.f$1 = predicate2;
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.$r8$classId) {
            case 0:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        switch (this.$r8$classId) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.$r8$classId) {
            case 0:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.test(obj) && this.f$1.test(obj);
            default:
                return this.f$0.test(obj) || this.f$1.test(obj);
        }
    }
}
