package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface HpkePublicKeyOrBuilder extends MessageLiteOrBuilder {
    HpkeParams getParams();

    ByteString getPublicKey();

    int getVersion();

    boolean hasParams();
}
