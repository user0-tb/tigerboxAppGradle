package media.tiger.tigerbox.ui.settings;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* compiled from: SettingsItemData.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SettingsItemData;", "", "bottomText", "", "icon", "(II)V", "getBottomText", "()I", "getIcon", TtmlNode.ATTR_ID, "getId", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public class SettingsItemData {
    private final int bottomText;
    private final int icon;
    private final int id;

    public SettingsItemData(int i, int i2) {
        this.bottomText = i;
        this.icon = i2;
        this.id = i;
    }

    public final int getBottomText() {
        return this.bottomText;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }
}
