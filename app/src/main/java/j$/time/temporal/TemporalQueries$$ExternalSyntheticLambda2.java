package j$.time.temporal;

/* loaded from: classes2.dex */
public final /* synthetic */ class TemporalQueries$$ExternalSyntheticLambda2 implements TemporalQuery {
    public static final /* synthetic */ TemporalQueries$$ExternalSyntheticLambda2 INSTANCE = new TemporalQueries$$ExternalSyntheticLambda2();

    private /* synthetic */ TemporalQueries$$ExternalSyntheticLambda2() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = TemporalQueries.$r8$clinit;
        return (TemporalUnit) temporalAccessor.query(INSTANCE);
    }
}
