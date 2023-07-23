package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.util.Objects;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class IncludeBannerBinding implements ViewBinding {
    private final ConstraintLayout rootView;

    private IncludeBannerBinding(ConstraintLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IncludeBannerBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IncludeBannerBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.include_banner, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IncludeBannerBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new IncludeBannerBinding((ConstraintLayout) rootView);
    }
}
