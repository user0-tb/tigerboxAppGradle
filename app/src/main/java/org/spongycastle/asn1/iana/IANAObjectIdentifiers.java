package org.spongycastle.asn1.iana;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes4.dex */
public interface IANAObjectIdentifiers {
    public static final ASN1ObjectIdentifier SNMPv2;
    public static final ASN1ObjectIdentifier _private;
    public static final ASN1ObjectIdentifier directory;
    public static final ASN1ObjectIdentifier experimental;
    public static final ASN1ObjectIdentifier hmacMD5;
    public static final ASN1ObjectIdentifier hmacRIPEMD160;
    public static final ASN1ObjectIdentifier hmacSHA1;
    public static final ASN1ObjectIdentifier hmacTIGER;
    public static final ASN1ObjectIdentifier internet;
    public static final ASN1ObjectIdentifier ipsec;
    public static final ASN1ObjectIdentifier isakmpOakley;
    public static final ASN1ObjectIdentifier mail;
    public static final ASN1ObjectIdentifier mgmt;
    public static final ASN1ObjectIdentifier pkix;
    public static final ASN1ObjectIdentifier security;
    public static final ASN1ObjectIdentifier security_mechanisms;
    public static final ASN1ObjectIdentifier security_nametypes;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1");
        internet = aSN1ObjectIdentifier;
        directory = aSN1ObjectIdentifier.branch(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        mgmt = aSN1ObjectIdentifier.branch(ExifInterface.GPS_MEASUREMENT_2D);
        experimental = aSN1ObjectIdentifier.branch(ExifInterface.GPS_MEASUREMENT_3D);
        _private = aSN1ObjectIdentifier.branch("4");
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch("5");
        security = branch;
        SNMPv2 = aSN1ObjectIdentifier.branch("6");
        mail = aSN1ObjectIdentifier.branch("7");
        ASN1ObjectIdentifier branch2 = branch.branch("5");
        security_mechanisms = branch2;
        security_nametypes = branch.branch("6");
        pkix = branch2.branch("6");
        ASN1ObjectIdentifier branch3 = branch2.branch("8");
        ipsec = branch3;
        ASN1ObjectIdentifier branch4 = branch3.branch(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        isakmpOakley = branch4;
        hmacMD5 = branch4.branch(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        hmacSHA1 = branch4.branch(ExifInterface.GPS_MEASUREMENT_2D);
        hmacTIGER = branch4.branch(ExifInterface.GPS_MEASUREMENT_3D);
        hmacRIPEMD160 = branch4.branch("4");
    }
}
