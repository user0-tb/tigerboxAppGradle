package media.tiger.tigerbox.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;

/* loaded from: classes3.dex */
public abstract class FragmentWildcardReassigningStep4Binding extends ViewDataBinding {
    @Bindable
    protected View.OnClickListener mClickListener;
    public final TextView wildcardReassigningStep1Text;
    public final TextView wildcardReassigningStep1Title;
    public final Button wildcardReassigningStep4Button;

    public abstract void setClickListener(View.OnClickListener clickListener);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentWildcardReassigningStep4Binding(Object _bindingComponent, View _root, int _localFieldCount, TextView wildcardReassigningStep1Text, TextView wildcardReassigningStep1Title, Button wildcardReassigningStep4Button) {
        super(_bindingComponent, _root, _localFieldCount);
        this.wildcardReassigningStep1Text = wildcardReassigningStep1Text;
        this.wildcardReassigningStep1Title = wildcardReassigningStep1Title;
        this.wildcardReassigningStep4Button = wildcardReassigningStep4Button;
    }

    public View.OnClickListener getClickListener() {
        return this.mClickListener;
    }

    public static FragmentWildcardReassigningStep4Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentWildcardReassigningStep4Binding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentWildcardReassigningStep4Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_wildcard_reassigning_step4, root, attachToRoot, component);
    }

    public static FragmentWildcardReassigningStep4Binding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentWildcardReassigningStep4Binding inflate(LayoutInflater inflater, Object component) {
        return (FragmentWildcardReassigningStep4Binding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_wildcard_reassigning_step4, null, false, component);
    }

    public static FragmentWildcardReassigningStep4Binding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentWildcardReassigningStep4Binding bind(View view, Object component) {
        return (FragmentWildcardReassigningStep4Binding) bind(component, view, R.layout.fragment_wildcard_reassigning_step4);
    }
}
