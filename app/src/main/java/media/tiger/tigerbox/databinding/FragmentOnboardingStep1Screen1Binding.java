package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentOnboardingStep1Screen1Binding implements ViewBinding {
    public final TextView onboardingStep1Body;
    public final Button onboardingStep1Button;
    public final ImageView onboardingStep1Image;
    public final TextView onboardingStep1Title;
    public final ConstraintLayout relativeLayout;
    private final ConstraintLayout rootView;

    private FragmentOnboardingStep1Screen1Binding(ConstraintLayout rootView, TextView onboardingStep1Body, Button onboardingStep1Button, ImageView onboardingStep1Image, TextView onboardingStep1Title, ConstraintLayout relativeLayout) {
        this.rootView = rootView;
        this.onboardingStep1Body = onboardingStep1Body;
        this.onboardingStep1Button = onboardingStep1Button;
        this.onboardingStep1Image = onboardingStep1Image;
        this.onboardingStep1Title = onboardingStep1Title;
        this.relativeLayout = relativeLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOnboardingStep1Screen1Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOnboardingStep1Screen1Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_onboarding_step1_screen1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnboardingStep1Screen1Binding bind(View rootView) {
        int i = R.id.onboarding_step1_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_step1_body);
        if (textView != null) {
            i = R.id.onboarding_step1_button;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.onboarding_step1_button);
            if (button != null) {
                i = R.id.onboarding_step1_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.onboarding_step1_image);
                if (imageView != null) {
                    i = R.id.onboarding_step1_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_step1_title);
                    if (textView2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                        return new FragmentOnboardingStep1Screen1Binding(constraintLayout, textView, button, imageView, textView2, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
