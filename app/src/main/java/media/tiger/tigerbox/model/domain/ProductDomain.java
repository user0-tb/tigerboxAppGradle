package media.tiger.tigerbox.model.domain;

import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: ProductDomain.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BU\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u0012HÆ\u0003Jg\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u00062"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/ProductDomain;", "Ljava/io/Serializable;", "productId", "", "(I)V", TtmlNode.ATTR_ID, MessageBundle.TITLE_ENTRY, "", "author", "imageUrl", "isBanner", "", "offlineAvailabilityState", "Lmedia/tiger/tigerbox/model/domain/OfflineAvailabilityState;", "offlineAvailabilityReason", "Lmedia/tiger/tigerbox/model/domain/DownloadReason;", "isSelected", "source", "Lmedia/tiger/tigerbox/model/domain/ProductSource;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmedia/tiger/tigerbox/model/domain/OfflineAvailabilityState;Lmedia/tiger/tigerbox/model/domain/DownloadReason;ZLmedia/tiger/tigerbox/model/domain/ProductSource;)V", "getAuthor", "()Ljava/lang/String;", "getId", "()I", "getImageUrl", "()Z", "setSelected", "(Z)V", "getOfflineAvailabilityReason", "()Lmedia/tiger/tigerbox/model/domain/DownloadReason;", "getOfflineAvailabilityState", "()Lmedia/tiger/tigerbox/model/domain/OfflineAvailabilityState;", "getSource", "()Lmedia/tiger/tigerbox/model/domain/ProductSource;", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductDomain implements Serializable {
    private final String author;
    private final int id;
    private final String imageUrl;
    private final boolean isBanner;
    private boolean isSelected;
    private final DownloadReason offlineAvailabilityReason;
    private final OfflineAvailabilityState offlineAvailabilityState;
    private final ProductSource source;
    private final String title;

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final boolean component5() {
        return this.isBanner;
    }

    public final OfflineAvailabilityState component6() {
        return this.offlineAvailabilityState;
    }

    public final DownloadReason component7() {
        return this.offlineAvailabilityReason;
    }

    public final boolean component8() {
        return this.isSelected;
    }

    public final ProductSource component9() {
        return this.source;
    }

    public final ProductDomain copy(int i, String title, String author, String str, boolean z, OfflineAvailabilityState offlineAvailabilityState, DownloadReason downloadReason, boolean z2, ProductSource source) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(offlineAvailabilityState, "offlineAvailabilityState");
        Intrinsics.checkNotNullParameter(source, "source");
        return new ProductDomain(i, title, author, str, z, offlineAvailabilityState, downloadReason, z2, source);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDomain) {
            ProductDomain productDomain = (ProductDomain) obj;
            return this.id == productDomain.id && Intrinsics.areEqual(this.title, productDomain.title) && Intrinsics.areEqual(this.author, productDomain.author) && Intrinsics.areEqual(this.imageUrl, productDomain.imageUrl) && this.isBanner == productDomain.isBanner && this.offlineAvailabilityState == productDomain.offlineAvailabilityState && this.offlineAvailabilityReason == productDomain.offlineAvailabilityReason && this.isSelected == productDomain.isSelected && this.source == productDomain.source;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.id * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31;
        String str = this.imageUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isBanner;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((hashCode2 + i) * 31) + this.offlineAvailabilityState.hashCode()) * 31;
        DownloadReason downloadReason = this.offlineAvailabilityReason;
        int hashCode4 = (hashCode3 + (downloadReason != null ? downloadReason.hashCode() : 0)) * 31;
        boolean z2 = this.isSelected;
        return ((hashCode4 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "ProductDomain(id=" + this.id + ", title=" + this.title + ", author=" + this.author + ", imageUrl=" + this.imageUrl + ", isBanner=" + this.isBanner + ", offlineAvailabilityState=" + this.offlineAvailabilityState + ", offlineAvailabilityReason=" + this.offlineAvailabilityReason + ", isSelected=" + this.isSelected + ", source=" + this.source + ')';
    }

    public ProductDomain(int i, String title, String author, String str, boolean z, OfflineAvailabilityState offlineAvailabilityState, DownloadReason downloadReason, boolean z2, ProductSource source) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(offlineAvailabilityState, "offlineAvailabilityState");
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = i;
        this.title = title;
        this.author = author;
        this.imageUrl = str;
        this.isBanner = z;
        this.offlineAvailabilityState = offlineAvailabilityState;
        this.offlineAvailabilityReason = downloadReason;
        this.isSelected = z2;
        this.source = source;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean isBanner() {
        return this.isBanner;
    }

    public final OfflineAvailabilityState getOfflineAvailabilityState() {
        return this.offlineAvailabilityState;
    }

    public final DownloadReason getOfflineAvailabilityReason() {
        return this.offlineAvailabilityReason;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public /* synthetic */ ProductDomain(int i, String str, String str2, String str3, boolean z, OfflineAvailabilityState offlineAvailabilityState, DownloadReason downloadReason, boolean z2, ProductSource productSource, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, z, offlineAvailabilityState, downloadReason, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? ProductSource.BACKEND : productSource);
    }

    public final ProductSource getSource() {
        return this.source;
    }

    public ProductDomain(int i) {
        this(i, "", "", "", false, OfflineAvailabilityState.NOT_AVAILABLE, DownloadReason.NONE, false, null, RendererCapabilities.MODE_SUPPORT_MASK, null);
    }
}
