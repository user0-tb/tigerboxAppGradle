package io.shipbook.shipbooksdk.Models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: StackTraceElement.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001d"}, d2 = {"Lio/shipbook/shipbooksdk/Models/StackTraceElement;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "declaringClass", "", "methodName", "fileName", "lineNumber", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDeclaringClass", "()Ljava/lang/String;", "getFileName", "getLineNumber", "()I", "getMethodName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StackTraceElement implements BaseObj {
    public static final Companion Companion = new Companion(null);
    private final String declaringClass;
    private final String fileName;
    private final int lineNumber;
    private final String methodName;

    public static /* synthetic */ StackTraceElement copy$default(StackTraceElement stackTraceElement, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stackTraceElement.declaringClass;
        }
        if ((i2 & 2) != 0) {
            str2 = stackTraceElement.methodName;
        }
        if ((i2 & 4) != 0) {
            str3 = stackTraceElement.fileName;
        }
        if ((i2 & 8) != 0) {
            i = stackTraceElement.lineNumber;
        }
        return stackTraceElement.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.declaringClass;
    }

    public final String component2() {
        return this.methodName;
    }

    public final String component3() {
        return this.fileName;
    }

    public final int component4() {
        return this.lineNumber;
    }

    public final StackTraceElement copy(String declaringClass, String methodName, String str, int i) {
        Intrinsics.checkNotNullParameter(declaringClass, "declaringClass");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        return new StackTraceElement(declaringClass, methodName, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StackTraceElement) {
            StackTraceElement stackTraceElement = (StackTraceElement) obj;
            return Intrinsics.areEqual(this.declaringClass, stackTraceElement.declaringClass) && Intrinsics.areEqual(this.methodName, stackTraceElement.methodName) && Intrinsics.areEqual(this.fileName, stackTraceElement.fileName) && this.lineNumber == stackTraceElement.lineNumber;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.declaringClass.hashCode() * 31) + this.methodName.hashCode()) * 31;
        String str = this.fileName;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.lineNumber;
    }

    public String toString() {
        return "StackTraceElement(declaringClass=" + this.declaringClass + ", methodName=" + this.methodName + ", fileName=" + ((Object) this.fileName) + ", lineNumber=" + this.lineNumber + ')';
    }

    public StackTraceElement(String declaringClass, String methodName, String str, int i) {
        Intrinsics.checkNotNullParameter(declaringClass, "declaringClass");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        this.declaringClass = declaringClass;
        this.methodName = methodName;
        this.fileName = str;
        this.lineNumber = i;
    }

    public final String getDeclaringClass() {
        return this.declaringClass;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    /* compiled from: StackTraceElement.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/StackTraceElement$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/StackTraceElement;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StackTraceElement create(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String declaringClass = json.optString("declaringClass");
            String methodName = json.optString("methodName");
            String optString = json.optString("fileName");
            int i = json.getInt("lineNumber");
            Intrinsics.checkNotNullExpressionValue(declaringClass, "declaringClass");
            Intrinsics.checkNotNullExpressionValue(methodName, "methodName");
            return new StackTraceElement(declaringClass, methodName, optString, i);
        }
    }

    public final int getLineNumber() {
        return this.lineNumber;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("declaringClass", this.declaringClass);
        jSONObject.put("methodName", this.methodName);
        jSONObject.putOpt("fileName", this.fileName);
        jSONObject.put("lineNumber", this.lineNumber);
        return jSONObject;
    }
}
