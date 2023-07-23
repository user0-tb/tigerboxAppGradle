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
public final class FragmentResetInProgressBinding implements ViewBinding {
    public final TextView resetInProgressMessage;
    public final ProgressBar resetInProgressSpinner;
    public final TextView resetInProgressTitle;
    private final ConstraintLayout rootView;
    public final ConstraintLayout wildcardReassigningStep2Container;

    private FragmentResetInProgressBinding(ConstraintLayout rootView, TextView resetInProgressMessage, ProgressBar resetInProgressSpinner, TextView resetInProgressTitle, ConstraintLayout wildcardReassigningStep2Container) {
        this.rootView = rootView;
        this.resetInProgressMessage = resetInProgressMessage;
        this.resetInProgressSpinner = resetInProgressSpinner;
        this.resetInProgressTitle = resetInProgressTitle;
        this.wildcardReassigningStep2Container = wildcardReassigningStep2Container;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentResetInProgressBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentResetInProgressBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_reset_in_progress, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentResetInProgressBinding bind(View rootView) {
        int i = R.id.resetInProgress_message;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.resetInProgress_message);
        if (textView != null) {
            i = R.id.resetInProgress_spinner;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.resetInProgress_spinner);
            if (progressBar != null) {
                i = R.id.resetInProgress_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.resetInProgress_title);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                    return new FragmentResetInProgressBinding(constraintLayout, textView, progressBar, textView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
