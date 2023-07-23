package media.tiger.tigerbox.ui.onboarding.step2;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class OnboardingWifiViewModel_MembersInjector implements MembersInjector<OnboardingWifiViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public OnboardingWifiViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<OnboardingWifiViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new OnboardingWifiViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OnboardingWifiViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
