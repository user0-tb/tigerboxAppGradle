package media.tiger.tigerbox.services.interfaces.downloadsManager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DownloadsManagerListener.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/downloadsManager/DownloadsManagerListener;", "", "downloadRequestFailed", "", "errorMessage", "", "request", "Lmedia/tiger/tigerbox/services/interfaces/downloadsManager/DownloadJob;", "downloadRequestFinished", "downloadRequestProgressed", "downloadingStateChanged", "downloadsInProgress", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DownloadsManagerListener {

    /* compiled from: DownloadsManagerListener.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void downloadRequestFailed(DownloadsManagerListener downloadsManagerListener, String errorMessage, DownloadJob request) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            Intrinsics.checkNotNullParameter(request, "request");
        }

        public static void downloadRequestFinished(DownloadsManagerListener downloadsManagerListener, DownloadJob request) {
            Intrinsics.checkNotNullParameter(request, "request");
        }

        public static void downloadRequestProgressed(DownloadsManagerListener downloadsManagerListener, DownloadJob request) {
            Intrinsics.checkNotNullParameter(request, "request");
        }

        public static void downloadingStateChanged(DownloadsManagerListener downloadsManagerListener, boolean z) {
        }
    }

    void downloadRequestFailed(String str, DownloadJob downloadJob);

    void downloadRequestFinished(DownloadJob downloadJob);

    void downloadRequestProgressed(DownloadJob downloadJob);

    void downloadingStateChanged(boolean z);
}
