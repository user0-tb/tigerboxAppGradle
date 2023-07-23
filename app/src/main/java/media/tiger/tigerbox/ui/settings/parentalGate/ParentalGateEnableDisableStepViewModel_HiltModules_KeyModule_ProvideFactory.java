package media.tiger.tigerbox.ui.settings.parentalGate;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.settings.parentalGate.ParentalGateEnableDisableStepViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class ParentalGateEnableDisableStepViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static ParentalGateEnableDisableStepViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(ParentalGateEnableDisableStepViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final ParentalGateEnableDisableStepViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ParentalGateEnableDisableStepViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
