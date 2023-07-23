package media.tiger.tigerbox.ui.onboarding.step3;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.onboarding.step3.OnboardingUpdateViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class OnboardingUpdateViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static OnboardingUpdateViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(OnboardingUpdateViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final OnboardingUpdateViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OnboardingUpdateViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
