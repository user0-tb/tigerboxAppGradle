package media.tiger.tigerbox.ui.onboarding.step3.security;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: FileDigestValidator.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0002J)\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J+\u0010\u001b\u001a\u00020\u000f2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u000f0\rH\u0016J+\u0010 \u001a\u00020\u000f2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u000f0\rH\u0016J\u0016\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u00062\u0006\u0010#\u001a\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/security/FileDigestValidator;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/security/DigestValidator;", "()V", "BUFFER_SIZE", "", "KEY_ALGORITHM", "", "PUBLIC_KEY_END", "PUBLIC_KEY_START", "PUBLIC_KEY_START_NEW_LINE", "SIGNATURE_ALGORITHM", "observers", "", "Lkotlin/Function1;", "", "", "invoke", "", "fileToValidate", "", "publicKeyString", "signatureFile", "base64Converter", "Lmedia/tiger/tigerbox/ui/onboarding/step3/security/Base64Converter;", "signatureAsString", "notify", "data", "subscribe", "listener", "Lkotlin/ParameterName;", "name", "percentComplete", "unsubscribe", "toX509PublicKey", "Ljava/security/PublicKey;", "converter", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileDigestValidator implements DigestValidator {
    private static final int BUFFER_SIZE = 1048576;
    private static final String KEY_ALGORITHM = "RSA";
    private static final String PUBLIC_KEY_END = "-----END PUBLIC KEY-----";
    private static final String PUBLIC_KEY_START = "-----BEGIN PUBLIC KEY-----";
    private static final String PUBLIC_KEY_START_NEW_LINE = "-----BEGIN PUBLIC KEY-----\n";
    private static final String SIGNATURE_ALGORITHM = "SHA256WithRSA";
    public static final FileDigestValidator INSTANCE = new FileDigestValidator();
    private static final List<Function1<Double, Unit>> observers = new ArrayList();

    private FileDigestValidator() {
    }

    @Override // media.tiger.tigerbox.infrastructure.functional.ObservableUpdate
    public /* bridge */ /* synthetic */ void notify(Double d) {
        notify(d.doubleValue());
    }

    private final PublicKey toX509PublicKey(String str, Base64Converter base64Converter) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(base64Converter.invoke(FileDigestValidatorKt.replace(str, TuplesKt.to(PUBLIC_KEY_START_NEW_LINE, ""), TuplesKt.to(PUBLIC_KEY_START, ""), TuplesKt.to(PUBLIC_KEY_END, ""))));
            KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
            Intrinsics.checkNotNullExpressionValue(keyFactory, "getInstance(KEY_ALGORITHM)");
            return keyFactory.generatePublic(x509EncodedKeySpec);
        } catch (InvalidKeySpecException e) {
            Timber.Forest forest = Timber.Forest;
            forest.e("ValidateReleasesDigest: Invalid Key Spec exception: [" + e + ']', new Object[0]);
            return null;
        }
    }

    @Override // media.tiger.tigerbox.ui.onboarding.step3.security.DigestValidator
    public boolean invoke(byte[] fileToValidate, String publicKeyString, byte[] signatureFile, Base64Converter base64Converter) {
        Intrinsics.checkNotNullParameter(fileToValidate, "fileToValidate");
        Intrinsics.checkNotNullParameter(publicKeyString, "publicKeyString");
        Intrinsics.checkNotNullParameter(signatureFile, "signatureFile");
        Intrinsics.checkNotNullParameter(base64Converter, "base64Converter");
        PublicKey x509PublicKey = toX509PublicKey(publicKeyString, base64Converter);
        if (x509PublicKey == null) {
            return false;
        }
        try {
            Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
            signature.initVerify(x509PublicKey);
            signature.update(fileToValidate);
            Intrinsics.checkNotNullExpressionValue(signature, "getInstance(SIGNATURE_AL…ToValidate)\n            }");
            return signature.verify(signatureFile);
        } catch (SignatureException e) {
            Timber.Forest forest = Timber.Forest;
            forest.e("ValidateReleasesDigest: Signature exception: [" + e + ']', new Object[0]);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cc, code lost:
        if (r6 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0115, code lost:
        if (r6 == null) goto L27;
     */
    @Override // media.tiger.tigerbox.ui.onboarding.step3.security.DigestValidator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(java.lang.String r19, java.lang.String r20, java.lang.String r21, media.tiger.tigerbox.ui.onboarding.step3.security.Base64Converter r22) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: media.tiger.tigerbox.ui.onboarding.step3.security.FileDigestValidator.invoke(java.lang.String, java.lang.String, java.lang.String, media.tiger.tigerbox.ui.onboarding.step3.security.Base64Converter):boolean");
    }

    @Override // media.tiger.tigerbox.infrastructure.functional.ObservableUpdate
    public void subscribe(Function1<? super Double, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<Function1<Double, Unit>> list = observers;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @Override // media.tiger.tigerbox.infrastructure.functional.ObservableUpdate
    public void unsubscribe(Function1<? super Double, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<Function1<Double, Unit>> list = observers;
        if (list.contains(listener)) {
            list.remove(listener);
        }
    }

    public void notify(double d) {
        Timber.Forest forest = Timber.Forest;
        forest.d("ValidateReleasesDigest: loading encoded firmware: " + d + "% file read complete", new Object[0]);
        Iterator<T> it = observers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Double.valueOf(d));
        }
    }
}
