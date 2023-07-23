package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.infrastructure.properties.AndroidSystemProperties;

/* loaded from: classes3.dex */
public final class ProcessModule_ProvideAndroidSystemPropertiesFactory implements Factory<AndroidSystemProperties> {
    @Override // javax.inject.Provider
    public AndroidSystemProperties get() {
        return provideAndroidSystemProperties();
    }

    public static ProcessModule_ProvideAndroidSystemPropertiesFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AndroidSystemProperties provideAndroidSystemProperties() {
        return (AndroidSystemProperties) Preconditions.checkNotNullFromProvides(ProcessModule.INSTANCE.provideAndroidSystemProperties());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final ProcessModule_ProvideAndroidSystemPropertiesFactory INSTANCE = new ProcessModule_ProvideAndroidSystemPropertiesFactory();

        private InstanceHolder() {
        }
    }
}
