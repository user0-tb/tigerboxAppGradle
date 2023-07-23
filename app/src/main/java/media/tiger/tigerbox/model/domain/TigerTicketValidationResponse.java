package media.tiger.tigerbox.model.domain;

import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerTicketPurchase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006#"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse;", "", "valid", "", "code", "", "errorCode", "message", "", "value", "_links", "Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link;", "(ZIILjava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link;)V", "get_links", "()Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link;", "getCode", "()I", "getErrorCode", "getMessage", "()Ljava/lang/String;", "getValid", "()Z", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", HttpHeaders.LINK, "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerTicketValidationResponse {
    private final Link _links;
    private final int code;
    private final int errorCode;
    private final String message;
    private final boolean valid;
    private final String value;

    public static /* synthetic */ TigerTicketValidationResponse copy$default(TigerTicketValidationResponse tigerTicketValidationResponse, boolean z, int i, int i2, String str, String str2, Link link, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = tigerTicketValidationResponse.valid;
        }
        if ((i3 & 2) != 0) {
            i = tigerTicketValidationResponse.code;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = tigerTicketValidationResponse.errorCode;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = tigerTicketValidationResponse.message;
        }
        String str3 = str;
        if ((i3 & 16) != 0) {
            str2 = tigerTicketValidationResponse.value;
        }
        String str4 = str2;
        if ((i3 & 32) != 0) {
            link = tigerTicketValidationResponse._links;
        }
        return tigerTicketValidationResponse.copy(z, i4, i5, str3, str4, link);
    }

    public final boolean component1() {
        return this.valid;
    }

    public final int component2() {
        return this.code;
    }

    public final int component3() {
        return this.errorCode;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.value;
    }

    public final Link component6() {
        return this._links;
    }

    public final TigerTicketValidationResponse copy(boolean z, int i, int i2, String str, String str2, Link link) {
        return new TigerTicketValidationResponse(z, i, i2, str, str2, link);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerTicketValidationResponse) {
            TigerTicketValidationResponse tigerTicketValidationResponse = (TigerTicketValidationResponse) obj;
            return this.valid == tigerTicketValidationResponse.valid && this.code == tigerTicketValidationResponse.code && this.errorCode == tigerTicketValidationResponse.errorCode && Intrinsics.areEqual(this.message, tigerTicketValidationResponse.message) && Intrinsics.areEqual(this.value, tigerTicketValidationResponse.value) && Intrinsics.areEqual(this._links, tigerTicketValidationResponse._links);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.valid;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((((r0 * 31) + this.code) * 31) + this.errorCode) * 31;
        String str = this.message;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Link link = this._links;
        return hashCode2 + (link != null ? link.hashCode() : 0);
    }

    public String toString() {
        return "TigerTicketValidationResponse(valid=" + this.valid + ", code=" + this.code + ", errorCode=" + this.errorCode + ", message=" + this.message + ", value=" + this.value + ", _links=" + this._links + ')';
    }

    public TigerTicketValidationResponse(boolean z, int i, int i2, String str, String str2, Link link) {
        this.valid = z;
        this.code = i;
        this.errorCode = i2;
        this.message = str;
        this.value = str2;
        this._links = link;
    }

    public /* synthetic */ TigerTicketValidationResponse(boolean z, int i, int i2, String str, String str2, Link link, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : link);
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getValue() {
        return this.value;
    }

    public final Link get_links() {
        return this._links;
    }

    /* compiled from: TigerTicketPurchase.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link;", "", "self", "Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link$Href;", "preview", "order", "(Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link$Href;Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link$Href;Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link$Href;)V", "getOrder", "()Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link$Href;", "getPreview", "getSelf", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Href", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Link {
        private final Href order;
        private final Href preview;
        private final Href self;

        public static /* synthetic */ Link copy$default(Link link, Href href, Href href2, Href href3, int i, Object obj) {
            if ((i & 1) != 0) {
                href = link.self;
            }
            if ((i & 2) != 0) {
                href2 = link.preview;
            }
            if ((i & 4) != 0) {
                href3 = link.order;
            }
            return link.copy(href, href2, href3);
        }

        public final Href component1() {
            return this.self;
        }

        public final Href component2() {
            return this.preview;
        }

        public final Href component3() {
            return this.order;
        }

        public final Link copy(Href href, Href href2, Href href3) {
            return new Link(href, href2, href3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Link) {
                Link link = (Link) obj;
                return Intrinsics.areEqual(this.self, link.self) && Intrinsics.areEqual(this.preview, link.preview) && Intrinsics.areEqual(this.order, link.order);
            }
            return false;
        }

        public int hashCode() {
            Href href = this.self;
            int hashCode = (href == null ? 0 : href.hashCode()) * 31;
            Href href2 = this.preview;
            int hashCode2 = (hashCode + (href2 == null ? 0 : href2.hashCode())) * 31;
            Href href3 = this.order;
            return hashCode2 + (href3 != null ? href3.hashCode() : 0);
        }

        public String toString() {
            return "Link(self=" + this.self + ", preview=" + this.preview + ", order=" + this.order + ')';
        }

        public Link(Href href, Href href2, Href href3) {
            this.self = href;
            this.preview = href2;
            this.order = href3;
        }

        public final Href getSelf() {
            return this.self;
        }

        public final Href getPreview() {
            return this.preview;
        }

        public final Href getOrder() {
            return this.order;
        }

        /* compiled from: TigerTicketPurchase.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/TigerTicketValidationResponse$Link$Href;", "", "href", "", "(Ljava/lang/String;)V", "getHref", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
    }
}
