package media.tiger.tigerbox.usecase;

import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostCrashLogsUseCase.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.usecase.PostCrashLogsUseCase", f = "PostCrashLogsUseCase.kt", i = {0}, l = {23}, m = "run", n = {"params"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class PostCrashLogsUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostCrashLogsUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostCrashLogsUseCase$run$1(PostCrashLogsUseCase postCrashLogsUseCase, Continuation<? super PostCrashLogsUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = postCrashLogsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run((CrashLogsUseCaseParameters) null, (Continuation<? super Either<? extends Failure, ? extends File>>) this);
    }
}
