package media.tiger.tigerbox.data.repository;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.data.database.TigerBoxDatabase;

/* loaded from: classes3.dex */
public final class DefaultPlaybackPositionsRepository_Factory implements Factory<DefaultPlaybackPositionsRepository> {
    private final Provider<TigerBoxDatabase> tigerBoxDataBaseProvider;

    public DefaultPlaybackPositionsRepository_Factory(Provider<TigerBoxDatabase> tigerBoxDataBaseProvider) {
        this.tigerBoxDataBaseProvider = tigerBoxDataBaseProvider;
    }

    @Override // javax.inject.Provider
    public DefaultPlaybackPositionsRepository get() {
        return newInstance(this.tigerBoxDataBaseProvider.get());
    }

    public static DefaultPlaybackPositionsRepository_Factory create(Provider<TigerBoxDatabase> tigerBoxDataBaseProvider) {
        return new DefaultPlaybackPositionsRepository_Factory(tigerBoxDataBaseProvider);
    }

    public static DefaultPlaybackPositionsRepository newInstance(TigerBoxDatabase tigerBoxDataBase) {
        return new DefaultPlaybackPositionsRepository(tigerBoxDataBase);
    }
}
