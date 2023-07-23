package media.tiger.tigerbox.model.dto;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserProductPlayStates.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ProductPlayStates;", "", "_embedded", "Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded;", "(Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded;)V", "get_embedded", "()Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Embedded", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductPlayStates {
    private final Embedded _embedded;

    public static /* synthetic */ ProductPlayStates copy$default(ProductPlayStates productPlayStates, Embedded embedded, int i, Object obj) {
        if ((i & 1) != 0) {
            embedded = productPlayStates._embedded;
        }
        return productPlayStates.copy(embedded);
    }

    public final Embedded component1() {
        return this._embedded;
    }

    public final ProductPlayStates copy(Embedded embedded) {
        return new ProductPlayStates(embedded);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductPlayStates) && Intrinsics.areEqual(this._embedded, ((ProductPlayStates) obj)._embedded);
    }

    public int hashCode() {
        Embedded embedded = this._embedded;
        if (embedded == null) {
            return 0;
        }
        return embedded.hashCode();
    }

    public String toString() {
        return "ProductPlayStates(_embedded=" + this._embedded + ')';
    }

    public ProductPlayStates(Embedded embedded) {
        this._embedded = embedded;
    }

    public final Embedded get_embedded() {
        return this._embedded;
    }

    /* compiled from: UserProductPlayStates.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded;", "", "productPlayStates", "", "Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content;", "(Ljava/util/List;)V", "getProductPlayStates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Content", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Embedded {
        private final List<Content> productPlayStates;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Embedded copy$default(Embedded embedded, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = embedded.productPlayStates;
            }
            return embedded.copy(list);
        }

        public final List<Content> component1() {
            return this.productPlayStates;
        }

        public final Embedded copy(List<Content> productPlayStates) {
            Intrinsics.checkNotNullParameter(productPlayStates, "productPlayStates");
            return new Embedded(productPlayStates);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Embedded) && Intrinsics.areEqual(this.productPlayStates, ((Embedded) obj).productPlayStates);
        }

        public int hashCode() {
            return this.productPlayStates.hashCode();
        }

        public String toString() {
            return "Embedded(productPlayStates=" + this.productPlayStates + ')';
        }

        /* compiled from: UserProductPlayStates.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content;", "", TtmlNode.ATTR_ID, "", "productId", "userId", "trackNumber", "trackPosition", "lastModifiedDate", "", "_links", "Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content$Link;", "(IIIIILjava/lang/String;Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content$Link;)V", "get_links", "()Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content$Link;", "getId", "()I", "getLastModifiedDate", "()Ljava/lang/String;", "getProductId", "getTrackNumber", "getTrackPosition", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", HttpHeaders.LINK, "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Content {
            private final Link _links;
            private final int id;
            private final String lastModifiedDate;
            private final int productId;
            private final int trackNumber;
            private final int trackPosition;
            private final int userId;

            public static /* synthetic */ Content copy$default(Content content, int i, int i2, int i3, int i4, int i5, String str, Link link, int i6, Object obj) {
                if ((i6 & 1) != 0) {
                    i = content.id;
                }
                if ((i6 & 2) != 0) {
                    i2 = content.productId;
                }
                int i7 = i2;
                if ((i6 & 4) != 0) {
                    i3 = content.userId;
                }
                int i8 = i3;
                if ((i6 & 8) != 0) {
                    i4 = content.trackNumber;
                }
                int i9 = i4;
                if ((i6 & 16) != 0) {
                    i5 = content.trackPosition;
                }
                int i10 = i5;
                if ((i6 & 32) != 0) {
                    str = content.lastModifiedDate;
                }
                String str2 = str;
                if ((i6 & 64) != 0) {
                    link = content._links;
                }
                return content.copy(i, i7, i8, i9, i10, str2, link);
            }

            public final int component1() {
                return this.id;
            }

            public final int component2() {
                return this.productId;
            }

            public final int component3() {
                return this.userId;
            }

            public final int component4() {
                return this.trackNumber;
            }

            public final int component5() {
                return this.trackPosition;
            }

            public final String component6() {
                return this.lastModifiedDate;
            }

            public final Link component7() {
                return this._links;
            }

            public final Content copy(int i, int i2, int i3, int i4, int i5, String str, Link _links) {
                Intrinsics.checkNotNullParameter(_links, "_links");
                return new Content(i, i2, i3, i4, i5, str, _links);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Content) {
                    Content content = (Content) obj;
                    return this.id == content.id && this.productId == content.productId && this.userId == content.userId && this.trackNumber == content.trackNumber && this.trackPosition == content.trackPosition && Intrinsics.areEqual(this.lastModifiedDate, content.lastModifiedDate) && Intrinsics.areEqual(this._links, content._links);
                }
                return false;
            }

            public int hashCode() {
                int i = ((((((((this.id * 31) + this.productId) * 31) + this.userId) * 31) + this.trackNumber) * 31) + this.trackPosition) * 31;
                String str = this.lastModifiedDate;
                return ((i + (str == null ? 0 : str.hashCode())) * 31) + this._links.hashCode();
            }

            public String toString() {
                return "Content(id=" + this.id + ", productId=" + this.productId + ", userId=" + this.userId + ", trackNumber=" + this.trackNumber + ", trackPosition=" + this.trackPosition + ", lastModifiedDate=" + this.lastModifiedDate + ", _links=" + this._links + ')';
            }

            public Content(int i, int i2, int i3, int i4, int i5, String str, Link _links) {
                Intrinsics.checkNotNullParameter(_links, "_links");
                this.id = i;
                this.productId = i2;
                this.userId = i3;
                this.trackNumber = i4;
                this.trackPosition = i5;
                this.lastModifiedDate = str;
                this._links = _links;
            }

            public final int getId() {
                return this.id;
            }

            public final int getProductId() {
                return this.productId;
            }

            public final int getUserId() {
                return this.userId;
            }

            public final int getTrackNumber() {
                return this.trackNumber;
            }

            public final int getTrackPosition() {
                return this.trackPosition;
            }

            public final String getLastModifiedDate() {
                return this.lastModifiedDate;
            }

            public final Link get_links() {
                return this._links;
            }

            /* compiled from: UserProductPlayStates.kt */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content$Link;", "", "product", "Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content$Link$Href;", "(Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content$Link$Href;)V", "getProduct", "()Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content$Link$Href;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Href", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class Link {
                private final Href product;

                public static /* synthetic */ Link copy$default(Link link, Href href, int i, Object obj) {
                    if ((i & 1) != 0) {
                        href = link.product;
                    }
                    return link.copy(href);
                }

                public final Href component1() {
                    return this.product;
                }

                public final Link copy(Href product) {
                    Intrinsics.checkNotNullParameter(product, "product");
                    return new Link(product);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Link) && Intrinsics.areEqual(this.product, ((Link) obj).product);
                }

                public int hashCode() {
                    return this.product.hashCode();
                }

                public String toString() {
                    return "Link(product=" + this.product + ')';
                }

                /* compiled from: UserProductPlayStates.kt */
                @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/ProductPlayStates$Embedded$Content$Link$Href;", "", "href", "", "(Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
                /* loaded from: classes3.dex */
                public static final class Href {
                    private final String href;

                    public static /* synthetic */ Href copy$default(Href href, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = href.href;
                        }
                        return href.copy(str);
                    }

                    public final String component1() {
                        return this.href;
                    }

                    public final Href copy(String href) {
                        Intrinsics.checkNotNullParameter(href, "href");
                        return new Href(href);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Href) && Intrinsics.areEqual(this.href, ((Href) obj).href);
                    }

                    public int hashCode() {
                        return this.href.hashCode();
                    }

                    public String toString() {
                        return "Href(href=" + this.href + ')';
                    }

                    public Href(String href) {
                        Intrinsics.checkNotNullParameter(href, "href");
                        this.href = href;
                    }

                    public final String getHref() {
                        return this.href;
                    }
                }

                public Link(Href product) {
                    Intrinsics.checkNotNullParameter(product, "product");
                    this.product = product;
                }

                public final Href getProduct() {
                    return this.product;
                }
            }
        }

        public Embedded(List<Content> productPlayStates) {
            Intrinsics.checkNotNullParameter(productPlayStates, "productPlayStates");
            this.productPlayStates = productPlayStates;
        }

        public final List<Content> getProductPlayStates() {
            return this.productPlayStates;
        }
    }
}
