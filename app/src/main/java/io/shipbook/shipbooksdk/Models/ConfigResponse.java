package io.shipbook.shipbooksdk.Models;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ConfigResponse.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0003\u001f !B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\""}, d2 = {"Lio/shipbook/shipbooksdk/Models/ConfigResponse;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "appenders", "", "Lio/shipbook/shipbooksdk/Models/ConfigResponse$AppenderResponse;", "loggers", "Lio/shipbook/shipbooksdk/Models/ConfigResponse$LoggerResponse;", "eventLoggingDisabled", "", "exceptionReportDisabled", "(Ljava/util/List;Ljava/util/List;ZZ)V", "getAppenders", "()Ljava/util/List;", "getEventLoggingDisabled", "()Z", "getExceptionReportDisabled", "getLoggers", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "", "AppenderResponse", "Companion", "LoggerResponse", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigResponse implements BaseObj {
    public static final Companion Companion = new Companion(null);
    private final List<AppenderResponse> appenders;
    private final boolean eventLoggingDisabled;
    private final boolean exceptionReportDisabled;
    private final List<LoggerResponse> loggers;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigResponse copy$default(ConfigResponse configResponse, List list, List list2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = configResponse.appenders;
        }
        if ((i & 2) != 0) {
            list2 = configResponse.loggers;
        }
        if ((i & 4) != 0) {
            z = configResponse.eventLoggingDisabled;
        }
        if ((i & 8) != 0) {
            z2 = configResponse.exceptionReportDisabled;
        }
        return configResponse.copy(list, list2, z, z2);
    }

    public final List<AppenderResponse> component1() {
        return this.appenders;
    }

    public final List<LoggerResponse> component2() {
        return this.loggers;
    }

    public final boolean component3() {
        return this.eventLoggingDisabled;
    }

    public final boolean component4() {
        return this.exceptionReportDisabled;
    }

    public final ConfigResponse copy(List<AppenderResponse> appenders, List<LoggerResponse> loggers, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(appenders, "appenders");
        Intrinsics.checkNotNullParameter(loggers, "loggers");
        return new ConfigResponse(appenders, loggers, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigResponse) {
            ConfigResponse configResponse = (ConfigResponse) obj;
            return Intrinsics.areEqual(this.appenders, configResponse.appenders) && Intrinsics.areEqual(this.loggers, configResponse.loggers) && this.eventLoggingDisabled == configResponse.eventLoggingDisabled && this.exceptionReportDisabled == configResponse.exceptionReportDisabled;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.appenders.hashCode() * 31) + this.loggers.hashCode()) * 31;
        boolean z = this.eventLoggingDisabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.exceptionReportDisabled;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "ConfigResponse(appenders=" + this.appenders + ", loggers=" + this.loggers + ", eventLoggingDisabled=" + this.eventLoggingDisabled + ", exceptionReportDisabled=" + this.exceptionReportDisabled + ')';
    }

    public ConfigResponse(List<AppenderResponse> appenders, List<LoggerResponse> loggers, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(appenders, "appenders");
        Intrinsics.checkNotNullParameter(loggers, "loggers");
        this.appenders = appenders;
        this.loggers = loggers;
        this.eventLoggingDisabled = z;
        this.exceptionReportDisabled = z2;
    }

    public /* synthetic */ ConfigResponse(List list, List list2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final List<AppenderResponse> getAppenders() {
        return this.appenders;
    }

    public final List<LoggerResponse> getLoggers() {
        return this.loggers;
    }

    public final boolean getEventLoggingDisabled() {
        return this.eventLoggingDisabled;
    }

    /* compiled from: ConfigResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ConfigResponse$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/ConfigResponse;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConfigResponse create(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONArray jSONArray = json.getJSONArray("appenders");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                AppenderResponse.Companion companion = AppenderResponse.Companion;
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "appendersArray.getJSONObject(i)");
                arrayList.add(companion.create(jSONObject));
                i2 = i3;
            }
            JSONArray jSONArray2 = json.getJSONArray("loggers");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            int length2 = jSONArray2.length();
            while (i < length2) {
                int i4 = i + 1;
                LoggerResponse.Companion companion2 = LoggerResponse.Companion;
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "loggersArray.getJSONObject(i)");
                arrayList2.add(companion2.create(jSONObject2));
                i = i4;
            }
            return new ConfigResponse(arrayList, arrayList2, json.optBoolean("eventLoggingDisabled"), json.optBoolean("exceptionReportDisabled"));
        }
    }

    public final boolean getExceptionReportDisabled() {
        return this.exceptionReportDisabled;
    }

    @Override // io.shipbook.shipbooksdk.Models.BaseObj
    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (AppenderResponse appenderResponse : this.appenders) {
            jSONArray.put(appenderResponse.toJson());
        }
        jSONObject.put("appenders", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (LoggerResponse loggerResponse : this.loggers) {
            jSONArray2.put(loggerResponse.toJson());
        }
        jSONObject.put("loggers", jSONArray2);
        jSONObject.put("eventLoggingDisabled", this.eventLoggingDisabled);
        jSONObject.put("exceptionReportDisabled", this.exceptionReportDisabled);
        return jSONObject;
    }

    /* compiled from: ConfigResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\bHÆ\u0003J;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R%\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001c"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ConfigResponse$AppenderResponse;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", SessionDescription.ATTR_TYPE, "", "name", "config", "", "", "Lio/shipbook/shipbooksdk/Appenders/Config;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getConfig", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AppenderResponse implements BaseObj {
        public static final Companion Companion = new Companion(null);
        private final Map<String, Object> config;
        private final String name;
        private final String type;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AppenderResponse copy$default(AppenderResponse appenderResponse, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = appenderResponse.type;
            }
            if ((i & 2) != 0) {
                str2 = appenderResponse.name;
            }
            if ((i & 4) != 0) {
                map = appenderResponse.config;
            }
            return appenderResponse.copy(str, str2, map);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.name;
        }

        public final Map<String, Object> component3() {
            return this.config;
        }

        public final AppenderResponse copy(String type, String name, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            return new AppenderResponse(type, name, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AppenderResponse) {
                AppenderResponse appenderResponse = (AppenderResponse) obj;
                return Intrinsics.areEqual(this.type, appenderResponse.type) && Intrinsics.areEqual(this.name, appenderResponse.name) && Intrinsics.areEqual(this.config, appenderResponse.config);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.type.hashCode() * 31) + this.name.hashCode()) * 31;
            Map<String, Object> map = this.config;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "AppenderResponse(type=" + this.type + ", name=" + this.name + ", config=" + this.config + ')';
        }

        /* compiled from: ConfigResponse.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ConfigResponse$AppenderResponse$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/ConfigResponse$AppenderResponse;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final AppenderResponse create(JSONObject json) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(json, "json");
                String optString = json.optString(SessionDescription.ATTR_TYPE);
                Intrinsics.checkNotNullExpressionValue(optString, "json.optString(\"type\")");
                String optString2 = json.optString("name");
                Intrinsics.checkNotNullExpressionValue(optString2, "json.optString(\"name\")");
                if (json.has("config")) {
                    linkedHashMap = new LinkedHashMap();
                    JSONObject jSONObject = json.getJSONObject("config");
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "configObject.keys()");
                    while (keys.hasNext()) {
                        String it = keys.next();
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        Object obj = jSONObject.get(it);
                        Intrinsics.checkNotNullExpressionValue(obj, "configObject.get(it)");
                        linkedHashMap.put(it, obj);
                    }
                } else {
                    linkedHashMap = null;
                }
                return new AppenderResponse(optString, optString2, linkedHashMap);
            }
        }

        public AppenderResponse(String type, String name, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            this.type = type;
            this.name = name;
            this.config = map;
        }

        public /* synthetic */ AppenderResponse(String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : map);
        }

        public final Map<String, Object> getConfig() {
            return this.config;
        }

        public final String getName() {
            return this.name;
        }

        public final String getType() {
            return this.type;
        }

        @Override // io.shipbook.shipbooksdk.Models.BaseObj
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SessionDescription.ATTR_TYPE, this.type);
            jSONObject.put("name", this.name);
            Map<String, Object> map = this.config;
            if (map != null) {
                JSONObject jSONObject2 = new JSONObject();
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("config", jSONObject2);
            }
            return jSONObject;
        }
    }

    /* compiled from: ConfigResponse.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001e"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ConfigResponse$LoggerResponse;", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "name", "", "severity", "Lio/shipbook/shipbooksdk/Models/Severity;", "callStackSeverity", "appenderRef", "(Ljava/lang/String;Lio/shipbook/shipbooksdk/Models/Severity;Lio/shipbook/shipbooksdk/Models/Severity;Ljava/lang/String;)V", "getAppenderRef", "()Ljava/lang/String;", "getCallStackSeverity", "()Lio/shipbook/shipbooksdk/Models/Severity;", "getName", "getSeverity", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class LoggerResponse implements BaseObj {
        public static final Companion Companion = new Companion(null);
        private final String appenderRef;
        private final Severity callStackSeverity;
        private final String name;
        private final Severity severity;

        public static /* synthetic */ LoggerResponse copy$default(LoggerResponse loggerResponse, String str, Severity severity, Severity severity2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loggerResponse.name;
            }
            if ((i & 2) != 0) {
                severity = loggerResponse.severity;
            }
            if ((i & 4) != 0) {
                severity2 = loggerResponse.callStackSeverity;
            }
            if ((i & 8) != 0) {
                str2 = loggerResponse.appenderRef;
            }
            return loggerResponse.copy(str, severity, severity2, str2);
        }

        public final String component1() {
            return this.name;
        }

        public final Severity component2() {
            return this.severity;
        }

        public final Severity component3() {
            return this.callStackSeverity;
        }

        public final String component4() {
            return this.appenderRef;
        }

        public final LoggerResponse copy(String name, Severity severity, Severity callStackSeverity, String appenderRef) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(severity, "severity");
            Intrinsics.checkNotNullParameter(callStackSeverity, "callStackSeverity");
            Intrinsics.checkNotNullParameter(appenderRef, "appenderRef");
            return new LoggerResponse(name, severity, callStackSeverity, appenderRef);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LoggerResponse) {
                LoggerResponse loggerResponse = (LoggerResponse) obj;
                return Intrinsics.areEqual(this.name, loggerResponse.name) && this.severity == loggerResponse.severity && this.callStackSeverity == loggerResponse.callStackSeverity && Intrinsics.areEqual(this.appenderRef, loggerResponse.appenderRef);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.severity.hashCode()) * 31) + this.callStackSeverity.hashCode()) * 31) + this.appenderRef.hashCode();
        }

        public String toString() {
            return "LoggerResponse(name=" + this.name + ", severity=" + this.severity + ", callStackSeverity=" + this.callStackSeverity + ", appenderRef=" + this.appenderRef + ')';
        }

        /* compiled from: ConfigResponse.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/shipbook/shipbooksdk/Models/ConfigResponse$LoggerResponse$Companion;", "", "()V", "create", "Lio/shipbook/shipbooksdk/Models/ConfigResponse$LoggerResponse;", "json", "Lorg/json/JSONObject;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final LoggerResponse create(JSONObject json) {
                Severity severity;
                Intrinsics.checkNotNullParameter(json, "json");
                String name = json.optString("name");
                String optString = json.optString("severity", Severity.Verbose.name());
                Intrinsics.checkNotNullExpressionValue(optString, "json.optString(\"severity\", Severity.Verbose.name)");
                Severity valueOf = Severity.valueOf(optString);
                if (json.has("callStackSeverity")) {
                    String optString2 = json.optString("callStackSeverity", Severity.Verbose.name());
                    Intrinsics.checkNotNullExpressionValue(optString2, "json.optString(\"callStac…\", Severity.Verbose.name)");
                    severity = Severity.valueOf(optString2);
                } else {
                    severity = Severity.Off;
                }
                String appenderRef = json.optString("appenderRef");
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(appenderRef, "appenderRef");
                return new LoggerResponse(name, valueOf, severity, appenderRef);
            }
        }

        public LoggerResponse(String name, Severity severity, Severity callStackSeverity, String appenderRef) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(severity, "severity");
            Intrinsics.checkNotNullParameter(callStackSeverity, "callStackSeverity");
            Intrinsics.checkNotNullParameter(appenderRef, "appenderRef");
            this.name = name;
            this.severity = severity;
            this.callStackSeverity = callStackSeverity;
            this.appenderRef = appenderRef;
        }

        public /* synthetic */ LoggerResponse(String str, Severity severity, Severity severity2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, severity, (i & 4) != 0 ? Severity.Off : severity2, str2);
        }

        public final String getAppenderRef() {
            return this.appenderRef;
        }

        public final Severity getCallStackSeverity() {
            return this.callStackSeverity;
        }

        public final String getName() {
            return this.name;
        }

        public final Severity getSeverity() {
            return this.severity;
        }

        @Override // io.shipbook.shipbooksdk.Models.BaseObj
        public JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", this.name);
            jSONObject.put("severity", this.severity.toString());
            jSONObject.put("callStackSeverity", this.callStackSeverity.toString());
            jSONObject.put("appenderRef", this.appenderRef);
            return jSONObject;
        }
    }
}
