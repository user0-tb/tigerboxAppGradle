package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public abstract class FragmentOtaUpdateInProgressBinding extends ViewDataBinding {
    @Bindable
    protected String mUpdateLabel;
    @Bindable
    protected Integer mUpdatePercent;
    public final TextView otaUpdateInProgressBody;
    public final ImageView otaUpdateInProgressImage;
    public final ProgressBar otaUpdateInProgressProgressBar;
    public final TextView otaUpdateInProgressProgressLabel;
    public final TextView otaUpdateInProgressTitle;

    public abstract void setUpdateLabel(String updateLabel);

    public abstract void setUpdatePercent(Integer updatePercent);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentOtaUpdateInProgressBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView otaUpdateInProgressBody, ImageView otaUpdateInProgressImage, ProgressBar otaUpdateInProgressProgressBar, TextView otaUpdateInProgressProgressLabel, TextView otaUpdateInProgressTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.otaUpdateInProgressBody = otaUpdateInProgressBody;
        this.otaUpdateInProgressImage = otaUpdateInProgressImage;
        this.otaUpdateInProgressProgressBar = otaUpdateInProgressProgressBar;
        this.otaUpdateInProgressProgressLabel = otaUpdateInProgressProgressLabel;
        this.otaUpdateInProgressTitle = otaUpdateInProgressTitle;
    }

    public Integer getUpdatePercent() {
        return this.mUpdatePercent;
    }

    public String getUpdateLabel() {
        return this.mUpdateLabel;
    }

    public static FragmentOtaUpdateInProgressBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOtaUpdateInProgressBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentOtaUpdateInProgressBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_ota_update_in_progress, root, attachToRoot, component);
    }

    public static FragmentOtaUpdateInProgressBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOtaUpdateInProgressBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentOtaUpdateInProgressBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_ota_update_in_progress, null, false, component);
    }

    public static FragmentOtaUpdateInProgressBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentOtaUpdateInProgressBinding bind(View view, Object component) {
        return (FragmentOtaUpdateInProgressBinding) bind(component, view, R.layout.fragment_ota_update_in_progress);
    }
}
