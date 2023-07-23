package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import android.media.AudioManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class AndroidModule_ProvideAudioManagerFactory implements Factory<AudioManager> {
    private final Provider<Context> contextProvider;

    public AndroidModule_ProvideAudioManagerFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public AudioManager get() {
        return provideAudioManager(this.contextProvider.get());
    }

    public static AndroidModule_ProvideAudioManagerFactory create(Provider<Context> contextProvider) {
        return new AndroidModule_ProvideAudioManagerFactory(contextProvider);
    }

    public static AudioManager provideAudioManager(Context context) {
        return (AudioManager) Preconditions.checkNotNullFromProvides(AndroidModule.INSTANCE.provideAudioManager(context));
    }
}
