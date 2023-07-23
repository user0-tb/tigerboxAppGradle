package media.tiger.tigerbox.services.interfaces;

import kotlin.Metadata;

/* compiled from: WakeService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/WakeService;", "", "hasPartialWakeLock", "", "getHasPartialWakeLock", "()Z", "addPartialWakeLock", "", "keepAlive", "min", "", "removePartialWakeLock", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface WakeService {
    void addPartialWakeLock();

    boolean getHasPartialWakeLock();

    void keepAlive(int i);

    void removePartialWakeLock();
}
