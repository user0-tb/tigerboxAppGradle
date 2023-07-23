package com.google.crypto.tink.internal;

import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.Serialization;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class ParametersSerializer<ParametersT extends Parameters, SerializationT extends Serialization> {
    private final Class<ParametersT> parametersClass;
    private final Class<SerializationT> serializationClass;

    /* loaded from: classes3.dex */
    public interface ParametersSerializationFunction<ParametersT extends Parameters, SerializationT extends Serialization> {
        SerializationT serializeParameters(ParametersT key) throws GeneralSecurityException;
    }

    public abstract SerializationT serializeParameters(ParametersT parameters) throws GeneralSecurityException;

    private ParametersSerializer(Class<ParametersT> parametersClass, Class<SerializationT> serializationClass) {
        this.parametersClass = parametersClass;
        this.serializationClass = serializationClass;
    }

    public Class<ParametersT> getParametersClass() {
        return this.parametersClass;
    }

    public Class<SerializationT> getSerializationClass() {
        return this.serializationClass;
    }

    public static <ParametersT extends Parameters, SerializationT extends Serialization> ParametersSerializer<ParametersT, SerializationT> create(final ParametersSerializationFunction<ParametersT, SerializationT> function, Class<ParametersT> parametersClass, Class<SerializationT> serializationClass) {
        return (ParametersSerializer<ParametersT, SerializationT>) new ParametersSerializer<ParametersT, SerializationT>(parametersClass, serializationClass) { // from class: com.google.crypto.tink.internal.ParametersSerializer.1
            @Override // com.google.crypto.tink.internal.ParametersSerializer
            public SerializationT serializeParameters(ParametersT parameters) throws GeneralSecurityException {
                return (SerializationT) function.serializeParameters(parameters);
            }
        };
    }
}
