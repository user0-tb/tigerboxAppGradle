package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentOnboardingBackendCommunicationBinding implements ViewBinding {
    public final TextView onboardingBackendCommunicationBody;
    public final ProgressBar onboardingBackendCommunicationConnectionIcon;
    public final TextView onboardingBackendCommunicationTitle;
    private final ConstraintLayout rootView;

    private FragmentOnboardingBackendCommunicationBinding(ConstraintLayout rootView, TextView onboardingBackendCommunicationBody, ProgressBar onboardingBackendCommunicationConnectionIcon, TextView onboardingBackendCommunicationTitle) {
        this.rootView = rootView;
        this.onboardingBackendCommunicationBody = onboardingBackendCommunicationBody;
        this.onboardingBackendCommunicationConnectionIcon = onboardingBackendCommunicationConnectionIcon;
        this.onboardingBackendCommunicationTitle = onboardingBackendCommunicationTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOnboardingBackendCommunicationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOnboardingBackendCommunicationBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_onboarding_backend_communication, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnboardingBackendCommunicationBinding bind(View rootView) {
        int i = R.id.onboarding_backendCommunication_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_backendCommunication_body);
        if (textView != null) {
            i = R.id.onboarding_backendCommunication_connection_icon;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.onboarding_backendCommunication_connection_icon);
            if (progressBar != null) {
                i = R.id.onboarding_backendCommunication_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.onboarding_backendCommunication_title);
                if (textView2 != null) {
                    return new FragmentOnboardingBackendCommunicationBinding((ConstraintLayout) rootView, textView, progressBar, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
