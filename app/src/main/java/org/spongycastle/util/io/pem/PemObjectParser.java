package org.spongycastle.util.io.pem;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface PemObjectParser {
    Object parseObject(PemObject pemObject) throws IOException;
}
