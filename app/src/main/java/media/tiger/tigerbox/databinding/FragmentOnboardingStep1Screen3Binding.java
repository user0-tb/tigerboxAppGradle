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
public final class FragmentOnboardingStep1Screen3Binding implements ViewBinding {
    public final TextView onboardingStep3Body;
    public final Button onboardingStep3Button;
    public final TextView onboardingStep3Title;
    public final ConstraintLayout relativeLayout3;
    private final ConstraintLayout rootView;

    private FragmentOnboardingStep1Screen3Binding(ConstraintLayout rootView, TextView onboardingStep3Body, Button onboardingStep3Button, TextView onboardingStep3Title, ConstraintLayout relativeLayout3) {
        this.rootView = rootView;
        this.onboardingStep3Body = onboardingStep3Body;
        this.onboardingStep3Button = onboardingStep3Button;
        this.onboardingStep3Title = onboardingStep3Title;
        this.relativeLayout3 = relativeLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOnboardingStep1Screen3Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOnboardingStep1Screen3Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_onboarding_step1_screen3, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnboardingStep1Screen3Binding bind(View rootView) {
        int i = R.id.onboarding_step3_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_step3_body);
        if (textView != null) {
            i = R.id.onboarding_step3_button;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.onboarding_step3_button);
            if (button != null) {
                i = R.id.onboarding_step3_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_step3_title);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                    return new FragmentOnboardingStep1Screen3Binding(constraintLayout, textView, button, textView2, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
