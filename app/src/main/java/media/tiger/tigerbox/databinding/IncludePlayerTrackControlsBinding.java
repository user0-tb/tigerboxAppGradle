package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public abstract class IncludePlayerTrackControlsBinding extends ViewDataBinding {
    @Bindable
    protected Boolean mPlaying;
    public final ImageButton mediaPlayerControlsNextControl;
    public final ImageButton mediaPlayerControlsPlayControl;
    public final ImageButton mediaPlayerControlsPreviousControl;

    public abstract void setPlaying(Boolean playing);

    /* JADX INFO: Access modifiers changed from: protected */
    public IncludePlayerTrackControlsBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageButton mediaPlayerControlsNextControl, ImageButton mediaPlayerControlsPlayControl, ImageButton mediaPlayerControlsPreviousControl) {
        super(_bindingComponent, _root, _localFieldCount);
        this.mediaPlayerControlsNextControl = mediaPlayerControlsNextControl;
        this.mediaPlayerControlsPlayControl = mediaPlayerControlsPlayControl;
        this.mediaPlayerControlsPreviousControl = mediaPlayerControlsPreviousControl;
    }

    public Boolean getPlaying() {
        return this.mPlaying;
    }

    public static IncludePlayerTrackControlsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludePlayerTrackControlsBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (IncludePlayerTrackControlsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.include_player_track_controls, root, attachToRoot, component);
    }

    public static IncludePlayerTrackControlsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludePlayerTrackControlsBinding inflate(LayoutInflater inflater, Object component) {
        return (IncludePlayerTrackControlsBinding) ViewDataBinding.inflateInternal(inflater, R.layout.include_player_track_controls, null, false, component);
    }

    public static IncludePlayerTrackControlsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static IncludePlayerTrackControlsBinding bind(View view, Object component) {
        return (IncludePlayerTrackControlsBinding) bind(component, view, R.layout.include_player_track_controls);
    }
}
