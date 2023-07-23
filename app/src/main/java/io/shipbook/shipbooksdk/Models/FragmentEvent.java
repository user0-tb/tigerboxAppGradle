package io.shipbook.shipbooksdk.Models;

import androidx.core.app.NotificationCompat;
import io.shipbook.shipbooksdk.Models.BaseLog;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: FragmentEvent.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 %2\u00020\u0001:\u0001%B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\b\u0010\"\u001a\u00020#H\u0016J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lio/shipbook/shipbooksdk/Models/FragmentEvent;", "Lio/shipbook/shipbooksdk/Models/BaseEvent;", "name", "", NotificationCompat.CATEGORY_EVENT, "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;)V", "getEvent", "()Ljava/lang/String;", "getName", "getOrderId", "()I", "setOrderId", "(I)V", "getThreadInfo", "()Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "getTime", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentEvent extends BaseEvent {
    public static final Companion Companion = new Companion(null);
    private final String event;
    private final String name;
    private int orderId;
    private final BaseLog.ThreadInfo threadInfo;
    private final Date time;

    public static /* synthetic */ FragmentEvent copy$default(FragmentEvent fragmentEvent, String str, String str2, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fragmentEvent.name;
        }
        if ((i2 & 2) != 0) {
            str2 = fragmentEvent.event;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = fragmentEvent.getOrderId();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            date = fragmentEvent.getTime();
        }
        Date date2 = date;
        if ((i2 & 16) != 0) {
            threadInfo = fragmentEvent.getThreadInfo();
        }
        return fragmentEvent.copy(str, str3, i3, date2, threadInfo);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.event;
    }

    public final int component3() {
        return getOrderId();
    }

    public final Date component4() {
        return getTime();
    }

    public final BaseLog.ThreadInfo component5() {
        return getThreadInfo();
    }

    public final FragmentEvent copy(String name, String event, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        return new FragmentEvent(name, event, i, time, threadInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FragmentEvent) {
            FragmentEvent fragmentEvent = (FragmentEvent) obj;
            return Intrinsics.areEqual(this.name, fragmentEvent.name) && Intrinsics.areEqual(this.event, fragmentEvent.event) && getOrderId() == fragmentEvent.getOrderId() && Intrinsics.areEqual(getTime(), fragmentEvent.getTime()) && Intrinsics.areEqual(getThreadInfo(), fragmentEvent.getThreadInfo());
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.event.hashCode()) * 31) + getOrderId()) * 31) + getTime().hashCode()) * 31) + getThreadInfo().hashCode();
    }

    public String toString() {
        return "FragmentEvent(name=" + this.name + ", event=" + this.event + ", orderId=" + getOrderId() + ", time=" + getTime() + ", threadInfo=" + getThreadInfo() + ')';
    }

    public final String getName() {
        return this.name;
    }

    public final String getEvent() {
        return this.event;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public int getOrderId() {
        return this.orderId;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public void setOrderId(int i) {
        this.orderId = i;
    }

    public /* synthetic */ FragmentEvent(String str, String str2, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new Date() : date, (i2 & 16) != 0 ? new BaseLog.ThreadInfo(null, 0L, false, 7, null) : threadInfo);
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public Date getTime() {
        return this.time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentEvent(String name, String event, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        super("fragmentEvent");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        this.name = name;
        this.event = event;
        this.orderId = i;
        this.time = time;
        this.threadInfo = threadInfo;
        setOrderId(incrementOrderId(getOrderId()));
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public BaseLog.ThreadInfo getThreadInfo() {
        return this.threadInfo;
    }

    /* compiled from: FragmentEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lio/shipbook/shipbooksdk/Models/FragmentEvent$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/FragmentEvent;", "json", "Lorg/json/JSONObject;", "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FragmentEvent create(JSONObject json, int i, Date time, BaseLog.ThreadInfo threadInfo) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
            String name = json.optString("name");
            String event = json.optString(NotificationCompat.CATEGORY_EVENT);
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(event, "event");
            return new FragmentEvent(name, event, i, time, threadInfo);
        }
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog, io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        json.put("name", this.name);
        json.put(NotificationCompat.CATEGORY_EVENT, this.event);
        return json;
    }
}
