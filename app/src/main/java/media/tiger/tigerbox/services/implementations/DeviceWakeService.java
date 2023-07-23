package media.tiger.tigerbox.services.implementations;

import android.os.PowerManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.interfaces.WakeService;

/* compiled from: DeviceWakeService.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/DeviceWakeService;", "Lmedia/tiger/tigerbox/services/interfaces/WakeService;", "powerManager", "Landroid/os/PowerManager;", "(Landroid/os/PowerManager;)V", "hasPartialWakeLock", "", "getHasPartialWakeLock", "()Z", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "addPartialWakeLock", "", "keepAlive", "min", "", "removePartialWakeLock", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceWakeService implements WakeService {
    private final PowerManager powerManager;
    private PowerManager.WakeLock wakeLock;

    public DeviceWakeService(PowerManager powerManager) {
        Intrinsics.checkNotNullParameter(powerManager, "powerManager");
        this.powerManager = powerManager;
    }

    @Override // media.tiger.tigerbox.services.interfaces.WakeService
    public void keepAlive(int i) {
        this.powerManager.newWakeLock(1, "TigerBox::KeepAlive").acquire(i * 60 * 1000);
    }

    @Override // media.tiger.tigerbox.services.interfaces.WakeService
    public void addPartialWakeLock() {
        if (this.wakeLock == null) {
            PowerManager.WakeLock newWakeLock = this.powerManager.newWakeLock(1, "TigerBox:wakeLock");
            this.wakeLock = newWakeLock;
            if (newWakeLock != null) {
                newWakeLock.acquire(2147483647L);
            }
        }
    }

    @Override // media.tiger.tigerbox.services.interfaces.WakeService
    public void removePartialWakeLock() {
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
        this.wakeLock = null;
    }

    @Override // media.tiger.tigerbox.services.interfaces.WakeService
    public boolean getHasPartialWakeLock() {
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null) {
            return wakeLock.isHeld();
        }
        return false;
    }
}
