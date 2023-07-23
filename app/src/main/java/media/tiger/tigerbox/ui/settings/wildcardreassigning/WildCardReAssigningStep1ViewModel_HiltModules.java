package media.tiger.tigerbox.ui.settings.wildcardreassigning;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* loaded from: classes4.dex */
public final class WildCardReAssigningStep1ViewModel_HiltModules {
    private WildCardReAssigningStep1ViewModel_HiltModules() {
    }

    @Module
    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("media.tiger.tigerbox.ui.settings.wildcardreassigning.WildCardReAssigningStep1ViewModel")
        public abstract ViewModel binds(WildCardReAssigningStep1ViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    /* loaded from: classes4.dex */
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "media.tiger.tigerbox.ui.settings.wildcardreassigning.WildCardReAssigningStep1ViewModel";
        }

        private KeyModule() {
        }
    }
}
