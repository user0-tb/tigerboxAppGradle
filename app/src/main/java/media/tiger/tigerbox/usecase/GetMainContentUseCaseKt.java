package media.tiger.tigerbox.usecase;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.Metadata;
import media.tiger.tigerbox.model.domain.ProductRowType;

/* compiled from: GetMainContentUseCase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"mapLayoutType", "Lmedia/tiger/tigerbox/model/domain/ProductRowType;", SessionDescription.ATTR_TYPE, "", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GetMainContentUseCaseKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductRowType mapLayoutType(String str) {
        switch (str.hashCode()) {
            case -933809650:
                if (str.equals("PRODUCT_LIST")) {
                    return ProductRowType.PRODUCT_LIST;
                }
                break;
            case 77406376:
                if (str.equals("QUERY")) {
                    return ProductRowType.QUERY;
                }
                break;
            case 441562126:
                if (str.equals("RESOURCE")) {
                    return ProductRowType.RESOURCE;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return ProductRowType.BANNER;
                }
                break;
        }
        return ProductRowType.INVALID;
    }
}
