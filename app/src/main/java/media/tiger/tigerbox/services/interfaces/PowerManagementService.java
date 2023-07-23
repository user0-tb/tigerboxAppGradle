package media.tiger.tigerbox.services.interfaces;

import kotlin.Metadata;
import kotlin.Unit;
import media.tiger.tigerbox.services.implementations.DisplayService;

/* compiled from: PowerManagementService.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/PowerManagementService;", "Lmedia/tiger/tigerbox/services/interfaces/HardwareEventSubscriber;", "Lmedia/tiger/tigerbox/services/implementations/DisplayService$DisplayState;", "", "reboot", "shutDown", "startListeningForPowerRelatedChanges", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PowerManagementService extends HardwareEventSubscriber<DisplayService.DisplayState, Unit> {
    void reboot();

    void shutDown();

    void startListeningForPowerRelatedChanges();
}
