package media.tiger.tigerbox.ui.settings.timersSetup;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: TimersSetupItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersTimeLimitItem;", "", MessageBundle.TITLE_ENTRY, "", "selected", "", "(IZ)V", TtmlNode.ATTR_ID, "getId", "()I", "getSelected", "()Z", "setSelected", "(Z)V", "getTitle", "Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersSpecificTimeLimitItem;", "Lmedia/tiger/tigerbox/ui/settings/timersSetup/TimersCustomTimeLimitItem;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class TimersTimeLimitItem {
    private boolean selected;
    private final int title;

    public /* synthetic */ TimersTimeLimitItem(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    private TimersTimeLimitItem(int i, boolean z) {
        this.title = i;
        this.selected = z;
    }

    public int getTitle() {
        return this.title;
    }

    public boolean getSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public final int getId() {
        return getTitle();
    }
}
