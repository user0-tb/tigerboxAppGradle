package media.tiger.tigerbox.services.implementations.receiver;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.implementations.ButtonService;

/* loaded from: classes3.dex */
public final class ButtonBroadcastReceiver_MembersInjector implements MembersInjector<ButtonBroadcastReceiver> {
    private final Provider<ButtonService> buttonServiceProvider;

    public ButtonBroadcastReceiver_MembersInjector(Provider<ButtonService> buttonServiceProvider) {
        this.buttonServiceProvider = buttonServiceProvider;
    }

    public static MembersInjector<ButtonBroadcastReceiver> create(Provider<ButtonService> buttonServiceProvider) {
        return new ButtonBroadcastReceiver_MembersInjector(buttonServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ButtonBroadcastReceiver instance) {
        injectButtonService(instance, this.buttonServiceProvider.get());
    }

    public static void injectButtonService(ButtonBroadcastReceiver instance, ButtonService buttonService) {
        instance.buttonService = buttonService;
    }
}
