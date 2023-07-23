package media.tiger.tigerbox.ui.onboarding.step2;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.onboarding.step2.OnboardingWifiViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class OnboardingWifiViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static OnboardingWifiViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(OnboardingWifiViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final OnboardingWifiViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OnboardingWifiViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
