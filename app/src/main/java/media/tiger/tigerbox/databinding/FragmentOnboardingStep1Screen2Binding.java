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
public final class FragmentOnboardingStep1Screen2Binding implements ViewBinding {
    public final TextView onboardingStep2Body;
    public final Button onboardingStep2Button;
    public final ConstraintLayout relativeLayout2;
    private final ConstraintLayout rootView;

    private FragmentOnboardingStep1Screen2Binding(ConstraintLayout rootView, TextView onboardingStep2Body, Button onboardingStep2Button, ConstraintLayout relativeLayout2) {
        this.rootView = rootView;
        this.onboardingStep2Body = onboardingStep2Body;
        this.onboardingStep2Button = onboardingStep2Button;
        this.relativeLayout2 = relativeLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOnboardingStep1Screen2Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOnboardingStep1Screen2Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_onboarding_step1_screen2, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnboardingStep1Screen2Binding bind(View rootView) {
        int i = R.id.onboarding_step2_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_step2_body);
        if (textView != null) {
            i = R.id.onboarding_step2_button;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.onboarding_step2_button);
            if (button != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                return new FragmentOnboardingStep1Screen2Binding(constraintLayout, textView, button, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
