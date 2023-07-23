package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentWildcardReassigningStep1Binding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final Button wildcardReassigningStep1CancelButton;
    public final TextView wildcardReassigningStep1Text;
    public final TextView wildcardReassigningStep1Title;
    public final ConstraintLayout wildcardReassigningStep2Container;

    private FragmentWildcardReassigningStep1Binding(ConstraintLayout rootView, Button wildcardReassigningStep1CancelButton, TextView wildcardReassigningStep1Text, TextView wildcardReassigningStep1Title, ConstraintLayout wildcardReassigningStep2Container) {
        this.rootView = rootView;
        this.wildcardReassigningStep1CancelButton = wildcardReassigningStep1CancelButton;
        this.wildcardReassigningStep1Text = wildcardReassigningStep1Text;
        this.wildcardReassigningStep1Title = wildcardReassigningStep1Title;
        this.wildcardReassigningStep2Container = wildcardReassigningStep2Container;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWildcardReassigningStep1Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentWildcardReassigningStep1Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_wildcard_reassigning_step1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWildcardReassigningStep1Binding bind(View rootView) {
        int i = R.id.wildcard_reassigning_step_1_cancel_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_1_cancel_button);
        if (button != null) {
            i = R.id.wildcard_reassigning_step_1_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_1_text);
            if (textView != null) {
                i = R.id.wildcard_reassigning_step_1_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_1_title);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                    return new FragmentWildcardReassigningStep1Binding(constraintLayout, button, textView, textView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
