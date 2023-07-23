package media.tiger.tigerbox.ui.settings.parentalGate;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class ParentalGateEnableDisableStepViewModel_MembersInjector implements MembersInjector<ParentalGateEnableDisableStepViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public ParentalGateEnableDisableStepViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<ParentalGateEnableDisableStepViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new ParentalGateEnableDisableStepViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ParentalGateEnableDisableStepViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
