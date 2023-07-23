package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface JwtRsaSsaPssKeyFormatOrBuilder extends MessageLiteOrBuilder {
    JwtRsaSsaPssAlgorithm getAlgorithm();

    int getAlgorithmValue();

    int getModulusSizeInBits();

    ByteString getPublicExponent();

    int getVersion();
}
