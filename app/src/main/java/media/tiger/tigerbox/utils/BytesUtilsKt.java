package media.tiger.tigerbox.utils;

import java.text.StringCharacterIterator;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: BytesUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"bytesToString", "", "", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BytesUtilsKt {
    public static final String bytesToString(long j) {
        long abs = j == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(j);
        if (abs < 1024) {
            return j + " B";
        }
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("KMGTPE");
        long j2 = abs;
        for (int i = 40; i >= 0 && abs > (1152865209611504844 >> i); i -= 10) {
            j2 >>= 10;
            stringCharacterIterator.next();
        }
        long signum = j2 * Long.signum(j);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%.1f %cB", Arrays.copyOf(new Object[]{Double.valueOf(signum / 1024.0d), Character.valueOf(stringCharacterIterator.current())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }
}
