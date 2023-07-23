package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.util.Bytes;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class ParametersParser<SerializationT extends Serialization> {
    private final Bytes objectIdentifier;
    private final Class<SerializationT> serializationClass;

    /* loaded from: classes3.dex */
    public interface ParametersParsingFunction<SerializationT extends Serialization> {
        Parameters parseParameters(SerializationT serialization) throws GeneralSecurityException;
    }

    public abstract Parameters parseParameters(SerializationT serialization) throws GeneralSecurityException;

    private ParametersParser(Bytes objectIdentifier, Class<SerializationT> serializationClass) {
        this.objectIdentifier = objectIdentifier;
        this.serializationClass = serializationClass;
    }

    public final Bytes getObjectIdentifier() {
        return this.objectIdentifier;
    }

    public final Class<SerializationT> getSerializationClass() {
        return this.serializationClass;
    }

    public static <SerializationT extends Serialization> ParametersParser<SerializationT> create(final ParametersParsingFunction<SerializationT> function, Bytes objectIdentifier, Class<SerializationT> serializationClass) {
        return (ParametersParser<SerializationT>) new ParametersParser<SerializationT>(objectIdentifier, serializationClass) { // from class: com.google.crypto.tink.internal.ParametersParser.1
            @Override // com.google.crypto.tink.internal.ParametersParser
            public Parameters parseParameters(SerializationT serialization) throws GeneralSecurityException {
                return function.parseParameters(serialization);
            }
        };
    }
}
