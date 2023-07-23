package io.shipbook.shipbooksdk.Models;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ErrorResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ErrorResponse;", "", "name", "", "message", NotificationCompat.CATEGORY_STATUS, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getMessage", "()Ljava/lang/String;", "getName", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/shipbook/shipbooksdk/Models/ErrorResponse;", "equals", "", "other", "hashCode", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorResponse {
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final String name;
    private final Integer status;

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorResponse.name;
        }
        if ((i & 2) != 0) {
            str2 = errorResponse.message;
        }
        if ((i & 4) != 0) {
            num = errorResponse.status;
        }
        return errorResponse.copy(str, str2, num);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.message;
    }

    public final Integer component3() {
        return this.status;
    }

    public final ErrorResponse copy(String name, String message, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ErrorResponse(name, message, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorResponse) {
            ErrorResponse errorResponse = (ErrorResponse) obj;
            return Intrinsics.areEqual(this.name, errorResponse.name) && Intrinsics.areEqual(this.message, errorResponse.message) && Intrinsics.areEqual(this.status, errorResponse.status);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.message.hashCode()) * 31;
        Integer num = this.status;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ErrorResponse(name=" + this.name + ", message=" + this.message + ", status=" + this.status + ')';
    }

    /* compiled from: ErrorResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ErrorResponse$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/ErrorResponse;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ErrorResponse create(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String name = json.optString("name");
            String message = json.optString("message");
            int optInt = json.optInt(NotificationCompat.CATEGORY_STATUS);
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(message, "message");
            return new ErrorResponse(name, message, Integer.valueOf(optInt));
        }
    }

    public ErrorResponse(String name, String message, Integer num) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        this.name = name;
        this.message = message;
        this.status = num;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getStatus() {
        return this.status;
    }
}
