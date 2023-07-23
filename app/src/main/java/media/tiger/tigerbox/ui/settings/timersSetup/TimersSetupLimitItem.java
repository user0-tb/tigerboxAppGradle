package media.tiger.tigerbox.ui.settings.timersSetup;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: TimersSetupItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersSetupLimitItem;", "Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersSetupItem;", MessageBundle.TITLE_ENTRY, "", "initialLimitSeconds", "", "value", "(Ljava/lang/String;ILjava/lang/String;)V", "getInitialLimitSeconds", "()I", "getTitle", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimersSetupLimitItem extends TimersSetupItem {
    private final int initialLimitSeconds;
    private final String title;
    private final String value;

    public static /* synthetic */ TimersSetupLimitItem copy$default(TimersSetupLimitItem timersSetupLimitItem, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = timersSetupLimitItem.getTitle();
        }
        if ((i2 & 2) != 0) {
            i = timersSetupLimitItem.initialLimitSeconds;
        }
        if ((i2 & 4) != 0) {
            str2 = timersSetupLimitItem.getValue();
        }
        return timersSetupLimitItem.copy(str, i, str2);
    }

    public final String component1() {
        return getTitle();
    }

    public final int component2() {
        return this.initialLimitSeconds;
    }

    public final String component3() {
        return getValue();
    }

    public final TimersSetupLimitItem copy(String title, int i, String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        return new TimersSetupLimitItem(title, i, value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimersSetupLimitItem) {
            TimersSetupLimitItem timersSetupLimitItem = (TimersSetupLimitItem) obj;
            return Intrinsics.areEqual(getTitle(), timersSetupLimitItem.getTitle()) && this.initialLimitSeconds == timersSetupLimitItem.initialLimitSeconds && Intrinsics.areEqual(getValue(), timersSetupLimitItem.getValue());
        }
        return false;
    }

    public int hashCode() {
        return (((getTitle().hashCode() * 31) + this.initialLimitSeconds) * 31) + getValue().hashCode();
    }

    public String toString() {
        return "TimersSetupLimitItem(title=" + getTitle() + ", initialLimitSeconds=" + this.initialLimitSeconds + ", value=" + getValue() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimersSetupLimitItem(String title, int i, String value) {
        super(title, value, null);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = title;
        this.initialLimitSeconds = i;
        this.value = value;
    }

    public final int getInitialLimitSeconds() {
        return this.initialLimitSeconds;
    }

    @Override // media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupItem
    public String getTitle() {
        return this.title;
    }

    @Override // media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupItem
    public String getValue() {
        return this.value;
    }
}
