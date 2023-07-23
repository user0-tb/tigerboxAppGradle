package com.google.crypto.tink;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.internal.KeyTypeManager;
import com.google.crypto.tink.internal.PrivateKeyTypeManager;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;

/* loaded from: classes3.dex */
public final class Registry {
    private static final Logger logger = Logger.getLogger(Registry.class.getName());
    private static final AtomicReference<KeyManagerRegistry> keyManagerRegistry = new AtomicReference<>(new KeyManagerRegistry());
    private static final ConcurrentMap<String, KeyDeriverContainer> keyDeriverMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> newKeyAllowedMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Catalogue<?>> catalogueMap = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, PrimitiveWrapper<?, ?>> primitiveWrapperMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, KeyTemplate> keyTemplateMap = new ConcurrentHashMap();

    /* loaded from: classes3.dex */
    private interface KeyDeriverContainer {
        KeyData deriveKey(ByteString serializedKeyFormat, InputStream stream) throws GeneralSecurityException;
    }

    private static <KeyProtoT extends MessageLite> KeyDeriverContainer createDeriverFor(final KeyTypeManager<KeyProtoT> keyManager) {
        return new KeyDeriverContainer() { // from class: com.google.crypto.tink.Registry.1
            /* JADX WARN: Unknown type variable: KeyProtoT in type: com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT> */
            private <KeyFormatProtoT extends MessageLite> MessageLite deriveKeyWithFactory(ByteString serializedKeyFormat, InputStream stream, KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory) throws GeneralSecurityException {
                try {
                    KeyFormatProtoT parseKeyFormat = keyFactory.parseKeyFormat(serializedKeyFormat);
                    keyFactory.validateKeyFormat(parseKeyFormat);
                    return keyFactory.deriveKey(parseKeyFormat, stream);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("parsing key format failed in deriveKey", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyDeriverContainer
            public KeyData deriveKey(ByteString serializedKeyFormat, InputStream stream) throws GeneralSecurityException {
                return KeyData.newBuilder().setTypeUrl(KeyTypeManager.this.getKeyType()).setValue(deriveKeyWithFactory(serializedKeyFormat, stream, KeyTypeManager.this.keyFactory()).toByteString()).setKeyMaterialType(KeyTypeManager.this.keyMaterialType()).build();
            }
        };
    }

    static synchronized void reset() {
        synchronized (Registry.class) {
            keyManagerRegistry.set(new KeyManagerRegistry());
            keyDeriverMap.clear();
            newKeyAllowedMap.clear();
            catalogueMap.clear();
            primitiveWrapperMap.clear();
            keyTemplateMap.clear();
        }
    }

    @Deprecated
    public static synchronized void addCatalogue(String catalogueName, Catalogue<?> catalogue) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (catalogueName == null) {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            }
            if (catalogue == null) {
                throw new IllegalArgumentException("catalogue must be non-null.");
            }
            ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
            if (concurrentMap.containsKey(catalogueName.toLowerCase(Locale.US)) && !catalogue.getClass().getName().equals(concurrentMap.get(catalogueName.toLowerCase(Locale.US)).getClass().getName())) {
                Logger logger2 = logger;
                logger2.warning("Attempted overwrite of a catalogueName catalogue for name " + catalogueName);
                throw new GeneralSecurityException("catalogue for name " + catalogueName + " has been already registered");
            }
            concurrentMap.put(catalogueName.toLowerCase(Locale.US), catalogue);
        }
    }

    @Deprecated
    public static Catalogue<?> getCatalogue(String catalogueName) throws GeneralSecurityException {
        if (catalogueName == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        Catalogue<?> catalogue = catalogueMap.get(catalogueName.toLowerCase(Locale.US));
        if (catalogue == null) {
            String format = String.format("no catalogue found for %s. ", catalogueName);
            if (catalogueName.toLowerCase(Locale.US).startsWith("tinkaead")) {
                format = format + "Maybe call AeadConfig.register().";
            }
            if (catalogueName.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                format = format + "Maybe call DeterministicAeadConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                format = format + "Maybe call StreamingAeadConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || catalogueName.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                format = format + "Maybe call HybridConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkmac")) {
                format = format + "Maybe call MacConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || catalogueName.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                format = format + "Maybe call SignatureConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tink")) {
                format = format + "Maybe call TinkConfig.register().";
            }
            throw new GeneralSecurityException(format);
        }
        return catalogue;
    }

    public static synchronized <P> void registerKeyManager(final KeyManager<P> manager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager((KeyManager) manager, true);
        }
    }

