package media.tiger.tigerbox.ui.settings;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FullScreenSeekBarFragmentArgs.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/FullScreenSeekBarFragmentArgs;", "Landroidx/navigation/NavArgs;", "seekBarType", "Lmedia/tiger/tigerbox/ui/settings/SeekBarDialogType;", "(Lmedia/tiger/tigerbox/ui/settings/SeekBarDialogType;)V", "getSeekBarType", "()Lmedia/tiger/tigerbox/ui/settings/SeekBarDialogType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "toString", "", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FullScreenSeekBarFragmentArgs implements NavArgs {
    public static final Companion Companion = new Companion(null);
    private final SeekBarDialogType seekBarType;

    public static /* synthetic */ FullScreenSeekBarFragmentArgs copy$default(FullScreenSeekBarFragmentArgs fullScreenSeekBarFragmentArgs, SeekBarDialogType seekBarDialogType, int i, Object obj) {
        if ((i & 1) != 0) {
            seekBarDialogType = fullScreenSeekBarFragmentArgs.seekBarType;
        }
        return fullScreenSeekBarFragmentArgs.copy(seekBarDialogType);
    }

    @JvmStatic
    public static final FullScreenSeekBarFragmentArgs fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    @JvmStatic
    public static final FullScreenSeekBarFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
        return Companion.fromSavedStateHandle(savedStateHandle);
    }

    public final SeekBarDialogType component1() {
        return this.seekBarType;
    }

    public final FullScreenSeekBarFragmentArgs copy(SeekBarDialogType seekBarType) {
        Intrinsics.checkNotNullParameter(seekBarType, "seekBarType");
        return new FullScreenSeekBarFragmentArgs(seekBarType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FullScreenSeekBarFragmentArgs) && this.seekBarType == ((FullScreenSeekBarFragmentArgs) obj).seekBarType;
    }

    public int hashCode() {
        return this.seekBarType.hashCode();
    }

    public String toString() {
        return "FullScreenSeekBarFragmentArgs(seekBarType=" + this.seekBarType + ')';
    }

    public FullScreenSeekBarFragmentArgs(SeekBarDialogType seekBarType) {
        Intrinsics.checkNotNullParameter(seekBarType, "seekBarType");
        this.seekBarType = seekBarType;
    }

    public final SeekBarDialogType getSeekBarType() {
        return this.seekBarType;
    }

    public final Bundle toBundle() {
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

    public final SavedStateHandle toSavedStateHandle() {
        SavedStateHandle savedStateHandle = new SavedStateHandle();
        if (Parcelable.class.isAssignableFrom(SeekBarDialogType.class)) {
            savedStateHandle.set("seekBarType", (Parcelable) this.seekBarType);
        } else if (Serializable.class.isAssignableFrom(SeekBarDialogType.class)) {
            savedStateHandle.set("seekBarType", this.seekBarType);
        } else {
            throw new UnsupportedOperationException(SeekBarDialogType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return savedStateHandle;
    }

    /* compiled from: FullScreenSeekBarFragmentArgs.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/FullScreenSeekBarFragmentArgs$Companion;", "", "()V", "fromBundle", "Lmedia/tiger/tigerbox/ui/settings/FullScreenSeekBarFragmentArgs;", "bundle", "Landroid/os/Bundle;", "fromSavedStateHandle", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FullScreenSeekBarFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(FullScreenSeekBarFragmentArgs.class.getClassLoader());
            if (bundle.containsKey("seekBarType")) {
                if (Parcelable.class.isAssignableFrom(SeekBarDialogType.class) || Serializable.class.isAssignableFrom(SeekBarDialogType.class)) {
                    SeekBarDialogType seekBarDialogType = (SeekBarDialogType) bundle.get("seekBarType");
                    if (seekBarDialogType == null) {
                        throw new IllegalArgumentException("Argument \"seekBarType\" is marked as non-null but was passed a null value.");
                    }
                    return new FullScreenSeekBarFragmentArgs(seekBarDialogType);
                }
                throw new UnsupportedOperationException(SeekBarDialogType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"seekBarType\" is missing and does not have an android:defaultValue");
        }

        @JvmStatic
        public final FullScreenSeekBarFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.contains("seekBarType")) {
                if (Parcelable.class.isAssignableFrom(SeekBarDialogType.class) || Serializable.class.isAssignableFrom(SeekBarDialogType.class)) {
                    SeekBarDialogType seekBarDialogType = (SeekBarDialogType) savedStateHandle.get("seekBarType");
                    if (seekBarDialogType == null) {
                        throw new IllegalArgumentException("Argument \"seekBarType\" is marked as non-null but was passed a null value");
                    }
                    return new FullScreenSeekBarFragmentArgs(seekBarDialogType);
                }
                throw new UnsupportedOperationException(SeekBarDialogType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"seekBarType\" is missing and does not have an android:defaultValue");
        }
    }
}
