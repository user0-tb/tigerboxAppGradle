package media.tiger.tigerbox.services.implementations.timersController;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.interfaces.timersController.LockedModeService;
import media.tiger.tigerbox.services.interfaces.timersController.TimeLimitTimerService;
import media.tiger.tigerbox.services.interfaces.timersController.WindowedLimitTimeService;

/* compiled from: LockedMode.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/timersController/LockedMode;", "Lmedia/tiger/tigerbox/services/interfaces/timersController/LockedModeService;", "timeLimit", "Lmedia/tiger/tigerbox/services/interfaces/timersController/TimeLimitTimerService;", "windowedLimit", "Lmedia/tiger/tigerbox/services/interfaces/timersController/WindowedLimitTimeService;", "(Lmedia/tiger/tigerbox/services/interfaces/timersController/TimeLimitTimerService;Lmedia/tiger/tigerbox/services/interfaces/timersController/WindowedLimitTimeService;)V", "checkLockedMode", "Lmedia/tiger/tigerbox/services/implementations/timersController/LockedModeReason;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LockedMode implements LockedModeService {
    private final TimeLimitTimerService timeLimit;
    private final WindowedLimitTimeService windowedLimit;

    public LockedMode(TimeLimitTimerService timeLimit, WindowedLimitTimeService windowedLimit) {
        Intrinsics.checkNotNullParameter(timeLimit, "timeLimit");
        Intrinsics.checkNotNullParameter(windowedLimit, "windowedLimit");
        this.timeLimit = timeLimit;
        this.windowedLimit = windowedLimit;
    }

    @Override // media.tiger.tigerbox.services.interfaces.timersController.LockedModeService
    public LockedModeReason checkLockedMode() {
        return !this.windowedLimit.checkWindowedLimit() ? LockedModeReason.WINDOWED_LIMIT : !this.timeLimit.checkLimit() ? LockedModeReason.USAGE_LIMIT : LockedModeReason.NONE;
    }
}
