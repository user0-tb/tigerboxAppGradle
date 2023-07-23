package media.tiger.tigerbox.services.interfaces.timersController;

import kotlin.Metadata;

/* compiled from: ShutDownTimerService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\fH&J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/timersController/ShutDownTimerService;", "", "currentShutDownTimeSeconds", "", "getCurrentShutDownTimeSeconds", "()I", "setCurrentShutDownTimeSeconds", "(I)V", "initialShutDownTimeSeconds", "getInitialShutDownTimeSeconds", "setInitialShutDownTimeSeconds", "cancelTimer", "", "registerShutDownTimeListener", "listener", "Lmedia/tiger/tigerbox/services/interfaces/timersController/ShutDownTimeListener;", "shutDownAtTheEndOfPlayback", "startTimer", "sleepTimeSeconds", "unregisterShutDownTimeListener", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ShutDownTimerService {
    void cancelTimer();

    int getCurrentShutDownTimeSeconds();

    int getInitialShutDownTimeSeconds();

    void registerShutDownTimeListener(ShutDownTimeListener shutDownTimeListener);

    void setCurrentShutDownTimeSeconds(int i);

    void setInitialShutDownTimeSeconds(int i);

    void shutDownAtTheEndOfPlayback();

    void startTimer(int i);

    void unregisterShutDownTimeListener(ShutDownTimeListener shutDownTimeListener);
}
