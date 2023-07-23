package io.shipbook.shipbooksdk;

import androidx.core.app.NotificationCompat;
import io.shipbook.shipbooksdk.Models.Severity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InnerLog.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ(\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\"\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\"\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lio/shipbook/shipbooksdk/InnerLog;", "", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "d", "", "tag", "", NotificationCompat.CATEGORY_MESSAGE, "throwable", "", "e", "i", "message", "severity", "Lio/shipbook/shipbooksdk/Models/Severity;", "v", "w", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InnerLog {
    public static final InnerLog INSTANCE = new InnerLog();
    private static boolean enabled;

    /* compiled from: InnerLog.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Severity.values().length];
            iArr[Severity.Error.ordinal()] = 1;
            iArr[Severity.Warning.ordinal()] = 2;
            iArr[Severity.Info.ordinal()] = 3;
            iArr[Severity.Debug.ordinal()] = 4;
            iArr[Severity.Verbose.ordinal()] = 5;
            iArr[Severity.Off.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InnerLog() {
    }

    public final boolean getEnabled() {
        return enabled;
    }

    public final void setEnabled(boolean z) {
        enabled = z;
    }

    public static /* synthetic */ void e$default(InnerLog innerLog, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        innerLog.e(str, str2, th);
    }

    public final void e(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        message(tag, msg, Severity.Error, th);
    }

    public static /* synthetic */ void w$default(InnerLog innerLog, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        innerLog.w(str, str2, th);
    }

    public final void w(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        message(tag, msg, Severity.Warning, th);
    }

    public static /* synthetic */ void i$default(InnerLog innerLog, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        innerLog.i(str, str2, th);
    }

    public final void i(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        message(tag, msg, Severity.Info, th);
    }

    public static /* synthetic */ void d$default(InnerLog innerLog, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        innerLog.d(str, str2, th);
    }

    public final void d(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        message(tag, msg, Severity.Debug, th);
    }

    public static /* synthetic */ void v$default(InnerLog innerLog, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        innerLog.v(str, str2, th);
    }

    public final void v(String tag, String msg, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        message(tag, msg, Severity.Verbose, th);
    }

    public final void message(String tag, String msg, Severity severity, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(severity, "severity");
        if (enabled) {
            String stringPlus = Intrinsics.stringPlus("Shipbook-", tag);
            if (th != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
                if (i == 1) {
                    android.util.Log.e(stringPlus, msg, th);
                    return;
                } else if (i == 2) {
                    android.util.Log.w(stringPlus, msg, th);
                    return;
                } else if (i == 3) {
                    android.util.Log.i(stringPlus, msg, th);
                    return;
                } else if (i == 4) {
                    android.util.Log.d(stringPlus, msg, th);
                    return;
                } else if (i != 5) {
                    return;
                } else {
                    android.util.Log.v(stringPlus, msg, th);
                    return;
                }
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
            if (i2 == 1) {
                android.util.Log.e(stringPlus, msg);
            } else if (i2 == 2) {
                android.util.Log.w(stringPlus, msg);
            } else if (i2 == 3) {
                android.util.Log.i(stringPlus, msg);
            } else if (i2 == 4) {
                android.util.Log.d(stringPlus, msg);
            } else if (i2 != 5) {
            } else {
                android.util.Log.v(stringPlus, msg);
            }
        }
    }
}
