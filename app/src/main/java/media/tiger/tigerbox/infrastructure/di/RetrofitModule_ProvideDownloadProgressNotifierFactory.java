package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.infrastructure.functional.DownloadProgressUpdate;

/* loaded from: classes3.dex */
public final class RetrofitModule_ProvideDownloadProgressNotifierFactory implements Factory<DownloadProgressUpdate> {
    @Override // javax.inject.Provider
    public DownloadProgressUpdate get() {
        return provideDownloadProgressNotifier();
    }

    public static RetrofitModule_ProvideDownloadProgressNotifierFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DownloadProgressUpdate provideDownloadProgressNotifier() {
        return (DownloadProgressUpdate) Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideDownloadProgressNotifier());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final RetrofitModule_ProvideDownloadProgressNotifierFactory INSTANCE = new RetrofitModule_ProvideDownloadProgressNotifierFactory();

        private InstanceHolder() {
        }
    }
}
