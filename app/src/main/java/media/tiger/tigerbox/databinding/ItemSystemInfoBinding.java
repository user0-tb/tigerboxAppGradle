package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.settings.systeminfo.SystemInfoItem;

/* loaded from: classes3.dex */
public abstract class ItemSystemInfoBinding extends ViewDataBinding {
    @Bindable
    protected SystemInfoItem mSystemInfoItem;
    public final Guideline systemInfoItemGuideline;
    public final TextView systemInfoItemLabel;
    public final TextView systemInfoItemValue;

    public abstract void setSystemInfoItem(SystemInfoItem systemInfoItem);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemSystemInfoBinding(Object _bindingComponent, View _root, int _localFieldCount, Guideline systemInfoItemGuideline, TextView systemInfoItemLabel, TextView systemInfoItemValue) {
        super(_bindingComponent, _root, _localFieldCount);
        this.systemInfoItemGuideline = systemInfoItemGuideline;
        this.systemInfoItemLabel = systemInfoItemLabel;
        this.systemInfoItemValue = systemInfoItemValue;
    }

    public SystemInfoItem getSystemInfoItem() {
        return this.mSystemInfoItem;
    }

    public static ItemSystemInfoBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSystemInfoBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemSystemInfoBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_system_info, root, attachToRoot, component);
    }

    public static ItemSystemInfoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSystemInfoBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemSystemInfoBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_system_info, null, false, component);
    }

    public static ItemSystemInfoBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSystemInfoBinding bind(View view, Object component) {
        return (ItemSystemInfoBinding) bind(component, view, R.layout.item_system_info);
    }
}
