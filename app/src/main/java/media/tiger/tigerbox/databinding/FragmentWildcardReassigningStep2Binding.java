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
public final class FragmentWildcardReassigningStep2Binding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final TextView textView;
    public final Button wildcardReassigningStep2CancelButton;
    public final ConstraintLayout wildcardReassigningStep2Container;
    public final Button wildcardReassigningStep2OkButton;
    public final TextView wildcardReassigningStep2Text;
    public final TextView wildcardReassigningStep2Title;

    private FragmentWildcardReassigningStep2Binding(ConstraintLayout rootView, TextView textView, Button wildcardReassigningStep2CancelButton, ConstraintLayout wildcardReassigningStep2Container, Button wildcardReassigningStep2OkButton, TextView wildcardReassigningStep2Text, TextView wildcardReassigningStep2Title) {
        this.rootView = rootView;
        this.textView = textView;
        this.wildcardReassigningStep2CancelButton = wildcardReassigningStep2CancelButton;
        this.wildcardReassigningStep2Container = wildcardReassigningStep2Container;
        this.wildcardReassigningStep2OkButton = wildcardReassigningStep2OkButton;
        this.wildcardReassigningStep2Text = wildcardReassigningStep2Text;
        this.wildcardReassigningStep2Title = wildcardReassigningStep2Title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWildcardReassigningStep2Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentWildcardReassigningStep2Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_wildcard_reassigning_step2, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWildcardReassigningStep2Binding bind(View rootView) {
        int i = R.id.textView;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.textView);
        if (textView != null) {
            i = R.id.wildcard_reassigning_step_2_cancel_button;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_2_cancel_button);
            if (button != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                i = R.id.wildcard_reassigning_step_2_ok_button;
                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_2_ok_button);
                if (button2 != null) {
                    i = R.id.wildcard_reassigning_step_2_text;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_2_text);
                    if (textView2 != null) {
                        i = R.id.wildcard_reassigning_step_2_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_2_title);
                        if (textView3 != null) {
                            return new FragmentWildcardReassigningStep2Binding(constraintLayout, textView, button, constraintLayout, button2, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
