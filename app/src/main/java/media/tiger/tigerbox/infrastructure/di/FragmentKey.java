package media.tiger.tigerbox.infrastructure.di;

import androidx.fragment.app.Fragment;
import dagger.MapKey;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

/* compiled from: FragmentKey.kt */
@MapKey
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/di/FragmentKey;", "", "value", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/Fragment;", "()Ljava/lang/Class;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
/* loaded from: classes3.dex */
public @interface FragmentKey {
    Class<? extends Fragment> value();
}
