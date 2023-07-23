package media.tiger.tigerbox.model.domain;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: WifiItemDomain.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/WifiStrength;", "", "sortingPriority", "", "(Ljava/lang/String;II)V", "getSortingPriority", "()I", "WIFI_WEAK", "WIFI_MEDIUM", "WIFI_STRONG", "NO_WIFI", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum WifiStrength {
    WIFI_WEAK(2),
    WIFI_MEDIUM(1),
    WIFI_STRONG(0),
    NO_WIFI(-1);
    
    private final int sortingPriority;
    public static final Companion Companion = new Companion(null);
    private static final Lazy<List<WifiStrength>> valuesWithConnection$delegate = LazyKt.lazy(new Function0<List<? extends WifiStrength>>() { // from class: media.tiger.tigerbox.model.domain.WifiStrength$Companion$valuesWithConnection$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends WifiStrength> invoke() {
            WifiStrength[] values = WifiStrength.values();
            ArrayList arrayList = new ArrayList();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                WifiStrength wifiStrength = values[i];
                if (wifiStrength != WifiStrength.NO_WIFI) {
                    arrayList.add(wifiStrength);
                }
            }
            return arrayList;
        }
    });

    WifiStrength(int i) {
        this.sortingPriority = i;
    }

    public final int getSortingPriority() {
        return this.sortingPriority;
    }

    /* compiled from: WifiItemDomain.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/WifiStrength$Companion;", "", "()V", "valuesWithConnection", "", "Lmedia/tiger/tigerbox/model/domain/WifiStrength;", "getValuesWithConnection", "()Ljava/util/List;", "valuesWithConnection$delegate", "Lkotlin/Lazy;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<WifiStrength> getValuesWithConnection() {
            return (List) WifiStrength.valuesWithConnection$delegate.getValue();
        }
    }
}
