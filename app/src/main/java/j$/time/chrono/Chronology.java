package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.time.ZonedDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQueries$$ExternalSyntheticLambda1;
import j$.time.temporal.UnsupportedTemporalTypeException;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface Chronology extends Comparable {

    /* renamed from: j$.time.chrono.Chronology$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static int $default$get(ChronoZonedDateTime chronoZonedDateTime, TemporalField temporalField) {
            if (temporalField instanceof ChronoField) {
                int i = ChronoZonedDateTime.AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
                if (i != 1) {
                    ZonedDateTime zonedDateTime = (ZonedDateTime) chronoZonedDateTime;
                    return i != 2 ? ((LocalDateTime) zonedDateTime.toLocalDateTime()).get(temporalField) : zonedDateTime.getOffset().getTotalSeconds();
                }
                throw new UnsupportedTemporalTypeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            return TemporalAdjusters.$default$get(chronoZonedDateTime, temporalField);
        }

        public static Chronology from(TemporalAccessor temporalAccessor) {
            Objects.requireNonNull(temporalAccessor, "temporal");
            int i = TemporalQueries.$r8$clinit;
            Chronology chronology = (Chronology) temporalAccessor.query(TemporalQueries$$ExternalSyntheticLambda1.INSTANCE);
            return chronology != null ? chronology : IsoChronology.INSTANCE;
        }
    }
}
