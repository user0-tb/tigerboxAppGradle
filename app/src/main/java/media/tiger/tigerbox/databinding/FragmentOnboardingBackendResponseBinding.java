package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.binding.UnTypedBindingClickListener;

/* loaded from: classes3.dex */
public abstract class FragmentOnboardingBackendResponseBinding extends ViewDataBinding {
    @Bindable
    protected UnTypedBindingClickListener mClickListener;
    public final TextView onboardingBackendResponseBody;
    public final Button onboardingBackendResponseButton;
    public final TextView onboardingBackendResponseId;
    public final TextView onboardingBackendResponseTitle;

    public abstract void setClickListener(UnTypedBindingClickListener clickListener);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentOnboardingBackendResponseBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView onboardingBackendResponseBody, Button onboardingBackendResponseButton, TextView onboardingBackendResponseId, TextView onboardingBackendResponseTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.onboardingBackendResponseBody = onboardingBackendResponseBody;
        this.onboardingBackendResponseButton = onboardingBackendResponseButton;
        this.onboardingBackendResponseId = onboardingBackendResponseId;
        this.onboardingBackendResponseTitle = onboardingBackendResponseTitle;
    }

    public UnTypedBindingClickListener getClickListener() {
        return this.mClickListener;
    }

    public static FragmentOnboardingBackendResponseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingBackendResponseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentOnboardingBackendResponseBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_onboarding_backend_response, root, attachToRoot, component);
    }

    public static FragmentOnboardingBackendResponseBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingBackendResponseBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentOnboardingBackendResponseBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_onboarding_backend_response, null, false, component);
    }

    public static FragmentOnboardingBackendResponseBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingBackendResponseBinding bind(View view, Object component) {
        return (FragmentOnboardingBackendResponseBinding) bind(component, view, R.layout.fragment_onboarding_backend_response);
    }
}
