package media.tiger.tigerbox.ui.onboarding.step4;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class OnboardingBackendResponseViewModel_MembersInjector implements MembersInjector<OnboardingBackendResponseViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public OnboardingBackendResponseViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<OnboardingBackendResponseViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new OnboardingBackendResponseViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OnboardingBackendResponseViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
