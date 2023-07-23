package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.model.domain.BatterySummary;
import media.tiger.tigerbox.model.domain.WifiItem;
import media.tiger.tigerbox.ui.binding.BindingClickListener;
import media.tiger.tigerbox.ui.binding.UnTypedBindingClickListener;
import media.tiger.tigerbox.ui.view.BatteryView;

/* loaded from: classes3.dex */
public abstract class IncludeDialogHeaderBarBinding extends ViewDataBinding {
    public final LinearLayout headerLimitTimer;
    public final TextView headerLimitTimerText;
    public final BatteryView includeHeaderBatteryView;
    public final ImageView includeHeaderCloseButton;
    public final TextView includeHeaderCountDownTime;
    public final ImageView includeHeaderDownloadMarker;
    public final ImageView includeHeaderSettingsIcon;
    public final ImageView includeHeaderUpdateAvailableIcon;
    public final ImageView includeHeaderWifiCtrl;
    @Bindable
    protected BatterySummary mBatterySummary;
    @Bindable
    protected Boolean mDownloadsInProgress;
    @Bindable
    protected Boolean mFirmwareUpdateAvailable;
    @Bindable
    protected BindingClickListener<Boolean> mSettingsClickListener;
    @Bindable
    protected Boolean mSettingsOpened;
    @Bindable
    protected UnTypedBindingClickListener mUpdateAvailableClickListener;
    @Bindable
    protected WifiItem mWifiItem;

    public abstract void setBatterySummary(BatterySummary batterySummary);

    public abstract void setDownloadsInProgress(Boolean downloadsInProgress);

    public abstract void setFirmwareUpdateAvailable(Boolean firmwareUpdateAvailable);

    public abstract void setSettingsClickListener(BindingClickListener<Boolean> settingsClickListener);

    public abstract void setSettingsOpened(Boolean settingsOpened);

    public abstract void setUpdateAvailableClickListener(UnTypedBindingClickListener updateAvailableClickListener);

    public abstract void setWifiItem(WifiItem wifiItem);

    /* JADX INFO: Access modifiers changed from: protected */
    public IncludeDialogHeaderBarBinding(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout headerLimitTimer, TextView headerLimitTimerText, BatteryView includeHeaderBatteryView, ImageView includeHeaderCloseButton, TextView includeHeaderCountDownTime, ImageView includeHeaderDownloadMarker, ImageView includeHeaderSettingsIcon, ImageView includeHeaderUpdateAvailableIcon, ImageView includeHeaderWifiCtrl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.headerLimitTimer = headerLimitTimer;
        this.headerLimitTimerText = headerLimitTimerText;
        this.includeHeaderBatteryView = includeHeaderBatteryView;
        this.includeHeaderCloseButton = includeHeaderCloseButton;
        this.includeHeaderCountDownTime = includeHeaderCountDownTime;
        this.includeHeaderDownloadMarker = includeHeaderDownloadMarker;
        this.includeHeaderSettingsIcon = includeHeaderSettingsIcon;
        this.includeHeaderUpdateAvailableIcon = includeHeaderUpdateAvailableIcon;
        this.includeHeaderWifiCtrl = includeHeaderWifiCtrl;
    }

    public BindingClickListener<Boolean> getSettingsClickListener() {
        return this.mSettingsClickListener;
    }

    public UnTypedBindingClickListener getUpdateAvailableClickListener() {
        return this.mUpdateAvailableClickListener;
    }

    public BatterySummary getBatterySummary() {
        return this.mBatterySummary;
    }

    public Boolean getSettingsOpened() {
        return this.mSettingsOpened;
    }

    public Boolean getDownloadsInProgress() {
        return this.mDownloadsInProgress;
    }

    public Boolean getFirmwareUpdateAvailable() {
        return this.mFirmwareUpdateAvailable;
    }

    public WifiItem getWifiItem() {
        return this.mWifiItem;
    }

    public static IncludeDialogHeaderBarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludeDialogHeaderBarBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (IncludeDialogHeaderBarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.include_dialog_header_bar, root, attachToRoot, component);
    }

    public static IncludeDialogHeaderBarBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludeDialogHeaderBarBinding inflate(LayoutInflater inflater, Object component) {
        return (IncludeDialogHeaderBarBinding) ViewDataBinding.inflateInternal(inflater, R.layout.include_dialog_header_bar, null, false, component);
    }

    public static IncludeDialogHeaderBarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludeDialogHeaderBarBinding bind(View view, Object component) {
        return (IncludeDialogHeaderBarBinding) bind(component, view, R.layout.include_dialog_header_bar);
    }
}
