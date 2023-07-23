package com.google.crypto.tink.util;

import com.google.crypto.tink.SecretKeyAccess;
import com.google.crypto.tink.subtle.Random;
import com.google.errorprone.annotations.Immutable;
import java.util.Objects;

@Immutable
/* loaded from: classes3.dex */
public final class SecretBytes {
    private final Bytes bytes;

    private SecretBytes(Bytes bytes) {
        this.bytes = bytes;
    }

    public static SecretBytes copyFrom(byte[] value, SecretKeyAccess access) {
        Objects.requireNonNull(access, "SecretKeyAccess required");
        return new SecretBytes(Bytes.copyFrom(value));
    }

    public static SecretBytes randomBytes(int length) {
        return new SecretBytes(Bytes.copyFrom(Random.randBytes(length)));
    }

    public byte[] toByteArray(SecretKeyAccess access) {
        Objects.requireNonNull(access, "SecretKeyAccess required");
        return this.bytes.toByteArray();
    }

    public int size() {
        return this.bytes.size();
    }

    public boolean equalsSecretBytes(SecretBytes other) {
        byte[] byteArray = this.bytes.toByteArray();
        byte[] byteArray2 = other.bytes.toByteArray();
        if (byteArray.length != byteArray2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < byteArray.length; i2++) {
            i |= byteArray[i2] ^ byteArray2[i2];
        }
        return i == 0;
    }
}
