package j$.time.temporal;

/* loaded from: classes2.dex */
public final /* synthetic */ class TemporalAdjusters$$ExternalSyntheticLambda1 implements TemporalAdjuster {
    public final /* synthetic */ int f$0;

    public /* synthetic */ TemporalAdjusters$$ExternalSyntheticLambda1(int i) {
        this.f$0 = i;
    }

    public final Temporal adjustInto(Temporal temporal) {
        int i = this.f$0;
        int i2 = temporal.get(ChronoField.DAY_OF_WEEK);
        if (i2 == i) {
            return temporal;
        }
        int i3 = i2 - i;
        return temporal.plus(i3 >= 0 ? 7 - i3 : -i3, ChronoUnit.DAYS);
    }
}
