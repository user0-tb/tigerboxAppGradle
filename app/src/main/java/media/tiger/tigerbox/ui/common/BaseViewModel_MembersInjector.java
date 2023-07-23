package media.tiger.tigerbox.ui.common;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;

/* loaded from: classes4.dex */
public final class BaseViewModel_MembersInjector implements MembersInjector<BaseViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public BaseViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<BaseViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new BaseViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(BaseViewModel instance) {
        inject_lightControl(instance, this._lightControlProvider.get());
    }

    public static void inject_lightControl(BaseViewModel instance, LightControlService _lightControl) {
        instance._lightControl = _lightControl;
    }
}
