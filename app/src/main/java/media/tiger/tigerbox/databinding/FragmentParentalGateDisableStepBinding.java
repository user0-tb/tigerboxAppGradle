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
public final class FragmentParentalGateDisableStepBinding implements ViewBinding {
    public final Button fragmentParentalGateDisableStepCancelButton;
    public final Guideline fragmentParentalGateDisableStepGuideline;
    public final TextView fragmentParentalGateDisableStepMessage;
    public final Button fragmentParentalGateDisableStepOkButton;
    public final TextView fragmentParentalGateDisableStepTitle;
    private final ConstraintLayout rootView;
    public final ConstraintLayout wildcardReassigningStep2Container;

    private FragmentParentalGateDisableStepBinding(ConstraintLayout rootView, Button fragmentParentalGateDisableStepCancelButton, Guideline fragmentParentalGateDisableStepGuideline, TextView fragmentParentalGateDisableStepMessage, Button fragmentParentalGateDisableStepOkButton, TextView fragmentParentalGateDisableStepTitle, ConstraintLayout wildcardReassigningStep2Container) {
        this.rootView = rootView;
        this.fragmentParentalGateDisableStepCancelButton = fragmentParentalGateDisableStepCancelButton;
        this.fragmentParentalGateDisableStepGuideline = fragmentParentalGateDisableStepGuideline;
        this.fragmentParentalGateDisableStepMessage = fragmentParentalGateDisableStepMessage;
        this.fragmentParentalGateDisableStepOkButton = fragmentParentalGateDisableStepOkButton;
        this.fragmentParentalGateDisableStepTitle = fragmentParentalGateDisableStepTitle;
        this.wildcardReassigningStep2Container = wildcardReassigningStep2Container;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentParentalGateDisableStepBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentParentalGateDisableStepBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_parental_gate_disable_step, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentParentalGateDisableStepBinding bind(View rootView) {
        int i = R.id.fragment_parentalGate_disableStep_cancel_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_disableStep_cancel_button);
        if (button != null) {
            i = R.id.fragment_parentalGate_disableStep_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_disableStep_guideline);
            if (guideline != null) {
                i = R.id.fragment_parentalGate_disableStep_message;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_disableStep_message);
                if (textView != null) {
                    i = R.id.fragment_parentalGate_disableStep_ok_button;
                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_disableStep_ok_button);
                    if (button2 != null) {
                        i = R.id.fragment_parentalGate_disableStep_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_disableStep_title);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                            return new FragmentParentalGateDisableStepBinding(constraintLayout, button, guideline, textView, button2, textView2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
