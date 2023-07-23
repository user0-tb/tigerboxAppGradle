package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import java.util.Objects;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class IncludeDataLoadingBinding implements ViewBinding {
    public final LinearLayout dataLoading;
    private final LinearLayout rootView;

    private IncludeDataLoadingBinding(LinearLayout rootView, LinearLayout dataLoading) {
        this.rootView = rootView;
        this.dataLoading = dataLoading;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeDataLoadingBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static IncludeDataLoadingBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.include_data_loading, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static IncludeDataLoadingBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new IncludeDataLoadingBinding(linearLayout, linearLayout);
    }
}
