package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupItem;

/* loaded from: classes3.dex */
public abstract class ItemTimersSetupTitleBinding extends ViewDataBinding {
    @Bindable
    protected TimersSetupItem mTimersSetupItem;
    public final TextView timersSetupItemLabel;

    public abstract void setTimersSetupItem(TimersSetupItem timersSetupItem);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemTimersSetupTitleBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView timersSetupItemLabel) {
        super(_bindingComponent, _root, _localFieldCount);
        this.timersSetupItemLabel = timersSetupItemLabel;
    }

    public TimersSetupItem getTimersSetupItem() {
        return this.mTimersSetupItem;
    }

    public static ItemTimersSetupTitleBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupTitleBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemTimersSetupTitleBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_setup_title, root, attachToRoot, component);
    }

    public static ItemTimersSetupTitleBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupTitleBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemTimersSetupTitleBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_setup_title, null, false, component);
    }

    public static ItemTimersSetupTitleBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupTitleBinding bind(View view, Object component) {
        return (ItemTimersSetupTitleBinding) bind(component, view, R.layout.item_timers_setup_title);
    }
}
