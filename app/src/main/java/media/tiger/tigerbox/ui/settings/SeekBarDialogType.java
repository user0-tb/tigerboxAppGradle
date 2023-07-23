package media.tiger.tigerbox.ui.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import media.tiger.tigerbox.R;

/* compiled from: SeekBarDialogType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/ui/settings/SeekBarDialogType;", "", "thumbId", "", "maxValue", "backgroundId", "(Ljava/lang/String;IIII)V", "getBackgroundId", "()I", "getMaxValue", "getThumbId", "SCREEN_BRIGHTNESS", "TIGER_LIGHT_INTENSITY", "VOLUME", "SLEEP_TIMER", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum SeekBarDialogType {
    SCREEN_BRIGHTNESS(R.drawable.seekbar_brightness_thumb, 255, 0, 4, null),
    TIGER_LIGHT_INTENSITY(R.drawable.seekbar_tiger_light_thumb, 100, 0, 4, null),
    VOLUME(R.drawable.seekbar_volume_thumb, -1, 0, 4, null),
    SLEEP_TIMER(R.drawable.seekbar_sleep_timer_thumb, 8, R.drawable.seekbar_progress_sleep_timer_background);
    
    private final int backgroundId;
    private final int maxValue;
    private final int thumbId;

    SeekBarDialogType(int i, int i2, int i3) {
        this.thumbId = i;
        this.maxValue = i2;
        this.backgroundId = i3;
    }

    /* synthetic */ SeekBarDialogType(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? R.drawable.seekbar_progress_background : i3);
    }

    public final int getBackgroundId() {
        return this.backgroundId;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getThumbId() {
        return this.thumbId;
    }
}
