package io.shipbook.shipbooksdk.Networking;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConnectionClient.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "io.shipbook.shipbooksdk.Networking.ConnectionClient", f = "ConnectionClient.kt", i = {0, 0, 0, 0}, l = {82, 83}, m = "request", n = {"url", "data", "method", "responseData"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
public final class ConnectionClient$request$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConnectionClient this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionClient$request$4(ConnectionClient connectionClient, Continuation<? super ConnectionClient$request$4> continuation) {
        super(continuation);
        this.this$0 = connectionClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.request((String) null, (String) null, (HttpMethod) null, this);
    }
}
