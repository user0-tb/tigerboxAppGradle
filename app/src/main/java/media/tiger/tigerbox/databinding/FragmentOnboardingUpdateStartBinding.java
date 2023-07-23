package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public abstract class FragmentOnboardingUpdateStartBinding extends ViewDataBinding {
    @Bindable
    protected boolean mCancellable;
    public final Button onboardingCancelButton;
    public final TextView onboardingStartUpdateBody;
    public final Button onboardingStartUpdateButton;
    public final ImageView onboardingStartUpdateImage;
    public final TextView onboardingStartUpdateTitle;

    public abstract void setCancellable(boolean cancellable);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentOnboardingUpdateStartBinding(Object _bindingComponent, View _root, int _localFieldCount, Button onboardingCancelButton, TextView onboardingStartUpdateBody, Button onboardingStartUpdateButton, ImageView onboardingStartUpdateImage, TextView onboardingStartUpdateTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.onboardingCancelButton = onboardingCancelButton;
        this.onboardingStartUpdateBody = onboardingStartUpdateBody;
        this.onboardingStartUpdateButton = onboardingStartUpdateButton;
        this.onboardingStartUpdateImage = onboardingStartUpdateImage;
        this.onboardingStartUpdateTitle = onboardingStartUpdateTitle;
    }

    public boolean getCancellable() {
        return this.mCancellable;
    }

    public static FragmentOnboardingUpdateStartBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingUpdateStartBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentOnboardingUpdateStartBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_onboarding_update_start, root, attachToRoot, component);
    }

    public static FragmentOnboardingUpdateStartBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingUpdateStartBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentOnboardingUpdateStartBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_onboarding_update_start, null, false, component);
    }

    public static FragmentOnboardingUpdateStartBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingUpdateStartBinding bind(View view, Object component) {
        return (FragmentOnboardingUpdateStartBinding) bind(component, view, R.layout.fragment_onboarding_update_start);
    }
}
