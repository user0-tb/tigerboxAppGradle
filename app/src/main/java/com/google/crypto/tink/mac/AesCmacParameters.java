package com.google.crypto.tink.mac;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class AesCmacParameters extends MacParameters {
    private final int tagSizeBytes;
    private final Variant variant;

    @Immutable
    /* loaded from: classes3.dex */
    public static final class Variant {
        private final String name;
        public static final Variant TINK = new Variant("TINK");
        public static final Variant CRUNCHY = new Variant("CRUNCHY");
        public static final Variant LEGACY = new Variant("LEGACY");
        public static final Variant NO_PREFIX = new Variant("NO_PREFIX");

        private Variant(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }
    }

    private AesCmacParameters(int tagSizeBytes, Variant variant) {
        this.tagSizeBytes = tagSizeBytes;
        this.variant = variant;
    }

    public static AesCmacParameters create(int tagSize) throws GeneralSecurityException {
        return createForKeysetWithCryptographicTagSize(tagSize, Variant.NO_PREFIX);
    }

    public static AesCmacParameters createForKeysetWithCryptographicTagSize(int tagSizeBytes, Variant variant) throws GeneralSecurityException {
        if (tagSizeBytes < 10 || 16 < tagSizeBytes) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + tagSizeBytes);
        }
        return new AesCmacParameters(tagSizeBytes, variant);
    }

    public int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public int getTotalTagSizeBytes() {
        int cryptographicTagSizeBytes;
        if (this.variant == Variant.NO_PREFIX) {
            return getCryptographicTagSizeBytes();
        }
        if (this.variant == Variant.TINK) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else if (this.variant == Variant.CRUNCHY) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else if (this.variant == Variant.LEGACY) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return cryptographicTagSizeBytes + 5;
    }

    public Variant getVariant() {
        return this.variant;
    }

    public boolean equals(Object o) {
        if (o instanceof AesCmacParameters) {
            AesCmacParameters aesCmacParameters = (AesCmacParameters) o;
            return aesCmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && aesCmacParameters.getVariant() == getVariant();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.tagSizeBytes), this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public boolean hasIdRequirement() {
        return this.variant != Variant.NO_PREFIX;
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.variant + ", " + this.tagSizeBytes + "-byte tags)";
    }
}
