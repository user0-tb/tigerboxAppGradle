package media.tiger.tigerbox.services.implementations.timersController;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.DisplayService;
import media.tiger.tigerbox.services.interfaces.audioPlayer.AudioPlaybackState;
import media.tiger.tigerbox.services.interfaces.audioPlayer.AudioPlayerService;
import media.tiger.tigerbox.services.interfaces.timersController.TimeLimitListener;
import media.tiger.tigerbox.services.interfaces.timersController.TimeLimitTimerService;
import media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService;
import media.tiger.tigerbox.services.interfaces.timersController.WindowedLimitTimeListener;
import media.tiger.tigerbox.services.interfaces.timersController.WindowedLimitTimeService;

/* compiled from: TimersController.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\u000f\u0012\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0017H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rH\u0016J\u0018\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0015H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006)"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/timersController/TimersController;", "Lmedia/tiger/tigerbox/services/interfaces/timersController/TimersControllerService;", "timeLimitTimer", "Lmedia/tiger/tigerbox/services/interfaces/timersController/TimeLimitTimerService;", "windowedLimit", "Lmedia/tiger/tigerbox/services/interfaces/timersController/WindowedLimitTimeService;", "audioPlayerService", "Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/AudioPlayerService;", "displayService", "Lmedia/tiger/tigerbox/services/implementations/DisplayService;", "(Lmedia/tiger/tigerbox/services/interfaces/timersController/TimeLimitTimerService;Lmedia/tiger/tigerbox/services/interfaces/timersController/WindowedLimitTimeService;Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/AudioPlayerService;Lmedia/tiger/tigerbox/services/implementations/DisplayService;)V", "lockedModeListenerSubscribers", "", "Lmedia/tiger/tigerbox/services/implementations/timersController/LockedModeListener;", "timeLimitListener", "media/tiger/tigerbox/services/implementations/timersController/TimersController$timeLimitListener$1", "Lmedia/tiger/tigerbox/services/implementations/timersController/TimersController$timeLimitListener$1;", "windowedTimeListener", "media/tiger/tigerbox/services/implementations/timersController/TimersController$windowedTimeListener$1", "Lmedia/tiger/tigerbox/services/implementations/timersController/TimersController$windowedTimeListener$1;", "checkWindowedLimit", "", "continueTimedLimitTimer", "", "disableLockMode", "enableLockMode", "reason", "Lmedia/tiger/tigerbox/services/implementations/timersController/LockedModeReason;", "initiateTimedLimit", "initiateWindowedLimit", "notifyTick", "remainingSeconds", "", "pauseTimedLimitTimer", "registerLockedModeListener", "lockedModeListener", "startTimedLimitTimer", "timeLimit", "Lmedia/tiger/tigerbox/services/implementations/timersController/TimeLimit;", "reset", "unregisterLockedModeListener", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimersController implements TimersControllerService {
    private final AudioPlayerService audioPlayerService;
    private final DisplayService displayService;
    private List<LockedModeListener> lockedModeListenerSubscribers;
    private final TimersController$timeLimitListener$1 timeLimitListener;
    private final TimeLimitTimerService timeLimitTimer;
    private final WindowedLimitTimeService windowedLimit;
    private final TimersController$windowedTimeListener$1 windowedTimeListener;

    /* JADX WARN: Type inference failed for: r2v3, types: [media.tiger.tigerbox.services.implementations.timersController.TimersController$windowedTimeListener$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [media.tiger.tigerbox.services.implementations.timersController.TimersController$timeLimitListener$1] */
    public TimersController(TimeLimitTimerService timeLimitTimer, WindowedLimitTimeService windowedLimit, AudioPlayerService audioPlayerService, DisplayService displayService) {
        Intrinsics.checkNotNullParameter(timeLimitTimer, "timeLimitTimer");
        Intrinsics.checkNotNullParameter(windowedLimit, "windowedLimit");
        Intrinsics.checkNotNullParameter(audioPlayerService, "audioPlayerService");
        Intrinsics.checkNotNullParameter(displayService, "displayService");
        this.timeLimitTimer = timeLimitTimer;
        this.windowedLimit = windowedLimit;
        this.audioPlayerService = audioPlayerService;
        this.displayService = displayService;
        this.lockedModeListenerSubscribers = new ArrayList();
        this.windowedTimeListener = new WindowedLimitTimeListener() { // from class: media.tiger.tigerbox.services.implementations.timersController.TimersController$windowedTimeListener$1
            @Override // media.tiger.tigerbox.services.interfaces.timersController.WindowedLimitTimeListener
            public void onWindowedLimitCheck(boolean z) {
                TimeLimitTimerService timeLimitTimerService;
                TimeLimitTimerService timeLimitTimerService2;
                if (z) {
                    timeLimitTimerService2 = TimersController.this.timeLimitTimer;
                    if (timeLimitTimerService2.checkLimit()) {
                        TimersController.this.disableLockMode();
                        return;
                    }
                    return;
                }
                timeLimitTimerService = TimersController.this.timeLimitTimer;
                if (!timeLimitTimerService.checkLimit()) {
                    TimersController.this.enableLockMode(LockedModeReason.USAGE_LIMIT);
                } else {
                    TimersController.this.enableLockMode(LockedModeReason.WINDOWED_LIMIT);
                }
            }
        };
        this.timeLimitListener = new TimeLimitListener() { // from class: media.tiger.tigerbox.services.implementations.timersController.TimersController$timeLimitListener$1

            /* compiled from: TimersController.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LockedModeReason.values().length];
                    iArr[LockedModeReason.NONE.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // media.tiger.tigerbox.services.interfaces.timersController.TimeLimitListener
            public void onTimeLimitTick(int i) {
                TimersController.this.notifyTick(i);
            }

            @Override // media.tiger.tigerbox.services.interfaces.timersController.TimeLimitListener
            public void onLockModeChanged(LockedModeReason newValue) {
                WindowedLimitTimeService windowedLimitTimeService;
                Intrinsics.checkNotNullParameter(newValue, "newValue");
                windowedLimitTimeService = TimersController.this.windowedLimit;
                if (windowedLimitTimeService.checkWindowedLimit()) {
                    if (WhenMappings.$EnumSwitchMapping$0[newValue.ordinal()] == 1) {
                        TimersController.this.disableLockMode();
                    } else {
                        TimersController.this.enableLockMode(LockedModeReason.USAGE_LIMIT);
                    }
                }
            }
        };
    }

    @Override // media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService
    public void initiateTimedLimit() {
        boolean z = true;
        this.timeLimitTimer.initiate((this.windowedLimit.checkWindowedLimit() && (this.displayService.getCurrentState() != DisplayService.DisplayState.TIGERBOX_DISPLAY_OFF)) ? false : false);
    }

    private final boolean checkWindowedLimit() {
        return this.windowedLimit.checkWindowedLimit();
    }

    @Override // media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService
    public void initiateWindowedLimit() {
        if (!checkWindowedLimit()) {
            this.timeLimitTimer.pauseTimer();
        } else {
            this.timeLimitTimer.continueTimer();
        }
        this.windowedLimit.initiate();
    }

    @Override // media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService
    public void startTimedLimitTimer(TimeLimit timeLimit, boolean z) {
        Intrinsics.checkNotNullParameter(timeLimit, "timeLimit");
        this.timeLimitTimer.startTimer(timeLimit, z);
    }

    @Override // media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService
    public void pauseTimedLimitTimer() {
        if (this.audioPlayerService.getState() != AudioPlaybackState.PLAYING) {
            this.timeLimitTimer.pauseTimer();
        }
    }

    @Override // media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService
    public void continueTimedLimitTimer() {
        if (this.windowedLimit.checkWindowedLimit()) {
            this.timeLimitTimer.continueTimer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableLockMode(LockedModeReason lockedModeReason) {
        for (LockedModeListener lockedModeListener : this.lockedModeListenerSubscribers) {
            lockedModeListener.onEnableLockScreen(lockedModeReason);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableLockMode() {
        for (LockedModeListener lockedModeListener : this.lockedModeListenerSubscribers) {
            lockedModeListener.onDisableLockScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyTick(int i) {
        for (LockedModeListener lockedModeListener : this.lockedModeListenerSubscribers) {
            lockedModeListener.onTimeLimitTick(i);
        }
    }

    @Override // media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService
    public void registerLockedModeListener(LockedModeListener lockedModeListener) {
        Intrinsics.checkNotNullParameter(lockedModeListener, "lockedModeListener");
        if (!this.lockedModeListenerSubscribers.contains(lockedModeListener)) {
            this.lockedModeListenerSubscribers.add(lockedModeListener);
        }
        this.timeLimitTimer.registerTimeLimitTimerListener(this.timeLimitListener);
        this.windowedLimit.registerWindowLimitListener(this.windowedTimeListener);
    }

    @Override // media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService
    public void unregisterLockedModeListener(LockedModeListener lockedModeListener) {
        Intrinsics.checkNotNullParameter(lockedModeListener, "lockedModeListener");
        this.lockedModeListenerSubscribers.remove(lockedModeListener);
        this.timeLimitTimer.unregisterTimeLimitTimerListener(this.timeLimitListener);
        this.windowedLimit.unregisterWindowLimitListener(this.windowedTimeListener);
    }
}
