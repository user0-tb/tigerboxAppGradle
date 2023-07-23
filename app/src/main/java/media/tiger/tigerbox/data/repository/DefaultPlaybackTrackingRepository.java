package media.tiger.tigerbox.data.repository;

import androidx.core.app.NotificationCompat;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.data.database.TigerBoxDatabase;
import media.tiger.tigerbox.model.domain.PlaybackTrackingDomain;

/* compiled from: PlaybackTrackingRepository.kt */
@Singleton
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/data/repository/DefaultPlaybackTrackingRepository;", "Lmedia/tiger/tigerbox/data/repository/PlaybackTrackingRepository;", "tigerBoxDataBase", "Lmedia/tiger/tigerbox/data/database/TigerBoxDatabase;", "(Lmedia/tiger/tigerbox/data/database/TigerBoxDatabase;)V", "deleteAllPlaybackTracking", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePlaybackTrackingEvent", NotificationCompat.CATEGORY_EVENT, "Lmedia/tiger/tigerbox/model/domain/PlaybackTrackingDomain;", "(Lmedia/tiger/tigerbox/model/domain/PlaybackTrackingDomain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaybackTracking", "", "insertPlaybackTracking", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DefaultPlaybackTrackingRepository implements PlaybackTrackingRepository {
    private final TigerBoxDatabase tigerBoxDataBase;

    @Override // media.tiger.tigerbox.data.repository.PlaybackTrackingRepository
    public Object deleteAllPlaybackTracking(Continuation<? super Unit> continuation) {
        return deleteAllPlaybackTracking$suspendImpl(this, continuation);
    }

    @Override // media.tiger.tigerbox.data.repository.PlaybackTrackingRepository
    public Object deletePlaybackTrackingEvent(PlaybackTrackingDomain playbackTrackingDomain, Continuation<? super Unit> continuation) {
        return deletePlaybackTrackingEvent$suspendImpl(this, playbackTrackingDomain, continuation);
    }

    @Override // media.tiger.tigerbox.data.repository.PlaybackTrackingRepository
    public Object getPlaybackTracking(Continuation<? super List<PlaybackTrackingDomain>> continuation) {
        return getPlaybackTracking$suspendImpl(this, continuation);
    }

    @Override // media.tiger.tigerbox.data.repository.PlaybackTrackingRepository
    public Object insertPlaybackTracking(PlaybackTrackingDomain playbackTrackingDomain, Continuation<? super Unit> continuation) {
        return insertPlaybackTracking$suspendImpl(this, playbackTrackingDomain, continuation);
    }

    @Inject
    public DefaultPlaybackTrackingRepository(TigerBoxDatabase tigerBoxDataBase) {
        Intrinsics.checkNotNullParameter(tigerBoxDataBase, "tigerBoxDataBase");
        this.tigerBoxDataBase = tigerBoxDataBase;
    }

    static /* synthetic */ Object insertPlaybackTracking$suspendImpl(DefaultPlaybackTrackingRepository defaultPlaybackTrackingRepository, PlaybackTrackingDomain playbackTrackingDomain, Continuation continuation) {
        defaultPlaybackTrackingRepository.tigerBoxDataBase.playbackTrackingDao().insertPlaybackTrackEvent(playbackTrackingDomain);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object getPlaybackTracking$suspendImpl(DefaultPlaybackTrackingRepository defaultPlaybackTrackingRepository, Continuation continuation) {
        return defaultPlaybackTrackingRepository.tigerBoxDataBase.playbackTrackingDao().getAllPlaybackTracking();
    }

    static /* synthetic */ Object deleteAllPlaybackTracking$suspendImpl(DefaultPlaybackTrackingRepository defaultPlaybackTrackingRepository, Continuation continuation) {
        defaultPlaybackTrackingRepository.tigerBoxDataBase.playbackTrackingDao().deleteAllPlaybackTracking();
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object deletePlaybackTrackingEvent$suspendImpl(DefaultPlaybackTrackingRepository defaultPlaybackTrackingRepository, PlaybackTrackingDomain playbackTrackingDomain, Continuation continuation) {
        defaultPlaybackTrackingRepository.tigerBoxDataBase.playbackTrackingDao().deletePlaybackTrackingEvent(playbackTrackingDomain.getAccountId(), playbackTrackingDomain.getUserId(), playbackTrackingDomain.getProductId(), playbackTrackingDomain.getEvent(), playbackTrackingDomain.getStart(), playbackTrackingDomain.getEnd(), playbackTrackingDomain.getTotal());
        return Unit.INSTANCE;
    }
}
