package media.tiger.tigerbox.ui.settings.timersSetup;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupWindowSetupViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class TimersSetupWindowSetupViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static TimersSetupWindowSetupViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(TimersSetupWindowSetupViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final TimersSetupWindowSetupViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TimersSetupWindowSetupViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
