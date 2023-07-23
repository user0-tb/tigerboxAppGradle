package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes3.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    private static final Internal.EnumLiteMap<NullValue> internalValueMap = new Internal.EnumLiteMap<NullValue>() { // from class: com.google.crypto.tink.shaded.protobuf.NullValue.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public NullValue findValueByNumber(int number) {
            return NullValue.forNumber(number);
        }
    };
    private final int value;

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static NullValue valueOf(int value) {
        return forNumber(value);
    }

    public static NullValue forNumber(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return NullValueVerifier.INSTANCE;
    }

    /* loaded from: classes3.dex */
    private static final class NullValueVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new NullValueVerifier();

        private NullValueVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return NullValue.forNumber(number) != null;
        }
    }

    NullValue(int value) {
        this.value = value;
    }
}
