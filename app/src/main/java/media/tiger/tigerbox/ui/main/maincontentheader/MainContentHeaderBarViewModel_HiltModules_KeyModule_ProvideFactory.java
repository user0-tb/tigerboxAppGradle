package media.tiger.tigerbox.ui.main.maincontentheader;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.main.maincontentheader.MainContentHeaderBarViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class MainContentHeaderBarViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static MainContentHeaderBarViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(MainContentHeaderBarViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final MainContentHeaderBarViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MainContentHeaderBarViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
