package media.tiger.tigerbox.ui.onboarding.step1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.fragment.FragmentKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.databinding.FragmentOnboardingStep1Screen1Binding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.ui.onboarding.OnboardingActivityKt;
import media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1ViewModel;

/* compiled from: OnboardingStep1Screen1Fragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step1/OnboardingStep1Screen1Fragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentOnboardingStep1Screen1Binding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentOnboardingStep1Screen1Binding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentOnboardingStep1Screen1Binding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "onboardingStep1Screen1ViewModel", "Lmedia/tiger/tigerbox/ui/onboarding/step1/OnboardingStep1Screen1ViewModel;", "getOnboardingStep1Screen1ViewModel", "()Lmedia/tiger/tigerbox/ui/onboarding/step1/OnboardingStep1Screen1ViewModel;", "onboardingStep1Screen1ViewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "showLoginScreen", "showMainContentScreen", "showNextOnBoardingScreen", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class OnboardingStep1Screen1Fragment extends Hilt_OnboardingStep1Screen1Fragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(OnboardingStep1Screen1Fragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentOnboardingStep1Screen1Binding;", 0))};
    private final AutoClearedValue binding$delegate;
    private final Lazy onboardingStep1Screen1ViewModel$delegate;

    public OnboardingStep1Screen1Fragment() {
        final OnboardingStep1Screen1Fragment onboardingStep1Screen1Fragment = this;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1Fragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.onboardingStep1Screen1ViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(onboardingStep1Screen1Fragment, Reflection.getOrCreateKotlinClass(OnboardingStep1Screen1ViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1Fragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ((ViewModelStoreOwner) Function0.this.invoke()).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1Fragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Object invoke = Function0.this.invoke();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = invoke instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) invoke : null;
                ViewModelProvider.Factory defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory() : null;
                if (defaultViewModelProviderFactory == null) {
                    defaultViewModelProviderFactory = onboardingStep1Screen1Fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.binding$delegate = AutoClearedValueKt.autoCleared(onboardingStep1Screen1Fragment);
    }

    private final OnboardingStep1Screen1ViewModel getOnboardingStep1Screen1ViewModel() {
        return (OnboardingStep1Screen1ViewModel) this.onboardingStep1Screen1ViewModel$delegate.getValue();
    }

    private final FragmentOnboardingStep1Screen1Binding getBinding() {
        return (FragmentOnboardingStep1Screen1Binding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentOnboardingStep1Screen1Binding fragmentOnboardingStep1Screen1Binding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentOnboardingStep1Screen1Binding);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentOnboardingStep1Screen1Binding inflate = FragmentOnboardingStep1Screen1Binding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getOnboardingStep1Screen1ViewModel().getNavigationEvent().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1Fragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OnboardingStep1Screen1Fragment.m1936onViewCreated$lambda0(OnboardingStep1Screen1Fragment.this, (OnboardingStep1Screen1ViewModel.NavigationEvent) obj);
            }
        });
        getBinding().onboardingStep1Button.setOnClickListener(new View.OnClickListener() { // from class: media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen1Fragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OnboardingStep1Screen1Fragment.m1937onViewCreated$lambda1(OnboardingStep1Screen1Fragment.this, view2);
            }
        });
        FragmentActivity activity = getActivity();
        boolean z = false;
        if (activity != null && (intent = activity.getIntent()) != null) {
            z = intent.getBooleanExtra("logged_out", false);
        }
        getOnboardingStep1Screen1ViewModel().onViewPrepared(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m1936onViewCreated$lambda0(OnboardingStep1Screen1Fragment this$0, OnboardingStep1Screen1ViewModel.NavigationEvent navigationEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Intrinsics.areEqual(navigationEvent, OnboardingStep1Screen1ViewModel.NavigationEvent.NavigateToMainContent.INSTANCE)) {
            this$0.showMainContentScreen();
        } else if (Intrinsics.areEqual(navigationEvent, OnboardingStep1Screen1ViewModel.NavigationEvent.NavigateToLogin.INSTANCE)) {
            this$0.showLoginScreen();
        } else if (Intrinsics.areEqual(navigationEvent, OnboardingStep1Screen1ViewModel.NavigationEvent.NavigateToNextOnboardingScreen.INSTANCE)) {
            this$0.showNextOnBoardingScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m1937onViewCreated$lambda1(OnboardingStep1Screen1Fragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getOnboardingStep1Screen1ViewModel().showNextScreen();
    }

    private final void showMainContentScreen() {
        OnboardingActivityKt.navigateActionSafe$default(FragmentKt.findNavController(this), R.id.action_onboardingStep1Fragment_to_main_content, null, 2, null);
        requireActivity().finish();
    }

    private final void showNextOnBoardingScreen() {
        OnboardingActivityKt.navigateActionSafe$default(FragmentKt.findNavController(this), R.id.action_onboardingStep1Fragment_to_onboardingStep2Fragment, null, 2, null);
    }

    private final void showLoginScreen() {
        OnboardingActivityKt.navigateActionSafe$default(FragmentKt.findNavController(this), R.id.action_onboarding_move_to_login_from_start, null, 2, null);
    }
}
