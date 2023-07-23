package media.tiger.tigerbox.ui.common.wifi;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.common.wifi.WifiEnterPasswordViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class WifiEnterPasswordViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static WifiEnterPasswordViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(WifiEnterPasswordViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final WifiEnterPasswordViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new WifiEnterPasswordViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
