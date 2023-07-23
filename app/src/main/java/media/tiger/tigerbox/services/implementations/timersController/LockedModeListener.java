package media.tiger.tigerbox.services.implementations.timersController;

import kotlin.Metadata;

/* compiled from: TimersController.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/timersController/LockedModeListener;", "", "onDisableLockScreen", "", "onEnableLockScreen", "reason", "Lmedia/tiger/tigerbox/services/implementations/timersController/LockedModeReason;", "onTimeLimitTick", "remainingSeconds", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LockedModeListener {
    void onDisableLockScreen();

    void onEnableLockScreen(LockedModeReason lockedModeReason);

    void onTimeLimitTick(int i);
}
