package media.tiger.tigerbox.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.InfoSoundService;

/* loaded from: classes4.dex */
public final class LauncherActivity_MembersInjector implements MembersInjector<LauncherActivity> {
    private final Provider<InfoSoundService> infoSoundServiceProvider;

    public LauncherActivity_MembersInjector(Provider<InfoSoundService> infoSoundServiceProvider) {
        this.infoSoundServiceProvider = infoSoundServiceProvider;
    }

    public static MembersInjector<LauncherActivity> create(Provider<InfoSoundService> infoSoundServiceProvider) {
        return new LauncherActivity_MembersInjector(infoSoundServiceProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LauncherActivity instance) {
        injectInfoSoundService(instance, this.infoSoundServiceProvider.get());
    }

    public static void injectInfoSoundService(LauncherActivity instance, InfoSoundService infoSoundService) {
        instance.infoSoundService = infoSoundService;
    }
}
