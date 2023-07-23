package media.tiger.tigerbox.infrastructure.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes3.dex */
public final class StorageModule_ProvideEncryptedSharedPreferencesFactory implements Factory<SharedPreferences> {
    private final Provider<Context> contextProvider;

    public StorageModule_ProvideEncryptedSharedPreferencesFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return provideEncryptedSharedPreferences(this.contextProvider.get());
    }

    public static StorageModule_ProvideEncryptedSharedPreferencesFactory create(Provider<Context> contextProvider) {
        return new StorageModule_ProvideEncryptedSharedPreferencesFactory(contextProvider);
    }

    public static SharedPreferences provideEncryptedSharedPreferences(Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(StorageModule.INSTANCE.provideEncryptedSharedPreferences(context));
    }
}
