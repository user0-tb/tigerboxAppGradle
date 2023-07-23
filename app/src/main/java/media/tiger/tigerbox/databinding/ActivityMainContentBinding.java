package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class ActivityMainContentBinding implements ViewBinding {
    public final FragmentContainerView headerBarFragment;
    public final ConstraintLayout mainContentActivityLayout;
    public final ImageView mainContentCardModesIcon;
    public final ConstraintLayout mainContentCardModus;
    public final FrameLayout mainContentContainer;
    public final ProgressBar mainContentLoadingSpinner;
    public final Button mainContentLockModeButton;
    public final ConstraintLayout mainContentLockModeContainer;
    public final ImageView mainContentLockModeIcon;
    public final TextView mainContentLockModeText;
    public final FragmentContainerView mainContentNavGraphFragment;
    public final FragmentContainerView miniPlayerFragment;
    public final FragmentContainerView miniProfilesFragment;
    private final ConstraintLayout rootView;

    private ActivityMainContentBinding(ConstraintLayout rootView, FragmentContainerView headerBarFragment, ConstraintLayout mainContentActivityLayout, ImageView mainContentCardModesIcon, ConstraintLayout mainContentCardModus, FrameLayout mainContentContainer, ProgressBar mainContentLoadingSpinner, Button mainContentLockModeButton, ConstraintLayout mainContentLockModeContainer, ImageView mainContentLockModeIcon, TextView mainContentLockModeText, FragmentContainerView mainContentNavGraphFragment, FragmentContainerView miniPlayerFragment, FragmentContainerView miniProfilesFragment) {
        this.rootView = rootView;
        this.headerBarFragment = headerBarFragment;
        this.mainContentActivityLayout = mainContentActivityLayout;
        this.mainContentCardModesIcon = mainContentCardModesIcon;
        this.mainContentCardModus = mainContentCardModus;
        this.mainContentContainer = mainContentContainer;
        this.mainContentLoadingSpinner = mainContentLoadingSpinner;
        this.mainContentLockModeButton = mainContentLockModeButton;
        this.mainContentLockModeContainer = mainContentLockModeContainer;
        this.mainContentLockModeIcon = mainContentLockModeIcon;
        this.mainContentLockModeText = mainContentLockModeText;
        this.mainContentNavGraphFragment = mainContentNavGraphFragment;
        this.miniPlayerFragment = miniPlayerFragment;
        this.miniProfilesFragment = miniProfilesFragment;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainContentBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ActivityMainContentBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_main_content, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityMainContentBinding bind(View rootView) {
        int i = R.id.headerBarFragment;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.headerBarFragment);
        if (fragmentContainerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i = R.id.mainContent_card_modes_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.mainContent_card_modes_icon);
            if (imageView != null) {
                i = R.id.mainContent_card_modus;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.mainContent_card_modus);
                if (constraintLayout2 != null) {
                    i = R.id.mainContent_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.mainContent_container);
                    if (frameLayout != null) {
                        i = R.id.mainContent_loading_spinner;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.mainContent_loading_spinner);
                        if (progressBar != null) {
                            i = R.id.mainContent_lock_mode_button;
                            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.mainContent_lock_mode_button);
                            if (button != null) {
                                i = R.id.mainContent_lock_mode_container;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.mainContent_lock_mode_container);
                                if (constraintLayout3 != null) {
                                    i = R.id.mainContent_lock_mode_icon;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.mainContent_lock_mode_icon);
                                    if (imageView2 != null) {
                                        i = R.id.mainContent_lock_mode_text;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.mainContent_lock_mode_text);
                                        if (textView != null) {
                                            i = R.id.mainContent_nav_graph_fragment;
                                            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.mainContent_nav_graph_fragment);
                                            if (fragmentContainerView2 != null) {
                                                i = R.id.miniPlayerFragment;
                                                FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.miniPlayerFragment);
                                                if (fragmentContainerView3 != null) {
                                                    i = R.id.miniProfilesFragment;
                                                    FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, R.id.miniProfilesFragment);
                                                    if (fragmentContainerView4 != null) {
                                                        return new ActivityMainContentBinding(constraintLayout, fragmentContainerView, constraintLayout, imageView, constraintLayout2, frameLayout, progressBar, button, constraintLayout3, imageView2, textView, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
