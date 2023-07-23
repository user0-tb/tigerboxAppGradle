package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import android.hardware.display.DisplayManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class AndroidModule_ProvideDisplayManagerFactory implements Factory<DisplayManager> {
    private final Provider<Context> contextProvider;

    public AndroidModule_ProvideDisplayManagerFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public DisplayManager get() {
        return provideDisplayManager(this.contextProvider.get());
    }

    public static AndroidModule_ProvideDisplayManagerFactory create(Provider<Context> contextProvider) {
        return new AndroidModule_ProvideDisplayManagerFactory(contextProvider);
    }

    public static DisplayManager provideDisplayManager(Context context) {
        return (DisplayManager) Preconditions.checkNotNullFromProvides(AndroidModule.INSTANCE.provideDisplayManager(context));
    }
}
