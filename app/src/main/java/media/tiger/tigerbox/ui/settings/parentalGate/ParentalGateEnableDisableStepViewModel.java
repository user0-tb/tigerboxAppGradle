package media.tiger.tigerbox.ui.settings.parentalGate;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.interfaces.StorageService;
import media.tiger.tigerbox.ui.common.DialogViewModel;

/* compiled from: ParentalGateEnableDisableStepViewModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/parentalGate/ParentalGateEnableDisableStepViewModel;", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "storageService", "Lmedia/tiger/tigerbox/services/interfaces/StorageService;", "(Lmedia/tiger/tigerbox/services/implementations/ButtonService;Lmedia/tiger/tigerbox/services/interfaces/StorageService;)V", "setParentalGateState", "", "enabled", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ParentalGateEnableDisableStepViewModel extends DialogViewModel {
    private final StorageService storageService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ParentalGateEnableDisableStepViewModel(ButtonService buttonService, StorageService storageService) {
        super(buttonService);
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        Intrinsics.checkNotNullParameter(storageService, "storageService");
        this.storageService = storageService;
    }

    public final void setParentalGateState(boolean z) {
        this.storageService.setParentalGate(z);
    }
}
