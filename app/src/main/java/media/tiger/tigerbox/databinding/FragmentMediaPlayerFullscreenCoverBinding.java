package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public abstract class FragmentMediaPlayerFullscreenCoverBinding extends ViewDataBinding {
    public final IncludeDialogCloseButtonBinding fragmentCloseButton;
    @Bindable
    protected String mImageUrl;
    public final ImageView medialPlayerFullscreenCoverImage;

    public abstract void setImageUrl(String imageUrl);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentMediaPlayerFullscreenCoverBinding(Object _bindingComponent, View _root, int _localFieldCount, IncludeDialogCloseButtonBinding fragmentCloseButton, ImageView medialPlayerFullscreenCoverImage) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fragmentCloseButton = fragmentCloseButton;
        this.medialPlayerFullscreenCoverImage = medialPlayerFullscreenCoverImage;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public static FragmentMediaPlayerFullscreenCoverBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMediaPlayerFullscreenCoverBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentMediaPlayerFullscreenCoverBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_media_player_fullscreen_cover, root, attachToRoot, component);
    }

    public static FragmentMediaPlayerFullscreenCoverBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMediaPlayerFullscreenCoverBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentMediaPlayerFullscreenCoverBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_media_player_fullscreen_cover, null, false, component);
    }

    public static FragmentMediaPlayerFullscreenCoverBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMediaPlayerFullscreenCoverBinding bind(View view, Object component) {
        return (FragmentMediaPlayerFullscreenCoverBinding) bind(component, view, R.layout.fragment_media_player_fullscreen_cover);
    }
}
