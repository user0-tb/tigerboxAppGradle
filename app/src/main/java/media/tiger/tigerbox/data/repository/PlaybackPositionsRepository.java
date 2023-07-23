package media.tiger.tigerbox.data.repository;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import media.tiger.tigerbox.model.domain.PlaybackPositionDomain;

/* compiled from: PlaybackPositionsRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lmedia/tiger/tigerbox/data/repository/PlaybackPositionsRepository;", "", "deleteAllPlaybackPositions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaybackPosition", "Lmedia/tiger/tigerbox/model/domain/PlaybackPositionDomain;", "userId", "", "productId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertPlaybackPosition", "playPosition", "(Lmedia/tiger/tigerbox/model/domain/PlaybackPositionDomain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PlaybackPositionsRepository {
    Object deleteAllPlaybackPositions(Continuation<? super Unit> continuation);

    Object getPlaybackPosition(int i, int i2, Continuation<? super PlaybackPositionDomain> continuation);

    Object insertPlaybackPosition(PlaybackPositionDomain playbackPositionDomain, Continuation<? super Unit> continuation);
}
