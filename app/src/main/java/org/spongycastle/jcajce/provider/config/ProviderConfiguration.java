package org.spongycastle.jcajce.provider.config;

import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.jce.spec.ECParameterSpec;

/* loaded from: classes4.dex */
public interface ProviderConfiguration {
    DHParameterSpec getDHDefaultParameters(int i);

    ECParameterSpec getEcImplicitlyCa();
}
