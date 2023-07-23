package media.tiger.tigerbox.ui.common.reset;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.interfaces.InfoSoundService;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class ResetDialogViewModel_Factory implements Factory<ResetDialogViewModel> {
    private final Provider<LightControlService> _lightControlProvider;
    private final Provider<ButtonService> buttonServiceProvider;
    private final Provider<InfoSoundService> infoSoundServiceProvider;

    public ResetDialogViewModel_Factory(Provider<ButtonService> buttonServiceProvider, Provider<InfoSoundService> infoSoundServiceProvider, Provider<LightControlService> _lightControlProvider) {
        this.buttonServiceProvider = buttonServiceProvider;
        this.infoSoundServiceProvider = infoSoundServiceProvider;
        this._lightControlProvider = _lightControlProvider;
    }

    @Override // javax.inject.Provider
    public ResetDialogViewModel get() {
        ResetDialogViewModel newInstance = newInstance(this.buttonServiceProvider.get(), this.infoSoundServiceProvider.get());
        BaseViewModel_MembersInjector.inject_lightControl(newInstance, this._lightControlProvider.get());
        return newInstance;
    }

    public static ResetDialogViewModel_Factory create(Provider<ButtonService> buttonServiceProvider, Provider<InfoSoundService> infoSoundServiceProvider, Provider<LightControlService> _lightControlProvider) {
        return new ResetDialogViewModel_Factory(buttonServiceProvider, infoSoundServiceProvider, _lightControlProvider);
    }

    public static ResetDialogViewModel newInstance(ButtonService buttonService, InfoSoundService infoSoundService) {
        return new ResetDialogViewModel(buttonService, infoSoundService);
    }
}
