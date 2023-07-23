package media.tiger.tigerbox.ui;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.TigerBoxActivityViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class TigerBoxActivityViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static TigerBoxActivityViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(TigerBoxActivityViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final TigerBoxActivityViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new TigerBoxActivityViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
