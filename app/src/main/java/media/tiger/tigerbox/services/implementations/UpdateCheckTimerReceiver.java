package media.tiger.tigerbox.services.implementations;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateCheckTimer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/UpdateCheckTimerReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateCheckTimerReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static UpdateCheckTimer checkUpdateTimer;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        UpdateCheckTimer updateCheckTimer;
        if (intent != null) {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            Intrinsics.checkNotNullExpressionValue(action, "it.action ?: \"\"");
            if (!Intrinsics.areEqual(action, UpdateCheckTimer.CHECK_UPDATE_TIMER) || (updateCheckTimer = checkUpdateTimer) == null) {
                return;
            }
            updateCheckTimer.handleAction$app_tigerBoxRelease(action, intent);
        }
    }

    /* compiled from: UpdateCheckTimer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/UpdateCheckTimerReceiver$Companion;", "", "()V", "checkUpdateTimer", "Lmedia/tiger/tigerbox/services/implementations/UpdateCheckTimer;", "getCheckUpdateTimer", "()Lmedia/tiger/tigerbox/services/implementations/UpdateCheckTimer;", "setCheckUpdateTimer", "(Lmedia/tiger/tigerbox/services/implementations/UpdateCheckTimer;)V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UpdateCheckTimer getCheckUpdateTimer() {
            return UpdateCheckTimerReceiver.checkUpdateTimer;
        }

        public final void setCheckUpdateTimer(UpdateCheckTimer updateCheckTimer) {
            UpdateCheckTimerReceiver.checkUpdateTimer = updateCheckTimer;
        }
    }
}
