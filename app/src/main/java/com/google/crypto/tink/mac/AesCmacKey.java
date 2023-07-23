package com.google.crypto.tink.mac;

import com.google.crypto.tink.Key;
import com.google.crypto.tink.mac.AesCmacParameters;
import com.google.crypto.tink.util.Bytes;
import com.google.crypto.tink.util.SecretBytes;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class AesCmacKey extends MacKey {
    private final SecretBytes aesKeyBytes;
    @Nullable
    private final Integer idRequirement;
    private final AesCmacParameters parameters;

    private AesCmacKey(AesCmacParameters parameters, SecretBytes aesKeyBytes, @Nullable Integer idRequirement) {
        this.parameters = parameters;
        this.aesKeyBytes = aesKeyBytes;
        this.idRequirement = idRequirement;
    }

    public static AesCmacKey create(AesCmacParameters parameters, SecretBytes aesKey) throws GeneralSecurityException {
        if (aesKey.size() != 32) {
            throw new GeneralSecurityException("Invalid key size");
        }
        if (parameters.hasIdRequirement()) {
            throw new GeneralSecurityException("Must use createForKeyset for parameters with ID requirement");
        }
        return new AesCmacKey(parameters, aesKey, null);
    }

    public static AesCmacKey createForKeyset(AesCmacParameters parameters, SecretBytes aesKeyBytes, @Nullable Integer idRequirement) throws GeneralSecurityException {
        if (aesKeyBytes.size() != 32) {
            throw new GeneralSecurityException("Invalid key size");
        }
        if (parameters.hasIdRequirement() && idRequirement == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with format with ID requirement");
        }
        if (!parameters.hasIdRequirement() && idRequirement != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with format without ID requirement");
        }
        return new AesCmacKey(parameters, aesKeyBytes, idRequirement);
    }

    public SecretBytes getAesKey() {
        return this.aesKeyBytes;
    }

    @Override // com.google.crypto.tink.mac.MacKey
    public Bytes getOutputPrefix() {
        if (this.parameters.getVariant() == AesCmacParameters.Variant.NO_PREFIX) {
            return Bytes.copyFrom(new byte[0]);
        }
        if (this.parameters.getVariant() == AesCmacParameters.Variant.LEGACY || this.parameters.getVariant() == AesCmacParameters.Variant.CRUNCHY) {
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 0).putInt(this.idRequirement.intValue()).array());
        }
        if (this.parameters.getVariant() == AesCmacParameters.Variant.TINK) {
            return Bytes.copyFrom(ByteBuffer.allocate(5).put((byte) 1).putInt(this.idRequirement.intValue()).array());
        }
        throw new IllegalStateException("Unknown AesCmacParameters.Variant: " + this.parameters.getVariant());
    }

    @Override // com.google.crypto.tink.mac.MacKey, com.google.crypto.tink.Key
    public AesCmacParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @Nullable
    public Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public boolean equalsKey(Key o) {
        if (o instanceof AesCmacKey) {
            AesCmacKey aesCmacKey = (AesCmacKey) o;
            return aesCmacKey.parameters.equals(this.parameters) && aesCmacKey.aesKeyBytes.equalsSecretBytes(this.aesKeyBytes) && Objects.equals(aesCmacKey.idRequirement, this.idRequirement);
        }
        return false;
    }
}
