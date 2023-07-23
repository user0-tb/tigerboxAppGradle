package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        this.strength = i;
        this.random = secureRandom;
    }
}
