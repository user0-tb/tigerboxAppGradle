package media.tiger.tigerbox.ui.onboarding.step1;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1ViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class OnboardingStep1Screen1ViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static OnboardingStep1Screen1ViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(OnboardingStep1Screen1ViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final OnboardingStep1Screen1ViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OnboardingStep1Screen1ViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
