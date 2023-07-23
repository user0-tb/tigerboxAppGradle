package media.tiger.tigerbox.infrastructure.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.onboarding.step3.security.LargeDownloadHandler;

/* loaded from: classes3.dex */
public final class ProcessModule_ProvideLargeDownloadHandlerFactory implements Factory<LargeDownloadHandler> {
    @Override // javax.inject.Provider
    public LargeDownloadHandler get() {
        return provideLargeDownloadHandler();
    }

    public static ProcessModule_ProvideLargeDownloadHandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LargeDownloadHandler provideLargeDownloadHandler() {
        return (LargeDownloadHandler) Preconditions.checkNotNullFromProvides(ProcessModule.INSTANCE.provideLargeDownloadHandler());
    }

    /* loaded from: classes3.dex */
    private static final class InstanceHolder {
        private static final ProcessModule_ProvideLargeDownloadHandlerFactory INSTANCE = new ProcessModule_ProvideLargeDownloadHandlerFactory();

        private InstanceHolder() {
        }
    }
}
