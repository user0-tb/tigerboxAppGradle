package media.tiger.tigerbox.ui;

import androidx.lifecycle.LiveData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.infrastructure.functional.SingleLiveEvent;
import media.tiger.tigerbox.services.implementations.ButtonService;
import media.tiger.tigerbox.services.implementations.DisplayService;
import media.tiger.tigerbox.services.interfaces.HardwareEventSubscriber;
import media.tiger.tigerbox.services.interfaces.SafeguardChangesListener;
import media.tiger.tigerbox.services.interfaces.SafeguardService;
import media.tiger.tigerbox.ui.common.BaseViewModel;
import timber.log.Timber;

/* compiled from: TigerBoxActivityViewModel.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0002\u0011\u001f\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010#\u001a\u00020\u000bJ\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020\u000bJ\u0006\u0010)\u001a\u00020\u000bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00198F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001b¨\u0006*"}, d2 = {"Lmedia/tiger/tigerbox/ui/TigerBoxActivityViewModel;", "Lmedia/tiger/tigerbox/ui/common/BaseViewModel;", "displayService", "Lmedia/tiger/tigerbox/services/implementations/DisplayService;", "safeguardService", "Lmedia/tiger/tigerbox/services/interfaces/SafeguardService;", "buttonService", "Lmedia/tiger/tigerbox/services/implementations/ButtonService;", "(Lmedia/tiger/tigerbox/services/implementations/DisplayService;Lmedia/tiger/tigerbox/services/interfaces/SafeguardService;Lmedia/tiger/tigerbox/services/implementations/ButtonService;)V", "_resetButtonLongPressedEvent", "Lmedia/tiger/tigerbox/infrastructure/functional/SingleLiveEvent;", "", "get_resetButtonLongPressedEvent", "()Lmedia/tiger/tigerbox/infrastructure/functional/SingleLiveEvent;", "_safeguardHardwareErrorEvent", "_tigerButtonPressedEvent", "hardwareSafeguardErrorListener", "media/tiger/tigerbox/ui/TigerBoxActivityViewModel$hardwareSafeguardErrorListener$1", "Lmedia/tiger/tigerbox/ui/TigerBoxActivityViewModel$hardwareSafeguardErrorListener$1;", "resetButtonListener", "Lmedia/tiger/tigerbox/services/interfaces/HardwareEventSubscriber;", "Lmedia/tiger/tigerbox/services/implementations/ButtonService$ButtonEvent;", "getResetButtonListener", "()Lmedia/tiger/tigerbox/services/interfaces/HardwareEventSubscriber;", "resetButtonLongPressedEvent", "Landroidx/lifecycle/LiveData;", "getResetButtonLongPressedEvent", "()Landroidx/lifecycle/LiveData;", "safeguardHardwareErrorEvent", "getSafeguardHardwareErrorEvent", "tigerButtonListener", "media/tiger/tigerbox/ui/TigerBoxActivityViewModel$tigerButtonListener$1", "Lmedia/tiger/tigerbox/ui/TigerBoxActivityViewModel$tigerButtonListener$1;", "tigerButtonPressedEvent", "getTigerButtonPressedEvent", "checkSafeguardHardware", "isDisplayStateDim", "", "isDisplayStateOff", "isDisplayStateOn", "viewEntered", "viewExited", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TigerBoxActivityViewModel extends BaseViewModel {
    private final SingleLiveEvent<Unit> _resetButtonLongPressedEvent;
    private final SingleLiveEvent<Unit> _safeguardHardwareErrorEvent;
    private final SingleLiveEvent<Unit> _tigerButtonPressedEvent;
    private final ButtonService buttonService;
    private final DisplayService displayService;
    private final TigerBoxActivityViewModel$hardwareSafeguardErrorListener$1 hardwareSafeguardErrorListener;
    private final HardwareEventSubscriber<ButtonService.ButtonEvent, Unit> resetButtonListener;
    private final SafeguardService safeguardService;
    private final TigerBoxActivityViewModel$tigerButtonListener$1 tigerButtonListener;

    /* JADX WARN: Type inference failed for: r2v2, types: [media.tiger.tigerbox.ui.TigerBoxActivityViewModel$hardwareSafeguardErrorListener$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [media.tiger.tigerbox.ui.TigerBoxActivityViewModel$tigerButtonListener$1] */
    @Inject
    public TigerBoxActivityViewModel(DisplayService displayService, SafeguardService safeguardService, ButtonService buttonService) {
        Intrinsics.checkNotNullParameter(displayService, "displayService");
        Intrinsics.checkNotNullParameter(safeguardService, "safeguardService");
        Intrinsics.checkNotNullParameter(buttonService, "buttonService");
        this.displayService = displayService;
        this.safeguardService = safeguardService;
        this.buttonService = buttonService;
        this._safeguardHardwareErrorEvent = new SingleLiveEvent<>();
        this.hardwareSafeguardErrorListener = new SafeguardChangesListener() { // from class: media.tiger.tigerbox.ui.TigerBoxActivityViewModel$hardwareSafeguardErrorListener$1
            @Override // media.tiger.tigerbox.services.interfaces.SafeguardChangesListener
            public void didReceiveSafeguardError() {
                SingleLiveEvent singleLiveEvent;
                singleLiveEvent = TigerBoxActivityViewModel.this._safeguardHardwareErrorEvent;
                singleLiveEvent.call();
            }
        };
        this._tigerButtonPressedEvent = new SingleLiveEvent<>();
        this.tigerButtonListener = new HardwareEventSubscriber<ButtonService.ButtonEvent, Unit>() { // from class: media.tiger.tigerbox.ui.TigerBoxActivityViewModel$tigerButtonListener$1
            @Override // media.tiger.tigerbox.services.interfaces.HardwareEventSubscriber
            public void onError(Unit error) {
                Intrinsics.checkNotNullParameter(error, "error");
            }

            @Override // media.tiger.tigerbox.services.interfaces.HardwareEventSubscriber
            public void onReceive(ButtonService.ButtonEvent event) {
                SingleLiveEvent singleLiveEvent;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == ButtonService.ButtonEvent.TIGERBOX_BUTTON_PRESS) {
                    singleLiveEvent = TigerBoxActivityViewModel.this._tigerButtonPressedEvent;
                    singleLiveEvent.call();
                }
            }
        };
        this._resetButtonLongPressedEvent = new SingleLiveEvent<>();
        this.resetButtonListener = new HardwareEventSubscriber<ButtonService.ButtonEvent, Unit>() { // from class: media.tiger.tigerbox.ui.TigerBoxActivityViewModel$resetButtonListener$1
            @Override // media.tiger.tigerbox.services.interfaces.HardwareEventSubscriber
            public void onError(Unit error) {
                Intrinsics.checkNotNullParameter(error, "error");
            }

            @Override // media.tiger.tigerbox.services.interfaces.HardwareEventSubscriber
            public void onReceive(ButtonService.ButtonEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == ButtonService.ButtonEvent.RESET_BUTTON_LONG_DOWN) {
                    Timber.Forest.i("Reset button long pressed", new Object[0]);
                    TigerBoxActivityViewModel.this.get_resetButtonLongPressedEvent().call();
                }
            }
        };
    }

    public final boolean isDisplayStateOff() {
        return this.displayService.getCurrentState() == DisplayService.DisplayState.TIGERBOX_DISPLAY_OFF;
    }

    public final boolean isDisplayStateDim() {
        return this.displayService.getCurrentState() == DisplayService.DisplayState.TIGERBOX_DISPLAY_DIM;
    }

    public final boolean isDisplayStateOn() {
        return this.displayService.getCurrentState() == DisplayService.DisplayState.TIGERBOX_DISPLAY_ON;
    }

    public final LiveData<Unit> getSafeguardHardwareErrorEvent() {
        return this._safeguardHardwareErrorEvent;
    }

    public final void viewEntered() {
        this.safeguardService.subscribeToSafeguardChanges(this.hardwareSafeguardErrorListener);
        this.buttonService.subscribe(this.resetButtonListener);
        this.buttonService.subscribe(this.tigerButtonListener);
    }

    public final void viewExited() {
        this.safeguardService.unsubscribeFromSafeguardChanges(this.hardwareSafeguardErrorListener);
        this.buttonService.unsubscribe(this.resetButtonListener);
        this.buttonService.unsubscribe(this.tigerButtonListener);
    }

    public final void checkSafeguardHardware() {
        if (this.safeguardService.getHasHardwareError()) {
            this._safeguardHardwareErrorEvent.call();
        }
    }

    public final LiveData<Unit> getTigerButtonPressedEvent() {
        return this._tigerButtonPressedEvent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SingleLiveEvent<Unit> get_resetButtonLongPressedEvent() {
        return this._resetButtonLongPressedEvent;
    }

    public final LiveData<Unit> getResetButtonLongPressedEvent() {
        return this._resetButtonLongPressedEvent;
    }

    public final HardwareEventSubscriber<ButtonService.ButtonEvent, Unit> getResetButtonListener() {
        return this.resetButtonListener;
    }
}
