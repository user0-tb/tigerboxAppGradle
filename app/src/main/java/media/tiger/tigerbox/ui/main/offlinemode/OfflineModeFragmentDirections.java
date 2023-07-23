package media.tiger.tigerbox.ui.main.offlinemode;

import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import media.tiger.tigerbox.MaincontentNavGraphDirections;
import media.tiger.tigerbox.R;

/* compiled from: OfflineModeFragmentDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/offlinemode/OfflineModeFragmentDirections;", "", "()V", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OfflineModeFragmentDirections {
    public static final Companion Companion = new Companion(null);

    /* compiled from: OfflineModeFragmentDirections.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/offlinemode/OfflineModeFragmentDirections$Companion;", "", "()V", "actionOfflineModeFragmentToSettingsWifiListFragment", "Landroidx/navigation/NavDirections;", "actionToMainContentProductList", "actionToMediaPlayer", "actionToMultiProductCard", "actionToOfflineMode", "actionToParentalGate", "actionToParentalSettings", "actionToShowProfilePicture", "actionToUserProfilesSwitching", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavDirections actionOfflineModeFragmentToSettingsWifiListFragment() {
            return new ActionOnlyNavDirections(R.id.action_offlineModeFragment_to_settingsWifiListFragment);
        }

        public final NavDirections actionToParentalGate() {
            return MaincontentNavGraphDirections.Companion.actionToParentalGate();
        }

        public final NavDirections actionToParentalSettings() {
            return MaincontentNavGraphDirections.Companion.actionToParentalSettings();
        }

        public final NavDirections actionToMediaPlayer() {
            return MaincontentNavGraphDirections.Companion.actionToMediaPlayer();
        }

        public final NavDirections actionToUserProfilesSwitching() {
            return MaincontentNavGraphDirections.Companion.actionToUserProfilesSwitching();
        }

        public final NavDirections actionToShowProfilePicture() {
            return MaincontentNavGraphDirections.Companion.actionToShowProfilePicture();
        }

        public final NavDirections actionToOfflineMode() {
            return MaincontentNavGraphDirections.Companion.actionToOfflineMode();
        }

        public final NavDirections actionToMultiProductCard() {
            return MaincontentNavGraphDirections.Companion.actionToMultiProductCard();
        }

        public final NavDirections actionToMainContentProductList() {
            return MaincontentNavGraphDirections.Companion.actionToMainContentProductList();
        }
    }

    private OfflineModeFragmentDirections() {
    }
}
