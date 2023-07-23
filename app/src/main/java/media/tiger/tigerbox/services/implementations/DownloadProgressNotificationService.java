package media.tiger.tigerbox.services.implementations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.infrastructure.functional.DownloadProgressUpdate;

/* compiled from: DownloadProgressNotificationService.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0096\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J/\u0010\u000f\u001a\u00020\n2%\u0010\u0010\u001a!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000bH\u0016J/\u0010\u0011\u001a\u00020\n2%\u0010\u0010\u001a!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000bH\u0016R3\u0010\u0003\u001a'\u0012#\u0012!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005j\u0002`\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/DownloadProgressNotificationService;", "Lmedia/tiger/tigerbox/infrastructure/functional/DownloadProgressUpdate;", "()V", "subscribers", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "percent", "", "Lmedia/tiger/tigerbox/infrastructure/functional/DownloadListener;", "invoke", "notify", "data", "subscribe", "listener", "unsubscribe", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadProgressNotificationService implements DownloadProgressUpdate {
    public static final DownloadProgressNotificationService INSTANCE = new DownloadProgressNotificationService();
    private static final List<Function1<Double, Unit>> subscribers = new ArrayList();

    private DownloadProgressNotificationService() {
    }

    @Override // media.tiger.tigerbox.infrastructure.functional.ObservableUpdate
    public /* bridge */ /* synthetic */ void notify(Double d) {
        notify(d.doubleValue());
    }

    @Override // media.tiger.tigerbox.infrastructure.functional.DownloadProgressUpdate
    public void invoke(double d) {
        notify(d);
    }

    public void notify(double d) {
        Iterator<T> it = subscribers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(Double.valueOf(d));
        }
    }

    @Override // media.tiger.tigerbox.infrastructure.functional.ObservableUpdate
    public void subscribe(Function1<? super Double, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<Function1<Double, Unit>> list = subscribers;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @Override // media.tiger.tigerbox.infrastructure.functional.ObservableUpdate
    public void unsubscribe(Function1<? super Double, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<Function1<Double, Unit>> list = subscribers;
        if (list.contains(listener)) {
            list.remove(listener);
        }
    }
}
