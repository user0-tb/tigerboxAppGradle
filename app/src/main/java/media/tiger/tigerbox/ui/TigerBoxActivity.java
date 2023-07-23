package media.tiger.tigerbox.ui;

import android.content.Intent;
import android.view.MotionEvent;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import media.tiger.tigerbox.services.interfaces.NfcService;
import timber.log.Timber;

/* compiled from: TigerBoxActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001dH\u0014J\b\u0010 \u001a\u00020\u0019H\u0014J\b\u0010!\u001a\u00020\u0019H\u0014J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u0019H&J\b\u0010$\u001a\u00020\u0019H\u0016J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lmedia/tiger/tigerbox/ui/TigerBoxActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "canResetDevice", "", "getCanResetDevice", "()Z", "nfcService", "Lmedia/tiger/tigerbox/services/interfaces/NfcService;", "getNfcService", "()Lmedia/tiger/tigerbox/services/interfaces/NfcService;", "setNfcService", "(Lmedia/tiger/tigerbox/services/interfaces/NfcService;)V", "supportsNfc", "getSupportsNfc", "tigerBoxActivityViewModel", "Lmedia/tiger/tigerbox/ui/TigerBoxActivityViewModel;", "getTigerBoxActivityViewModel", "()Lmedia/tiger/tigerbox/ui/TigerBoxActivityViewModel;", "tigerBoxActivityViewModel$delegate", "Lkotlin/Lazy;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "onActivityReenter", "", "resultCode", "", "data", "Landroid/content/Intent;", "onNewIntent", "intent", "onPause", "onResume", "onTigerButtonPressed", "showHardwareSafeguardDialog", "showResetDialog", "stopOnDisplayDimWithEvent", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public abstract class TigerBoxActivity extends Hilt_TigerBoxActivity {
    private final boolean canResetDevice;
    @Inject
    public NfcService nfcService;
    private final boolean supportsNfc;
    private final Lazy tigerBoxActivityViewModel$delegate;

    public abstract void showHardwareSafeguardDialog();

    public TigerBoxActivity() {
        final TigerBoxActivity tigerBoxActivity = this;
        this.tigerBoxActivityViewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TigerBoxActivityViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.TigerBoxActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.TigerBoxActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        });
    }

    public final NfcService getNfcService() {
        NfcService nfcService = this.nfcService;
        if (nfcService != null) {
            return nfcService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nfcService");
        return null;
    }

    public final void setNfcService(NfcService nfcService) {
        Intrinsics.checkNotNullParameter(nfcService, "<set-?>");
        this.nfcService = nfcService;
    }

    private final TigerBoxActivityViewModel getTigerBoxActivityViewModel() {
        return (TigerBoxActivityViewModel) this.tigerBoxActivityViewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getSupportsNfc()) {
            getNfcService().enableForegroundDispatch(this);
        }
        getTigerBoxActivityViewModel().viewEntered();
        TigerBoxActivity tigerBoxActivity = this;
        getTigerBoxActivityViewModel().getSafeguardHardwareErrorEvent().observe(tigerBoxActivity, new Observer() { // from class: media.tiger.tigerbox.ui.TigerBoxActivity$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TigerBoxActivity.m1818onResume$lambda0(TigerBoxActivity.this, (Unit) obj);
            }
        });
        getTigerBoxActivityViewModel().checkSafeguardHardware();
        getTigerBoxActivityViewModel().getResetButtonLongPressedEvent().observe(tigerBoxActivity, new Observer() { // from class: media.tiger.tigerbox.ui.TigerBoxActivity$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TigerBoxActivity.m1819onResume$lambda1(TigerBoxActivity.this, (Unit) obj);
            }
        });
        getTigerBoxActivityViewModel().getTigerButtonPressedEvent().observe(tigerBoxActivity, new Observer() { // from class: media.tiger.tigerbox.ui.TigerBoxActivity$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TigerBoxActivity.m1820onResume$lambda2(TigerBoxActivity.this, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResume$lambda-0  reason: not valid java name */
    public static final void m1818onResume$lambda0(TigerBoxActivity this$0, Unit unit) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showHardwareSafeguardDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResume$lambda-1  reason: not valid java name */
    public static final void m1819onResume$lambda1(TigerBoxActivity this$0, Unit unit) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Timber.Forest forest = Timber.Forest;
        forest.i("TigerBoxActivity did receive reset event. canResetDevice: " + this$0.getCanResetDevice(), new Object[0]);
        if (this$0.getCanResetDevice()) {
            this$0.showResetDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onResume$lambda-2  reason: not valid java name */
    public static final void m1820onResume$lambda2(TigerBoxActivity this$0, Unit unit) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTigerButtonPressed();
    }

    public boolean getCanResetDevice() {
        return this.canResetDevice;
    }

    public void showResetDialog() {
        Timber.Forest forest = Timber.Forest;
        forest.e("ShowResetDialog not overwritten by activity " + this, new Object[0]);
    }

    public void onTigerButtonPressed() {
        sendBroadcast(new Intent(TigerBoxIntentActions.ACTION_GO_TO_SLEEP));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        getTigerBoxActivityViewModel().viewExited();
        super.onPause();
    }

    public final boolean stopOnDisplayDimWithEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() == 1 || ev.getAction() == 0) {
            return getTigerBoxActivityViewModel().isDisplayStateDim() || getTigerBoxActivityViewModel().isDisplayStateOff();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (stopOnDisplayDimWithEvent(ev)) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.app.Activity
    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
    }

    public boolean getSupportsNfc() {
        return this.supportsNfc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Timber.Forest forest = Timber.Forest;
        forest.i("onNewIntent " + this + " intent " + intent, new Object[0]);
        super.onNewIntent(intent);
        setIntent(intent);
        if (getSupportsNfc()) {
            getNfcService().parseIntent(intent);
        }
    }
}
