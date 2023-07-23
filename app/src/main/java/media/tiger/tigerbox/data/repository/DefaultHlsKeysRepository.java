package media.tiger.tigerbox.data.repository;

import android.content.SharedPreferences;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.data.database.TigerBoxDatabase;
import media.tiger.tigerbox.model.domain.HlsKeyDomain;

/* compiled from: HlsKeysRepository.kt */
@Singleton
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/data/repository/DefaultHlsKeysRepository;", "Lmedia/tiger/tigerbox/data/repository/HlsKeysRepository;", "tigerBoxDataBase", "Lmedia/tiger/tigerbox/data/database/TigerBoxDatabase;", "encryptedSharedPreferences", "Landroid/content/SharedPreferences;", "(Lmedia/tiger/tigerbox/data/database/TigerBoxDatabase;Landroid/content/SharedPreferences;)V", "deleteAlHlsKeys", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHlsKey", "Lmedia/tiger/tigerbox/model/domain/HlsKeyDomain;", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertHlsKey", "key", "(Lmedia/tiger/tigerbox/model/domain/HlsKeyDomain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DefaultHlsKeysRepository implements HlsKeysRepository {
    private final SharedPreferences encryptedSharedPreferences;
    private final TigerBoxDatabase tigerBoxDataBase;

    @Override // media.tiger.tigerbox.data.repository.HlsKeysRepository
    public Object deleteAlHlsKeys(Continuation<? super Unit> continuation) {
        return deleteAlHlsKeys$suspendImpl(this, continuation);
    }

    @Override // media.tiger.tigerbox.data.repository.HlsKeysRepository
    public Object getHlsKey(String str, Continuation<? super HlsKeyDomain> continuation) {
        return getHlsKey$suspendImpl(this, str, continuation);
    }

    @Override // media.tiger.tigerbox.data.repository.HlsKeysRepository
    public Object insertHlsKey(HlsKeyDomain hlsKeyDomain, Continuation<? super Unit> continuation) {
        return insertHlsKey$suspendImpl(this, hlsKeyDomain, continuation);
    }

    @Inject
    public DefaultHlsKeysRepository(TigerBoxDatabase tigerBoxDataBase, SharedPreferences encryptedSharedPreferences) {
        Intrinsics.checkNotNullParameter(tigerBoxDataBase, "tigerBoxDataBase");
        Intrinsics.checkNotNullParameter(encryptedSharedPreferences, "encryptedSharedPreferences");
        this.tigerBoxDataBase = tigerBoxDataBase;
        this.encryptedSharedPreferences = encryptedSharedPreferences;
    }

    static /* synthetic */ Object insertHlsKey$suspendImpl(DefaultHlsKeysRepository defaultHlsKeysRepository, HlsKeyDomain hlsKeyDomain, Continuation continuation) {
        defaultHlsKeysRepository.tigerBoxDataBase.hlsKeysDao().insertPlaybackPosition(hlsKeyDomain);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object getHlsKey$suspendImpl(media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            boolean r0 = r13 instanceof media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository$getHlsKey$1
            if (r0 == 0) goto L14
            r0 = r13
            media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository$getHlsKey$1 r0 = (media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository$getHlsKey$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository$getHlsKey$1 r0 = new media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository$getHlsKey$1
            r0.<init>(r11, r13)
        L19:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r11 = r0.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.throwOnFailure(r13)
            r5 = r11
            r6 = r12
            goto L88
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            kotlin.ResultKt.throwOnFailure(r13)
            media.tiger.tigerbox.data.database.TigerBoxDatabase r13 = r11.tigerBoxDataBase
            media.tiger.tigerbox.data.database.HlsKeysDao r13 = r13.hlsKeysDao()
            media.tiger.tigerbox.model.domain.HlsKeyDomain r13 = r13.getHlsKey(r12)
            if (r13 == 0) goto L56
            timber.log.Timber$Forest r11 = timber.log.Timber.Forest
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r0 = "RETURN FROM NEW STORAGE"
            r11.w(r0, r12)
            return r13
        L56:
            android.content.SharedPreferences r13 = r11.encryptedSharedPreferences
            java.lang.String r2 = ""
            java.lang.String r13 = r13.getString(r12, r2)
            if (r13 == 0) goto L9b
            r2 = r13
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L6b
            r2 = 1
            goto L6c
        L6b:
            r2 = 0
        L6c:
            if (r2 == 0) goto L9b
            media.tiger.tigerbox.model.domain.HlsKeyDomain r2 = new media.tiger.tigerbox.model.domain.HlsKeyDomain
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r2
            r6 = r13
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r4
            java.lang.Object r11 = r11.insertHlsKey(r2, r0)
            if (r11 != r1) goto L86
            return r1
        L86:
            r6 = r12
            r5 = r13
        L88:
            timber.log.Timber$Forest r11 = timber.log.Timber.Forest
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r13 = "RETURN FROM OLD STORAGE"
            r11.w(r13, r12)
            media.tiger.tigerbox.model.domain.HlsKeyDomain r11 = new media.tiger.tigerbox.model.domain.HlsKeyDomain
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r11
        L9b:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository.getHlsKey$suspendImpl(media.tiger.tigerbox.data.repository.DefaultHlsKeysRepository, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object deleteAlHlsKeys$suspendImpl(DefaultHlsKeysRepository defaultHlsKeysRepository, Continuation continuation) {
        defaultHlsKeysRepository.tigerBoxDataBase.hlsKeysDao().deleteAllKeys();
        return Unit.INSTANCE;
    }
}
