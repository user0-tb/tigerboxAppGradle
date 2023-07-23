package media.tiger.tigerbox.ui.settings.wildcardreassigning;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class WildCardReAssigningStep2ViewModel_MembersInjector implements MembersInjector<WildCardReAssigningStep2ViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public WildCardReAssigningStep2ViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<WildCardReAssigningStep2ViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new WildCardReAssigningStep2ViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(WildCardReAssigningStep2ViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
