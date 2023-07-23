package media.tiger.tigerbox.ui.onboarding.step3.security;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FileDigestValidator.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00012*\u0010\u0002\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00040\u0003\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"replace", "", "replacements", "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)Ljava/lang/String;", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileDigestValidatorKt {
    public static final String replace(String str, Pair<String, String>... replacements) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(replacements, "replacements");
        String str2 = str;
        for (Pair<String, String> pair : replacements) {
            str2 = StringsKt.replace$default(str2, pair.component1(), pair.component2(), false, 4, (Object) null);
        }
        return str2;
    }
}
