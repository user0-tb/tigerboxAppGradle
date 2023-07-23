package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public final class FragmentTigerTicketValidBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final ImageView ticketBoxBackground;
    public final TextView ticketStepMessage;
    public final TextView ticketStepTitle;

    private FragmentTigerTicketValidBinding(ConstraintLayout rootView, ImageView ticketBoxBackground, TextView ticketStepMessage, TextView ticketStepTitle) {
        this.rootView = rootView;
        this.ticketBoxBackground = ticketBoxBackground;
        this.ticketStepMessage = ticketStepMessage;
        this.ticketStepTitle = ticketStepTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTigerTicketValidBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static FragmentTigerTicketValidBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_tiger_ticket_valid, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTigerTicketValidBinding bind(View rootView) {
        int i = R.id.ticket_box_background;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ticket_box_background);
        if (imageView != null) {
            i = R.id.ticket_step_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.ticket_step_message);
            if (textView != null) {
                i = R.id.ticket_step_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.ticket_step_title);
                if (textView2 != null) {
                    return new FragmentTigerTicketValidBinding((ConstraintLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
