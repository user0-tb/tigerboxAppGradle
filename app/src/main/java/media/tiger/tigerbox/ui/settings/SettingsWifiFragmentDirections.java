package media.tiger.tigerbox.ui.settings;

import android.os.Bundle;
import androidx.navigation.NavDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.SettingsNavGraphDirections;
import media.tiger.tigerbox.services.interfaces.TigerTicketStepDomain;

/* compiled from: SettingsWifiFragmentDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SettingsWifiFragmentDirections;", "", "()V", "ActionSettingsWifiListFragmentToWifiEnterPasswordFragment", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SettingsWifiFragmentDirections {
    public static final Companion Companion = new Companion(null);

    /* compiled from: SettingsWifiFragmentDirections.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SettingsWifiFragmentDirections$ActionSettingsWifiListFragmentToWifiEnterPasswordFragment;", "Landroidx/navigation/NavDirections;", "wifiName", "", "(Ljava/lang/String;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getWifiName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class ActionSettingsWifiListFragmentToWifiEnterPasswordFragment implements NavDirections {
        private final int actionId;
        private final String wifiName;

        public static /* synthetic */ ActionSettingsWifiListFragmentToWifiEnterPasswordFragment copy$default(ActionSettingsWifiListFragmentToWifiEnterPasswordFragment actionSettingsWifiListFragmentToWifiEnterPasswordFragment, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionSettingsWifiListFragmentToWifiEnterPasswordFragment.wifiName;
            }
            return actionSettingsWifiListFragmentToWifiEnterPasswordFragment.copy(str);
        }

        public final String component1() {
            return this.wifiName;
        }

        public final ActionSettingsWifiListFragmentToWifiEnterPasswordFragment copy(String wifiName) {
            Intrinsics.checkNotNullParameter(wifiName, "wifiName");
            return new ActionSettingsWifiListFragmentToWifiEnterPasswordFragment(wifiName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionSettingsWifiListFragmentToWifiEnterPasswordFragment) && Intrinsics.areEqual(this.wifiName, ((ActionSettingsWifiListFragmentToWifiEnterPasswordFragment) obj).wifiName);
        }

        public int hashCode() {
            return this.wifiName.hashCode();
        }

        public String toString() {
            return "ActionSettingsWifiListFragmentToWifiEnterPasswordFragment(wifiName=" + this.wifiName + ')';
        }

        public ActionSettingsWifiListFragmentToWifiEnterPasswordFragment(String wifiName) {
            Intrinsics.checkNotNullParameter(wifiName, "wifiName");
            this.wifiName = wifiName;
            this.actionId = R.id.action_settingsWifiListFragment_to_wifiEnterPasswordFragment;
        }

        public final String getWifiName() {
            return this.wifiName;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("wifiName", this.wifiName);
            return bundle;
        }
    }

    private SettingsWifiFragmentDirections() {
    }

    /* compiled from: SettingsWifiFragmentDirections.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SettingsWifiFragmentDirections$Companion;", "", "()V", "actionSettingsWifiListFragmentToWifiEnterPasswordFragment", "Landroidx/navigation/NavDirections;", "wifiName", "", "actionToTigerTicketPinInput", "tigerTicketStepDomain", "Lmedia/tiger/tigerbox/services/interfaces/TigerTicketStepDomain;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavDirections actionSettingsWifiListFragmentToWifiEnterPasswordFragment(String wifiName) {
            Intrinsics.checkNotNullParameter(wifiName, "wifiName");
            return new ActionSettingsWifiListFragmentToWifiEnterPasswordFragment(wifiName);
        }

        public final NavDirections actionToTigerTicketPinInput(TigerTicketStepDomain tigerTicketStepDomain) {
            Intrinsics.checkNotNullParameter(tigerTicketStepDomain, "tigerTicketStepDomain");
            return SettingsNavGraphDirections.Companion.actionToTigerTicketPinInput(tigerTicketStepDomain);
        }
    }
}
