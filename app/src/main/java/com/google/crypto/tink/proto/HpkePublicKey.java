package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.HpkeParams;
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
public final class HpkePublicKey extends GeneratedMessageLite<HpkePublicKey, Builder> implements HpkePublicKeyOrBuilder {
    private static final HpkePublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<HpkePublicKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private HpkeParams params_;
    private ByteString publicKey_ = ByteString.EMPTY;
    private int version_;

    private HpkePublicKey() {
    }

    @Override // com.google.crypto.tink.proto.HpkePublicKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int value) {
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HpkePublicKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.HpkePublicKeyOrBuilder
    public HpkeParams getParams() {
        HpkeParams hpkeParams = this.params_;
        return hpkeParams == null ? HpkeParams.getDefaultInstance() : hpkeParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(HpkeParams value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(HpkeParams value) {
        value.getClass();
        HpkeParams hpkeParams = this.params_;
        if (hpkeParams != null && hpkeParams != HpkeParams.getDefaultInstance()) {
            this.params_ = HpkeParams.newBuilder(this.params_).mergeFrom((HpkeParams.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.HpkePublicKeyOrBuilder
    public ByteString getPublicKey() {
        return this.publicKey_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(ByteString value) {
        value.getClass();
        this.publicKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = getDefaultInstance().getPublicKey();
    }

    public static HpkePublicKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkePublicKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkePublicKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkePublicKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkePublicKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HpkePublicKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HpkePublicKey parseFrom(InputStream input) throws IOException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkePublicKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HpkePublicKey parseDelimitedFrom(InputStream input) throws IOException {
        return (HpkePublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkePublicKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkePublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HpkePublicKey parseFrom(CodedInputStream input) throws IOException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HpkePublicKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HpkePublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HpkePublicKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HpkePublicKey, Builder> implements HpkePublicKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(HpkePublicKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HpkePublicKeyOrBuilder
        public int getVersion() {
            return ((HpkePublicKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((HpkePublicKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((HpkePublicKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkePublicKeyOrBuilder
        public boolean hasParams() {
            return ((HpkePublicKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.HpkePublicKeyOrBuilder
        public HpkeParams getParams() {
            return ((HpkePublicKey) this.instance).getParams();
        }

        public Builder setParams(HpkeParams value) {
            copyOnWrite();
            ((HpkePublicKey) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(HpkeParams.Builder builderForValue) {
            copyOnWrite();
            ((HpkePublicKey) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(HpkeParams value) {
            copyOnWrite();
            ((HpkePublicKey) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((HpkePublicKey) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HpkePublicKeyOrBuilder
        public ByteString getPublicKey() {
            return ((HpkePublicKey) this.instance).getPublicKey();
        }

        public Builder setPublicKey(ByteString value) {
            copyOnWrite();
            ((HpkePublicKey) this.instance).setPublicKey(value);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((HpkePublicKey) this.instance).clearPublicKey();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HpkePublicKey$1  reason: invalid class name */
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
                return new HpkePublicKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "publicKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HpkePublicKey> parser = PARSER;
                if (parser == null) {
                    synchronized (HpkePublicKey.class) {
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
        HpkePublicKey hpkePublicKey = new HpkePublicKey();
        DEFAULT_INSTANCE = hpkePublicKey;
        GeneratedMessageLite.registerDefaultInstance(HpkePublicKey.class, hpkePublicKey);
    }

    public static HpkePublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HpkePublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
