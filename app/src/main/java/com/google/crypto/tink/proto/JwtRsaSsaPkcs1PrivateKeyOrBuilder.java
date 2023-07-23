package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface JwtRsaSsaPkcs1PrivateKeyOrBuilder extends MessageLiteOrBuilder {
    ByteString getCrt();

    ByteString getD();

    ByteString getDp();

    ByteString getDq();

    ByteString getP();

    JwtRsaSsaPkcs1PublicKey getPublicKey();

    ByteString getQ();

    int getVersion();

    boolean hasPublicKey();
}
