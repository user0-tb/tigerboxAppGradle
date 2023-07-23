package j$.util;

import j$.util.function.Function;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final /* synthetic */ class Comparator$$ExternalSyntheticLambda0 implements java.util.Comparator, Serializable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ java.util.Comparator f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Comparator$$ExternalSyntheticLambda0(java.util.Comparator comparator, Function function) {
        this.f$0 = comparator;
        this.f$1 = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                java.util.Comparator comparator = this.f$0;
                java.util.Comparator comparator2 = (java.util.Comparator) this.f$1;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                java.util.Comparator comparator3 = this.f$0;
                Function function = (Function) this.f$1;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }

    public /* synthetic */ Comparator$$ExternalSyntheticLambda0(java.util.Comparator comparator, java.util.Comparator comparator2) {
        this.f$0 = comparator;
        this.f$1 = comparator2;
    }
}
