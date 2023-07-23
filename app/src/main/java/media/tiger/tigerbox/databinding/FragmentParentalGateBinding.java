package media.tiger.tigerbox.databinding;

import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.binding.BindingClickListener;
import media.tiger.tigerbox.ui.binding.UnTypedBindingClickListener;

/* loaded from: classes3.dex */
public abstract class FragmentParentalGateBinding extends ViewDataBinding {
    public final ImageButton fragmentParentalGateBackSpace;
    public final ImageButton fragmentParentalGateButton0;
    public final ImageButton fragmentParentalGateButton1;
    public final ImageButton fragmentParentalGateButton2;
    public final ImageButton fragmentParentalGateButton3;
    public final ImageButton fragmentParentalGateButton4;
    public final ImageButton fragmentParentalGateButton5;
    public final ImageButton fragmentParentalGateButton6;
    public final ImageButton fragmentParentalGateButton7;
    public final ImageButton fragmentParentalGateButton8;
    public final ImageButton fragmentParentalGateButton9;
    public final Button fragmentParentalGateCancel;
    public final TextView fragmentParentalGateCustomPinDescription;
    public final Guideline fragmentParentalGateGuideline;
    public final LinearLayout fragmentParentalGateInfoArea;
    public final LinearLayout fragmentParentalGateNumpad;
    public final TextView fragmentParentalGatePin;
    public final TextView fragmentParentalGateRandomPinAsText;
    public final TextView fragmentParentalGateRandomPinDescription;
    public final TextView fragmentParentalGateTitle;
    @Bindable
    protected Spanned mAccountPin;
    @Bindable
    protected UnTypedBindingClickListener mBackSpaceListener;
    @Bindable
    protected UnTypedBindingClickListener mCancelListener;
    @Bindable
    protected Boolean mHasError;
    @Bindable
    protected Boolean mHasRandomPin;
    @Bindable
    protected BindingClickListener<Character> mNumberClickListener;
    @Bindable
    protected Spanned mPinText;

    public abstract void setAccountPin(Spanned accountPin);

    public abstract void setBackSpaceListener(UnTypedBindingClickListener backSpaceListener);

    public abstract void setCancelListener(UnTypedBindingClickListener cancelListener);

    public abstract void setHasError(Boolean hasError);

    public abstract void setHasRandomPin(Boolean hasRandomPin);

    public abstract void setNumberClickListener(BindingClickListener<Character> numberClickListener);

    public abstract void setPinText(Spanned pinText);

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentParentalGateBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageButton fragmentParentalGateBackSpace, ImageButton fragmentParentalGateButton0, ImageButton fragmentParentalGateButton1, ImageButton fragmentParentalGateButton2, ImageButton fragmentParentalGateButton3, ImageButton fragmentParentalGateButton4, ImageButton fragmentParentalGateButton5, ImageButton fragmentParentalGateButton6, ImageButton fragmentParentalGateButton7, ImageButton fragmentParentalGateButton8, ImageButton fragmentParentalGateButton9, Button fragmentParentalGateCancel, TextView fragmentParentalGateCustomPinDescription, Guideline fragmentParentalGateGuideline, LinearLayout fragmentParentalGateInfoArea, LinearLayout fragmentParentalGateNumpad, TextView fragmentParentalGatePin, TextView fragmentParentalGateRandomPinAsText, TextView fragmentParentalGateRandomPinDescription, TextView fragmentParentalGateTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.fragmentParentalGateBackSpace = fragmentParentalGateBackSpace;
        this.fragmentParentalGateButton0 = fragmentParentalGateButton0;
        this.fragmentParentalGateButton1 = fragmentParentalGateButton1;
        this.fragmentParentalGateButton2 = fragmentParentalGateButton2;
        this.fragmentParentalGateButton3 = fragmentParentalGateButton3;
        this.fragmentParentalGateButton4 = fragmentParentalGateButton4;
        this.fragmentParentalGateButton5 = fragmentParentalGateButton5;
        this.fragmentParentalGateButton6 = fragmentParentalGateButton6;
        this.fragmentParentalGateButton7 = fragmentParentalGateButton7;
        this.fragmentParentalGateButton8 = fragmentParentalGateButton8;
        this.fragmentParentalGateButton9 = fragmentParentalGateButton9;
        this.fragmentParentalGateCancel = fragmentParentalGateCancel;
        this.fragmentParentalGateCustomPinDescription = fragmentParentalGateCustomPinDescription;
        this.fragmentParentalGateGuideline = fragmentParentalGateGuideline;
        this.fragmentParentalGateInfoArea = fragmentParentalGateInfoArea;
        this.fragmentParentalGateNumpad = fragmentParentalGateNumpad;
        this.fragmentParentalGatePin = fragmentParentalGatePin;
        this.fragmentParentalGateRandomPinAsText = fragmentParentalGateRandomPinAsText;
        this.fragmentParentalGateRandomPinDescription = fragmentParentalGateRandomPinDescription;
        this.fragmentParentalGateTitle = fragmentParentalGateTitle;
    }

    public BindingClickListener<Character> getNumberClickListener() {
        return this.mNumberClickListener;
    }

    public UnTypedBindingClickListener getBackSpaceListener() {
        return this.mBackSpaceListener;
    }

    public UnTypedBindingClickListener getCancelListener() {
        return this.mCancelListener;
    }

    public Spanned getPinText() {
        return this.mPinText;
    }

    public Boolean getHasError() {
        return this.mHasError;
    }

    public Spanned getAccountPin() {
        return this.mAccountPin;
    }

    public Boolean getHasRandomPin() {
        return this.mHasRandomPin;
    }

    public static FragmentParentalGateBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentParentalGateBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentParentalGateBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_parental_gate, root, attachToRoot, component);
    }

    public static FragmentParentalGateBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentParentalGateBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentParentalGateBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_parental_gate, null, false, component);
    }

    public static FragmentParentalGateBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentParentalGateBinding bind(View view, Object component) {
        return (FragmentParentalGateBinding) bind(component, view, R.layout.fragment_parental_gate);
    }
}
