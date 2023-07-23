package media.tiger.tigerbox.model.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.webserver.exception.BadRequestException;

/* compiled from: TigerBoxUserDomain.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"validateAndSanitize", "Lmedia/tiger/tigerbox/model/domain/ActiveProfileDto;", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerBoxUserDomainKt {
    public static final ActiveProfileDto validateAndSanitize(ActiveProfileDto activeProfileDto) {
        Intrinsics.checkNotNullParameter(activeProfileDto, "<this>");
        if (activeProfileDto.getProfileId() != null) {
            return activeProfileDto;
        }
        throw new BadRequestException("Invalid request");
    }
}
