package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface KmsEnvelopeAeadKeyFormatOrBuilder extends MessageLiteOrBuilder {
    KeyTemplate getDekTemplate();

    String getKekUri();

    ByteString getKekUriBytes();

    boolean hasDekTemplate();
}
