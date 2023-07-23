package media.tiger.tigerbox.ui.settings.timersSetup;

import kotlin.Metadata;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: TimersSetupItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersSpecificTimeLimitItem;", "Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersTimeLimitItem;", MessageBundle.TITLE_ENTRY, "", "selected", "", "(IZ)V", "getSelected", "()Z", "setSelected", "(Z)V", "getTitle", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimersSpecificTimeLimitItem extends TimersTimeLimitItem {
    private boolean selected;
    private final int title;

    public static /* synthetic */ TimersSpecificTimeLimitItem copy$default(TimersSpecificTimeLimitItem timersSpecificTimeLimitItem, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = timersSpecificTimeLimitItem.getTitle();
        }
        if ((i2 & 2) != 0) {
            z = timersSpecificTimeLimitItem.getSelected();
        }
        return timersSpecificTimeLimitItem.copy(i, z);
    }

    public final int component1() {
        return getTitle();
    }

    public final boolean component2() {
        return getSelected();
    }

    public final TimersSpecificTimeLimitItem copy(int i, boolean z) {
        return new TimersSpecificTimeLimitItem(i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimersSpecificTimeLimitItem) {
            TimersSpecificTimeLimitItem timersSpecificTimeLimitItem = (TimersSpecificTimeLimitItem) obj;
            return getTitle() == timersSpecificTimeLimitItem.getTitle() && getSelected() == timersSpecificTimeLimitItem.getSelected();
        }
        return false;
    }

    public int hashCode() {
        int title = getTitle() * 31;
        boolean selected = getSelected();
        int i = selected;
        if (selected) {
            i = 1;
        }
        return title + i;
    }

    public String toString() {
        return "TimersSpecificTimeLimitItem(title=" + getTitle() + ", selected=" + getSelected() + ')';
    }

    public TimersSpecificTimeLimitItem(int i, boolean z) {
        super(i, z, null);
        this.title = i;
        this.selected = z;
    }

    @Override // media.tiger.tigerbox.ui.settings.timersSetup.TimersTimeLimitItem
    public boolean getSelected() {
        return this.selected;
    }

    @Override // media.tiger.tigerbox.ui.settings.timersSetup.TimersTimeLimitItem
    public int getTitle() {
        return this.title;
    }

    @Override // media.tiger.tigerbox.ui.settings.timersSetup.TimersTimeLimitItem
    public void setSelected(boolean z) {
        this.selected = z;
    }
}
