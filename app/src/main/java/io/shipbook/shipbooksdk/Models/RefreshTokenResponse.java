package io.shipbook.shipbooksdk.Models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RefreshTokenResponse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lio/shipbook/shipbooksdk/Models/RefreshTokenResponse;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RefreshTokenResponse implements BaseObj {
    public static final Companion Companion = new Companion(null);
    private final String token;

    public static /* synthetic */ RefreshTokenResponse copy$default(RefreshTokenResponse refreshTokenResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshTokenResponse.token;
        }
        return refreshTokenResponse.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final RefreshTokenResponse copy(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new RefreshTokenResponse(token);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RefreshTokenResponse) && Intrinsics.areEqual(this.token, ((RefreshTokenResponse) obj).token);
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return "RefreshTokenResponse(token=" + this.token + ')';
    }

    /* compiled from: RefreshTokenResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/RefreshTokenResponse$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/RefreshTokenResponse;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RefreshTokenResponse create(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String token = json.optString("token");
            Intrinsics.checkNotNullExpressionValue(token, "token");
            return new RefreshTokenResponse(token);
        }
    }

    public RefreshTokenResponse(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
    }

    public final String getToken() {
        return this.token;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.token);
        return jSONObject;
    }
}
