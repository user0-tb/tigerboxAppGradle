package media.tiger.tigerbox.usecase;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.model.dto.AssetProduct;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetProductAssetsUseCase.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.usecase.GetProductAssetsUseCase", f = "GetProductAssetsUseCase.kt", i = {}, l = {21}, m = "run", n = {}, s = {})
/* loaded from: classes4.dex */
public final class GetProductAssetsUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetProductAssetsUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProductAssetsUseCase$run$1(GetProductAssetsUseCase getProductAssetsUseCase, Continuation<? super GetProductAssetsUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = getProductAssetsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run2((GetProductAssetsParameters) null, (Continuation<? super Either<? extends Failure, ? extends List<AssetProduct>>>) this);
    }
}
