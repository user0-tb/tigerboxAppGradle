package media.tiger.tigerbox.databinding;

import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.binding.BindingClickListener;
import media.tiger.tigerbox.ui.binding.UnTypedBindingClickListener;

/* loaded from: classes3.dex */
public abstract class FragmentTigerTicketInputPinBinding extends ViewDataBinding {
    public final IncludeDialogCloseButtonBinding fragmentCloseButton;
    public final ImageButton fragmentTigerCardBackSpace;
    public final ImageButton fragmentTigerCardButton0;
    public final ImageButton fragmentTigerCardButton1;
    public final ImageButton fragmentTigerCardButton2;
    public final ImageButton fragmentTigerCardButton3;
    public final ImageButton fragmentTigerCardButton4;
    public final ImageButton fragmentTigerCardButton5;
    public final ImageButton fragmentTigerCardButton6;
    public final ImageButton fragmentTigerCardButton7;
    public final ImageButton fragmentTigerCardButton8;
    public final ImageButton fragmentTigerCardButton9;
    public final TextView fragmentTigerCardError;
    public final RelativeLayout fragmentTigerCardInfo;
    public final LinearLayout fragmentTigerCardNumpad;
    public final TextView fragmentTigerCardPin;
    public final TextView fragmentTigerCardTitle;
    @Bindable
    protected Integer mAttemptCount;
    @Bindable
    protected UnTypedBindingClickListener mBackSpaceListener;
    @Bindable
    protected Boolean mHasError;
    @Bindable
    protected BindingClickListener<Character> mNumberClickListener;
    @Bindable
    protected Spanned mPinText;

    public abstract void setAttemptCount(Integer attemptCount);

    public abstract void setBackSpaceListener(UnTypedBindingClickListener backSpaceListener);

    public abstract void setHasError(Boolean hasError);

    public abstract void setNumberClickListener(BindingClickListener<Character> numberClickListener);

    public abstract void setPinText(Spanned pinText);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentTigerTicketInputPinBinding(Object _bindingComponent, View _root, int _localFieldCount, IncludeDialogCloseButtonBinding fragmentCloseButton, ImageButton fragmentTigerCardBackSpace, ImageButton fragmentTigerCardButton0, ImageButton fragmentTigerCardButton1, ImageButton fragmentTigerCardButton2, ImageButton fragmentTigerCardButton3, ImageButton fragmentTigerCardButton4, ImageButton fragmentTigerCardButton5, ImageButton fragmentTigerCardButton6, ImageButton fragmentTigerCardButton7, ImageButton fragmentTigerCardButton8, ImageButton fragmentTigerCardButton9, TextView fragmentTigerCardError, RelativeLayout fragmentTigerCardInfo, LinearLayout fragmentTigerCardNumpad, TextView fragmentTigerCardPin, TextView fragmentTigerCardTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fragmentCloseButton = fragmentCloseButton;
        this.fragmentTigerCardBackSpace = fragmentTigerCardBackSpace;
        this.fragmentTigerCardButton0 = fragmentTigerCardButton0;
        this.fragmentTigerCardButton1 = fragmentTigerCardButton1;
        this.fragmentTigerCardButton2 = fragmentTigerCardButton2;
        this.fragmentTigerCardButton3 = fragmentTigerCardButton3;
        this.fragmentTigerCardButton4 = fragmentTigerCardButton4;
        this.fragmentTigerCardButton5 = fragmentTigerCardButton5;
        this.fragmentTigerCardButton6 = fragmentTigerCardButton6;
        this.fragmentTigerCardButton7 = fragmentTigerCardButton7;
        this.fragmentTigerCardButton8 = fragmentTigerCardButton8;
        this.fragmentTigerCardButton9 = fragmentTigerCardButton9;
        this.fragmentTigerCardError = fragmentTigerCardError;
        this.fragmentTigerCardInfo = fragmentTigerCardInfo;
        this.fragmentTigerCardNumpad = fragmentTigerCardNumpad;
        this.fragmentTigerCardPin = fragmentTigerCardPin;
        this.fragmentTigerCardTitle = fragmentTigerCardTitle;
    }

    public BindingClickListener<Character> getNumberClickListener() {
        return this.mNumberClickListener;
    }

    public UnTypedBindingClickListener getBackSpaceListener() {
        return this.mBackSpaceListener;
    }

    public Spanned getPinText() {
        return this.mPinText;
    }

    public Boolean getHasError() {
        return this.mHasError;
    }

    public Integer getAttemptCount() {
        return this.mAttemptCount;
    }

    public static FragmentTigerTicketInputPinBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTigerTicketInputPinBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentTigerTicketInputPinBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_tiger_ticket_input_pin, root, attachToRoot, component);
    }

    public static FragmentTigerTicketInputPinBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTigerTicketInputPinBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentTigerTicketInputPinBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_tiger_ticket_input_pin, null, false, component);
    }

    public static FragmentTigerTicketInputPinBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTigerTicketInputPinBinding bind(View view, Object component) {
        return (FragmentTigerTicketInputPinBinding) bind(component, view, R.layout.fragment_tiger_ticket_input_pin);
    }
}
