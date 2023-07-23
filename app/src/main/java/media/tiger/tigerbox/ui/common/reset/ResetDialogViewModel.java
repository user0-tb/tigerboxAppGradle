package media.tiger.tigerbox.ui.common.reset;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.interfaces.InfoSoundService;
import media.tiger.tigerbox.ui.common.DialogViewModel;

/* compiled from: ResetDialogViewModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/ui/common/reset/ResetDialogViewModel;", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "infoSoundService", "Lmedia/tiger/tigerbox/services/interfaces/InfoSoundService;", "(Lmedia/tiger/tigerbox/services/implementations/ButtonService;Lmedia/tiger/tigerbox/services/interfaces/InfoSoundService;)V", "playResetSound", "", "stopSound", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResetDialogViewModel extends DialogViewModel {
    private final InfoSoundService infoSoundService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ResetDialogViewModel(ButtonService buttonService, InfoSoundService infoSoundService) {
        super(buttonService);
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        Intrinsics.checkNotNullParameter(infoSoundService, "infoSoundService");
        this.infoSoundService = infoSoundService;
    }

    public final void stopSound() {
        this.infoSoundService.stop();
    }

    public final void playResetSound() {
        this.infoSoundService.playSound(InfoSoundService.SoundType.USER_RESET_CONFIRM);
    }
}
