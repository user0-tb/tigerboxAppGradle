package media.tiger.tigerbox.ui.settings;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.databinding.ActivitySettingsBinding;
import media.tiger.tigerbox.ui.main.SettingsListener;

/* compiled from: SettingsActivity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0019"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SettingsActivity;", "Lmedia/tiger/tigerbox/ui/TigerBoxActivity;", "Lmedia/tiger/tigerbox/ui/main/SettingsListener;", "()V", "binding", "Lmedia/tiger/tigerbox/databinding/ActivitySettingsBinding;", "canResetDevice", "", "getCanResetDevice", "()Z", "navController", "Landroidx/navigation/NavController;", "navHostFragment", "Landroidx/fragment/app/Fragment;", "supportsNfc", "getSupportsNfc", "disableCardsMode", "", "enableCardsMode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTigerButtonPressed", "showHardwareSafeguardDialog", "showResetDialog", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class SettingsActivity extends Hilt_SettingsActivity implements SettingsListener {
    private ActivitySettingsBinding binding;
    private NavController navController;
    private Fragment navHostFragment;

    @Override // media.tiger.tigerbox.ui.main.SettingsListener
    public void disableCardsMode() {
    }

    @Override // media.tiger.tigerbox.ui.main.SettingsListener
    public void enableCardsMode() {
    }

    @Override // media.tiger.tigerbox.ui.TigerBoxActivity
    public boolean getCanResetDevice() {
        return true;
    }

    @Override // media.tiger.tigerbox.ui.TigerBoxActivity
    public boolean getSupportsNfc() {
        return true;
    }

    @Override // media.tiger.tigerbox.ui.TigerBoxActivity
    public void showHardwareSafeguardDialog() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivitySettingsBinding inflate = ActivitySettingsBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        Fragment fragment = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        getWindow().setSoftInputMode(48);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.settings_nav_graph_fragment);
        if (findFragmentById == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.navHostFragment = findFragmentById;
        if (findFragmentById == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navHostFragment");
        } else {
            fragment = findFragmentById;
        }
        this.navController = FragmentKt.findNavController(fragment);
    }

    @Override // media.tiger.tigerbox.ui.TigerBoxActivity
    public void onTigerButtonPressed() {
        NavController navController = this.navController;
        NavController navController2 = null;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController = null;
        }
        if (navController.getBackQueue().size() > 2) {
            NavController navController3 = this.navController;
            if (navController3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
                navController3 = null;
            }
            NavDestination destination = navController3.getBackQueue().last().getDestination();
            NavController navController4 = this.navController;
            if (navController4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navController");
                navController4 = null;
            }
            if (!Intrinsics.areEqual(destination, navController4.findDestination(R.id.offlineModeFragment))) {
                NavController navController5 = this.navController;
                if (navController5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navController");
                } else {
                    navController2 = navController5;
                }
                navController2.popBackStack();
                return;
            }
        }
        finish();
    }

    @Override // media.tiger.tigerbox.ui.TigerBoxActivity
    public void showResetDialog() {
        NavController navController = this.navController;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController = null;
        }
        navController.navigate(R.id.resetDialogFragment);
    }
}
