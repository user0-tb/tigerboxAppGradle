package media.tiger.tigerbox.ui.main.maincontentheader;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class MainContentHeaderBarViewModel_MembersInjector implements MembersInjector<MainContentHeaderBarViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public MainContentHeaderBarViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<MainContentHeaderBarViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new MainContentHeaderBarViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MainContentHeaderBarViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
