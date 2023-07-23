package media.tiger.tigerbox.model.dto;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.net.HttpHeaders;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: TigerCardValidState.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001:\u0004DEFGB{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00104\u001a\u00020\u0014HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010-J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0001HÆ\u0003J\t\u0010=\u001a\u00020\u0001HÆ\u0003J \u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0007HÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!¨\u0006H"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState;", "", "code", "", "uid", "cardType", "productId", "", "enabled", "", "createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate", "accountGeneratedContentId", "_embedded", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded;", "multiTigercardVariant", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$MultiTigercardVariant;", "_links", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links;", "_templates", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$MultiTigercardVariant;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates;)V", "get_embedded", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded;", "get_links", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links;", "get_templates", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates;", "getAccountGeneratedContentId", "()I", "getCardType", "()Ljava/lang/String;", "getCode", "getCreatedBy", "getCreatedDate", "getEnabled", "()Z", "getLastModifiedBy", "()Ljava/lang/Object;", "getLastModifiedDate", "getMultiTigercardVariant", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$MultiTigercardVariant;", "getProductId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUid", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$MultiTigercardVariant;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates;)Lmedia/tiger/tigerbox/model/dto/TigerCardValidState;", "equals", "other", "hashCode", "toString", "Embedded", "Links", "MultiTigercardVariant", "Templates", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerCardValidState {
    private final Embedded _embedded;
    private final Links _links;
    private final Templates _templates;
    private final int accountGeneratedContentId;
    private final String cardType;
    private final String code;
    private final String createdBy;
    private final String createdDate;
    private final boolean enabled;
    private final Object lastModifiedBy;
    private final Object lastModifiedDate;
    private final MultiTigercardVariant multiTigercardVariant;
    private final Integer productId;
    private final String uid;

    public final String component1() {
        return this.code;
    }

    public final int component10() {
        return this.accountGeneratedContentId;
    }

    public final Embedded component11() {
        return this._embedded;
    }

    public final MultiTigercardVariant component12() {
        return this.multiTigercardVariant;
    }

    public final Links component13() {
        return this._links;
    }

    public final Templates component14() {
        return this._templates;
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

    public final boolean component5() {
        return this.enabled;
    }

    public final String component6() {
        return this.createdBy;
    }

    public final String component7() {
        return this.createdDate;
    }

    public final Object component8() {
        return this.lastModifiedBy;
    }

    public final Object component9() {
        return this.lastModifiedDate;
    }

    public final TigerCardValidState copy(String code, String uid, String cardType, Integer num, boolean z, String createdBy, String createdDate, Object lastModifiedBy, Object lastModifiedDate, int i, Embedded _embedded, MultiTigercardVariant multiTigercardVariant, Links _links, Templates templates) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastModifiedBy, "lastModifiedBy");
        Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
        Intrinsics.checkNotNullParameter(_embedded, "_embedded");
        Intrinsics.checkNotNullParameter(_links, "_links");
        return new TigerCardValidState(code, uid, cardType, num, z, createdBy, createdDate, lastModifiedBy, lastModifiedDate, i, _embedded, multiTigercardVariant, _links, templates);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerCardValidState) {
            TigerCardValidState tigerCardValidState = (TigerCardValidState) obj;
            return Intrinsics.areEqual(this.code, tigerCardValidState.code) && Intrinsics.areEqual(this.uid, tigerCardValidState.uid) && Intrinsics.areEqual(this.cardType, tigerCardValidState.cardType) && Intrinsics.areEqual(this.productId, tigerCardValidState.productId) && this.enabled == tigerCardValidState.enabled && Intrinsics.areEqual(this.createdBy, tigerCardValidState.createdBy) && Intrinsics.areEqual(this.createdDate, tigerCardValidState.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, tigerCardValidState.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, tigerCardValidState.lastModifiedDate) && this.accountGeneratedContentId == tigerCardValidState.accountGeneratedContentId && Intrinsics.areEqual(this._embedded, tigerCardValidState._embedded) && Intrinsics.areEqual(this.multiTigercardVariant, tigerCardValidState.multiTigercardVariant) && Intrinsics.areEqual(this._links, tigerCardValidState._links) && Intrinsics.areEqual(this._templates, tigerCardValidState._templates);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.code.hashCode() * 31) + this.uid.hashCode()) * 31) + this.cardType.hashCode()) * 31;
        Integer num = this.productId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode3 = (((((((((((((hashCode2 + i) * 31) + this.createdBy.hashCode()) * 31) + this.createdDate.hashCode()) * 31) + this.lastModifiedBy.hashCode()) * 31) + this.lastModifiedDate.hashCode()) * 31) + this.accountGeneratedContentId) * 31) + this._embedded.hashCode()) * 31;
        MultiTigercardVariant multiTigercardVariant = this.multiTigercardVariant;
        int hashCode4 = (((hashCode3 + (multiTigercardVariant == null ? 0 : multiTigercardVariant.hashCode())) * 31) + this._links.hashCode()) * 31;
        Templates templates = this._templates;
        return hashCode4 + (templates != null ? templates.hashCode() : 0);
    }

    public String toString() {
        return "TigerCardValidState(code=" + this.code + ", uid=" + this.uid + ", cardType=" + this.cardType + ", productId=" + this.productId + ", enabled=" + this.enabled + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ", accountGeneratedContentId=" + this.accountGeneratedContentId + ", _embedded=" + this._embedded + ", multiTigercardVariant=" + this.multiTigercardVariant + ", _links=" + this._links + ", _templates=" + this._templates + ')';
    }

    public TigerCardValidState(String code, String uid, String cardType, Integer num, boolean z, String createdBy, String createdDate, Object lastModifiedBy, Object lastModifiedDate, int i, Embedded _embedded, MultiTigercardVariant multiTigercardVariant, Links _links, Templates templates) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(lastModifiedBy, "lastModifiedBy");
        Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
        Intrinsics.checkNotNullParameter(_embedded, "_embedded");
        Intrinsics.checkNotNullParameter(_links, "_links");
        this.code = code;
        this.uid = uid;
        this.cardType = cardType;
        this.productId = num;
        this.enabled = z;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.accountGeneratedContentId = i;
        this._embedded = _embedded;
        this.multiTigercardVariant = multiTigercardVariant;
        this._links = _links;
        this._templates = templates;
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

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final Object getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public final Object getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public final int getAccountGeneratedContentId() {
        return this.accountGeneratedContentId;
    }

    public final Embedded get_embedded() {
        return this._embedded;
    }

    public final MultiTigercardVariant getMultiTigercardVariant() {
        return this.multiTigercardVariant;
    }

    public final Links get_links() {
        return this._links;
    }

    public final Templates get_templates() {
        return this._templates;
    }

    /* compiled from: TigerCardValidState.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003 !\"B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded;", "", "coupon", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$Coupon;", "products", "", "Lmedia/tiger/tigerbox/model/dto/ProductDetailsDto;", "recentlyUsedProduct", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$RecentlyUsedProduct;", "accountGeneratedContents", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$AccountGeneratedContents;", "(Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$Coupon;Ljava/util/List;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$RecentlyUsedProduct;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$AccountGeneratedContents;)V", "getAccountGeneratedContents", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$AccountGeneratedContents;", "getCoupon", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$Coupon;", "getProducts", "()Ljava/util/List;", "getRecentlyUsedProduct", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$RecentlyUsedProduct;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AccountGeneratedContents", "Coupon", "RecentlyUsedProduct", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Embedded {
        @SerializedName("accountgeneratedcontents")
        private final AccountGeneratedContents accountGeneratedContents;
        private final Coupon coupon;
        @JsonAdapter(AlwaysListTypeAdapterFactory.class)
        private final List<ProductDetailsDto> products;
        private final RecentlyUsedProduct recentlyUsedProduct;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Embedded copy$default(Embedded embedded, Coupon coupon, List list, RecentlyUsedProduct recentlyUsedProduct, AccountGeneratedContents accountGeneratedContents, int i, Object obj) {
            if ((i & 1) != 0) {
                coupon = embedded.coupon;
            }
            if ((i & 2) != 0) {
                list = embedded.products;
            }
            if ((i & 4) != 0) {
                recentlyUsedProduct = embedded.recentlyUsedProduct;
            }
            if ((i & 8) != 0) {
                accountGeneratedContents = embedded.accountGeneratedContents;
            }
            return embedded.copy(coupon, list, recentlyUsedProduct, accountGeneratedContents);
        }

        public final Coupon component1() {
            return this.coupon;
        }

        public final List<ProductDetailsDto> component2() {
            return this.products;
        }

        public final RecentlyUsedProduct component3() {
            return this.recentlyUsedProduct;
        }

        public final AccountGeneratedContents component4() {
            return this.accountGeneratedContents;
        }

        public final Embedded copy(Coupon coupon, List<ProductDetailsDto> list, RecentlyUsedProduct recentlyUsedProduct, AccountGeneratedContents accountGeneratedContents) {
            return new Embedded(coupon, list, recentlyUsedProduct, accountGeneratedContents);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Embedded) {
                Embedded embedded = (Embedded) obj;
                return Intrinsics.areEqual(this.coupon, embedded.coupon) && Intrinsics.areEqual(this.products, embedded.products) && Intrinsics.areEqual(this.recentlyUsedProduct, embedded.recentlyUsedProduct) && Intrinsics.areEqual(this.accountGeneratedContents, embedded.accountGeneratedContents);
            }
            return false;
        }

        public int hashCode() {
            Coupon coupon = this.coupon;
            int hashCode = (coupon == null ? 0 : coupon.hashCode()) * 31;
            List<ProductDetailsDto> list = this.products;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            RecentlyUsedProduct recentlyUsedProduct = this.recentlyUsedProduct;
            int hashCode3 = (hashCode2 + (recentlyUsedProduct == null ? 0 : recentlyUsedProduct.hashCode())) * 31;
            AccountGeneratedContents accountGeneratedContents = this.accountGeneratedContents;
            return hashCode3 + (accountGeneratedContents != null ? accountGeneratedContents.hashCode() : 0);
        }

        public String toString() {
            return "Embedded(coupon=" + this.coupon + ", products=" + this.products + ", recentlyUsedProduct=" + this.recentlyUsedProduct + ", accountGeneratedContents=" + this.accountGeneratedContents + ')';
        }

        public Embedded(Coupon coupon, List<ProductDetailsDto> list, RecentlyUsedProduct recentlyUsedProduct, AccountGeneratedContents accountGeneratedContents) {
            this.coupon = coupon;
            this.products = list;
            this.recentlyUsedProduct = recentlyUsedProduct;
            this.accountGeneratedContents = accountGeneratedContents;
        }

        public final Coupon getCoupon() {
            return this.coupon;
        }

        public final List<ProductDetailsDto> getProducts() {
            return this.products;
        }

        public final RecentlyUsedProduct getRecentlyUsedProduct() {
            return this.recentlyUsedProduct;
        }

        public final AccountGeneratedContents getAccountGeneratedContents() {
            return this.accountGeneratedContents;
        }

        /* compiled from: TigerCardValidState.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$Coupon;", "", "couponCode", "", "(Ljava/lang/String;)V", "getCouponCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Coupon {
            private final String couponCode;

            public static /* synthetic */ Coupon copy$default(Coupon coupon, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = coupon.couponCode;
                }
                return coupon.copy(str);
            }

            public final String component1() {
                return this.couponCode;
            }

            public final Coupon copy(String couponCode) {
                Intrinsics.checkNotNullParameter(couponCode, "couponCode");
                return new Coupon(couponCode);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Coupon) && Intrinsics.areEqual(this.couponCode, ((Coupon) obj).couponCode);
            }

            public int hashCode() {
                return this.couponCode.hashCode();
            }

            public String toString() {
                return "Coupon(couponCode=" + this.couponCode + ')';
            }

            public Coupon(String couponCode) {
                Intrinsics.checkNotNullParameter(couponCode, "couponCode");
                this.couponCode = couponCode;
            }

            public final String getCouponCode() {
                return this.couponCode;
            }
        }

        /* compiled from: TigerCardValidState.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0011HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0005HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00064"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$AccountGeneratedContents;", "", "name", "", "accountId", "", "totalDuration", "unusedDuration", CMSAttributeTableGenerator.CONTENT_TYPE, "transcodingStatus", "publicContent", "", "createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate", "_links", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links;", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links;)V", "get_links", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links;", "getAccountId", "()I", "getContentType", "()Ljava/lang/String;", "getCreatedBy", "getCreatedDate", "getLastModifiedBy", "getLastModifiedDate", "getName", "getPublicContent", "()Z", "getTotalDuration", "getTranscodingStatus", "getUnusedDuration", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class AccountGeneratedContents {
            private final Links _links;
            private final int accountId;
            private final String contentType;
            private final String createdBy;
            private final String createdDate;
            private final String lastModifiedBy;
            private final String lastModifiedDate;
            private final String name;
            private final boolean publicContent;
            private final int totalDuration;
            private final String transcodingStatus;
            private final int unusedDuration;

            public final String component1() {
                return this.name;
            }

            public final String component10() {
                return this.lastModifiedBy;
            }

            public final String component11() {
                return this.lastModifiedDate;
            }

            public final Links component12() {
                return this._links;
            }

            public final int component2() {
                return this.accountId;
            }

            public final int component3() {
                return this.totalDuration;
            }

            public final int component4() {
                return this.unusedDuration;
            }

            public final String component5() {
                return this.contentType;
            }

            public final String component6() {
                return this.transcodingStatus;
            }

            public final boolean component7() {
                return this.publicContent;
            }

            public final String component8() {
                return this.createdBy;
            }

            public final String component9() {
                return this.createdDate;
            }

            public final AccountGeneratedContents copy(String name, int i, int i2, int i3, String contentType, String transcodingStatus, boolean z, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, Links _links) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(contentType, "contentType");
                Intrinsics.checkNotNullParameter(transcodingStatus, "transcodingStatus");
                Intrinsics.checkNotNullParameter(createdBy, "createdBy");
                Intrinsics.checkNotNullParameter(createdDate, "createdDate");
                Intrinsics.checkNotNullParameter(lastModifiedBy, "lastModifiedBy");
                Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
                Intrinsics.checkNotNullParameter(_links, "_links");
                return new AccountGeneratedContents(name, i, i2, i3, contentType, transcodingStatus, z, createdBy, createdDate, lastModifiedBy, lastModifiedDate, _links);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof AccountGeneratedContents) {
                    AccountGeneratedContents accountGeneratedContents = (AccountGeneratedContents) obj;
                    return Intrinsics.areEqual(this.name, accountGeneratedContents.name) && this.accountId == accountGeneratedContents.accountId && this.totalDuration == accountGeneratedContents.totalDuration && this.unusedDuration == accountGeneratedContents.unusedDuration && Intrinsics.areEqual(this.contentType, accountGeneratedContents.contentType) && Intrinsics.areEqual(this.transcodingStatus, accountGeneratedContents.transcodingStatus) && this.publicContent == accountGeneratedContents.publicContent && Intrinsics.areEqual(this.createdBy, accountGeneratedContents.createdBy) && Intrinsics.areEqual(this.createdDate, accountGeneratedContents.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, accountGeneratedContents.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, accountGeneratedContents.lastModifiedDate) && Intrinsics.areEqual(this._links, accountGeneratedContents._links);
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = ((((((((((this.name.hashCode() * 31) + this.accountId) * 31) + this.totalDuration) * 31) + this.unusedDuration) * 31) + this.contentType.hashCode()) * 31) + this.transcodingStatus.hashCode()) * 31;
                boolean z = this.publicContent;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return ((((((((((hashCode + i) * 31) + this.createdBy.hashCode()) * 31) + this.createdDate.hashCode()) * 31) + this.lastModifiedBy.hashCode()) * 31) + this.lastModifiedDate.hashCode()) * 31) + this._links.hashCode();
            }

            public String toString() {
                return "AccountGeneratedContents(name=" + this.name + ", accountId=" + this.accountId + ", totalDuration=" + this.totalDuration + ", unusedDuration=" + this.unusedDuration + ", contentType=" + this.contentType + ", transcodingStatus=" + this.transcodingStatus + ", publicContent=" + this.publicContent + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ", _links=" + this._links + ')';
            }

            public AccountGeneratedContents(String name, int i, int i2, int i3, String contentType, String transcodingStatus, boolean z, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, Links _links) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(contentType, "contentType");
                Intrinsics.checkNotNullParameter(transcodingStatus, "transcodingStatus");
                Intrinsics.checkNotNullParameter(createdBy, "createdBy");
                Intrinsics.checkNotNullParameter(createdDate, "createdDate");
                Intrinsics.checkNotNullParameter(lastModifiedBy, "lastModifiedBy");
                Intrinsics.checkNotNullParameter(lastModifiedDate, "lastModifiedDate");
                Intrinsics.checkNotNullParameter(_links, "_links");
                this.name = name;
                this.accountId = i;
                this.totalDuration = i2;
                this.unusedDuration = i3;
                this.contentType = contentType;
                this.transcodingStatus = transcodingStatus;
                this.publicContent = z;
                this.createdBy = createdBy;
                this.createdDate = createdDate;
                this.lastModifiedBy = lastModifiedBy;
                this.lastModifiedDate = lastModifiedDate;
                this._links = _links;
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

            public final int getUnusedDuration() {
                return this.unusedDuration;
            }

            public final String getContentType() {
                return this.contentType;
            }

            public final String getTranscodingStatus() {
                return this.transcodingStatus;
            }

            public final boolean getPublicContent() {
                return this.publicContent;
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

            public final Links get_links() {
                return this._links;
            }
        }

        /* compiled from: TigerCardValidState.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\""}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Embedded$RecentlyUsedProduct;", "", "multiTigercardVariantId", "", "profileId", "productId", "createdBy", "", "createdDate", "lastModifiedBy", "lastModifiedDate", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedBy", "()Ljava/lang/String;", "getCreatedDate", "getLastModifiedBy", "getLastModifiedDate", "getMultiTigercardVariantId", "()I", "getProductId", "getProfileId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class RecentlyUsedProduct {
            private final String createdBy;
            private final String createdDate;
            private final String lastModifiedBy;
            private final String lastModifiedDate;
            private final int multiTigercardVariantId;
            private final int productId;
            private final int profileId;

            public static /* synthetic */ RecentlyUsedProduct copy$default(RecentlyUsedProduct recentlyUsedProduct, int i, int i2, int i3, String str, String str2, String str3, String str4, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    i = recentlyUsedProduct.multiTigercardVariantId;
                }
                if ((i4 & 2) != 0) {
                    i2 = recentlyUsedProduct.profileId;
                }
                int i5 = i2;
                if ((i4 & 4) != 0) {
                    i3 = recentlyUsedProduct.productId;
                }
                int i6 = i3;
                if ((i4 & 8) != 0) {
                    str = recentlyUsedProduct.createdBy;
                }
                String str5 = str;
                if ((i4 & 16) != 0) {
                    str2 = recentlyUsedProduct.createdDate;
                }
                String str6 = str2;
                if ((i4 & 32) != 0) {
                    str3 = recentlyUsedProduct.lastModifiedBy;
                }
                String str7 = str3;
                if ((i4 & 64) != 0) {
                    str4 = recentlyUsedProduct.lastModifiedDate;
                }
                return recentlyUsedProduct.copy(i, i5, i6, str5, str6, str7, str4);
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

            public final RecentlyUsedProduct copy(int i, int i2, int i3, String createdBy, String createdDate, String str, String str2) {
                Intrinsics.checkNotNullParameter(createdBy, "createdBy");
                Intrinsics.checkNotNullParameter(createdDate, "createdDate");
                return new RecentlyUsedProduct(i, i2, i3, createdBy, createdDate, str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RecentlyUsedProduct) {
                    RecentlyUsedProduct recentlyUsedProduct = (RecentlyUsedProduct) obj;
                    return this.multiTigercardVariantId == recentlyUsedProduct.multiTigercardVariantId && this.profileId == recentlyUsedProduct.profileId && this.productId == recentlyUsedProduct.productId && Intrinsics.areEqual(this.createdBy, recentlyUsedProduct.createdBy) && Intrinsics.areEqual(this.createdDate, recentlyUsedProduct.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, recentlyUsedProduct.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, recentlyUsedProduct.lastModifiedDate);
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
                return "RecentlyUsedProduct(multiTigercardVariantId=" + this.multiTigercardVariantId + ", profileId=" + this.profileId + ", productId=" + this.productId + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ')';
            }

            public RecentlyUsedProduct(int i, int i2, int i3, String createdBy, String createdDate, String str, String str2) {
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

            public /* synthetic */ RecentlyUsedProduct(int i, int i2, int i3, String str, String str2, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* compiled from: TigerCardValidState.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$MultiTigercardVariant;", "", "name", "", "description", "createdBy", "createdDate", "lastModifiedBy", "lastModifiedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedBy", "()Ljava/lang/String;", "getCreatedDate", "getDescription", "getLastModifiedBy", "getLastModifiedDate", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MultiTigercardVariant {
        private final String createdBy;
        private final String createdDate;
        private final String description;
        private final String lastModifiedBy;
        private final String lastModifiedDate;
        private final String name;

        public static /* synthetic */ MultiTigercardVariant copy$default(MultiTigercardVariant multiTigercardVariant, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = multiTigercardVariant.name;
            }
            if ((i & 2) != 0) {
                str2 = multiTigercardVariant.description;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = multiTigercardVariant.createdBy;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = multiTigercardVariant.createdDate;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = multiTigercardVariant.lastModifiedBy;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = multiTigercardVariant.lastModifiedDate;
            }
            return multiTigercardVariant.copy(str, str7, str8, str9, str10, str6);
        }

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

        public final MultiTigercardVariant copy(String name, String description, String createdBy, String createdDate, String str, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(createdBy, "createdBy");
            Intrinsics.checkNotNullParameter(createdDate, "createdDate");
            return new MultiTigercardVariant(name, description, createdBy, createdDate, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MultiTigercardVariant) {
                MultiTigercardVariant multiTigercardVariant = (MultiTigercardVariant) obj;
                return Intrinsics.areEqual(this.name, multiTigercardVariant.name) && Intrinsics.areEqual(this.description, multiTigercardVariant.description) && Intrinsics.areEqual(this.createdBy, multiTigercardVariant.createdBy) && Intrinsics.areEqual(this.createdDate, multiTigercardVariant.createdDate) && Intrinsics.areEqual(this.lastModifiedBy, multiTigercardVariant.lastModifiedBy) && Intrinsics.areEqual(this.lastModifiedDate, multiTigercardVariant.lastModifiedDate);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((((this.name.hashCode() * 31) + this.description.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.createdDate.hashCode()) * 31;
            String str = this.lastModifiedBy;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lastModifiedDate;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "MultiTigercardVariant(name=" + this.name + ", description=" + this.description + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", lastModifiedBy=" + this.lastModifiedBy + ", lastModifiedDate=" + this.lastModifiedDate + ')';
        }

        public MultiTigercardVariant(String name, String description, String createdBy, String createdDate, String str, String str2) {
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
    }

    /* compiled from: TigerCardValidState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006)"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links;", "", "self", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;", "card", "validate", "getProduct", "order", "playlist", "cover", "accountGeneratedContent", "disable", "(Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;)V", "getAccountGeneratedContent", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;", "getCard", "getCover", "getDisable", "getGetProduct", "getOrder", "getPlaylist", "getSelf", "getValidate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", HttpHeaders.LINK, "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Links {
        private final Link accountGeneratedContent;
        private final Link card;
        private final Link cover;
        private final Link disable;
        private final Link getProduct;
        private final Link order;
        private final Link playlist;
        private final Link self;
        private final Link validate;

        public Links() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        public final Link component1() {
            return this.self;
        }

        public final Link component2() {
            return this.card;
        }

        public final Link component3() {
            return this.validate;
        }

        public final Link component4() {
            return this.getProduct;
        }

        public final Link component5() {
            return this.order;
        }

        public final Link component6() {
            return this.playlist;
        }

        public final Link component7() {
            return this.cover;
        }

        public final Link component8() {
            return this.accountGeneratedContent;
        }

        public final Link component9() {
            return this.disable;
        }

        public final Links copy(Link link, Link link2, Link link3, Link link4, Link link5, Link link6, Link link7, Link link8, Link link9) {
            return new Links(link, link2, link3, link4, link5, link6, link7, link8, link9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Links) {
                Links links = (Links) obj;
                return Intrinsics.areEqual(this.self, links.self) && Intrinsics.areEqual(this.card, links.card) && Intrinsics.areEqual(this.validate, links.validate) && Intrinsics.areEqual(this.getProduct, links.getProduct) && Intrinsics.areEqual(this.order, links.order) && Intrinsics.areEqual(this.playlist, links.playlist) && Intrinsics.areEqual(this.cover, links.cover) && Intrinsics.areEqual(this.accountGeneratedContent, links.accountGeneratedContent) && Intrinsics.areEqual(this.disable, links.disable);
            }
            return false;
        }

        public int hashCode() {
            Link link = this.self;
            int hashCode = (link == null ? 0 : link.hashCode()) * 31;
            Link link2 = this.card;
            int hashCode2 = (hashCode + (link2 == null ? 0 : link2.hashCode())) * 31;
            Link link3 = this.validate;
            int hashCode3 = (hashCode2 + (link3 == null ? 0 : link3.hashCode())) * 31;
            Link link4 = this.getProduct;
            int hashCode4 = (hashCode3 + (link4 == null ? 0 : link4.hashCode())) * 31;
            Link link5 = this.order;
            int hashCode5 = (hashCode4 + (link5 == null ? 0 : link5.hashCode())) * 31;
            Link link6 = this.playlist;
            int hashCode6 = (hashCode5 + (link6 == null ? 0 : link6.hashCode())) * 31;
            Link link7 = this.cover;
            int hashCode7 = (hashCode6 + (link7 == null ? 0 : link7.hashCode())) * 31;
            Link link8 = this.accountGeneratedContent;
            int hashCode8 = (hashCode7 + (link8 == null ? 0 : link8.hashCode())) * 31;
            Link link9 = this.disable;
            return hashCode8 + (link9 != null ? link9.hashCode() : 0);
        }

        public String toString() {
            return "Links(self=" + this.self + ", card=" + this.card + ", validate=" + this.validate + ", getProduct=" + this.getProduct + ", order=" + this.order + ", playlist=" + this.playlist + ", cover=" + this.cover + ", accountGeneratedContent=" + this.accountGeneratedContent + ", disable=" + this.disable + ')';
        }

        public Links(Link link, Link link2, Link link3, Link link4, Link link5, Link link6, Link link7, Link link8, Link link9) {
            this.self = link;
            this.card = link2;
            this.validate = link3;
            this.getProduct = link4;
            this.order = link5;
            this.playlist = link6;
            this.cover = link7;
            this.accountGeneratedContent = link8;
            this.disable = link9;
        }

        public /* synthetic */ Links(Link link, Link link2, Link link3, Link link4, Link link5, Link link6, Link link7, Link link8, Link link9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : link, (i & 2) != 0 ? null : link2, (i & 4) != 0 ? null : link3, (i & 8) != 0 ? null : link4, (i & 16) != 0 ? null : link5, (i & 32) != 0 ? null : link6, (i & 64) != 0 ? null : link7, (i & 128) != 0 ? null : link8, (i & 256) == 0 ? link9 : null);
        }

        public final Link getSelf() {
            return this.self;
        }

        public final Link getCard() {
            return this.card;
        }

        public final Link getValidate() {
            return this.validate;
        }

        public final Link getGetProduct() {
            return this.getProduct;
        }

        public final Link getOrder() {
            return this.order;
        }

        public final Link getPlaylist() {
            return this.playlist;
        }

        public final Link getCover() {
            return this.cover;
        }

        public final Link getAccountGeneratedContent() {
            return this.accountGeneratedContent;
        }

        public final Link getDisable() {
            return this.disable;
        }

        /* compiled from: TigerCardValidState.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003Jg\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Links$Link;", "", "href", "", "hreflang", MessageBundle.TITLE_ENTRY, SessionDescription.ATTR_TYPE, "deprecation", "profile", "name", "templated", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDeprecation", "()Ljava/lang/String;", "getHref", "getHreflang", "getName", "getProfile", "getTemplated", "()Z", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Link {
            private final String deprecation;
            private final String href;
            private final String hreflang;
            private final String name;
            private final String profile;
            private final boolean templated;
            private final String title;
            private final String type;

            public Link() {
                this(null, null, null, null, null, null, null, false, 255, null);
            }

            public final String component1() {
                return this.href;
            }

            public final String component2() {
                return this.hreflang;
            }

            public final String component3() {
                return this.title;
            }

            public final String component4() {
                return this.type;
            }

            public final String component5() {
                return this.deprecation;
            }

            public final String component6() {
                return this.profile;
            }

            public final String component7() {
                return this.name;
            }

            public final boolean component8() {
                return this.templated;
            }

            public final Link copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
                return new Link(str, str2, str3, str4, str5, str6, str7, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Link) {
                    Link link = (Link) obj;
                    return Intrinsics.areEqual(this.href, link.href) && Intrinsics.areEqual(this.hreflang, link.hreflang) && Intrinsics.areEqual(this.title, link.title) && Intrinsics.areEqual(this.type, link.type) && Intrinsics.areEqual(this.deprecation, link.deprecation) && Intrinsics.areEqual(this.profile, link.profile) && Intrinsics.areEqual(this.name, link.name) && this.templated == link.templated;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                String str = this.href;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.hreflang;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.title;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.type;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.deprecation;
                int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.profile;
                int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.name;
                int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
                boolean z = this.templated;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode7 + i;
            }

            public String toString() {
                return "Link(href=" + this.href + ", hreflang=" + this.hreflang + ", title=" + this.title + ", type=" + this.type + ", deprecation=" + this.deprecation + ", profile=" + this.profile + ", name=" + this.name + ", templated=" + this.templated + ')';
            }

            public Link(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
                this.href = str;
                this.hreflang = str2;
                this.title = str3;
                this.type = str4;
                this.deprecation = str5;
                this.profile = str6;
                this.name = str7;
                this.templated = z;
            }

            public /* synthetic */ Link(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) == 0 ? str7 : null, (i & 128) != 0 ? false : z);
            }

            public final String getHref() {
                return this.href;
            }

            public final String getHreflang() {
                return this.hreflang;
            }

            public final String getTitle() {
                return this.title;
            }

            public final String getType() {
                return this.type;
            }

            public final String getDeprecation() {
                return this.deprecation;
            }

            public final String getProfile() {
                return this.profile;
            }

            public final String getName() {
                return this.name;
            }

            public final boolean getTemplated() {
                return this.templated;
            }
        }
    }

    /* compiled from: TigerCardValidState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates;", "", "default", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates$Template;", "saveRecentlyUsedMultiTigercardProduct", "(Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates$Template;Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates$Template;)V", "getDefault", "()Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates$Template;", "getSaveRecentlyUsedMultiTigercardProduct", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Template", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Templates {

        /* renamed from: default  reason: not valid java name */
        private final Template f4default;
        private final Template saveRecentlyUsedMultiTigercardProduct;

        public static /* synthetic */ Templates copy$default(Templates templates, Template template, Template template2, int i, Object obj) {
            if ((i & 1) != 0) {
                template = templates.f4default;
            }
            if ((i & 2) != 0) {
                template2 = templates.saveRecentlyUsedMultiTigercardProduct;
            }
            return templates.copy(template, template2);
        }

        public final Template component1() {
            return this.f4default;
        }

        public final Template component2() {
            return this.saveRecentlyUsedMultiTigercardProduct;
        }

        public final Templates copy(Template template, Template template2) {
            return new Templates(template, template2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Templates) {
                Templates templates = (Templates) obj;
                return Intrinsics.areEqual(this.f4default, templates.f4default) && Intrinsics.areEqual(this.saveRecentlyUsedMultiTigercardProduct, templates.saveRecentlyUsedMultiTigercardProduct);
            }
            return false;
        }

        public int hashCode() {
            Template template = this.f4default;
            int hashCode = (template == null ? 0 : template.hashCode()) * 31;
            Template template2 = this.saveRecentlyUsedMultiTigercardProduct;
            return hashCode + (template2 != null ? template2.hashCode() : 0);
        }

        public String toString() {
            return "Templates(default=" + this.f4default + ", saveRecentlyUsedMultiTigercardProduct=" + this.saveRecentlyUsedMultiTigercardProduct + ')';
        }

        public Templates(Template template, Template template2) {
            this.f4default = template;
            this.saveRecentlyUsedMultiTigercardProduct = template2;
        }

        public final Template getDefault() {
            return this.f4default;
        }

        public final Template getSaveRecentlyUsedMultiTigercardProduct() {
            return this.saveRecentlyUsedMultiTigercardProduct;
        }

        /* compiled from: TigerCardValidState.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates$Template;", "", "method", "", "properties", "", "Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates$Template$Property;", TypedValues.AttributesType.S_TARGET, "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "getProperties", "()Ljava/util/List;", "getTarget", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Property", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Template {
            private final String method;
            private final List<Property> properties;
            private final String target;

            public Template() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Template copy$default(Template template, String str, List list, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = template.method;
                }
                if ((i & 2) != 0) {
                    list = template.properties;
                }
                if ((i & 4) != 0) {
                    str2 = template.target;
                }
                return template.copy(str, list, str2);
            }

            public final String component1() {
                return this.method;
            }

            public final List<Property> component2() {
                return this.properties;
            }

            public final String component3() {
                return this.target;
            }

            public final Template copy(String str, List<Property> list, String str2) {
                return new Template(str, list, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Template) {
                    Template template = (Template) obj;
                    return Intrinsics.areEqual(this.method, template.method) && Intrinsics.areEqual(this.properties, template.properties) && Intrinsics.areEqual(this.target, template.target);
                }
                return false;
            }

            public int hashCode() {
                String str = this.method;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                List<Property> list = this.properties;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                String str2 = this.target;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Template(method=" + this.method + ", properties=" + this.properties + ", target=" + this.target + ')';
            }

            public Template(String str, List<Property> list, String str2) {
                this.method = str;
                this.properties = list;
                this.target = str2;
            }

            public /* synthetic */ Template(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
            }

            public final String getMethod() {
                return this.method;
            }

            public final List<Property> getProperties() {
                return this.properties;
            }

            public final String getTarget() {
                return this.target;
            }

            /* compiled from: TigerCardValidState.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerCardValidState$Templates$Template$Property;", "", "method", "", SessionDescription.ATTR_TYPE, "(Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class Property {
                private final String method;
                private final String type;

                public static /* synthetic */ Property copy$default(Property property, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = property.method;
                    }
                    if ((i & 2) != 0) {
                        str2 = property.type;
                    }
                    return property.copy(str, str2);
                }

                public final String component1() {
                    return this.method;
                }

                public final String component2() {
                    return this.type;
                }

                public final Property copy(String str, String str2) {
                    return new Property(str, str2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof Property) {
                        Property property = (Property) obj;
                        return Intrinsics.areEqual(this.method, property.method) && Intrinsics.areEqual(this.type, property.type);
                    }
                    return false;
                }

                public int hashCode() {
                    String str = this.method;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.type;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public String toString() {
                    return "Property(method=" + this.method + ", type=" + this.type + ')';
                }

                public Property(String str, String str2) {
                    this.method = str;
                    this.type = str2;
                }

                public final String getMethod() {
                    return this.method;
                }

                public final String getType() {
                    return this.type;
                }
            }
        }
    }
}
