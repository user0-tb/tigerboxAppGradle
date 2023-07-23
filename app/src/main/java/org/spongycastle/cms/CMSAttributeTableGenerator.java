package org.spongycastle.cms;

import java.util.Map;
import org.spongycastle.asn1.cms.AttributeTable;

/* loaded from: classes4.dex */
public interface CMSAttributeTableGenerator {
    public static final String CONTENT_TYPE = "contentType";
    public static final String DIGEST = "digest";
    public static final String DIGEST_ALGORITHM_IDENTIFIER = "digestAlgID";
    public static final String SIGNATURE = "encryptedDigest";

    AttributeTable getAttributes(Map map) throws CMSAttributeTableGenerationException;
}
