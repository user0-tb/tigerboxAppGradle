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
public final class FragmentParentalGateEnableStepBinding implements ViewBinding {
    public final Button fragmentParentalGateEnableStepCancelButton;
    public final Guideline fragmentParentalGateEnableStepGuideline;
    public final TextView fragmentParentalGateEnableStepMessage;
    public final Button fragmentParentalGateEnableStepOkButton;
    public final TextView fragmentParentalGateEnableStepTitle;
    private final ConstraintLayout rootView;
    public final ConstraintLayout wildcardReassigningStep2Container;

    private FragmentParentalGateEnableStepBinding(ConstraintLayout rootView, Button fragmentParentalGateEnableStepCancelButton, Guideline fragmentParentalGateEnableStepGuideline, TextView fragmentParentalGateEnableStepMessage, Button fragmentParentalGateEnableStepOkButton, TextView fragmentParentalGateEnableStepTitle, ConstraintLayout wildcardReassigningStep2Container) {
        this.rootView = rootView;
        this.fragmentParentalGateEnableStepCancelButton = fragmentParentalGateEnableStepCancelButton;
        this.fragmentParentalGateEnableStepGuideline = fragmentParentalGateEnableStepGuideline;
        this.fragmentParentalGateEnableStepMessage = fragmentParentalGateEnableStepMessage;
        this.fragmentParentalGateEnableStepOkButton = fragmentParentalGateEnableStepOkButton;
        this.fragmentParentalGateEnableStepTitle = fragmentParentalGateEnableStepTitle;
        this.wildcardReassigningStep2Container = wildcardReassigningStep2Container;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentParentalGateEnableStepBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentParentalGateEnableStepBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_parental_gate_enable_step, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentParentalGateEnableStepBinding bind(View rootView) {
        int i = R.id.fragment_parentalGate_enableStep_cancel_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_enableStep_cancel_button);
        if (button != null) {
            i = R.id.fragment_parentalGate_enableStep_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_enableStep_guideline);
            if (guideline != null) {
                i = R.id.fragment_parentalGate_enableStep_message;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_enableStep_message);
                if (textView != null) {
                    i = R.id.fragment_parentalGate_enableStep_ok_button;
                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_enableStep_ok_button);
                    if (button2 != null) {
                        i = R.id.fragment_parentalGate_enableStep_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fragment_parentalGate_enableStep_title);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                            return new FragmentParentalGateEnableStepBinding(constraintLayout, button, guideline, textView, button2, textView2, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
