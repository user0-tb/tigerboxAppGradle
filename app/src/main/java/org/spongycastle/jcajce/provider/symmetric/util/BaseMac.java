package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.SkeinParameters;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jcajce.spec.SkeinParameterSpec;

/* loaded from: classes4.dex */
public class BaseMac extends MacSpi implements PBE {
    private int keySize;
    private Mac macEngine;
    private int pbeHash;
    private int pbeType;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseMac(Mac mac) {
        this.pbeType = 2;
        this.pbeHash = 1;
        this.keySize = CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
        this.macEngine = mac;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseMac(Mac mac, int i, int i2, int i3) {
        this.pbeType = 2;
        this.pbeHash = 1;
        this.keySize = CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
        this.macEngine = mac;
        this.pbeType = i;
        this.pbeHash = i2;
        this.keySize = i3;
    }

    @Override // javax.crypto.MacSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters keyParameter;
        if (key == null) {
            throw new InvalidKeyException("key is null");
        }
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getParam() != null) {
                keyParameter = bCPBEKey.getParam();
            } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
                keyParameter = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
            } else {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            }
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            keyParameter = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof SkeinParameterSpec) {
            keyParameter = new SkeinParameters.Builder(copyMap(((SkeinParameterSpec) algorithmParameterSpec).getParameters())).setKey(key.getEncoded()).build();
        } else if (algorithmParameterSpec == null) {
            keyParameter = new KeyParameter(key.getEncoded());
        } else {
            throw new InvalidAlgorithmParameterException("unknown parameter type.");
        }
        this.macEngine.init(keyParameter);
    }

    @Override // javax.crypto.MacSpi
    protected int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    protected void engineReset() {
        this.macEngine.reset();
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte b) {
        this.macEngine.update(b);
    }

    @Override // javax.crypto.MacSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.macEngine.update(bArr, i, i2);
    }

    @Override // javax.crypto.MacSpi
    protected byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }
}
