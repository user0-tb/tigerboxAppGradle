package media.tiger.tigerbox.ui.common;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;

/* loaded from: classes4.dex */
public final class FullScreenViewModel_MembersInjector implements MembersInjector<FullScreenViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public FullScreenViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<FullScreenViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new FullScreenViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FullScreenViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
