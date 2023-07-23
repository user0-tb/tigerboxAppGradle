package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import media.tiger.tigerbox.EngageDeepSleep;

/* loaded from: classes3.dex */
public final class ProcessModule_ProvideEngageDeepSleepFactory implements Factory<EngageDeepSleep> {
    private final Provider<Context> contextProvider;

    public ProcessModule_ProvideEngageDeepSleepFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public EngageDeepSleep get() {
        return provideEngageDeepSleep(this.contextProvider.get());
    }

    public static ProcessModule_ProvideEngageDeepSleepFactory create(Provider<Context> contextProvider) {
        return new ProcessModule_ProvideEngageDeepSleepFactory(contextProvider);
    }

    public static EngageDeepSleep provideEngageDeepSleep(Context context) {
        return (EngageDeepSleep) Preconditions.checkNotNullFromProvides(ProcessModule.INSTANCE.provideEngageDeepSleep(context));
    }
}
