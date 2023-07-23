package media.tiger.tigerbox.ui.settings.timersSetup;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: TimersSetupItem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersSetupTitleItem;", "Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersSetupItem;", MessageBundle.TITLE_ENTRY, "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimersSetupTitleItem extends TimersSetupItem {
    private final String title;

    public static /* synthetic */ TimersSetupTitleItem copy$default(TimersSetupTitleItem timersSetupTitleItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timersSetupTitleItem.getTitle();
        }
        return timersSetupTitleItem.copy(str);
    }

    public final String component1() {
        return getTitle();
    }

    public final TimersSetupTitleItem copy(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new TimersSetupTitleItem(title);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimersSetupTitleItem) && Intrinsics.areEqual(getTitle(), ((TimersSetupTitleItem) obj).getTitle());
    }

    public int hashCode() {
        return getTitle().hashCode();
    }

    public String toString() {
        return "TimersSetupTitleItem(title=" + getTitle() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimersSetupTitleItem(String title) {
        super(title, "", null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
    }

    @Override // media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupItem
    public String getTitle() {
        return this.title;
    }
}
