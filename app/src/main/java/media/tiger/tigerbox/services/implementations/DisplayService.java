package media.tiger.tigerbox.services.implementations;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.interfaces.HardwareEventPublisher;

/* compiled from: DisplayService.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000e\u000fB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/DisplayService;", "Lmedia/tiger/tigerbox/services/interfaces/HardwareEventPublisher;", "Lmedia/tiger/tigerbox/services/implementations/DisplayService$DisplayState;", "", "()V", "_currentState", "currentState", "getCurrentState", "()Lmedia/tiger/tigerbox/services/implementations/DisplayService$DisplayState;", "handleAction", "action", "", "intent", "Landroid/content/Intent;", "Companion", "DisplayState", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DisplayService extends HardwareEventPublisher<DisplayState, Unit> {
    public static final String ACTION_SCREEN_DIMS = "tiger_box.intent.action.SCREEN_DIMS";
    public static final Companion Companion = new Companion(null);
    public static final String SCREEN_DIMS_STATUS = "screen_dims_status";
    private DisplayState _currentState = DisplayState.TIGERBOX_DISPLAY_ON;

    /* compiled from: DisplayService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/DisplayService$DisplayState;", "", "(Ljava/lang/String;I)V", "TIGERBOX_DISPLAY_ON", "TIGERBOX_DISPLAY_OFF", "TIGERBOX_DISPLAY_DIM", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public enum DisplayState {
        TIGERBOX_DISPLAY_ON,
        TIGERBOX_DISPLAY_OFF,
        TIGERBOX_DISPLAY_DIM
    }

    public final DisplayState getCurrentState() {
        return this._currentState;
    }

    @Override // media.tiger.tigerbox.services.interfaces.HardwareEventPublisher
    public void handleAction(String action, Intent intent) {
        DisplayState displayState;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int hashCode = action.hashCode();
        if (hashCode != -2128145023) {
            if (hashCode != -1754776619) {
                if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                    DisplayState displayState2 = DisplayState.TIGERBOX_DISPLAY_ON;
                    this._currentState = displayState2;
                    publish(displayState2);
                    return;
                }
            } else if (action.equals(ACTION_SCREEN_DIMS)) {
                if (intent.getBooleanExtra(SCREEN_DIMS_STATUS, false)) {
                    displayState = DisplayState.TIGERBOX_DISPLAY_DIM;
                } else {
                    displayState = DisplayState.TIGERBOX_DISPLAY_ON;
                }
                this._currentState = displayState;
                publish(displayState);
                return;
            }
        } else if (action.equals("android.intent.action.SCREEN_OFF")) {
            DisplayState displayState3 = DisplayState.TIGERBOX_DISPLAY_OFF;
            this._currentState = displayState3;
            publish(displayState3);
            return;
        }
        DisplayState displayState4 = DisplayState.TIGERBOX_DISPLAY_ON;
        this._currentState = displayState4;
        publish(displayState4);
    }

    /* compiled from: DisplayService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/DisplayService$Companion;", "", "()V", "ACTION_SCREEN_DIMS", "", "SCREEN_DIMS_STATUS", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
