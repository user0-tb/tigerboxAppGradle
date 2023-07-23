package io.shipbook.shipbooksdk.Models;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.shipbook.shipbooksdk.Models.User;
import io.shipbook.shipbooksdk.Networking.SessionManager;
import io.shipbook.shipbooksdk.Util.DateHelper;
import io.shipbook.shipbooksdk.Util.DateHelperKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: Login.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 T2\u00020\u0001:\u0001TBÁ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0016HÆ\u0003J\t\u0010B\u001a\u00020\u0016HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003JÉ\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010M\u001a\u00020\u00162\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u000eHÖ\u0001J\b\u0010Q\u001a\u00020RH\u0016J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010,R\u0011\u0010\u0017\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010,R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001cR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006U"}, d2 = {"Lio/shipbook/shipbooksdk/Models/Login;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "appId", "", "appKey", "os", "appName", "udid", "time", "Ljava/util/Date;", "deviceTime", "osVersion", "appVersion", "appVersionCode", "", "sdkVersion", "sdkVersionCode", "manufacturer", "deviceModel", "deviceName", "language", "isDebug", "", "isObfuscated", "user", "Lio/shipbook/shipbooksdk/Models/User;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLio/shipbook/shipbooksdk/Models/User;)V", "getAppId", "()Ljava/lang/String;", "getAppKey", "getAppName", "getAppVersion", "setAppVersion", "(Ljava/lang/String;)V", "getAppVersionCode", "()I", "setAppVersionCode", "(I)V", "getDeviceModel", "getDeviceName", "getDeviceTime", "()Ljava/util/Date;", "setDeviceTime", "(Ljava/util/Date;)V", "()Z", "getLanguage", "getManufacturer", "getOs", "getOsVersion", "getSdkVersion", "getSdkVersionCode", "getTime", "getUdid", "getUser", "()Lio/shipbook/shipbooksdk/Models/User;", "setUser", "(Lio/shipbook/shipbooksdk/Models/User;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Login implements BaseObj {
    public static final Companion Companion = new Companion(null);
    private final String appId;
    private final String appKey;
    private final String appName;
    private String appVersion;
    private int appVersionCode;
    private final String deviceModel;
    private final String deviceName;
    private Date deviceTime;
    private final boolean isDebug;
    private final boolean isObfuscated;
    private final String language;
    private final String manufacturer;
    private final String os;
    private final String osVersion;
    private final String sdkVersion;
    private final int sdkVersionCode;
    private final Date time;
    private final String udid;
    private User user;

    public final String component1() {
        return this.appId;
    }

    public final int component10() {
        return this.appVersionCode;
    }

    public final String component11() {
        return this.sdkVersion;
    }

    public final int component12() {
        return this.sdkVersionCode;
    }

    public final String component13() {
        return this.manufacturer;
    }

    public final String component14() {
        return this.deviceModel;
    }

    public final String component15() {
        return this.deviceName;
    }

    public final String component16() {
        return this.language;
    }

    public final boolean component17() {
        return this.isDebug;
    }

    public final boolean component18() {
        return this.isObfuscated;
    }

    public final User component19() {
        return this.user;
    }

    public final String component2() {
        return this.appKey;
    }

    public final String component3() {
        return this.os;
    }

    public final String component4() {
        return this.appName;
    }

    public final String component5() {
        return this.udid;
    }

    public final Date component6() {
        return this.time;
    }

    public final Date component7() {
        return this.deviceTime;
    }

    public final String component8() {
        return this.osVersion;
    }

    public final String component9() {
        return this.appVersion;
    }

    public final Login copy(String appId, String appKey, String os, String appName, String udid, Date time, Date deviceTime, String osVersion, String appVersion, int i, String sdkVersion, int i2, String manufacturer, String deviceModel, String deviceName, String language, boolean z, boolean z2, User user) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(udid, "udid");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(language, "language");
        return new Login(appId, appKey, os, appName, udid, time, deviceTime, osVersion, appVersion, i, sdkVersion, i2, manufacturer, deviceModel, deviceName, language, z, z2, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Login) {
            Login login = (Login) obj;
            return Intrinsics.areEqual(this.appId, login.appId) && Intrinsics.areEqual(this.appKey, login.appKey) && Intrinsics.areEqual(this.os, login.os) && Intrinsics.areEqual(this.appName, login.appName) && Intrinsics.areEqual(this.udid, login.udid) && Intrinsics.areEqual(this.time, login.time) && Intrinsics.areEqual(this.deviceTime, login.deviceTime) && Intrinsics.areEqual(this.osVersion, login.osVersion) && Intrinsics.areEqual(this.appVersion, login.appVersion) && this.appVersionCode == login.appVersionCode && Intrinsics.areEqual(this.sdkVersion, login.sdkVersion) && this.sdkVersionCode == login.sdkVersionCode && Intrinsics.areEqual(this.manufacturer, login.manufacturer) && Intrinsics.areEqual(this.deviceModel, login.deviceModel) && Intrinsics.areEqual(this.deviceName, login.deviceName) && Intrinsics.areEqual(this.language, login.language) && this.isDebug == login.isDebug && this.isObfuscated == login.isObfuscated && Intrinsics.areEqual(this.user, login.user);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((this.appId.hashCode() * 31) + this.appKey.hashCode()) * 31) + this.os.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.udid.hashCode()) * 31) + this.time.hashCode()) * 31) + this.deviceTime.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.appVersionCode) * 31) + this.sdkVersion.hashCode()) * 31) + this.sdkVersionCode) * 31) + this.manufacturer.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + this.language.hashCode()) * 31;
        boolean z = this.isDebug;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.isObfuscated;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        User user = this.user;
        return i3 + (user == null ? 0 : user.hashCode());
    }

    public String toString() {
        return "Login(appId=" + this.appId + ", appKey=" + this.appKey + ", os=" + this.os + ", appName=" + this.appName + ", udid=" + this.udid + ", time=" + this.time + ", deviceTime=" + this.deviceTime + ", osVersion=" + this.osVersion + ", appVersion=" + this.appVersion + ", appVersionCode=" + this.appVersionCode + ", sdkVersion=" + this.sdkVersion + ", sdkVersionCode=" + this.sdkVersionCode + ", manufacturer=" + this.manufacturer + ", deviceModel=" + this.deviceModel + ", deviceName=" + this.deviceName + ", language=" + this.language + ", isDebug=" + this.isDebug + ", isObfuscated=" + this.isObfuscated + ", user=" + this.user + ')';
    }

    public Login(String appId, String appKey, String os, String appName, String udid, Date time, Date deviceTime, String osVersion, String appVersion, int i, String sdkVersion, int i2, String manufacturer, String deviceModel, String deviceName, String language, boolean z, boolean z2, User user) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(udid, "udid");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(deviceTime, "deviceTime");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(language, "language");
        this.appId = appId;
        this.appKey = appKey;
        this.os = os;
        this.appName = appName;
        this.udid = udid;
        this.time = time;
        this.deviceTime = deviceTime;
        this.osVersion = osVersion;
        this.appVersion = appVersion;
        this.appVersionCode = i;
        this.sdkVersion = sdkVersion;
        this.sdkVersionCode = i2;
        this.manufacturer = manufacturer;
        this.deviceModel = deviceModel;
        this.deviceName = deviceName;
        this.language = language;
        this.isDebug = z;
        this.isObfuscated = z2;
        this.user = user;
        if (Intrinsics.areEqual(appVersion, "")) {
            Context appContext = SessionManager.INSTANCE.getAppContext();
            Intrinsics.checkNotNull(appContext);
            PackageInfo packageInfo = appContext.getPackageManager().getPackageInfo(appContext.getPackageName(), 0);
            String str = packageInfo.versionName;
            this.appVersion = str != null ? str : "";
            if (Build.VERSION.SDK_INT >= 28) {
                this.appVersionCode = (int) packageInfo.getLongVersionCode();
            } else {
                this.appVersionCode = packageInfo.versionCode;
            }
        }
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final String getOs() {
        return this.os;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ Login(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.Date r28, java.util.Date r29, java.lang.String r30, java.lang.String r31, int r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, boolean r39, boolean r40, io.shipbook.shipbooksdk.Models.User r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.shipbook.shipbooksdk.Models.Login.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Date, java.util.Date, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, io.shipbook.shipbooksdk.Models.User, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getUdid() {
        return this.udid;
    }

    public final Date getTime() {
        return this.time;
    }

    public final Date getDeviceTime() {
        return this.deviceTime;
    }

    public final void setDeviceTime(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.deviceTime = date;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final void setAppVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final int getAppVersionCode() {
        return this.appVersionCode;
    }

    public final void setAppVersionCode(int i) {
        this.appVersionCode = i;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final int getSdkVersionCode() {
        return this.sdkVersionCode;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    public final boolean isObfuscated() {
        return this.isObfuscated;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    /* compiled from: Login.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/Login$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/Login;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Login create(JSONObject json) {
            String str;
            User user;
            Intrinsics.checkNotNullParameter(json, "json");
            String appId = json.optString("appId");
            String appKey = json.optString("appKey");
            String os = json.optString("os");
            String appName = json.optString("appName");
            String udid = json.optString("udid");
            DateHelper dateHelper = DateHelper.INSTANCE;
            String optString = json.optString("time");
            Intrinsics.checkNotNullExpressionValue(optString, "json.optString(\"time\")");
            Date createDateStandard = dateHelper.createDateStandard(optString);
            Intrinsics.checkNotNull(createDateStandard);
            DateHelper dateHelper2 = DateHelper.INSTANCE;
            String optString2 = json.optString("deviceTime");
            Intrinsics.checkNotNullExpressionValue(optString2, "json.optString(\"deviceTime\")");
            Date createDateStandard2 = dateHelper2.createDateStandard(optString2);
            Intrinsics.checkNotNull(createDateStandard2);
            String osVersion = json.optString("osVersion");
            String appVersion = json.optString("appVersion");
            int i = json.getInt("appVersionCode");
            String sdkVersion = json.optString("sdkVersion");
            int i2 = json.getInt("sdkVersionCode");
            String manufacturer = json.optString("manufacturer");
            String deviceModel = json.optString("deviceModel");
            String deviceName = json.optString("deviceName");
            String optString3 = json.optString("language");
            boolean z = json.getBoolean("isDebug");
            boolean z2 = json.getBoolean("isObfuscated");
            if (json.has("user")) {
                str = "language";
                User.Companion companion = User.Companion;
                JSONObject optJSONObject = json.optJSONObject("user");
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "json.optJSONObject(\"user\")");
                user = companion.create(optJSONObject);
            } else {
                str = "language";
                user = null;
            }
            Intrinsics.checkNotNullExpressionValue(appId, "appId");
            Intrinsics.checkNotNullExpressionValue(appKey, "appKey");
            Intrinsics.checkNotNullExpressionValue(os, "os");
            Intrinsics.checkNotNullExpressionValue(appName, "appName");
            Intrinsics.checkNotNullExpressionValue(udid, "udid");
            Intrinsics.checkNotNullExpressionValue(osVersion, "osVersion");
            Intrinsics.checkNotNullExpressionValue(appVersion, "appVersion");
            Intrinsics.checkNotNullExpressionValue(sdkVersion, "sdkVersion");
            Intrinsics.checkNotNullExpressionValue(manufacturer, "manufacturer");
            Intrinsics.checkNotNullExpressionValue(deviceModel, "deviceModel");
            Intrinsics.checkNotNullExpressionValue(deviceName, "deviceName");
            Intrinsics.checkNotNullExpressionValue(optString3, str);
            return new Login(appId, appKey, os, appName, udid, createDateStandard, createDateStandard2, osVersion, appVersion, i, sdkVersion, i2, manufacturer, deviceModel, deviceName, optString3, z, z2, user);
        }
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appId", this.appId);
        jSONObject.put("appKey", this.appKey);
        jSONObject.put("os", this.os);
        jSONObject.put("appName", this.appName);
        jSONObject.put("udid", this.udid);
        jSONObject.put("time", DateHelperKt.toStandardString(this.time));
        jSONObject.put("deviceTime", DateHelperKt.toStandardString(this.deviceTime));
        jSONObject.put("osVersion", this.osVersion);
        jSONObject.put("appVersion", this.appVersion);
        jSONObject.put("appVersionCode", this.appVersionCode);
        jSONObject.put("sdkVersion", this.sdkVersion);
        jSONObject.put("sdkVersionCode", this.sdkVersionCode);
        jSONObject.put("manufacturer", this.manufacturer);
        jSONObject.put("deviceModel", this.deviceModel);
        jSONObject.put("deviceName", this.deviceName);
        jSONObject.put("language", this.language);
        jSONObject.put("isDebug", this.isDebug);
        jSONObject.put("isObfuscated", this.isObfuscated);
        User user = this.user;
        jSONObject.putOpt("user", user == null ? null : user.toJson());
        return jSONObject;
    }
}
