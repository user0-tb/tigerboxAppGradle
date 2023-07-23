package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.infrastructure.properties.ConfigurationProperties;

/* compiled from: ConfigurationPropertiesModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/di/ConfigurationPropertiesModule;", "", "()V", "provideConfigurationProperties", "Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties;", "appContext", "Landroid/content/Context;", "sharedPreferences", "Landroid/content/SharedPreferences;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Module
/* loaded from: classes3.dex */
public final class ConfigurationPropertiesModule {
    public static final ConfigurationPropertiesModule INSTANCE = new ConfigurationPropertiesModule();

    private ConfigurationPropertiesModule() {
    }

    @Provides
    @Singleton
    public final ConfigurationProperties provideConfigurationProperties(@ApplicationContext Context appContext, SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new ConfigurationProperties(appContext, ConfigurationProperties.ConfigurationEnvironment.PRODUCTION, sharedPreferences);
    }
}
