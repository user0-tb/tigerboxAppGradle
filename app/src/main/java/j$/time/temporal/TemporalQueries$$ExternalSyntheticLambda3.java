package j$.time.temporal;

import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final /* synthetic */ class TemporalQueries$$ExternalSyntheticLambda3 implements TemporalQuery {
    public static final /* synthetic */ TemporalQueries$$ExternalSyntheticLambda3 INSTANCE = new TemporalQueries$$ExternalSyntheticLambda3();

    private /* synthetic */ TemporalQueries$$ExternalSyntheticLambda3() {
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = TemporalQueries.$r8$clinit;
        ChronoField chronoField = ChronoField.OFFSET_SECONDS;
        if (temporalAccessor.isSupported(chronoField)) {
            return ZoneOffset.ofTotalSeconds(temporalAccessor.get(chronoField));
        }
        return null;
    }
}
