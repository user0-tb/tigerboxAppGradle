package media.tiger.tigerbox.services.implementations;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Availability.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "media.tiger.tigerbox.services.implementations.Availability$parseM3U8s$1", f = "Availability.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Availability$parseM3U8s$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $file;
    final /* synthetic */ Ref.ObjectRef<String> $localFileContent;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Availability$parseM3U8s$1(File file, Ref.ObjectRef<String> objectRef, Continuation<? super Availability$parseM3U8s$1> continuation) {
        super(2, continuation);
        this.$file = file;
        this.$localFileContent = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Availability$parseM3U8s$1(this.$file, this.$localFileContent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Availability$parseM3U8s$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #7 {Exception -> 0x0072, blocks: (B:30:0x006a, B:32:0x006f), top: B:43:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            if (r0 != 0) goto L73
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = 0
            java.io.FileWriter r0 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            java.io.File r1 = r6.$file     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            java.io.File r1 = r1.getAbsoluteFile()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3f
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2 = r0
            java.io.Writer r2 = (java.io.Writer) r2     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.String> r7 = r6.$localFileContent     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L67
            T r7 = r7.element     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L67
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L67
            r1.write(r7)     // Catch: java.lang.Exception -> L2e java.lang.Throwable -> L67
            r1.close()     // Catch: java.lang.Exception -> L64
        L2a:
            r0.close()     // Catch: java.lang.Exception -> L64
            goto L64
        L2e:
            r7 = move-exception
            goto L43
        L30:
            r1 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
            goto L68
        L35:
            r1 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
            goto L43
        L3a:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r0 = r1
            goto L68
        L3f:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r0 = r1
        L43:
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest     // Catch: java.lang.Throwable -> L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r3.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "Availability exception parseM3U8s: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L67
            r3.append(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> L67
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L67
            r2.e(r7, r3)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L61
            r1.close()     // Catch: java.lang.Exception -> L64
        L61:
            if (r0 == 0) goto L64
            goto L2a
        L64:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L67:
            r7 = move-exception
        L68:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Exception -> L72
        L6d:
            if (r0 == 0) goto L72
            r0.close()     // Catch: java.lang.Exception -> L72
        L72:
            throw r7
        L73:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.services.implementations.Availability$parseM3U8s$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
