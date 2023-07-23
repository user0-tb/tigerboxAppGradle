package media.tiger.tigerbox.services.interfaces.timersController;

import kotlin.Metadata;

/* compiled from: ShutDownTimerService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/timersController/ShutDownTimeListener;", "", "onSleepTimeInitialValueChanged", "", "onSleepTimeTick", "secondsUntilFinished", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ShutDownTimeListener {

    /* compiled from: ShutDownTimerService.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void onSleepTimeInitialValueChanged(ShutDownTimeListener shutDownTimeListener) {
        }

        public static void onSleepTimeTick(ShutDownTimeListener shutDownTimeListener, int i) {
        }
    }

    void onSleepTimeInitialValueChanged();

    void onSleepTimeTick(int i);
}
