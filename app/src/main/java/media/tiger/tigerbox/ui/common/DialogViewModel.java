package media.tiger.tigerbox.ui.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.ButtonService;

/* compiled from: DialogViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "Lmedia/tiger/tigerbox/ui/common/BaseViewModel;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "(Lmedia/tiger/tigerbox/services/implementations/ButtonService;)V", "onViewClose", "", "onViewExit", "onViewPrepared", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DialogViewModel extends BaseViewModel {
    private final ButtonService buttonService;

    public void onViewClose() {
    }

    public void onViewPrepared() {
    }

    public DialogViewModel(ButtonService buttonService) {
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        this.buttonService = buttonService;
    }

    public void onViewExit() {
        onViewClose();
    }
}
