package j$.time;

import com.google.android.exoplayer2.C;
import j$.lang.Iterable;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    private final int nanos;
    private final long seconds;

    static {
        BigInteger.valueOf(C.NANOS_PER_SECOND);
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    }

    private Duration(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    private static Duration create(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    public static Duration ofMinutes(long j) {
        return create(Iterable.CC.m$3(j, 60L), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / C.NANOS_PER_SECOND;
        int i = (int) (j % C.NANOS_PER_SECOND);
        if (i < 0) {
            i = (int) (i + C.NANOS_PER_SECOND);
            j2--;
        }
        return create(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return create(j, 0);
    }

    public static Duration ofSeconds(long j, long j2) {
        return create(Iterable.CC.m(j, Iterable.CC.m$2(j2, C.NANOS_PER_SECOND)), (int) Iterable.CC.m$1(j2, C.NANOS_PER_SECOND));
    }

    @Override // j$.time.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        long j = this.seconds;
        if (j != 0) {
            temporal = temporal.plus(j, ChronoUnit.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? temporal.plus(i, ChronoUnit.NANOS) : temporal;
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int compare = Long.compare(this.seconds, duration.seconds);
        return compare != 0 ? compare : this.nanos - duration.nanos;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            return this.seconds == duration.seconds && this.nanos == duration.nanos;
        }
        return false;
    }

    public int getNano() {
        return this.nanos;
    }

    public long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j = this.seconds;
        return (this.nanos * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isZero() {
        return (this.seconds | ((long) this.nanos)) == 0;
    }

    @Override // j$.time.temporal.TemporalAmount
    public Temporal subtractFrom(Temporal temporal) {
        long j = this.seconds;
        if (j != 0) {
            temporal = ((Instant) temporal).minus(j, ChronoUnit.SECONDS);
        }
        int i = this.nanos;
        if (i != 0) {
            return ((Instant) temporal).minus(i, ChronoUnit.NANOS);
        }
        return temporal;
    }

    public long toMillis() {
        return Iterable.CC.m(Iterable.CC.m$3(this.seconds, 1000L), this.nanos / 1000000);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.seconds;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.nanos == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.nanos <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.nanos > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.nanos);
            } else {
                sb.append(this.nanos + C.NANOS_PER_SECOND);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }
}
