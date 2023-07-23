package media.tiger.tigerbox.ui.onboarding.step4;

import android.os.Bundle;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.OnboardingNavGraphDirections;
import media.tiger.tigerbox.R;
import media.tiger.tigerbox.ui.common.InfoDialogType;

/* compiled from: OnboardingBackendResponseFragmentDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendResponseFragmentDirections;", "", "()V", "ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingBackendResponseFragmentDirections {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnboardingBackendResponseFragmentDirections.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendResponseFragmentDirections$ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment;", "Landroidx/navigation/NavDirections;", "sessionTokenExpired", "", "(Z)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getSessionTokenExpired", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment implements NavDirections {
        private final int actionId;
        private final boolean sessionTokenExpired;

        public ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment() {
            this(false, 1, null);
        }

        public static /* synthetic */ ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment copy$default(ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment actionOnboardingBackendResponseFragmentToOnboardingLoginFragment, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = actionOnboardingBackendResponseFragmentToOnboardingLoginFragment.sessionTokenExpired;
            }
            return actionOnboardingBackendResponseFragmentToOnboardingLoginFragment.copy(z);
        }

        public final boolean component1() {
            return this.sessionTokenExpired;
        }

        public final ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment copy(boolean z) {
            return new ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment) && this.sessionTokenExpired == ((ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment) obj).sessionTokenExpired;
        }

        public int hashCode() {
            boolean z = this.sessionTokenExpired;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment(sessionTokenExpired=" + this.sessionTokenExpired + ')';
        }

        public ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment(boolean z) {
            this.sessionTokenExpired = z;
            this.actionId = R.id.action_onboardingBackendResponseFragment_to_onboardingLoginFragment;
        }

        public /* synthetic */ ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getSessionTokenExpired() {
            return this.sessionTokenExpired;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("sessionTokenExpired", this.sessionTokenExpired);
            return bundle;
        }
    }

    private OnboardingBackendResponseFragmentDirections() {
    }

    /* compiled from: OnboardingBackendResponseFragmentDirections.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J7\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lmedia/tiger/tigerbox/ui/onboarding/step4/OnboardingBackendResponseFragmentDirections$Companion;", "", "()V", "actionOnboardingBackendResponseFragmentToMainContentActivity", "Landroidx/navigation/NavDirections;", "actionOnboardingBackendResponseFragmentToOnboardingLoginFragment", "sessionTokenExpired", "", "actionOnboardingBackendResponseFragmentToOnboardingStep1Screen1Fragment", "actionOnboardingBackendResponseFragmentToOnboardingWifiListFragment", "actionOnboardingToOnboardingErrorDialog", "dialogType", "Lmedia/tiger/tigerbox/ui/common/InfoDialogType;", "titleFormatParams", "", "", "messageFormatParams", "(Lmedia/tiger/tigerbox/ui/common/InfoDialogType;[Ljava/lang/String;[Ljava/lang/String;)Landroidx/navigation/NavDirections;", "actionOnboardingToResetDialog", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavDirections actionOnboardingBackendResponseFragmentToOnboardingStep1Screen1Fragment() {
            return new ActionOnlyNavDirections(R.id.action_onboardingBackendResponseFragment_to_onboardingStep1Screen1Fragment);
        }

        public static /* synthetic */ NavDirections actionOnboardingBackendResponseFragmentToOnboardingLoginFragment$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.actionOnboardingBackendResponseFragmentToOnboardingLoginFragment(z);
        }

        public final NavDirections actionOnboardingBackendResponseFragmentToOnboardingLoginFragment(boolean z) {
            return new ActionOnboardingBackendResponseFragmentToOnboardingLoginFragment(z);
        }

        public final NavDirections actionOnboardingBackendResponseFragmentToMainContentActivity() {
            return new ActionOnlyNavDirections(R.id.action_onboardingBackendResponseFragment_to_mainContentActivity);
        }

        public final NavDirections actionOnboardingBackendResponseFragmentToOnboardingWifiListFragment() {
            return new ActionOnlyNavDirections(R.id.action_onboardingBackendResponseFragment_to_onboardingWifiListFragment);
        }

        public static /* synthetic */ NavDirections actionOnboardingToOnboardingErrorDialog$default(Companion companion, InfoDialogType infoDialogType, String[] strArr, String[] strArr2, int i, Object obj) {
            if ((i & 2) != 0) {
                strArr = null;
            }
            if ((i & 4) != 0) {
                strArr2 = null;
            }
            return companion.actionOnboardingToOnboardingErrorDialog(infoDialogType, strArr, strArr2);
        }

        public final NavDirections actionOnboardingToOnboardingErrorDialog(InfoDialogType dialogType, String[] strArr, String[] strArr2) {
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            return OnboardingNavGraphDirections.Companion.actionOnboardingToOnboardingErrorDialog(dialogType, strArr, strArr2);
        }

        public final NavDirections actionOnboardingToResetDialog() {
            return OnboardingNavGraphDirections.Companion.actionOnboardingToResetDialog();
        }
    }
}
