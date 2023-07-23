package media.tiger.tigerbox.ui.settings.wildcardreassigning;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.interfaces.TigerCardsManagerService;
import media.tiger.tigerbox.ui.common.DialogViewModel;
import media.tiger.tigerbox.usecase.tigerboxuserrepo.GetTigerBoxAccountUseCase;

/* compiled from: WildCardReAssigningStep2ViewModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/wildcardreassigning/WildCardReAssigningStep2ViewModel;", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "tigerCardsManagerService", "Lmedia/tiger/tigerbox/services/interfaces/TigerCardsManagerService;", "getTigerBoxAccountUseCase", "Lmedia/tiger/tigerbox/usecase/tigerboxuserrepo/GetTigerBoxAccountUseCase;", "(Lmedia/tiger/tigerbox/services/implementations/ButtonService;Lmedia/tiger/tigerbox/services/interfaces/TigerCardsManagerService;Lmedia/tiger/tigerbox/usecase/tigerboxuserrepo/GetTigerBoxAccountUseCase;)V", "accountEmail", "", "getAccountEmail", "()Ljava/lang/String;", "cancelWildcardReassign", "", "continueToStep3", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WildCardReAssigningStep2ViewModel extends DialogViewModel {
    private final GetTigerBoxAccountUseCase getTigerBoxAccountUseCase;
    private final TigerCardsManagerService tigerCardsManagerService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public WildCardReAssigningStep2ViewModel(ButtonService buttonService, TigerCardsManagerService tigerCardsManagerService, GetTigerBoxAccountUseCase getTigerBoxAccountUseCase) {
        super(buttonService);
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        Intrinsics.checkNotNullParameter(tigerCardsManagerService, "tigerCardsManagerService");
        Intrinsics.checkNotNullParameter(getTigerBoxAccountUseCase, "getTigerBoxAccountUseCase");
        this.tigerCardsManagerService = tigerCardsManagerService;
        this.getTigerBoxAccountUseCase = getTigerBoxAccountUseCase;
    }

    public final void continueToStep3() {
        this.tigerCardsManagerService.reassignInsertedWildcard();
    }

    public final void cancelWildcardReassign() {
        this.tigerCardsManagerService.setWildcardReassignModeEnabled(false);
    }

    public final String getAccountEmail() {
        return this.getTigerBoxAccountUseCase.invoke().getUser().getEmail();
    }
}
