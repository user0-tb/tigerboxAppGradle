package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class HpkeParams extends GeneratedMessageLite<HpkeParams, Builder> implements HpkeParamsOrBuilder {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final HpkeParams DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile Parser<HpkeParams> PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

    private HpkeParams() {
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public int getKemValue() {
        return this.kem_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public HpkeKem getKem() {
        HpkeKem forNumber = HpkeKem.forNumber(this.kem_);
        return forNumber == null ? HpkeKem.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKemValue(int value) {
        this.kem_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKem(HpkeKem value) {
        this.kem_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKem() {
        this.kem_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public int getKdfValue() {
        return this.kdf_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public HpkeKdf getKdf() {
        HpkeKdf forNumber = HpkeKdf.forNumber(this.kdf_);
        return forNumber == null ? HpkeKdf.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKdfValue(int value) {
        this.kdf_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKdf(HpkeKdf value) {
        this.kdf_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKdf() {
        this.kdf_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public int getAeadValue() {
        return this.aead_;
    }

    @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
    public HpkeAead getAead() {
        HpkeAead forNumber = HpkeAead.forNumber(this.aead_);
        return forNumber == null ? HpkeAead.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAeadValue(int value) {
        this.aead_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAead(HpkeAead value) {
        this.aead_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAead() {
        this.aead_ = 0;
    }

    public static HpkeParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkeParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkeParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkeParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkeParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkeParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkeParams parseFrom(InputStream input) throws IOException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkeParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HpkeParams parseDelimitedFrom(InputStream input) throws IOException {
        return (HpkeParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkeParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkeParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HpkeParams parseFrom(CodedInputStream input) throws IOException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkeParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkeParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HpkeParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HpkeParams, Builder> implements HpkeParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(HpkeParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public int getKemValue() {
            return ((HpkeParams) this.instance).getKemValue();
        }

        public Builder setKemValue(int value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setKemValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public HpkeKem getKem() {
            return ((HpkeParams) this.instance).getKem();
        }

        public Builder setKem(HpkeKem value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setKem(value);
            return this;
        }

        public Builder clearKem() {
            copyOnWrite();
            ((HpkeParams) this.instance).clearKem();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public int getKdfValue() {
            return ((HpkeParams) this.instance).getKdfValue();
        }

        public Builder setKdfValue(int value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setKdfValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public HpkeKdf getKdf() {
            return ((HpkeParams) this.instance).getKdf();
        }

        public Builder setKdf(HpkeKdf value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setKdf(value);
            return this;
        }

        public Builder clearKdf() {
            copyOnWrite();
            ((HpkeParams) this.instance).clearKdf();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public int getAeadValue() {
            return ((HpkeParams) this.instance).getAeadValue();
        }

        public Builder setAeadValue(int value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setAeadValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkeParamsOrBuilder
        public HpkeAead getAead() {
            return ((HpkeParams) this.instance).getAead();
        }

        public Builder setAead(HpkeAead value) {
            copyOnWrite();
            ((HpkeParams) this.instance).setAead(value);
            return this;
        }

        public Builder clearAead() {
            copyOnWrite();
            ((HpkeParams) this.instance).clearAead();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HpkeParams$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new HpkeParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"kem_", "kdf_", "aead_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HpkeParams> parser = PARSER;
                if (parser == null) {
                    synchronized (HpkeParams.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        HpkeParams hpkeParams = new HpkeParams();
        DEFAULT_INSTANCE = hpkeParams;
        GeneratedMessageLite.registerDefaultInstance(HpkeParams.class, hpkeParams);
    }

    public static HpkeParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HpkeParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
