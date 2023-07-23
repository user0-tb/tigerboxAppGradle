package io.shipbook.shipbooksdk.Util;

import android.view.View;
import io.shipbook.shipbooksdk.InnerLog;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"onClickListener", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "getOnClickListener", "(Landroid/view/View;)Landroid/view/View$OnClickListener;", "shipbooksdk_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewExtKt {
    public static final View.OnClickListener getOnClickListener(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            Intrinsics.checkNotNullExpressionValue(declaredField, "forName(viewStr).getDeclaredField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            Intrinsics.checkNotNullExpressionValue(declaredField2, "forName(lInfoStr).getDec…Field(\"mOnClickListener\")");
            if (obj != null) {
                Object obj2 = declaredField2.get(obj);
                if (obj2 instanceof View.OnClickListener) {
                    return (View.OnClickListener) obj2;
                }
                return null;
            }
            return null;
        } catch (ClassNotFoundException unused) {
            InnerLog.e$default(InnerLog.INSTANCE, "Reflection", "Class Not Found.", null, 4, null);
            return null;
        } catch (IllegalAccessException unused2) {
            InnerLog.e$default(InnerLog.INSTANCE, "Reflection", "Illegal Access.", null, 4, null);
            return null;
        } catch (NoSuchFieldException unused3) {
            InnerLog.e$default(InnerLog.INSTANCE, "Reflection", "No Such Field.", null, 4, null);
            return null;
        }
    }
}
