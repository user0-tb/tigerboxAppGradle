package media.tiger.tigerbox.model.domain;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.spongycastle.i18n.MessageBundle;
import timber.log.Timber;

/* compiled from: ProductRowDomain.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eBQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003Je\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\u0013\u0010/\u001a\u00020\u00172\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u00101\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0005H\u0002J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0006\u00104\u001a\u00020\u0017J\u0014\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000506H\u0002J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001b¨\u00068"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/ProductRowDomain;", "", TtmlNode.ATTR_ID, "", MessageBundle.TITLE_ENTRY, "", "layoutItemType", "Lmedia/tiger/tigerbox/model/domain/ProductRowType;", "productSourceType", "bannerProducts", "", "Lmedia/tiger/tigerbox/model/domain/BannerProductDomain;", "(ILjava/lang/String;Lmedia/tiger/tigerbox/model/domain/ProductRowType;Ljava/lang/String;Ljava/util/List;)V", "url", "(ILjava/lang/String;Lmedia/tiger/tigerbox/model/domain/ProductRowType;Ljava/lang/String;Ljava/lang/String;)V", "products", "", "Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "headerResponseLink", "(ILjava/lang/String;Lmedia/tiger/tigerbox/model/domain/ProductRowType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getBannerProducts", "()Ljava/util/List;", "hasLoadMore", "", "getHasLoadMore", "()Z", "getHeaderResponseLink", "()Ljava/lang/String;", "setHeaderResponseLink", "(Ljava/lang/String;)V", "getId", "()I", "getLayoutItemType", "()Lmedia/tiger/tigerbox/model/domain/ProductRowType;", "getProductSourceType", "getProducts", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "getNextLink", "link", "hashCode", "isOfflineRowType", "parseLink", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductRowDomain {
    private final List<BannerProductDomain> bannerProducts;
    private String headerResponseLink;
    private final int id;
    private final ProductRowType layoutItemType;
    private final String productSourceType;
    private final List<ProductDomain> products;
    private final String title;
    private final String url;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductRowDomain copy$default(ProductRowDomain productRowDomain, int i, String str, ProductRowType productRowType, String str2, String str3, List list, List list2, String str4, int i2, Object obj) {
        return productRowDomain.copy((i2 & 1) != 0 ? productRowDomain.id : i, (i2 & 2) != 0 ? productRowDomain.title : str, (i2 & 4) != 0 ? productRowDomain.layoutItemType : productRowType, (i2 & 8) != 0 ? productRowDomain.productSourceType : str2, (i2 & 16) != 0 ? productRowDomain.url : str3, (i2 & 32) != 0 ? productRowDomain.products : list, (i2 & 64) != 0 ? productRowDomain.bannerProducts : list2, (i2 & 128) != 0 ? productRowDomain.headerResponseLink : str4);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final ProductRowType component3() {
        return this.layoutItemType;
    }

    public final String component4() {
        return this.productSourceType;
    }

    public final String component5() {
        return this.url;
    }

    public final List<ProductDomain> component6() {
        return this.products;
    }

    public final List<BannerProductDomain> component7() {
        return this.bannerProducts;
    }

    public final String component8() {
        return this.headerResponseLink;
    }

    public final ProductRowDomain copy(int i, String title, ProductRowType layoutItemType, String productSourceType, String url, List<ProductDomain> products, List<BannerProductDomain> bannerProducts, String headerResponseLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(layoutItemType, "layoutItemType");
        Intrinsics.checkNotNullParameter(productSourceType, "productSourceType");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(bannerProducts, "bannerProducts");
        Intrinsics.checkNotNullParameter(headerResponseLink, "headerResponseLink");
        return new ProductRowDomain(i, title, layoutItemType, productSourceType, url, products, bannerProducts, headerResponseLink);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductRowDomain) {
            ProductRowDomain productRowDomain = (ProductRowDomain) obj;
            return this.id == productRowDomain.id && Intrinsics.areEqual(this.title, productRowDomain.title) && this.layoutItemType == productRowDomain.layoutItemType && Intrinsics.areEqual(this.productSourceType, productRowDomain.productSourceType) && Intrinsics.areEqual(this.url, productRowDomain.url) && Intrinsics.areEqual(this.products, productRowDomain.products) && Intrinsics.areEqual(this.bannerProducts, productRowDomain.bannerProducts) && Intrinsics.areEqual(this.headerResponseLink, productRowDomain.headerResponseLink);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((this.id * 31) + this.title.hashCode()) * 31) + this.layoutItemType.hashCode()) * 31) + this.productSourceType.hashCode()) * 31) + this.url.hashCode()) * 31) + this.products.hashCode()) * 31) + this.bannerProducts.hashCode()) * 31) + this.headerResponseLink.hashCode();
    }

    public String toString() {
        return "ProductRowDomain(id=" + this.id + ", title=" + this.title + ", layoutItemType=" + this.layoutItemType + ", productSourceType=" + this.productSourceType + ", url=" + this.url + ", products=" + this.products + ", bannerProducts=" + this.bannerProducts + ", headerResponseLink=" + this.headerResponseLink + ')';
    }

    public ProductRowDomain(int i, String title, ProductRowType layoutItemType, String productSourceType, String url, List<ProductDomain> products, List<BannerProductDomain> bannerProducts, String headerResponseLink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(layoutItemType, "layoutItemType");
        Intrinsics.checkNotNullParameter(productSourceType, "productSourceType");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(bannerProducts, "bannerProducts");
        Intrinsics.checkNotNullParameter(headerResponseLink, "headerResponseLink");
        this.id = i;
        this.title = title;
        this.layoutItemType = layoutItemType;
        this.productSourceType = productSourceType;
        this.url = url;
        this.products = products;
        this.bannerProducts = bannerProducts;
        this.headerResponseLink = headerResponseLink;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ProductRowType getLayoutItemType() {
        return this.layoutItemType;
    }

    public final String getProductSourceType() {
        return this.productSourceType;
    }

    public final String getUrl() {
        return this.url;
    }

    public final List<ProductDomain> getProducts() {
        return this.products;
    }

    public final List<BannerProductDomain> getBannerProducts() {
        return this.bannerProducts;
    }

    public final String getHeaderResponseLink() {
        return this.headerResponseLink;
    }

    public final void setHeaderResponseLink(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headerResponseLink = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductRowDomain(int i, String title, ProductRowType layoutItemType, String productSourceType, List<BannerProductDomain> bannerProducts) {
        this(i, title, layoutItemType, productSourceType, "", new ArrayList(), bannerProducts, "");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(layoutItemType, "layoutItemType");
        Intrinsics.checkNotNullParameter(productSourceType, "productSourceType");
        Intrinsics.checkNotNullParameter(bannerProducts, "bannerProducts");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProductRowDomain(int i, String title, ProductRowType layoutItemType, String productSourceType, String url) {
        this(i, title, layoutItemType, productSourceType, url, new ArrayList(), new ArrayList(), "");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(layoutItemType, "layoutItemType");
        Intrinsics.checkNotNullParameter(productSourceType, "productSourceType");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public final boolean getHasLoadMore() {
        return hasLoadMore(this.headerResponseLink);
    }

    private final boolean hasLoadMore(String str) {
        String str2 = str;
        return (str2.length() > 0) && StringsKt.contains$default((CharSequence) str2, (CharSequence) "rel=\"next\"", false, 2, (Object) null);
    }

    private final Map<String, String> parseLink() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (String str : StringsKt.split$default((CharSequence) this.headerResponseLink, new String[]{","}, true, 0, 4, (Object) null)) {
                List split$default = StringsKt.split$default((CharSequence) str, new String[]{";"}, true, 0, 4, (Object) null);
                String removeSuffix = StringsKt.removeSuffix(StringsKt.removePrefix((String) CollectionsKt.first((List<? extends Object>) split$default), (CharSequence) "<"), (CharSequence) ">");
                if (StringsKt.contains$default((CharSequence) CollectionsKt.last((List<? extends Object>) split$default), (CharSequence) "first", false, 2, (Object) null)) {
                    linkedHashMap.put("first", removeSuffix);
                } else if (StringsKt.contains$default((CharSequence) CollectionsKt.last((List<? extends Object>) split$default), (CharSequence) "last", false, 2, (Object) null)) {
                    linkedHashMap.put("last", removeSuffix);
                } else if (StringsKt.contains$default((CharSequence) CollectionsKt.last((List<? extends Object>) split$default), (CharSequence) "next", false, 2, (Object) null)) {
                    linkedHashMap.put("next", removeSuffix);
                } else if (StringsKt.contains$default((CharSequence) CollectionsKt.last((List<? extends Object>) split$default), (CharSequence) "prev", false, 2, (Object) null)) {
                    linkedHashMap.put("prev", removeSuffix);
                }
            }
        } catch (Exception e) {
            Timber.Tree tag = Timber.Forest.tag("ProductRowDomaing");
            tag.e("Exception while parsing link " + e, new Object[0]);
        }
        return linkedHashMap;
    }

    public final String getNextLink() {
        String str = parseLink().get("next");
        return str == null ? "" : str;
    }

    public final boolean isOfflineRowType() {
        return this.layoutItemType == ProductRowType.RESOURCE && Intrinsics.areEqual(this.productSourceType, ProductRowDomainKt.OFFLINE_CONTENT);
    }
}
