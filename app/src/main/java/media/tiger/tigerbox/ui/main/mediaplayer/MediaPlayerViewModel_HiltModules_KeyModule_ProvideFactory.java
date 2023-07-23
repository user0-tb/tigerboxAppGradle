package media.tiger.tigerbox.ui.main.mediaplayer;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.main.mediaplayer.MediaPlayerViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class MediaPlayerViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static MediaPlayerViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(MediaPlayerViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final MediaPlayerViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MediaPlayerViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
