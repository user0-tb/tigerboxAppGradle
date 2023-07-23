package media.tiger.tigerbox.infrastructure.interactor;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.functional.Either;

/* compiled from: UseCasePostOnMain.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\tJ%\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/interactor/UseCasePostOnMain;", "Params", "Type", "", "()V", "invoke", "Lmedia/tiger/tigerbox/infrastructure/functional/Either;", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "run", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class UseCasePostOnMain<Params, Type> {
    public abstract Object run(Params params, Continuation<? super Either<? extends Failure, ? extends Type>> continuation);

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(3:18|19|21))(1:22))(3:26|27|(1:29))|23|(1:25)|19|21))|34|6|7|(0)(0)|23|(0)|19|21) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
        r0.label = 3;
        r9 = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$3(null), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(Params r8, kotlin.coroutines.Continuation<? super media.tiger.tigerbox.infrastructure.functional.Either<? extends media.tiger.tigerbox.infrastructure.exception.Failure, ? extends Type>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$1
            if (r0 == 0) goto L14
            r0 = r9
            media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$1 r0 = (media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$1 r0 = new media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$1
            r0.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            kotlin.ResultKt.throwOnFailure(r9)
            goto L80
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L41
            goto L67
        L3d:
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L41
            goto L4f
        L41:
            goto L6a
        L43:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.label = r6     // Catch: java.lang.Exception -> L41
            java.lang.Object r9 = r7.run(r8, r0)     // Catch: java.lang.Exception -> L41
            if (r9 != r1) goto L4f
            return r1
        L4f:
            media.tiger.tigerbox.infrastructure.functional.Either r9 = (media.tiger.tigerbox.infrastructure.functional.Either) r9     // Catch: java.lang.Exception -> L41
            kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L41
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8     // Catch: java.lang.Exception -> L41
            media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$2 r2 = new media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$2     // Catch: java.lang.Exception -> L41
            r2.<init>(r9, r3)     // Catch: java.lang.Exception -> L41
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch: java.lang.Exception -> L41
            r0.label = r5     // Catch: java.lang.Exception -> L41
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)     // Catch: java.lang.Exception -> L41
            if (r9 != r1) goto L67
            return r1
        L67:
            media.tiger.tigerbox.infrastructure.functional.Either r9 = (media.tiger.tigerbox.infrastructure.functional.Either) r9     // Catch: java.lang.Exception -> L41
            goto L82
        L6a:
            kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$3 r9 = new media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain$invoke$3
            r9.<init>(r3)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r0.label = r4
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r8, r9, r0)
            if (r9 != r1) goto L80
            return r1
        L80:
            media.tiger.tigerbox.infrastructure.functional.Either r9 = (media.tiger.tigerbox.infrastructure.functional.Either) r9
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.infrastructure.interactor.UseCasePostOnMain.invoke(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
