package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import media.tiger.tigerbox.infrastructure.properties.ConfigurationProperties;

/* loaded from: classes3.dex */
public final class ConfigurationPropertiesModule_ProvideConfigurationPropertiesFactory implements Factory<ConfigurationProperties> {
    private final Provider<Context> appContextProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ConfigurationPropertiesModule_ProvideConfigurationPropertiesFactory(Provider<Context> appContextProvider, Provider<SharedPreferences> sharedPreferencesProvider) {
        this.appContextProvider = appContextProvider;
        this.sharedPreferencesProvider = sharedPreferencesProvider;
    }

    @Override // javax.inject.Provider
    public ConfigurationProperties get() {
        return provideConfigurationProperties(this.appContextProvider.get(), this.sharedPreferencesProvider.get());
    }

    public static ConfigurationPropertiesModule_ProvideConfigurationPropertiesFactory create(Provider<Context> appContextProvider, Provider<SharedPreferences> sharedPreferencesProvider) {
        return new ConfigurationPropertiesModule_ProvideConfigurationPropertiesFactory(appContextProvider, sharedPreferencesProvider);
    }

    public static ConfigurationProperties provideConfigurationProperties(Context appContext, SharedPreferences sharedPreferences) {
        return (ConfigurationProperties) Preconditions.checkNotNullFromProvides(ConfigurationPropertiesModule.INSTANCE.provideConfigurationProperties(appContext, sharedPreferences));
    }
}
