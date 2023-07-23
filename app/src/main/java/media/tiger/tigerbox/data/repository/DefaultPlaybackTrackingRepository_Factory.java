package media.tiger.tigerbox.data.repository;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.data.database.TigerBoxDatabase;

/* loaded from: classes3.dex */
public final class DefaultPlaybackTrackingRepository_Factory implements Factory<DefaultPlaybackTrackingRepository> {
    private final Provider<TigerBoxDatabase> tigerBoxDataBaseProvider;

    public DefaultPlaybackTrackingRepository_Factory(Provider<TigerBoxDatabase> tigerBoxDataBaseProvider) {
        this.tigerBoxDataBaseProvider = tigerBoxDataBaseProvider;
    }

    @Override // javax.inject.Provider
    public DefaultPlaybackTrackingRepository get() {
        return newInstance(this.tigerBoxDataBaseProvider.get());
    }

    public static DefaultPlaybackTrackingRepository_Factory create(Provider<TigerBoxDatabase> tigerBoxDataBaseProvider) {
        return new DefaultPlaybackTrackingRepository_Factory(tigerBoxDataBaseProvider);
    }

    public static DefaultPlaybackTrackingRepository newInstance(TigerBoxDatabase tigerBoxDataBase) {
        return new DefaultPlaybackTrackingRepository(tigerBoxDataBase);
    }
}
