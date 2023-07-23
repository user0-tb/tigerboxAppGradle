package media.tiger.tigerbox.services.implementations.receiver;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.NfcService;

/* loaded from: classes3.dex */
public final class NfcBroadcastReceiver_MembersInjector implements MembersInjector<NfcBroadcastReceiver> {
    private final Provider<NfcService> nfcServiceProvider;

    public NfcBroadcastReceiver_MembersInjector(Provider<NfcService> nfcServiceProvider) {
        this.nfcServiceProvider = nfcServiceProvider;
    }

    public static MembersInjector<NfcBroadcastReceiver> create(Provider<NfcService> nfcServiceProvider) {
        return new NfcBroadcastReceiver_MembersInjector(nfcServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NfcBroadcastReceiver instance) {
        injectNfcService(instance, this.nfcServiceProvider.get());
    }

    public static void injectNfcService(NfcBroadcastReceiver instance, NfcService nfcService) {
        instance.nfcService = nfcService;
    }
}
