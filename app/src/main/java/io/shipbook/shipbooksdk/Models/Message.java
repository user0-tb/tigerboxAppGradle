package io.shipbook.shipbooksdk.Models;

import io.shipbook.shipbooksdk.Models.BaseLog;
import io.shipbook.shipbooksdk.ShipBook;
import io.shipbook.shipbooksdk.Util.ListStackTraceElementExtKt;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Message.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u0000 T2\u00020\u0001:\u0002TUB\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010?\u001a\u00020\u000fHÆ\u0003J\t\u0010@\u001a\u00020\u0015HÆ\u0003J\t\u0010A\u001a\u00020\u0017HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¦\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u000fHÖ\u0001J\b\u0010Q\u001a\u00020RH\u0016J\t\u0010S\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0013\u001a\u00020\u000fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006V"}, d2 = {"Lio/shipbook/shipbooksdk/Models/Message;", "Lio/shipbook/shipbooksdk/Models/BaseLog;", "severity", "Lio/shipbook/shipbooksdk/Models/Severity;", "message", "", "tag", "stackTrace", "", "Lio/shipbook/shipbooksdk/Models/StackTraceElement;", "throwable", "", "function", "fileName", "lineNumber", "", "className", "exception", "Lio/shipbook/shipbooksdk/Models/Message$MessageException;", "orderId", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "(Lio/shipbook/shipbooksdk/Models/Severity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lio/shipbook/shipbooksdk/Models/Message$MessageException;ILjava/util/Date;Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;)V", "getClassName", "()Ljava/lang/String;", "setClassName", "(Ljava/lang/String;)V", "getException", "()Lio/shipbook/shipbooksdk/Models/Message$MessageException;", "setException", "(Lio/shipbook/shipbooksdk/Models/Message$MessageException;)V", "getFileName", "setFileName", "getFunction", "setFunction", "getLineNumber", "()Ljava/lang/Integer;", "setLineNumber", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMessage", "getOrderId", "()I", "setOrderId", "(I)V", "getSeverity", "()Lio/shipbook/shipbooksdk/Models/Severity;", "getStackTrace", "()Ljava/util/List;", "setStackTrace", "(Ljava/util/List;)V", "getTag", "setTag", "getThreadInfo", "()Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "getThrowable", "()Ljava/lang/Throwable;", "getTime", "()Ljava/util/Date;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lio/shipbook/shipbooksdk/Models/Severity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lio/shipbook/shipbooksdk/Models/Message$MessageException;ILjava/util/Date;Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;)Lio/shipbook/shipbooksdk/Models/Message;", "equals", "", "other", "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "MessageException", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Message extends BaseLog {
    public static final Companion Companion = new Companion(null);
    private static final List<String> ignoreClasses;
    private static final String shipbookClassname;
    private String className;
    private MessageException exception;
    private String fileName;
    private String function;
    private Integer lineNumber;
    private final String message;
    private int orderId;
    private final Severity severity;
    private List<StackTraceElement> stackTrace;
    private String tag;
    private final BaseLog.ThreadInfo threadInfo;
    private final Throwable throwable;
    private final Date time;

    public final Severity component1() {
        return this.severity;
    }

    public final MessageException component10() {
        return this.exception;
    }

    public final int component11() {
        return getOrderId();
    }

    public final Date component12() {
        return getTime();
    }

    public final BaseLog.ThreadInfo component13() {
        return getThreadInfo();
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.tag;
    }

    public final List<StackTraceElement> component4() {
        return this.stackTrace;
    }

    public final Throwable component5() {
        return this.throwable;
    }

    public final String component6() {
        return this.function;
    }

    public final String component7() {
        return this.fileName;
    }

    public final Integer component8() {
        return this.lineNumber;
    }

    public final String component9() {
        return this.className;
    }

    public final Message copy(Severity severity, String message, String str, List<StackTraceElement> list, Throwable th, String str2, String str3, Integer num, String str4, MessageException messageException, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        return new Message(severity, message, str, list, th, str2, str3, num, str4, messageException, i, time, threadInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Message) {
            Message message = (Message) obj;
            return this.severity == message.severity && Intrinsics.areEqual(this.message, message.message) && Intrinsics.areEqual(this.tag, message.tag) && Intrinsics.areEqual(this.stackTrace, message.stackTrace) && Intrinsics.areEqual(this.throwable, message.throwable) && Intrinsics.areEqual(this.function, message.function) && Intrinsics.areEqual(this.fileName, message.fileName) && Intrinsics.areEqual(this.lineNumber, message.lineNumber) && Intrinsics.areEqual(this.className, message.className) && Intrinsics.areEqual(this.exception, message.exception) && getOrderId() == message.getOrderId() && Intrinsics.areEqual(getTime(), message.getTime()) && Intrinsics.areEqual(getThreadInfo(), message.getThreadInfo());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.severity.hashCode() * 31) + this.message.hashCode()) * 31;
        String str = this.tag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<StackTraceElement> list = this.stackTrace;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Throwable th = this.throwable;
        int hashCode4 = (hashCode3 + (th == null ? 0 : th.hashCode())) * 31;
        String str2 = this.function;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lineNumber;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.className;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MessageException messageException = this.exception;
        return ((((((hashCode8 + (messageException != null ? messageException.hashCode() : 0)) * 31) + getOrderId()) * 31) + getTime().hashCode()) * 31) + getThreadInfo().hashCode();
    }

    public String toString() {
        return "Message(severity=" + this.severity + ", message=" + this.message + ", tag=" + ((Object) this.tag) + ", stackTrace=" + this.stackTrace + ", throwable=" + this.throwable + ", function=" + ((Object) this.function) + ", fileName=" + ((Object) this.fileName) + ", lineNumber=" + this.lineNumber + ", className=" + ((Object) this.className) + ", exception=" + this.exception + ", orderId=" + getOrderId() + ", time=" + getTime() + ", threadInfo=" + getThreadInfo() + ')';
    }

    public final Severity getSeverity() {
        return this.severity;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTag() {
        return this.tag;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final List<StackTraceElement> getStackTrace() {
        return this.stackTrace;
    }

    public final void setStackTrace(List<StackTraceElement> list) {
        this.stackTrace = list;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final String getFunction() {
        return this.function;
    }

    public final void setFunction(String str) {
        this.function = str;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final void setFileName(String str) {
        this.fileName = str;
    }

    public final Integer getLineNumber() {
        return this.lineNumber;
    }

    public final void setLineNumber(Integer num) {
        this.lineNumber = num;
    }

    public final String getClassName() {
        return this.className;
    }

    public final void setClassName(String str) {
        this.className = str;
    }

    public final MessageException getException() {
        return this.exception;
    }

    public final void setException(MessageException messageException) {
        this.exception = messageException;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public int getOrderId() {
        return this.orderId;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public void setOrderId(int i) {
        this.orderId = i;
    }

    public /* synthetic */ Message(Severity severity, String str, String str2, List list, Throwable th, String str3, String str4, Integer num, String str5, MessageException messageException, int i, Date date, BaseLog.ThreadInfo threadInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(severity, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : th, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : messageException, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? new Date() : date, (i2 & 4096) != 0 ? new BaseLog.ThreadInfo(null, 0L, false, 7, null) : threadInfo);
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public Date getTime() {
        return this.time;
    }

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lio/shipbook/shipbooksdk/Models/Message$Companion;", "", "()V", "ignoreClasses", "", "", "getIgnoreClasses", "()Ljava/util/List;", "shipbookClassname", "getShipbookClassname", "()Ljava/lang/String;", "addIgnoreClass", "", "name", "create", "Lio/shipbook/shipbooksdk/Models/Message;", "json", "Lorg/json/JSONObject;", "orderId", "", "time", "Ljava/util/Date;", "threadInfo", "Lio/shipbook/shipbooksdk/Models/BaseLog$ThreadInfo;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Message create(JSONObject json, int i, Date time, BaseLog.ThreadInfo threadInfo) {
            MessageException messageException;
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(time, "time");
            Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
            String optString = json.optString("tag");
            String optString2 = json.optString("severity");
            Intrinsics.checkNotNullExpressionValue(optString2, "json.optString(\"severity\")");
            Severity valueOf = Severity.valueOf(optString2);
            String message = json.optString("message");
            JSONArray optJSONArray = json.optJSONArray("stackTrace");
            List<StackTraceElement> listStackTraceElement = optJSONArray == null ? null : ListStackTraceElementExtKt.toListStackTraceElement(optJSONArray);
            if (json.has("exception")) {
                MessageException.Companion companion = MessageException.Companion;
                JSONObject optJSONObject = json.optJSONObject("exception");
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "json.optJSONObject(\"exception\")");
                messageException = companion.create(optJSONObject);
            } else {
                messageException = null;
            }
            String optString3 = json.optString("function");
            String optString4 = json.optString("fileName");
            int optInt = json.optInt("lineNumber");
            String optString5 = json.optString("className");
            Intrinsics.checkNotNullExpressionValue(message, "message");
            return new Message(valueOf, message, optString, listStackTraceElement, null, optString3, optString4, Integer.valueOf(optInt), optString5, messageException, i, time, threadInfo);
        }

        public final void addIgnoreClass(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            getIgnoreClasses().add(name);
        }

        public final String getShipbookClassname() {
            return Message.shipbookClassname;
        }

        public final List<String> getIgnoreClasses() {
            return Message.ignoreClasses;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Message(Severity severity, String message, String str, List<StackTraceElement> list, Throwable th, String str2, String str3, Integer num, String str4, MessageException messageException, int i, Date time, BaseLog.ThreadInfo threadInfo) {
        super("message", 0, null, null, 14, null);
        java.lang.StackTraceElement stackTraceElement;
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(threadInfo, "threadInfo");
        this.severity = severity;
        this.message = message;
        this.tag = str;
        this.stackTrace = list;
        this.throwable = th;
        this.function = str2;
        this.fileName = str3;
        this.lineNumber = num;
        this.className = str4;
        this.exception = messageException;
        this.orderId = i;
        this.time = time;
        this.threadInfo = threadInfo;
        setOrderId(incrementOrderId(getOrderId()));
        if (this.fileName == null) {
            java.lang.StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
            java.lang.StackTraceElement[] stackTraceElementArr = stackTrace;
            int length = stackTraceElementArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = stackTraceElementArr[i2];
                i2++;
                java.lang.StackTraceElement stackTraceElement2 = stackTraceElement;
                Iterator<T> it = ignoreClasses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String className = stackTraceElement2.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "trace.className");
                    if (StringsKt.startsWith$default(className, (String) obj, false, 2, (Object) null)) {
                        break;
                    }
                }
                if (obj == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            java.lang.StackTraceElement stackTraceElement3 = stackTraceElement;
            this.function = stackTraceElement3 == null ? null : stackTraceElement3.getMethodName();
            this.fileName = stackTraceElement3 == null ? null : stackTraceElement3.getFileName();
            this.lineNumber = stackTraceElement3 == null ? null : Integer.valueOf(stackTraceElement3.getLineNumber());
            this.className = stackTraceElement3 == null ? null : stackTraceElement3.getClassName();
        }
        if (this.tag == null) {
            String str5 = this.className;
            this.tag = str5 != null ? StringsKt.substringAfterLast$default(str5, '.', (String) null, 2, (Object) null) : null;
        }
        Throwable th2 = this.throwable;
        if (th2 != null) {
            java.lang.StackTraceElement[] stackTrace2 = th2.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "throwable.stackTrace");
            this.exception = new MessageException(this.throwable.getClass().getName(), this.throwable.getMessage(), ListStackTraceElementExtKt.toInternal(stackTrace2));
        }
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog
    public BaseLog.ThreadInfo getThreadInfo() {
        return this.threadInfo;
    }

    static {
        String name = ShipBook.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ShipBook::class.java.name");
        String substringBeforeLast$default = StringsKt.substringBeforeLast$default(name, DownloadsManager.EXTENSION_SEPARATOR, (String) null, 2, (Object) null);
        shipbookClassname = substringBeforeLast$default;
        ignoreClasses = CollectionsKt.mutableListOf(substringBeforeLast$default);
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseLog, io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject json = super.toJson();
        json.put("tag", this.tag);
        json.put("severity", this.severity);
        json.put("message", this.message);
        MessageException messageException = this.exception;
        json.putOpt("exception", messageException == null ? null : messageException.toJson());
        List<StackTraceElement> list = this.stackTrace;
        json.putOpt("stackTrace", list != null ? ListStackTraceElementExtKt.toJson(list) : null);
        json.put("function", this.function);
        json.put("fileName", this.fileName);
        json.put("lineNumber", this.lineNumber);
        json.put("className", this.className);
        return json;
    }

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lio/shipbook/shipbooksdk/Models/Message$MessageException;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "name", "", "reason", "stackTrace", "", "Lio/shipbook/shipbooksdk/Models/StackTraceElement;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getReason", "getStackTrace", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MessageException implements BaseObj {
        public static final Companion Companion = new Companion(null);
        private final String name;
        private final String reason;
        private final List<StackTraceElement> stackTrace;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessageException copy$default(MessageException messageException, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageException.name;
            }
            if ((i & 2) != 0) {
                str2 = messageException.reason;
            }
            if ((i & 4) != 0) {
                list = messageException.stackTrace;
            }
            return messageException.copy(str, str2, list);
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

        public final MessageException copy(String str, String str2, List<StackTraceElement> stackTrace) {
            Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
            return new MessageException(str, str2, stackTrace);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MessageException) {
                MessageException messageException = (MessageException) obj;
                return Intrinsics.areEqual(this.name, messageException.name) && Intrinsics.areEqual(this.reason, messageException.reason) && Intrinsics.areEqual(this.stackTrace, messageException.stackTrace);
            }
            return false;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.reason;
            return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.stackTrace.hashCode();
        }

        public String toString() {
            return "MessageException(name=" + ((Object) this.name) + ", reason=" + ((Object) this.reason) + ", stackTrace=" + this.stackTrace + ')';
        }

        public MessageException(String str, String str2, List<StackTraceElement> stackTrace) {
            Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
            this.name = str;
            this.reason = str2;
            this.stackTrace = stackTrace;
        }

        public final String getName() {
            return this.name;
        }

        public final String getReason() {
            return this.reason;
        }

        /* compiled from: Message.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/Message$MessageException$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/Message$MessageException;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final MessageException create(JSONObject json) {
                Intrinsics.checkNotNullParameter(json, "json");
                String optString = json.optString("name");
                String optString2 = json.optString("reason");
                JSONArray jSONArray = json.getJSONArray("stackTrace");
                Intrinsics.checkNotNullExpressionValue(jSONArray, "json.getJSONArray(\"stackTrace\")");
                return new MessageException(optString, optString2, ListStackTraceElementExtKt.toListStackTraceElement(jSONArray));
            }
        }

        public final List<StackTraceElement> getStackTrace() {
            return this.stackTrace;
        }

        @Override // io.shipbook.shipbooksdk.Models.BaseObj
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", this.name);
            jSONObject.putOpt("reason", this.reason);
            jSONObject.put("stackTrace", ListStackTraceElementExtKt.toJson(this.stackTrace));
            return jSONObject;
        }
    }
}
