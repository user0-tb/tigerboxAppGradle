package media.tiger.tigerbox.services.implementations;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NightLightTimer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/NightLightTimerReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NightLightTimerReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static NightLightTimer nightLightTimer;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NightLightTimer nightLightTimer2;
        if (intent != null) {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            Intrinsics.checkNotNullExpressionValue(action, "it.action ?: \"\"");
            if ((Intrinsics.areEqual(action, NightLightTimer.NIGHT_LIGHT_ON) || Intrinsics.areEqual(action, NightLightTimer.NIGHT_LIGHT_OFF)) && (nightLightTimer2 = nightLightTimer) != null) {
                nightLightTimer2.handleAction$app_tigerBoxRelease(action, intent);
            }
        }
    }

    /* compiled from: NightLightTimer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/NightLightTimerReceiver$Companion;", "", "()V", "nightLightTimer", "Lmedia/tiger/tigerbox/services/implementations/NightLightTimer;", "getNightLightTimer", "()Lmedia/tiger/tigerbox/services/implementations/NightLightTimer;", "setNightLightTimer", "(Lmedia/tiger/tigerbox/services/implementations/NightLightTimer;)V", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NightLightTimer getNightLightTimer() {
            return NightLightTimerReceiver.nightLightTimer;
        }

        public final void setNightLightTimer(NightLightTimer nightLightTimer) {
            NightLightTimerReceiver.nightLightTimer = nightLightTimer;
        }
    }
}
