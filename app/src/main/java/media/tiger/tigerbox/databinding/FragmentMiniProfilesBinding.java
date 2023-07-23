package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.model.domain.ProfilesItem;
import media.tiger.tigerbox.ui.binding.UnTypedBindingClickListener;

/* loaded from: classes3.dex */
public abstract class FragmentMiniProfilesBinding extends ViewDataBinding {
    @Bindable
    protected UnTypedBindingClickListener mNavigateListener;
    @Bindable
    protected ProfilesItem mProfile;
    public final ImageView profilesAvatar;
    public final LinearLayout profilesContainer;

    public abstract void setNavigateListener(UnTypedBindingClickListener navigateListener);

    public abstract void setProfile(ProfilesItem profile);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentMiniProfilesBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView profilesAvatar, LinearLayout profilesContainer) {
        super(_bindingComponent, _root, _localFieldCount);
        this.profilesAvatar = profilesAvatar;
        this.profilesContainer = profilesContainer;
    }

    public UnTypedBindingClickListener getNavigateListener() {
        return this.mNavigateListener;
    }

    public ProfilesItem getProfile() {
        return this.mProfile;
    }

    public static FragmentMiniProfilesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMiniProfilesBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentMiniProfilesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_mini_profiles, root, attachToRoot, component);
    }

    public static FragmentMiniProfilesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMiniProfilesBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentMiniProfilesBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_mini_profiles, null, false, component);
    }

    public static FragmentMiniProfilesBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMiniProfilesBinding bind(View view, Object component) {
        return (FragmentMiniProfilesBinding) bind(component, view, R.layout.fragment_mini_profiles);
    }
}
