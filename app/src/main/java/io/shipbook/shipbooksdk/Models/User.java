package io.shipbook.shipbooksdk.Models;

import androidx.core.app.NotificationCompat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: User.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 #2\u00020\u0001:\u0001#BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J[\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006$"}, d2 = {"Lio/shipbook/shipbooksdk/Models/User;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "userId", "", "userName", "fullName", NotificationCompat.CATEGORY_EMAIL, "phoneNumber", "additionalInfo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAdditionalInfo", "()Ljava/util/Map;", "getEmail", "()Ljava/lang/String;", "getFullName", "getPhoneNumber", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class User implements BaseObj {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> additionalInfo;
    private final String email;
    private final String fullName;
    private final String phoneNumber;
    private final String userId;
    private final String userName;

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.userId;
        }
        if ((i & 2) != 0) {
            str2 = user.userName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = user.fullName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = user.email;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = user.phoneNumber;
        }
        String str9 = str5;
        Map<String, String> map2 = map;
        if ((i & 32) != 0) {
            map2 = user.additionalInfo;
        }
        return user.copy(str, str6, str7, str8, str9, map2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.fullName;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.phoneNumber;
    }

    public final Map<String, String> component6() {
        return this.additionalInfo;
    }

    public final User copy(String userId, String str, String str2, String str3, String str4, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new User(userId, str, str2, str3, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            return Intrinsics.areEqual(this.userId, user.userId) && Intrinsics.areEqual(this.userName, user.userName) && Intrinsics.areEqual(this.fullName, user.fullName) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.phoneNumber, user.phoneNumber) && Intrinsics.areEqual(this.additionalInfo, user.additionalInfo);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.userId.hashCode() * 31;
        String str = this.userName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phoneNumber;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.additionalInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "User(userId=" + this.userId + ", userName=" + ((Object) this.userName) + ", fullName=" + ((Object) this.fullName) + ", email=" + ((Object) this.email) + ", phoneNumber=" + ((Object) this.phoneNumber) + ", additionalInfo=" + this.additionalInfo + ')';
    }

    public User(String userId, String str, String str2, String str3, String str4, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.userName = str;
        this.fullName = str2;
        this.email = str3;
        this.phoneNumber = str4;
        this.additionalInfo = map;
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? map : null);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* compiled from: User.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/User$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/User;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final User create(JSONObject json) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(json, "json");
            String userId = json.optString("userId");
            String optString = json.optString("userName", null);
            String optString2 = json.optString("fullName", null);
            String optString3 = json.optString(NotificationCompat.CATEGORY_EMAIL, null);
            String optString4 = json.optString("phoneNumber", null);
            JSONObject optJSONObject = json.optJSONObject("additionalInfo");
            if (optJSONObject != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator<String> keys = optJSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "additionalInfoObject.keys()");
                while (keys.hasNext()) {
                    String it = keys.next();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    String optString5 = optJSONObject.optString(it);
                    Intrinsics.checkNotNullExpressionValue(optString5, "additionalInfoObject.optString(it)");
                    linkedHashMap2.put(it, optString5);
                }
                linkedHashMap = linkedHashMap2;
            } else {
                linkedHashMap = null;
            }
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            return new User(userId, optString, optString2, optString3, optString4, linkedHashMap);
        }
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", this.userId);
        jSONObject.putOpt("userName", this.userName);
        jSONObject.putOpt("fullName", this.fullName);
        jSONObject.putOpt(NotificationCompat.CATEGORY_EMAIL, this.email);
        jSONObject.putOpt("phoneNumber", this.phoneNumber);
        if (this.additionalInfo != null) {
            JSONObject jSONObject2 = new JSONObject();
            Iterator<T> it = this.additionalInfo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject.putOpt("additionalInfo", jSONObject2);
        }
        return jSONObject;
    }
}
