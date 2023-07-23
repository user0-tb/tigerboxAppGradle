package media.tiger.tigerbox.model.dto;

import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.dto.ReleaseInformation;

/* compiled from: ReleaseInformation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"latest", "Lmedia/tiger/tigerbox/model/dto/ReleaseInformation$Release;", "Lmedia/tiger/tigerbox/model/dto/ReleaseInformation;", "getLatest", "(Lmedia/tiger/tigerbox/model/dto/ReleaseInformation;)Lmedia/tiger/tigerbox/model/dto/ReleaseInformation$Release;", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReleaseInformationKt {
    public static final ReleaseInformation.Release getLatest(ReleaseInformation releaseInformation) {
        Object obj;
        Intrinsics.checkNotNullParameter(releaseInformation, "<this>");
        Iterator<T> it = releaseInformation.getReleases().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date released = ((ReleaseInformation.Release) next).getReleased();
                do {
                    Object next2 = it.next();
                    Date released2 = ((ReleaseInformation.Release) next2).getReleased();
                    if (released.compareTo(released2) < 0) {
                        next = next2;
                        released = released2;
                    }
                } while (it.hasNext());
                obj = next;
            } else {
                obj = next;
            }
        } else {
            obj = null;
        }
        return (ReleaseInformation.Release) obj;
    }
}
