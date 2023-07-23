package media.tiger.tigerbox;

import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MaincontentNavGraphDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lmedia/tiger/tigerbox/MaincontentNavGraphDirections;", "", "()V", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaincontentNavGraphDirections {
    public static final Companion Companion = new Companion(null);

    /* compiled from: MaincontentNavGraphDirections.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lmedia/tiger/tigerbox/MaincontentNavGraphDirections$Companion;", "", "()V", "actionToMainContentProductList", "Landroidx/navigation/NavDirections;", "actionToMediaPlayer", "actionToMultiProductCard", "actionToOfflineMode", "actionToParentalGate", "actionToParentalSettings", "actionToShowProfilePicture", "actionToUserProfilesSwitching", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavDirections actionToParentalGate() {
            return new ActionOnlyNavDirections(R.id.action_to_parentalGate);
        }

        public final NavDirections actionToParentalSettings() {
            return new ActionOnlyNavDirections(R.id.action_to_parentalSettings);
        }

        public final NavDirections actionToMediaPlayer() {
            return new ActionOnlyNavDirections(R.id.action_to_MediaPlayer);
        }

        public final NavDirections actionToUserProfilesSwitching() {
            return new ActionOnlyNavDirections(R.id.action_to_UserProfilesSwitching);
        }

        public final NavDirections actionToShowProfilePicture() {
            return new ActionOnlyNavDirections(R.id.action_to_ShowProfilePicture);
        }

        public final NavDirections actionToOfflineMode() {
            return new ActionOnlyNavDirections(R.id.action_to_offlineMode);
        }

        public final NavDirections actionToMultiProductCard() {
            return new ActionOnlyNavDirections(R.id.action_to_multiProductCard);
        }

        public final NavDirections actionToMainContentProductList() {
            return new ActionOnlyNavDirections(R.id.action_to_mainContentProductList);
        }
    }

    private MaincontentNavGraphDirections() {
    }
}
