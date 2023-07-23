package media.tiger.tigerbox.ui.common;

import dagger.internal.Factory;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;

/* loaded from: classes4.dex */
public final class BaseViewModel_Factory implements Factory<BaseViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public BaseViewModel_Factory(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    @Override // javax.inject.Provider
    public BaseViewModel get() {
        BaseViewModel newInstance = newInstance();
        BaseViewModel_MembersInjector.inject_lightControl(newInstance, this._lightControlProvider.get());
        return newInstance;
    }

    public static BaseViewModel_Factory create(Provider<LightControlService> _lightControlProvider) {
        return new BaseViewModel_Factory(_lightControlProvider);
    }

    public static BaseViewModel newInstance() {
        return new BaseViewModel();
    }
}
