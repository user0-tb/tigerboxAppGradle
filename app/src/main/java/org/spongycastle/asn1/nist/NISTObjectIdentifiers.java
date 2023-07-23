package org.spongycastle.asn1.nist;

import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomMasterTable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes4.dex */
public interface NISTObjectIdentifiers {
    public static final ASN1ObjectIdentifier aes;
    public static final ASN1ObjectIdentifier dsa_with_sha224;
    public static final ASN1ObjectIdentifier dsa_with_sha256;
    public static final ASN1ObjectIdentifier dsa_with_sha384;
    public static final ASN1ObjectIdentifier dsa_with_sha512;
    public static final ASN1ObjectIdentifier hashAlgs;
    public static final ASN1ObjectIdentifier id_aes128_CBC;
    public static final ASN1ObjectIdentifier id_aes128_CCM;
    public static final ASN1ObjectIdentifier id_aes128_CFB;
    public static final ASN1ObjectIdentifier id_aes128_ECB;
    public static final ASN1ObjectIdentifier id_aes128_GCM;
    public static final ASN1ObjectIdentifier id_aes128_OFB;
    public static final ASN1ObjectIdentifier id_aes128_wrap;
    public static final ASN1ObjectIdentifier id_aes192_CBC;
    public static final ASN1ObjectIdentifier id_aes192_CCM;
    public static final ASN1ObjectIdentifier id_aes192_CFB;
    public static final ASN1ObjectIdentifier id_aes192_ECB;
    public static final ASN1ObjectIdentifier id_aes192_GCM;
    public static final ASN1ObjectIdentifier id_aes192_OFB;
    public static final ASN1ObjectIdentifier id_aes192_wrap;
    public static final ASN1ObjectIdentifier id_aes256_CBC;
    public static final ASN1ObjectIdentifier id_aes256_CCM;
    public static final ASN1ObjectIdentifier id_aes256_CFB;
    public static final ASN1ObjectIdentifier id_aes256_ECB;
    public static final ASN1ObjectIdentifier id_aes256_GCM;
    public static final ASN1ObjectIdentifier id_aes256_OFB;
    public static final ASN1ObjectIdentifier id_aes256_wrap;
    public static final ASN1ObjectIdentifier id_dsa_with_sha2;
    public static final ASN1ObjectIdentifier id_sha224;
    public static final ASN1ObjectIdentifier id_sha256;
    public static final ASN1ObjectIdentifier id_sha384;
    public static final ASN1ObjectIdentifier id_sha512;
    public static final ASN1ObjectIdentifier id_sha512_224;
    public static final ASN1ObjectIdentifier id_sha512_256;
    public static final ASN1ObjectIdentifier nistAlgorithm;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.16.840.1.101.3.4");
        nistAlgorithm = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch(ExifInterface.GPS_MEASUREMENT_2D);
        hashAlgs = branch;
        id_sha256 = branch.branch(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        id_sha384 = branch.branch(ExifInterface.GPS_MEASUREMENT_2D);
        id_sha512 = branch.branch(ExifInterface.GPS_MEASUREMENT_3D);
        id_sha224 = branch.branch("4");
        id_sha512_224 = branch.branch("5");
        id_sha512_256 = branch.branch("6");
        ASN1ObjectIdentifier branch2 = aSN1ObjectIdentifier.branch(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        aes = branch2;
        id_aes128_ECB = branch2.branch(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        id_aes128_CBC = branch2.branch(ExifInterface.GPS_MEASUREMENT_2D);
        id_aes128_OFB = branch2.branch(ExifInterface.GPS_MEASUREMENT_3D);
        id_aes128_CFB = branch2.branch("4");
        id_aes128_wrap = branch2.branch("5");
        id_aes128_GCM = branch2.branch("6");
        id_aes128_CCM = branch2.branch("7");
        id_aes192_ECB = branch2.branch("21");
        id_aes192_CBC = branch2.branch("22");
        id_aes192_OFB = branch2.branch("23");
        id_aes192_CFB = branch2.branch("24");
        id_aes192_wrap = branch2.branch("25");
        id_aes192_GCM = branch2.branch("26");
        id_aes192_CCM = branch2.branch("27");
        id_aes256_ECB = branch2.branch("41");
        id_aes256_CBC = branch2.branch(RoomMasterTable.DEFAULT_ID);
        id_aes256_OFB = branch2.branch("43");
        id_aes256_CFB = branch2.branch("44");
        id_aes256_wrap = branch2.branch("45");
        id_aes256_GCM = branch2.branch("46");
        id_aes256_CCM = branch2.branch("47");
        ASN1ObjectIdentifier branch3 = aSN1ObjectIdentifier.branch(ExifInterface.GPS_MEASUREMENT_3D);
        id_dsa_with_sha2 = branch3;
        dsa_with_sha224 = branch3.branch(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        dsa_with_sha256 = branch3.branch(ExifInterface.GPS_MEASUREMENT_2D);
        dsa_with_sha384 = branch3.branch(ExifInterface.GPS_MEASUREMENT_3D);
        dsa_with_sha512 = branch3.branch("4");
    }
}
