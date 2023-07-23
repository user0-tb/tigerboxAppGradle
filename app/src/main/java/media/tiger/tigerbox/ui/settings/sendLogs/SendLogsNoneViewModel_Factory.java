package media.tiger.tigerbox.ui.settings.sendLogs;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class SendLogsNoneViewModel_Factory implements Factory<SendLogsNoneViewModel> {
    private final Provider<LightControlService> _lightControlProvider;
    private final Provider<ButtonService> buttonServiceProvider;

    public SendLogsNoneViewModel_Factory(Provider<ButtonService> buttonServiceProvider, Provider<LightControlService> _lightControlProvider) {
        this.buttonServiceProvider = buttonServiceProvider;
        this._lightControlProvider = _lightControlProvider;
    }

    @Override // javax.inject.Provider
    public SendLogsNoneViewModel get() {
        SendLogsNoneViewModel newInstance = newInstance(this.buttonServiceProvider.get());
        BaseViewModel_MembersInjector.inject_lightControl(newInstance, this._lightControlProvider.get());
        return newInstance;
    }

    public static SendLogsNoneViewModel_Factory create(Provider<ButtonService> buttonServiceProvider, Provider<LightControlService> _lightControlProvider) {
        return new SendLogsNoneViewModel_Factory(buttonServiceProvider, _lightControlProvider);
    }

    public static SendLogsNoneViewModel newInstance(ButtonService buttonService) {
        return new SendLogsNoneViewModel(buttonService);
    }
}
