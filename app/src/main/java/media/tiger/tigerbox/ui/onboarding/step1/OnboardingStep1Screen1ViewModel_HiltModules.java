package media.tiger.tigerbox.ui.onboarding.step1;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

/* loaded from: classes4.dex */
public final class OnboardingStep1Screen1ViewModel_HiltModules {
    private OnboardingStep1Screen1ViewModel_HiltModules() {
    }

    @Module
    /* loaded from: classes4.dex */
    public static abstract class BindsModule {
        @Binds
        @IntoMap
        @StringKey("media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1ViewModel")
        public abstract ViewModel binds(OnboardingStep1Screen1ViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    /* loaded from: classes4.dex */
    public static final class KeyModule {
        @Provides
        @IntoSet
        public static String provide() {
            return "media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1ViewModel";
        }

        private KeyModule() {
        }
    }
}
