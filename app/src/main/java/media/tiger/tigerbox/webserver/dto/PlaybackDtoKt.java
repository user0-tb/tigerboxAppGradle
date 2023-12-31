package media.tiger.tigerbox.webserver.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.webserver.exception.BadRequestException;

/* compiled from: PlaybackDto.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"validateAndSanitize", "Lmedia/tiger/tigerbox/webserver/dto/TonesPlaybackDto;", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlaybackDtoKt {
    public static final TonesPlaybackDto validateAndSanitize(TonesPlaybackDto tonesPlaybackDto) {
        Intrinsics.checkNotNullParameter(tonesPlaybackDto, "<this>");
        if (tonesPlaybackDto.getProductId() >= 1) {
            return tonesPlaybackDto;
        }
        throw new BadRequestException("Invalid id");
    }
}
