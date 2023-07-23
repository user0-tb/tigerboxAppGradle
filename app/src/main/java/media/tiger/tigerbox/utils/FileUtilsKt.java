package media.tiger.tigerbox.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;

/* compiled from: FileUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0007"}, d2 = {"appendingPathComponent", "", "comp", "lastPathComponent", "pathExtension", "removingLastPathComponent", "removingPathExtension", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileUtilsKt {
    public static final String removingLastPathComponent(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.substringBeforeLast$default(str, DownloadsManager.FOLDERS_SEPARATOR, (String) null, 2, (Object) null) + '/';
    }

    public static final String lastPathComponent(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String substring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String appendingPathComponent(String str, String comp) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(comp, "comp");
        return str + comp;
    }

    public static final String removingPathExtension(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.substringBeforeLast$default(str, DownloadsManager.EXTENSION_SEPARATOR, (String) null, 2, (Object) null);
    }

    public static final String pathExtension(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.substringAfterLast$default(str, DownloadsManager.EXTENSION_SEPARATOR, (String) null, 2, (Object) null);
    }
}
