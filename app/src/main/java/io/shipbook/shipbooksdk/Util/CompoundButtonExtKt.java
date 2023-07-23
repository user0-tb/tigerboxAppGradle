package io.shipbook.shipbooksdk.Util;

import android.widget.CompoundButton;
import io.shipbook.shipbooksdk.InnerLog;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompoundButtonExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"onCheckedChangeListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "Landroid/widget/CompoundButton;", "getOnCheckedChangeListener", "(Landroid/widget/CompoundButton;)Landroid/widget/CompoundButton$OnCheckedChangeListener;", "shipbooksdk_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompoundButtonExtKt {
    public static final CompoundButton.OnCheckedChangeListener getOnCheckedChangeListener(CompoundButton compoundButton) {
        Intrinsics.checkNotNullParameter(compoundButton, "<this>");
        try {
            Field declaredField = Class.forName("android.widget.CompoundButton").getDeclaredField("mOnCheckedChangeListener");
            Intrinsics.checkNotNullExpressionValue(declaredField, "forName(viewStr).getDecl…OnCheckedChangeListener\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(compoundButton);
            if (obj instanceof CompoundButton.OnCheckedChangeListener) {
                return (CompoundButton.OnCheckedChangeListener) obj;
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
