package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public interface MapFieldSchema {
    Map<?, ?> forMapData(Object mapField);

    MapEntryLite.Metadata<?, ?> forMapMetadata(Object mapDefaultEntry);

    Map<?, ?> forMutableMapData(Object mapField);

    int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry);

    boolean isImmutable(Object mapField);

    Object mergeFrom(Object destMapField, Object srcMapField);

    Object newMapField(Object mapDefaultEntry);

    Object toImmutable(Object mapField);
}
