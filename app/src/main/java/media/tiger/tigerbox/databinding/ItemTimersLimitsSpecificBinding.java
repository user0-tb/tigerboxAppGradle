package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.settings.timersSetup.TimersTimeLimitItem;

/* loaded from: classes3.dex */
public abstract class ItemTimersLimitsSpecificBinding extends ViewDataBinding {
    @Bindable
    protected TimersTimeLimitItem mTimersTimeLimitItem;
    public final TextView timersSetupItemTitle;

    public abstract void setTimersTimeLimitItem(TimersTimeLimitItem timersTimeLimitItem);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemTimersLimitsSpecificBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView timersSetupItemTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.timersSetupItemTitle = timersSetupItemTitle;
    }

    public TimersTimeLimitItem getTimersTimeLimitItem() {
        return this.mTimersTimeLimitItem;
    }

    public static ItemTimersLimitsSpecificBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersLimitsSpecificBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemTimersLimitsSpecificBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_limits_specific, root, attachToRoot, component);
    }

    public static ItemTimersLimitsSpecificBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersLimitsSpecificBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemTimersLimitsSpecificBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_limits_specific, null, false, component);
    }

    public static ItemTimersLimitsSpecificBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersLimitsSpecificBinding bind(View view, Object component) {
        return (ItemTimersLimitsSpecificBinding) bind(component, view, R.layout.item_timers_limits_specific);
    }
}
