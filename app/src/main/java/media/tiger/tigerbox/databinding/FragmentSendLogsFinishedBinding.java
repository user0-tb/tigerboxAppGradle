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
public abstract class FragmentSendLogsFinishedBinding extends ViewDataBinding {
    public final Guideline fragmentSendLogsFinishedGuideline;
    public final Guideline fragmentSendLogsFinishedHGuideline;
    @Bindable
    protected UnTypedBindingClickListener mCloseHandler;
    public final Button sendLogsFinishedConfirmButton;
    public final ImageView sendLogsFinishedIcon;
    public final TextView sendLogsFinishedMessage;
    public final TextView sendLogsFinishedTitle;

    public abstract void setCloseHandler(UnTypedBindingClickListener closeHandler);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentSendLogsFinishedBinding(Object _bindingComponent, View _root, int _localFieldCount, Guideline fragmentSendLogsFinishedGuideline, Guideline fragmentSendLogsFinishedHGuideline, Button sendLogsFinishedConfirmButton, ImageView sendLogsFinishedIcon, TextView sendLogsFinishedMessage, TextView sendLogsFinishedTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fragmentSendLogsFinishedGuideline = fragmentSendLogsFinishedGuideline;
        this.fragmentSendLogsFinishedHGuideline = fragmentSendLogsFinishedHGuideline;
        this.sendLogsFinishedConfirmButton = sendLogsFinishedConfirmButton;
        this.sendLogsFinishedIcon = sendLogsFinishedIcon;
        this.sendLogsFinishedMessage = sendLogsFinishedMessage;
        this.sendLogsFinishedTitle = sendLogsFinishedTitle;
    }

    public UnTypedBindingClickListener getCloseHandler() {
        return this.mCloseHandler;
    }

    public static FragmentSendLogsFinishedBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSendLogsFinishedBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentSendLogsFinishedBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_send_logs_finished, root, attachToRoot, component);
    }

    public static FragmentSendLogsFinishedBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSendLogsFinishedBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentSendLogsFinishedBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_send_logs_finished, null, false, component);
    }

    public static FragmentSendLogsFinishedBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSendLogsFinishedBinding bind(View view, Object component) {
        return (FragmentSendLogsFinishedBinding) bind(component, view, R.layout.fragment_send_logs_finished);
    }
}
