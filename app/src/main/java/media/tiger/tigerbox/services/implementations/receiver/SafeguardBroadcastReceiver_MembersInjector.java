package media.tiger.tigerbox.services.implementations.receiver;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.SafeguardService;

/* loaded from: classes3.dex */
public final class SafeguardBroadcastReceiver_MembersInjector implements MembersInjector<SafeguardBroadcastReceiver> {
    private final Provider<SafeguardService> serviceProvider;

    public SafeguardBroadcastReceiver_MembersInjector(Provider<SafeguardService> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public static MembersInjector<SafeguardBroadcastReceiver> create(Provider<SafeguardService> serviceProvider) {
        return new SafeguardBroadcastReceiver_MembersInjector(serviceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SafeguardBroadcastReceiver instance) {
        injectService(instance, this.serviceProvider.get());
    }

    public static void injectService(SafeguardBroadcastReceiver instance, SafeguardService service) {
        instance.service = service;
    }
}
