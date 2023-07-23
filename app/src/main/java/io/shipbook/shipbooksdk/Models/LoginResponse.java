package io.shipbook.shipbooksdk.Models;

import io.shipbook.shipbooksdk.Models.ConfigResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: LoginResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lio/shipbook/shipbooksdk/Models/LoginResponse;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "token", "", "config", "Lio/shipbook/shipbooksdk/Models/ConfigResponse;", "sessionUrl", "(Ljava/lang/String;Lio/shipbook/shipbooksdk/Models/ConfigResponse;Ljava/lang/String;)V", "getConfig", "()Lio/shipbook/shipbooksdk/Models/ConfigResponse;", "getSessionUrl", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginResponse implements BaseObj {
    public static final Companion Companion = new Companion(null);
    private final ConfigResponse config;
    private final String sessionUrl;
    private final String token;

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, String str, ConfigResponse configResponse, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginResponse.token;
        }
        if ((i & 2) != 0) {
            configResponse = loginResponse.config;
        }
        if ((i & 4) != 0) {
            str2 = loginResponse.sessionUrl;
        }
        return loginResponse.copy(str, configResponse, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final ConfigResponse component2() {
        return this.config;
    }

    public final String component3() {
        return this.sessionUrl;
    }

    public final LoginResponse copy(String token, ConfigResponse config, String sessionUrl) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sessionUrl, "sessionUrl");
        return new LoginResponse(token, config, sessionUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginResponse) {
            LoginResponse loginResponse = (LoginResponse) obj;
            return Intrinsics.areEqual(this.token, loginResponse.token) && Intrinsics.areEqual(this.config, loginResponse.config) && Intrinsics.areEqual(this.sessionUrl, loginResponse.sessionUrl);
        }
        return false;
    }

    public int hashCode() {
        return (((this.token.hashCode() * 31) + this.config.hashCode()) * 31) + this.sessionUrl.hashCode();
    }

    public String toString() {
        return "LoginResponse(token=" + this.token + ", config=" + this.config + ", sessionUrl=" + this.sessionUrl + ')';
    }

    public LoginResponse(String token, ConfigResponse config, String sessionUrl) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sessionUrl, "sessionUrl");
        this.token = token;
        this.config = config;
        this.sessionUrl = sessionUrl;
    }

    public final ConfigResponse getConfig() {
        return this.config;
    }

    public final String getSessionUrl() {
        return this.sessionUrl;
    }

    public final String getToken() {
        return this.token;
    }

    /* compiled from: LoginResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/LoginResponse$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/LoginResponse;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LoginResponse create(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String token = json.optString("token");
            ConfigResponse.Companion companion = ConfigResponse.Companion;
            JSONObject jSONObject = json.getJSONObject("config");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "json.getJSONObject(\"config\")");
            ConfigResponse create = companion.create(jSONObject);
            String sessionUrl = json.optString("sessionUrl");
            Intrinsics.checkNotNullExpressionValue(token, "token");
            Intrinsics.checkNotNullExpressionValue(sessionUrl, "sessionUrl");
            return new LoginResponse(token, create, sessionUrl);
        }
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.token);
        jSONObject.put("config", this.config.toJson());
        jSONObject.put("sessionUrl", this.sessionUrl);
        return jSONObject;
    }
}
