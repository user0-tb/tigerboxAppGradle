package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentSendLogsInProgressBinding implements ViewBinding {
    public final ProgressBar resetInProgressSpinner;
    private final ConstraintLayout rootView;
    public final ConstraintLayout sendLogsInProgressContainer;
    public final TextView sendLogsInProgressMessage;
    public final TextView sendLogsInProgressTitle;

    private FragmentSendLogsInProgressBinding(ConstraintLayout rootView, ProgressBar resetInProgressSpinner, ConstraintLayout sendLogsInProgressContainer, TextView sendLogsInProgressMessage, TextView sendLogsInProgressTitle) {
        this.rootView = rootView;
        this.resetInProgressSpinner = resetInProgressSpinner;
        this.sendLogsInProgressContainer = sendLogsInProgressContainer;
        this.sendLogsInProgressMessage = sendLogsInProgressMessage;
        this.sendLogsInProgressTitle = sendLogsInProgressTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSendLogsInProgressBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentSendLogsInProgressBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_send_logs_in_progress, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSendLogsInProgressBinding bind(View rootView) {
        int i = R.id.resetInProgress_spinner;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.resetInProgress_spinner);
        if (progressBar != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i = R.id.sendLogsInProgress_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sendLogsInProgress_message);
            if (textView != null) {
                i = R.id.sendLogsInProgress_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sendLogsInProgress_title);
                if (textView2 != null) {
                    return new FragmentSendLogsInProgressBinding(constraintLayout, progressBar, constraintLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
