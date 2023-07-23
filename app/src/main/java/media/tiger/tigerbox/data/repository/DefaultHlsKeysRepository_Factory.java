package media.tiger.tigerbox.data.repository;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.data.database.TigerBoxDatabase;

/* loaded from: classes3.dex */
public final class DefaultHlsKeysRepository_Factory implements Factory<DefaultHlsKeysRepository> {
    private final Provider<SharedPreferences> encryptedSharedPreferencesProvider;
    private final Provider<TigerBoxDatabase> tigerBoxDataBaseProvider;

    public DefaultHlsKeysRepository_Factory(Provider<TigerBoxDatabase> tigerBoxDataBaseProvider, Provider<SharedPreferences> encryptedSharedPreferencesProvider) {
        this.tigerBoxDataBaseProvider = tigerBoxDataBaseProvider;
        this.encryptedSharedPreferencesProvider = encryptedSharedPreferencesProvider;
    }

    @Override // javax.inject.Provider
    public DefaultHlsKeysRepository get() {
        return newInstance(this.tigerBoxDataBaseProvider.get(), this.encryptedSharedPreferencesProvider.get());
    }

    public static DefaultHlsKeysRepository_Factory create(Provider<TigerBoxDatabase> tigerBoxDataBaseProvider, Provider<SharedPreferences> encryptedSharedPreferencesProvider) {
        return new DefaultHlsKeysRepository_Factory(tigerBoxDataBaseProvider, encryptedSharedPreferencesProvider);
    }

    public static DefaultHlsKeysRepository newInstance(TigerBoxDatabase tigerBoxDataBase, SharedPreferences encryptedSharedPreferences) {
        return new DefaultHlsKeysRepository(tigerBoxDataBase, encryptedSharedPreferences);
    }
}
