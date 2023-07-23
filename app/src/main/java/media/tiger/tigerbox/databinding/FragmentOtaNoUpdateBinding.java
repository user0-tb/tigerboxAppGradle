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
public final class FragmentOtaNoUpdateBinding implements ViewBinding {
    public final TextView otaNoUpdateBody;
    public final Button otaNoUpdateButton;
    public final ImageView otaNoUpdateImage;
    public final TextView otaNoUpdateTitle;
    private final ConstraintLayout rootView;

    private FragmentOtaNoUpdateBinding(ConstraintLayout rootView, TextView otaNoUpdateBody, Button otaNoUpdateButton, ImageView otaNoUpdateImage, TextView otaNoUpdateTitle) {
        this.rootView = rootView;
        this.otaNoUpdateBody = otaNoUpdateBody;
        this.otaNoUpdateButton = otaNoUpdateButton;
        this.otaNoUpdateImage = otaNoUpdateImage;
        this.otaNoUpdateTitle = otaNoUpdateTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOtaNoUpdateBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentOtaNoUpdateBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_ota_no_update, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOtaNoUpdateBinding bind(View rootView) {
        int i = R.id.otaNoUpdate_body;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.otaNoUpdate_body);
        if (textView != null) {
            i = R.id.otaNoUpdate_button;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.otaNoUpdate_button);
            if (button != null) {
                i = R.id.otaNoUpdate_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.otaNoUpdate_image);
                if (imageView != null) {
                    i = R.id.otaNoUpdate_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.otaNoUpdate_title);
                    if (textView2 != null) {
                        return new FragmentOtaNoUpdateBinding((ConstraintLayout) rootView, textView, button, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
