package media.tiger.tigerbox.ui.onboarding.step4;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* loaded from: classes4.dex */
public final class OnboardingBackendCommunicationViewModel_HiltModules {
    private OnboardingBackendCommunicationViewModel_HiltModules() {
    }

    @Module
    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendCommunicationViewModel")
        public abstract ViewModel binds(OnboardingBackendCommunicationViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    /* loaded from: classes4.dex */
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendCommunicationViewModel";
        }

        private KeyModule() {
        }
    }
}
