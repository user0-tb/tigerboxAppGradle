package media.tiger.tigerbox.services.interfaces;

import kotlin.Metadata;

/* compiled from: BatteryService.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/BatteryService;", "", "getBatteryPercent", "", "isCharging", "", "isPlugged", "playBatteryBelow5PercentIfNeeded", "", "subscribeToBatteryChanges", "listener", "Lmedia/tiger/tigerbox/services/interfaces/BatteryChangesListener;", "unsubscribeFromBatteryChanges", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BatteryService {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final float UNKNOWN_BATTERY_LEVEL = -1.0f;

    float getBatteryPercent();

    boolean isCharging();

    boolean isPlugged();

    void playBatteryBelow5PercentIfNeeded();

    void subscribeToBatteryChanges(BatteryChangesListener batteryChangesListener);

    void unsubscribeFromBatteryChanges(BatteryChangesListener batteryChangesListener);

    /* compiled from: BatteryService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/BatteryService$Companion;", "", "()V", "UNKNOWN_BATTERY_LEVEL", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final float UNKNOWN_BATTERY_LEVEL = -1.0f;

        private Companion() {
        }
    }
}
