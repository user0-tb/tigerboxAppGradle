package media.tiger.tigerbox.services.implementations.receiver;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.implementations.DisplayService;

/* loaded from: classes3.dex */
public final class DisplayBroadcastReceiver_MembersInjector implements MembersInjector<DisplayBroadcastReceiver> {
    private final Provider<DisplayService> displayServiceProvider;

    public DisplayBroadcastReceiver_MembersInjector(Provider<DisplayService> displayServiceProvider) {
        this.displayServiceProvider = displayServiceProvider;
    }

    public static MembersInjector<DisplayBroadcastReceiver> create(Provider<DisplayService> displayServiceProvider) {
        return new DisplayBroadcastReceiver_MembersInjector(displayServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(DisplayBroadcastReceiver instance) {
        injectDisplayService(instance, this.displayServiceProvider.get());
    }

    public static void injectDisplayService(DisplayBroadcastReceiver instance, DisplayService displayService) {
        instance.displayService = displayService;
    }
}
