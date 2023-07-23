package media.tiger.tigerbox.ui.onboarding;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.services.interfaces.WifiService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class OnboardingActivityViewModel_Factory implements Factory<OnboardingActivityViewModel> {
    private final Provider<LightControlService> _lightControlProvider;
    private final Provider<LightControlService> lightControllerProvider;
    private final Provider<WifiService> wifiServiceProvider;

    public OnboardingActivityViewModel_Factory(Provider<WifiService> wifiServiceProvider, Provider<LightControlService> lightControllerProvider, Provider<LightControlService> _lightControlProvider) {
        this.wifiServiceProvider = wifiServiceProvider;
        this.lightControllerProvider = lightControllerProvider;
        this._lightControlProvider = _lightControlProvider;
    }

    @Override // javax.inject.Provider
    public OnboardingActivityViewModel get() {
        OnboardingActivityViewModel newInstance = newInstance(this.wifiServiceProvider.get(), this.lightControllerProvider.get());
        BaseViewModel_MembersInjector.inject_lightControl(newInstance, this._lightControlProvider.get());
        return newInstance;
    }

    public static OnboardingActivityViewModel_Factory create(Provider<WifiService> wifiServiceProvider, Provider<LightControlService> lightControllerProvider, Provider<LightControlService> _lightControlProvider) {
        return new OnboardingActivityViewModel_Factory(wifiServiceProvider, lightControllerProvider, _lightControlProvider);
    }

    public static OnboardingActivityViewModel newInstance(WifiService wifiService, LightControlService lightController) {
        return new OnboardingActivityViewModel(wifiService, lightController);
    }
}
