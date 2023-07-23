package media.tiger.tigerbox;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.ui.common.InfoDialogType;

/* compiled from: OnboardingNavGraphDirections.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/OnboardingNavGraphDirections;", "", "()V", "ActionOnboardingToOnboardingErrorDialog", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingNavGraphDirections {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnboardingNavGraphDirections.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J<\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006\""}, d2 = {"Lmedia/tiger/tigerbox/OnboardingNavGraphDirections$ActionOnboardingToOnboardingErrorDialog;", "Landroidx/navigation/NavDirections;", "dialogType", "Lmedia/tiger/tigerbox/ui/common/InfoDialogType;", "titleFormatParams", "", "", "messageFormatParams", "(Lmedia/tiger/tigerbox/ui/common/InfoDialogType;[Ljava/lang/String;[Ljava/lang/String;)V", "actionId", "", "getActionId", "()I", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;", "getDialogType", "()Lmedia/tiger/tigerbox/ui/common/InfoDialogType;", "getMessageFormatParams", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getTitleFormatParams", "component1", "component2", "component3", "copy", "(Lmedia/tiger/tigerbox/ui/common/InfoDialogType;[Ljava/lang/String;[Ljava/lang/String;)Lmedia/tiger/tigerbox/OnboardingNavGraphDirections$ActionOnboardingToOnboardingErrorDialog;", "equals", "", "other", "", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ActionOnboardingToOnboardingErrorDialog implements NavDirections {
        private final int actionId;
        private final InfoDialogType dialogType;
        private final String[] messageFormatParams;
        private final String[] titleFormatParams;

        public static /* synthetic */ ActionOnboardingToOnboardingErrorDialog copy$default(ActionOnboardingToOnboardingErrorDialog actionOnboardingToOnboardingErrorDialog, InfoDialogType infoDialogType, String[] strArr, String[] strArr2, int i, Object obj) {
            if ((i & 1) != 0) {
                infoDialogType = actionOnboardingToOnboardingErrorDialog.dialogType;
            }
            if ((i & 2) != 0) {
                strArr = actionOnboardingToOnboardingErrorDialog.titleFormatParams;
            }
            if ((i & 4) != 0) {
                strArr2 = actionOnboardingToOnboardingErrorDialog.messageFormatParams;
            }
            return actionOnboardingToOnboardingErrorDialog.copy(infoDialogType, strArr, strArr2);
        }

        public final InfoDialogType component1() {
            return this.dialogType;
        }

        public final String[] component2() {
            return this.titleFormatParams;
        }

        public final String[] component3() {
            return this.messageFormatParams;
        }

        public final ActionOnboardingToOnboardingErrorDialog copy(InfoDialogType dialogType, String[] strArr, String[] strArr2) {
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            return new ActionOnboardingToOnboardingErrorDialog(dialogType, strArr, strArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActionOnboardingToOnboardingErrorDialog) {
                ActionOnboardingToOnboardingErrorDialog actionOnboardingToOnboardingErrorDialog = (ActionOnboardingToOnboardingErrorDialog) obj;
                return this.dialogType == actionOnboardingToOnboardingErrorDialog.dialogType && Intrinsics.areEqual(this.titleFormatParams, actionOnboardingToOnboardingErrorDialog.titleFormatParams) && Intrinsics.areEqual(this.messageFormatParams, actionOnboardingToOnboardingErrorDialog.messageFormatParams);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.dialogType.hashCode() * 31;
            String[] strArr = this.titleFormatParams;
            int hashCode2 = (hashCode + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
            String[] strArr2 = this.messageFormatParams;
            return hashCode2 + (strArr2 != null ? Arrays.hashCode(strArr2) : 0);
        }

        public String toString() {
            return "ActionOnboardingToOnboardingErrorDialog(dialogType=" + this.dialogType + ", titleFormatParams=" + Arrays.toString(this.titleFormatParams) + ", messageFormatParams=" + Arrays.toString(this.messageFormatParams) + ')';
        }

        public ActionOnboardingToOnboardingErrorDialog(InfoDialogType dialogType, String[] strArr, String[] strArr2) {
            Intrinsics.checkNotNullParameter(dialogType, "dialogType");
            this.dialogType = dialogType;
            this.titleFormatParams = strArr;
            this.messageFormatParams = strArr2;
            this.actionId = R.id.action_onboarding_to_onboardingErrorDialog;
        }

        public /* synthetic */ ActionOnboardingToOnboardingErrorDialog(InfoDialogType infoDialogType, String[] strArr, String[] strArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(infoDialogType, (i & 2) != 0 ? null : strArr, (i & 4) != 0 ? null : strArr2);
        }

        public final InfoDialogType getDialogType() {
            return this.dialogType;
        }

        public final String[] getTitleFormatParams() {
            return this.titleFormatParams;
        }

        public final String[] getMessageFormatParams() {
            return this.messageFormatParams;
        }

        @Override // androidx.navigation.NavDirections
        public int getActionId() {
            return this.actionId;
        }

        @Override // androidx.navigation.NavDirections
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(InfoDialogType.class)) {
                bundle.putParcelable("dialogType", (Parcelable) this.dialogType);
            } else if (Serializable.class.isAssignableFrom(InfoDialogType.class)) {
                bundle.putSerializable("dialogType", this.dialogType);
            } else {
                throw new UnsupportedOperationException(InfoDialogType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putStringArray("titleFormatParams", this.titleFormatParams);
            bundle.putStringArray("messageFormatParams", this.messageFormatParams);
            return bundle;
        }
    }

    private OnboardingNavGraphDirections() {
    }

    /* compiled from: OnboardingNavGraphDirections.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lmedia/tiger/tigerbox/OnboardingNavGraphDirections$Companion;", "", "()V", "actionOnboardingToOnboardingErrorDialog", "Landroidx/navigation/NavDirections;", "dialogType", "Lmedia/tiger/tigerbox/ui/common/InfoDialogType;", "titleFormatParams", "", "", "messageFormatParams", "(Lmedia/tiger/tigerbox/ui/common/InfoDialogType;[Ljava/lang/String;[Ljava/lang/String;)Landroidx/navigation/NavDirections;", "actionOnboardingToResetDialog", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
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
            return new ActionOnboardingToOnboardingErrorDialog(dialogType, strArr, strArr2);
        }

        public final NavDirections actionOnboardingToResetDialog() {
            return new ActionOnlyNavDirections(R.id.action_onboarding_to_resetDialog);
        }
    }
}
