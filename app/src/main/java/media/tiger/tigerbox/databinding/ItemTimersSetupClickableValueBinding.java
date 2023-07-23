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
import media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupItem;

/* loaded from: classes3.dex */
public abstract class ItemTimersSetupClickableValueBinding extends ViewDataBinding {
    @Bindable
    protected TimersSetupItem mTimersSetupItem;
    public final Guideline timersSetupItemGuideline;
    public final TextView timersSetupItemLength;
    public final TextView timersSetupItemTitle;

    public abstract void setTimersSetupItem(TimersSetupItem timersSetupItem);

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemTimersSetupClickableValueBinding(Object _bindingComponent, View _root, int _localFieldCount, Guideline timersSetupItemGuideline, TextView timersSetupItemLength, TextView timersSetupItemTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.timersSetupItemGuideline = timersSetupItemGuideline;
        this.timersSetupItemLength = timersSetupItemLength;
        this.timersSetupItemTitle = timersSetupItemTitle;
    }

    public TimersSetupItem getTimersSetupItem() {
        return this.mTimersSetupItem;
    }

    public static ItemTimersSetupClickableValueBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupClickableValueBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (ItemTimersSetupClickableValueBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_setup_clickable_value, root, attachToRoot, component);
    }

    public static ItemTimersSetupClickableValueBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupClickableValueBinding inflate(LayoutInflater inflater, Object component) {
        return (ItemTimersSetupClickableValueBinding) ViewDataBinding.inflateInternal(inflater, R.layout.item_timers_setup_clickable_value, null, false, component);
    }

    public static ItemTimersSetupClickableValueBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemTimersSetupClickableValueBinding bind(View view, Object component) {
        return (ItemTimersSetupClickableValueBinding) bind(component, view, R.layout.item_timers_setup_clickable_value);
    }
}
