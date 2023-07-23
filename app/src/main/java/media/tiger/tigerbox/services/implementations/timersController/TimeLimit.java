package media.tiger.tigerbox.services.implementations.timersController;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.infrastructure.Constants;

/* compiled from: TimeLimitTimer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0014\u001a\u00020\u0012J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0012J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/timersController/TimeLimit;", "", "dateCreated", "", "initialLimitSeconds", "", "remainingSeconds", "(Ljava/lang/String;II)V", "getDateCreated", "()Ljava/lang/String;", "getInitialLimitSeconds", "()I", "getRemainingSeconds", "component1", "component2", "component3", "copy", "equals", "", "other", "hasSetLimit", "hashCode", "isEnded", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeLimit {
    private final String dateCreated;
    private final int initialLimitSeconds;
    private final int remainingSeconds;

    public TimeLimit() {
        this(null, 0, 0, 7, null);
    }

    public static /* synthetic */ TimeLimit copy$default(TimeLimit timeLimit, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = timeLimit.dateCreated;
        }
        if ((i3 & 2) != 0) {
            i = timeLimit.initialLimitSeconds;
        }
        if ((i3 & 4) != 0) {
            i2 = timeLimit.remainingSeconds;
        }
        return timeLimit.copy(str, i, i2);
    }

    public final String component1() {
        return this.dateCreated;
    }

    public final int component2() {
        return this.initialLimitSeconds;
    }

    public final int component3() {
        return this.remainingSeconds;
    }

    public final TimeLimit copy(String dateCreated, int i, int i2) {
        Intrinsics.checkNotNullParameter(dateCreated, "dateCreated");
        return new TimeLimit(dateCreated, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeLimit) {
            TimeLimit timeLimit = (TimeLimit) obj;
            return Intrinsics.areEqual(this.dateCreated, timeLimit.dateCreated) && this.initialLimitSeconds == timeLimit.initialLimitSeconds && this.remainingSeconds == timeLimit.remainingSeconds;
        }
        return false;
    }

    public int hashCode() {
        return (((this.dateCreated.hashCode() * 31) + this.initialLimitSeconds) * 31) + this.remainingSeconds;
    }

    public String toString() {
        return "TimeLimit(dateCreated=" + this.dateCreated + ", initialLimitSeconds=" + this.initialLimitSeconds + ", remainingSeconds=" + this.remainingSeconds + ')';
    }

    public TimeLimit(String dateCreated, int i, int i2) {
        Intrinsics.checkNotNullParameter(dateCreated, "dateCreated");
        this.dateCreated = dateCreated;
        this.initialLimitSeconds = i;
        this.remainingSeconds = i2;
    }

    public /* synthetic */ TimeLimit(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? Constants.DEFAULT_DATE : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2);
    }

    public final String getDateCreated() {
        return this.dateCreated;
    }

    public final int getInitialLimitSeconds() {
        return this.initialLimitSeconds;
    }

    public final int getRemainingSeconds() {
        return this.remainingSeconds;
    }

    public final boolean hasSetLimit() {
        if (this.initialLimitSeconds >= 0) {
            if ((this.dateCreated.length() > 0) && !Intrinsics.areEqual(this.dateCreated, Constants.DEFAULT_DATE)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEnded() {
        return hasSetLimit() && this.remainingSeconds <= 0;
    }
}
