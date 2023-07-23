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
public final class FragmentWildcardReassigningStep3Binding implements ViewBinding {
    public final ProgressBar onboardingBackendCommunicationConnectionIcon;
    private final ConstraintLayout rootView;
    public final TextView wildcardReassigningStep3Body;
    public final TextView wildcardReassigningStep3Title;

    private FragmentWildcardReassigningStep3Binding(ConstraintLayout rootView, ProgressBar onboardingBackendCommunicationConnectionIcon, TextView wildcardReassigningStep3Body, TextView wildcardReassigningStep3Title) {
        this.rootView = rootView;
        this.onboardingBackendCommunicationConnectionIcon = onboardingBackendCommunicationConnectionIcon;
        this.wildcardReassigningStep3Body = wildcardReassigningStep3Body;
        this.wildcardReassigningStep3Title = wildcardReassigningStep3Title;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWildcardReassigningStep3Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentWildcardReassigningStep3Binding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_wildcard_reassigning_step3, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWildcardReassigningStep3Binding bind(View rootView) {
        int i = R.id.onboarding_backendCommunication_connection_icon;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.onboarding_backendCommunication_connection_icon);
        if (progressBar != null) {
            i = R.id.wildcard_reassigning_step_3_body;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_3_body);
            if (textView != null) {
                i = R.id.wildcard_reassigning_step_3_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.wildcard_reassigning_step_3_title);
                if (textView2 != null) {
                    return new FragmentWildcardReassigningStep3Binding((ConstraintLayout) rootView, progressBar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
