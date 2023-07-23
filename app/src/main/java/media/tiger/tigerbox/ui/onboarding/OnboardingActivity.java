package media.tiger.tigerbox.ui.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.databinding.ActivityOnboardingBinding;
import media.tiger.tigerbox.services.interfaces.audioPlayer.AudioPlayerService;
import media.tiger.tigerbox.ui.common.InfoDialogType;
import media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1FragmentDirections;
import timber.log.Timber;

/* compiled from: OnboardingActivity.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0014J\b\u0010 \u001a\u00020\u001aH\u0014J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0016J\u0012\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/OnboardingActivity;", "Lmedia/tiger/tigerbox/ui/TigerBoxActivity;", "()V", "audioPlayerService", "Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/AudioPlayerService;", "getAudioPlayerService", "()Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/AudioPlayerService;", "setAudioPlayerService", "(Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/AudioPlayerService;)V", "binding", "Lmedia/tiger/tigerbox/databinding/ActivityOnboardingBinding;", "canResetDevice", "", "getCanResetDevice", "()Z", "navController", "Landroidx/navigation/NavController;", "navHostFragment", "Landroidx/fragment/app/Fragment;", "viewModel", "Lmedia/tiger/tigerbox/ui/onboarding/OnboardingActivityViewModel;", "getViewModel", "()Lmedia/tiger/tigerbox/ui/onboarding/OnboardingActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "showHardwareSafeguardDialog", "showResetDialog", "skipToLoginIfLoggedOut", "intent", "Landroid/content/Intent;", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class OnboardingActivity extends Hilt_OnboardingActivity {
    public static final Companion Companion = new Companion(null);
    private static boolean isLoggedOutRunning;
    @Inject
    public AudioPlayerService audioPlayerService;
    private ActivityOnboardingBinding binding;
    private NavController navController;
    private Fragment navHostFragment;
    private final Lazy viewModel$delegate;

    @Override // media.tiger.tigerbox.ui.TigerBoxActivity
    public boolean getCanResetDevice() {
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public OnboardingActivity() {
        final OnboardingActivity onboardingActivity = this;
        this.viewModel$delegate = new ViewModelLazy(Reflection.getOrCreateKotlinClass(OnboardingActivityViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.onboarding.OnboardingActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.onboarding.OnboardingActivity$special$$inlined$viewModels$default$1
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

    private final OnboardingActivityViewModel getViewModel() {
        return (OnboardingActivityViewModel) this.viewModel$delegate.getValue();
    }

    public final AudioPlayerService getAudioPlayerService() {
        AudioPlayerService audioPlayerService = this.audioPlayerService;
        if (audioPlayerService != null) {
            return audioPlayerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audioPlayerService");
        return null;
    }

    public final void setAudioPlayerService(AudioPlayerService audioPlayerService) {
        Intrinsics.checkNotNullParameter(audioPlayerService, "<set-?>");
        this.audioPlayerService = audioPlayerService;
    }

    /* compiled from: OnboardingActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/OnboardingActivity$Companion;", "", "()V", "isLoggedOutRunning", "", "()Z", "setLoggedOutRunning", "(Z)V", "showLogin", "", "context", "Landroid/content/Context;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isLoggedOutRunning() {
            return OnboardingActivity.isLoggedOutRunning;
        }

        public final void setLoggedOutRunning(boolean z) {
            OnboardingActivity.isLoggedOutRunning = z;
        }

        public final void showLogin(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (isLoggedOutRunning()) {
                Timber.Forest.i("Logged out already running", new Object[0]);
                return;
            }
            Intent intent = new Intent(context, OnboardingActivity.class);
            OnboardingActivity.Companion.setLoggedOutRunning(true);
            Timber.Forest.i("Will show Logged out", new Object[0]);
            intent.setFlags(268468224);
            intent.putExtra("logged_out", true);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityOnboardingBinding inflate = ActivityOnboardingBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        Fragment fragment = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        Timber.Forest.i("OnboardingActivity onCreate", new Object[0]);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.onboarding_nav_graph_fragment);
        if (findFragmentById != null) {
            this.navHostFragment = findFragmentById;
            if (findFragmentById == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navHostFragment");
            } else {
                fragment = findFragmentById;
            }
            this.navController = FragmentKt.findNavController(fragment);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        isLoggedOutRunning = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // media.tiger.tigerbox.ui.TigerBoxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        skipToLoginIfLoggedOut(getIntent());
        getViewModel().viewPrepared();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // media.tiger.tigerbox.ui.TigerBoxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        isLoggedOutRunning = false;
        getViewModel().exitView();
        super.onPause();
    }

    private final void skipToLoginIfLoggedOut(Intent intent) {
        if (intent != null) {
            getAudioPlayerService().stop();
            if (intent.getBooleanExtra("logged_out", false) && isLoggedOutRunning) {
                NavController navController = this.navController;
                if (navController == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navController");
                    navController = null;
                }
                OnboardingActivityKt.navigateActionSafe(navController, OnboardingStep1Screen1FragmentDirections.Companion.actionOnboardingMoveToLoginFromStart(true));
            }
        }
    }

    @Override // media.tiger.tigerbox.ui.TigerBoxActivity
    public void showResetDialog() {
        NavController navController = this.navController;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController = null;
        }
        navController.navigate(R.id.action_onboarding_to_resetDialog);
    }

    @Override // media.tiger.tigerbox.ui.TigerBoxActivity
    public void showHardwareSafeguardDialog() {
        NavController navController = this.navController;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController = null;
        }
        navController.navigate(R.id.action_onboarding_to_onboardingErrorDialog, BundleKt.bundleOf(TuplesKt.to("dialogType", InfoDialogType.ERROR_SAFEGUARD_HARDWARE_900)));
    }
}
