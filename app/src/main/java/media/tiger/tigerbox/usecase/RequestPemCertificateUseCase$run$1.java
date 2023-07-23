package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;
import media.tiger.tigerbox.model.domain.PemResponse;
import media.tiger.tigerbox.usecase.RequestPemCertificateUseCase;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RequestPemCertificateUseCase.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.usecase.RequestPemCertificateUseCase", f = "RequestPemCertificateUseCase.kt", i = {0, 0}, l = {54}, m = "run", n = {"params", "certificateSigningRequest"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class RequestPemCertificateUseCase$run$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RequestPemCertificateUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPemCertificateUseCase$run$1(RequestPemCertificateUseCase requestPemCertificateUseCase, Continuation<? super RequestPemCertificateUseCase$run$1> continuation) {
        super(continuation);
        this.this$0 = requestPemCertificateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.run((RequestPemCertificateUseCase.RequestPemCertificateParams) null, (Continuation<? super Either<? extends Failure, ? extends PemResponse>>) this);
    }
}
