package media.tiger.tigerbox.services.interfaces;

import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HardwareEventPublisher.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0004¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007J\u001a\u0010\u0014\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/HardwareEventPublisher;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_EAST, "", "()V", "subscribers", "", "Lmedia/tiger/tigerbox/services/interfaces/HardwareEventSubscriber;", "handleAction", "", "action", "", "intent", "Landroid/content/Intent;", "publish", NotificationCompat.CATEGORY_EVENT, "(Ljava/lang/Object;)V", "publishError", "subscribe", "subscriber", "unsubscribe", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HardwareEventPublisher<T, E> {
    private final List<HardwareEventSubscriber<T, E>> subscribers = new ArrayList();

    public abstract void handleAction(String str, Intent intent);

    public final void subscribe(HardwareEventSubscriber<T, E> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (this.subscribers.contains(subscriber)) {
            return;
        }
        this.subscribers.add(subscriber);
    }

    public final void unsubscribe(HardwareEventSubscriber<T, E> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (this.subscribers.contains(subscriber)) {
            this.subscribers.remove(subscriber);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void publish(T t) {
        Iterator<T> it = this.subscribers.iterator();
        while (it.hasNext()) {
            ((HardwareEventSubscriber) it.next()).onReceive(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void publishError(E e) {
        Iterator<T> it = this.subscribers.iterator();
        while (it.hasNext()) {
            ((HardwareEventSubscriber) it.next()).onError(e);
        }
    }
}
