package media.tiger.tigerbox.infrastructure.di;

import android.app.AlarmManager;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class AndroidModule_ProvideAlarmManagerFactory implements Factory<AlarmManager> {
    private final Provider<Context> contextProvider;

    public AndroidModule_ProvideAlarmManagerFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public AlarmManager get() {
        return provideAlarmManager(this.contextProvider.get());
    }

    public static AndroidModule_ProvideAlarmManagerFactory create(Provider<Context> contextProvider) {
        return new AndroidModule_ProvideAlarmManagerFactory(contextProvider);
    }

    public static AlarmManager provideAlarmManager(Context context) {
        return (AlarmManager) Preconditions.checkNotNullFromProvides(AndroidModule.INSTANCE.provideAlarmManager(context));
    }
}
