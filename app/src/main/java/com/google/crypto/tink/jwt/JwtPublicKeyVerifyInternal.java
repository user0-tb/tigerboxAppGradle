package com.google.crypto.tink.jwt;

import com.google.errorprone.annotations.Immutable;
import j$.util.Optional;
import java.security.GeneralSecurityException;

@Immutable
/* loaded from: classes3.dex */
public interface JwtPublicKeyVerifyInternal {
    VerifiedJwt verifyAndDecodeWithKid(String compact, JwtValidator validator, Optional<String> kid) throws GeneralSecurityException;
}
