package media.tiger.tigerbox.services.implementations;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharedPreferencesStorageService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0006"}, d2 = {"save", "", "Landroid/content/SharedPreferences;", "saveMethod", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharedPreferencesStorageServiceKt {
    public static final void save(SharedPreferences sharedPreferences, Function1<? super SharedPreferences.Editor, Unit> saveMethod) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(saveMethod, "saveMethod");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        saveMethod.invoke(editor);
        editor.apply();
    }
}
