package media.tiger.tigerbox.ui.onboarding;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.services.interfaces.TigerButtonLightEvent;
import media.tiger.tigerbox.services.interfaces.TigerButtonLightEventKt;
import media.tiger.tigerbox.services.interfaces.WifiService;
import media.tiger.tigerbox.ui.common.BaseViewModel;

/* compiled from: OnboardingActivityViewModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/OnboardingActivityViewModel;", "Lmedia/tiger/tigerbox/ui/common/BaseViewModel;", "wifiService", "Lmedia/tiger/tigerbox/services/interfaces/WifiService;", "lightController", "Lmedia/tiger/tigerbox/services/interfaces/LightControlService;", "(Lmedia/tiger/tigerbox/services/interfaces/WifiService;Lmedia/tiger/tigerbox/services/interfaces/LightControlService;)V", "exitView", "", "isOnline", "", "viewPrepared", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingActivityViewModel extends BaseViewModel {
    private final LightControlService lightController;
    private final WifiService wifiService;

    public final void exitView() {
    }

    @Inject
    public OnboardingActivityViewModel(WifiService wifiService, LightControlService lightController) {
        Intrinsics.checkNotNullParameter(wifiService, "wifiService");
        Intrinsics.checkNotNullParameter(lightController, "lightController");
        this.wifiService = wifiService;
        this.lightController = lightController;
    }

    public final boolean isOnline() {
        return Intrinsics.areEqual((Object) this.wifiService.getOfflineMode().getValue(), (Object) false);
    }

    public final void viewPrepared() {
        this.lightController.addTigerButtonLightEvents(TigerButtonLightEventKt.toBit(TigerButtonLightEvent.OFF));
    }
}
