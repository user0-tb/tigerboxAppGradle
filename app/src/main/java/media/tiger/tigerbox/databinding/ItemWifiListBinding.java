package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.model.domain.WifiItem;
import media.tiger.tigerbox.ui.binding.BindingClickListener;

/* loaded from: classes3.dex */
public abstract class ItemWifiListBinding extends ViewDataBinding {
    @Bindable
    protected BindingClickListener<WifiItem> mClickListener;
    @Bindable
    protected WifiItem mWifiItem;
    public final ImageView wifiListItemConnectedIcon;
    public final ProgressBar wifiListItemConnectingIcon;
    public final FrameLayout wifiListItemIconContainer;
    public final ImageView wifiListItemLevelIcon;
    public final TextView wifiListItemSsidName;

    public abstract void setClickListener(BindingClickListener<WifiItem> clickListener);

    public abstract void setWifiItem(WifiItem wifiItem);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemWifiListBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView wifiListItemConnectedIcon, ProgressBar wifiListItemConnectingIcon, FrameLayout wifiListItemIconContainer, ImageView wifiListItemLevelIcon, TextView wifiListItemSsidName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.wifiListItemConnectedIcon = wifiListItemConnectedIcon;
        this.wifiListItemConnectingIcon = wifiListItemConnectingIcon;
        this.wifiListItemIconContainer = wifiListItemIconContainer;
        this.wifiListItemLevelIcon = wifiListItemLevelIcon;
        this.wifiListItemSsidName = wifiListItemSsidName;
    }

    public BindingClickListener<WifiItem> getClickListener() {
        return this.mClickListener;
    }

    public WifiItem getWifiItem() {
        return this.mWifiItem;
    }

    public static ItemWifiListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemWifiListBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemWifiListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_wifi_list, root, attachToRoot, component);
    }

    public static ItemWifiListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemWifiListBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemWifiListBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_wifi_list, null, false, component);
    }

    public static ItemWifiListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemWifiListBinding bind(View view, Object component) {
        return (ItemWifiListBinding) bind(component, view, R.layout.item_wifi_list);
    }
}
