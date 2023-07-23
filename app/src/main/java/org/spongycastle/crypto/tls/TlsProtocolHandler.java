package org.spongycastle.crypto.tls;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class TlsProtocolHandler extends TlsClientProtocol {
    public TlsProtocolHandler(InputStream inputStream, OutputStream outputStream) {
        super(inputStream, outputStream);
    }

    public TlsProtocolHandler(InputStream inputStream, OutputStream outputStream, SecureRandom secureRandom) {
        super(inputStream, outputStream, secureRandom);
    }
}
