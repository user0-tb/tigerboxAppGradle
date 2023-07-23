package media.tiger.tigerbox.infrastructure.interactor;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import media.tiger.tigerbox.infrastructure.exception.GeneratingCertificateFailure;
import media.tiger.tigerbox.infrastructure.functional.Either;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UseCasePostOnMain.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0000\"\u0006\b\u0001\u0010\u0004 \u0001*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "Lmedia/tiger/tigerbox/infrastructure/functional/Either$Left;", "Lmedia/tiger/tigerbox/infrastructure/exception/GeneratingCertificateFailure$PemRequestFailure;", "Params", "Type", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$3", f = "UseCasePostOnMain.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class UseCasePostOnMain$invoke$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Either.Left<? extends GeneratingCertificateFailure.PemRequestFailure>>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UseCasePostOnMain$invoke$3(Continuation<? super UseCasePostOnMain$invoke$3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UseCasePostOnMain$invoke$3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Either.Left<? extends GeneratingCertificateFailure.PemRequestFailure>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Either.Left<GeneratingCertificateFailure.PemRequestFailure>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Either.Left<GeneratingCertificateFailure.PemRequestFailure>> continuation) {
        return ((UseCasePostOnMain$invoke$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return new Either.Left(GeneratingCertificateFailure.PemRequestFailure.INSTANCE);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
