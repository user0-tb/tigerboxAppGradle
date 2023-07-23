package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostPlayStateUseCase.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.usecase.PostPlayStateUseCase", f = "PostPlayStateUseCase.kt", i = {}, l = {20}, m = "run", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PostPlayStateUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostPlayStateUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPlayStateUseCase$run$1(PostPlayStateUseCase postPlayStateUseCase, Continuation<? super PostPlayStateUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = postPlayStateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run2((PostProductPlayStateParameters) null, (Continuation<? super Either<? extends Failure, Unit>>) this);
    }
}
