package org.spongycastle.openssl.jcajce;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.openssl.EncryptionException;
import org.spongycastle.openssl.PEMException;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
class PEMUtilities {
    private static final Map KEYSIZES;
    private static final Set PKCS5_SCHEME_1;
    private static final Set PKCS5_SCHEME_2;

    PEMUtilities() {
    }

    static {
        HashMap hashMap = new HashMap();
        KEYSIZES = hashMap;
        HashSet hashSet = new HashSet();
        PKCS5_SCHEME_1 = hashSet;
        HashSet hashSet2 = new HashSet();
        PKCS5_SCHEME_2 = hashSet2;
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
        hashSet2.add(PKCSObjectIdentifiers.id_PBES2);
        hashSet2.add(PKCSObjectIdentifiers.des_EDE3_CBC);
        hashSet2.add(NISTObjectIdentifiers.id_aes128_CBC);
        hashSet2.add(NISTObjectIdentifiers.id_aes192_CBC);
        hashSet2.add(NISTObjectIdentifiers.id_aes256_CBC);
        hashMap.put(PKCSObjectIdentifiers.des_EDE3_CBC.getId(), Integers.valueOf(192));
        hashMap.put(NISTObjectIdentifiers.id_aes128_CBC.getId(), Integers.valueOf(128));
        hashMap.put(NISTObjectIdentifiers.id_aes192_CBC.getId(), Integers.valueOf(192));
        hashMap.put(NISTObjectIdentifiers.id_aes256_CBC.getId(), Integers.valueOf(256));
    }

    static int getKeySize(String str) {
        Map map = KEYSIZES;
        if (!map.containsKey(str)) {
            throw new IllegalStateException("no key size for algorithm: " + str);
        }
        return ((Integer) map.get(str)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isPKCS5Scheme1(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCS5_SCHEME_1.contains(aSN1ObjectIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isPKCS5Scheme2(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCS5_SCHEME_2.contains(aSN1ObjectIdentifier);
    }

    public static boolean isPKCS12(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.getId().startsWith(PKCSObjectIdentifiers.pkcs_12PbeIds.getId());
    }

    public static SecretKey generateSecretKeyForPKCS5Scheme2(String str, char[] cArr, byte[] bArr, int i) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator();
        pKCS5S2ParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, i);
        return new SecretKeySpec(((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(getKeySize(str))).getKey(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] crypt(boolean z, JcaJceHelper jcaJceHelper, byte[] bArr, char[] cArr, String str, byte[] bArr2) throws PEMException {
        String str2;
        String str3;
        SecretKey key;
        RC2ParameterSpec rC2ParameterSpec;
        RC2ParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        String str4 = "NoPadding";
        if (str.endsWith("-CFB")) {
            str2 = "CFB";
            str3 = "NoPadding";
        } else {
            str2 = "CBC";
            str3 = "PKCS5Padding";
        }
        if (str.endsWith("-ECB") || "DES-EDE".equals(str) || "DES-EDE3".equals(str)) {
            ivParameterSpec = null;
            str2 = "ECB";
        }
        if (str.endsWith("-OFB")) {
            str2 = "OFB";
        } else {
            str4 = str3;
        }
        String str5 = "AES";
        int i = 1;
        if (str.startsWith("DES-EDE")) {
            str5 = "DESede";
            key = getKey(cArr, "DESede", 24, bArr2, !str.startsWith("DES-EDE3"));
        } else if (str.startsWith("DES-")) {
            str5 = "DES";
            key = getKey(cArr, "DES", 8, bArr2);
        } else if (str.startsWith("BF-")) {
            str5 = "Blowfish";
            key = getKey(cArr, "Blowfish", 16, bArr2);
        } else {
            int i2 = 128;
            if (str.startsWith("RC2-")) {
                str5 = "RC2";
                if (str.startsWith("RC2-40-")) {
                    i2 = 40;
                } else if (str.startsWith("RC2-64-")) {
                    i2 = 64;
                }
                key = getKey(cArr, "RC2", i2 / 8, bArr2);
                if (ivParameterSpec == null) {
                    rC2ParameterSpec = new RC2ParameterSpec(i2);
                } else {
                    rC2ParameterSpec = new RC2ParameterSpec(i2, bArr2);
                }
                ivParameterSpec = rC2ParameterSpec;
            } else if (str.startsWith("AES-")) {
                if (bArr2.length > 8) {
                    byte[] bArr3 = new byte[8];
                    System.arraycopy(bArr2, 0, bArr3, 0, 8);
                    bArr2 = bArr3;
                }
                if (!str.startsWith("AES-128-")) {
                    if (str.startsWith("AES-192-")) {
                        i2 = 192;
                    } else if (!str.startsWith("AES-256-")) {
                        throw new EncryptionException("unknown AES encryption with private key");
                    } else {
                        i2 = 256;
                    }
                }
                key = getKey(cArr, "AES", i2 / 8, bArr2);
            } else {
                throw new EncryptionException("unknown encryption with private key");
            }
        }
        try {
            Cipher createCipher = jcaJceHelper.createCipher(str5 + DownloadsManager.FOLDERS_SEPARATOR + str2 + DownloadsManager.FOLDERS_SEPARATOR + str4);
            if (!z) {
                i = 2;
            }
            if (ivParameterSpec == null) {
                createCipher.init(i, key);
            } else {
                createCipher.init(i, key, ivParameterSpec);
            }
            return createCipher.doFinal(bArr);
        } catch (Exception e) {
            throw new EncryptionException("exception using cipher - please check password and data.", e);
        }
    }

    private static SecretKey getKey(char[] cArr, String str, int i, byte[] bArr) {
        return getKey(cArr, str, i, bArr, false);
    }

    private static SecretKey getKey(char[] cArr, String str, int i, byte[] bArr, boolean z) {
        OpenSSLPBEParametersGenerator openSSLPBEParametersGenerator = new OpenSSLPBEParametersGenerator();
        openSSLPBEParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr);
        byte[] key = ((KeyParameter) openSSLPBEParametersGenerator.generateDerivedParameters(i * 8)).getKey();
        if (z && key.length >= 24) {
            System.arraycopy(key, 0, key, 16, 8);
        }
        return new SecretKeySpec(key, str);
    }
}
