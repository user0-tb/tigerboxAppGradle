package media.tiger.tigerbox.ui.settings;

import dagger.MembersInjector;
import javax.inject.Provider;
import media.tiger.tigerbox.services.interfaces.LightControlService;
import media.tiger.tigerbox.ui.common.BaseViewModel_MembersInjector;

/* loaded from: classes4.dex */
public final class FullScreenSeekBarViewModel_MembersInjector implements MembersInjector<FullScreenSeekBarViewModel> {
    private final Provider<LightControlService> _lightControlProvider;

    public FullScreenSeekBarViewModel_MembersInjector(Provider<LightControlService> _lightControlProvider) {
        this._lightControlProvider = _lightControlProvider;
    }

    public static MembersInjector<FullScreenSeekBarViewModel> create(Provider<LightControlService> _lightControlProvider) {
        return new FullScreenSeekBarViewModel_MembersInjector(_lightControlProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FullScreenSeekBarViewModel instance) {
        BaseViewModel_MembersInjector.inject_lightControl(instance, this._lightControlProvider.get());
    }
}
