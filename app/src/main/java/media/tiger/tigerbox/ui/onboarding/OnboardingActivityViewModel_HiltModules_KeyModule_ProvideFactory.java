package media.tiger.tigerbox.ui.onboarding;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.onboarding.OnboardingActivityViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class OnboardingActivityViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static OnboardingActivityViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(OnboardingActivityViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final OnboardingActivityViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OnboardingActivityViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
