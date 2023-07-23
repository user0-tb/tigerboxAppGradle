package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
interface MessageInfoFactory {
    boolean isSupported(Class<?> clazz);

    MessageInfo messageInfoFor(Class<?> clazz);
}
