package media.tiger.tigerbox.ui.settings.sendLogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class SendLogsFinishedViewModel_MembersInjector implements MembersInjector<SendLogsFinishedViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public SendLogsFinishedViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<SendLogsFinishedViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new SendLogsFinishedViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SendLogsFinishedViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
