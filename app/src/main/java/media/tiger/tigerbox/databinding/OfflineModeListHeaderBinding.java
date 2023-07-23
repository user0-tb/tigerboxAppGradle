package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import java.util.Objects;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class OfflineModeListHeaderBinding implements ViewBinding {
    public final TextView offlineModeListHeader;
    private final TextView rootView;

    private OfflineModeListHeaderBinding(TextView rootView, TextView offlineModeListHeader) {
        this.rootView = rootView;
        this.offlineModeListHeader = offlineModeListHeader;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static OfflineModeListHeaderBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static OfflineModeListHeaderBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.offline_mode_list_header, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static OfflineModeListHeaderBinding bind(View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        TextView textView = (TextView) rootView;
        return new OfflineModeListHeaderBinding(textView, textView);
    }
}
