package com.google.crypto.tink.internal;

import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.monitoring.MonitoringKeysetInfo;
import com.google.crypto.tink.proto.KeyStatusType;
import java.security.GeneralSecurityException;
import java.util.List;

/* loaded from: classes3.dex */
public final class MonitoringUtil {
    public static final MonitoringClient.Logger DO_NOTHING_LOGGER = new DoNothingLogger(null);

    /* loaded from: classes3.dex */
    private static class DoNothingLogger implements MonitoringClient.Logger {
        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public void log(int keyId, long numBytesAsInput) {
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public void logFailure() {
        }

        private DoNothingLogger() {
        }

        /* synthetic */ DoNothingLogger(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.internal.MonitoringUtil$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;

        static {
            int[] iArr = new int[KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr;
            try {
                iArr[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static KeyStatus parseStatus(KeyStatusType in) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[in.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return KeyStatus.DESTROYED;
                }
                throw new IllegalStateException("Unknown key status");
            }
            return KeyStatus.DISABLED;
        }
        return KeyStatus.ENABLED;
    }

    public static <P> MonitoringKeysetInfo getMonitoringKeysetInfo(PrimitiveSet<P> primitiveSet) {
        MonitoringKeysetInfo.Builder newBuilder = MonitoringKeysetInfo.newBuilder();
        newBuilder.setAnnotations(primitiveSet.getAnnotations());
        for (List<PrimitiveSet.Entry<P>> list : primitiveSet.getAll()) {
            for (PrimitiveSet.Entry<P> entry : list) {
                newBuilder.addEntry(parseStatus(entry.getStatus()), entry.getKeyId(), entry.getParameters());
            }
        }
        if (primitiveSet.getPrimary() != null) {
            newBuilder.setPrimaryKeyId(primitiveSet.getPrimary().getKeyId());
        }
        try {
            return newBuilder.build();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    private MonitoringUtil() {
    }
}
