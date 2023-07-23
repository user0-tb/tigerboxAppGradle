package media.tiger.tigerbox.ui.onboarding.step4;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendCommunicationViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class OnboardingBackendCommunicationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static OnboardingBackendCommunicationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(OnboardingBackendCommunicationViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final OnboardingBackendCommunicationViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OnboardingBackendCommunicationViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
