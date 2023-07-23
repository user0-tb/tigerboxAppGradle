package media.tiger.tigerbox.ui.common.reset;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.common.reset.ResetInProgressViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class ResetInProgressViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static ResetInProgressViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(ResetInProgressViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final ResetInProgressViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ResetInProgressViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
