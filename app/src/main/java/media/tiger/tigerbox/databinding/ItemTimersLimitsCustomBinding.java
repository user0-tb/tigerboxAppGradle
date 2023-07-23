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
public abstract class ItemTimersLimitsCustomBinding extends ViewDataBinding {
    @Bindable
    protected TimersTimeLimitItem mTimersTimeLimitItem;
    public final TextView timersSetupItemTitle;

    public abstract void setTimersTimeLimitItem(TimersTimeLimitItem timersTimeLimitItem);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemTimersLimitsCustomBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView timersSetupItemTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.timersSetupItemTitle = timersSetupItemTitle;
    }

    public TimersTimeLimitItem getTimersTimeLimitItem() {
        return this.mTimersTimeLimitItem;
    }

    public static ItemTimersLimitsCustomBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersLimitsCustomBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemTimersLimitsCustomBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_limits_custom, root, attachToRoot, component);
    }

    public static ItemTimersLimitsCustomBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersLimitsCustomBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemTimersLimitsCustomBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_limits_custom, null, false, component);
    }

    public static ItemTimersLimitsCustomBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersLimitsCustomBinding bind(View view, Object component) {
        return (ItemTimersLimitsCustomBinding) bind(component, view, R.layout.item_timers_limits_custom);
    }
}
