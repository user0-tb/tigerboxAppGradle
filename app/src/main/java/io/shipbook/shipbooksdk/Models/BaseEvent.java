package io.shipbook.shipbooksdk.Models;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/shipbook/shipbooksdk/Models/BaseEvent;", "Lio/shipbook/shipbooksdk/Models/BaseLog;", SessionDescription.ATTR_TYPE, "", "(Ljava/lang/String;)V", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BaseEvent extends BaseLog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEvent(String type) {
        super(type, 0, null, null, 14, null);
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
