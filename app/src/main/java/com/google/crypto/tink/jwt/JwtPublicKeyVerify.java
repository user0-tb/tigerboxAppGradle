package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes3.dex */
public interface JwtPublicKeyVerify {
    VerifiedJwt verifyAndDecode(String compact, JwtValidator validator) throws GeneralSecurityException;
}
