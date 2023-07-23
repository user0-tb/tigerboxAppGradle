package media.tiger.tigerbox.ui.onboarding.step4;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class OnboardingBackendResponseViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static OnboardingBackendResponseViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(OnboardingBackendResponseViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final OnboardingBackendResponseViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OnboardingBackendResponseViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
