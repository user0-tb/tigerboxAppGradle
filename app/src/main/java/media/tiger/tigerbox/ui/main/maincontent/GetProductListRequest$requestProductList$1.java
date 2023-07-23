package media.tiger.tigerbox.ui.main.maincontent;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetProductListRequest.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.ui.main.maincontent.GetProductListRequest", f = "GetProductListRequest.kt", i = {0, 0}, l = {32}, m = "requestProductList", n = {"this", "mainContentList"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class GetProductListRequest$requestProductList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetProductListRequest this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProductListRequest$requestProductList$1(GetProductListRequest getProductListRequest, Continuation<? super GetProductListRequest$requestProductList$1> continuation) {
        super(continuation);
        this.this$0 = getProductListRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object requestProductList;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        requestProductList = this.this$0.requestProductList(null, null, this);
        return requestProductList;
    }
}
