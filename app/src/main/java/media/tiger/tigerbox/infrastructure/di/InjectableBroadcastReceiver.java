package media.tiger.tigerbox.infrastructure.di;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: InjectableBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0004J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017¨\u0006\f"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/di/InjectableBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "log", "", "message", "", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InjectableBroadcastReceiver extends BroadcastReceiver {
    public InjectableBroadcastReceiver() {
        log("BroadcastReceiver initiated");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("onReceive: intent is ");
        sb.append(intent == null ? "NULL" : "not null");
        log(sb.toString());
        if (intent != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("    --> action is ");
            sb2.append(intent.getAction() != null ? intent.getAction() : "NULL");
            log(sb2.toString());
        }
    }

    protected final void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Timber.Forest forest = Timber.Forest;
        forest.d(getClass().getSimpleName() + ": " + message, new Object[0]);
    }
}
