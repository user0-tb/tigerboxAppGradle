package io.shipbook.shipbooksdk.Models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RefreshToken.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Lio/shipbook/shipbooksdk/Models/RefreshToken;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "token", "", "appKey", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppKey", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RefreshToken implements BaseObj {
    public static final Companion Companion = new Companion(null);
    private final String appKey;
    private final String token;

    public static /* synthetic */ RefreshToken copy$default(RefreshToken refreshToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshToken.token;
        }
        if ((i & 2) != 0) {
            str2 = refreshToken.appKey;
        }
        return refreshToken.copy(str, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.appKey;
    }

    public final RefreshToken copy(String token, String appKey) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return new RefreshToken(token, appKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RefreshToken) {
            RefreshToken refreshToken = (RefreshToken) obj;
            return Intrinsics.areEqual(this.token, refreshToken.token) && Intrinsics.areEqual(this.appKey, refreshToken.appKey);
        }
        return false;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.appKey.hashCode();
    }

    public String toString() {
        return "RefreshToken(token=" + this.token + ", appKey=" + this.appKey + ')';
    }

    /* compiled from: RefreshToken.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/RefreshToken$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/RefreshToken;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RefreshToken create(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String token = json.optString("token");
            String appKey = json.optString("appKey");
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(appKey, "appKey");
            return new RefreshToken(token, appKey);
        }
    }

    public RefreshToken(String token, String appKey) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.token = token;
        this.appKey = appKey;
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getToken() {
        return this.token;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.token);
        jSONObject.put("appKey", this.appKey);
        return jSONObject;
    }
}
