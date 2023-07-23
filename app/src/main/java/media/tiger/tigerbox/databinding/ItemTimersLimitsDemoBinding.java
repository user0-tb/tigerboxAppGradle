package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import java.util.Objects;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class ItemTimersLimitsDemoBinding implements ViewBinding {
    private final LinearLayout rootView;

    private ItemTimersLimitsDemoBinding(LinearLayout rootView) {
        this.rootView = rootView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemTimersLimitsDemoBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemTimersLimitsDemoBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_timers_limits_demo, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemTimersLimitsDemoBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new ItemTimersLimitsDemoBinding((LinearLayout) rootView);
    }
}
