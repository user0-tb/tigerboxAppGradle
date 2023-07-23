package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.settings.SettingsItemData;

/* loaded from: classes3.dex */
public abstract class ItemSettingsBinding extends ViewDataBinding {
    public final ImageView itemIcon;
    public final TextView itemTitle;
    @Bindable
    protected SettingsItemData mItem;
    @Bindable
    protected Boolean mSelected;

    public abstract void setItem(SettingsItemData item);

    public abstract void setSelected(Boolean selected);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemSettingsBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView itemIcon, TextView itemTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.itemIcon = itemIcon;
        this.itemTitle = itemTitle;
    }

    public Boolean getSelected() {
        return this.mSelected;
    }

    public SettingsItemData getItem() {
        return this.mItem;
    }

    public static ItemSettingsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSettingsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemSettingsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_settings, root, attachToRoot, component);
    }

    public static ItemSettingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSettingsBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemSettingsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_settings, null, false, component);
    }

    public static ItemSettingsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemSettingsBinding bind(View view, Object component) {
        return (ItemSettingsBinding) bind(component, view, R.layout.item_settings);
    }
}
