package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentSettingsWifiListBinding implements ViewBinding {
    public final IncludeDialogCloseButtonBinding fragmentCloseButton;
    private final LinearLayout rootView;
    public final RecyclerView settingsWifiListList;
    public final TextView settingsWifiListTitle;
    public final ProgressBar wifiListScanInProgress;

    private FragmentSettingsWifiListBinding(LinearLayout rootView, IncludeDialogCloseButtonBinding fragmentCloseButton, RecyclerView settingsWifiListList, TextView settingsWifiListTitle, ProgressBar wifiListScanInProgress) {
        this.rootView = rootView;
        this.fragmentCloseButton = fragmentCloseButton;
        this.settingsWifiListList = settingsWifiListList;
        this.settingsWifiListTitle = settingsWifiListTitle;
        this.wifiListScanInProgress = wifiListScanInProgress;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSettingsWifiListBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentSettingsWifiListBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_settings_wifi_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSettingsWifiListBinding bind(View rootView) {
        int i = R.id.fragment_close_button;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.fragment_close_button);
        if (findChildViewById != null) {
            IncludeDialogCloseButtonBinding bind = IncludeDialogCloseButtonBinding.bind(findChildViewById);
            i = R.id.settings_wifiList_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.settings_wifiList_list);
            if (recyclerView != null) {
                i = R.id.settings_wifiList_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.settings_wifiList_title);
                if (textView != null) {
                    i = R.id.wifiList_scanInProgress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.wifiList_scanInProgress);
                    if (progressBar != null) {
                        return new FragmentSettingsWifiListBinding((LinearLayout) rootView, bind, recyclerView, textView, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
