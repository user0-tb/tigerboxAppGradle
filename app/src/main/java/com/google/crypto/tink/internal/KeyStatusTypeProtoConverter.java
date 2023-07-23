package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.tinkkey.KeyHandle;

/* loaded from: classes3.dex */
public final class KeyStatusTypeProtoConverter {
    public static KeyHandle.KeyStatusType fromProto(KeyStatusType keyStatusTypeProto) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[keyStatusTypeProto.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return KeyHandle.KeyStatusType.DESTROYED;
                }
                throw new IllegalArgumentException("Unknown key status type.");
            }
            return KeyHandle.KeyStatusType.DISABLED;
        }
        return KeyHandle.KeyStatusType.ENABLED;
    }

    /* renamed from: com.google.crypto.tink.internal.KeyStatusTypeProtoConverter$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType;

        static {
            int[] iArr = new int[KeyHandle.KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType = iArr;
            try {
                iArr[KeyHandle.KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType[KeyHandle.KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType[KeyHandle.KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[KeyStatusType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr2;
            try {
                iArr2[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static KeyStatusType toProto(KeyHandle.KeyStatusType status) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$tinkkey$KeyHandle$KeyStatusType[status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return KeyStatusType.DESTROYED;
                }
                throw new IllegalArgumentException("Unknown key status type.");
            }
            return KeyStatusType.DISABLED;
        }
        return KeyStatusType.ENABLED;
    }

    private KeyStatusTypeProtoConverter() {
    }
}
