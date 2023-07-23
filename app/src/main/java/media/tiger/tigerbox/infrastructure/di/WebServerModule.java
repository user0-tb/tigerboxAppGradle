package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import com.tigermedia.tigerbox.mdns.DnsLibrary;
import com.tigermedia.tigerbox.mdns.MulticastDNS;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.LinkedHashMap;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.data.repository.TigerBoxAccountRepository;
import media.tiger.tigerbox.infrastructure.properties.ConfigurationProperties;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;
import media.tiger.tigerbox.services.interfaces.AvailabilityService;
import media.tiger.tigerbox.services.interfaces.MetaDataService;
import media.tiger.tigerbox.services.interfaces.ProductAcquisitionService;
import media.tiger.tigerbox.services.interfaces.StorageService;
import media.tiger.tigerbox.services.interfaces.TimeService;
import media.tiger.tigerbox.services.interfaces.WakeService;
import media.tiger.tigerbox.services.interfaces.audioPlayer.AudioPlayerService;
import media.tiger.tigerbox.services.interfaces.timersController.TimersControllerService;
import media.tiger.tigerbox.webserver.TigerBoxWebServer;
import media.tiger.tigerbox.webserver.WebServer;
import media.tiger.tigerbox.webserver.controller.BaseController;
import media.tiger.tigerbox.webserver.controller.DeviceInfoController;
import media.tiger.tigerbox.webserver.controller.MediaRestController;
import media.tiger.tigerbox.webserver.controller.ProfilesRestController;
import media.tiger.tigerbox.webserver.controller.RestController;

/* compiled from: WebServerModule.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007Jb\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007J`\u0010\"\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002¨\u0006$"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/di/WebServerModule;", "", "()V", "provideMDNSModule", "Lcom/tigermedia/tigerbox/mdns/MulticastDNS;", "provideMediaRestController", "Lmedia/tiger/tigerbox/webserver/controller/MediaRestController;", "webServer", "Lmedia/tiger/tigerbox/webserver/WebServer;", "provideProfilesRestController", "Lmedia/tiger/tigerbox/webserver/controller/ProfilesRestController;", "provideWebServer", "context", "Landroid/content/Context;", "metaDataService", "Lmedia/tiger/tigerbox/services/interfaces/MetaDataService;", "availabilityService", "Lmedia/tiger/tigerbox/services/interfaces/AvailabilityService;", "audioPlayerService", "Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/AudioPlayerService;", "audioProductAcquisitionService", "Lmedia/tiger/tigerbox/services/interfaces/ProductAcquisitionService;", "wakeService", "Lmedia/tiger/tigerbox/services/interfaces/WakeService;", "storageService", "Lmedia/tiger/tigerbox/services/interfaces/StorageService;", "configurationProperties", "Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties;", "timeLimitController", "Lmedia/tiger/tigerbox/services/interfaces/timersController/TimersControllerService;", "accountRepository", "Lmedia/tiger/tigerbox/data/repository/TigerBoxAccountRepository;", "timeService", "Lmedia/tiger/tigerbox/services/interfaces/TimeService;", "registerControllers", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Module
/* loaded from: classes3.dex */
public final class WebServerModule {
    public static final WebServerModule INSTANCE = new WebServerModule();

    private WebServerModule() {
    }

    @Provides
    public final MediaRestController provideMediaRestController(WebServer webServer) {
        Intrinsics.checkNotNullParameter(webServer, "webServer");
        RestController controller = webServer.getController("MediaRestController");
        if (controller == null) {
            throw new IllegalStateException("MediaRestController has to be initialised");
        }
        return (MediaRestController) controller;
    }

    @Provides
    public final ProfilesRestController provideProfilesRestController(WebServer webServer) {
        Intrinsics.checkNotNullParameter(webServer, "webServer");
        RestController controller = webServer.getController("ProfilesRestController");
        if (controller == null) {
            throw new IllegalStateException("ProfilesRestController has to be initialised");
        }
        return (ProfilesRestController) controller;
    }

    @Provides
    @Singleton
    public final WebServer provideWebServer(@ApplicationContext Context context, MetaDataService metaDataService, AvailabilityService availabilityService, AudioPlayerService audioPlayerService, ProductAcquisitionService audioProductAcquisitionService, WakeService wakeService, StorageService storageService, ConfigurationProperties configurationProperties, TimersControllerService timeLimitController, TigerBoxAccountRepository accountRepository, TimeService timeService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(metaDataService, "metaDataService");
        Intrinsics.checkNotNullParameter(availabilityService, "availabilityService");
        Intrinsics.checkNotNullParameter(audioPlayerService, "audioPlayerService");
        Intrinsics.checkNotNullParameter(audioProductAcquisitionService, "audioProductAcquisitionService");
        Intrinsics.checkNotNullParameter(wakeService, "wakeService");
        Intrinsics.checkNotNullParameter(storageService, "storageService");
        Intrinsics.checkNotNullParameter(configurationProperties, "configurationProperties");
        Intrinsics.checkNotNullParameter(timeLimitController, "timeLimitController");
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(timeService, "timeService");
        TigerBoxWebServer tigerBoxWebServer = new TigerBoxWebServer(context, Integer.parseInt(configurationProperties.getProperty("webserver.port")), storageService, metaDataService);
        registerControllers(tigerBoxWebServer, metaDataService, availabilityService, audioPlayerService, audioProductAcquisitionService, wakeService, configurationProperties, timeLimitController, accountRepository, storageService, timeService);
        return tigerBoxWebServer;
    }

    private final void registerControllers(WebServer webServer, MetaDataService metaDataService, AvailabilityService availabilityService, AudioPlayerService audioPlayerService, ProductAcquisitionService productAcquisitionService, WakeService wakeService, ConfigurationProperties configurationProperties, TimersControllerService timersControllerService, TigerBoxAccountRepository tigerBoxAccountRepository, StorageService storageService, TimeService timeService) {
        new MediaRestController("/media", webServer, availabilityService, audioPlayerService, productAcquisitionService, new LinkedHashMap());
        new ProfilesRestController("/profiles", webServer, tigerBoxAccountRepository, metaDataService, new LinkedHashMap());
        new DeviceInfoController("/deviceInfo", webServer, metaDataService);
        new BaseController(DownloadsManager.FOLDERS_SEPARATOR, webServer, wakeService, configurationProperties, metaDataService);
    }

    @Provides
    @Singleton
    public final MulticastDNS provideMDNSModule() {
        return new DnsLibrary();
    }
}
