package media.tiger.tigerbox.ui.settings.wildcardreassigning;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.databinding.FragmentWildcardReassigningStep2Binding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.ui.common.DialogViewModel;

/* compiled from: WildCardReAssigningStep2Fragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/wildcardreassigning/WildCardReAssigningStep2Fragment;", "Lmedia/tiger/tigerbox/ui/common/FullScreenNoHeaderFragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentWildcardReassigningStep2Binding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentWildcardReassigningStep2Binding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentWildcardReassigningStep2Binding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "step2ViewModel", "Lmedia/tiger/tigerbox/ui/settings/wildcardreassigning/WildCardReAssigningStep2ViewModel;", "getStep2ViewModel", "()Lmedia/tiger/tigerbox/ui/settings/wildcardreassigning/WildCardReAssigningStep2ViewModel;", "step2ViewModel$delegate", "Lkotlin/Lazy;", "getCloseButton", "Landroid/widget/ImageView;", "getViewModel", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class WildCardReAssigningStep2Fragment extends Hilt_WildCardReAssigningStep2Fragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WildCardReAssigningStep2Fragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentWildcardReassigningStep2Binding;", 0))};
    private final AutoClearedValue binding$delegate;
    private final Lazy step2ViewModel$delegate;

    @Override // media.tiger.tigerbox.ui.common.FullScreenNoHeaderFragment
    public ImageView getCloseButton() {
        return null;
    }

    public WildCardReAssigningStep2Fragment() {
        final WildCardReAssigningStep2Fragment wildCardReAssigningStep2Fragment = this;
        this.binding$delegate = AutoClearedValueKt.autoCleared(wildCardReAssigningStep2Fragment);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: media.tiger.tigerbox.ui.settings.wildcardreassigning.WildCardReAssigningStep2Fragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.step2ViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(wildCardReAssigningStep2Fragment, Reflection.getOrCreateKotlinClass(WildCardReAssigningStep2ViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.settings.wildcardreassigning.WildCardReAssigningStep2Fragment$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.settings.wildcardreassigning.WildCardReAssigningStep2Fragment$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = wildCardReAssigningStep2Fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final FragmentWildcardReassigningStep2Binding getBinding() {
        return (FragmentWildcardReassigningStep2Binding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentWildcardReassigningStep2Binding fragmentWildcardReassigningStep2Binding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentWildcardReassigningStep2Binding);
    }

    private final WildCardReAssigningStep2ViewModel getStep2ViewModel() {
        return (WildCardReAssigningStep2ViewModel) this.step2ViewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentWildcardReassigningStep2Binding inflate = FragmentWildcardReassigningStep2Binding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        getBinding().wildcardReassigningStep2OkButton.setOnClickListener(new View.OnClickListener() { // from class: media.tiger.tigerbox.ui.settings.wildcardreassigning.WildCardReAssigningStep2Fragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WildCardReAssigningStep2Fragment.m2026onCreateView$lambda0(WildCardReAssigningStep2Fragment.this, view);
            }
        });
        getBinding().wildcardReassigningStep2CancelButton.setOnClickListener(new View.OnClickListener() { // from class: media.tiger.tigerbox.ui.settings.wildcardreassigning.WildCardReAssigningStep2Fragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WildCardReAssigningStep2Fragment.m2027onCreateView$lambda1(WildCardReAssigningStep2Fragment.this, view);
            }
        });
        TextView textView = getBinding().wildcardReassigningStep2Text;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getString(R.string.wildcard_reassigning_screen2_text1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.wildc…eassigning_screen2_text1)");
        String format = String.format(string, Arrays.copyOf(new Object[]{getStep2ViewModel().getAccountEmail()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        textView.setText(format);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-0  reason: not valid java name */
    public static final void m2026onCreateView$lambda0(WildCardReAssigningStep2Fragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getStep2ViewModel().continueToStep3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m2027onCreateView$lambda1(WildCardReAssigningStep2Fragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getStep2ViewModel().cancelWildcardReassign();
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment
    /* renamed from: getViewModel */
    public DialogViewModel mo1841getViewModel() {
        return getStep2ViewModel();
    }
}
