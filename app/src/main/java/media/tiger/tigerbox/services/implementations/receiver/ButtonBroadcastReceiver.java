package media.tiger.tigerbox.services.implementations.receiver;

import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.implementations.ButtonService;

/* compiled from: ButtonBroadcastReceiver.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/receiver/ButtonBroadcastReceiver;", "Lmedia/tiger/tigerbox/infrastructure/di/InjectableBroadcastReceiver;", "()V", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "getButtonService", "()Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "setButtonService", "(Lmedia/tiger/tigerbox/services/implementations/ButtonService;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class ButtonBroadcastReceiver extends Hilt_ButtonBroadcastReceiver {
    @Inject
    public ButtonService buttonService;

    public final ButtonService getButtonService() {
        ButtonService buttonService = this.buttonService;
        if (buttonService != null) {
            return buttonService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("buttonService");
        return null;
    }

    public final void setButtonService(ButtonService buttonService) {
        Intrinsics.checkNotNullParameter(buttonService, "<set-?>");
        this.buttonService = buttonService;
    }

    @Override // media.tiger.tigerbox.services.implementations.receiver.Hilt_ButtonBroadcastReceiver, media.tiger.tigerbox.infrastructure.di.InjectableBroadcastReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (intent != null) {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            Intrinsics.checkNotNullExpressionValue(action, "it.action ?: \"\"");
            switch (action.hashCode()) {
                case -1777179282:
                    if (!action.equals(ButtonService.ACTION_RESET_BUTTON_LONG_DOWN)) {
                        return;
                    }
                    break;
                case 118821479:
                    if (!action.equals(ButtonService.ACTION_RESET_BUTTON_LONG_UP)) {
                        return;
                    }
                    break;
                case 1265490654:
                    if (!action.equals(ButtonService.ACTION_RESET_BUTTON_PRESS)) {
                        return;
                    }
                    break;
                case 2074086723:
                    if (!action.equals(ButtonService.ACTION_TIGERBOX_BUTTON_GO_HOME_PRESS)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            getButtonService().handleAction(action, intent);
        }
    }
}
