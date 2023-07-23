package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentOnboardingUpdateScreenBinding implements ViewBinding {
    public final FragmentOnboardingBatteryWarningBinding onboardingUpdateScreenBatteryWarning;
    public final FragmentOtaUpdateInProgressBinding onboardingUpdateScreenInProgress;
    public final FragmentOtaNoUpdateBinding onboardingUpdateScreenNoUpdate;
    public final FragmentOnboardingUpdateStartBinding onboardingUpdateScreenStartUpdate;
    private final FrameLayout rootView;
    public final ProgressBar updateLoadingSpinner;

    private FragmentOnboardingUpdateScreenBinding(FrameLayout rootView, FragmentOnboardingBatteryWarningBinding onboardingUpdateScreenBatteryWarning, FragmentOtaUpdateInProgressBinding onboardingUpdateScreenInProgress, FragmentOtaNoUpdateBinding onboardingUpdateScreenNoUpdate, FragmentOnboardingUpdateStartBinding onboardingUpdateScreenStartUpdate, ProgressBar updateLoadingSpinner) {
        this.rootView = rootView;
        this.onboardingUpdateScreenBatteryWarning = onboardingUpdateScreenBatteryWarning;
        this.onboardingUpdateScreenInProgress = onboardingUpdateScreenInProgress;
        this.onboardingUpdateScreenNoUpdate = onboardingUpdateScreenNoUpdate;
        this.onboardingUpdateScreenStartUpdate = onboardingUpdateScreenStartUpdate;
        this.updateLoadingSpinner = updateLoadingSpinner;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOnboardingUpdateScreenBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOnboardingUpdateScreenBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_onboarding_update_screen, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnboardingUpdateScreenBinding bind(View rootView) {
        int i = R.id.onboarding_updateScreen_battery_warning;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.onboarding_updateScreen_battery_warning);
        if (findChildViewById != null) {
            FragmentOnboardingBatteryWarningBinding bind = FragmentOnboardingBatteryWarningBinding.bind(findChildViewById);
            i = R.id.onboarding_updateScreen_in_progress;
            View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.onboarding_updateScreen_in_progress);
            if (findChildViewById2 != null) {
                FragmentOtaUpdateInProgressBinding bind2 = FragmentOtaUpdateInProgressBinding.bind(findChildViewById2);
                i = R.id.onboarding_updateScreen_no_update;
                View findChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.onboarding_updateScreen_no_update);
                if (findChildViewById3 != null) {
                    FragmentOtaNoUpdateBinding bind3 = FragmentOtaNoUpdateBinding.bind(findChildViewById3);
                    i = R.id.onboarding_updateScreen_start_update;
                    View findChildViewById4 = ViewBindings.findChildViewById(rootView, R.id.onboarding_updateScreen_start_update);
                    if (findChildViewById4 != null) {
                        FragmentOnboardingUpdateStartBinding bind4 = FragmentOnboardingUpdateStartBinding.bind(findChildViewById4);
                        i = R.id.update_loading_spinner;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.update_loading_spinner);
                        if (progressBar != null) {
                            return new FragmentOnboardingUpdateScreenBinding((FrameLayout) rootView, bind, bind2, bind3, bind4, progressBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
