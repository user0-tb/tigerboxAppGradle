package media.tiger.tigerbox.ui;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import media.tiger.tigerbox.databinding.ActivityStartupAnimationBinding;
import media.tiger.tigerbox.infrastructure.interactor.EventObserver;
import media.tiger.tigerbox.services.interfaces.InfoSoundService;
import media.tiger.tigerbox.ui.LaunchNavigationAction;
import media.tiger.tigerbox.ui.main.MainContentActivity;
import media.tiger.tigerbox.ui.onboarding.OnboardingActivity;

/* compiled from: LauncherActivity.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"Lmedia/tiger/tigerbox/ui/LauncherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lmedia/tiger/tigerbox/databinding/ActivityStartupAnimationBinding;", "infoSoundService", "Lmedia/tiger/tigerbox/services/interfaces/InfoSoundService;", "getInfoSoundService", "()Lmedia/tiger/tigerbox/services/interfaces/InfoSoundService;", "setInfoSoundService", "(Lmedia/tiger/tigerbox/services/interfaces/InfoSoundService;)V", "checkIfAnimationDone", "", "anim", "Landroid/graphics/drawable/AnimationDrawable;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_tigerBoxRelease", "viewModel", "Lmedia/tiger/tigerbox/ui/LaunchViewModel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class LauncherActivity extends Hilt_LauncherActivity {
    private ActivityStartupAnimationBinding binding;
    @Inject
    public InfoSoundService infoSoundService;

    public final InfoSoundService getInfoSoundService() {
        InfoSoundService infoSoundService = this.infoSoundService;
        if (infoSoundService != null) {
            return infoSoundService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("infoSoundService");
        return null;
    }

    public final void setInfoSoundService(InfoSoundService infoSoundService) {
        Intrinsics.checkNotNullParameter(infoSoundService, "<set-?>");
        this.infoSoundService = infoSoundService;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityStartupAnimationBinding inflate = ActivityStartupAnimationBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        Log.e("LauncherActivity", "onCreate..........................");
        ActivityStartupAnimationBinding activityStartupAnimationBinding = this.binding;
        if (activityStartupAnimationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityStartupAnimationBinding = null;
        }
        Drawable background = activityStartupAnimationBinding.tigerboxTextAnimation.getBackground();
        AnimationDrawable animationDrawable = background instanceof AnimationDrawable ? (AnimationDrawable) background : null;
        if (animationDrawable != null) {
            checkIfAnimationDone(animationDrawable);
            getInfoSoundService().playSound(InfoSoundService.SoundType.SWITCH_ON);
            animationDrawable.start();
        }
    }

    private final void checkIfAnimationDone(final AnimationDrawable animationDrawable) {
        new Handler().postDelayed(new Runnable() { // from class: media.tiger.tigerbox.ui.LauncherActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LauncherActivity.m1815checkIfAnimationDone$lambda2(animationDrawable, this);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkIfAnimationDone$lambda-2  reason: not valid java name */
    public static final void m1815checkIfAnimationDone$lambda2(AnimationDrawable anim, final LauncherActivity this$0) {
        Intrinsics.checkNotNullParameter(anim, "$anim");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (anim.getCurrent() != anim.getFrame(anim.getNumberOfFrames() - 1)) {
            this$0.checkIfAnimationDone(anim);
            return;
        }
        final LauncherActivity launcherActivity = this$0;
        m1816checkIfAnimationDone$lambda2$lambda1(new ViewModelLazy(Reflection.getOrCreateKotlinClass(LaunchViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.LauncherActivity$checkIfAnimationDone$lambda-2$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.LauncherActivity$checkIfAnimationDone$lambda-2$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        })).getLaunchDestination().observe(this$0, new EventObserver(new Function1<LaunchNavigationAction, Unit>() { // from class: media.tiger.tigerbox.ui.LauncherActivity$checkIfAnimationDone$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LaunchNavigationAction launchNavigationAction) {
                invoke2(launchNavigationAction);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(LaunchNavigationAction destination) {
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (destination instanceof LaunchNavigationAction.NavigateToMainActivityAction) {
                    LauncherActivity.this.startActivity(new Intent(LauncherActivity.this, MainContentActivity.class));
                } else if (destination instanceof LaunchNavigationAction.NavigateToOnboardingAction) {
                    LauncherActivity.this.startActivity(new Intent(LauncherActivity.this, OnboardingActivity.class));
                }
                LauncherActivity.this.finish();
            }
        }));
    }

    /* renamed from: checkIfAnimationDone$lambda-2$lambda-1  reason: not valid java name */
    private static final LaunchViewModel m1816checkIfAnimationDone$lambda2$lambda1(Lazy<LaunchViewModel> lazy) {
        return lazy.getValue();
    }
}
