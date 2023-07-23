package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.binding.BindingClickListener;

/* loaded from: classes3.dex */
public abstract class ItemFooterBinding extends ViewDataBinding {
    public final TextView footerItem;
    @Bindable
    protected BindingClickListener<Integer> mFooterClickListener;
    @Bindable
    protected Integer mFooterRowId;

    public abstract void setFooterClickListener(BindingClickListener<Integer> footerClickListener);

    public abstract void setFooterRowId(Integer footerRowId);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemFooterBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView footerItem) {
        super(_bindingComponent, _root, _localFieldCount);
        this.footerItem = footerItem;
    }

    public BindingClickListener<Integer> getFooterClickListener() {
        return this.mFooterClickListener;
    }

    public Integer getFooterRowId() {
        return this.mFooterRowId;
    }

    public static ItemFooterBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFooterBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemFooterBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_footer, root, attachToRoot, component);
    }

    public static ItemFooterBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFooterBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemFooterBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_footer, null, false, component);
    }

    public static ItemFooterBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemFooterBinding bind(View view, Object component) {
        return (ItemFooterBinding) bind(component, view, R.layout.item_footer);
    }
}
