package media.tiger.tigerbox.services.implementations.timersController;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimersController.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isInLockedMode", "", "Lmedia/tiger/tigerbox/services/implementations/timersController/LockedModeReason;", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimersControllerKt {
    public static final boolean isInLockedMode(LockedModeReason lockedModeReason) {
        Intrinsics.checkNotNullParameter(lockedModeReason, "<this>");
        return lockedModeReason != LockedModeReason.NONE;
    }
}
