package media.tiger.tigerbox.model.dto;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: MainContentItem.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003Ji\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006)"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/MainContentItem;", "", TtmlNode.ATTR_ID, "", "name", "", "layoutType", "state", "locale", "deviceType", "layoutItems", "", "Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem;", "appIds", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAppIds", "()Ljava/util/List;", "getDeviceType", "()Ljava/lang/String;", "getId", "()I", "getLayoutItems", "getLayoutType", "getLocale", "getName", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "LayoutItem", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainContentItem {
    private final List<Integer> appIds;
    private final String deviceType;
    private final int id;
    private final List<LayoutItem> layoutItems;
    private final String layoutType;
    private final String locale;
    private final String name;
    private final String state;

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.layoutType;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.locale;
    }

    public final String component6() {
        return this.deviceType;
    }

    public final List<LayoutItem> component7() {
        return this.layoutItems;
    }

    public final List<Integer> component8() {
        return this.appIds;
    }

    public final MainContentItem copy(int i, String name, String layoutType, String state, String str, String str2, List<LayoutItem> layoutItems, List<Integer> appIds) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layoutItems, "layoutItems");
        Intrinsics.checkNotNullParameter(appIds, "appIds");
        return new MainContentItem(i, name, layoutType, state, str, str2, layoutItems, appIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MainContentItem) {
            MainContentItem mainContentItem = (MainContentItem) obj;
            return this.id == mainContentItem.id && Intrinsics.areEqual(this.name, mainContentItem.name) && Intrinsics.areEqual(this.layoutType, mainContentItem.layoutType) && Intrinsics.areEqual(this.state, mainContentItem.state) && Intrinsics.areEqual(this.locale, mainContentItem.locale) && Intrinsics.areEqual(this.deviceType, mainContentItem.deviceType) && Intrinsics.areEqual(this.layoutItems, mainContentItem.layoutItems) && Intrinsics.areEqual(this.appIds, mainContentItem.appIds);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.id * 31) + this.name.hashCode()) * 31) + this.layoutType.hashCode()) * 31) + this.state.hashCode()) * 31;
        String str = this.locale;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceType;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.layoutItems.hashCode()) * 31) + this.appIds.hashCode();
    }

    public String toString() {
        return "MainContentItem(id=" + this.id + ", name=" + this.name + ", layoutType=" + this.layoutType + ", state=" + this.state + ", locale=" + this.locale + ", deviceType=" + this.deviceType + ", layoutItems=" + this.layoutItems + ", appIds=" + this.appIds + ')';
    }

    public MainContentItem(int i, String name, String layoutType, String state, String str, String str2, List<LayoutItem> layoutItems, List<Integer> appIds) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(layoutItems, "layoutItems");
        Intrinsics.checkNotNullParameter(appIds, "appIds");
        this.id = i;
        this.name = name;
        this.layoutType = layoutType;
        this.state = state;
        this.locale = str;
        this.deviceType = str2;
        this.layoutItems = layoutItems;
        this.appIds = appIds;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getLayoutType() {
        return this.layoutType;
    }

    public final String getState() {
        return this.state;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final List<LayoutItem> getLayoutItems() {
        return this.layoutItems;
    }

    public final List<Integer> getAppIds() {
        return this.appIds;
    }

    /* compiled from: MainContentItem.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001:\u0003345Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0083\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fHÆ\u0001J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001b¨\u00066"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem;", "", "ordinal", "", MessageBundle.TITLE_ENTRY, "", "layoutItemType", "productSourceType", "banner", "Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Banner;", "query", "Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Query;", "ageFiltered", "", "icons", "", "Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Icon;", "url", "productIdentifier", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Banner;Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Query;ZLjava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getAgeFiltered", "()Z", "getBanner", "()Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Banner;", "getIcons", "()Ljava/util/List;", "getLayoutItemType", "()Ljava/lang/String;", "getOrdinal", "()I", "getProductIdentifier", "getProductSourceType", "getQuery", "()Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Query;", "getTitle", "getUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Banner", "Icon", "Query", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class LayoutItem {
        private final boolean ageFiltered;
        private final Banner banner;
        private final List<Icon> icons;
        private final String layoutItemType;
        private final int ordinal;
        private final List<String> productIdentifier;
        private final String productSourceType;
        private final Query query;
        private final String title;
        private final String url;

        public final int component1() {
            return this.ordinal;
        }

        public final List<String> component10() {
            return this.productIdentifier;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.layoutItemType;
        }

        public final String component4() {
            return this.productSourceType;
        }

        public final Banner component5() {
            return this.banner;
        }

        public final Query component6() {
            return this.query;
        }

        public final boolean component7() {
            return this.ageFiltered;
        }

        public final List<Icon> component8() {
            return this.icons;
        }

        public final String component9() {
            return this.url;
        }

        public final LayoutItem copy(int i, String title, String str, String str2, Banner banner, Query query, boolean z, List<Icon> icons, String str3, List<String> productIdentifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icons, "icons");
            Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
            return new LayoutItem(i, title, str, str2, banner, query, z, icons, str3, productIdentifier);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LayoutItem) {
                LayoutItem layoutItem = (LayoutItem) obj;
                return this.ordinal == layoutItem.ordinal && Intrinsics.areEqual(this.title, layoutItem.title) && Intrinsics.areEqual(this.layoutItemType, layoutItem.layoutItemType) && Intrinsics.areEqual(this.productSourceType, layoutItem.productSourceType) && Intrinsics.areEqual(this.banner, layoutItem.banner) && Intrinsics.areEqual(this.query, layoutItem.query) && this.ageFiltered == layoutItem.ageFiltered && Intrinsics.areEqual(this.icons, layoutItem.icons) && Intrinsics.areEqual(this.url, layoutItem.url) && Intrinsics.areEqual(this.productIdentifier, layoutItem.productIdentifier);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.ordinal * 31) + this.title.hashCode()) * 31;
            String str = this.layoutItemType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.productSourceType;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Banner banner = this.banner;
            int hashCode4 = (hashCode3 + (banner == null ? 0 : banner.hashCode())) * 31;
            Query query = this.query;
            int hashCode5 = (hashCode4 + (query == null ? 0 : query.hashCode())) * 31;
            boolean z = this.ageFiltered;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int hashCode6 = (((hashCode5 + i) * 31) + this.icons.hashCode()) * 31;
            String str3 = this.url;
            return ((hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.productIdentifier.hashCode();
        }

        public String toString() {
            return "LayoutItem(ordinal=" + this.ordinal + ", title=" + this.title + ", layoutItemType=" + this.layoutItemType + ", productSourceType=" + this.productSourceType + ", banner=" + this.banner + ", query=" + this.query + ", ageFiltered=" + this.ageFiltered + ", icons=" + this.icons + ", url=" + this.url + ", productIdentifier=" + this.productIdentifier + ')';
        }

        public LayoutItem(int i, String title, String str, String str2, Banner banner, Query query, boolean z, List<Icon> icons, String str3, List<String> productIdentifier) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icons, "icons");
            Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
            this.ordinal = i;
            this.title = title;
            this.layoutItemType = str;
            this.productSourceType = str2;
            this.banner = banner;
            this.query = query;
            this.ageFiltered = z;
            this.icons = icons;
            this.url = str3;
            this.productIdentifier = productIdentifier;
        }

        public final int getOrdinal() {
            return this.ordinal;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getLayoutItemType() {
            return this.layoutItemType;
        }

        public final String getProductSourceType() {
            return this.productSourceType;
        }

        public final Banner getBanner() {
            return this.banner;
        }

        public final Query getQuery() {
            return this.query;
        }

        public final boolean getAgeFiltered() {
            return this.ageFiltered;
        }

        public final List<Icon> getIcons() {
            return this.icons;
        }

        public final String getUrl() {
            return this.url;
        }

        public final List<String> getProductIdentifier() {
            return this.productIdentifier;
        }

        /* compiled from: MainContentItem.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Banner;", "", "size", "", "scrollable", "", "images", "", "Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Banner$Image;", "presentationType", "(Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "getImages", "()Ljava/util/List;", "getPresentationType", "()Ljava/lang/String;", "getScrollable", "()Z", "getSize", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Image", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Banner {
            private final List<Image> images;
            private final String presentationType;
            private final boolean scrollable;
            private final String size;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Banner copy$default(Banner banner, String str, boolean z, List list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = banner.size;
                }
                if ((i & 2) != 0) {
                    z = banner.scrollable;
                }
                if ((i & 4) != 0) {
                    list = banner.images;
                }
                if ((i & 8) != 0) {
                    str2 = banner.presentationType;
                }
                return banner.copy(str, z, list, str2);
            }

            public final String component1() {
                return this.size;
            }

            public final boolean component2() {
                return this.scrollable;
            }

            public final List<Image> component3() {
                return this.images;
            }

            public final String component4() {
                return this.presentationType;
            }

            public final Banner copy(String str, boolean z, List<Image> images, String presentationType) {
                Intrinsics.checkNotNullParameter(images, "images");
                Intrinsics.checkNotNullParameter(presentationType, "presentationType");
                return new Banner(str, z, images, presentationType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Banner) {
                    Banner banner = (Banner) obj;
                    return Intrinsics.areEqual(this.size, banner.size) && this.scrollable == banner.scrollable && Intrinsics.areEqual(this.images, banner.images) && Intrinsics.areEqual(this.presentationType, banner.presentationType);
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                String str = this.size;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                boolean z = this.scrollable;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return ((((hashCode + i) * 31) + this.images.hashCode()) * 31) + this.presentationType.hashCode();
            }

            public String toString() {
                return "Banner(size=" + this.size + ", scrollable=" + this.scrollable + ", images=" + this.images + ", presentationType=" + this.presentationType + ')';
            }

            public Banner(String str, boolean z, List<Image> images, String presentationType) {
                Intrinsics.checkNotNullParameter(images, "images");
                Intrinsics.checkNotNullParameter(presentationType, "presentationType");
                this.size = str;
                this.scrollable = z;
                this.images = images;
                this.presentationType = presentationType;
            }

            public final String getSize() {
                return this.size;
            }

            public final boolean getScrollable() {
                return this.scrollable;
            }

            public final List<Image> getImages() {
                return this.images;
            }

            public final String getPresentationType() {
                return this.presentationType;
            }

            /* compiled from: MainContentItem.kt */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003Ju\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00060"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Banner$Image;", "", "ordinal", "", "sdImage", "", "hdImage", MessageBundle.TITLE_ENTRY, "query", "Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Query;", "productIdentifier", "", "sortBy", "sortDirection", "ageFiltered", "", "url", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Query;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAgeFiltered", "()Z", "getHdImage", "()Ljava/lang/String;", "getOrdinal", "()I", "getProductIdentifier", "()Ljava/util/List;", "getQuery", "()Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Query;", "getSdImage", "getSortBy", "getSortDirection", "getTitle", "getUrl", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class Image {
                private final boolean ageFiltered;
                private final String hdImage;
                private final int ordinal;
                private final List<String> productIdentifier;
                private final Query query;
                private final String sdImage;
                private final String sortBy;
                private final String sortDirection;
                private final String title;
                private final String url;

                public final int component1() {
                    return this.ordinal;
                }

                public final String component10() {
                    return this.url;
                }

                public final String component2() {
                    return this.sdImage;
                }

                public final String component3() {
                    return this.hdImage;
                }

                public final String component4() {
                    return this.title;
                }

                public final Query component5() {
                    return this.query;
                }

                public final List<String> component6() {
                    return this.productIdentifier;
                }

                public final String component7() {
                    return this.sortBy;
                }

                public final String component8() {
                    return this.sortDirection;
                }

                public final boolean component9() {
                    return this.ageFiltered;
                }

                public final Image copy(int i, String sdImage, String hdImage, String title, Query query, List<String> productIdentifier, String sortBy, String sortDirection, boolean z, String url) {
                    Intrinsics.checkNotNullParameter(sdImage, "sdImage");
                    Intrinsics.checkNotNullParameter(hdImage, "hdImage");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(query, "query");
                    Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
                    Intrinsics.checkNotNullParameter(sortBy, "sortBy");
                    Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new Image(i, sdImage, hdImage, title, query, productIdentifier, sortBy, sortDirection, z, url);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Image) {
                        Image image = (Image) obj;
                        return this.ordinal == image.ordinal && Intrinsics.areEqual(this.sdImage, image.sdImage) && Intrinsics.areEqual(this.hdImage, image.hdImage) && Intrinsics.areEqual(this.title, image.title) && Intrinsics.areEqual(this.query, image.query) && Intrinsics.areEqual(this.productIdentifier, image.productIdentifier) && Intrinsics.areEqual(this.sortBy, image.sortBy) && Intrinsics.areEqual(this.sortDirection, image.sortDirection) && this.ageFiltered == image.ageFiltered && Intrinsics.areEqual(this.url, image.url);
                    }
                    return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public int hashCode() {
                    int hashCode = ((((((((((((((this.ordinal * 31) + this.sdImage.hashCode()) * 31) + this.hdImage.hashCode()) * 31) + this.title.hashCode()) * 31) + this.query.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31) + this.sortBy.hashCode()) * 31) + this.sortDirection.hashCode()) * 31;
                    boolean z = this.ageFiltered;
                    int i = z;
                    if (z != 0) {
                        i = 1;
                    }
                    return ((hashCode + i) * 31) + this.url.hashCode();
                }

                public String toString() {
                    return "Image(ordinal=" + this.ordinal + ", sdImage=" + this.sdImage + ", hdImage=" + this.hdImage + ", title=" + this.title + ", query=" + this.query + ", productIdentifier=" + this.productIdentifier + ", sortBy=" + this.sortBy + ", sortDirection=" + this.sortDirection + ", ageFiltered=" + this.ageFiltered + ", url=" + this.url + ')';
                }

                public Image(int i, String sdImage, String hdImage, String title, Query query, List<String> productIdentifier, String sortBy, String sortDirection, boolean z, String url) {
                    Intrinsics.checkNotNullParameter(sdImage, "sdImage");
                    Intrinsics.checkNotNullParameter(hdImage, "hdImage");
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(query, "query");
                    Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
                    Intrinsics.checkNotNullParameter(sortBy, "sortBy");
                    Intrinsics.checkNotNullParameter(sortDirection, "sortDirection");
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.ordinal = i;
                    this.sdImage = sdImage;
                    this.hdImage = hdImage;
                    this.title = title;
                    this.query = query;
                    this.productIdentifier = productIdentifier;
                    this.sortBy = sortBy;
                    this.sortDirection = sortDirection;
                    this.ageFiltered = z;
                    this.url = url;
                }

                public final int getOrdinal() {
                    return this.ordinal;
                }

                public final String getSdImage() {
                    return this.sdImage;
                }

                public final String getHdImage() {
                    return this.hdImage;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final Query getQuery() {
                    return this.query;
                }

                public final List<String> getProductIdentifier() {
                    return this.productIdentifier;
                }

                public final String getSortBy() {
                    return this.sortBy;
                }

                public final String getSortDirection() {
                    return this.sortDirection;
                }

                public final boolean getAgeFiltered() {
                    return this.ageFiltered;
                }

                public final String getUrl() {
                    return this.url;
                }
            }
        }

        /* compiled from: MainContentItem.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010Jz\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006,"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Query;", "", "name", "", "author", "ageRangeMin", "", "ageRangeMax", "productType", "categoryCodes", "", "imprintName", "productState", "productGroupId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAgeRangeMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAgeRangeMin", "getAuthor", "()Ljava/lang/String;", "getCategoryCodes", "()Ljava/util/List;", "getImprintName", "getName", "getProductGroupId", "getProductState", "getProductType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Query;", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Query {
            private final Integer ageRangeMax;
            private final Integer ageRangeMin;
            private final String author;
            private final List<String> categoryCodes;
            private final String imprintName;
            private final String name;
            private final Integer productGroupId;
            private final String productState;
            private final String productType;

            public final String component1() {
                return this.name;
            }

            public final String component2() {
                return this.author;
            }

            public final Integer component3() {
                return this.ageRangeMin;
            }

            public final Integer component4() {
                return this.ageRangeMax;
            }

            public final String component5() {
                return this.productType;
            }

            public final List<String> component6() {
                return this.categoryCodes;
            }

            public final String component7() {
                return this.imprintName;
            }

            public final String component8() {
                return this.productState;
            }

            public final Integer component9() {
                return this.productGroupId;
            }

            public final Query copy(String name, String str, Integer num, Integer num2, String productType, List<String> categoryCodes, String str2, String str3, Integer num3) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(categoryCodes, "categoryCodes");
                return new Query(name, str, num, num2, productType, categoryCodes, str2, str3, num3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Query) {
                    Query query = (Query) obj;
                    return Intrinsics.areEqual(this.name, query.name) && Intrinsics.areEqual(this.author, query.author) && Intrinsics.areEqual(this.ageRangeMin, query.ageRangeMin) && Intrinsics.areEqual(this.ageRangeMax, query.ageRangeMax) && Intrinsics.areEqual(this.productType, query.productType) && Intrinsics.areEqual(this.categoryCodes, query.categoryCodes) && Intrinsics.areEqual(this.imprintName, query.imprintName) && Intrinsics.areEqual(this.productState, query.productState) && Intrinsics.areEqual(this.productGroupId, query.productGroupId);
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.name.hashCode() * 31;
                String str = this.author;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.ageRangeMin;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.ageRangeMax;
                int hashCode4 = (((((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.productType.hashCode()) * 31) + this.categoryCodes.hashCode()) * 31;
                String str2 = this.imprintName;
                int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.productState;
                int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num3 = this.productGroupId;
                return hashCode6 + (num3 != null ? num3.hashCode() : 0);
            }

            public String toString() {
                return "Query(name=" + this.name + ", author=" + this.author + ", ageRangeMin=" + this.ageRangeMin + ", ageRangeMax=" + this.ageRangeMax + ", productType=" + this.productType + ", categoryCodes=" + this.categoryCodes + ", imprintName=" + this.imprintName + ", productState=" + this.productState + ", productGroupId=" + this.productGroupId + ')';
            }

            public Query(String name, String str, Integer num, Integer num2, String productType, List<String> categoryCodes, String str2, String str3, Integer num3) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(categoryCodes, "categoryCodes");
                this.name = name;
                this.author = str;
                this.ageRangeMin = num;
                this.ageRangeMax = num2;
                this.productType = productType;
                this.categoryCodes = categoryCodes;
                this.imprintName = str2;
                this.productState = str3;
                this.productGroupId = num3;
            }

            public final String getName() {
                return this.name;
            }

            public final String getAuthor() {
                return this.author;
            }

            public final Integer getAgeRangeMin() {
                return this.ageRangeMin;
            }

            public final Integer getAgeRangeMax() {
                return this.ageRangeMax;
            }

            public final String getProductType() {
                return this.productType;
            }

            public final List<String> getCategoryCodes() {
                return this.categoryCodes;
            }

            public final String getImprintName() {
                return this.imprintName;
            }

            public final String getProductState() {
                return this.productState;
            }

            public final Integer getProductGroupId() {
                return this.productGroupId;
            }
        }

        /* compiled from: MainContentItem.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Icon;", "", "assetId", "", "clientId", "", "width", "height", "resizeMethod", "location", "Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Icon$Location;", "(ILjava/lang/String;IILjava/lang/String;Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Icon$Location;)V", "getAssetId", "()I", "getClientId", "()Ljava/lang/String;", "getHeight", "getLocation", "()Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Icon$Location;", "getResizeMethod", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Location", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Icon {
            private final int assetId;
            private final String clientId;
            private final int height;
            private final Location location;
            private final String resizeMethod;
            private final int width;

            public static /* synthetic */ Icon copy$default(Icon icon, int i, String str, int i2, int i3, String str2, Location location, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = icon.assetId;
                }
                if ((i4 & 2) != 0) {
                    str = icon.clientId;
                }
                String str3 = str;
                if ((i4 & 4) != 0) {
                    i2 = icon.width;
                }
                int i5 = i2;
                if ((i4 & 8) != 0) {
                    i3 = icon.height;
                }
                int i6 = i3;
                if ((i4 & 16) != 0) {
                    str2 = icon.resizeMethod;
                }
                String str4 = str2;
                if ((i4 & 32) != 0) {
                    location = icon.location;
                }
                return icon.copy(i, str3, i5, i6, str4, location);
            }

            public final int component1() {
                return this.assetId;
            }

            public final String component2() {
                return this.clientId;
            }

            public final int component3() {
                return this.width;
            }

            public final int component4() {
                return this.height;
            }

            public final String component5() {
                return this.resizeMethod;
            }

            public final Location component6() {
                return this.location;
            }

            public final Icon copy(int i, String str, int i2, int i3, String resizeMethod, Location location) {
                Intrinsics.checkNotNullParameter(resizeMethod, "resizeMethod");
                Intrinsics.checkNotNullParameter(location, "location");
                return new Icon(i, str, i2, i3, resizeMethod, location);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Icon) {
                    Icon icon = (Icon) obj;
                    return this.assetId == icon.assetId && Intrinsics.areEqual(this.clientId, icon.clientId) && this.width == icon.width && this.height == icon.height && Intrinsics.areEqual(this.resizeMethod, icon.resizeMethod) && Intrinsics.areEqual(this.location, icon.location);
                }
                return false;
            }

            public int hashCode() {
                int i = this.assetId * 31;
                String str = this.clientId;
                return ((((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.width) * 31) + this.height) * 31) + this.resizeMethod.hashCode()) * 31) + this.location.hashCode();
            }

            public String toString() {
                return "Icon(assetId=" + this.assetId + ", clientId=" + this.clientId + ", width=" + this.width + ", height=" + this.height + ", resizeMethod=" + this.resizeMethod + ", location=" + this.location + ')';
            }

            public Icon(int i, String str, int i2, int i3, String resizeMethod, Location location) {
                Intrinsics.checkNotNullParameter(resizeMethod, "resizeMethod");
                Intrinsics.checkNotNullParameter(location, "location");
                this.assetId = i;
                this.clientId = str;
                this.width = i2;
                this.height = i3;
                this.resizeMethod = resizeMethod;
                this.location = location;
            }

            public final int getAssetId() {
                return this.assetId;
            }

            public final String getClientId() {
                return this.clientId;
            }

            public final int getWidth() {
                return this.width;
            }

            public final int getHeight() {
                return this.height;
            }

            public final String getResizeMethod() {
                return this.resizeMethod;
            }

            public final Location getLocation() {
                return this.location;
            }

            /* compiled from: MainContentItem.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/MainContentItem$LayoutItem$Icon$Location;", "", "location", "", "expires", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpires", "()Ljava/lang/String;", "getLocation", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class Location {
                private final String expires;
                private final String location;

                public static /* synthetic */ Location copy$default(Location location, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = location.location;
                    }
                    if ((i & 2) != 0) {
                        str2 = location.expires;
                    }
                    return location.copy(str, str2);
                }

                public final String component1() {
                    return this.location;
                }

                public final String component2() {
                    return this.expires;
                }

                public final Location copy(String location, String str) {
                    Intrinsics.checkNotNullParameter(location, "location");
                    return new Location(location, str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Location) {
                        Location location = (Location) obj;
                        return Intrinsics.areEqual(this.location, location.location) && Intrinsics.areEqual(this.expires, location.expires);
                    }
                    return false;
                }

                public int hashCode() {
                    int hashCode = this.location.hashCode() * 31;
                    String str = this.expires;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    return "Location(location=" + this.location + ", expires=" + this.expires + ')';
                }

                public Location(String location, String str) {
                    Intrinsics.checkNotNullParameter(location, "location");
                    this.location = location;
                    this.expires = str;
                }

                public final String getLocation() {
                    return this.location;
                }

                public final String getExpires() {
                    return this.expires;
                }
            }
        }
    }
}
