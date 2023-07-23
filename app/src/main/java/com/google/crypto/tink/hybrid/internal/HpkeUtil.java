package com.google.crypto.tink.hybrid.internal;

import com.google.crypto.tink.proto.HpkeParams;
import com.google.crypto.tink.subtle.Bytes;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class HpkeUtil {
    public static final byte[] BASE_MODE = intToByteArray(1, 0);
    public static final byte[] X25519_HKDF_SHA256_KEM_ID = intToByteArray(2, 32);
    public static final byte[] P256_HKDF_SHA256_KEM_ID = intToByteArray(2, 16);
    public static final byte[] P384_HKDF_SHA384_KEM_ID = intToByteArray(2, 17);
    public static final byte[] P521_HKDF_SHA512_KEM_ID = intToByteArray(2, 18);
    public static final byte[] HKDF_SHA256_KDF_ID = intToByteArray(2, 1);
    public static final byte[] HKDF_SHA384_KDF_ID = intToByteArray(2, 2);
    public static final byte[] HKDF_SHA512_KDF_ID = intToByteArray(2, 3);
    public static final byte[] AES_128_GCM_AEAD_ID = intToByteArray(2, 1);
    public static final byte[] AES_256_GCM_AEAD_ID = intToByteArray(2, 2);
    public static final byte[] CHACHA20_POLY1305_AEAD_ID = intToByteArray(2, 3);
    public static final byte[] EMPTY_SALT = new byte[0];
    private static final byte[] KEM = "KEM".getBytes(StandardCharsets.UTF_8);
    private static final byte[] HPKE = "HPKE".getBytes(StandardCharsets.UTF_8);
    private static final byte[] HPKE_V1 = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    public static byte[] intToByteArray(int capacity, int value) {
        byte[] bArr = new byte[capacity];
        for (int i = 0; i < capacity; i++) {
            bArr[i] = (byte) ((value >> (((capacity - i) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] kemSuiteId(byte[] kemId) throws GeneralSecurityException {
        return Bytes.concat(KEM, kemId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] hpkeSuiteId(byte[] kemId, byte[] kdfId, byte[] aeadId) throws GeneralSecurityException {
        return Bytes.concat(HPKE, kemId, kdfId, aeadId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] labelIkm(String label, byte[] ikm, byte[] suiteId) throws GeneralSecurityException {
        return Bytes.concat(HPKE_V1, suiteId, label.getBytes(StandardCharsets.UTF_8), ikm);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] labelInfo(String label, byte[] info, byte[] suiteId, int length) throws GeneralSecurityException {
        return Bytes.concat(intToByteArray(2, length), HPKE_V1, suiteId, label.getBytes(StandardCharsets.UTF_8), info);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validateParams(HpkeParams params) throws GeneralSecurityException {
        if (params.getKem() == com.google.crypto.tink.proto.HpkeKem.KEM_UNKNOWN || params.getKem() == com.google.crypto.tink.proto.HpkeKem.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KEM param: " + params.getKem().name());
        } else if (params.getKdf() == com.google.crypto.tink.proto.HpkeKdf.KDF_UNKNOWN || params.getKdf() == com.google.crypto.tink.proto.HpkeKdf.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid KDF param: " + params.getKdf().name());
        } else if (params.getAead() == com.google.crypto.tink.proto.HpkeAead.AEAD_UNKNOWN || params.getAead() == com.google.crypto.tink.proto.HpkeAead.UNRECOGNIZED) {
            throw new GeneralSecurityException("Invalid AEAD param: " + params.getAead().name());
        }
    }

    private HpkeUtil() {
    }
}
