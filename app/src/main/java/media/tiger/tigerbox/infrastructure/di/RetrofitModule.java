package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.data.network.ApiResponseAdapterFactory;
import media.tiger.tigerbox.data.network.DownloadsWebService;
import media.tiger.tigerbox.data.network.OtaWebService;
import media.tiger.tigerbox.data.network.ScalarTigerBoxWebService;
import media.tiger.tigerbox.data.network.TigerBoxWebService;
import media.tiger.tigerbox.infrastructure.functional.DownloadProgressUpdate;
import media.tiger.tigerbox.infrastructure.properties.ConfigurationProperties;
import media.tiger.tigerbox.services.implementations.DownloadProgressNotificationService;
import media.tiger.tigerbox.ui.onboarding.ReauthenticationLoginHandler;
import media.tiger.tigerbox.ui.onboarding.step3.security.DigestValidator;
import media.tiger.tigerbox.ui.onboarding.step3.security.FileDigestValidator;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* compiled from: RetrofitModule.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u001a\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u001a\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u001a"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/di/RetrofitModule;", "", "()V", "provideDownloadProgressNotifier", "Lmedia/tiger/tigerbox/infrastructure/functional/DownloadProgressUpdate;", "provideDownloadsWebService", "Lmedia/tiger/tigerbox/data/network/DownloadsWebService;", "downloadsOkHttpClient", "Lokhttp3/OkHttpClient;", "configurationProperties", "Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties;", "provideOpenLoginScreen", "Lmedia/tiger/tigerbox/ui/onboarding/ReauthenticationLoginHandler;", "context", "Landroid/content/Context;", "provideOtaWebService", "Lmedia/tiger/tigerbox/data/network/OtaWebService;", "otaWebServiceOkHttpClient", "provideScalarTigerBoxService", "Lmedia/tiger/tigerbox/data/network/ScalarTigerBoxWebService;", "okHttpClient", "provideSignatureValidator", "Lmedia/tiger/tigerbox/ui/onboarding/step3/security/DigestValidator;", "provideTigerBoxService", "Lmedia/tiger/tigerbox/data/network/TigerBoxWebService;", "authOkHttpClient", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Module
/* loaded from: classes3.dex */
public final class RetrofitModule {
    public static final RetrofitModule INSTANCE = new RetrofitModule();

    private RetrofitModule() {
    }

    @Provides
    @Singleton
    public final TigerBoxWebService provideTigerBoxService(OkHttpClient authOkHttpClient, ConfigurationProperties configurationProperties) {
        Intrinsics.checkNotNullParameter(authOkHttpClient, "authOkHttpClient");
        Intrinsics.checkNotNullParameter(configurationProperties, "configurationProperties");
        Object create = new Retrofit.Builder().baseUrl(configurationProperties.getProperty("rest.url")).addCallAdapterFactory(new ApiResponseAdapterFactory()).addConverterFactory(GsonConverterFactory.create()).client(authOkHttpClient).build().create(TigerBoxWebService.class);
        Intrinsics.checkNotNullExpressionValue(create, "Builder()\n            .b…oxWebService::class.java)");
        return (TigerBoxWebService) create;
    }

    @Provides
    @Singleton
    public final ScalarTigerBoxWebService provideScalarTigerBoxService(OkHttpClient okHttpClient, ConfigurationProperties configurationProperties) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(configurationProperties, "configurationProperties");
        Object create = new Retrofit.Builder().baseUrl(configurationProperties.getProperty("rest.url")).addCallAdapterFactory(new ApiResponseAdapterFactory()).addConverterFactory(ScalarsConverterFactory.create()).client(okHttpClient).build().create(ScalarTigerBoxWebService.class);
        Intrinsics.checkNotNullExpressionValue(create, "Builder()\n            .b…oxWebService::class.java)");
        return (ScalarTigerBoxWebService) create;
    }

    @Provides
    @Singleton
    public final OtaWebService provideOtaWebService(OkHttpClient otaWebServiceOkHttpClient, ConfigurationProperties configurationProperties) {
        Intrinsics.checkNotNullParameter(otaWebServiceOkHttpClient, "otaWebServiceOkHttpClient");
        Intrinsics.checkNotNullParameter(configurationProperties, "configurationProperties");
        Object create = new Retrofit.Builder().baseUrl(configurationProperties.getProperty("ota.url")).addCallAdapterFactory(new ApiResponseAdapterFactory()).addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create())).client(otaWebServiceOkHttpClient).build().create(OtaWebService.class);
        Intrinsics.checkNotNullExpressionValue(create, "Builder()\n            .b…taWebService::class.java)");
        return (OtaWebService) create;
    }

    @Provides
    @Singleton
    public final DownloadsWebService provideDownloadsWebService(OkHttpClient downloadsOkHttpClient, ConfigurationProperties configurationProperties) {
        Intrinsics.checkNotNullParameter(downloadsOkHttpClient, "downloadsOkHttpClient");
        Intrinsics.checkNotNullParameter(configurationProperties, "configurationProperties");
        Object create = new Retrofit.Builder().baseUrl(configurationProperties.getProperty("rest.url")).addCallAdapterFactory(new ApiResponseAdapterFactory()).addConverterFactory(GsonConverterFactory.create()).client(downloadsOkHttpClient).build().create(DownloadsWebService.class);
        Intrinsics.checkNotNullExpressionValue(create, "Builder()\n            .b…dsWebService::class.java)");
        return (DownloadsWebService) create;
    }

    @Provides
    @Singleton
    public final DownloadProgressUpdate provideDownloadProgressNotifier() {
        return DownloadProgressNotificationService.INSTANCE;
    }

    @Provides
    @Singleton
    public final ReauthenticationLoginHandler provideOpenLoginScreen(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReauthenticationLoginHandler(context);
    }

    @Provides
    @Singleton
    public final DigestValidator provideSignatureValidator() {
        return FileDigestValidator.INSTANCE;
    }
}
