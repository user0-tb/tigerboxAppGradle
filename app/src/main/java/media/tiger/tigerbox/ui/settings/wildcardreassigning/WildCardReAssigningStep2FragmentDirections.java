package media.tiger.tigerbox.ui.settings.wildcardreassigning;

import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.SettingsNavGraphDirections;
import media.tiger.tigerbox.services.interfaces.TigerTicketStepDomain;

/* compiled from: WildCardReAssigningStep2FragmentDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/wildcardreassigning/WildCardReAssigningStep2FragmentDirections;", "", "()V", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WildCardReAssigningStep2FragmentDirections {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WildCardReAssigningStep2FragmentDirections.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/wildcardreassigning/WildCardReAssigningStep2FragmentDirections$Companion;", "", "()V", "actionToTigerTicketPinInput", "Landroidx/navigation/NavDirections;", "tigerTicketStepDomain", "Lmedia/tiger/tigerbox/services/interfaces/TigerTicketStepDomain;", "actionWildCardReAssigningStep2FragmentToWildCardReAssigningStep3Fragment", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavDirections actionWildCardReAssigningStep2FragmentToWildCardReAssigningStep3Fragment() {
            return new ActionOnlyNavDirections(R.id.action_wildCardReAssigningStep2Fragment_to_wildCardReAssigningStep3Fragment);
        }

        public final NavDirections actionToTigerTicketPinInput(TigerTicketStepDomain tigerTicketStepDomain) {
            Intrinsics.checkNotNullParameter(tigerTicketStepDomain, "tigerTicketStepDomain");
            return SettingsNavGraphDirections.Companion.actionToTigerTicketPinInput(tigerTicketStepDomain);
        }
    }

    private WildCardReAssigningStep2FragmentDirections() {
    }
}
