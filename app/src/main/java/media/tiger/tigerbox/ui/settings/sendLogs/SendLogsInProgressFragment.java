package media.tiger.tigerbox.ui.settings.sendLogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.databinding.FragmentSendLogsInProgressBinding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.ui.common.DialogViewModel;
import media.tiger.tigerbox.ui.onboarding.OnboardingActivityKt;
import media.tiger.tigerbox.ui.settings.sendLogs.SendLogsInProgressViewModel;

/* compiled from: SendLogsInProgressFragment.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u000e\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/sendLogs/SendLogsInProgressFragment;", "Lmedia/tiger/tigerbox/ui/common/FullScreenNoHeaderFragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentSendLogsInProgressBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentSendLogsInProgressBinding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentSendLogsInProgressBinding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "viewModel", "Lmedia/tiger/tigerbox/ui/settings/sendLogs/SendLogsInProgressViewModel;", "getViewModel", "()Lmedia/tiger/tigerbox/ui/settings/sendLogs/SendLogsInProgressViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getCloseButton", "Landroid/widget/ImageView;", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "", "onViewCreated", "view", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class SendLogsInProgressFragment extends Hilt_SendLogsInProgressFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SendLogsInProgressFragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentSendLogsInProgressBinding;", 0))};
    private final AutoClearedValue binding$delegate;
    private final Lazy viewModel$delegate;

    @Override // media.tiger.tigerbox.ui.common.FullScreenNoHeaderFragment
    public ImageView getCloseButton() {
        return null;
    }

    public SendLogsInProgressFragment() {
        final SendLogsInProgressFragment sendLogsInProgressFragment = this;
        this.binding$delegate = AutoClearedValueKt.autoCleared(sendLogsInProgressFragment);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: media.tiger.tigerbox.ui.settings.sendLogs.SendLogsInProgressFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(sendLogsInProgressFragment, Reflection.getOrCreateKotlinClass(SendLogsInProgressViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.settings.sendLogs.SendLogsInProgressFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.settings.sendLogs.SendLogsInProgressFragment$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = sendLogsInProgressFragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final FragmentSendLogsInProgressBinding getBinding() {
        return (FragmentSendLogsInProgressBinding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentSendLogsInProgressBinding fragmentSendLogsInProgressBinding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentSendLogsInProgressBinding);
    }

    private final SendLogsInProgressViewModel getViewModel() {
        return (SendLogsInProgressViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentSendLogsInProgressBinding inflate = FragmentSendLogsInProgressBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        getViewModel().getViewState().observe(getViewLifecycleOwner(), new Observer() { // from class: media.tiger.tigerbox.ui.settings.sendLogs.SendLogsInProgressFragment$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SendLogsInProgressFragment.m2006onCreateView$lambda0(SendLogsInProgressFragment.this, (SendLogsInProgressViewModel.ViewState) obj);
            }
        });
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-0  reason: not valid java name */
    public static final void m2006onCreateView$lambda0(SendLogsInProgressFragment this$0, SendLogsInProgressViewModel.ViewState viewState) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnboardingActivityKt.navigateActionSafe$default(FragmentKt.findNavController(this$0), R.id.action_send_logs_in_progress_to_finished, null, 2, null);
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().sendLogs();
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment
    /* renamed from: getViewModel */
    public DialogViewModel mo1841getViewModel() {
        return getViewModel();
    }
}
