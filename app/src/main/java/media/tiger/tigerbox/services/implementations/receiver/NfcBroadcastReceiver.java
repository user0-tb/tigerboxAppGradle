package media.tiger.tigerbox.services.implementations.receiver;

import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.interfaces.NfcService;

/* compiled from: NfcBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/receiver/NfcBroadcastReceiver;", "Lmedia/tiger/tigerbox/infrastructure/di/InjectableBroadcastReceiver;", "()V", "nfcService", "Lmedia/tiger/tigerbox/services/interfaces/NfcService;", "getNfcService", "()Lmedia/tiger/tigerbox/services/interfaces/NfcService;", "setNfcService", "(Lmedia/tiger/tigerbox/services/interfaces/NfcService;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class NfcBroadcastReceiver extends Hilt_NfcBroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    public static final String NFC_TRIGGER_ERROR = "tigerbox_nfc_card_triger_data_error";
    @Inject
    public NfcService nfcService;

    public final NfcService getNfcService() {
        NfcService nfcService = this.nfcService;
        if (nfcService != null) {
            return nfcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nfcService");
        return null;
    }

    public final void setNfcService(NfcService nfcService) {
        Intrinsics.checkNotNullParameter(nfcService, "<set-?>");
        this.nfcService = nfcService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r8.equals("android.nfc.action.NDEF_DISCOVERED") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
        if (r8.equals(media.tiger.tigerbox.services.interfaces.NfcService.OLD_NFC_OUT) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (r8.equals(media.tiger.tigerbox.services.interfaces.NfcService.NFC_OUT) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
        if (r8.equals("android.nfc.action.TAG_DISCOVERED") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
        if (r8.equals("android.nfc.action.TECH_DISCOVERED") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
        if (r8.equals(media.tiger.tigerbox.services.interfaces.NfcService.NFC_IN) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
        getNfcService().handleAction(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    @Override // media.tiger.tigerbox.services.implementations.receiver.Hilt_NfcBroadcastReceiver, media.tiger.tigerbox.infrastructure.di.InjectableBroadcastReceiver, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            timber.log.Timber$Forest r0 = timber.log.Timber.Forest
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "NfcBroadcastReceiver "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " onReceive intent "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r0.i(r1, r3)
            super.onReceive(r8, r9)
            if (r9 == 0) goto Le4
            java.lang.String r8 = r9.getAction()
            if (r8 != 0) goto L2e
            java.lang.String r8 = ""
        L2e:
            java.lang.String r0 = "it.action ?: \"\""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            int r0 = r8.hashCode()
            r1 = 93
            switch(r0) {
                case -1703524589: goto Lb8;
                case -1634370981: goto Laf;
                case -1468892125: goto La6;
                case -1269648608: goto L9d;
                case -764375949: goto L94;
                case 1010102913: goto L48;
                case 1865807226: goto L3e;
                default: goto L3c;
            }
        L3c:
            goto Lc9
        L3e:
            java.lang.String r0 = "android.nfc.action.NDEF_DISCOVERED"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc9
            goto Lc1
        L48:
            java.lang.String r0 = "tigerbox_nfc_card_triger_data_error"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L52
            goto Lc9
        L52:
            java.lang.String r0 = "android.nfc.extra.TAG"
            android.os.Parcelable r0 = r9.getParcelableExtra(r0)
            android.nfc.Tag r0 = (android.nfc.Tag) r0
            java.lang.String r3 = "android.nfc.extra.NDEF_MESSAGES"
            android.os.Parcelable[] r3 = r9.getParcelableArrayExtra(r3)
            timber.log.Timber$Forest r4 = timber.log.Timber.Forest
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "NFC Trigger error received action: ["
            r5.append(r6)
            r5.append(r8)
            java.lang.String r8 = "] ["
            r5.append(r8)
            r5.append(r9)
            java.lang.String r8 = "] tag: ["
            r5.append(r8)
            r5.append(r0)
            java.lang.String r8 = "] raw: ["
            r5.append(r8)
            r5.append(r3)
            r5.append(r1)
            java.lang.String r8 = r5.toString()
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r4.e(r8, r9)
            goto Le4
        L94:
            java.lang.String r0 = "tag_away"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lc1
            goto Lc9
        L9d:
            java.lang.String r0 = "com.android.bts84.nfcout"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lc1
            goto Lc9
        La6:
            java.lang.String r0 = "android.nfc.action.TAG_DISCOVERED"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lc1
            goto Lc9
        Laf:
            java.lang.String r0 = "android.nfc.action.TECH_DISCOVERED"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lc1
            goto Lc9
        Lb8:
            java.lang.String r0 = "com.android.bts84.nfcin"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lc1
            goto Lc9
        Lc1:
            media.tiger.tigerbox.services.interfaces.NfcService r0 = r7.getNfcService()
            r0.handleAction(r8, r9)
            goto Le4
        Lc9:
            timber.log.Timber$Forest r9 = timber.log.Timber.Forest
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unknown action: ["
            r0.append(r3)
            r0.append(r8)
            r0.append(r1)
            java.lang.String r8 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r9.e(r8, r0)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.services.implementations.receiver.NfcBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* compiled from: NfcBroadcastReceiver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/receiver/NfcBroadcastReceiver$Companion;", "", "()V", "NFC_TRIGGER_ERROR", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
