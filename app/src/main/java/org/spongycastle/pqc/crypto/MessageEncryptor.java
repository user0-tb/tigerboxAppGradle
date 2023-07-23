package org.spongycastle.pqc.crypto;

import org.spongycastle.crypto.CipherParameters;

/* loaded from: classes4.dex */
public interface MessageEncryptor {
    void init(boolean z, CipherParameters cipherParameters);

    byte[] messageDecrypt(byte[] bArr) throws Exception;

    byte[] messageEncrypt(byte[] bArr) throws Exception;
}
