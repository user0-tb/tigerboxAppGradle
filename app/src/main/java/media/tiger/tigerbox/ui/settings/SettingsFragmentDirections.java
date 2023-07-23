package media.tiger.tigerbox.ui.settings;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.SettingsNavGraphDirections;
import media.tiger.tigerbox.services.interfaces.TigerTicketStepDomain;

/* compiled from: SettingsFragmentDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SettingsFragmentDirections;", "", "()V", "ActionParentalSettingsToFullScreenSeekBar", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SettingsFragmentDirections {
    public static final Companion Companion = new Companion(null);

    /* compiled from: SettingsFragmentDirections.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SettingsFragmentDirections$ActionParentalSettingsToFullScreenSeekBar;", "Landroidx/navigation/NavDirections;", "seekBarType", "Lmedia/tiger/tigerbox/ui/settings/SeekBarDialogType;", "(Lmedia/tiger/tigerbox/ui/settings/SeekBarDialogType;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getSeekBarType", "()Lmedia/tiger/tigerbox/ui/settings/SeekBarDialogType;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class ActionParentalSettingsToFullScreenSeekBar implements NavDirections {
        private final int actionId;
        private final SeekBarDialogType seekBarType;

        public static /* synthetic */ ActionParentalSettingsToFullScreenSeekBar copy$default(ActionParentalSettingsToFullScreenSeekBar actionParentalSettingsToFullScreenSeekBar, SeekBarDialogType seekBarDialogType, int i, Object obj) {
            if ((i & 1) != 0) {
                seekBarDialogType = actionParentalSettingsToFullScreenSeekBar.seekBarType;
            }
            return actionParentalSettingsToFullScreenSeekBar.copy(seekBarDialogType);
        }

        public final SeekBarDialogType component1() {
            return this.seekBarType;
        }

        public final ActionParentalSettingsToFullScreenSeekBar copy(SeekBarDialogType seekBarType) {
            Intrinsics.checkNotNullParameter(seekBarType, "seekBarType");
            return new ActionParentalSettingsToFullScreenSeekBar(seekBarType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionParentalSettingsToFullScreenSeekBar) && this.seekBarType == ((ActionParentalSettingsToFullScreenSeekBar) obj).seekBarType;
        }

        public int hashCode() {
            return this.seekBarType.hashCode();
        }

        public String toString() {
            return "ActionParentalSettingsToFullScreenSeekBar(seekBarType=" + this.seekBarType + ')';
        }

        public ActionParentalSettingsToFullScreenSeekBar(SeekBarDialogType seekBarType) {
            Intrinsics.checkNotNullParameter(seekBarType, "seekBarType");
            this.seekBarType = seekBarType;
            this.actionId = R.id.action_parentalSettings_to_fullScreenSeekBar;
        }

        public final SeekBarDialogType getSeekBarType() {
            return this.seekBarType;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(SeekBarDialogType.class)) {
                bundle.putParcelable("seekBarType", (Parcelable) this.seekBarType);
            } else if (Serializable.class.isAssignableFrom(SeekBarDialogType.class)) {
                bundle.putSerializable("seekBarType", this.seekBarType);
            } else {
                throw new UnsupportedOperationException(SeekBarDialogType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }
    }

    private SettingsFragmentDirections() {
    }

    /* compiled from: SettingsFragmentDirections.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SettingsFragmentDirections$Companion;", "", "()V", "actionParentalSettingsToDisableParentalGateStep", "Landroidx/navigation/NavDirections;", "actionParentalSettingsToEnableParentalGateStep", "actionParentalSettingsToFullScreenSeekBar", "seekBarType", "Lmedia/tiger/tigerbox/ui/settings/SeekBarDialogType;", "actionParentalSettingsToSendLogsInProgress", "actionParentalSettingsToSendLogsNone", "actionParentalSettingsToSystemInfoFragment", "actionParentalSettingsToTicketRedeemTicketNumberDialogFragment", "actionParentalSettingsToTimersSetupFragment", "actionParentalSettingsToUpdateFragment", "actionParentalSettingsToUserProfilesSwitching", "actionParentalSettingsToWifiListFragment", "actionParentalSettingsToWildCardReAssigningStep1Fragment", "actionParentalSettingsToWildCardReAssigningStep2Fragment", "actionParentalSettingsToWildCardReAssigningStep4Fragment", "actionToTigerTicketPinInput", "tigerTicketStepDomain", "Lmedia/tiger/tigerbox/services/interfaces/TigerTicketStepDomain;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavDirections actionParentalSettingsToFullScreenSeekBar(SeekBarDialogType seekBarType) {
            Intrinsics.checkNotNullParameter(seekBarType, "seekBarType");
            return new ActionParentalSettingsToFullScreenSeekBar(seekBarType);
        }

        public final NavDirections actionParentalSettingsToEnableParentalGateStep() {
            return new ActionOnlyNavDirections(R.id.action_parental_settings_to_enable_parental_gate_step);
        }

        public final NavDirections actionParentalSettingsToDisableParentalGateStep() {
            return new ActionOnlyNavDirections(R.id.action_parental_settings_to_disable_parental_gate_step);
        }

        public final NavDirections actionParentalSettingsToWifiListFragment() {
            return new ActionOnlyNavDirections(R.id.action_parental_settings_to_wifiListFragment);
        }

        public final NavDirections actionParentalSettingsToSystemInfoFragment() {
            return new ActionOnlyNavDirections(R.id.action_parentalSettings_to_systemInfoFragment);
        }

        public final NavDirections actionParentalSettingsToUserProfilesSwitching() {
            return new ActionOnlyNavDirections(R.id.action_parentalSettings_to_userProfilesSwitching);
        }

        public final NavDirections actionParentalSettingsToSendLogsInProgress() {
            return new ActionOnlyNavDirections(R.id.action_parental_settings_to_send_logs_in_progress);
        }

        public final NavDirections actionParentalSettingsToSendLogsNone() {
            return new ActionOnlyNavDirections(R.id.action_parental_settings_to_send_logs_none);
        }

        public final NavDirections actionParentalSettingsToTimersSetupFragment() {
            return new ActionOnlyNavDirections(R.id.action_parentalSettings_to_timersSetupFragment);
        }

        public final NavDirections actionParentalSettingsToWildCardReAssigningStep1Fragment() {
            return new ActionOnlyNavDirections(R.id.action_parentalSettings_to_wildCardReAssigningStep1Fragment);
        }

        public final NavDirections actionParentalSettingsToWildCardReAssigningStep2Fragment() {
            return new ActionOnlyNavDirections(R.id.action_parentalSettings_to_wildCardReAssigningStep2Fragment);
        }

        public final NavDirections actionParentalSettingsToWildCardReAssigningStep4Fragment() {
            return new ActionOnlyNavDirections(R.id.action_parentalSettings_to_wildCardReAssigningStep4Fragment);
        }

        public final NavDirections actionParentalSettingsToUpdateFragment() {
            return new ActionOnlyNavDirections(R.id.action_parentalSettings_to_updateFragment);
        }

        public final NavDirections actionParentalSettingsToTicketRedeemTicketNumberDialogFragment() {
            return new ActionOnlyNavDirections(R.id.action_parentalSettings_to_ticketRedeemTicketNumberDialogFragment);
        }

        public final NavDirections actionToTigerTicketPinInput(TigerTicketStepDomain tigerTicketStepDomain) {
            Intrinsics.checkNotNullParameter(tigerTicketStepDomain, "tigerTicketStepDomain");
            return SettingsNavGraphDirections.Companion.actionToTigerTicketPinInput(tigerTicketStepDomain);
        }
    }
}
