package media.tiger.tigerbox.ui.main.card;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.interfaces.TigerTicketStepDomain;

/* compiled from: TigerTicketInputPinFragmentArgs.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/card/TigerTicketInputPinFragmentArgs;", "Landroidx/navigation/NavArgs;", "tigerTicketStepDomain", "Lmedia/tiger/tigerbox/services/interfaces/TigerTicketStepDomain;", "(Lmedia/tiger/tigerbox/services/interfaces/TigerTicketStepDomain;)V", "getTigerTicketStepDomain", "()Lmedia/tiger/tigerbox/services/interfaces/TigerTicketStepDomain;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "toString", "", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TigerTicketInputPinFragmentArgs implements NavArgs {
    public static final Companion Companion = new Companion(null);
    private final TigerTicketStepDomain tigerTicketStepDomain;

    public static /* synthetic */ TigerTicketInputPinFragmentArgs copy$default(TigerTicketInputPinFragmentArgs tigerTicketInputPinFragmentArgs, TigerTicketStepDomain tigerTicketStepDomain, int i, Object obj) {
        if ((i & 1) != 0) {
            tigerTicketStepDomain = tigerTicketInputPinFragmentArgs.tigerTicketStepDomain;
        }
        return tigerTicketInputPinFragmentArgs.copy(tigerTicketStepDomain);
    }

    @JvmStatic
    public static final TigerTicketInputPinFragmentArgs fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    @JvmStatic
    public static final TigerTicketInputPinFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
        return Companion.fromSavedStateHandle(savedStateHandle);
    }

    public final TigerTicketStepDomain component1() {
        return this.tigerTicketStepDomain;
    }

    public final TigerTicketInputPinFragmentArgs copy(TigerTicketStepDomain tigerTicketStepDomain) {
        Intrinsics.checkNotNullParameter(tigerTicketStepDomain, "tigerTicketStepDomain");
        return new TigerTicketInputPinFragmentArgs(tigerTicketStepDomain);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TigerTicketInputPinFragmentArgs) && Intrinsics.areEqual(this.tigerTicketStepDomain, ((TigerTicketInputPinFragmentArgs) obj).tigerTicketStepDomain);
    }

    public int hashCode() {
        return this.tigerTicketStepDomain.hashCode();
    }

    public String toString() {
        return "TigerTicketInputPinFragmentArgs(tigerTicketStepDomain=" + this.tigerTicketStepDomain + ')';
    }

    public TigerTicketInputPinFragmentArgs(TigerTicketStepDomain tigerTicketStepDomain) {
        Intrinsics.checkNotNullParameter(tigerTicketStepDomain, "tigerTicketStepDomain");
        this.tigerTicketStepDomain = tigerTicketStepDomain;
    }

    public final TigerTicketStepDomain getTigerTicketStepDomain() {
        return this.tigerTicketStepDomain;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(TigerTicketStepDomain.class)) {
            bundle.putParcelable("tigerTicketStepDomain", (Parcelable) this.tigerTicketStepDomain);
        } else if (Serializable.class.isAssignableFrom(TigerTicketStepDomain.class)) {
            bundle.putSerializable("tigerTicketStepDomain", this.tigerTicketStepDomain);
        } else {
            throw new UnsupportedOperationException(TigerTicketStepDomain.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return bundle;
    }

    public final SavedStateHandle toSavedStateHandle() {
        SavedStateHandle savedStateHandle = new SavedStateHandle();
        if (Parcelable.class.isAssignableFrom(TigerTicketStepDomain.class)) {
            savedStateHandle.set("tigerTicketStepDomain", (Parcelable) this.tigerTicketStepDomain);
        } else if (Serializable.class.isAssignableFrom(TigerTicketStepDomain.class)) {
            savedStateHandle.set("tigerTicketStepDomain", this.tigerTicketStepDomain);
        } else {
            throw new UnsupportedOperationException(TigerTicketStepDomain.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
        return savedStateHandle;
    }

    /* compiled from: TigerTicketInputPinFragmentArgs.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/card/TigerTicketInputPinFragmentArgs$Companion;", "", "()V", "fromBundle", "Lmedia/tiger/tigerbox/ui/main/card/TigerTicketInputPinFragmentArgs;", "bundle", "Landroid/os/Bundle;", "fromSavedStateHandle", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TigerTicketInputPinFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(TigerTicketInputPinFragmentArgs.class.getClassLoader());
            if (bundle.containsKey("tigerTicketStepDomain")) {
                if (Parcelable.class.isAssignableFrom(TigerTicketStepDomain.class) || Serializable.class.isAssignableFrom(TigerTicketStepDomain.class)) {
                    TigerTicketStepDomain tigerTicketStepDomain = (TigerTicketStepDomain) bundle.get("tigerTicketStepDomain");
                    if (tigerTicketStepDomain == null) {
                        throw new IllegalArgumentException("Argument \"tigerTicketStepDomain\" is marked as non-null but was passed a null value.");
                    }
                    return new TigerTicketInputPinFragmentArgs(tigerTicketStepDomain);
                }
                throw new UnsupportedOperationException(TigerTicketStepDomain.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"tigerTicketStepDomain\" is missing and does not have an android:defaultValue");
        }

        @JvmStatic
        public final TigerTicketInputPinFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.contains("tigerTicketStepDomain")) {
                if (Parcelable.class.isAssignableFrom(TigerTicketStepDomain.class) || Serializable.class.isAssignableFrom(TigerTicketStepDomain.class)) {
                    TigerTicketStepDomain tigerTicketStepDomain = (TigerTicketStepDomain) savedStateHandle.get("tigerTicketStepDomain");
                    if (tigerTicketStepDomain == null) {
                        throw new IllegalArgumentException("Argument \"tigerTicketStepDomain\" is marked as non-null but was passed a null value");
                    }
                    return new TigerTicketInputPinFragmentArgs(tigerTicketStepDomain);
                }
                throw new UnsupportedOperationException(TigerTicketStepDomain.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
            }
            throw new IllegalArgumentException("Required argument \"tigerTicketStepDomain\" is missing and does not have an android:defaultValue");
        }
    }
}
