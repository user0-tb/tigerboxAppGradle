package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentOnboardingRegistrationBinding implements ViewBinding {
    public final TextView onboardingRegistrationBody;
    public final Button onboardingRegistrationButton;
    public final ImageView onboardingRegistrationQrCode;
    public final ImageView onboardingRegistrationTigerIcon;
    public final TextView onboardingRegistrationTitle;
    public final TextView onboardingRegistrationUrl;
    public final Guideline onboardingRegistrationVertGuideline;
    private final ConstraintLayout rootView;

    private FragmentOnboardingRegistrationBinding(ConstraintLayout rootView, TextView onboardingRegistrationBody, Button onboardingRegistrationButton, ImageView onboardingRegistrationQrCode, ImageView onboardingRegistrationTigerIcon, TextView onboardingRegistrationTitle, TextView onboardingRegistrationUrl, Guideline onboardingRegistrationVertGuideline) {
        this.rootView = rootView;
        this.onboardingRegistrationBody = onboardingRegistrationBody;
        this.onboardingRegistrationButton = onboardingRegistrationButton;
        this.onboardingRegistrationQrCode = onboardingRegistrationQrCode;
        this.onboardingRegistrationTigerIcon = onboardingRegistrationTigerIcon;
        this.onboardingRegistrationTitle = onboardingRegistrationTitle;
        this.onboardingRegistrationUrl = onboardingRegistrationUrl;
        this.onboardingRegistrationVertGuideline = onboardingRegistrationVertGuideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOnboardingRegistrationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOnboardingRegistrationBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_onboarding_registration, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnboardingRegistrationBinding bind(View rootView) {
        int i = R.id.onboarding_registration_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_registration_body);
        if (textView != null) {
            i = R.id.onboarding_registration_button;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.onboarding_registration_button);
            if (button != null) {
                i = R.id.onboarding_registration_qr_code;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.onboarding_registration_qr_code);
                if (imageView != null) {
                    i = R.id.onboarding_registration_tiger_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.onboarding_registration_tiger_icon);
                    if (imageView2 != null) {
                        i = R.id.onboarding_registration_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_registration_title);
                        if (textView2 != null) {
                            i = R.id.onboarding_registration_url;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_registration_url);
                            if (textView3 != null) {
                                i = R.id.onboarding_registration_vert_guideline;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.onboarding_registration_vert_guideline);
                                if (guideline != null) {
                                    return new FragmentOnboardingRegistrationBinding((ConstraintLayout) rootView, textView, button, imageView, imageView2, textView2, textView3, guideline);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
