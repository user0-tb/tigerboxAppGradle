package media.tiger.tigerbox.services.implementations.receiver;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService;

/* loaded from: classes3.dex */
public final class DateChangeBroadcastReceiver_MembersInjector implements MembersInjector<DateChangeBroadcastReceiver> {
    private final Provider<TimersControllerService> limitTimerProvider;

    public DateChangeBroadcastReceiver_MembersInjector(Provider<TimersControllerService> limitTimerProvider) {
        this.limitTimerProvider = limitTimerProvider;
    }

    public static MembersInjector<DateChangeBroadcastReceiver> create(Provider<TimersControllerService> limitTimerProvider) {
        return new DateChangeBroadcastReceiver_MembersInjector(limitTimerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DateChangeBroadcastReceiver instance) {
        injectLimitTimer(instance, this.limitTimerProvider.get());
    }

    public static void injectLimitTimer(DateChangeBroadcastReceiver instance, TimersControllerService limitTimer) {
        instance.limitTimer = limitTimer;
    }
}
