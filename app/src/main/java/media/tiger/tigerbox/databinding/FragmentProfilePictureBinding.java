package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public abstract class FragmentProfilePictureBinding extends ViewDataBinding {
    public final IncludeDialogCloseButtonBinding fragmentCloseButton;
    public final TextView helpText;
    @Bindable
    protected String mImageUrl;
    @Bindable
    protected String mNickName;
    public final TextView profileNickName;
    public final ImageView profilePicture;

    public abstract void setImageUrl(String imageUrl);

    public abstract void setNickName(String nickName);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentProfilePictureBinding(Object _bindingComponent, View _root, int _localFieldCount, IncludeDialogCloseButtonBinding fragmentCloseButton, TextView helpText, TextView profileNickName, ImageView profilePicture) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fragmentCloseButton = fragmentCloseButton;
        this.helpText = helpText;
        this.profileNickName = profileNickName;
        this.profilePicture = profilePicture;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public String getNickName() {
        return this.mNickName;
    }

    public static FragmentProfilePictureBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfilePictureBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentProfilePictureBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_profile_picture, root, attachToRoot, component);
    }

    public static FragmentProfilePictureBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfilePictureBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentProfilePictureBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_profile_picture, null, false, component);
    }

    public static FragmentProfilePictureBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfilePictureBinding bind(View view, Object component) {
        return (FragmentProfilePictureBinding) bind(component, view, R.layout.fragment_profile_picture);
    }
}
