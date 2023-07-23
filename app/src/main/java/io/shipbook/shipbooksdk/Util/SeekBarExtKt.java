package io.shipbook.shipbooksdk.Util;

import android.widget.SeekBar;
import io.shipbook.shipbooksdk.InnerLog;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SeekBarExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"onSeekBarChangeListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "getOnSeekBarChangeListener", "(Landroid/widget/SeekBar;)Landroid/widget/SeekBar$OnSeekBarChangeListener;", "shipbooksdk_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeekBarExtKt {
    public static final SeekBar.OnSeekBarChangeListener getOnSeekBarChangeListener(SeekBar seekBar) {
        Intrinsics.checkNotNullParameter(seekBar, "<this>");
        try {
            Field declaredField = Class.forName("android.widget.SeekBar").getDeclaredField("mOnSeekBarChangeListener");
            Intrinsics.checkNotNullExpressionValue(declaredField, "forName(viewStr).getDecl…OnSeekBarChangeListener\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(seekBar);
            if (obj instanceof SeekBar.OnSeekBarChangeListener) {
                return (SeekBar.OnSeekBarChangeListener) obj;
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
