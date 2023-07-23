package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class JwtRsaSsaPkcs1PublicKey extends GeneratedMessageLite<JwtRsaSsaPkcs1PublicKey, Builder> implements JwtRsaSsaPkcs1PublicKeyOrBuilder {
    public static final int ALGORITHM_FIELD_NUMBER = 2;
    public static final int CUSTOM_KID_FIELD_NUMBER = 5;
    private static final JwtRsaSsaPkcs1PublicKey DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    private static volatile Parser<JwtRsaSsaPkcs1PublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int algorithm_;
    private CustomKid customKid_;
    private int version_;
    private ByteString n_ = ByteString.EMPTY;
    private ByteString e_ = ByteString.EMPTY;

    /* loaded from: classes3.dex */
    public interface CustomKidOrBuilder extends MessageLiteOrBuilder {
        String getValue();

        ByteString getValueBytes();
    }

    private JwtRsaSsaPkcs1PublicKey() {
    }

    /* loaded from: classes3.dex */
    public static final class CustomKid extends GeneratedMessageLite<CustomKid, Builder> implements CustomKidOrBuilder {
        private static final CustomKid DEFAULT_INSTANCE;
        private static volatile Parser<CustomKid> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private String value_ = "";

        private CustomKid() {
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String value) {
            value.getClass();
            this.value_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.value_ = value.toStringUtf8();
        }

        public static CustomKid parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CustomKid parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CustomKid parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CustomKid parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CustomKid parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CustomKid parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CustomKid parseFrom(InputStream input) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CustomKid parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CustomKid parseDelimitedFrom(InputStream input) throws IOException {
            return (CustomKid) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CustomKid parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CustomKid) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CustomKid parseFrom(CodedInputStream input) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CustomKid parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CustomKid) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CustomKid prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        /* loaded from: classes3.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<CustomKid, Builder> implements CustomKidOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(CustomKid.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder
            public String getValue() {
                return ((CustomKid) this.instance).getValue();
            }

            @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKidOrBuilder
            public ByteString getValueBytes() {
                return ((CustomKid) this.instance).getValueBytes();
            }

            public Builder setValue(String value) {
                copyOnWrite();
                ((CustomKid) this.instance).setValue(value);
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((CustomKid) this.instance).clearValue();
                return this;
            }

            public Builder setValueBytes(ByteString value) {
                copyOnWrite();
                ((CustomKid) this.instance).setValueBytes(value);
                return this;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new CustomKid();
                case 2:
                    return new Builder(null);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CustomKid> parser = PARSER;
                    if (parser == null) {
                        synchronized (CustomKid.class) {
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
            CustomKid customKid = new CustomKid();
            DEFAULT_INSTANCE = customKid;
            GeneratedMessageLite.registerDefaultInstance(CustomKid.class, customKid);
        }

        public static CustomKid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CustomKid> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$1  reason: invalid class name */
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public int getAlgorithmValue() {
        return this.algorithm_;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public JwtRsaSsaPkcs1Algorithm getAlgorithm() {
        JwtRsaSsaPkcs1Algorithm forNumber = JwtRsaSsaPkcs1Algorithm.forNumber(this.algorithm_);
        return forNumber == null ? JwtRsaSsaPkcs1Algorithm.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlgorithmValue(int value) {
        this.algorithm_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlgorithm(JwtRsaSsaPkcs1Algorithm value) {
        this.algorithm_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlgorithm() {
        this.algorithm_ = 0;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public ByteString getN() {
        return this.n_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setN(ByteString value) {
        value.getClass();
        this.n_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearN() {
        this.n_ = getDefaultInstance().getN();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public ByteString getE() {
        return this.e_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setE(ByteString value) {
        value.getClass();
        this.e_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearE() {
        this.e_ = getDefaultInstance().getE();
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public boolean hasCustomKid() {
        return this.customKid_ != null;
    }

    @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
    public CustomKid getCustomKid() {
        CustomKid customKid = this.customKid_;
        return customKid == null ? CustomKid.getDefaultInstance() : customKid;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomKid(CustomKid value) {
        value.getClass();
        this.customKid_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustomKid(CustomKid value) {
        value.getClass();
        CustomKid customKid = this.customKid_;
        if (customKid != null && customKid != CustomKid.getDefaultInstance()) {
            this.customKid_ = CustomKid.newBuilder(this.customKid_).mergeFrom((CustomKid.Builder) value).buildPartial();
        } else {
            this.customKid_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomKid() {
        this.customKid_ = null;
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(InputStream input) throws IOException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static JwtRsaSsaPkcs1PublicKey parseDelimitedFrom(InputStream input) throws IOException {
        return (JwtRsaSsaPkcs1PublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static JwtRsaSsaPkcs1PublicKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (JwtRsaSsaPkcs1PublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(CodedInputStream input) throws IOException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static JwtRsaSsaPkcs1PublicKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (JwtRsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(JwtRsaSsaPkcs1PublicKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<JwtRsaSsaPkcs1PublicKey, Builder> implements JwtRsaSsaPkcs1PublicKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(JwtRsaSsaPkcs1PublicKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public int getVersion() {
            return ((JwtRsaSsaPkcs1PublicKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public int getAlgorithmValue() {
            return ((JwtRsaSsaPkcs1PublicKey) this.instance).getAlgorithmValue();
        }

        public Builder setAlgorithmValue(int value) {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).setAlgorithmValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public JwtRsaSsaPkcs1Algorithm getAlgorithm() {
            return ((JwtRsaSsaPkcs1PublicKey) this.instance).getAlgorithm();
        }

        public Builder setAlgorithm(JwtRsaSsaPkcs1Algorithm value) {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).setAlgorithm(value);
            return this;
        }

        public Builder clearAlgorithm() {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).clearAlgorithm();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public ByteString getN() {
            return ((JwtRsaSsaPkcs1PublicKey) this.instance).getN();
        }

        public Builder setN(ByteString value) {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).setN(value);
            return this;
        }

        public Builder clearN() {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).clearN();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public ByteString getE() {
            return ((JwtRsaSsaPkcs1PublicKey) this.instance).getE();
        }

        public Builder setE(ByteString value) {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).setE(value);
            return this;
        }

        public Builder clearE() {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).clearE();
            return this;
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public boolean hasCustomKid() {
            return ((JwtRsaSsaPkcs1PublicKey) this.instance).hasCustomKid();
        }

        @Override // com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKeyOrBuilder
        public CustomKid getCustomKid() {
            return ((JwtRsaSsaPkcs1PublicKey) this.instance).getCustomKid();
        }

        public Builder setCustomKid(CustomKid value) {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).setCustomKid(value);
            return this;
        }

        public Builder setCustomKid(CustomKid.Builder builderForValue) {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).setCustomKid(builderForValue.build());
            return this;
        }

        public Builder mergeCustomKid(CustomKid value) {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).mergeCustomKid(value);
            return this;
        }

        public Builder clearCustomKid() {
            copyOnWrite();
            ((JwtRsaSsaPkcs1PublicKey) this.instance).clearCustomKid();
            return this;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new JwtRsaSsaPkcs1PublicKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\f\u0003\n\u0004\n\u0005\t", new Object[]{"version_", "algorithm_", "n_", "e_", "customKid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<JwtRsaSsaPkcs1PublicKey> parser = PARSER;
                if (parser == null) {
                    synchronized (JwtRsaSsaPkcs1PublicKey.class) {
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
        JwtRsaSsaPkcs1PublicKey jwtRsaSsaPkcs1PublicKey = new JwtRsaSsaPkcs1PublicKey();
        DEFAULT_INSTANCE = jwtRsaSsaPkcs1PublicKey;
        GeneratedMessageLite.registerDefaultInstance(JwtRsaSsaPkcs1PublicKey.class, jwtRsaSsaPkcs1PublicKey);
    }

    public static JwtRsaSsaPkcs1PublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<JwtRsaSsaPkcs1PublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
