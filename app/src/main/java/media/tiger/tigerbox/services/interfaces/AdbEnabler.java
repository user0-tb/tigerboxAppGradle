package media.tiger.tigerbox.services.interfaces;

import kotlin.Metadata;

/* compiled from: AdbEnabler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0011\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/AdbEnabler;", "", "invoke", "", "adbState", "Lmedia/tiger/tigerbox/services/interfaces/AdbEnabler$AdbState;", "AdbState", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AdbEnabler {
    void invoke(AdbState adbState);

    /* compiled from: AdbEnabler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/AdbEnabler$AdbState;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "ENABLED", "DISABLED", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public enum AdbState {
        ENABLED(1),
        DISABLED(0);
        
        private final int code;

        AdbState(int i) {
            this.code = i;
        }

        public final int getCode() {
            return this.code;
        }
    }
}
