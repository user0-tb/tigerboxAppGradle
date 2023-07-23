package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public abstract class FragmentTigerTicketPurchaseBinding extends ViewDataBinding {
    public final ProgressBar progressBar;
    public final TextView ticketWaitPrompt;
    public final TextView ticketWaitTitle;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentTigerTicketPurchaseBinding(Object _bindingComponent, View _root, int _localFieldCount, ProgressBar progressBar, TextView ticketWaitPrompt, TextView ticketWaitTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.progressBar = progressBar;
        this.ticketWaitPrompt = ticketWaitPrompt;
        this.ticketWaitTitle = ticketWaitTitle;
    }

    public static FragmentTigerTicketPurchaseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTigerTicketPurchaseBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentTigerTicketPurchaseBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_tiger_ticket_purchase, root, attachToRoot, component);
    }

    public static FragmentTigerTicketPurchaseBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTigerTicketPurchaseBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentTigerTicketPurchaseBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_tiger_ticket_purchase, null, false, component);
    }

    public static FragmentTigerTicketPurchaseBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTigerTicketPurchaseBinding bind(View view, Object component) {
        return (FragmentTigerTicketPurchaseBinding) bind(component, view, R.layout.fragment_tiger_ticket_purchase);
    }
}
