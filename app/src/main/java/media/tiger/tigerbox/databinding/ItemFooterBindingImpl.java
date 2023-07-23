package media.tiger.tigerbox.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import media.tiger.tigerbox.generated.callback.OnClickListener;
import media.tiger.tigerbox.ui.binding.BindingClickListener;

/* loaded from: classes3.dex */
public class ItemFooterBindingImpl extends ItemFooterBinding implements OnClickListener.Listener {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private final View.OnClickListener mCallback3;
    private long mDirtyFlags;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    public ItemFooterBindingImpl(DataBindingComponent bindingComponent, View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 1, sIncludes, sViewsWithIds));
    }

    private ItemFooterBindingImpl(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0, (TextView) bindings[0]);
        this.mDirtyFlags = -1L;
        this.footerItem.setTag(null);
        setRootTag(root);
        this.mCallback3 = new OnClickListener(this, 1);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, Object variable) {
        if (21 == variableId) {
            setFooterRowId((Integer) variable);
        } else if (20 != variableId) {
            return false;
        } else {
            setFooterClickListener((BindingClickListener) variable);
        }
        return true;
    }

    @Override // media.tiger.tigerbox.databinding.ItemFooterBinding
    public void setFooterRowId(Integer FooterRowId) {
        this.mFooterRowId = FooterRowId;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(21);
        super.requestRebind();
    }

    @Override // media.tiger.tigerbox.databinding.ItemFooterBinding
    public void setFooterClickListener(BindingClickListener<Integer> FooterClickListener) {
        this.mFooterClickListener = FooterClickListener;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(20);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Integer num = this.mFooterRowId;
        BindingClickListener<Integer> bindingClickListener = this.mFooterClickListener;
        if ((j & 4) != 0) {
            this.footerItem.setOnClickListener(this.mCallback3);
        }
    }

    @Override // media.tiger.tigerbox.generated.callback.OnClickListener.Listener
    public final void _internalCallbackOnClick(int sourceId, View callbackArg_0) {
        Integer num = this.mFooterRowId;
        BindingClickListener<Integer> bindingClickListener = this.mFooterClickListener;
        if (bindingClickListener != null) {
            bindingClickListener.onClick(num);
        }
    }
}
