package media.tiger.tigerbox.model.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: ProductDomain.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/BannerProductDomain;", "", "ordinal", "", MessageBundle.TITLE_ENTRY, "", "hdImageUrl", "sdImageUrl", "url", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHdImageUrl", "()Ljava/lang/String;", "getOrdinal", "()I", "getSdImageUrl", "getTitle", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerProductDomain {
    private final String hdImageUrl;
    private final int ordinal;
    private final String sdImageUrl;
    private final String title;
    private final String url;

    public static /* synthetic */ BannerProductDomain copy$default(BannerProductDomain bannerProductDomain, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = bannerProductDomain.ordinal;
        }
        if ((i2 & 2) != 0) {
            str = bannerProductDomain.title;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = bannerProductDomain.hdImageUrl;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = bannerProductDomain.sdImageUrl;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = bannerProductDomain.url;
        }
        return bannerProductDomain.copy(i, str5, str6, str7, str4);
    }

    public final int component1() {
        return this.ordinal;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.hdImageUrl;
    }

    public final String component4() {
        return this.sdImageUrl;
    }

    public final String component5() {
        return this.url;
    }

    public final BannerProductDomain copy(int i, String title, String hdImageUrl, String sdImageUrl, String url) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hdImageUrl, "hdImageUrl");
        Intrinsics.checkNotNullParameter(sdImageUrl, "sdImageUrl");
        Intrinsics.checkNotNullParameter(url, "url");
        return new BannerProductDomain(i, title, hdImageUrl, sdImageUrl, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BannerProductDomain) {
            BannerProductDomain bannerProductDomain = (BannerProductDomain) obj;
            return this.ordinal == bannerProductDomain.ordinal && Intrinsics.areEqual(this.title, bannerProductDomain.title) && Intrinsics.areEqual(this.hdImageUrl, bannerProductDomain.hdImageUrl) && Intrinsics.areEqual(this.sdImageUrl, bannerProductDomain.sdImageUrl) && Intrinsics.areEqual(this.url, bannerProductDomain.url);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.ordinal * 31) + this.title.hashCode()) * 31) + this.hdImageUrl.hashCode()) * 31) + this.sdImageUrl.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "BannerProductDomain(ordinal=" + this.ordinal + ", title=" + this.title + ", hdImageUrl=" + this.hdImageUrl + ", sdImageUrl=" + this.sdImageUrl + ", url=" + this.url + ')';
    }

    public BannerProductDomain(int i, String title, String hdImageUrl, String sdImageUrl, String url) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(hdImageUrl, "hdImageUrl");
        Intrinsics.checkNotNullParameter(sdImageUrl, "sdImageUrl");
        Intrinsics.checkNotNullParameter(url, "url");
        this.ordinal = i;
        this.title = title;
        this.hdImageUrl = hdImageUrl;
        this.sdImageUrl = sdImageUrl;
        this.url = url;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getHdImageUrl() {
        return this.hdImageUrl;
    }

    public final String getSdImageUrl() {
        return this.sdImageUrl;
    }

    public final String getUrl() {
        return this.url;
    }
}
