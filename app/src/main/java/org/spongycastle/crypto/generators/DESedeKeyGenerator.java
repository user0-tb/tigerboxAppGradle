package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DESedeParameters;

/* loaded from: classes4.dex */
public class DESedeKeyGenerator extends DESKeyGenerator {
    @Override // org.spongycastle.crypto.generators.DESKeyGenerator, org.spongycastle.crypto.CipherKeyGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.random = keyGenerationParameters.getRandom();
        this.strength = (keyGenerationParameters.getStrength() + 7) / 8;
        if (this.strength == 0 || this.strength == 21) {
            this.strength = 24;
        } else if (this.strength == 14) {
            this.strength = 16;
        } else if (this.strength != 24 && this.strength != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }

    @Override // org.spongycastle.crypto.generators.DESKeyGenerator, org.spongycastle.crypto.CipherKeyGenerator
    public byte[] generateKey() {
        int i = this.strength;
        byte[] bArr = new byte[i];
        do {
            this.random.nextBytes(bArr);
            DESedeParameters.setOddParity(bArr);
        } while (DESedeParameters.isWeakKey(bArr, 0, i));
        return bArr;
    }
}
