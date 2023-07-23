package media.tiger.tigerbox.infrastructure.properties;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import media.tiger.tigerbox.R;
import timber.log.Timber;

/* compiled from: ConfigurationProperties.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bJ\b\u0010\u0017\u001a\u00020\u000fH\u0002J\u0014\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J \u0010\u0019\u001a\u00020\u000b*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties;", "", "context", "Landroid/content/Context;", "configurationEnvironment", "Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties$ConfigurationEnvironment;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/Context;Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties$ConfigurationEnvironment;Landroid/content/SharedPreferences;)V", "_volatileProperties", "", "", "propertiesFile", "Ljava/util/Properties;", "clearVolatileProperties", "", "getProperty", "propertyKey", "defaultValue", "removeVolatileProperty", "key", "setVolatileProperty", "value", "updateVolatileProperties", "volatileProperties", "fetchProperty", "Companion", "ConfigurationEnvironment", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigurationProperties {
    public static final Companion Companion = new Companion(null);
    private static final String DEBUG_TOOLS = "adb.tools.enabled";
    private static final String VOLATILE_CONFIG_PROPERTIES = "VOLATILE_CONFIG_PROPERTIES";
    private Map<String, String> _volatileProperties;
    private final Properties propertiesFile;
    private final SharedPreferences sharedPreferences;

    public ConfigurationProperties(Context context, ConfigurationEnvironment configurationEnvironment, SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationEnvironment, "configurationEnvironment");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
        InputStream openRawResource = context.getResources().openRawResource(configurationEnvironment.getConfigFileReference());
        Intrinsics.checkNotNullExpressionValue(openRawResource, "context.resources.openRa…ment.configFileReference)");
        Properties properties = new Properties();
        properties.load(openRawResource);
        this.propertiesFile = properties;
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass2(null), 3, null);
    }

    /* compiled from: ConfigurationProperties.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties$ConfigurationEnvironment;", "", "configFileReference", "", "(Ljava/lang/String;II)V", "getConfigFileReference", "()I", "STAGING", "DEBUG", "PRODUCTION", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public enum ConfigurationEnvironment {
        STAGING(R.raw.staging),
        DEBUG(R.raw.debug),
        PRODUCTION(R.raw.production);
        
        private final int configFileReference;

        ConfigurationEnvironment(int i) {
            this.configFileReference = i;
        }

        public final int getConfigFileReference() {
            return this.configFileReference;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> volatileProperties() {
        LinkedHashMap linkedHashMap;
        if (this._volatileProperties == null) {
            String string = this.sharedPreferences.getString(VOLATILE_CONFIG_PROPERTIES, "");
            if (string != null) {
                if (string.length() > 0) {
                    try {
                        linkedHashMap = (Map) new Gson().fromJson(string, new TypeToken<Map<String, String>>() { // from class: media.tiger.tigerbox.infrastructure.properties.ConfigurationProperties$volatileProperties$statesType$1
                        }.getType());
                    } catch (Exception e) {
                        Timber.Forest forest = Timber.Forest;
                        forest.e("ConfigurationEnvironment: Exception reading local states " + e, new Object[0]);
                        linkedHashMap = new LinkedHashMap();
                    }
                    this._volatileProperties = linkedHashMap;
                }
            }
            linkedHashMap = new LinkedHashMap();
            this._volatileProperties = linkedHashMap;
        }
        Map<String, String> map = this._volatileProperties;
        Intrinsics.checkNotNull(map);
        return map;
    }

    private final void updateVolatileProperties() {
        BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new ConfigurationProperties$updateVolatileProperties$1(this, null), 3, null);
    }

    /* compiled from: ConfigurationProperties.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @DebugMetadata(c = "media.tiger.tigerbox.infrastructure.properties.ConfigurationProperties$2", f = "ConfigurationProperties.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: media.tiger.tigerbox.infrastructure.properties.ConfigurationProperties$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ConfigurationProperties.this.volatileProperties();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final String getProperty(String propertyKey) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(propertyKey, "propertyKey");
        return fetchProperty$default(this, this.propertiesFile, propertyKey, null, 2, null);
    }

    public final String getProperty(String propertyKey, String defaultValue) {
        Intrinsics.checkNotNullParameter(propertyKey, "propertyKey");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return fetchProperty(this.propertiesFile, propertyKey, defaultValue);
    }

    public final void clearVolatileProperties() {
        volatileProperties().clear();
        updateVolatileProperties();
    }

    public final void removeVolatileProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (volatileProperties().containsKey(key)) {
            volatileProperties().remove(key);
        }
    }

    public final void setVolatileProperty(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        removeVolatileProperty(key);
        volatileProperties().put(key, value);
        updateVolatileProperties();
    }

    static /* synthetic */ String fetchProperty$default(ConfigurationProperties configurationProperties, Properties properties, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return configurationProperties.fetchProperty(properties, str, str2);
    }

    private final String fetchProperty(Properties properties, String str, String str2) {
        String property = properties.getProperty(DEBUG_TOOLS);
        if (volatileProperties().containsKey(str)) {
            boolean z = true;
            if ((property == null || !Boolean.parseBoolean(property)) ? false : false) {
                String str3 = volatileProperties().get(str);
                Intrinsics.checkNotNull(str3);
                return str3;
            }
        }
        String property2 = properties.getProperty(str);
        if (str2 == null) {
            if (property2 == null) {
                throw new IllegalArgumentException(("Property '" + str + "' not found.").toString());
            }
        } else if (property2 == null) {
            return str2;
        }
        return property2;
    }

    /* compiled from: ConfigurationProperties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/properties/ConfigurationProperties$Companion;", "", "()V", "DEBUG_TOOLS", "", ConfigurationProperties.VOLATILE_CONFIG_PROPERTIES, "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
