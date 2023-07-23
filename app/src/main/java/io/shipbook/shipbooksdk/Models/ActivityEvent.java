package io.shipbook.shipbooksdk.Models;

import androidx.core.app.NotificationCompat;
import io.shipbook.shipbooksdk.Models.BaseLog;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: ActivityEvent.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 (2\u00020\u0001:\u0001(B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006)"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ActivityEvent;", "Lio/shipbook/shipbooksdk/Models/BaseEvent;", "name", "", NotificationCompat.CATEGORY_EVENT, MessageBundle.TITLE_ENTRY, "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;)V", "getEvent", "()Ljava/lang/String;", "getName", "getOrderId", "()I", "setOrderId", "(I)V", "getThreadInfo", "()Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "getTime", "()Ljava/util/Date;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityEvent extends BaseEvent {
    public static final Companion Companion = new Companion(null);
    private final String event;
    private final String name;
    private int orderId;
    private final BaseLog.ThreadInfo threadInfo;
    private final Date time;
    private final String title;

    public static /* synthetic */ ActivityEvent copy$default(ActivityEvent activityEvent, String str, String str2, String str3, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = activityEvent.name;
        }
        if ((i2 & 2) != 0) {
            str2 = activityEvent.event;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = activityEvent.title;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = activityEvent.getOrderId();
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            date = activityEvent.getTime();
        }
        Date date2 = date;
        if ((i2 & 32) != 0) {
            threadInfo = activityEvent.getThreadInfo();
        }
        return activityEvent.copy(str, str4, str5, i3, date2, threadInfo);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.event;
    }

    public final String component3() {
        return this.title;
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

    public final ActivityEvent copy(String name, String event, String title, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        return new ActivityEvent(name, event, title, i, time, threadInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityEvent) {
            ActivityEvent activityEvent = (ActivityEvent) obj;
            return Intrinsics.areEqual(this.name, activityEvent.name) && Intrinsics.areEqual(this.event, activityEvent.event) && Intrinsics.areEqual(this.title, activityEvent.title) && getOrderId() == activityEvent.getOrderId() && Intrinsics.areEqual(getTime(), activityEvent.getTime()) && Intrinsics.areEqual(getThreadInfo(), activityEvent.getThreadInfo());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.event.hashCode()) * 31) + this.title.hashCode()) * 31) + getOrderId()) * 31) + getTime().hashCode()) * 31) + getThreadInfo().hashCode();
    }

    public String toString() {
        return "ActivityEvent(name=" + this.name + ", event=" + this.event + ", title=" + this.title + ", orderId=" + getOrderId() + ", time=" + getTime() + ", threadInfo=" + getThreadInfo() + ')';
    }

    public final String getName() {
        return this.name;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public int getOrderId() {
        return this.orderId;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public void setOrderId(int i) {
        this.orderId = i;
    }

    public /* synthetic */ ActivityEvent(String str, String str2, String str3, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new Date() : date, (i2 & 32) != 0 ? new BaseLog.ThreadInfo(null, 0L, false, 7, null) : threadInfo);
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public Date getTime() {
        return this.time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityEvent(String name, String event, String title, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        super("activityEvent");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        this.name = name;
        this.event = event;
        this.title = title;
        this.orderId = i;
        this.time = time;
        this.threadInfo = threadInfo;
        setOrderId(incrementOrderId(getOrderId()));
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public BaseLog.ThreadInfo getThreadInfo() {
        return this.threadInfo;
    }

    /* compiled from: ActivityEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ActivityEvent$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/ActivityEvent;", "json", "Lorg/json/JSONObject;", "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ActivityEvent create(JSONObject json, int i, Date time, BaseLog.ThreadInfo threadInfo) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
            String name = json.optString("name");
            String event = json.optString(NotificationCompat.CATEGORY_EVENT);
            String title = json.optString(MessageBundle.TITLE_ENTRY);
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(event, "event");
            Intrinsics.checkNotNullExpressionValue(title, "title");
            return new ActivityEvent(name, event, title, i, time, threadInfo);
        }
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog, io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        json.put("name", this.name);
        json.put(NotificationCompat.CATEGORY_EVENT, this.event);
        json.put(MessageBundle.TITLE_ENTRY, this.title);
        return json;
    }
}
