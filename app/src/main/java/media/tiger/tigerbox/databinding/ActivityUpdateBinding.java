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
public final class ActivityUpdateBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final FragmentContainerView updateNavGraphFragment;

    private ActivityUpdateBinding(ConstraintLayout rootView, FragmentContainerView updateNavGraphFragment) {
        this.rootView = rootView;
        this.updateNavGraphFragment = updateNavGraphFragment;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityUpdateBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityUpdateBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_update, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityUpdateBinding bind(View rootView) {
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.update_nav_graph_fragment);
        if (fragmentContainerView != null) {
            return new ActivityUpdateBinding((ConstraintLayout) rootView, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.update_nav_graph_fragment)));
    }
}
