package media.tiger.tigerbox.ui.onboarding;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class OnboardingActivityViewModel_MembersInjector implements MembersInjector<OnboardingActivityViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public OnboardingActivityViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<OnboardingActivityViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new OnboardingActivityViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OnboardingActivityViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
