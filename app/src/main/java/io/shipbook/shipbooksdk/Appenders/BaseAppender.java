package io.shipbook.shipbooksdk.Appenders;

import io.shipbook.shipbooksdk.Models.BaseLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseAppender.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J$\u0010\u0010\u001a\u00020\r2\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&R%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lio/shipbook/shipbooksdk/Appenders/BaseAppender;", "", "name", "", "config", "", "Lio/shipbook/shipbooksdk/Appenders/Config;", "(Ljava/lang/String;Ljava/util/Map;)V", "getConfig", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "push", "", "log", "Lio/shipbook/shipbooksdk/Models/BaseLog;", "update", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseAppender {
    private final Map<String, Object> config;
    private final String name;

    public abstract void push(BaseLog baseLog);

    public abstract void update(Map<String, ? extends Object> map);

    public BaseAppender(String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.config = map;
    }

    public final Map<String, Object> getConfig() {
        return this.config;
    }

    public final String getName() {
        return this.name;
    }
}
