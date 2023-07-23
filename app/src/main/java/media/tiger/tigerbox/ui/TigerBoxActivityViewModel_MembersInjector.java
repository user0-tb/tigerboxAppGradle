package media.tiger.tigerbox.ui;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class TigerBoxActivityViewModel_MembersInjector implements MembersInjector<TigerBoxActivityViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public TigerBoxActivityViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<TigerBoxActivityViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new TigerBoxActivityViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TigerBoxActivityViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
