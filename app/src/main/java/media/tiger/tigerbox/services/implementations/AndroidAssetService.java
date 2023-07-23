package media.tiger.tigerbox.services.implementations;

import android.content.res.AssetManager;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.services.interfaces.AssetService;
import timber.log.Timber;

/* compiled from: AndroidAssetService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/AndroidAssetService;", "Lmedia/tiger/tigerbox/services/interfaces/AssetService;", "assetManager", "Landroid/content/res/AssetManager;", "(Landroid/content/res/AssetManager;)V", "otaPrivateKey", "", "getOtaPrivateKey", "()Ljava/lang/String;", "otaPublicKey", "getOtaPublicKey", "loadAssetFile", "fileReference", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidAssetService implements AssetService {
    public static final Companion Companion = new Companion(null);
    public static final String OTA_PRIVATE_KEY = "ota/client_private_pk8.pem";
    public static final String OTA_PUBLIC_KEY = "ota/public.key";
    private final AssetManager assetManager;

    public AndroidAssetService(AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.assetManager = assetManager;
    }

    private final String loadAssetFile(String str) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(this.assetManager.open(str));
            String readText = TextStreamsKt.readText(inputStreamReader);
            CloseableKt.closeFinally(inputStreamReader, null);
            return readText;
        } catch (Exception e) {
            Timber.Forest forest = Timber.Forest;
            forest.e("OtaPublicKeyReader: OtaPublicKeyReader read: " + e, new Object[0]);
            return "";
        }
    }

    @Override // media.tiger.tigerbox.services.interfaces.AssetService
    public String getOtaPublicKey() {
        return loadAssetFile(OTA_PUBLIC_KEY);
    }

    @Override // media.tiger.tigerbox.services.interfaces.AssetService
    public String getOtaPrivateKey() {
        return loadAssetFile(OTA_PRIVATE_KEY);
    }

    /* compiled from: AndroidAssetService.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/services/implementations/AndroidAssetService$Companion;", "", "()V", "OTA_PRIVATE_KEY", "", "OTA_PUBLIC_KEY", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
