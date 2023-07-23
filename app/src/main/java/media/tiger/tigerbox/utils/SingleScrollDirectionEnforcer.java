package media.tiger.tigerbox.utils;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewExtensions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lmedia/tiger/tigerbox/utils/SingleScrollDirectionEnforcer;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;", "()V", "dx", "", "dy", "initialTouchX", "initialTouchY", "scrollPointerId", "scrollState", "onInterceptTouchEvent", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroid/view/MotionEvent;", "onRequestDisallowInterceptTouchEvent", "", "disallowIntercept", "onScrollStateChanged", "recyclerView", "newState", "onTouchEvent", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SingleScrollDirectionEnforcer extends RecyclerView.OnScrollListener implements RecyclerView.OnItemTouchListener {
    private int dx;
    private int dy;
    private int initialTouchX;
    private int initialTouchY;
    private int scrollPointerId = -1;
    private int scrollState;

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        Intrinsics.checkNotNullParameter(e, "e");
        int actionMasked = e.getActionMasked();
        if (actionMasked == 0) {
            this.scrollPointerId = e.getPointerId(0);
            this.initialTouchX = (int) (e.getX() + 0.5f);
            this.initialTouchY = (int) (e.getY() + 0.5f);
        } else if (actionMasked == 2) {
            int findPointerIndex = e.findPointerIndex(this.scrollPointerId);
            if (findPointerIndex >= 0 && this.scrollState != 1) {
                this.dx = ((int) (e.getX(findPointerIndex) + 0.5f)) - this.initialTouchX;
                this.dy = ((int) (e.getY(findPointerIndex) + 0.5f)) - this.initialTouchY;
            }
        } else if (actionMasked == 5) {
            int actionIndex = e.getActionIndex();
            this.scrollPointerId = e.getPointerId(actionIndex);
            this.initialTouchX = (int) (e.getX(actionIndex) + 0.5f);
            this.initialTouchY = (int) (e.getY(actionIndex) + 0.5f);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager;
        boolean canScrollHorizontally;
        boolean canScrollVertically;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int i2 = this.scrollState;
        this.scrollState = i;
        if (i2 != 0 || i != 1 || (layoutManager = recyclerView.getLayoutManager()) == null || (canScrollHorizontally = layoutManager.canScrollHorizontally()) == (canScrollVertically = layoutManager.canScrollVertically())) {
            return;
        }
        if ((!canScrollHorizontally || Math.abs(this.dy) <= Math.abs(this.dx)) && (!canScrollVertically || Math.abs(this.dx) <= Math.abs(this.dy))) {
            return;
        }
        recyclerView.stopScroll();
    }
}
