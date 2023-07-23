package media.tiger.tigerbox.usecase.accesstokenrepo;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import media.tiger.tigerbox.infrastructure.functional.Either;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoveAccountDataUseCase.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.usecase.accesstokenrepo.RemoveAccountDataUseCase", f = "RemoveAccountDataUseCase.kt", i = {0}, l = {29, 30}, m = "run", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class RemoveAccountDataUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoveAccountDataUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveAccountDataUseCase$run$1(RemoveAccountDataUseCase removeAccountDataUseCase, Continuation<? super RemoveAccountDataUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = removeAccountDataUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run2((Unit) null, (Continuation<? super Either.Right<Unit>>) this);
    }
}
