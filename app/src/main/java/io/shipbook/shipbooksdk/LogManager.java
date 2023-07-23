package io.shipbook.shipbooksdk;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import io.shipbook.shipbooksdk.Appenders.AppenderFactory;
import io.shipbook.shipbooksdk.Appenders.BaseAppender;
import io.shipbook.shipbooksdk.Models.BaseLog;
import io.shipbook.shipbooksdk.Models.ConfigResponse;
import io.shipbook.shipbooksdk.Models.Message;
import io.shipbook.shipbooksdk.Models.Severity;
import io.shipbook.shipbooksdk.Networking.SessionManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LogManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lio/shipbook/shipbooksdk/LogManager;", "", "()V", "appenders", "", "", "Lio/shipbook/shipbooksdk/Appenders/BaseAppender;", "Lio/shipbook/shipbooksdk/AppenderMap;", "getAppenders", "()Ljava/util/Map;", "setAppenders", "(Ljava/util/Map;)V", "loggers", "", "Lio/shipbook/shipbooksdk/LogManager$Logger;", "getLoggers", "()Ljava/util/List;", "setLoggers", "(Ljava/util/List;)V", "clear", "", "config", "Lio/shipbook/shipbooksdk/Models/ConfigResponse;", "getCallStackSeverity", "Lio/shipbook/shipbooksdk/Models/Severity;", "tag", "getSeverity", "push", "log", "Lio/shipbook/shipbooksdk/Models/BaseLog;", "Logger", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogManager {
    public static final LogManager INSTANCE = new LogManager();
    private static volatile Map<String, BaseAppender> appenders = new LinkedHashMap();
    private static volatile List<Logger> loggers = new ArrayList();

    /* compiled from: LogManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lio/shipbook/shipbooksdk/LogManager$Logger;", "", "key", "", "severity", "Lio/shipbook/shipbooksdk/Models/Severity;", "callStackSeverity", "appender", "Lio/shipbook/shipbooksdk/Appenders/BaseAppender;", "(Ljava/lang/String;Lio/shipbook/shipbooksdk/Models/Severity;Lio/shipbook/shipbooksdk/Models/Severity;Lio/shipbook/shipbooksdk/Appenders/BaseAppender;)V", "getAppender", "()Lio/shipbook/shipbooksdk/Appenders/BaseAppender;", "getCallStackSeverity", "()Lio/shipbook/shipbooksdk/Models/Severity;", "getKey", "()Ljava/lang/String;", "getSeverity", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Logger {
        private final BaseAppender appender;
        private final Severity callStackSeverity;
        private final String key;
        private final Severity severity;

        public Logger(String key, Severity severity, Severity callStackSeverity, BaseAppender appender) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(severity, "severity");
            Intrinsics.checkNotNullParameter(callStackSeverity, "callStackSeverity");
            Intrinsics.checkNotNullParameter(appender, "appender");
            this.key = key;
            this.severity = severity;
            this.callStackSeverity = callStackSeverity;
            this.appender = appender;
        }

        public final BaseAppender getAppender() {
            return this.appender;
        }

        public final Severity getCallStackSeverity() {
            return this.callStackSeverity;
        }

        public final String getKey() {
            return this.key;
        }

        public final Severity getSeverity() {
            return this.severity;
        }
    }

    private LogManager() {
    }

    public final Map<String, BaseAppender> getAppenders() {
        return appenders;
    }

    public final void setAppenders(Map<String, BaseAppender> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        appenders = map;
    }

    public final List<Logger> getLoggers() {
        return loggers;
    }

    public final void setLoggers(List<Logger> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        loggers = list;
    }

    public final void clear() {
        appenders = new LinkedHashMap();
        loggers = new ArrayList();
    }

    public final void push(BaseLog log) {
        Intrinsics.checkNotNullParameter(log, "log");
        if (log instanceof Message) {
            List<Logger> list = loggers;
            Map<String, BaseAppender> map = appenders;
            HashSet<String> hashSet = new HashSet();
            for (Logger logger : list) {
                Message message = (Message) log;
                String tag = message.getTag();
                Intrinsics.checkNotNull(tag);
                if (StringsKt.startsWith$default(tag, logger.getKey(), false, 2, (Object) null) && message.getSeverity().ordinal() <= logger.getSeverity().ordinal()) {
                    hashSet.add(logger.getAppender().getName());
                }
            }
            for (String str : hashSet) {
                BaseAppender baseAppender = map.get(str);
                if (baseAppender != null) {
                    baseAppender.push(log);
                }
            }
            return;
        }
        for (Map.Entry<String, BaseAppender> entry : appenders.entrySet()) {
            entry.getValue().push(log);
        }
    }

    public final Severity getSeverity(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<Logger> list = loggers;
        Severity severity = Severity.Off;
        for (Logger logger : list) {
            if (StringsKt.startsWith$default(tag, logger.getKey(), false, 2, (Object) null) && logger.getSeverity().ordinal() > severity.ordinal()) {
                severity = logger.getSeverity();
            }
        }
        return severity;
    }

    public final Severity getCallStackSeverity(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<Logger> list = loggers;
        Severity severity = Severity.Off;
        for (Logger logger : list) {
            if (StringsKt.startsWith$default(tag, logger.getKey(), false, 2, (Object) null) && logger.getCallStackSeverity().ordinal() > severity.ordinal()) {
                severity = logger.getCallStackSeverity();
            }
        }
        return severity;
    }

    public final void config(ConfigResponse config) {
        Intrinsics.checkNotNullParameter(config, "config");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ConfigResponse.AppenderResponse appenderResponse : config.getAppenders()) {
            BaseAppender baseAppender = appenders.get(appenderResponse.getName());
            if (baseAppender != null) {
                baseAppender.update(appenderResponse.getConfig());
                linkedHashMap.put(appenderResponse.getName(), baseAppender);
            } else {
                BaseAppender create = AppenderFactory.INSTANCE.create(appenderResponse.getType(), appenderResponse.getName(), appenderResponse.getConfig());
                if (create != null) {
                    linkedHashMap.put(appenderResponse.getName(), create);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (ConfigResponse.LoggerResponse loggerResponse : config.getLoggers()) {
            BaseAppender baseAppender2 = (BaseAppender) linkedHashMap.get(loggerResponse.getAppenderRef());
            if (baseAppender2 != null) {
                arrayList.add(new Logger(loggerResponse.getName(), loggerResponse.getSeverity(), loggerResponse.getCallStackSeverity(), baseAppender2));
            }
        }
        appenders = linkedHashMap;
        loggers = arrayList;
        Context appContext = SessionManager.INSTANCE.getAppContext();
        Intrinsics.checkNotNull(appContext);
        LocalBroadcastManager.getInstance(appContext).sendBroadcast(new Intent(BroadcastNames.INSTANCE.getCONFIG_CHANGE()));
    }
}
