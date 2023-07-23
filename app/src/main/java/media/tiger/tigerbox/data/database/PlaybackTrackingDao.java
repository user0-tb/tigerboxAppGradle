package media.tiger.tigerbox.data.database;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import media.tiger.tigerbox.model.domain.PlaybackTrackingDomain;

/* compiled from: PlaybackTrackingDao.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J@\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0010H'¨\u0006\u0013"}, d2 = {"Lmedia/tiger/tigerbox/data/database/PlaybackTrackingDao;", "", "deleteAllPlaybackTracking", "", "deletePlaybackTrackingEvent", "accountId", "", "userId", "productId", NotificationCompat.CATEGORY_EVENT, "", TtmlNode.START, TtmlNode.END, "total", "getAllPlaybackTracking", "", "Lmedia/tiger/tigerbox/model/domain/PlaybackTrackingDomain;", "insertPlaybackTrackEvent", "playState", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PlaybackTrackingDao {
    void deleteAllPlaybackTracking();

    void deletePlaybackTrackingEvent(int i, int i2, int i3, String str, int i4, int i5, int i6);

    List<PlaybackTrackingDomain> getAllPlaybackTracking();

    void insertPlaybackTrackEvent(PlaybackTrackingDomain playbackTrackingDomain);
}
