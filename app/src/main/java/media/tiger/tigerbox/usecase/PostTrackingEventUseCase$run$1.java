package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.model.dto.PlaybackTrackingEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostTrackingEventUseCase.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.usecase.PostTrackingEventUseCase", f = "PostTrackingEventUseCase.kt", i = {0}, l = {20}, m = "run", n = {"params"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class PostTrackingEventUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostTrackingEventUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTrackingEventUseCase$run$1(PostTrackingEventUseCase postTrackingEventUseCase, Continuation<? super PostTrackingEventUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = postTrackingEventUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run2((PostTrackingEventParameters) null, (Continuation<? super Either<? extends Failure, PlaybackTrackingEvent>>) this);
    }
}
