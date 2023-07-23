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
public abstract class ItemTimersSetupClickableTitleBinding extends ViewDataBinding {
    @Bindable
    protected TimersSetupItem mTimersSetupItem;
    public final TextView timersSetupItemTitle;

    public abstract void setTimersSetupItem(TimersSetupItem timersSetupItem);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemTimersSetupClickableTitleBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView timersSetupItemTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.timersSetupItemTitle = timersSetupItemTitle;
    }

    public TimersSetupItem getTimersSetupItem() {
        return this.mTimersSetupItem;
    }

    public static ItemTimersSetupClickableTitleBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupClickableTitleBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemTimersSetupClickableTitleBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_setup_clickable_title, root, attachToRoot, component);
    }

    public static ItemTimersSetupClickableTitleBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupClickableTitleBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemTimersSetupClickableTitleBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_setup_clickable_title, null, false, component);
    }

    public static ItemTimersSetupClickableTitleBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupClickableTitleBinding bind(View view, Object component) {
        return (ItemTimersSetupClickableTitleBinding) bind(component, view, R.layout.item_timers_setup_clickable_title);
    }
}