    public static synchronized <P> void registerKeyManager(final KeyManager<P> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            try {
                if (manager == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
                KeyManagerRegistry keyManagerRegistry2 = new KeyManagerRegistry(atomicReference.get());
                keyManagerRegistry2.registerKeyManager(manager);
                if (!TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                String keyType = manager.getKeyType();
                ensureKeyManagerInsertable(keyType, Collections.emptyMap(), newKeyAllowed);
                newKeyAllowedMap.put(keyType, Boolean.valueOf(newKeyAllowed));
                atomicReference.set(keyManagerRegistry2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized <KeyProtoT extends MessageLite> void registerKeyManager(final KeyTypeManager<KeyProtoT> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (manager == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
            KeyManagerRegistry keyManagerRegistry2 = new KeyManagerRegistry(atomicReference.get());
            keyManagerRegistry2.registerKeyManager(manager);
            String keyType = manager.getKeyType();
            ensureKeyManagerInsertable(keyType, newKeyAllowed ? manager.keyFactory().keyFormats() : Collections.emptyMap(), newKeyAllowed);
            if (!atomicReference.get().typeUrlExists(keyType)) {
                keyDeriverMap.put(keyType, createDeriverFor(manager));
                if (newKeyAllowed) {
                    registerKeyTemplates(keyType, manager.keyFactory().keyFormats());
                }
            }
            newKeyAllowedMap.put(keyType, Boolean.valueOf(newKeyAllowed));
            atomicReference.set(keyManagerRegistry2);
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String typeUrl, final KeyManager<P> manager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager(typeUrl, manager, true);
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String typeUrl, final KeyManager<P> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            try {
                if (manager == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                if (!typeUrl.equals(manager.getKeyType())) {
                    throw new GeneralSecurityException("Manager does not support key type " + typeUrl + DownloadsManager.EXTENSION_SEPARATOR);
                }
                registerKeyManager(manager, newKeyAllowed);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (com.google.crypto.tink.Registry.keyManagerRegistry.get().typeUrlExists(r3) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r4.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        r5 = r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (com.google.crypto.tink.Registry.keyTemplateMap.containsKey(r5.getKey()) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + r5.getKey() + " from an existing key manager of type " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
        if (r3.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
        r4 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.crypto.tink.Registry.keyTemplateMap.containsKey(r4.getKey()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + r4.getKey());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized <KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> void ensureKeyManagerInsertable(java.lang.String r3, java.util.Map<java.lang.String, com.google.crypto.tink.internal.KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> r4, boolean r5) throws java.security.GeneralSecurityException {
        /*
            java.lang.Class<com.google.crypto.tink.Registry> r0 = com.google.crypto.tink.Registry.class
            monitor-enter(r0)
            if (r5 == 0) goto L34
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = com.google.crypto.tink.Registry.newKeyAllowedMap     // Catch: java.lang.Throwable -> L31
            boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L34
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1a
            goto L34
        L1a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "New keys are already disallowed for key type "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            r5.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L31:
            r3 = move-exception
            goto Lc8
        L34:
            if (r5 == 0) goto Lca
            java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.KeyManagerRegistry> r5 = com.google.crypto.tink.Registry.keyManagerRegistry     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L31
            com.google.crypto.tink.KeyManagerRegistry r5 = (com.google.crypto.tink.KeyManagerRegistry) r5     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.typeUrlExists(r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L8a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L4c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r1 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L65
            goto L4c
        L65:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Attempted to register a new key template "
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L31
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = " from an existing key manager of type "
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L8a:
            java.util.Set r3 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L92:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap<java.lang.String, com.google.crypto.tink.KeyTemplate> r5 = com.google.crypto.tink.Registry.keyTemplateMap     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto Lab
            goto L92
        Lab:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "Attempted overwrite of a registered key template "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            r5.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        Lc8:
            monitor-exit(r0)
            throw r3
        Lca:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.Registry.ensureKeyManagerInsertable(java.lang.String, java.util.Map, boolean):void");
    }

    public static synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> publicKeyTypeManager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (privateKeyTypeManager == null || publicKeyTypeManager == null) {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
            AtomicReference<KeyManagerRegistry> atomicReference = keyManagerRegistry;
            KeyManagerRegistry keyManagerRegistry2 = new KeyManagerRegistry(atomicReference.get());
            keyManagerRegistry2.registerAsymmetricKeyManagers(privateKeyTypeManager, publicKeyTypeManager);
            String keyType = privateKeyTypeManager.getKeyType();
            String keyType2 = publicKeyTypeManager.getKeyType();
            ensureKeyManagerInsertable(keyType, newKeyAllowed ? privateKeyTypeManager.keyFactory().keyFormats() : Collections.emptyMap(), newKeyAllowed);
            ensureKeyManagerInsertable(keyType2, Collections.emptyMap(), false);
            if (!atomicReference.get().typeUrlExists(keyType)) {
                keyDeriverMap.put(keyType, createDeriverFor(privateKeyTypeManager));
                if (newKeyAllowed) {
                    registerKeyTemplates(privateKeyTypeManager.getKeyType(), privateKeyTypeManager.keyFactory().keyFormats());
                }
            }
            ConcurrentMap<String, Boolean> concurrentMap = newKeyAllowedMap;
            concurrentMap.put(keyType, Boolean.valueOf(newKeyAllowed));
            concurrentMap.put(keyType2, false);
            atomicReference.set(keyManagerRegistry2);
        }
    }

    private static <KeyFormatProtoT extends MessageLite> void registerKeyTemplates(String typeUrl, Map<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> keyFormats) {
        for (Map.Entry<String, KeyTypeManager.KeyFactory.KeyFormat<KeyFormatProtoT>> entry : keyFormats.entrySet()) {
            keyTemplateMap.put(entry.getKey(), KeyTemplate.create(typeUrl, entry.getValue().keyFormat.toByteArray(), entry.getValue().outputPrefixType));
        }
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(final PrimitiveWrapper<B, P> wrapper) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (wrapper == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> primitiveClass = wrapper.getPrimitiveClass();
            ConcurrentMap<Class<?>, PrimitiveWrapper<?, ?>> concurrentMap = primitiveWrapperMap;
            if (concurrentMap.containsKey(primitiveClass)) {
                PrimitiveWrapper<?, ?> primitiveWrapper = concurrentMap.get(primitiveClass);
                if (!wrapper.getClass().getName().equals(primitiveWrapper.getClass().getName())) {
                    Logger logger2 = logger;
                    logger2.warning("Attempted overwrite of a registered PrimitiveWrapper for type " + primitiveClass);
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", primitiveClass.getName(), primitiveWrapper.getClass().getName(), wrapper.getClass().getName()));
                }
            }
            concurrentMap.put(primitiveClass, wrapper);
        }
    }

    @Deprecated
    public static <P> KeyManager<P> getKeyManager(String typeUrl) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(typeUrl);
    }

    public static <P> KeyManager<P> getKeyManager(String typeUrl, Class<P> primitiveClass) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(typeUrl, primitiveClass);
    }

    public static KeyManager<?> getUntypedKeyManager(String typeUrl) throws GeneralSecurityException {
        return keyManagerRegistry.get().getUntypedKeyManager(typeUrl);
    }

    public static synchronized KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKeyData = untypedKeyManager.newKeyData(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKeyData;
    }

    public static synchronized KeyData newKeyData(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            newKeyData = newKeyData(keyTemplate.getProto());
        }
        return newKeyData;
    }

    public static synchronized MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKey = untypedKeyManager.newKey(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKey;
    }

    public static synchronized MessageLite newKey(String typeUrl, MessageLite format) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager keyManager = getKeyManager(typeUrl);
            if (newKeyAllowedMap.get(typeUrl).booleanValue()) {
                newKey = keyManager.newKey(format);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + typeUrl);
            }
        }
        return newKey;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, InputStream randomStream) throws GeneralSecurityException {
        KeyData deriveKey;
        synchronized (Registry.class) {
            String typeUrl = keyTemplate.getTypeUrl();
            ConcurrentMap<String, KeyDeriverContainer> concurrentMap = keyDeriverMap;
            if (!concurrentMap.containsKey(typeUrl)) {
                throw new GeneralSecurityException("No keymanager registered or key manager cannot derive keys for " + typeUrl);
            }
            deriveKey = concurrentMap.get(typeUrl).deriveKey(keyTemplate.getValue(), randomStream);
        }
        return deriveKey;
    }

    public static KeyData getPublicKeyData(String typeUrl, ByteString serializedPrivateKey) throws GeneralSecurityException {
        KeyManager keyManager = getKeyManager(typeUrl);
        if (!(keyManager instanceof PrivateKeyManager)) {
            throw new GeneralSecurityException("manager for key type " + typeUrl + " is not a PrivateKeyManager");
        }
        return ((PrivateKeyManager) keyManager).getPublicKeyData(serializedPrivateKey);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, MessageLite key) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(typeUrl).getPrimitive(key);
    }

    public static <P> P getPrimitive(String typeUrl, MessageLite key, Class<P> primitiveClass) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(typeUrl, primitiveClass).getPrimitive(key);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, ByteString serializedKey) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(typeUrl).getPrimitive(serializedKey);
    }

    public static <P> P getPrimitive(String typeUrl, ByteString serializedKey, Class<P> primitiveClass) throws GeneralSecurityException {
        return keyManagerRegistry.get().getKeyManager(typeUrl, primitiveClass).getPrimitive(serializedKey);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, byte[] serializedKey) throws GeneralSecurityException {
        return (P) getPrimitive(typeUrl, ByteString.copyFrom(serializedKey));
    }

    public static <P> P getPrimitive(String typeUrl, byte[] serializedKey, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getPrimitive(typeUrl, ByteString.copyFrom(serializedKey), primitiveClass);
    }

    @Deprecated
    public static <P> P getPrimitive(KeyData keyData) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue());
    }

    public static <P> P getPrimitive(KeyData keyData, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), primitiveClass);
    }

    public static <B, P> P wrap(PrimitiveSet<B> primitiveSet, Class<P> clazz) throws GeneralSecurityException {
        PrimitiveWrapper<?, ?> primitiveWrapper = primitiveWrapperMap.get(clazz);
        if (primitiveWrapper == null) {
            throw new GeneralSecurityException("No wrapper found for " + primitiveSet.getPrimitiveClass().getName());
        } else if (!primitiveWrapper.getInputPrimitiveClass().equals(primitiveSet.getPrimitiveClass())) {
            throw new GeneralSecurityException("Wrong input primitive class, expected " + primitiveWrapper.getInputPrimitiveClass() + ", got " + primitiveSet.getPrimitiveClass());
        } else {
            return (P) primitiveWrapper.wrap(primitiveSet);
        }
    }

    public static <P> P wrap(PrimitiveSet<P> primitiveSet) throws GeneralSecurityException {
        return (P) wrap(primitiveSet, primitiveSet.getPrimitiveClass());
    }

    public static synchronized List<String> keyTemplates() {
        List<String> unmodifiableList;
        synchronized (Registry.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(keyTemplateMap.keySet());
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized Map<String, KeyTemplate> keyTemplateMap() {
        Map<String, KeyTemplate> unmodifiableMap;
        synchronized (Registry.class) {
            unmodifiableMap = Collections.unmodifiableMap(keyTemplateMap);
        }
        return unmodifiableMap;
    }

    @Nullable
    public static Class<?> getInputPrimitive(Class<?> wrappedPrimitive) {
        PrimitiveWrapper<?, ?> primitiveWrapper = primitiveWrapperMap.get(wrappedPrimitive);
        if (primitiveWrapper == null) {
            return null;
        }
        return primitiveWrapper.getInputPrimitiveClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageLite parseKeyData(KeyData keyData) throws GeneralSecurityException, InvalidProtocolBufferException {
        return keyManagerRegistry.get().parseKeyData(keyData);
    }

    public static synchronized void restrictToFipsIfEmpty() throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (keyManagerRegistry.get().isEmpty()) {
                TinkFipsUtil.setFipsRestricted();
            } else {
                throw new GeneralSecurityException("Could not enable FIPS mode as Registry is not empty.");
            }
        }
    }

    private Registry() {
    }
}
