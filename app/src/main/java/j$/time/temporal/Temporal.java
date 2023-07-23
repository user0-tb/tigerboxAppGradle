package j$.time.temporal;

/* loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    Temporal plus(long j, TemporalUnit temporalUnit);

    Temporal with(TemporalAdjuster temporalAdjuster);

    Temporal with(TemporalField temporalField, long j);
}
