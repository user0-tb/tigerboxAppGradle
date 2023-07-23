package media.tiger.tigerbox.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListUtils.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a$\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b¨\u0006\t"}, d2 = {"prepend", "", ExifInterface.GPS_DIRECTION_TRUE, "", "element", "(Ljava/util/List;Ljava/lang/Object;)V", "prependAll", "elementList", "", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListUtilsKt {
    public static final <T> void prepend(List<T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        list.add(0, t);
    }

    public static final <T> void prependAll(List<T> list, List<? extends T> elementList) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(elementList, "elementList");
        list.addAll(0, elementList);
    }
}
