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
public abstract class FragmentOnboardingBatteryWarningBinding extends ViewDataBinding {
    @Bindable
    protected Integer mBatteryPercent;
    @Bindable
    protected Boolean mIsCharging;
    public final TextView onboardingBatteryWarningBody;
    public final Button onboardingBatteryWarningButton;
    public final ImageView onboardingBatteryWarningImage;
    public final TextView onboardingBatteryWarningTitle;

    public abstract void setBatteryPercent(Integer batteryPercent);

    public abstract void setIsCharging(Boolean isCharging);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentOnboardingBatteryWarningBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView onboardingBatteryWarningBody, Button onboardingBatteryWarningButton, ImageView onboardingBatteryWarningImage, TextView onboardingBatteryWarningTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.onboardingBatteryWarningBody = onboardingBatteryWarningBody;
        this.onboardingBatteryWarningButton = onboardingBatteryWarningButton;
        this.onboardingBatteryWarningImage = onboardingBatteryWarningImage;
        this.onboardingBatteryWarningTitle = onboardingBatteryWarningTitle;
    }

    public Boolean getIsCharging() {
        return this.mIsCharging;
    }

    public Integer getBatteryPercent() {
        return this.mBatteryPercent;
    }

    public static FragmentOnboardingBatteryWarningBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingBatteryWarningBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentOnboardingBatteryWarningBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_onboarding_battery_warning, root, attachToRoot, component);
    }

    public static FragmentOnboardingBatteryWarningBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingBatteryWarningBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentOnboardingBatteryWarningBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_onboarding_battery_warning, null, false, component);
    }

    public static FragmentOnboardingBatteryWarningBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOnboardingBatteryWarningBinding bind(View view, Object component) {
        return (FragmentOnboardingBatteryWarningBinding) bind(component, view, R.layout.fragment_onboarding_battery_warning);
    }
}
