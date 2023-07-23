package media.tiger.tigerbox.services.interfaces.audioPlayer;

import kotlin.Metadata;
import media.tiger.tigerbox.services.implementations.audioPlayer.LastUsedProduct;

/* compiled from: LastUsedProductService.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/LastUsedProductService;", "", LastUsedProduct.DEFAULT_LAST_USED_PRODUCT_KEY, "", "multicardCode", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface LastUsedProductService {
    Integer lastUsedProduct(String str);
}
