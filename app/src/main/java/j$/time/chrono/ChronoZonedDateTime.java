package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime extends Temporal, Comparable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j$.time.chrono.ChronoZonedDateTime$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$time$temporal$ChronoField;

        static {
            int[] iArr = new int[ChronoField.values().length];
            $SwitchMap$java$time$temporal$ChronoField = iArr;
            try {
                iArr[ChronoField.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$time$temporal$ChronoField[ChronoField.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
