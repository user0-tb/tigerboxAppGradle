package org.spongycastle.util;

import java.util.Collection;

/* loaded from: classes4.dex */
public interface StreamParser {
    Object read() throws StreamParsingException;

    Collection readAll() throws StreamParsingException;
}
