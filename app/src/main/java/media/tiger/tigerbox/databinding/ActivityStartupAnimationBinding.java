package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class ActivityStartupAnimationBinding implements ViewBinding {
    public final RelativeLayout activityStartupAnimationLayout;
    private final RelativeLayout rootView;
    public final ImageView tigerboxTextAnimation;

    private ActivityStartupAnimationBinding(RelativeLayout rootView, RelativeLayout activityStartupAnimationLayout, ImageView tigerboxTextAnimation) {
        this.rootView = rootView;
        this.activityStartupAnimationLayout = activityStartupAnimationLayout;
        this.tigerboxTextAnimation = tigerboxTextAnimation;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityStartupAnimationBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityStartupAnimationBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_startup_animation, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityStartupAnimationBinding bind(View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tigerbox_text_animation);
        if (imageView != null) {
            return new ActivityStartupAnimationBinding(relativeLayout, relativeLayout, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.tigerbox_text_animation)));
    }
}
