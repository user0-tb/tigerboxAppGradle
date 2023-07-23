package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import media.tiger.tigerbox.RestartServicesSafely;

/* loaded from: classes3.dex */
public final class ProcessModule_ProvideRestartServicesSafelyFactory implements Factory<RestartServicesSafely> {
    private final Provider<Context> contextProvider;

    public ProcessModule_ProvideRestartServicesSafelyFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public RestartServicesSafely get() {
        return provideRestartServicesSafely(this.contextProvider.get());
    }

    public static ProcessModule_ProvideRestartServicesSafelyFactory create(Provider<Context> contextProvider) {
        return new ProcessModule_ProvideRestartServicesSafelyFactory(contextProvider);
    }

    public static RestartServicesSafely provideRestartServicesSafely(Context context) {
        return (RestartServicesSafely) Preconditions.checkNotNullFromProvides(ProcessModule.INSTANCE.provideRestartServicesSafely(context));
    }
}
