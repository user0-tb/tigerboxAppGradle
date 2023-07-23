package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.Salsa20Engine;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes4.dex */
public final class Salsa20 {
    private Salsa20() {
    }

    /* loaded from: classes4.dex */
    public static class Base extends BaseStreamCipher {
        public Base() {
            super(new Salsa20Engine(), 8);
        }
    }

    /* loaded from: classes4.dex */
    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Salsa20", 128, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes4.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = Salsa20.class.getName();

        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.SALSA20", sb.toString());
            configurableProvider.addAlgorithm("KeyGenerator.SALSA20", str + "$KeyGen");
        }
    }
}
