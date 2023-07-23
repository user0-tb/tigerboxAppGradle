package media.tiger.tigerbox.ui.onboarding.step3.security;

import android.util.Base64;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Base64Converter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step3/security/AndroidBase64Converter;", "Lmedia/tiger/tigerbox/ui/onboarding/step3/security/Base64Converter;", "()V", "invoke", "", TypedValues.Custom.S_STRING, "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AndroidBase64Converter implements Base64Converter {
    public static final AndroidBase64Converter INSTANCE = new AndroidBase64Converter();

    private AndroidBase64Converter() {
    }

    @Override // media.tiger.tigerbox.ui.onboarding.step3.security.Base64Converter
    public byte[] invoke(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        byte[] decode = Base64.decode(string, 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(string, Base64.DEFAULT)");
        return decode;
    }
}
