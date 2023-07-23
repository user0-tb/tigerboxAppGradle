package io.shipbook.shipbooksdk.Models;

import io.shipbook.shipbooksdk.Models.BaseLog;
import io.shipbook.shipbooksdk.Models.Login;
import io.shipbook.shipbooksdk.Models.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SessionLogData.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 *2\u00020\u0001:\u0001*B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J=\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lio/shipbook/shipbooksdk/Models/SessionLogData;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "token", "", "login", "Lio/shipbook/shipbooksdk/Models/Login;", "user", "Lio/shipbook/shipbooksdk/Models/User;", "logs", "", "Lio/shipbook/shipbooksdk/Models/BaseLog;", "(Ljava/lang/String;Lio/shipbook/shipbooksdk/Models/Login;Lio/shipbook/shipbooksdk/Models/User;Ljava/util/List;)V", "getLogin", "()Lio/shipbook/shipbooksdk/Models/Login;", "setLogin", "(Lio/shipbook/shipbooksdk/Models/Login;)V", "getLogs", "()Ljava/util/List;", "setLogs", "(Ljava/util/List;)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "getUser", "()Lio/shipbook/shipbooksdk/Models/User;", "setUser", "(Lio/shipbook/shipbooksdk/Models/User;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionLogData implements BaseObj {
    public static final Companion Companion = new Companion(null);
    private Login login;
    private List<BaseLog> logs;
    private String token;
    private User user;

    public SessionLogData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionLogData copy$default(SessionLogData sessionLogData, String str, Login login, User user, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionLogData.token;
        }
        if ((i & 2) != 0) {
            login = sessionLogData.login;
        }
        if ((i & 4) != 0) {
            user = sessionLogData.user;
        }
        if ((i & 8) != 0) {
            list = sessionLogData.logs;
        }
        return sessionLogData.copy(str, login, user, list);
    }

    public final String component1() {
        return this.token;
    }

    public final Login component2() {
        return this.login;
    }

    public final User component3() {
        return this.user;
    }

    public final List<BaseLog> component4() {
        return this.logs;
    }

    public final SessionLogData copy(String str, Login login, User user, List<BaseLog> logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        return new SessionLogData(str, login, user, logs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SessionLogData) {
            SessionLogData sessionLogData = (SessionLogData) obj;
            return Intrinsics.areEqual(this.token, sessionLogData.token) && Intrinsics.areEqual(this.login, sessionLogData.login) && Intrinsics.areEqual(this.user, sessionLogData.user) && Intrinsics.areEqual(this.logs, sessionLogData.logs);
        }
        return false;
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Login login = this.login;
        int hashCode2 = (hashCode + (login == null ? 0 : login.hashCode())) * 31;
        User user = this.user;
        return ((hashCode2 + (user != null ? user.hashCode() : 0)) * 31) + this.logs.hashCode();
    }

    public String toString() {
        return "SessionLogData(token=" + ((Object) this.token) + ", login=" + this.login + ", user=" + this.user + ", logs=" + this.logs + ')';
    }

    public SessionLogData(String str, Login login, User user, List<BaseLog> logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.token = str;
        this.login = login;
        this.user = user;
        this.logs = logs;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final Login getLogin() {
        return this.login;
    }

    public final void setLogin(Login login) {
        this.login = login;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* compiled from: SessionLogData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/SessionLogData$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/SessionLogData;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SessionLogData create(JSONObject json) {
            Login login;
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = json.optString("token");
            User user = null;
            if (json.has("login")) {
                Login.Companion companion = Login.Companion;
                JSONObject jSONObject = json.getJSONObject("login");
                Intrinsics.checkNotNullExpressionValue(jSONObject, "json.getJSONObject(\"login\")");
                login = companion.create(jSONObject);
            } else {
                login = null;
            }
            if (json.has("user")) {
                User.Companion companion2 = User.Companion;
                JSONObject jSONObject2 = json.getJSONObject("user");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.getJSONObject(\"user\")");
                user = companion2.create(jSONObject2);
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = json.getJSONArray("logs");
            int i = 0;
            int length = jSONArray.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = i + 1;
                    BaseLog.Companion companion3 = BaseLog.Companion;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(jSONObject3, "logsArray.getJSONObject(i)");
                    arrayList.add(companion3.create(jSONObject3));
                    if (i == length) {
                        break;
                    }
                    i = i2;
                }
            }
            return new SessionLogData(optString, login, user, arrayList);
        }
    }

    public /* synthetic */ SessionLogData(String str, Login login, User user, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : login, (i & 4) != 0 ? null : user, (i & 8) != 0 ? new ArrayList() : arrayList);
    }

    public final List<BaseLog> getLogs() {
        return this.logs;
    }

    public final void setLogs(List<BaseLog> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.logs = list;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("token", this.token);
        Login login = this.login;
        if (login != null) {
            jSONObject.put("login", login.toJson());
        }
        User user = this.user;
        if (user != null) {
            jSONObject.put("user", user.toJson());
        }
        JSONArray jSONArray = new JSONArray();
        for (BaseLog baseLog : this.logs) {
            jSONArray.put(baseLog.toJson());
        }
        jSONObject.put("logs", jSONArray);
        return jSONObject;
    }
}
