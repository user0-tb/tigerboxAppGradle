package media.tiger.tigerbox.ui.settings;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.interfaces.HeaderProvider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.services.interfaces.MetaDataService;
import media.tiger.tigerbox.services.interfaces.StorageService;
import media.tiger.tigerbox.services.interfaces.timersController.ShutDownTimerService;
import media.tiger.tigerbox.ui.common.FullScreenViewModel;

/* compiled from: FullScreenSeekBarViewModel.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\u000e\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R$\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R$\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010\u0013R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/FullScreenSeekBarViewModel;", "Lmedia/tiger/tigerbox/ui/common/FullScreenViewModel;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "headerProvider", "Lmedia/tiger/tigerbox/services/interfaces/HeaderProvider;", "lightControl", "Lmedia/tiger/tigerbox/services/interfaces/LightControlService;", "metaDataService", "Lmedia/tiger/tigerbox/services/interfaces/MetaDataService;", "shutDownTimerService", "Lmedia/tiger/tigerbox/services/interfaces/timersController/ShutDownTimerService;", "storageService", "Lmedia/tiger/tigerbox/services/interfaces/StorageService;", "(Lmedia/tiger/tigerbox/services/implementations/ButtonService;Lmedia/tiger/tigerbox/services/interfaces/HeaderProvider;Lmedia/tiger/tigerbox/services/interfaces/LightControlService;Lmedia/tiger/tigerbox/services/interfaces/MetaDataService;Lmedia/tiger/tigerbox/services/interfaces/timersController/ShutDownTimerService;Lmedia/tiger/tigerbox/services/interfaces/StorageService;)V", "value", "", "lightControlServiceTigerLightIntensity", "getLightControlServiceTigerLightIntensity", "()I", "setLightControlServiceTigerLightIntensity", "(I)V", "metadataServiceMaxVolume", "getMetadataServiceMaxVolume", "metadataServiceScreenBrightness", "getMetadataServiceScreenBrightness", "setMetadataServiceScreenBrightness", "metadataServiceVolume", "getMetadataServiceVolume", "setMetadataServiceVolume", "shutDownTimerServiceAtEndOfProduct", "", "getShutDownTimerServiceAtEndOfProduct", "()Z", "shutDownTimerServiceCurrentShutDownTimeSeconds", "getShutDownTimerServiceCurrentShutDownTimeSeconds", "storageServiceVolume", "", "getStorageServiceVolume", "()F", "shutDownTimerServiceAtEndOfPlayback", "", "shutDownTimerServiceCancelTimer", "shutDownTimerServiceStartTimer", "sleepTimeSeconds", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullScreenSeekBarViewModel extends FullScreenViewModel {
    private final LightControlService lightControl;
    private final MetaDataService metaDataService;
    private final ShutDownTimerService shutDownTimerService;
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public FullScreenSeekBarViewModel(ButtonService buttonService, HeaderProvider headerProvider, LightControlService lightControl, MetaDataService metaDataService, ShutDownTimerService shutDownTimerService, StorageService storageService) {
        super(buttonService, headerProvider);
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(lightControl, "lightControl");
        Intrinsics.checkNotNullParameter(metaDataService, "metaDataService");
        Intrinsics.checkNotNullParameter(shutDownTimerService, "shutDownTimerService");
        Intrinsics.checkNotNullParameter(storageService, "storageService");
        this.lightControl = lightControl;
        this.metaDataService = metaDataService;
        this.shutDownTimerService = shutDownTimerService;
        this.storageService = storageService;
    }

    public final void shutDownTimerServiceAtEndOfPlayback() {
        this.shutDownTimerService.shutDownAtTheEndOfPlayback();
    }

    public final void shutDownTimerServiceCancelTimer() {
        this.shutDownTimerService.cancelTimer();
    }

    public final void shutDownTimerServiceStartTimer(int i) {
        this.shutDownTimerService.startTimer(i);
    }

    public final int getShutDownTimerServiceCurrentShutDownTimeSeconds() {
        return this.shutDownTimerService.getCurrentShutDownTimeSeconds();
    }

    public final boolean getShutDownTimerServiceAtEndOfProduct() {
        return this.shutDownTimerService.getCurrentShutDownTimeSeconds() == -1;
    }

    public final int getMetadataServiceMaxVolume() {
        return this.metaDataService.getMaxVolume();
    }

    public final void setMetadataServiceScreenBrightness(int i) {
        this.metaDataService.setScreenBrightness(i);
    }

    public final int getMetadataServiceScreenBrightness() {
        return this.metaDataService.getScreenBrightness();
    }

    public final void setMetadataServiceVolume(int i) {
        this.metaDataService.setVolume(i);
    }

    public final int getMetadataServiceVolume() {
        return this.metaDataService.getVolume();
    }

    public final void setLightControlServiceTigerLightIntensity(int i) {
        this.lightControl.setTigerLightIntensity(i);
    }

    public final int getLightControlServiceTigerLightIntensity() {
        return this.lightControl.getTigerLightIntensity();
    }

    public final float getStorageServiceVolume() {
        return this.storageService.getVolume(0.4f);
    }
}
