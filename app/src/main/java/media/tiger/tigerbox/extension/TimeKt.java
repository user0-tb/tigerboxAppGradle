package media.tiger.tigerbox.extension;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: time.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0006"}, d2 = {"millisToSeconds", "", "", "minutesToSeconds", "secondsToMillis", "secondsToMinutes", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeKt {
    public static final long secondsToMillis(int i) {
        return TimeUnit.SECONDS.toMillis(i);
    }

    public static final int secondsToMinutes(int i) {
        return (int) TimeUnit.SECONDS.toMinutes(i);
    }

    public static final int minutesToSeconds(int i) {
        return (int) TimeUnit.MINUTES.toSeconds(i);
    }

    public static final int millisToSeconds(long j) {
        return (int) TimeUnit.MILLISECONDS.toSeconds(j);
    }
}
