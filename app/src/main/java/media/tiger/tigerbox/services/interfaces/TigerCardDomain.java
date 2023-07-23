package media.tiger.tigerbox.services.interfaces;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.dto.ProductDetailsDto;
import org.spongycastle.cms.CMSAttributeTableGenerator;

/* compiled from: TigerCardsManagerService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002./BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain;", "", "code", "", "uid", "cardType", "productId", "", "accountGeneratedContentId", "wildcardUserContent", "Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$AccountGeneratedContentsDomain;", "tigerTicketContent", "Lmedia/tiger/tigerbox/services/interfaces/TigerTicketDomain;", "multiTigercardVariant", "Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$AccountGeneratedContentsDomain;Lmedia/tiger/tigerbox/services/interfaces/TigerTicketDomain;Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain;)V", "getAccountGeneratedContentId", "()I", "getCardType", "()Ljava/lang/String;", "getCode", "getMultiTigercardVariant", "()Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain;", "getProductId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTigerTicketContent", "()Lmedia/tiger/tigerbox/services/interfaces/TigerTicketDomain;", "getUid", "getWildcardUserContent", "()Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$AccountGeneratedContentsDomain;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$AccountGeneratedContentsDomain;Lmedia/tiger/tigerbox/services/interfaces/TigerTicketDomain;Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain;)Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain;", "equals", "", "other", "hashCode", "toString", "AccountGeneratedContentsDomain", "MultiTigercardVariantDomain", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TigerCardDomain {
    private final int accountGeneratedContentId;
    private final String cardType;
    private final String code;
    private final MultiTigercardVariantDomain multiTigercardVariant;
    private final Integer productId;
    private final TigerTicketDomain tigerTicketContent;
    private final String uid;
    private final AccountGeneratedContentsDomain wildcardUserContent;

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.uid;
    }

    public final String component3() {
        return this.cardType;
    }

    public final Integer component4() {
        return this.productId;
    }

    public final int component5() {
        return this.accountGeneratedContentId;
    }

    public final AccountGeneratedContentsDomain component6() {
        return this.wildcardUserContent;
    }

    public final TigerTicketDomain component7() {
        return this.tigerTicketContent;
    }

    public final MultiTigercardVariantDomain component8() {
        return this.multiTigercardVariant;
    }

    public final TigerCardDomain copy(String code, String uid, String cardType, Integer num, int i, AccountGeneratedContentsDomain accountGeneratedContentsDomain, TigerTicketDomain tigerTicketDomain, MultiTigercardVariantDomain multiTigercardVariantDomain) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        return new TigerCardDomain(code, uid, cardType, num, i, accountGeneratedContentsDomain, tigerTicketDomain, multiTigercardVariantDomain);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerCardDomain) {
            TigerCardDomain tigerCardDomain = (TigerCardDomain) obj;
            return Intrinsics.areEqual(this.code, tigerCardDomain.code) && Intrinsics.areEqual(this.uid, tigerCardDomain.uid) && Intrinsics.areEqual(this.cardType, tigerCardDomain.cardType) && Intrinsics.areEqual(this.productId, tigerCardDomain.productId) && this.accountGeneratedContentId == tigerCardDomain.accountGeneratedContentId && Intrinsics.areEqual(this.wildcardUserContent, tigerCardDomain.wildcardUserContent) && Intrinsics.areEqual(this.tigerTicketContent, tigerCardDomain.tigerTicketContent) && Intrinsics.areEqual(this.multiTigercardVariant, tigerCardDomain.multiTigercardVariant);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.code.hashCode() * 31) + this.uid.hashCode()) * 31) + this.cardType.hashCode()) * 31;
        Integer num = this.productId;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.accountGeneratedContentId) * 31;
        AccountGeneratedContentsDomain accountGeneratedContentsDomain = this.wildcardUserContent;
        int hashCode3 = (hashCode2 + (accountGeneratedContentsDomain == null ? 0 : accountGeneratedContentsDomain.hashCode())) * 31;
        TigerTicketDomain tigerTicketDomain = this.tigerTicketContent;
        int hashCode4 = (hashCode3 + (tigerTicketDomain == null ? 0 : tigerTicketDomain.hashCode())) * 31;
        MultiTigercardVariantDomain multiTigercardVariantDomain = this.multiTigercardVariant;
        return hashCode4 + (multiTigercardVariantDomain != null ? multiTigercardVariantDomain.hashCode() : 0);
    }

    public String toString() {
        return "TigerCardDomain(code=" + this.code + ", uid=" + this.uid + ", cardType=" + this.cardType + ", productId=" + this.productId + ", accountGeneratedContentId=" + this.accountGeneratedContentId + ", wildcardUserContent=" + this.wildcardUserContent + ", tigerTicketContent=" + this.tigerTicketContent + ", multiTigercardVariant=" + this.multiTigercardVariant + ')';
    }

    public TigerCardDomain(String code, String uid, String cardType, Integer num, int i, AccountGeneratedContentsDomain accountGeneratedContentsDomain, TigerTicketDomain tigerTicketDomain, MultiTigercardVariantDomain multiTigercardVariantDomain) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        this.code = code;
        this.uid = uid;
        this.cardType = cardType;
        this.productId = num;
        this.accountGeneratedContentId = i;
        this.wildcardUserContent = accountGeneratedContentsDomain;
        this.tigerTicketContent = tigerTicketDomain;
        this.multiTigercardVariant = multiTigercardVariantDomain;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final Integer getProductId() {
        return this.productId;
    }

    public final int getAccountGeneratedContentId() {
        return this.accountGeneratedContentId;
    }

    public final AccountGeneratedContentsDomain getWildcardUserContent() {
        return this.wildcardUserContent;
    }

    public final TigerTicketDomain getTigerTicketContent() {
        return this.tigerTicketContent;
    }

    public final MultiTigercardVariantDomain getMultiTigercardVariant() {
        return this.multiTigercardVariant;
    }

    /* compiled from: TigerCardsManagerService.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$AccountGeneratedContentsDomain;", "", "name", "", "accountId", "", "totalDuration", CMSAttributeTableGenerator.CONTENT_TYPE, "transcodingStatus", "lastModifiedDate", "playlistLink", "coverLink", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()I", "getContentType", "()Ljava/lang/String;", "getCoverLink", "getLastModifiedDate", "getName", "getPlaylistLink", "getTotalDuration", "getTranscodingStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AccountGeneratedContentsDomain {
        private final int accountId;
        private final String contentType;
        private final String coverLink;
        private final String lastModifiedDate;
        private final String name;
        private final String playlistLink;
        private final int totalDuration;
        private final String transcodingStatus;

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.accountId;
        }

        public final int component3() {
            return this.totalDuration;
        }

        public final String component4() {
            return this.contentType;
        }

        public final String component5() {
            return this.transcodingStatus;
        }

        public final String component6() {
            return this.lastModifiedDate;
        }

        public final String component7() {
            return this.playlistLink;
        }

        public final String component8() {
            return this.coverLink;
        }

        public final AccountGeneratedContentsDomain copy(String name, int i, int i2, String contentType, String transcodingStatus, String lastModifiedDate, String playlistLink, String coverLink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(transcodingStatus, "transcodingStatus");
            Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
            Intrinsics.checkNotNullParameter(playlistLink, "playlistLink");
            Intrinsics.checkNotNullParameter(coverLink, "coverLink");
            return new AccountGeneratedContentsDomain(name, i, i2, contentType, transcodingStatus, lastModifiedDate, playlistLink, coverLink);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccountGeneratedContentsDomain) {
                AccountGeneratedContentsDomain accountGeneratedContentsDomain = (AccountGeneratedContentsDomain) obj;
                return Intrinsics.areEqual(this.name, accountGeneratedContentsDomain.name) && this.accountId == accountGeneratedContentsDomain.accountId && this.totalDuration == accountGeneratedContentsDomain.totalDuration && Intrinsics.areEqual(this.contentType, accountGeneratedContentsDomain.contentType) && Intrinsics.areEqual(this.transcodingStatus, accountGeneratedContentsDomain.transcodingStatus) && Intrinsics.areEqual(this.lastModifiedDate, accountGeneratedContentsDomain.lastModifiedDate) && Intrinsics.areEqual(this.playlistLink, accountGeneratedContentsDomain.playlistLink) && Intrinsics.areEqual(this.coverLink, accountGeneratedContentsDomain.coverLink);
            }
            return false;
        }

        public int hashCode() {
            return (((((((((((((this.name.hashCode() * 31) + this.accountId) * 31) + this.totalDuration) * 31) + this.contentType.hashCode()) * 31) + this.transcodingStatus.hashCode()) * 31) + this.lastModifiedDate.hashCode()) * 31) + this.playlistLink.hashCode()) * 31) + this.coverLink.hashCode();
        }

        public String toString() {
            return "AccountGeneratedContentsDomain(name=" + this.name + ", accountId=" + this.accountId + ", totalDuration=" + this.totalDuration + ", contentType=" + this.contentType + ", transcodingStatus=" + this.transcodingStatus + ", lastModifiedDate=" + this.lastModifiedDate + ", playlistLink=" + this.playlistLink + ", coverLink=" + this.coverLink + ')';
        }

        public AccountGeneratedContentsDomain(String name, int i, int i2, String contentType, String transcodingStatus, String lastModifiedDate, String playlistLink, String coverLink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(transcodingStatus, "transcodingStatus");
            Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
            Intrinsics.checkNotNullParameter(playlistLink, "playlistLink");
            Intrinsics.checkNotNullParameter(coverLink, "coverLink");
            this.name = name;
            this.accountId = i;
            this.totalDuration = i2;
            this.contentType = contentType;
            this.transcodingStatus = transcodingStatus;
            this.lastModifiedDate = lastModifiedDate;
            this.playlistLink = playlistLink;
            this.coverLink = coverLink;
        }

        public final String getName() {
            return this.name;
        }

        public final int getAccountId() {
            return this.accountId;
        }

        public final int getTotalDuration() {
            return this.totalDuration;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getTranscodingStatus() {
            return this.transcodingStatus;
        }

        public final String getLastModifiedDate() {
            return this.lastModifiedDate;
        }

        public final String getPlaylistLink() {
            return this.playlistLink;
        }

        public final String getCoverLink() {
            return this.coverLink;
        }
    }

    /* compiled from: TigerCardsManagerService.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001,B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Js\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006-"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain;", "", "name", "", "description", "createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate", "products", "", "Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto;", "recentlyUsedProduct", "Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain$RecentlyUsedProductDomain;", "saveRecentlyUsedMultiTigercardProductUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain$RecentlyUsedProductDomain;Ljava/lang/String;)V", "getCreatedBy", "()Ljava/lang/String;", "getCreatedDate", "getDescription", "getLastModifiedBy", "getLastModifiedDate", "getName", "getProducts", "()Ljava/util/List;", "getRecentlyUsedProduct", "()Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain$RecentlyUsedProductDomain;", "getSaveRecentlyUsedMultiTigercardProductUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "RecentlyUsedProductDomain", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MultiTigercardVariantDomain {
        private final String createdBy;
        private final String createdDate;
        private final String description;
        private final String lastModifiedBy;
        private final String lastModifiedDate;
        private final String name;
        private final List<ProductDetailsDto> products;
        private final RecentlyUsedProductDomain recentlyUsedProduct;
        private final String saveRecentlyUsedMultiTigercardProductUrl;

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.description;
        }

        public final String component3() {
            return this.createdBy;
        }

        public final String component4() {
            return this.createdDate;
        }

        public final String component5() {
            return this.lastModifiedBy;
        }

        public final String component6() {
            return this.lastModifiedDate;
        }

        public final List<ProductDetailsDto> component7() {
            return this.products;
        }

        public final RecentlyUsedProductDomain component8() {
            return this.recentlyUsedProduct;
        }

        public final String component9() {
            return this.saveRecentlyUsedMultiTigercardProductUrl;
        }

        public final MultiTigercardVariantDomain copy(String name, String description, String createdBy, String createdDate, String str, String str2, List<ProductDetailsDto> list, RecentlyUsedProductDomain recentlyUsedProductDomain, String str3) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(createdBy, "createdBy");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            return new MultiTigercardVariantDomain(name, description, createdBy, createdDate, str, str2, list, recentlyUsedProductDomain, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MultiTigercardVariantDomain) {
                MultiTigercardVariantDomain multiTigercardVariantDomain = (MultiTigercardVariantDomain) obj;
                return Intrinsics.areEqual(this.name, multiTigercardVariantDomain.name) && Intrinsics.areEqual(this.description, multiTigercardVariantDomain.description) && Intrinsics.areEqual(this.createdBy, multiTigercardVariantDomain.createdBy) && Intrinsics.areEqual(this.createdDate, multiTigercardVariantDomain.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, multiTigercardVariantDomain.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, multiTigercardVariantDomain.lastModifiedDate) && Intrinsics.areEqual(this.products, multiTigercardVariantDomain.products) && Intrinsics.areEqual(this.recentlyUsedProduct, multiTigercardVariantDomain.recentlyUsedProduct) && Intrinsics.areEqual(this.saveRecentlyUsedMultiTigercardProductUrl, multiTigercardVariantDomain.saveRecentlyUsedMultiTigercardProductUrl);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((((this.name.hashCode() * 31) + this.description.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.createdDate.hashCode()) * 31;
            String str = this.lastModifiedBy;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lastModifiedDate;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<ProductDetailsDto> list = this.products;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            RecentlyUsedProductDomain recentlyUsedProductDomain = this.recentlyUsedProduct;
            int hashCode5 = (hashCode4 + (recentlyUsedProductDomain == null ? 0 : recentlyUsedProductDomain.hashCode())) * 31;
            String str3 = this.saveRecentlyUsedMultiTigercardProductUrl;
            return hashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "MultiTigercardVariantDomain(name=" + this.name + ", description=" + this.description + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ", products=" + this.products + ", recentlyUsedProduct=" + this.recentlyUsedProduct + ", saveRecentlyUsedMultiTigercardProductUrl=" + this.saveRecentlyUsedMultiTigercardProductUrl + ')';
        }

        public MultiTigercardVariantDomain(String name, String description, String createdBy, String createdDate, String str, String str2, List<ProductDetailsDto> list, RecentlyUsedProductDomain recentlyUsedProductDomain, String str3) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(createdBy, "createdBy");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            this.name = name;
            this.description = description;
            this.createdBy = createdBy;
            this.createdDate = createdDate;
            this.lastModifiedBy = str;
            this.lastModifiedDate = str2;
            this.products = list;
            this.recentlyUsedProduct = recentlyUsedProductDomain;
            this.saveRecentlyUsedMultiTigercardProductUrl = str3;
        }

        public final String getName() {
            return this.name;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getCreatedBy() {
            return this.createdBy;
        }

        public final String getCreatedDate() {
            return this.createdDate;
        }

        public final String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        public final String getLastModifiedDate() {
            return this.lastModifiedDate;
        }

        public final List<ProductDetailsDto> getProducts() {
            return this.products;
        }

        public final RecentlyUsedProductDomain getRecentlyUsedProduct() {
            return this.recentlyUsedProduct;
        }

        public final String getSaveRecentlyUsedMultiTigercardProductUrl() {
            return this.saveRecentlyUsedMultiTigercardProductUrl;
        }

        /* compiled from: TigerCardsManagerService.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/TigerCardDomain$MultiTigercardVariantDomain$RecentlyUsedProductDomain;", "", "multiTigercardVariantId", "", "profileId", "productId", "createdBy", "", "createdDate", "lastModifiedBy", "lastModifiedDate", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedBy", "()Ljava/lang/String;", "getCreatedDate", "getLastModifiedBy", "getLastModifiedDate", "getMultiTigercardVariantId", "()I", "getProductId", "getProfileId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class RecentlyUsedProductDomain {
            private final String createdBy;
            private final String createdDate;
            private final String lastModifiedBy;
            private final String lastModifiedDate;
            private final int multiTigercardVariantId;
            private final int productId;
            private final int profileId;

            public static /* synthetic */ RecentlyUsedProductDomain copy$default(RecentlyUsedProductDomain recentlyUsedProductDomain, int i, int i2, int i3, String str, String str2, String str3, String str4, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = recentlyUsedProductDomain.multiTigercardVariantId;
                }
                if ((i4 & 2) != 0) {
                    i2 = recentlyUsedProductDomain.profileId;
                }
                int i5 = i2;
                if ((i4 & 4) != 0) {
                    i3 = recentlyUsedProductDomain.productId;
                }
                int i6 = i3;
                if ((i4 & 8) != 0) {
                    str = recentlyUsedProductDomain.createdBy;
                }
                String str5 = str;
                if ((i4 & 16) != 0) {
                    str2 = recentlyUsedProductDomain.createdDate;
                }
                String str6 = str2;
                if ((i4 & 32) != 0) {
                    str3 = recentlyUsedProductDomain.lastModifiedBy;
                }
                String str7 = str3;
                if ((i4 & 64) != 0) {
                    str4 = recentlyUsedProductDomain.lastModifiedDate;
                }
                return recentlyUsedProductDomain.copy(i, i5, i6, str5, str6, str7, str4);
            }

            public final int component1() {
                return this.multiTigercardVariantId;
            }

            public final int component2() {
                return this.profileId;
            }

            public final int component3() {
                return this.productId;
            }

            public final String component4() {
                return this.createdBy;
            }

            public final String component5() {
                return this.createdDate;
            }

            public final String component6() {
                return this.lastModifiedBy;
            }

            public final String component7() {
                return this.lastModifiedDate;
            }

            public final RecentlyUsedProductDomain copy(int i, int i2, int i3, String createdBy, String createdDate, String str, String str2) {
                Intrinsics.checkNotNullParameter(createdBy, "createdBy");
                Intrinsics.checkNotNullParameter(createdDate, "createdDate");
                return new RecentlyUsedProductDomain(i, i2, i3, createdBy, createdDate, str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RecentlyUsedProductDomain) {
                    RecentlyUsedProductDomain recentlyUsedProductDomain = (RecentlyUsedProductDomain) obj;
                    return this.multiTigercardVariantId == recentlyUsedProductDomain.multiTigercardVariantId && this.profileId == recentlyUsedProductDomain.profileId && this.productId == recentlyUsedProductDomain.productId && Intrinsics.areEqual(this.createdBy, recentlyUsedProductDomain.createdBy) && Intrinsics.areEqual(this.createdDate, recentlyUsedProductDomain.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, recentlyUsedProductDomain.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, recentlyUsedProductDomain.lastModifiedDate);
                }
                return false;
            }

            public int hashCode() {
                int hashCode = ((((((((this.multiTigercardVariantId * 31) + this.profileId) * 31) + this.productId) * 31) + this.createdBy.hashCode()) * 31) + this.createdDate.hashCode()) * 31;
                String str = this.lastModifiedBy;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.lastModifiedDate;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "RecentlyUsedProductDomain(multiTigercardVariantId=" + this.multiTigercardVariantId + ", profileId=" + this.profileId + ", productId=" + this.productId + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ')';
            }

            public RecentlyUsedProductDomain(int i, int i2, int i3, String createdBy, String createdDate, String str, String str2) {
                Intrinsics.checkNotNullParameter(createdBy, "createdBy");
                Intrinsics.checkNotNullParameter(createdDate, "createdDate");
                this.multiTigercardVariantId = i;
                this.profileId = i2;
                this.productId = i3;
                this.createdBy = createdBy;
                this.createdDate = createdDate;
                this.lastModifiedBy = str;
                this.lastModifiedDate = str2;
            }

            public /* synthetic */ RecentlyUsedProductDomain(int i, int i2, int i3, String str, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, i3, str, str2, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? null : str4);
            }

            public final int getMultiTigercardVariantId() {
                return this.multiTigercardVariantId;
            }

            public final int getProfileId() {
                return this.profileId;
            }

            public final int getProductId() {
                return this.productId;
            }

            public final String getCreatedBy() {
                return this.createdBy;
            }

            public final String getCreatedDate() {
                return this.createdDate;
            }

            public final String getLastModifiedBy() {
                return this.lastModifiedBy;
            }

            public final String getLastModifiedDate() {
                return this.lastModifiedDate;
            }
        }
    }
}
