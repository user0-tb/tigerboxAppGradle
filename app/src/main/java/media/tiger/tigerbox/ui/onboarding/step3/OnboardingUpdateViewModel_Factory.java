package media.tiger.tigerbox.ui.onboarding.step3;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.BatteryService;
import media.tiger.tigerbox.services.interfaces.FirmwareUpdateService;

/* loaded from: classes4.dex */
public final class OnboardingUpdateViewModel_Factory implements Factory<OnboardingUpdateViewModel> {
    private final Provider<BatteryService> batteryServiceProvider;
    private final Provider<FirmwareUpdateService> firmwareUpdateServiceProvider;

    public OnboardingUpdateViewModel_Factory(Provider<FirmwareUpdateService> firmwareUpdateServiceProvider, Provider<BatteryService> batteryServiceProvider) {
        this.firmwareUpdateServiceProvider = firmwareUpdateServiceProvider;
        this.batteryServiceProvider = batteryServiceProvider;
    }

    @Override // javax.inject.Provider
    public OnboardingUpdateViewModel get() {
        return newInstance(this.firmwareUpdateServiceProvider.get(), this.batteryServiceProvider.get());
    }

    public static OnboardingUpdateViewModel_Factory create(Provider<FirmwareUpdateService> firmwareUpdateServiceProvider, Provider<BatteryService> batteryServiceProvider) {
        return new OnboardingUpdateViewModel_Factory(firmwareUpdateServiceProvider, batteryServiceProvider);
    }

    public static OnboardingUpdateViewModel newInstance(FirmwareUpdateService firmwareUpdateService, BatteryService batteryService) {
        return new OnboardingUpdateViewModel(firmwareUpdateService, batteryService);
    }
}
