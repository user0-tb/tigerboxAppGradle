package media.tiger.tigerbox.services.interfaces.timersController;

import kotlin.Metadata;
import media.tiger.tigerbox.services.implementations.timersController.LockedModeListener;
import media.tiger.tigerbox.services.implementations.timersController.TimeLimit;

/* compiled from: TimersControllerService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/timersController/TimersControllerService;", "", "continueTimedLimitTimer", "", "initiateTimedLimit", "initiateWindowedLimit", "pauseTimedLimitTimer", "registerLockedModeListener", "lockedModeListener", "Lmedia/tiger/tigerbox/services/implementations/timersController/LockedModeListener;", "startTimedLimitTimer", "timeLimit", "Lmedia/tiger/tigerbox/services/implementations/timersController/TimeLimit;", "reset", "", "unregisterLockedModeListener", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TimersControllerService {
    void continueTimedLimitTimer();

    void initiateTimedLimit();

    void initiateWindowedLimit();

    void pauseTimedLimitTimer();

    void registerLockedModeListener(LockedModeListener lockedModeListener);

    void startTimedLimitTimer(TimeLimit timeLimit, boolean z);

    void unregisterLockedModeListener(LockedModeListener lockedModeListener);

    /* compiled from: TimersControllerService.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void startTimedLimitTimer$default(TimersControllerService timersControllerService, TimeLimit timeLimit, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTimedLimitTimer");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            timersControllerService.startTimedLimitTimer(timeLimit, z);
        }
    }
}
