package media.tiger.tigerbox.services.implementations.receiver;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.implementations.HeadsetService;

/* loaded from: classes3.dex */
public final class HeadsetBroadcastReceiver_MembersInjector implements MembersInjector<HeadsetBroadcastReceiver> {
    private final Provider<HeadsetService> headsetServiceProvider;

    public HeadsetBroadcastReceiver_MembersInjector(Provider<HeadsetService> headsetServiceProvider) {
        this.headsetServiceProvider = headsetServiceProvider;
    }

    public static MembersInjector<HeadsetBroadcastReceiver> create(Provider<HeadsetService> headsetServiceProvider) {
        return new HeadsetBroadcastReceiver_MembersInjector(headsetServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HeadsetBroadcastReceiver instance) {
        injectHeadsetService(instance, this.headsetServiceProvider.get());
    }

    public static void injectHeadsetService(HeadsetBroadcastReceiver instance, HeadsetService headsetService) {
        instance.headsetService = headsetService;
    }
}
