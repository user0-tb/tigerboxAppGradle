package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.AdbEnabler;

/* loaded from: classes3.dex */
public final class ProcessModule_ProvideAdbEnablerFactory implements Factory<AdbEnabler> {
    private final Provider<Context> contextProvider;

    public ProcessModule_ProvideAdbEnablerFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public AdbEnabler get() {
        return provideAdbEnabler(this.contextProvider.get());
    }

    public static ProcessModule_ProvideAdbEnablerFactory create(Provider<Context> contextProvider) {
        return new ProcessModule_ProvideAdbEnablerFactory(contextProvider);
    }

    public static AdbEnabler provideAdbEnabler(Context context) {
        return (AdbEnabler) Preconditions.checkNotNullFromProvides(ProcessModule.INSTANCE.provideAdbEnabler(context));
    }
}
