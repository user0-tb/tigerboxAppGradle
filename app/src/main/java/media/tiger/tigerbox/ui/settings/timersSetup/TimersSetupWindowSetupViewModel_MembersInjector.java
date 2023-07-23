package media.tiger.tigerbox.ui.settings.timersSetup;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class TimersSetupWindowSetupViewModel_MembersInjector implements MembersInjector<TimersSetupWindowSetupViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public TimersSetupWindowSetupViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<TimersSetupWindowSetupViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new TimersSetupWindowSetupViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TimersSetupWindowSetupViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
