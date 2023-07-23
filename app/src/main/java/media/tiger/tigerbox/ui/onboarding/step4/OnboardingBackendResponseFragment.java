package media.tiger.tigerbox.ui.onboarding.step4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.fragment.FragmentKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.databinding.FragmentOnboardingBackendResponseBinding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.services.interfaces.MetaDataService;
import media.tiger.tigerbox.ui.binding.UnTypedBindingClickListener;
import media.tiger.tigerbox.ui.onboarding.OnboardingActivityKt;

/* compiled from: OnboardingBackendResponseFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendResponseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentOnboardingBackendResponseBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentOnboardingBackendResponseBinding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentOnboardingBackendResponseBinding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "clickEvent", "Lkotlin/Function0;", "", "metaDataService", "Lmedia/tiger/tigerbox/services/interfaces/MetaDataService;", "getMetaDataService", "()Lmedia/tiger/tigerbox/services/interfaces/MetaDataService;", "setMetaDataService", "(Lmedia/tiger/tigerbox/services/interfaces/MetaDataService;)V", "onboardingBackendResponseViewModel", "Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendResponseViewModel;", "getOnboardingBackendResponseViewModel", "()Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendResponseViewModel;", "onboardingBackendResponseViewModel$delegate", "Lkotlin/Lazy;", "responseType", "Lmedia/tiger/tigerbox/ui/onboarding/step4/BackendResponseType;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class OnboardingBackendResponseFragment extends Hilt_OnboardingBackendResponseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(OnboardingBackendResponseFragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentOnboardingBackendResponseBinding;", 0))};
    private final AutoClearedValue binding$delegate;
    private Function0<Unit> clickEvent = new Function0<Unit>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$clickEvent$1
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    };
    @Inject
    public MetaDataService metaDataService;
    private final Lazy onboardingBackendResponseViewModel$delegate;
    private BackendResponseType responseType;

    /* compiled from: OnboardingBackendResponseFragment.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BackendResponseType.values().length];
            iArr[BackendResponseType.BEARER_TOKEN.ordinal()] = 1;
            iArr[BackendResponseType.ACCOUNT_DATA.ordinal()] = 2;
            iArr[BackendResponseType.BOX_ACCOUNT_ASSIGN_FAILED.ordinal()] = 3;
            iArr[BackendResponseType.NO_INTERNET.ordinal()] = 4;
            iArr[BackendResponseType.SUCCESS.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OnboardingBackendResponseFragment() {
        final OnboardingBackendResponseFragment onboardingBackendResponseFragment = this;
        this.binding$delegate = AutoClearedValueKt.autoCleared(onboardingBackendResponseFragment);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.onboardingBackendResponseViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(onboardingBackendResponseFragment, Reflection.getOrCreateKotlinClass(OnboardingBackendResponseViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = onboardingBackendResponseFragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final FragmentOnboardingBackendResponseBinding getBinding() {
        return (FragmentOnboardingBackendResponseBinding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentOnboardingBackendResponseBinding fragmentOnboardingBackendResponseBinding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentOnboardingBackendResponseBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingBackendResponseViewModel getOnboardingBackendResponseViewModel() {
        return (OnboardingBackendResponseViewModel) this.onboardingBackendResponseViewModel$delegate.getValue();
    }

    public final MetaDataService getMetaDataService() {
        MetaDataService metaDataService = this.metaDataService;
        if (metaDataService != null) {
            return metaDataService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("metaDataService");
        return null;
    }

    public final void setMetaDataService(MetaDataService metaDataService) {
        Intrinsics.checkNotNullParameter(metaDataService, "<set-?>");
        this.metaDataService = metaDataService;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentOnboardingBackendResponseBinding inflate = FragmentOnboardingBackendResponseBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        Bundle arguments = getArguments();
        BackendResponseType backendResponseType = null;
        Object obj = arguments != null ? arguments.get("responseType") : null;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type media.tiger.tigerbox.ui.onboarding.step4.BackendResponseType");
        BackendResponseType backendResponseType2 = (BackendResponseType) obj;
        this.responseType = backendResponseType2;
        if (backendResponseType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("responseType");
        } else {
            backendResponseType = backendResponseType2;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[backendResponseType.ordinal()];
        if (i == 1) {
            getBinding().onboardingBackendResponseTitle.setText(getString(R.string.onboarding_box_data_not_found__title));
            getBinding().onboardingBackendResponseBody.setText(getString(R.string.onboarding_login_error_content));
            getBinding().onboardingBackendResponseId.setVisibility(8);
            getBinding().onboardingBackendResponseButton.setText(getString(R.string.onboarding_login_error_button_text));
            this.clickEvent = new Function0<Unit>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$onCreateView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnboardingActivityKt.navigateActionSafe(FragmentKt.findNavController(OnboardingBackendResponseFragment.this), R.id.action_onboardingBackendResponseFragment_to_onboardingLoginFragment, null);
                }
            };
        } else if (i == 2) {
            getBinding().onboardingBackendResponseTitle.setText(getString(R.string.onboarding_box_data_not_found__title));
            getBinding().onboardingBackendResponseBody.setText(getString(R.string.onboarding_account_data_not_found_content));
            getBinding().onboardingBackendResponseId.setVisibility(8);
            getBinding().onboardingBackendResponseButton.setText(getString(R.string.onboarding_box_data_not_found_button_text));
            this.clickEvent = new Function0<Unit>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$onCreateView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnboardingActivityKt.navigateActionSafe(FragmentKt.findNavController(OnboardingBackendResponseFragment.this), R.id.action_onboardingBackendResponseFragment_to_onboardingLoginFragment, null);
                }
            };
        } else if (i == 3) {
            getBinding().onboardingBackendResponseTitle.setText(getString(R.string.onboarding_box_data_not_found__title));
            getBinding().onboardingBackendResponseBody.setText(getString(R.string.onboarding_box_data_not_found_content));
            getBinding().onboardingBackendResponseId.setVisibility(0);
            getBinding().onboardingBackendResponseId.setText(getMetaDataService().getCpuId());
            getBinding().onboardingBackendResponseButton.setText(getString(R.string.onboarding_box_data_not_found_button_text));
            this.clickEvent = new Function0<Unit>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$onCreateView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnboardingActivityKt.navigateActionSafe(FragmentKt.findNavController(OnboardingBackendResponseFragment.this), R.id.action_onboardingBackendResponseFragment_to_onboardingStep1Screen1Fragment, null);
                }
            };
        } else if (i == 4) {
            getBinding().onboardingBackendResponseTitle.setText(getString(R.string.error_703_headline));
            getBinding().onboardingBackendResponseBody.setText(getString(R.string.error_703_text));
            getBinding().onboardingBackendResponseButton.setText(getString(R.string.error_703_button_text));
            getBinding().onboardingBackendResponseId.setVisibility(8);
            this.clickEvent = new Function0<Unit>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$onCreateView$4
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnboardingActivityKt.navigateActionSafe(FragmentKt.findNavController(OnboardingBackendResponseFragment.this), R.id.action_onboardingBackendResponseFragment_to_onboardingWifiListFragment, null);
                }
            };
        } else if (i == 5) {
            getBinding().onboardingBackendResponseTitle.setText(getString(R.string.onboarding_success_title));
            getBinding().onboardingBackendResponseBody.setText(getString(R.string.onboarding_success_content));
            getBinding().onboardingBackendResponseId.setVisibility(8);
            getBinding().onboardingBackendResponseButton.setText(getString(R.string.onboarding_step1_buttonText));
            this.clickEvent = new Function0<Unit>() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$onCreateView$5
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnboardingBackendResponseViewModel onboardingBackendResponseViewModel;
                    onboardingBackendResponseViewModel = OnboardingBackendResponseFragment.this.getOnboardingBackendResponseViewModel();
                    onboardingBackendResponseViewModel.stopContinuousScan();
                    OnboardingActivityKt.navigateActionSafe(FragmentKt.findNavController(OnboardingBackendResponseFragment.this), OnboardingBackendResponseFragmentDirections.Companion.actionOnboardingBackendResponseFragmentToMainContentActivity());
                    OnboardingBackendResponseFragment.this.requireActivity().finish();
                }
            };
        }
        getBinding().setClickListener(new UnTypedBindingClickListener() { // from class: media.tiger.tigerbox.ui.onboarding.step4.OnboardingBackendResponseFragment$onCreateView$6
            @Override // media.tiger.tigerbox.ui.binding.UnTypedBindingClickListener
            public void onClick() {
                Function0 function0;
                function0 = OnboardingBackendResponseFragment.this.clickEvent;
                function0.invoke();
            }
        });
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        BackendResponseType backendResponseType = BackendResponseType.ACCOUNT_DATA;
        BackendResponseType backendResponseType2 = this.responseType;
        BackendResponseType backendResponseType3 = null;
        if (backendResponseType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("responseType");
            backendResponseType2 = null;
        }
        boolean z = backendResponseType == backendResponseType2;
        BackendResponseType backendResponseType4 = BackendResponseType.BOX_ACCOUNT_ASSIGN_FAILED;
        BackendResponseType backendResponseType5 = this.responseType;
        if (backendResponseType5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("responseType");
        } else {
            backendResponseType3 = backendResponseType5;
        }
        if (z || (backendResponseType4 == backendResponseType3)) {
            getOnboardingBackendResponseViewModel().removeStoredToken();
        }
    }
}
