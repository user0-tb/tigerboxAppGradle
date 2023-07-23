package media.tiger.tigerbox.ui.settings.timersSetup;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* loaded from: classes4.dex */
public final class TimersSetupViewModel_HiltModules {
    private TimersSetupViewModel_HiltModules() {
    }

    @Module
    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupViewModel")
        public abstract ViewModel binds(TimersSetupViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    /* loaded from: classes4.dex */
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupViewModel";
        }

        private KeyModule() {
        }
    }
}
