package media.tiger.tigerbox.ui.main.card;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* loaded from: classes4.dex */
public final class TigerTicketInputPinViewModel_HiltModules {
    private TigerTicketInputPinViewModel_HiltModules() {
    }

    @Module
    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("media.tiger.tigerbox.ui.main.card.TigerTicketInputPinViewModel")
        public abstract ViewModel binds(TigerTicketInputPinViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    /* loaded from: classes4.dex */
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "media.tiger.tigerbox.ui.main.card.TigerTicketInputPinViewModel";
        }

        private KeyModule() {
        }
    }
}
