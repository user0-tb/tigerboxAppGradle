package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class ActivityOnboardingBinding implements ViewBinding {
    public final FragmentContainerView onboardingNavGraphFragment;
    private final ConstraintLayout rootView;

    private ActivityOnboardingBinding(ConstraintLayout rootView, FragmentContainerView onboardingNavGraphFragment) {
        this.rootView = rootView;
        this.onboardingNavGraphFragment = onboardingNavGraphFragment;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityOnboardingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityOnboardingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_onboarding, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityOnboardingBinding bind(View rootView) {
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.onboarding_nav_graph_fragment);
        if (fragmentContainerView != null) {
            return new ActivityOnboardingBinding((ConstraintLayout) rootView, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.onboarding_nav_graph_fragment)));
    }
}
