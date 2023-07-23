package media.tiger.tigerbox.ui.onboarding.step4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
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
import media.tiger.tigerbox.databinding.FragmentOnboardingBackendCommunicationBinding;
import media.tiger.tigerbox.infrastructure.exception.Failure;
import media.tiger.tigerbox.infrastructure.exception.LoginFailure;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.ui.onboarding.OnboardingActivityKt;

/* compiled from: OnboardingBackendCommunicationFragment.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendCommunicationFragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentOnboardingBackendCommunicationBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentOnboardingBackendCommunicationBinding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentOnboardingBackendCommunicationBinding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "onboardingBackendCommunicationViewModel", "Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendCommunicationViewModel;", "getOnboardingBackendCommunicationViewModel", "()Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendCommunicationViewModel;", "onboardingBackendCommunicationViewModel$delegate", "Lkotlin/Lazy;", "handleFailure", "", "failure", "Lmedia/tiger/tigerbox/infrastructure/exception/Failure;", "navigateToBackendResponseFragment", "responseType", "Lmedia/tiger/tigerbox/ui/onboarding/step4/BackendResponseType;", "navigateToMainContent", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class OnboardingBackendCommunicationFragment extends Hilt_OnboardingBackendCommunicationFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(OnboardingBackendCommunicationFragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentOnboardingBackendCommunicationBinding;", 0))};
    private final AutoClearedValue binding$delegate;
    private final Lazy onboardingBackendCommunicationViewModel$delegate;

    public OnboardingBackendCommunicationFragment() {
        final OnboardingBackendCommunicationFragment onboardingBackendCommunicationFragment = this;
        this.binding$delegate = AutoClearedValueKt.autoCleared(onboardingBackendCommunicationFragment);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendCommunicationFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.onboardingBackendCommunicationViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(onboardingBackendCommunicationFragment, Reflection.getOrCreateKotlinClass(OnboardingBackendCommunicationViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendCommunicationFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendCommunicationFragment$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = onboardingBackendCommunicationFragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final FragmentOnboardingBackendCommunicationBinding getBinding() {
        return (FragmentOnboardingBackendCommunicationBinding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentOnboardingBackendCommunicationBinding fragmentOnboardingBackendCommunicationBinding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentOnboardingBackendCommunicationBinding);
    }

    private final OnboardingBackendCommunicationViewModel getOnboardingBackendCommunicationViewModel() {
        return (OnboardingBackendCommunicationViewModel) this.onboardingBackendCommunicationViewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentOnboardingBackendCommunicationBinding inflate = FragmentOnboardingBackendCommunicationBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        final boolean z2 = arguments != null ? arguments.getBoolean("sessionTokenExpired") : false;
        if (arguments != null) {
            String string = arguments.getString("username");
            String string2 = arguments.getString("password");
            String str = string;
            if (str == null || str.length() == 0) {
                String str2 = string2;
                if ((str2 == null || str2.length() == 0) ? true : true) {
                    navigateToBackendResponseFragment(BackendResponseType.BEARER_TOKEN);
                }
            }
            OnboardingBackendCommunicationViewModel onboardingBackendCommunicationViewModel = getOnboardingBackendCommunicationViewModel();
            Intrinsics.checkNotNull(string);
            Intrinsics.checkNotNull(string2);
            onboardingBackendCommunicationViewModel.getToken(string, string2);
        } else {
            navigateToBackendResponseFragment(BackendResponseType.BEARER_TOKEN);
        }
        getOnboardingBackendCommunicationViewModel().getBackendCommunicationInProgress().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendCommunicationFragment$$ExternalSyntheticLambda1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OnboardingBackendCommunicationFragment.m1953onViewCreated$lambda0(z2, this, (Boolean) obj);
            }
        });
        getOnboardingBackendCommunicationViewModel().getFailure().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendCommunicationFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OnboardingBackendCommunicationFragment.m1954onViewCreated$lambda1(OnboardingBackendCommunicationFragment.this, (Failure) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m1953onViewCreated$lambda0(boolean z, OnboardingBackendCommunicationFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.navigateToMainContent();
        } else if (Intrinsics.areEqual((Object) bool, (Object) false)) {
            this$0.navigateToBackendResponseFragment(BackendResponseType.SUCCESS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m1954onViewCreated$lambda1(OnboardingBackendCommunicationFragment this$0, Failure it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.handleFailure(it);
    }

    private final void navigateToBackendResponseFragment(BackendResponseType backendResponseType) {
        OnboardingActivityKt.navigateActionSafe(FragmentKt.findNavController(this), OnboardingBackendCommunicationFragmentDirections.Companion.actionOnboardingBackendCommunicationFragmentToOnboardingBackendResponseFragment(backendResponseType));
    }

    private final void navigateToMainContent() {
        OnboardingActivityKt.navigateActionSafe(FragmentKt.findNavController(this), OnboardingBackendCommunicationFragmentDirections.Companion.actionOnboardingBackendCommunicationFragmentToMainContentActivity());
        requireActivity().finish();
    }

    private final void handleFailure(Failure failure) {
        if (failure instanceof LoginFailure.BearerTokenNotSuccessful) {
            navigateToBackendResponseFragment(BackendResponseType.BEARER_TOKEN);
        } else if (failure instanceof LoginFailure.RequestAccountDataNotSuccessful) {
            navigateToBackendResponseFragment(BackendResponseType.ACCOUNT_DATA);
        } else if (failure instanceof LoginFailure.AssociationOfBoxAndAccountNotSuccessful) {
            navigateToBackendResponseFragment(BackendResponseType.BOX_ACCOUNT_ASSIGN_FAILED);
        } else if (failure instanceof Failure.NetworkConnection) {
            navigateToBackendResponseFragment(BackendResponseType.NO_INTERNET);
        } else {
            navigateToBackendResponseFragment(BackendResponseType.BEARER_TOKEN);
        }
    }
}
