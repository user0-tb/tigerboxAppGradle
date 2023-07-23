package media.tiger.tigerbox.infrastructure.functional;

import kotlin.Metadata;

/* compiled from: DownloadProgressUpdate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H¦\u0002¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/functional/DownloadProgressUpdate;", "Lmedia/tiger/tigerbox/infrastructure/functional/ObservableUpdate;", "", "invoke", "", "percent", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DownloadProgressUpdate extends ObservableUpdate<Double> {
    void invoke(double d);
}
