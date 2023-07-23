package dagger.hilt.android.migration;

import android.app.Application;
import dagger.hilt.android.internal.migration.HasCustomInject;
import dagger.hilt.internal.Preconditions;

/* loaded from: classes3.dex */
public final class CustomInjection {
    public static void inject(Application app) {
        Preconditions.checkNotNull(app);
        Preconditions.checkArgument(app instanceof HasCustomInject, "'%s' is not a custom inject application. Check that you have annotated the application with both @HiltAndroidApp and @CustomInject.", app.getClass());
        ((HasCustomInject) app).customInject();
    }

    private CustomInjection() {
    }
}
