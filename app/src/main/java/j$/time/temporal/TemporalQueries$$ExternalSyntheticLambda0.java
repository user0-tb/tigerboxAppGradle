package j$.time.temporal;

import j$.time.ZoneId;

/* loaded from: classes2.dex */
public final /* synthetic */ class TemporalQueries$$ExternalSyntheticLambda0 implements TemporalQuery {
    public static final /* synthetic */ TemporalQueries$$ExternalSyntheticLambda0 INSTANCE = new TemporalQueries$$ExternalSyntheticLambda0();

    private /* synthetic */ TemporalQueries$$ExternalSyntheticLambda0() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = TemporalQueries.$r8$clinit;
        return (ZoneId) temporalAccessor.query(INSTANCE);
    }
}
