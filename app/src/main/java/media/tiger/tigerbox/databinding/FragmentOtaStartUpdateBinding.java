package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentOtaStartUpdateBinding implements ViewBinding {
    public final TextView otaStartUpdateBody;
    public final Button otaStartUpdateCancelButton;
    public final ImageView otaStartUpdateOtaUpdateStars;
    public final TextView otaStartUpdateTitle;
    public final Button otaStartUpdateUpdateButton;
    private final ConstraintLayout rootView;

    private FragmentOtaStartUpdateBinding(ConstraintLayout rootView, TextView otaStartUpdateBody, Button otaStartUpdateCancelButton, ImageView otaStartUpdateOtaUpdateStars, TextView otaStartUpdateTitle, Button otaStartUpdateUpdateButton) {
        this.rootView = rootView;
        this.otaStartUpdateBody = otaStartUpdateBody;
        this.otaStartUpdateCancelButton = otaStartUpdateCancelButton;
        this.otaStartUpdateOtaUpdateStars = otaStartUpdateOtaUpdateStars;
        this.otaStartUpdateTitle = otaStartUpdateTitle;
        this.otaStartUpdateUpdateButton = otaStartUpdateUpdateButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOtaStartUpdateBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOtaStartUpdateBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_ota_start_update, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOtaStartUpdateBinding bind(View rootView) {
        int i = R.id.otaStartUpdate_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.otaStartUpdate_body);
        if (textView != null) {
            i = R.id.otaStartUpdate_cancel_button;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.otaStartUpdate_cancel_button);
            if (button != null) {
                i = R.id.otaStartUpdate_ota_update_stars;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.otaStartUpdate_ota_update_stars);
                if (imageView != null) {
                    i = R.id.otaStartUpdate_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.otaStartUpdate_title);
                    if (textView2 != null) {
                        i = R.id.otaStartUpdate_update_button;
                        Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.otaStartUpdate_update_button);
                        if (button2 != null) {
                            return new FragmentOtaStartUpdateBinding((ConstraintLayout) rootView, textView, button, imageView, textView2, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
