package media.tiger.tigerbox.services.interfaces;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* compiled from: HardwareEventSubscriber.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/HardwareEventSubscriber;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_EAST, "", "onError", "", "error", "(Ljava/lang/Object;)V", "onReceive", NotificationCompat.CATEGORY_EVENT, "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HardwareEventSubscriber<T, E> {
    void onError(E e);

    void onReceive(T t);
}
