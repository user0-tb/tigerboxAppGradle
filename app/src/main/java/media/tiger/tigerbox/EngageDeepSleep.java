package media.tiger.tigerbox;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: EngageDeepSleep.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0086\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/EngageDeepSleep;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "", "turnOffNfc", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EngageDeepSleep {
    public static final Companion Companion = new Companion(null);
    private static final String NFC_OFF_INTENT = "tigerbox_nfc_off";
    private final Context context;

    public EngageDeepSleep(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void invoke() {
        turnOffNfc();
    }

    private final void turnOffNfc() {
        try {
            Timber.Forest.d("Deep sleep: Turn off NFC", new Object[0]);
            this.context.sendBroadcast(new Intent(NFC_OFF_INTENT));
        } catch (Exception e) {
            Timber.Forest forest = Timber.Forest;
            forest.e("EngageDeepSleep: EXCEPTION " + e, new Object[0]);
        }
    }

    /* compiled from: EngageDeepSleep.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/EngageDeepSleep$Companion;", "", "()V", "NFC_OFF_INTENT", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
