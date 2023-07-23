package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class ExtensionSchemaLite extends ExtensionSchema<GeneratedMessageLite.ExtensionDescriptor> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public boolean hasExtensions(MessageLite prototype) {
        return prototype instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public FieldSet<GeneratedMessageLite.ExtensionDescriptor> getExtensions(Object message) {
        return ((GeneratedMessageLite.ExtendableMessage) message).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    void setExtensions(Object message, FieldSet<GeneratedMessageLite.ExtensionDescriptor> extensions) {
        ((GeneratedMessageLite.ExtendableMessage) message).extensions = extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public FieldSet<GeneratedMessageLite.ExtensionDescriptor> getMutableExtensions(Object message) {
        return ((GeneratedMessageLite.ExtendableMessage) message).ensureExtensionsAreMutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public void makeImmutable(Object message) {
        getExtensions(message).makeImmutable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public <UT, UB> UB parseExtension(Reader reader, Object extensionObject, ExtensionRegistryLite extensionRegistry, FieldSet<GeneratedMessageLite.ExtensionDescriptor> extensions, UB unknownFields, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException {
        Object field;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) extensionObject;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    reader.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    reader.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    reader.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    reader.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    reader.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    reader.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    reader.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    reader.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    reader.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    reader.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    reader.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    reader.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    reader.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    reader.readEnumList(arrayList);
                    unknownFields = (UB) SchemaUtil.filterUnknownEnumList(number, arrayList, generatedExtension.descriptor.getEnumType(), unknownFields, unknownFieldSchema);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            extensions.setField(generatedExtension.descriptor, arrayList);
        } else {
            Object obj = null;
            if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
                int readInt32 = reader.readInt32();
                if (generatedExtension.descriptor.getEnumType().findValueByNumber(readInt32) == null) {
                    return (UB) SchemaUtil.storeUnknownEnum(number, readInt32, unknownFields, unknownFieldSchema);
                }
                obj = Integer.valueOf(readInt32);
            } else {
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        obj = Double.valueOf(reader.readDouble());
                        break;
                    case 2:
                        obj = Float.valueOf(reader.readFloat());
                        break;
                    case 3:
                        obj = Long.valueOf(reader.readInt64());
                        break;
                    case 4:
                        obj = Long.valueOf(reader.readUInt64());
                        break;
                    case 5:
                        obj = Integer.valueOf(reader.readInt32());
                        break;
                    case 6:
                        obj = Long.valueOf(reader.readFixed64());
                        break;
                    case 7:
                        obj = Integer.valueOf(reader.readFixed32());
                        break;
                    case 8:
                        obj = Boolean.valueOf(reader.readBool());
                        break;
                    case 9:
                        obj = Integer.valueOf(reader.readUInt32());
                        break;
                    case 10:
                        obj = Integer.valueOf(reader.readSFixed32());
                        break;
                    case 11:
                        obj = Long.valueOf(reader.readSFixed64());
                        break;
                    case 12:
                        obj = Integer.valueOf(reader.readSInt32());
                        break;
                    case 13:
                        obj = Long.valueOf(reader.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj = reader.readBytes();
                        break;
                    case 16:
                        obj = reader.readString();
                        break;
                    case 17:
                        obj = reader.readGroup(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistry);
                        break;
                    case 18:
                        obj = reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistry);
                        break;
                }
            }
            if (generatedExtension.isRepeated()) {
                extensions.addRepeatedField(generatedExtension.descriptor, obj);
            } else {
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (field = extensions.getField(generatedExtension.descriptor)) != null) {
                    obj = Internal.mergeMessage(field, obj);
                }
                extensions.setField(generatedExtension.descriptor, obj);
            }
        }
        return unknownFields;
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ExtensionSchemaLite$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public int extensionNumber(Map.Entry<?, ?> extension) {
        return ((GeneratedMessageLite.ExtensionDescriptor) extension.getKey()).getNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public void serializeExtension(Writer writer, Map.Entry<?, ?> extension) throws IOException {
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (GeneratedMessageLite.ExtensionDescriptor) extension.getKey();
        if (extensionDescriptor.isRepeated()) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extensionDescriptor.getLiteType().ordinal()]) {
                case 1:
                    SchemaUtil.writeDoubleList(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 2:
                    SchemaUtil.writeFloatList(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 3:
                    SchemaUtil.writeInt64List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 4:
                    SchemaUtil.writeUInt64List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 5:
                    SchemaUtil.writeInt32List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 6:
                    SchemaUtil.writeFixed64List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 7:
                    SchemaUtil.writeFixed32List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 8:
                    SchemaUtil.writeBoolList(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 9:
                    SchemaUtil.writeUInt32List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 10:
                    SchemaUtil.writeSFixed32List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 11:
                    SchemaUtil.writeSFixed64List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 12:
                    SchemaUtil.writeSInt32List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 13:
                    SchemaUtil.writeSInt64List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 14:
                    SchemaUtil.writeInt32List(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, extensionDescriptor.isPacked());
                    return;
                case 15:
                    SchemaUtil.writeBytesList(extensionDescriptor.getNumber(), (List) extension.getValue(), writer);
                    return;
                case 16:
                    SchemaUtil.writeStringList(extensionDescriptor.getNumber(), (List) extension.getValue(), writer);
                    return;
                case 17:
                    List list = (List) extension.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    SchemaUtil.writeGroupList(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, Protobuf.getInstance().schemaFor((Class) list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) extension.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    SchemaUtil.writeMessageList(extensionDescriptor.getNumber(), (List) extension.getValue(), writer, Protobuf.getInstance().schemaFor((Class) list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[extensionDescriptor.getLiteType().ordinal()]) {
            case 1:
                writer.writeDouble(extensionDescriptor.getNumber(), ((Double) extension.getValue()).doubleValue());
                return;
            case 2:
                writer.writeFloat(extensionDescriptor.getNumber(), ((Float) extension.getValue()).floatValue());
                return;
            case 3:
                writer.writeInt64(extensionDescriptor.getNumber(), ((Long) extension.getValue()).longValue());
                return;
            case 4:
                writer.writeUInt64(extensionDescriptor.getNumber(), ((Long) extension.getValue()).longValue());
                return;
            case 5:
                writer.writeInt32(extensionDescriptor.getNumber(), ((Integer) extension.getValue()).intValue());
                return;
            case 6:
                writer.writeFixed64(extensionDescriptor.getNumber(), ((Long) extension.getValue()).longValue());
                return;
            case 7:
                writer.writeFixed32(extensionDescriptor.getNumber(), ((Integer) extension.getValue()).intValue());
                return;
            case 8:
                writer.writeBool(extensionDescriptor.getNumber(), ((Boolean) extension.getValue()).booleanValue());
                return;
            case 9:
                writer.writeUInt32(extensionDescriptor.getNumber(), ((Integer) extension.getValue()).intValue());
                return;
            case 10:
                writer.writeSFixed32(extensionDescriptor.getNumber(), ((Integer) extension.getValue()).intValue());
                return;
            case 11:
                writer.writeSFixed64(extensionDescriptor.getNumber(), ((Long) extension.getValue()).longValue());
                return;
            case 12:
                writer.writeSInt32(extensionDescriptor.getNumber(), ((Integer) extension.getValue()).intValue());
                return;
            case 13:
                writer.writeSInt64(extensionDescriptor.getNumber(), ((Long) extension.getValue()).longValue());
                return;
            case 14:
                writer.writeInt32(extensionDescriptor.getNumber(), ((Integer) extension.getValue()).intValue());
                return;
            case 15:
                writer.writeBytes(extensionDescriptor.getNumber(), (ByteString) extension.getValue());
                return;
            case 16:
                writer.writeString(extensionDescriptor.getNumber(), (String) extension.getValue());
                return;
            case 17:
                writer.writeGroup(extensionDescriptor.getNumber(), extension.getValue(), Protobuf.getInstance().schemaFor((Class) extension.getValue().getClass()));
                return;
            case 18:
                writer.writeMessage(extensionDescriptor.getNumber(), extension.getValue(), Protobuf.getInstance().schemaFor((Class) extension.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistry, MessageLite defaultInstance, int number) {
        return extensionRegistry.findLiteExtensionByNumber(defaultInstance, number);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public void parseLengthPrefixedMessageSetItem(Reader reader, Object extensionObject, ExtensionRegistryLite extensionRegistry, FieldSet<GeneratedMessageLite.ExtensionDescriptor> extensions) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) extensionObject;
        extensions.setField(generatedExtension.descriptor, reader.readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistry));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.ExtensionSchema
    public void parseMessageSetItem(ByteString data, Object extensionObject, ExtensionRegistryLite extensionRegistry, FieldSet<GeneratedMessageLite.ExtensionDescriptor> extensions) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) extensionObject;
        MessageLite buildPartial = generatedExtension.getMessageDefaultInstance().newBuilderForType().buildPartial();
        BinaryReader newInstance = BinaryReader.newInstance(ByteBuffer.wrap(data.toByteArray()), true);
        Protobuf.getInstance().mergeFrom(buildPartial, newInstance, extensionRegistry);
        extensions.setField(generatedExtension.descriptor, buildPartial);
        if (newInstance.getFieldNumber() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }
}
