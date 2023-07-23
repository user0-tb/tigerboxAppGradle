package media.tiger.tigerbox.ui.common.wifi;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class WifiEnterPasswordViewModel_MembersInjector implements MembersInjector<WifiEnterPasswordViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public WifiEnterPasswordViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<WifiEnterPasswordViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new WifiEnterPasswordViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WifiEnterPasswordViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
