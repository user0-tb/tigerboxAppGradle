package media.tiger.tigerbox.ui.settings.wildcardreassigning;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.settings.wildcardreassigning.WildCardReAssigningStep1ViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class WildCardReAssigningStep1ViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static WildCardReAssigningStep1ViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(WildCardReAssigningStep1ViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final WildCardReAssigningStep1ViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new WildCardReAssigningStep1ViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
