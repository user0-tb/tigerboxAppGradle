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
public final class ActivitySettingsBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final FragmentContainerView settingsNavGraphFragment;

    private ActivitySettingsBinding(ConstraintLayout rootView, FragmentContainerView settingsNavGraphFragment) {
        this.rootView = rootView;
        this.settingsNavGraphFragment = settingsNavGraphFragment;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivitySettingsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivitySettingsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_settings, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivitySettingsBinding bind(View rootView) {
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.settings_nav_graph_fragment);
        if (fragmentContainerView != null) {
            return new ActivitySettingsBinding((ConstraintLayout) rootView, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.settings_nav_graph_fragment)));
    }
}
