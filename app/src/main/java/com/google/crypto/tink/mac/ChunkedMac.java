package com.google.crypto.tink.mac;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes3.dex */
public interface ChunkedMac {
    ChunkedMacComputation createComputation() throws GeneralSecurityException;

    ChunkedMacVerification createVerification(final byte[] tag) throws GeneralSecurityException;
}
