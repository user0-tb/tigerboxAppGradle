package media.tiger.tigerbox.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HlsKeysRepository.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository", f = "HlsKeysRepository.kt", i = {0, 0}, l = {45}, m = "getHlsKey$suspendImpl", n = {"url", "stringRepresentation"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class DefaultHlsKeysRepository$getHlsKey$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultHlsKeysRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultHlsKeysRepository$getHlsKey$1(DefaultHlsKeysRepository defaultHlsKeysRepository, Continuation<? super DefaultHlsKeysRepository$getHlsKey$1> continuation) {
        super(continuation);
        this.this$0 = defaultHlsKeysRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DefaultHlsKeysRepository.getHlsKey$suspendImpl(this.this$0, null, this);
    }
}
