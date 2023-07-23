package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import java.util.Objects;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class ItemTimersLayoutDemoBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ItemTimersLayoutDemoBinding(LinearLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemTimersLayoutDemoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemTimersLayoutDemoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_timers_layout_demo, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTimersLayoutDemoBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new ItemTimersLayoutDemoBinding((LinearLayout) rootView);
    }
}
