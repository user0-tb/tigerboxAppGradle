package media.tiger.tigerbox.data.repository;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* compiled from: TigerBoxUserRepository.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/data/repository/ProfileChangeListener;", "", "didChangeProfile", "", TtmlNode.ATTR_ID, "", "didUpdateProfilesInfo", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ProfileChangeListener {

    /* compiled from: TigerBoxUserRepository.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static void didChangeProfile(ProfileChangeListener profileChangeListener, int i) {
        }

        public static void didUpdateProfilesInfo(ProfileChangeListener profileChangeListener) {
        }
    }

    void didChangeProfile(int i);

    void didUpdateProfilesInfo();
}
