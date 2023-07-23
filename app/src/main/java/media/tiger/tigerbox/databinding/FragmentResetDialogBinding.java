package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentResetDialogBinding implements ViewBinding {
    public final Button fragmentResetDialogCancelButton;
    public final Guideline fragmentResetDialogGuideline;
    public final TextView fragmentResetDialogMessage;
    public final Button fragmentResetDialogOkButton;
    public final TextView fragmentResetDialogTitle;
    private final ConstraintLayout rootView;
    public final ConstraintLayout wildcardReassigningStep2Container;

    private FragmentResetDialogBinding(ConstraintLayout rootView, Button fragmentResetDialogCancelButton, Guideline fragmentResetDialogGuideline, TextView fragmentResetDialogMessage, Button fragmentResetDialogOkButton, TextView fragmentResetDialogTitle, ConstraintLayout wildcardReassigningStep2Container) {
        this.rootView = rootView;
        this.fragmentResetDialogCancelButton = fragmentResetDialogCancelButton;
        this.fragmentResetDialogGuideline = fragmentResetDialogGuideline;
        this.fragmentResetDialogMessage = fragmentResetDialogMessage;
        this.fragmentResetDialogOkButton = fragmentResetDialogOkButton;
        this.fragmentResetDialogTitle = fragmentResetDialogTitle;
        this.wildcardReassigningStep2Container = wildcardReassigningStep2Container;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentResetDialogBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentResetDialogBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_reset_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentResetDialogBinding bind(View rootView) {
        int i = R.id.fragment_resetDialog_cancel_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.fragment_resetDialog_cancel_button);
        if (button != null) {
            i = R.id.fragment_resetDialog_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.fragment_resetDialog_guideline);
            if (guideline != null) {
                i = R.id.fragment_resetDialog_message;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fragment_resetDialog_message);
                if (textView != null) {
                    i = R.id.fragment_resetDialog_ok_button;
                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.fragment_resetDialog_ok_button);
                    if (button2 != null) {
                        i = R.id.fragment_resetDialog_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fragment_resetDialog_title);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                            return new FragmentResetDialogBinding(constraintLayout, button, guideline, textView, button2, textView2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
