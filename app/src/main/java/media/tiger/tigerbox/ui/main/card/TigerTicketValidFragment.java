package media.tiger.tigerbox.ui.main.card;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.databinding.FragmentTigerTicketValidBinding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.ui.common.DialogViewModel;

/* compiled from: TigerTicketValidFragment.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/card/TigerTicketValidFragment;", "Lmedia/tiger/tigerbox/ui/common/FullScreenNoHeaderFragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentTigerTicketValidBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentTigerTicketValidBinding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentTigerTicketValidBinding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "getCloseButton", "Landroid/widget/ImageView;", "getViewModel", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class TigerTicketValidFragment extends Hilt_TigerTicketValidFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(TigerTicketValidFragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentTigerTicketValidBinding;", 0))};
    private final AutoClearedValue binding$delegate = AutoClearedValueKt.autoCleared(this);

    @Override // media.tiger.tigerbox.ui.common.FullScreenNoHeaderFragment
    public ImageView getCloseButton() {
        return null;
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment
    /* renamed from: getViewModel */
    public DialogViewModel mo1841getViewModel() {
        return null;
    }

    private final FragmentTigerTicketValidBinding getBinding() {
        return (FragmentTigerTicketValidBinding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentTigerTicketValidBinding fragmentTigerTicketValidBinding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentTigerTicketValidBinding);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentTigerTicketValidBinding inflate = FragmentTigerTicketValidBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }
}
