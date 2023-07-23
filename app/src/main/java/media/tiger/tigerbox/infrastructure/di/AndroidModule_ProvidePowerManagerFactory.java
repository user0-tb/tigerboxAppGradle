package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import android.os.PowerManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class AndroidModule_ProvidePowerManagerFactory implements Factory<PowerManager> {
    private final Provider<Context> contextProvider;

    public AndroidModule_ProvidePowerManagerFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public PowerManager get() {
        return providePowerManager(this.contextProvider.get());
    }

    public static AndroidModule_ProvidePowerManagerFactory create(Provider<Context> contextProvider) {
        return new AndroidModule_ProvidePowerManagerFactory(contextProvider);
    }

    public static PowerManager providePowerManager(Context context) {
        return (PowerManager) Preconditions.checkNotNullFromProvides(AndroidModule.INSTANCE.providePowerManager(context));
    }
}
