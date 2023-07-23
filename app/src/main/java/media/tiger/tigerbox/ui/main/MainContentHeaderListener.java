package media.tiger.tigerbox.ui.main;

import kotlin.Metadata;
import media.tiger.tigerbox.services.implementations.timersController.LockedModeReason;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: MainContentActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&¨\u0006\u000e"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/MainContentHeaderListener;", "", "changeHeaderTitle", "", MessageBundle.TITLE_ENTRY, "", "disableLockScreen", "enableLockScreen", "reason", "Lmedia/tiger/tigerbox/services/implementations/timersController/LockedModeReason;", "hideHeaderCloseButton", "hideMultiProductListInCardsMode", "showHeaderCloseButton", "showMultiProductListInCardsMode", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MainContentHeaderListener {
    void changeHeaderTitle(String str);

    void disableLockScreen();

    void enableLockScreen(LockedModeReason lockedModeReason);

    void hideHeaderCloseButton();

    void hideMultiProductListInCardsMode();

    void showHeaderCloseButton();

    void showMultiProductListInCardsMode();
}
