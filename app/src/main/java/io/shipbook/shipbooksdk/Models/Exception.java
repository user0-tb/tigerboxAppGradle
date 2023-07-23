package io.shipbook.shipbooksdk.Models;

import io.shipbook.shipbooksdk.Models.BaseLog;
import io.shipbook.shipbooksdk.Util.ListStackTraceElementExtKt;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Exception.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 +2\u00020\u0001:\u0001+BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\b\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lio/shipbook/shipbooksdk/Models/Exception;", "Lio/shipbook/shipbooksdk/Models/BaseLog;", "name", "", "reason", "stackTrace", "", "Lio/shipbook/shipbooksdk/Models/StackTraceElement;", "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/Date;Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;)V", "getName", "()Ljava/lang/String;", "getOrderId", "()I", "setOrderId", "(I)V", "getReason", "getStackTrace", "()Ljava/util/List;", "getThreadInfo", "()Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "getTime", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Exception extends BaseLog {
    public static final Companion Companion = new Companion(null);
    private final String name;
    private int orderId;
    private final String reason;
    private final List<StackTraceElement> stackTrace;
    private final BaseLog.ThreadInfo threadInfo;
    private final Date time;

    public static /* synthetic */ Exception copy$default(Exception exception, String str, String str2, List list, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = exception.name;
        }
        if ((i2 & 2) != 0) {
            str2 = exception.reason;
        }
        String str3 = str2;
        List<StackTraceElement> list2 = list;
        if ((i2 & 4) != 0) {
            list2 = exception.stackTrace;
        }
        List list3 = list2;
        if ((i2 & 8) != 0) {
            i = exception.getOrderId();
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            date = exception.getTime();
        }
        Date date2 = date;
        if ((i2 & 32) != 0) {
            threadInfo = exception.getThreadInfo();
        }
        return exception.copy(str, str3, list3, i3, date2, threadInfo);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.reason;
    }

    public final List<StackTraceElement> component3() {
        return this.stackTrace;
    }

    public final int component4() {
        return getOrderId();
    }

    public final Date component5() {
        return getTime();
    }

    public final BaseLog.ThreadInfo component6() {
        return getThreadInfo();
    }

    public final Exception copy(String str, String str2, List<StackTraceElement> stackTrace, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        return new Exception(str, str2, stackTrace, i, time, threadInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Exception) {
            Exception exception = (Exception) obj;
            return Intrinsics.areEqual(this.name, exception.name) && Intrinsics.areEqual(this.reason, exception.reason) && Intrinsics.areEqual(this.stackTrace, exception.stackTrace) && getOrderId() == exception.getOrderId() && Intrinsics.areEqual(getTime(), exception.getTime()) && Intrinsics.areEqual(getThreadInfo(), exception.getThreadInfo());
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reason;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.stackTrace.hashCode()) * 31) + getOrderId()) * 31) + getTime().hashCode()) * 31) + getThreadInfo().hashCode();
    }

    public String toString() {
        return "Exception(name=" + ((Object) this.name) + ", reason=" + ((Object) this.reason) + ", stackTrace=" + this.stackTrace + ", orderId=" + getOrderId() + ", time=" + getTime() + ", threadInfo=" + getThreadInfo() + ')';
    }

    public final String getName() {
        return this.name;
    }

    public final String getReason() {
        return this.reason;
    }

    public final List<StackTraceElement> getStackTrace() {
        return this.stackTrace;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public int getOrderId() {
        return this.orderId;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public void setOrderId(int i) {
        this.orderId = i;
    }

    public /* synthetic */ Exception(String str, String str2, List list, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new Date() : date, (i2 & 32) != 0 ? new BaseLog.ThreadInfo(null, 0L, false, 7, null) : threadInfo);
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public Date getTime() {
        return this.time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Exception(String str, String str2, List<StackTraceElement> stackTrace, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        super("exception", 0, null, null, 14, null);
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        this.name = str;
        this.reason = str2;
        this.stackTrace = stackTrace;
        this.orderId = i;
        this.time = time;
        this.threadInfo = threadInfo;
        setOrderId(incrementOrderId(getOrderId()));
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public BaseLog.ThreadInfo getThreadInfo() {
        return this.threadInfo;
    }

    /* compiled from: Exception.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lio/shipbook/shipbooksdk/Models/Exception$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/Exception;", "json", "Lorg/json/JSONObject;", "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Exception create(JSONObject json, int i, Date time, BaseLog.ThreadInfo threadInfo) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
            String optString = json.optString("name");
            String optString2 = json.optString("reason");
            JSONArray jSONArray = json.getJSONArray("stackTrace");
            Intrinsics.checkNotNullExpressionValue(jSONArray, "json.getJSONArray(\"stackTrace\")");
            return new Exception(optString, optString2, ListStackTraceElementExtKt.toListStackTraceElement(jSONArray), i, time, threadInfo);
        }
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog, io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        json.putOpt("name", this.name);
        json.putOpt("reason", this.reason);
        json.put("stackTrace", ListStackTraceElementExtKt.toJson(this.stackTrace));
        return json;
    }
}
