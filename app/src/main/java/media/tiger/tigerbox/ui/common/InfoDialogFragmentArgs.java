package media.tiger.tigerbox.ui.common;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoDialogFragmentArgs.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006 "}, d2 = {"Lmedia/tiger/tigerbox/ui/common/InfoDialogFragmentArgs;", "Landroidx/navigation/NavArgs;", "dialogType", "Lmedia/tiger/tigerbox/ui/common/InfoDialogType;", "titleFormatParams", "", "", "messageFormatParams", "(Lmedia/tiger/tigerbox/ui/common/InfoDialogType;[Ljava/lang/String;[Ljava/lang/String;)V", "getDialogType", "()Lmedia/tiger/tigerbox/ui/common/InfoDialogType;", "getMessageFormatParams", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getTitleFormatParams", "component1", "component2", "component3", "copy", "(Lmedia/tiger/tigerbox/ui/common/InfoDialogType;[Ljava/lang/String;[Ljava/lang/String;)Lmedia/tiger/tigerbox/ui/common/InfoDialogFragmentArgs;", "equals", "", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "toString", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoDialogFragmentArgs implements NavArgs {
    public static final Companion Companion = new Companion(null);
    private final InfoDialogType dialogType;
    private final String[] messageFormatParams;
    private final String[] titleFormatParams;

    public static /* synthetic */ InfoDialogFragmentArgs copy$default(InfoDialogFragmentArgs infoDialogFragmentArgs, InfoDialogType infoDialogType, String[] strArr, String[] strArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            infoDialogType = infoDialogFragmentArgs.dialogType;
        }
        if ((i & 2) != 0) {
            strArr = infoDialogFragmentArgs.titleFormatParams;
        }
        if ((i & 4) != 0) {
            strArr2 = infoDialogFragmentArgs.messageFormatParams;
        }
        return infoDialogFragmentArgs.copy(infoDialogType, strArr, strArr2);
    }

    @JvmStatic
    public static final InfoDialogFragmentArgs fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    @JvmStatic
    public static final InfoDialogFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
        return Companion.fromSavedStateHandle(savedStateHandle);
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

    public final InfoDialogFragmentArgs copy(InfoDialogType dialogType, String[] strArr, String[] strArr2) {
        Intrinsics.checkNotNullParameter(dialogType, "dialogType");
        return new InfoDialogFragmentArgs(dialogType, strArr, strArr2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InfoDialogFragmentArgs) {
            InfoDialogFragmentArgs infoDialogFragmentArgs = (InfoDialogFragmentArgs) obj;
            return this.dialogType == infoDialogFragmentArgs.dialogType && Intrinsics.areEqual(this.titleFormatParams, infoDialogFragmentArgs.titleFormatParams) && Intrinsics.areEqual(this.messageFormatParams, infoDialogFragmentArgs.messageFormatParams);
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
        return "InfoDialogFragmentArgs(dialogType=" + this.dialogType + ", titleFormatParams=" + Arrays.toString(this.titleFormatParams) + ", messageFormatParams=" + Arrays.toString(this.messageFormatParams) + ')';
    }

    public InfoDialogFragmentArgs(InfoDialogType dialogType, String[] strArr, String[] strArr2) {
        Intrinsics.checkNotNullParameter(dialogType, "dialogType");
        this.dialogType = dialogType;
        this.titleFormatParams = strArr;
        this.messageFormatParams = strArr2;
    }

    public /* synthetic */ InfoDialogFragmentArgs(InfoDialogType infoDialogType, String[] strArr, String[] strArr2, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

    public final Bundle toBundle() {
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

    public final SavedStateHandle toSavedStateHandle() {
        SavedStateHandle savedStateHandle = new SavedStateHandle();
        if (Parcelable.class.isAssignableFrom(InfoDialogType.class)) {
            savedStateHandle.set("dialogType", (Parcelable) this.dialogType);
        } else if (Serializable.class.isAssignableFrom(InfoDialogType.class)) {
            savedStateHandle.set("dialogType", this.dialogType);
        } else {
            throw new UnsupportedOperationException(InfoDialogType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        savedStateHandle.set("titleFormatParams", this.titleFormatParams);
        savedStateHandle.set("messageFormatParams", this.messageFormatParams);
        return savedStateHandle;
    }

    /* compiled from: InfoDialogFragmentArgs.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/ui/common/InfoDialogFragmentArgs$Companion;", "", "()V", "fromBundle", "Lmedia/tiger/tigerbox/ui/common/InfoDialogFragmentArgs;", "bundle", "Landroid/os/Bundle;", "fromSavedStateHandle", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InfoDialogFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(InfoDialogFragmentArgs.class.getClassLoader());
            if (bundle.containsKey("dialogType")) {
                if (Parcelable.class.isAssignableFrom(InfoDialogType.class) || Serializable.class.isAssignableFrom(InfoDialogType.class)) {
                    InfoDialogType infoDialogType = (InfoDialogType) bundle.get("dialogType");
                    if (infoDialogType == null) {
                        throw new IllegalArgumentException("Argument \"dialogType\" is marked as non-null but was passed a null value.");
                    }
                    return new InfoDialogFragmentArgs(infoDialogType, bundle.containsKey("titleFormatParams") ? bundle.getStringArray("titleFormatParams") : null, bundle.containsKey("messageFormatParams") ? bundle.getStringArray("messageFormatParams") : null);
                }
                throw new UnsupportedOperationException(InfoDialogType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"dialogType\" is missing and does not have an android:defaultValue");
        }

        @JvmStatic
        public final InfoDialogFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.contains("dialogType")) {
                if (Parcelable.class.isAssignableFrom(InfoDialogType.class) || Serializable.class.isAssignableFrom(InfoDialogType.class)) {
                    InfoDialogType infoDialogType = (InfoDialogType) savedStateHandle.get("dialogType");
                    if (infoDialogType == null) {
                        throw new IllegalArgumentException("Argument \"dialogType\" is marked as non-null but was passed a null value");
                    }
                    return new InfoDialogFragmentArgs(infoDialogType, savedStateHandle.contains("titleFormatParams") ? (String[]) savedStateHandle.get("titleFormatParams") : null, savedStateHandle.contains("messageFormatParams") ? (String[]) savedStateHandle.get("messageFormatParams") : null);
                }
                throw new UnsupportedOperationException(InfoDialogType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"dialogType\" is missing and does not have an android:defaultValue");
        }
    }
}
