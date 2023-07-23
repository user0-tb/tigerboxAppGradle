package media.tiger.tigerbox.ui.settings;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.settings.FullScreenSeekBarViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class FullScreenSeekBarViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static FullScreenSeekBarViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(FullScreenSeekBarViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final FullScreenSeekBarViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new FullScreenSeekBarViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
