package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.model.domain.AccountSubscriptionDomain;
import media.tiger.tigerbox.usecase.GetSubscriptionsUseCase;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetSubscriptionsUseCase.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.usecase.GetSubscriptionsUseCase", f = "GetSubscriptionsUseCase.kt", i = {}, l = {23}, m = "run", n = {}, s = {})
/* loaded from: classes4.dex */
public final class GetSubscriptionsUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetSubscriptionsUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSubscriptionsUseCase$run$1(GetSubscriptionsUseCase getSubscriptionsUseCase, Continuation<? super GetSubscriptionsUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = getSubscriptionsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run2((GetSubscriptionsUseCase.RequestParams) null, (Continuation<? super Either<? extends Failure, AccountSubscriptionDomain>>) this);
    }
}
