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
public final class FragmentOnboardingConnectedWithInternetBinding implements ViewBinding {
    public final TextView onboardingConnectedWithInternetBody;
    public final Button onboardingConnectedWithInternetLoginButton;
    public final Button onboardingConnectedWithInternetRegistrationButton;
    public final TextView onboardingConnectedWithInternetTitle;
    private final ConstraintLayout rootView;

    private FragmentOnboardingConnectedWithInternetBinding(ConstraintLayout rootView, TextView onboardingConnectedWithInternetBody, Button onboardingConnectedWithInternetLoginButton, Button onboardingConnectedWithInternetRegistrationButton, TextView onboardingConnectedWithInternetTitle) {
        this.rootView = rootView;
        this.onboardingConnectedWithInternetBody = onboardingConnectedWithInternetBody;
        this.onboardingConnectedWithInternetLoginButton = onboardingConnectedWithInternetLoginButton;
        this.onboardingConnectedWithInternetRegistrationButton = onboardingConnectedWithInternetRegistrationButton;
        this.onboardingConnectedWithInternetTitle = onboardingConnectedWithInternetTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOnboardingConnectedWithInternetBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOnboardingConnectedWithInternetBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_onboarding_connected_with_internet, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnboardingConnectedWithInternetBinding bind(View rootView) {
        int i = R.id.onboarding_connectedWithInternet_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_connectedWithInternet_body);
        if (textView != null) {
            i = R.id.onboarding_connectedWithInternet_login_button;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.onboarding_connectedWithInternet_login_button);
            if (button != null) {
                i = R.id.onboarding_connectedWithInternet_registration_button;
                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.onboarding_connectedWithInternet_registration_button);
                if (button2 != null) {
                    i = R.id.onboarding_connectedWithInternet_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_connectedWithInternet_title);
                    if (textView2 != null) {
                        return new FragmentOnboardingConnectedWithInternetBinding((ConstraintLayout) rootView, textView, button, button2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
