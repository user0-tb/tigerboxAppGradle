package media.tiger.tigerbox.ui.settings.sendLogs;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import media.tiger.tigerbox.ui.settings.sendLogs.SendLogsInProgressViewModel_HiltModules;

/* loaded from: classes4.dex */
public final class SendLogsInProgressViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
    @Override // javax.inject.Provider
    public String get() {
        return provide();
    }

    public static SendLogsInProgressViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String provide() {
        return (String) Preconditions.checkNotNullFromProvides(SendLogsInProgressViewModel_HiltModules.KeyModule.provide());
    }

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {
        private static final SendLogsInProgressViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new SendLogsInProgressViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
