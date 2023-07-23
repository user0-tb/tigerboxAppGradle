package io.shipbook.shipbooksdk.Util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.shipbook.shipbooksdk.InnerLog;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateHelper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Util/DateHelper;", "", "()V", "createDateStandard", "Ljava/util/Date;", TypedValues.Custom.S_STRING, "", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateHelper {
    public static final DateHelper INSTANCE = new DateHelper();

    private DateHelper() {
    }

    public final Date createDateStandard(String string) {
        String str;
        SimpleDateFormat simpleDateFormat;
        Intrinsics.checkNotNullParameter(string, "string");
        try {
            simpleDateFormat = DateHelperKt.sDateFormat;
            return simpleDateFormat.parse(string);
        } catch (Exception e) {
            InnerLog innerLog = InnerLog.INSTANCE;
            str = DateHelperKt.TAG;
            innerLog.e(str, "error in the parse", e);
            return null;
        }
    }
}
