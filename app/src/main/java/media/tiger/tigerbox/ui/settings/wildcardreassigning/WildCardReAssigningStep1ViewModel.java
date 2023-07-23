package media.tiger.tigerbox.ui.settings.wildcardreassigning;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.interfaces.TigerCardsManagerService;
import media.tiger.tigerbox.ui.common.DialogViewModel;

/* compiled from: WildCardReAssigningStep1ViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/wildcardreassigning/WildCardReAssigningStep1ViewModel;", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "tigerCardsManagerService", "Lmedia/tiger/tigerbox/services/interfaces/TigerCardsManagerService;", "(Lmedia/tiger/tigerbox/services/implementations/ButtonService;Lmedia/tiger/tigerbox/services/interfaces/TigerCardsManagerService;)V", "cancelWildcardReassign", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WildCardReAssigningStep1ViewModel extends DialogViewModel {
    private final TigerCardsManagerService tigerCardsManagerService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public WildCardReAssigningStep1ViewModel(ButtonService buttonService, TigerCardsManagerService tigerCardsManagerService) {
        super(buttonService);
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        Intrinsics.checkNotNullParameter(tigerCardsManagerService, "tigerCardsManagerService");
        this.tigerCardsManagerService = tigerCardsManagerService;
    }

    public final void cancelWildcardReassign() {
        this.tigerCardsManagerService.setWildcardReassignModeEnabled(false);
    }
}
