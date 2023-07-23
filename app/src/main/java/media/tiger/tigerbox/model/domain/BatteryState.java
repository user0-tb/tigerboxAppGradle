package media.tiger.tigerbox.model.domain;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BatteryState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/BatteryState;", "", "(Ljava/lang/String;I)V", "EMPTY", "WEAK", "GOOD", "FULL", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum BatteryState {
    EMPTY,
    WEAK,
    GOOD,
    FULL;
    
    public static final Companion Companion = new Companion(null);

    /* compiled from: BatteryState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/BatteryState$Companion;", "", "()V", "getBatteryStateFromPercentage", "Lmedia/tiger/tigerbox/model/domain/BatteryState;", "percentage", "Lkotlin/UByte;", "getBatteryStateFromPercentage-7apg3OU", "(B)Lmedia/tiger/tigerbox/model/domain/BatteryState;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getBatteryStateFromPercentage-7apg3OU  reason: not valid java name */
        public final BatteryState m1801getBatteryStateFromPercentage7apg3OU(byte b) {
            int i = b & 255;
            if (UnsignedKt.uintCompare(UInt.m333constructorimpl(i), 100) <= 0) {
                return UnsignedKt.uintCompare(UInt.m333constructorimpl(i), 5) <= 0 ? BatteryState.EMPTY : UnsignedKt.uintCompare(UInt.m333constructorimpl(i), 20) <= 0 ? BatteryState.WEAK : UnsignedKt.uintCompare(UInt.m333constructorimpl(i), 100) < 0 ? BatteryState.GOOD : BatteryState.FULL;
            }
            throw new IllegalArgumentException("Percentage shouldn't be above 100".toString());
        }
    }
}
