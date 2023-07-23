package media.tiger.tigerbox.ui.main.maincontent;

import kotlin.Metadata;
import media.tiger.tigerbox.model.domain.ProductDomain;

/* compiled from: ProductContentFragment.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/maincontent/OnItemLongClickListener;", "", "onItemLongClickListener", "", "product", "Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "removeDownloadedProduct", "", "startDownloadOfProduct", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OnItemLongClickListener {
    boolean onItemLongClickListener(ProductDomain productDomain);

    void removeDownloadedProduct(ProductDomain productDomain);

    void startDownloadOfProduct(ProductDomain productDomain);
}
