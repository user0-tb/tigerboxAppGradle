package j$.time;

import com.google.android.exoplayer2.C;
import j$.lang.Iterable;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQueries;
import j$.time.temporal.TemporalQueries$$ExternalSyntheticLambda0;
import j$.time.temporal.TemporalQueries$$ExternalSyntheticLambda1;
import j$.time.temporal.TemporalQueries$$ExternalSyntheticLambda2;
import j$.time.temporal.TemporalQueries$$ExternalSyntheticLambda3;
import j$.time.temporal.TemporalQueries$$ExternalSyntheticLambda4;
import j$.time.temporal.TemporalQueries$$ExternalSyntheticLambda5;
import j$.time.temporal.TemporalQueries$$ExternalSyntheticLambda6;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.UnsupportedTemporalTypeException;
import j$.time.temporal.ValueRange;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Instant implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable {
    public static final Instant EPOCH = new Instant(0, 0);
    private final int nanos;
    private final long seconds;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.Instant$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoUnit;

        static {
            int[] iArr = new int[ChronoUnit.values().length];
            $SwitchMap$java$time$temporal$ChronoUnit = iArr;
            try {
                iArr[ChronoUnit.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoUnit[ChronoUnit.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr2;
            try {
                iArr2[ChronoField.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        ofEpochSecond(-31557014167219200L, 0L);
        ofEpochSecond(31556889864403199L, 999999999L);
    }

    private Instant(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    private static Instant create(long j, int i) {
        if ((i | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public static Instant from(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.getLong(ChronoField.INSTANT_SECONDS), temporalAccessor.get(ChronoField.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
        }
    }

    public static Instant now() {
        return Clock.systemUTC().instant();
    }

    public static Instant ofEpochMilli(long j) {
        return create(Iterable.CC.m$2(j, 1000L), ((int) Iterable.CC.m$1(j, 1000L)) * 1000000);
    }

    public static Instant ofEpochSecond(long j) {
        return create(j, 0);
    }

    public static Instant ofEpochSecond(long j, long j2) {
        return create(Iterable.CC.m(j, Iterable.CC.m$2(j2, C.NANOS_PER_SECOND)), (int) Iterable.CC.m$1(j2, C.NANOS_PER_SECOND));
    }

    public static Instant parse(CharSequence charSequence) {
        return (Instant) DateTimeFormatter.ISO_INSTANT.parse(charSequence, new TemporalQuery() { // from class: j$.time.Instant$$ExternalSyntheticLambda1
            @Override // j$.time.temporal.TemporalQuery
            public final Object queryFrom(TemporalAccessor temporalAccessor) {
                return Instant.from(temporalAccessor);
            }
        });
    }

    private Instant plus(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(Iterable.CC.m(Iterable.CC.m(this.seconds, j), j2 / C.NANOS_PER_SECOND), this.nanos + (j2 % C.NANOS_PER_SECOND));
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int compare = Long.compare(this.seconds, instant.seconds);
        return compare != 0 ? compare : this.nanos - instant.nanos;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.seconds == instant.seconds && this.nanos == instant.nanos;
        }
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            ChronoField.INSTANT_SECONDS.checkValidIntValue(this.seconds);
                        }
                        throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
                    }
                    return this.nanos / 1000000;
                }
                return this.nanos / 1000;
            }
            return this.nanos;
        }
        return TemporalAdjusters.$default$range(this, temporalField).checkValidIntValue(temporalField.getFrom(this), temporalField);
    }

    public long getEpochSecond() {
        return this.seconds;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public long getLong(TemporalField temporalField) {
        int i;
        if (temporalField instanceof ChronoField) {
            int i2 = AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField[((ChronoField) temporalField).ordinal()];
            if (i2 == 1) {
                i = this.nanos;
            } else if (i2 == 2) {
                i = this.nanos / 1000;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return this.seconds;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
            } else {
                i = this.nanos / 1000000;
            }
            return i;
        }
        return temporalField.getFrom(this);
    }

    public int getNano() {
        return this.nanos;
    }

    public int hashCode() {
        long j = this.seconds;
        return (this.nanos * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public boolean isSupported(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.isSupportedBy(this);
    }

    public Instant minus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.subtractFrom(this);
    }

    public Temporal minus(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, temporalUnit).plus(1L, temporalUnit) : plus(-j, temporalUnit);
    }

    @Override // j$.time.temporal.Temporal
    public Instant plus(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (AnonymousClass1.$SwitchMap$java$time$temporal$ChronoUnit[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return plus(0L, j);
                case 2:
                    return plus(j / 1000000, (j % 1000000) * 1000);
                case 3:
                    return plus(j / 1000, (j % 1000) * 1000000);
                case 4:
                    return plus(j, 0L);
                case 5:
                    return plusSeconds(Iterable.CC.m$3(j, 60L));
                case 6:
                    return plusSeconds(Iterable.CC.m$3(j, 3600L));
                case 7:
                    return plusSeconds(Iterable.CC.m$3(j, 43200L));
                case 8:
                    return plusSeconds(Iterable.CC.m$3(j, 86400L));
                default:
                    throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
        }
        return (Instant) temporalUnit.addTo(this, j);
    }

    public Instant plus(TemporalAmount temporalAmount) {
        return (Instant) temporalAmount.addTo(this);
    }

    public Instant plusSeconds(long j) {
        return plus(j, 0L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public Object query(TemporalQuery temporalQuery) {
        int i = TemporalQueries.$r8$clinit;
        if (temporalQuery == TemporalQueries$$ExternalSyntheticLambda2.INSTANCE) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == TemporalQueries$$ExternalSyntheticLambda1.INSTANCE || temporalQuery == TemporalQueries$$ExternalSyntheticLambda0.INSTANCE || temporalQuery == TemporalQueries$$ExternalSyntheticLambda4.INSTANCE || temporalQuery == TemporalQueries$$ExternalSyntheticLambda3.INSTANCE || temporalQuery == TemporalQueries$$ExternalSyntheticLambda5.INSTANCE || temporalQuery == TemporalQueries$$ExternalSyntheticLambda6.INSTANCE) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public ValueRange range(TemporalField temporalField) {
        return TemporalAdjusters.$default$range(this, temporalField);
    }

    public long toEpochMilli() {
        long m$3;
        int i;
        long j = this.seconds;
        if (j >= 0 || this.nanos <= 0) {
            m$3 = Iterable.CC.m$3(j, 1000L);
            i = this.nanos / 1000000;
        } else {
            m$3 = Iterable.CC.m$3(j + 1, 1000L);
            i = (this.nanos / 1000000) - 1000;
        }
        return Iterable.CC.m(m$3, i);
    }

    public String toString() {
        return DateTimeFormatter.ISO_INSTANT.format(this);
    }

    @Override // j$.time.temporal.Temporal
    public Temporal with(TemporalAdjuster temporalAdjuster) {
        return (Instant) ((LocalDate) temporalAdjuster).adjustInto(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r3 != r2.nanos) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r3 != r2.nanos) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        r4 = r2.seconds;
     */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j$.time.temporal.Temporal with(j$.time.temporal.TemporalField r3, long r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L68
            r0 = r3
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            r0.checkValidValue(r4)
            int[] r1 = j$.time.Instant.AnonymousClass1.$SwitchMap$java$time$temporal$ChronoField
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L57
            r1 = 2
            if (r0 == r1) goto L49
            r1 = 3
            if (r0 == r1) goto L3e
            r1 = 4
            if (r0 != r1) goto L27
            long r0 = r2.seconds
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L66
            int r3 = r2.nanos
            goto L52
        L27:
            j$.time.temporal.UnsupportedTemporalTypeException r4 = new j$.time.temporal.UnsupportedTemporalTypeException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unsupported field: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L3e:
            int r3 = (int) r4
            r4 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r4
            int r4 = r2.nanos
            if (r3 == r4) goto L66
            goto L50
        L49:
            int r3 = (int) r4
            int r3 = r3 * 1000
            int r4 = r2.nanos
            if (r3 == r4) goto L66
        L50:
            long r4 = r2.seconds
        L52:
            j$.time.Instant r3 = create(r4, r3)
            goto L6e
        L57:
            int r3 = r2.nanos
            long r0 = (long) r3
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L66
            long r0 = r2.seconds
            int r3 = (int) r4
            j$.time.Instant r3 = create(r0, r3)
            goto L6e
        L66:
            r3 = r2
            goto L6e
        L68:
            j$.time.temporal.Temporal r3 = r3.adjustInto(r2, r4)
            j$.time.Instant r3 = (j$.time.Instant) r3
        L6e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.Instant.with(j$.time.temporal.TemporalField, long):j$.time.temporal.Temporal");
    }
}
