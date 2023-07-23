package media.tiger.tigerbox.ui.settings.systeminfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.databinding.FragmentSystemInfoBinding;
import media.tiger.tigerbox.databinding.IncludeDialogHeaderBarBinding;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValue;
import media.tiger.tigerbox.infrastructure.functional.AutoClearedValueKt;
import media.tiger.tigerbox.ui.common.DialogViewModel;
import timber.log.Timber;

/* compiled from: SystemInfoFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/systeminfo/SystemInfoFragment;", "Lmedia/tiger/tigerbox/ui/common/FullScreenFragment;", "()V", "<set-?>", "Lmedia/tiger/tigerbox/databinding/FragmentSystemInfoBinding;", "binding", "getBinding", "()Lmedia/tiger/tigerbox/databinding/FragmentSystemInfoBinding;", "setBinding", "(Lmedia/tiger/tigerbox/databinding/FragmentSystemInfoBinding;)V", "binding$delegate", "Lmedia/tiger/tigerbox/infrastructure/functional/AutoClearedValue;", "systemInfoItems", "", "Lmedia/tiger/tigerbox/ui/settings/systeminfo/SystemInfoItem;", "getSystemInfoItems", "()Ljava/util/List;", "systemInfoItems$delegate", "Lkotlin/Lazy;", "systemInfoViewModel", "Lmedia/tiger/tigerbox/ui/settings/systeminfo/SystemInfoViewModel;", "getSystemInfoViewModel", "()Lmedia/tiger/tigerbox/ui/settings/systeminfo/SystemInfoViewModel;", "systemInfoViewModel$delegate", "getHeaderBinding", "Lmedia/tiger/tigerbox/databinding/IncludeDialogHeaderBarBinding;", "getViewModel", "Lmedia/tiger/tigerbox/ui/common/DialogViewModel;", "logUpdateInformation", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes4.dex */
public final class SystemInfoFragment extends Hilt_SystemInfoFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SystemInfoFragment.class, "binding", "getBinding()Lmedia/tiger/tigerbox/databinding/FragmentSystemInfoBinding;", 0))};
    private final AutoClearedValue binding$delegate;
    private final Lazy systemInfoItems$delegate;
    private final Lazy systemInfoViewModel$delegate;

    public SystemInfoFragment() {
        final SystemInfoFragment systemInfoFragment = this;
        this.binding$delegate = AutoClearedValueKt.autoCleared(systemInfoFragment);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: media.tiger.tigerbox.ui.settings.systeminfo.SystemInfoFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        this.systemInfoViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(systemInfoFragment, Reflection.getOrCreateKotlinClass(SystemInfoViewModel.class), new Function0<ViewModelStore>() { // from class: media.tiger.tigerbox.ui.settings.systeminfo.SystemInfoFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: media.tiger.tigerbox.ui.settings.systeminfo.SystemInfoFragment$special$$inlined$viewModels$default$3
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
                    defaultViewModelProviderFactory = systemInfoFragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.systemInfoItems$delegate = LazyKt.lazy(new Function0<List<? extends SystemInfoItem>>() { // from class: media.tiger.tigerbox.ui.settings.systeminfo.SystemInfoFragment$systemInfoItems$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends SystemInfoItem> invoke() {
                SystemInfoViewModel systemInfoViewModel;
                SystemInfoViewModel systemInfoViewModel2;
                SystemInfoViewModel systemInfoViewModel3;
                SystemInfoViewModel systemInfoViewModel4;
                SystemInfoViewModel systemInfoViewModel5;
                SystemInfoViewModel systemInfoViewModel6;
                SystemInfoViewModel systemInfoViewModel7;
                SystemInfoViewModel systemInfoViewModel8;
                systemInfoViewModel = SystemInfoFragment.this.getSystemInfoViewModel();
                systemInfoViewModel2 = SystemInfoFragment.this.getSystemInfoViewModel();
                systemInfoViewModel3 = SystemInfoFragment.this.getSystemInfoViewModel();
                systemInfoViewModel4 = SystemInfoFragment.this.getSystemInfoViewModel();
                systemInfoViewModel5 = SystemInfoFragment.this.getSystemInfoViewModel();
                StringBuilder sb = new StringBuilder();
                systemInfoViewModel6 = SystemInfoFragment.this.getSystemInfoViewModel();
                sb.append(systemInfoViewModel6.getBatteryPercentage());
                sb.append('%');
                systemInfoViewModel7 = SystemInfoFragment.this.getSystemInfoViewModel();
                systemInfoViewModel8 = SystemInfoFragment.this.getSystemInfoViewModel();
                return CollectionsKt.listOf((Object[]) new SystemInfoItem[]{new SystemInfoItem(R.string.system_info_account_label, systemInfoViewModel.getUserEmail()), new SystemInfoItem(R.string.system_info_ip_label, systemInfoViewModel2.getIpAddress()), new SystemInfoItem(R.string.system_info_mac_label, systemInfoViewModel3.getMacAddress()), new SystemInfoItem(R.string.system_info_cpuId_label, systemInfoViewModel4.getCpuId()), new SystemInfoItem(R.string.system_info_firmware_version_label, systemInfoViewModel5.getSoftwareVersion()), new SystemInfoItem(R.string.system_info_battery_percent, sb.toString()), new SystemInfoItem(R.string.system_info_dish_space_available_label, systemInfoViewModel7.getAvailableDiskSpace()), new SystemInfoItem(R.string.system_info_dish_space_used_label, systemInfoViewModel8.getUsedDiskSpace())});
            }
        });
    }

    private final FragmentSystemInfoBinding getBinding() {
        return (FragmentSystemInfoBinding) this.binding$delegate.getValue((Fragment) this, $$delegatedProperties[0]);
    }

    private final void setBinding(FragmentSystemInfoBinding fragmentSystemInfoBinding) {
        this.binding$delegate.setValue2((Fragment) this, $$delegatedProperties[0], (KProperty<?>) fragmentSystemInfoBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SystemInfoViewModel getSystemInfoViewModel() {
        return (SystemInfoViewModel) this.systemInfoViewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentSystemInfoBinding inflate = FragmentSystemInfoBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        setBinding(inflate);
        SystemInfoAdapter systemInfoAdapter = new SystemInfoAdapter();
        getBinding().systemInfoRecyclerView.setAdapter(systemInfoAdapter);
        systemInfoAdapter.submitList(getSystemInfoItems());
        logUpdateInformation();
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    private final void logUpdateInformation() {
        Timber.Forest forest = Timber.Forest;
        forest.d("SystemInfo", "System update info:\n  --> Config  : [" + getSystemInfoViewModel().getConfigName() + "]\n  --> Firmware: [" + getSystemInfoViewModel().getFirmwareVersion() + "]\n  --> F/W Date: [" + getSystemInfoViewModel().getVersionDate() + "]\n  --> Storage : [" + getSystemInfoViewModel().getStorageUpdateDate() + ']');
    }

    private final List<SystemInfoItem> getSystemInfoItems() {
        return (List) this.systemInfoItems$delegate.getValue();
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment
    public IncludeDialogHeaderBarBinding getHeaderBinding() {
        IncludeDialogHeaderBarBinding includeDialogHeaderBarBinding = getBinding().fragmentHeaderBar;
        Intrinsics.checkNotNullExpressionValue(includeDialogHeaderBarBinding, "binding.fragmentHeaderBar");
        return includeDialogHeaderBarBinding;
    }

    @Override // media.tiger.tigerbox.ui.common.FullScreenFragment
    /* renamed from: getViewModel */
    public DialogViewModel mo1841getViewModel() {
        return getSystemInfoViewModel();
    }
}
