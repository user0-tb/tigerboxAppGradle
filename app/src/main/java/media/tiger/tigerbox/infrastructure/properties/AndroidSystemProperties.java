package media.tiger.tigerbox.infrastructure.properties;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: AndroidSystemProperties.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/infrastructure/properties/AndroidSystemProperties;", "", "()V", "invoke", "", "reference", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidSystemProperties {
    public static final AndroidSystemProperties INSTANCE = new AndroidSystemProperties();

    private AndroidSystemProperties() {
    }

    public final String invoke(String reference) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object invoke = cls.getMethod("get", String.class).invoke(cls, reference);
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            Timber.Tree tag = Timber.Forest.tag("TigerBoxMetaDataService");
            e.printStackTrace();
            tag.e(Unit.INSTANCE.toString(), new Object[0]);
            return "";
        }
    }
}
