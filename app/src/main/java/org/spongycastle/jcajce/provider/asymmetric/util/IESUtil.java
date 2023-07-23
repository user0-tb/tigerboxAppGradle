package org.spongycastle.jcajce.provider.asymmetric.util;

import org.spongycastle.crypto.engines.IESEngine;
import org.spongycastle.jce.spec.IESParameterSpec;

/* loaded from: classes4.dex */
public class IESUtil {
    public static IESParameterSpec guessParameterSpec(IESEngine iESEngine) {
        if (iESEngine.getCipher() == null) {
            return new IESParameterSpec(null, null, 128);
        }
        if (iESEngine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("DES") || iESEngine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("RC2") || iESEngine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("RC5-32") || iESEngine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("RC5-64")) {
            return new IESParameterSpec(null, null, 64, 64);
        }
        if (iESEngine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("SKIPJACK")) {
            return new IESParameterSpec(null, null, 80, 80);
        }
        if (iESEngine.getCipher().getUnderlyingCipher().getAlgorithmName().equals("GOST28147")) {
            return new IESParameterSpec(null, null, 256, 256);
        }
        return new IESParameterSpec(null, null, 128, 128);
    }
}
