package media.tiger.tigerbox.ui.onboarding.step1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.FragmentKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.databinding.FragmentOnboardingStep1Screen3Binding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.ui.onboarding.OnboardingActivityKt;

/* compiled from: OnboardingStep1Screen3Fragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step1/OnboardingStep1Screen3Fragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentOnboardingStep1Screen3Binding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentOnboardingStep1Screen3Binding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentOnboardingStep1Screen3Binding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class OnboardingStep1Screen3Fragment extends Hilt_OnboardingStep1Screen3Fragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(OnboardingStep1Screen3Fragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentOnboardingStep1Screen3Binding;", 0))};
    private final AutoClearedValue binding$delegate = AutoClearedValueKt.autoCleared(this);

    private final FragmentOnboardingStep1Screen3Binding getBinding() {
        return (FragmentOnboardingStep1Screen3Binding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentOnboardingStep1Screen3Binding fragmentOnboardingStep1Screen3Binding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentOnboardingStep1Screen3Binding);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentOnboardingStep1Screen3Binding inflate = FragmentOnboardingStep1Screen3Binding.inflate(inflater, viewGroup, false);
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
        getBinding().onboardingStep3Button.setOnClickListener(new View.OnClickListener() { // from class: media.tiger.tigerbox.ui.onboarding.step1.OnboardingStep1Screen3Fragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OnboardingStep1Screen3Fragment.m1940onViewCreated$lambda0(OnboardingStep1Screen3Fragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m1940onViewCreated$lambda0(OnboardingStep1Screen3Fragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnboardingActivityKt.navigateActionSafe$default(FragmentKt.findNavController(this$0), R.id.action_onboardingStep3Fragment_to_onboardingWifiListFragment, null, 2, null);
    }
}
