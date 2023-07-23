package media.tiger.tigerbox.infrastructure.interactor;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Event.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/interactor/EventObserver;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Observer;", "Lmedia/tiger/tigerbox/infrastructure/interactor/Event;", "onEventUnhandledContent", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onChanged", NotificationCompat.CATEGORY_EVENT, "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventObserver<T> implements Observer<Event<? extends T>> {
    private final Function1<T, Unit> onEventUnhandledContent;

    /* JADX WARN: Multi-variable type inference failed */
    public EventObserver(Function1<? super T, Unit> onEventUnhandledContent) {
        Intrinsics.checkNotNullParameter(onEventUnhandledContent, "onEventUnhandledContent");
        this.onEventUnhandledContent = onEventUnhandledContent;
    }

    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((Event) ((Event) obj));
    }

    public void onChanged(Event<? extends T> event) {
        T contentIfNotHandled;
        if (event == null || (contentIfNotHandled = event.getContentIfNotHandled()) == null) {
            return;
        }
        this.onEventUnhandledContent.invoke(contentIfNotHandled);
    }
}
