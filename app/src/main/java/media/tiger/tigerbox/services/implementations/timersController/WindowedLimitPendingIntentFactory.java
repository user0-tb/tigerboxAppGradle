package media.tiger.tigerbox.services.implementations.timersController;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.PendingIntentFactory;
import media.tiger.tigerbox.services.implementations.receiver.WindowedLimitBroadcastReceiver;

/* compiled from: WindowedLimitTimer.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/timersController/WindowedLimitPendingIntentFactory;", "Lmedia/tiger/tigerbox/services/implementations/PendingIntentFactory;", "()V", "makePendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "action", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WindowedLimitPendingIntentFactory implements PendingIntentFactory {
    public static final WindowedLimitPendingIntentFactory INSTANCE = new WindowedLimitPendingIntentFactory();

    private WindowedLimitPendingIntentFactory() {
    }

    @Override // media.tiger.tigerbox.services.implementations.PendingIntentFactory
    public PendingIntent makePendingIntent(Context context, String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Intent intent = new Intent(context, WindowedLimitBroadcastReceiver.class);
        intent.setAction(action);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, C.BUFFER_FLAG_FIRST_SAMPLE);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(context, 0,…tent.FLAG_UPDATE_CURRENT)");
        return broadcast;
    }
}
