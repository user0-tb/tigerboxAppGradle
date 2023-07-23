package media.tiger.tigerbox.ui.settings.sendLogs;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.settings.sendLogs.SendLogsNoneViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class SendLogsNoneViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static SendLogsNoneViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SendLogsNoneViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final SendLogsNoneViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new SendLogsNoneViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
