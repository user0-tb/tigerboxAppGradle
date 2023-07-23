package media.tiger.tigerbox.ui.common.reset;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class ResetDialogViewModel_MembersInjector implements MembersInjector<ResetDialogViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public ResetDialogViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<ResetDialogViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new ResetDialogViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ResetDialogViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
