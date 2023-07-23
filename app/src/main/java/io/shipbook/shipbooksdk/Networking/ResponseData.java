package io.shipbook.shipbooksdk.Networking;

import io.shipbook.shipbooksdk.Models.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: ConnectionClient.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/shipbook/shipbooksdk/Networking/ResponseData;", "", "ok", "", "statusCode", "", "data", "", "(ZILjava/lang/String;)V", "Lorg/json/JSONObject;", "getData", "()Lorg/json/JSONObject;", "error", "Lio/shipbook/shipbooksdk/Models/ErrorResponse;", "getError", "()Lio/shipbook/shipbooksdk/Models/ErrorResponse;", "getOk", "()Z", "getStatusCode", "()I", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResponseData {
    private final JSONObject data;
    private final ErrorResponse error;
    private final boolean ok;
    private final int statusCode;

    public ResponseData(boolean z, int i, String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.ok = z;
        this.statusCode = i;
        ErrorResponse errorResponse = null;
        JSONObject jSONObject = StringsKt.isBlank(data) ^ true ? new JSONObject(data) : null;
        this.data = jSONObject;
        if (jSONObject != null && !z) {
            errorResponse = ErrorResponse.Companion.create(jSONObject);
        }
        this.error = errorResponse;
    }

    public /* synthetic */ ResponseData(boolean z, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str);
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final JSONObject getData() {
        return this.data;
    }

    public final ErrorResponse getError() {
        return this.error;
    }
}
