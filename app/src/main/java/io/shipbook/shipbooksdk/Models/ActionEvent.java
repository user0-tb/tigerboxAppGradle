package io.shipbook.shipbooksdk.Models;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.shipbook.shipbooksdk.Models.BaseLog;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ActionEvent.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 +2\u00020\u0001:\u0001+BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\b\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ActionEvent;", "Lio/shipbook/shipbooksdk/Models/BaseEvent;", "action", "", "sender", "senderTitle", TypedValues.AttributesType.S_TARGET, "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;)V", "getAction", "()Ljava/lang/String;", "getOrderId", "()I", "setOrderId", "(I)V", "getSender", "getSenderTitle", "getTarget", "getThreadInfo", "()Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "getTime", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionEvent extends BaseEvent {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private int orderId;
    private final String sender;
    private final String senderTitle;
    private final String target;
    private final BaseLog.ThreadInfo threadInfo;
    private final Date time;

    public static /* synthetic */ ActionEvent copy$default(ActionEvent actionEvent, String str, String str2, String str3, String str4, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = actionEvent.action;
        }
        if ((i2 & 2) != 0) {
            str2 = actionEvent.sender;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = actionEvent.senderTitle;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = actionEvent.target;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = actionEvent.getOrderId();
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            date = actionEvent.getTime();
        }
        Date date2 = date;
        if ((i2 & 64) != 0) {
            threadInfo = actionEvent.getThreadInfo();
        }
        return actionEvent.copy(str, str5, str6, str7, i3, date2, threadInfo);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.sender;
    }

    public final String component3() {
        return this.senderTitle;
    }

    public final String component4() {
        return this.target;
    }

    public final int component5() {
        return getOrderId();
    }

    public final Date component6() {
        return getTime();
    }

    public final BaseLog.ThreadInfo component7() {
        return getThreadInfo();
    }

    public final ActionEvent copy(String action, String sender, String senderTitle, String target, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(senderTitle, "senderTitle");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        return new ActionEvent(action, sender, senderTitle, target, i, time, threadInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionEvent) {
            ActionEvent actionEvent = (ActionEvent) obj;
            return Intrinsics.areEqual(this.action, actionEvent.action) && Intrinsics.areEqual(this.sender, actionEvent.sender) && Intrinsics.areEqual(this.senderTitle, actionEvent.senderTitle) && Intrinsics.areEqual(this.target, actionEvent.target) && getOrderId() == actionEvent.getOrderId() && Intrinsics.areEqual(getTime(), actionEvent.getTime()) && Intrinsics.areEqual(getThreadInfo(), actionEvent.getThreadInfo());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((this.action.hashCode() * 31) + this.sender.hashCode()) * 31) + this.senderTitle.hashCode()) * 31) + this.target.hashCode()) * 31) + getOrderId()) * 31) + getTime().hashCode()) * 31) + getThreadInfo().hashCode();
    }

    public String toString() {
        return "ActionEvent(action=" + this.action + ", sender=" + this.sender + ", senderTitle=" + this.senderTitle + ", target=" + this.target + ", orderId=" + getOrderId() + ", time=" + getTime() + ", threadInfo=" + getThreadInfo() + ')';
    }

    public final String getAction() {
        return this.action;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getSenderTitle() {
        return this.senderTitle;
    }

    public final String getTarget() {
        return this.target;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public int getOrderId() {
        return this.orderId;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public void setOrderId(int i) {
        this.orderId = i;
    }

    public /* synthetic */ ActionEvent(String str, String str2, String str3, String str4, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? new Date() : date, (i2 & 64) != 0 ? new BaseLog.ThreadInfo(null, 0L, false, 7, null) : threadInfo);
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public Date getTime() {
        return this.time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionEvent(String action, String sender, String senderTitle, String target, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        super("actionEvent");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(senderTitle, "senderTitle");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        this.action = action;
        this.sender = sender;
        this.senderTitle = senderTitle;
        this.target = target;
        this.orderId = i;
        this.time = time;
        this.threadInfo = threadInfo;
        setOrderId(incrementOrderId(getOrderId()));
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public BaseLog.ThreadInfo getThreadInfo() {
        return this.threadInfo;
    }

    /* compiled from: ActionEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ActionEvent$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/ActionEvent;", "json", "Lorg/json/JSONObject;", "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ActionEvent create(JSONObject json, int i, Date time, BaseLog.ThreadInfo threadInfo) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
            String action = json.optString("action");
            String sender = json.optString("sender");
            String senderTitle = json.optString("senderTitle");
            String target = json.optString(TypedValues.AttributesType.S_TARGET);
            Intrinsics.checkNotNullExpressionValue(action, "action");
            Intrinsics.checkNotNullExpressionValue(sender, "sender");
            Intrinsics.checkNotNullExpressionValue(senderTitle, "senderTitle");
            Intrinsics.checkNotNullExpressionValue(target, "target");
            return new ActionEvent(action, sender, senderTitle, target, i, time, threadInfo);
        }
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog, io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        json.put("action", this.action);
        json.put("sender", this.sender);
        json.put("senderTitle", this.senderTitle);
        json.put(TypedValues.AttributesType.S_TARGET, this.target);
        return json;
    }
}
