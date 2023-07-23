package media.tiger.tigerbox.ui.main.seemoreproducts;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.domain.ProductDomain;

/* compiled from: SeeMoreListAdapter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/seemoreproducts/ProductListItem;", "", "()V", TtmlNode.ATTR_ID, "", "getId", "()I", "Header", "ProductItem", "Lmedia/tiger/tigerbox/ui/main/seemoreproducts/ProductListItem$ProductItem;", "Lmedia/tiger/tigerbox/ui/main/seemoreproducts/ProductListItem$Header;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductListItem {
    public /* synthetic */ ProductListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getId();

    /* compiled from: SeeMoreListAdapter.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/seemoreproducts/ProductListItem$ProductItem;", "Lmedia/tiger/tigerbox/ui/main/seemoreproducts/ProductListItem;", "productDomain", "Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "(Lmedia/tiger/tigerbox/model/domain/ProductDomain;)V", TtmlNode.ATTR_ID, "", "getId", "()I", "getProductDomain", "()Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ProductItem extends ProductListItem {
        private final int id;
        private final ProductDomain productDomain;

        public static /* synthetic */ ProductItem copy$default(ProductItem productItem, ProductDomain productDomain, int i, Object obj) {
            if ((i & 1) != 0) {
                productDomain = productItem.productDomain;
            }
            return productItem.copy(productDomain);
        }

        public final ProductDomain component1() {
            return this.productDomain;
        }

        public final ProductItem copy(ProductDomain productDomain) {
            Intrinsics.checkNotNullParameter(productDomain, "productDomain");
            return new ProductItem(productDomain);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductItem) && Intrinsics.areEqual(this.productDomain, ((ProductItem) obj).productDomain);
        }

        public int hashCode() {
            return this.productDomain.hashCode();
        }

        public String toString() {
            return "ProductItem(productDomain=" + this.productDomain + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProductItem(ProductDomain productDomain) {
            super(null);
            Intrinsics.checkNotNullParameter(productDomain, "productDomain");
            this.productDomain = productDomain;
            this.id = productDomain.getId();
        }

        public final ProductDomain getProductDomain() {
            return this.productDomain;
        }

        @Override // media.tiger.tigerbox.ui.main.seemoreproducts.ProductListItem
        public int getId() {
            return this.id;
        }
    }

    private ProductListItem() {
    }

    /* compiled from: SeeMoreListAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/ui/main/seemoreproducts/ProductListItem$Header;", "Lmedia/tiger/tigerbox/ui/main/seemoreproducts/ProductListItem;", "()V", TtmlNode.ATTR_ID, "", "getId", "()I", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Header extends ProductListItem {
        public static final Header INSTANCE = new Header();
        private static final int id = Integer.MIN_VALUE;

        private Header() {
            super(null);
        }

        @Override // media.tiger.tigerbox.ui.main.seemoreproducts.ProductListItem
        public int getId() {
            return id;
        }
    }
}
