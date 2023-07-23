package io.shipbook.shipbooksdk.Events;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import io.shipbook.shipbooksdk.InnerLog;
import io.shipbook.shipbooksdk.LogManager;
import io.shipbook.shipbooksdk.Models.FragmentEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentEventCallbacks.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\"\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016J*\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lio/shipbook/shipbooksdk/Events/FragmentEventCallbacks;", "Landroid/app/FragmentManager$FragmentLifecycleCallbacks;", "()V", "TAG", "", "createEvent", "", NotificationCompat.CATEGORY_EVENT, "fragment", "Landroid/app/Fragment;", "onFragmentActivityCreated", "fm", "Landroid/app/FragmentManager;", "f", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentAttached", "context", "Landroid/content/Context;", "onFragmentCreated", "onFragmentDestroyed", "onFragmentDetached", "onFragmentPaused", "onFragmentPreAttached", "onFragmentPreCreated", "onFragmentResumed", "onFragmentSaveInstanceState", "outState", "onFragmentStarted", "onFragmentStopped", "onFragmentViewCreated", "v", "Landroid/view/View;", "onFragmentViewDestroyed", "shipbooksdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentEventCallbacks extends FragmentManager.FragmentLifecycleCallbacks {
    public static final FragmentEventCallbacks INSTANCE = new FragmentEventCallbacks();
    private static final String TAG;

    private FragmentEventCallbacks() {
    }

    static {
        Intrinsics.checkNotNullExpressionValue("FragmentEventCallbacks", "FragmentEventCallbacks::class.java.simpleName");
        TAG = "FragmentEventCallbacks";
    }

    private final void createEvent(String str, Fragment fragment) {
        String name = fragment.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "fragment.javaClass.name");
        FragmentEvent fragmentEvent = new FragmentEvent(name, str, 0, null, null, 28, null);
        InnerLog.v$default(InnerLog.INSTANCE, TAG, Intrinsics.stringPlus("added fragment event: ", fragmentEvent), null, 4, null);
        LogManager.INSTANCE.push(fragmentEvent);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentPreAttached", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentAttached(FragmentManager fm, Fragment f, Context context) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(context, "context");
        createEvent("onFragmentAttached", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPreCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentPreCreated", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentCreated", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentActivityCreated", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(v, "v");
        createEvent("onFragmentViewCreated", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStarted(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentStarted", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentResumed", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentPaused(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentPaused", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentStopped", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentSaveInstanceState(FragmentManager fm, Fragment f, Bundle bundle) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        InnerLog.v$default(InnerLog.INSTANCE, TAG, "onFragmentSaveInstanceState called", null, 4, null);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentViewDestroyed", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentDestroyed", f);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDetached(FragmentManager fm, Fragment f) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        createEvent("onFragmentDetached", f);
    }
}
