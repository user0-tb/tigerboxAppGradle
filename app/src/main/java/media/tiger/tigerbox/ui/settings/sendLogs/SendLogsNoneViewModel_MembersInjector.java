package media.tiger.tigerbox.ui.settings.sendLogs;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class SendLogsNoneViewModel_MembersInjector implements MembersInjector<SendLogsNoneViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public SendLogsNoneViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<SendLogsNoneViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new SendLogsNoneViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SendLogsNoneViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
