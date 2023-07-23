package media.tiger.tigerbox.services.implementations.timersController;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TimeLimitTimer.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/timersController/WindowedLimits;", "", "limits", "", "Lmedia/tiger/tigerbox/services/implementations/timersController/WindowedLimits$WindowedLimit;", "(Ljava/util/List;)V", "getLimits", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WindowedLimit", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WindowedLimits {
    private final List<WindowedLimit> limits;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WindowedLimits copy$default(WindowedLimits windowedLimits, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = windowedLimits.limits;
        }
        return windowedLimits.copy(list);
    }

    public final List<WindowedLimit> component1() {
        return this.limits;
    }

    public final WindowedLimits copy(List<WindowedLimit> limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        return new WindowedLimits(limits);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WindowedLimits) && Intrinsics.areEqual(this.limits, ((WindowedLimits) obj).limits);
    }

    public int hashCode() {
        return this.limits.hashCode();
    }

    public String toString() {
        return "WindowedLimits(limits=" + this.limits + ')';
    }

    public WindowedLimits(List<WindowedLimit> limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.limits = limits;
    }

    public final List<WindowedLimit> getLimits() {
        return this.limits;
    }

    /* compiled from: TimeLimitTimer.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\rJ\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/timersController/WindowedLimits$WindowedLimit;", "", "windowStart", "", "windowEnd", "(Ljava/lang/String;Ljava/lang/String;)V", "getWindowEnd", "()Ljava/lang/String;", "getWindowStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "isValid", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WindowedLimit {
        private final String windowEnd;
        private final String windowStart;

        public WindowedLimit() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ WindowedLimit copy$default(WindowedLimit windowedLimit, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = windowedLimit.windowStart;
            }
            if ((i & 2) != 0) {
                str2 = windowedLimit.windowEnd;
            }
            return windowedLimit.copy(str, str2);
        }

        public final String component1() {
            return this.windowStart;
        }

        public final String component2() {
            return this.windowEnd;
        }

        public final WindowedLimit copy(String windowStart, String windowEnd) {
            Intrinsics.checkNotNullParameter(windowStart, "windowStart");
            Intrinsics.checkNotNullParameter(windowEnd, "windowEnd");
            return new WindowedLimit(windowStart, windowEnd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof WindowedLimit) {
                WindowedLimit windowedLimit = (WindowedLimit) obj;
                return Intrinsics.areEqual(this.windowStart, windowedLimit.windowStart) && Intrinsics.areEqual(this.windowEnd, windowedLimit.windowEnd);
            }
            return false;
        }

        public int hashCode() {
            return (this.windowStart.hashCode() * 31) + this.windowEnd.hashCode();
        }

        public String toString() {
            return "WindowedLimit(windowStart=" + this.windowStart + ", windowEnd=" + this.windowEnd + ')';
        }

        public WindowedLimit(String windowStart, String windowEnd) {
            Intrinsics.checkNotNullParameter(windowStart, "windowStart");
            Intrinsics.checkNotNullParameter(windowEnd, "windowEnd");
            this.windowStart = windowStart;
            this.windowEnd = windowEnd;
        }

        public /* synthetic */ WindowedLimit(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        public final String getWindowStart() {
            return this.windowStart;
        }

        public final String getWindowEnd() {
            return this.windowEnd;
        }

        public final boolean isValid() {
            return (StringsKt.isBlank(this.windowStart) ^ true) && (StringsKt.isBlank(this.windowEnd) ^ true);
        }
    }
}
