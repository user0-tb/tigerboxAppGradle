package media.tiger.tigerbox.services.implementations.receiver;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService;

/* loaded from: classes3.dex */
public final class WindowedLimitBroadcastReceiver_MembersInjector implements MembersInjector<WindowedLimitBroadcastReceiver> {
    private final Provider<TimersControllerService> limitTimerProvider;

    public WindowedLimitBroadcastReceiver_MembersInjector(Provider<TimersControllerService> limitTimerProvider) {
        this.limitTimerProvider = limitTimerProvider;
    }

    public static MembersInjector<WindowedLimitBroadcastReceiver> create(Provider<TimersControllerService> limitTimerProvider) {
        return new WindowedLimitBroadcastReceiver_MembersInjector(limitTimerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WindowedLimitBroadcastReceiver instance) {
        injectLimitTimer(instance, this.limitTimerProvider.get());
    }

    public static void injectLimitTimer(WindowedLimitBroadcastReceiver instance, TimersControllerService limitTimer) {
        instance.limitTimer = limitTimer;
    }
}
