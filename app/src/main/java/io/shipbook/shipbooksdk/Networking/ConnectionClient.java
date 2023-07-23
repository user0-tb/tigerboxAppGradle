package io.shipbook.shipbooksdk.Networking;

import io.shipbook.shipbooksdk.Models.BaseObj;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* compiled from: ConnectionClient.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0010J-\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J1\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lio/shipbook/shipbooksdk/Networking/ConnectionClient;", "", "()V", "baseUrl", "", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "request", "Lio/shipbook/shipbooksdk/Networking/ResponseData;", "url", "data", "Lio/shipbook/shipbooksdk/Models/BaseObj;", "method", "Lio/shipbook/shipbooksdk/Networking/HttpMethod;", "(Ljava/lang/String;Lio/shipbook/shipbooksdk/Models/BaseObj;Lio/shipbook/shipbooksdk/Networking/HttpMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lio/shipbook/shipbooksdk/Networking/HttpMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Ljava/util/List;Lio/shipbook/shipbooksdk/Networking/HttpMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionClient {
    public static final ConnectionClient INSTANCE = new ConnectionClient();
    private static String baseUrl = "https://api.shipbook.io/v1/";

    private ConnectionClient() {
    }

    public final String getBaseUrl() {
        return baseUrl;
    }

    public final void setBaseUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        baseUrl = str;
    }

    public static /* synthetic */ Object request$default(ConnectionClient connectionClient, String str, List list, HttpMethod httpMethod, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            httpMethod = HttpMethod.GET;
        }
        return connectionClient.request(str, list, httpMethod, continuation);
    }

    public final Object request(String str, List<? extends BaseObj> list, HttpMethod httpMethod, Continuation<? super ResponseData> continuation) {
        JSONArray jSONArray = new JSONArray();
        for (BaseObj baseObj : list) {
            jSONArray.put(baseObj.toJson());
        }
        return request(str, jSONArray.toString(), httpMethod, continuation);
    }

    public static /* synthetic */ Object request$default(ConnectionClient connectionClient, String str, BaseObj baseObj, HttpMethod httpMethod, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            httpMethod = HttpMethod.GET;
        }
        String jSONObject = baseObj.toJson().toString();
        InlineMarker.mark(0);
        Object request = connectionClient.request(str, jSONObject, httpMethod, continuation);
        InlineMarker.mark(1);
        return request;
    }

    private final Object request$$forInline(String str, BaseObj baseObj, HttpMethod httpMethod, Continuation<? super ResponseData> continuation) {
        String jSONObject = baseObj.toJson().toString();
        InlineMarker.mark(0);
        Object request = request(str, jSONObject, httpMethod, continuation);
        InlineMarker.mark(1);
        return request;
    }

    public final Object request(String str, BaseObj baseObj, HttpMethod httpMethod, Continuation<? super ResponseData> continuation) {
        return request(str, baseObj.toJson().toString(), httpMethod, continuation);
    }

    public static /* synthetic */ Object request$default(ConnectionClient connectionClient, String str, String str2, HttpMethod httpMethod, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            httpMethod = HttpMethod.GET;
        }
        return connectionClient.request(str, str2, httpMethod, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2 A[Catch: Exception -> 0x0201, TRY_LEAVE, TryCatch #4 {Exception -> 0x0201, blocks: (B:12:0x0034, B:17:0x0051, B:67:0x01ca, B:69:0x01d2, B:20:0x007f, B:22:0x0085, B:36:0x0115, B:43:0x0144, B:45:0x014d, B:47:0x015f, B:49:0x0168, B:51:0x0173, B:54:0x0190, B:56:0x0199, B:58:0x01a1, B:62:0x01ad, B:64:0x01b5, B:61:0x01a9, B:48:0x0162, B:44:0x0149, B:29:0x00d0, B:31:0x00ff, B:33:0x0108, B:35:0x0112, B:32:0x0102, B:25:0x00c0, B:88:0x01f9, B:89:0x0200, B:34:0x010a, B:50:0x016a), top: B:93:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object request(java.lang.String r23, java.lang.String r24, io.shipbook.shipbooksdk.Networking.HttpMethod r25, kotlin.coroutines.Continuation<? super io.shipbook.shipbooksdk.Networking.ResponseData> r26) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.shipbook.shipbooksdk.Networking.ConnectionClient.request(java.lang.String, java.lang.String, io.shipbook.shipbooksdk.Networking.HttpMethod, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
