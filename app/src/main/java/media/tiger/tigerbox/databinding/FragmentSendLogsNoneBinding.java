package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.binding.UnTypedBindingClickListener;

/* loaded from: classes3.dex */
public abstract class FragmentSendLogsNoneBinding extends ViewDataBinding {
    public final Guideline fragmentSendLogsNoneGuideline;
    public final Guideline fragmentSendLogsNoneHGuideline;
    @Bindable
    protected UnTypedBindingClickListener mCloseHandler;
    public final Button sendLogsNoneConfirmButton;
    public final ImageView sendLogsNoneIcon;
    public final TextView sendLogsNoneMessage;
    public final TextView sendLogsNoneTitle;

    public abstract void setCloseHandler(UnTypedBindingClickListener closeHandler);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSendLogsNoneBinding(Object _bindingComponent, View _root, int _localFieldCount, Guideline fragmentSendLogsNoneGuideline, Guideline fragmentSendLogsNoneHGuideline, Button sendLogsNoneConfirmButton, ImageView sendLogsNoneIcon, TextView sendLogsNoneMessage, TextView sendLogsNoneTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fragmentSendLogsNoneGuideline = fragmentSendLogsNoneGuideline;
        this.fragmentSendLogsNoneHGuideline = fragmentSendLogsNoneHGuideline;
        this.sendLogsNoneConfirmButton = sendLogsNoneConfirmButton;
        this.sendLogsNoneIcon = sendLogsNoneIcon;
        this.sendLogsNoneMessage = sendLogsNoneMessage;
        this.sendLogsNoneTitle = sendLogsNoneTitle;
    }

    public UnTypedBindingClickListener getCloseHandler() {
        return this.mCloseHandler;
    }

    public static FragmentSendLogsNoneBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSendLogsNoneBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSendLogsNoneBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_send_logs_none, root, attachToRoot, component);
    }

    public static FragmentSendLogsNoneBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSendLogsNoneBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSendLogsNoneBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_send_logs_none, null, false, component);
    }

    public static FragmentSendLogsNoneBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSendLogsNoneBinding bind(View view, Object component) {
        return (FragmentSendLogsNoneBinding) bind(component, view, R.layout.fragment_send_logs_none);
    }
}
