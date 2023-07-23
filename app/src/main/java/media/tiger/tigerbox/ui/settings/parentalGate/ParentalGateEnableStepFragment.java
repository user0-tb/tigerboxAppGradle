package media.tiger.tigerbox.ui.settings.parentalGate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.databinding.FragmentParentalGateEnableStepBinding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.ui.common.DialogViewModel;

/* compiled from: ParentalGateEnableStepFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u000e\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/parentalGate/ParentalGateEnableStepFragment;", "Lmedia/tiger/tigerbox/ui/common/FullScreenNoHeaderFragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentParentalGateEnableStepBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentParentalGateEnableStepBinding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentParentalGateEnableStepBinding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "viewModel", "Lmedia/tiger/tigerbox/ui/settings/parentalGate/ParentalGateEnableDisableStepViewModel;", "getViewModel", "()Lmedia/tiger/tigerbox/ui/settings/parentalGate/ParentalGateEnableDisableStepViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getCloseButton", "Landroid/widget/ImageView;", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class ParentalGateEnableStepFragment extends Hilt_ParentalGateEnableStepFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ParentalGateEnableStepFragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentParentalGateEnableStepBinding;", 0))};
    private final AutoClearedValue binding$delegate;
    private final Lazy viewModel$delegate;

    @Override // media.tiger.tigerbox.ui.common.FullScreenNoHeaderFragment
    public ImageView getCloseButton() {
        return null;
    }

    public ParentalGateEnableStepFragment() {
        final ParentalGateEnableStepFragment parentalGateEnableStepFragment = this;
        this.binding$delegate = AutoClearedValueKt.autoCleared(parentalGateEnableStepFragment);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: media.tiger.tigerbox.ui.settings.parentalGate.ParentalGateEnableStepFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(parentalGateEnableStepFragment, Reflection.getOrCreateKotlinClass(ParentalGateEnableDisableStepViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.settings.parentalGate.ParentalGateEnableStepFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.settings.parentalGate.ParentalGateEnableStepFragment$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = parentalGateEnableStepFragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final FragmentParentalGateEnableStepBinding getBinding() {
        return (FragmentParentalGateEnableStepBinding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentParentalGateEnableStepBinding fragmentParentalGateEnableStepBinding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentParentalGateEnableStepBinding);
    }

    private final ParentalGateEnableDisableStepViewModel getViewModel() {
        return (ParentalGateEnableDisableStepViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentParentalGateEnableStepBinding inflate = FragmentParentalGateEnableStepBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        getBinding().fragmentParentalGateEnableStepOkButton.setOnClickListener(new View.OnClickListener() { // from class: media.tiger.tigerbox.ui.settings.parentalGate.ParentalGateEnableStepFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentalGateEnableStepFragment.m1999onCreateView$lambda0(ParentalGateEnableStepFragment.this, view);
            }
        });
        getBinding().fragmentParentalGateEnableStepCancelButton.setOnClickListener(new View.OnClickListener() { // from class: media.tiger.tigerbox.ui.settings.parentalGate.ParentalGateEnableStepFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ParentalGateEnableStepFragment.m2000onCreateView$lambda1(ParentalGateEnableStepFragment.this, view);
            }
        });
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-0  reason: not valid java name */
    public static final void m1999onCreateView$lambda0(ParentalGateEnableStepFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().setParentalGateState(true);
        this$0.closeSafely();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m2000onCreateView$lambda1(ParentalGateEnableStepFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeSafely();
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment
    /* renamed from: getViewModel */
    public DialogViewModel mo1841getViewModel() {
        return getViewModel();
    }
}
