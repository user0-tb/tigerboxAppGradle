package media.tiger.tigerbox.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.NfcService;

/* loaded from: classes4.dex */
public final class TigerBoxActivity_MembersInjector implements MembersInjector<TigerBoxActivity> {
    private final Provider<NfcService> nfcServiceProvider;

    public TigerBoxActivity_MembersInjector(Provider<NfcService> nfcServiceProvider) {
        this.nfcServiceProvider = nfcServiceProvider;
    }

    public static MembersInjector<TigerBoxActivity> create(Provider<NfcService> nfcServiceProvider) {
        return new TigerBoxActivity_MembersInjector(nfcServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TigerBoxActivity instance) {
        injectNfcService(instance, this.nfcServiceProvider.get());
    }

    public static void injectNfcService(TigerBoxActivity instance, NfcService nfcService) {
        instance.nfcService = nfcService;
    }
}
