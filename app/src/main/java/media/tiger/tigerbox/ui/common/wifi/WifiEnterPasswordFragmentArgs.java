package media.tiger.tigerbox.ui.common.wifi;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WifiEnterPasswordFragmentArgs.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/ui/common/wifi/WifiEnterPasswordFragmentArgs;", "Landroidx/navigation/NavArgs;", "wifiName", "", "(Ljava/lang/String;)V", "getWifiName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "toString", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WifiEnterPasswordFragmentArgs implements NavArgs {
    public static final Companion Companion = new Companion(null);
    private final String wifiName;

    public static /* synthetic */ WifiEnterPasswordFragmentArgs copy$default(WifiEnterPasswordFragmentArgs wifiEnterPasswordFragmentArgs, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wifiEnterPasswordFragmentArgs.wifiName;
        }
        return wifiEnterPasswordFragmentArgs.copy(str);
    }

    @JvmStatic
    public static final WifiEnterPasswordFragmentArgs fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    @JvmStatic
    public static final WifiEnterPasswordFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
        return Companion.fromSavedStateHandle(savedStateHandle);
    }

    public final String component1() {
        return this.wifiName;
    }

    public final WifiEnterPasswordFragmentArgs copy(String wifiName) {
        Intrinsics.checkNotNullParameter(wifiName, "wifiName");
        return new WifiEnterPasswordFragmentArgs(wifiName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WifiEnterPasswordFragmentArgs) && Intrinsics.areEqual(this.wifiName, ((WifiEnterPasswordFragmentArgs) obj).wifiName);
    }

    public int hashCode() {
        return this.wifiName.hashCode();
    }

    public String toString() {
        return "WifiEnterPasswordFragmentArgs(wifiName=" + this.wifiName + ')';
    }

    public WifiEnterPasswordFragmentArgs(String wifiName) {
        Intrinsics.checkNotNullParameter(wifiName, "wifiName");
        this.wifiName = wifiName;
    }

    public final String getWifiName() {
        return this.wifiName;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("wifiName", this.wifiName);
        return bundle;
    }

    public final SavedStateHandle toSavedStateHandle() {
        SavedStateHandle savedStateHandle = new SavedStateHandle();
        savedStateHandle.set("wifiName", this.wifiName);
        return savedStateHandle;
    }

    /* compiled from: WifiEnterPasswordFragmentArgs.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/ui/common/wifi/WifiEnterPasswordFragmentArgs$Companion;", "", "()V", "fromBundle", "Lmedia/tiger/tigerbox/ui/common/wifi/WifiEnterPasswordFragmentArgs;", "bundle", "Landroid/os/Bundle;", "fromSavedStateHandle", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final WifiEnterPasswordFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(WifiEnterPasswordFragmentArgs.class.getClassLoader());
            if (bundle.containsKey("wifiName")) {
                String string = bundle.getString("wifiName");
                if (string == null) {
                    throw new IllegalArgumentException("Argument \"wifiName\" is marked as non-null but was passed a null value.");
                }
                return new WifiEnterPasswordFragmentArgs(string);
            }
            throw new IllegalArgumentException("Required argument \"wifiName\" is missing and does not have an android:defaultValue");
        }

        @JvmStatic
        public final WifiEnterPasswordFragmentArgs fromSavedStateHandle(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.contains("wifiName")) {
                String str = (String) savedStateHandle.get("wifiName");
                if (str == null) {
                    throw new IllegalArgumentException("Argument \"wifiName\" is marked as non-null but was passed a null value");
                }
                return new WifiEnterPasswordFragmentArgs(str);
            }
            throw new IllegalArgumentException("Required argument \"wifiName\" is missing and does not have an android:defaultValue");
        }
    }
}
