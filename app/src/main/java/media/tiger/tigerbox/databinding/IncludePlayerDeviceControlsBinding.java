package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.view.CircleProgressImageView;

/* loaded from: classes3.dex */
public abstract class IncludePlayerDeviceControlsBinding extends ViewDataBinding {
    @Bindable
    protected Boolean mLightControlEnabled;
    public final CircleProgressImageView mediaPlayerControlsLightControl;
    public final CircleProgressImageView mediaPlayerControlsTrackControl;
    public final CircleProgressImageView mediaPlayerControlsVolumeControl;

    public abstract void setLightControlEnabled(Boolean lightControlEnabled);

    /* JADX INFO: Access modifiers changed from: protected */
    public IncludePlayerDeviceControlsBinding(Object _bindingComponent, View _root, int _localFieldCount, CircleProgressImageView mediaPlayerControlsLightControl, CircleProgressImageView mediaPlayerControlsTrackControl, CircleProgressImageView mediaPlayerControlsVolumeControl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.mediaPlayerControlsLightControl = mediaPlayerControlsLightControl;
        this.mediaPlayerControlsTrackControl = mediaPlayerControlsTrackControl;
        this.mediaPlayerControlsVolumeControl = mediaPlayerControlsVolumeControl;
    }

    public Boolean getLightControlEnabled() {
        return this.mLightControlEnabled;
    }

    public static IncludePlayerDeviceControlsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludePlayerDeviceControlsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (IncludePlayerDeviceControlsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.include_player_device_controls, root, attachToRoot, component);
    }

    public static IncludePlayerDeviceControlsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludePlayerDeviceControlsBinding inflate(LayoutInflater inflater, Object component) {
        return (IncludePlayerDeviceControlsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.include_player_device_controls, null, false, component);
    }

    public static IncludePlayerDeviceControlsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludePlayerDeviceControlsBinding bind(View view, Object component) {
        return (IncludePlayerDeviceControlsBinding) bind(component, view, R.layout.include_player_device_controls);
    }
}
