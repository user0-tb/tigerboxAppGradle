package media.tiger.tigerbox.infrastructure.interactor;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UseCasePostOnMain.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain", f = "UseCasePostOnMain.kt", i = {}, l = {18, 19, 23}, m = "invoke", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UseCasePostOnMain$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UseCasePostOnMain<Params, Type> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCasePostOnMain$invoke$1(UseCasePostOnMain<? super Params, ? extends Type> useCasePostOnMain, Continuation<? super UseCasePostOnMain$invoke$1> continuation) {
        super(continuation);
        this.this$0 = useCasePostOnMain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
