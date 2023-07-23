package io.shipbook.shipbooksdk.Util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.infrastructure.Constants;

/* compiled from: DateHelper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TAG", "", "sDateFormat", "Ljava/text/SimpleDateFormat;", "toStandardString", "Ljava/util/Date;", "shipbooksdk_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateHelperKt {
    private static final String TAG;
    private static final SimpleDateFormat sDateFormat;

    static {
        Intrinsics.checkNotNullExpressionValue("DateHelper", "DateHelper::class.java.simpleName");
        TAG = "DateHelper";
        sDateFormat = new SimpleDateFormat(Constants.TIME_DATE_FORMAT, Locale.US);
    }

    public static final String toStandardString(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String format = sDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "sDateFormat.format(this)");
        return format;
    }
}
