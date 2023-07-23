package media.tiger.tigerbox;

import android.content.Context;
import android.widget.Toast;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerBoxApplication.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"showToast", "", "Landroid/content/Context;", "text", "", SessionDescription.ATTR_LENGTH, "", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerBoxApplicationKt {
    public static /* synthetic */ void showToast$default(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        showToast(context, str, i);
    }

    public static final void showToast(Context context, String text, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type media.tiger.tigerbox.TigerBoxApplication");
        if (((TigerBoxApplication) applicationContext).getAllowToast()) {
            Toast.makeText(context, text, i).show();
        }
    }
}
