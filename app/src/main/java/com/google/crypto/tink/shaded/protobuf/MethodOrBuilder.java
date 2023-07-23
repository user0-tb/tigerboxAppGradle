package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public interface MethodOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    Option getOptions(int index);

    int getOptionsCount();

    List<Option> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    ByteString getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    ByteString getResponseTypeUrlBytes();

    Syntax getSyntax();

    int getSyntaxValue();
}
