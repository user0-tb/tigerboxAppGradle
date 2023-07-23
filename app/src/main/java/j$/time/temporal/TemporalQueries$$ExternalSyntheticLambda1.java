package j$.time.temporal;

import j$.time.chrono.Chronology;

/* loaded from: classes2.dex */
public final /* synthetic */ class TemporalQueries$$ExternalSyntheticLambda1 implements TemporalQuery {
    public static final /* synthetic */ TemporalQueries$$ExternalSyntheticLambda1 INSTANCE = new TemporalQueries$$ExternalSyntheticLambda1();

    private /* synthetic */ TemporalQueries$$ExternalSyntheticLambda1() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = TemporalQueries.$r8$clinit;
        return (Chronology) temporalAccessor.query(INSTANCE);
    }
}
