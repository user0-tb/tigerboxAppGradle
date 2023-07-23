package media.tiger.tigerbox.utils;

import android.content.Context;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.text.HtmlCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: ContextUtils.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"getText", "", "Landroid/content/Context;", TtmlNode.ATTR_ID, "", "args", "", "", "(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/CharSequence;", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContextUtilsKt {
    public static final CharSequence getText(Context context, int i, Object... args) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        ArrayList arrayList = new ArrayList(args.length);
        for (Object obj : args) {
            if (obj instanceof String) {
                obj = TextUtils.htmlEncode((String) obj);
            }
            arrayList.add(obj);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String html = HtmlCompat.toHtml(new SpannedString(context.getText(i)), 0);
        Intrinsics.checkNotNullExpressionValue(html, "toHtml(resource, HtmlCom…AGRAPH_LINES_CONSECUTIVE)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] copyOf = Arrays.copyOf(array, array.length);
        String format = String.format(html, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        Spanned fromHtml = HtmlCompat.fromHtml(format, 0);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(formattedHtml, …at.FROM_HTML_MODE_LEGACY)");
        return fromHtml;
    }
}
