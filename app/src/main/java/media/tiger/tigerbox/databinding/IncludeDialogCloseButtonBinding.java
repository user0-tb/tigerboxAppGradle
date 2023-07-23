package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;
import java.util.Objects;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class IncludeDialogCloseButtonBinding implements ViewBinding {
    private final ImageButton rootView;

    private IncludeDialogCloseButtonBinding(ImageButton rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageButton getRoot() {
        return this.rootView;
    }

    public static IncludeDialogCloseButtonBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IncludeDialogCloseButtonBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.include_dialog_close_button, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IncludeDialogCloseButtonBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new IncludeDialogCloseButtonBinding((ImageButton) rootView);
    }
}
