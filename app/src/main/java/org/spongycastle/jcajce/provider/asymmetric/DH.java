package org.spongycastle.jcajce.provider.asymmetric;

import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: classes4.dex */
public class DH {
    private static final String PREFIX = "org.spongycastle.jcajce.provider.asymmetric.dh.";

    /* loaded from: classes4.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.spongycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyPairGenerator.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
            configurableProvider.addAlgorithm("KeyAgreement.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
            configurableProvider.addAlgorithm("KeyFactory.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
            configurableProvider.addAlgorithm("AlgorithmParameters.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
            configurableProvider.addAlgorithm("Cipher.DHIES", "org.spongycastle.jcajce.provider.asymmetric.dh.IESCipher$IES");
            configurableProvider.addAlgorithm("Cipher.DHIESwithAES", "org.spongycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAES");
            configurableProvider.addAlgorithm("Cipher.DHIESWITHAES", "org.spongycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAES");
            configurableProvider.addAlgorithm("Cipher.DHIESWITHDESEDE", "org.spongycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESede");
            registerOid(configurableProvider, PKCSObjectIdentifiers.dhKeyAgreement, "DH", new KeyFactorySpi());
            registerOid(configurableProvider, X9ObjectIdentifiers.dhpublicnumber, "DH", new KeyFactorySpi());
        }
    }
}
