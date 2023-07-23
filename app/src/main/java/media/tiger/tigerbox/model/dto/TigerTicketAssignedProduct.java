package media.tiger.tigerbox.model.dto;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerTicketAssignedProduct.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006 "}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct;", "Ljava/io/Serializable;", "couponDto", "Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$CouponDto;", "linkedProduct", "Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$LinkedProduct;", "newEndDate", "", SessionDescription.ATTR_TYPE, "(Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$CouponDto;Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$LinkedProduct;Ljava/lang/String;Ljava/lang/String;)V", "getCouponDto", "()Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$CouponDto;", "getLinkedProduct", "()Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$LinkedProduct;", "getNewEndDate", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CouponDto", "Duration", "LinkedProduct", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerTicketAssignedProduct implements Serializable {
    private final CouponDto couponDto;
    private final LinkedProduct linkedProduct;
    private final String newEndDate;
    private final String type;

    public static /* synthetic */ TigerTicketAssignedProduct copy$default(TigerTicketAssignedProduct tigerTicketAssignedProduct, CouponDto couponDto, LinkedProduct linkedProduct, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            couponDto = tigerTicketAssignedProduct.couponDto;
        }
        if ((i & 2) != 0) {
            linkedProduct = tigerTicketAssignedProduct.linkedProduct;
        }
        if ((i & 4) != 0) {
            str = tigerTicketAssignedProduct.newEndDate;
        }
        if ((i & 8) != 0) {
            str2 = tigerTicketAssignedProduct.type;
        }
        return tigerTicketAssignedProduct.copy(couponDto, linkedProduct, str, str2);
    }

    public final CouponDto component1() {
        return this.couponDto;
    }

    public final LinkedProduct component2() {
        return this.linkedProduct;
    }

    public final String component3() {
        return this.newEndDate;
    }

    public final String component4() {
        return this.type;
    }

    public final TigerTicketAssignedProduct copy(CouponDto couponDto, LinkedProduct linkedProduct, String newEndDate, String type) {
        Intrinsics.checkNotNullParameter(couponDto, "couponDto");
        Intrinsics.checkNotNullParameter(linkedProduct, "linkedProduct");
        Intrinsics.checkNotNullParameter(newEndDate, "newEndDate");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TigerTicketAssignedProduct(couponDto, linkedProduct, newEndDate, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerTicketAssignedProduct) {
            TigerTicketAssignedProduct tigerTicketAssignedProduct = (TigerTicketAssignedProduct) obj;
            return Intrinsics.areEqual(this.couponDto, tigerTicketAssignedProduct.couponDto) && Intrinsics.areEqual(this.linkedProduct, tigerTicketAssignedProduct.linkedProduct) && Intrinsics.areEqual(this.newEndDate, tigerTicketAssignedProduct.newEndDate) && Intrinsics.areEqual(this.type, tigerTicketAssignedProduct.type);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.couponDto.hashCode() * 31) + this.linkedProduct.hashCode()) * 31) + this.newEndDate.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "TigerTicketAssignedProduct(couponDto=" + this.couponDto + ", linkedProduct=" + this.linkedProduct + ", newEndDate=" + this.newEndDate + ", type=" + this.type + ')';
    }

    public TigerTicketAssignedProduct(CouponDto couponDto, LinkedProduct linkedProduct, String newEndDate, String type) {
        Intrinsics.checkNotNullParameter(couponDto, "couponDto");
        Intrinsics.checkNotNullParameter(linkedProduct, "linkedProduct");
        Intrinsics.checkNotNullParameter(newEndDate, "newEndDate");
        Intrinsics.checkNotNullParameter(type, "type");
        this.couponDto = couponDto;
        this.linkedProduct = linkedProduct;
        this.newEndDate = newEndDate;
        this.type = type;
    }

    public final CouponDto getCouponDto() {
        return this.couponDto;
    }

    public final LinkedProduct getLinkedProduct() {
        return this.linkedProduct;
    }

    public final String getNewEndDate() {
        return this.newEndDate;
    }

    public final String getType() {
        return this.type;
    }

    /* compiled from: TigerTicketAssignedProduct.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$CouponDto;", "Ljava/io/Serializable;", TypedValues.TransitionType.S_DURATION, "Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$Duration;", "landingPageId", "", "(Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$Duration;Ljava/lang/String;)V", "getDuration", "()Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$Duration;", "getLandingPageId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CouponDto implements Serializable {
        private final Duration duration;
        private final String landingPageId;

        public static /* synthetic */ CouponDto copy$default(CouponDto couponDto, Duration duration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                duration = couponDto.duration;
            }
            if ((i & 2) != 0) {
                str = couponDto.landingPageId;
            }
            return couponDto.copy(duration, str);
        }

        public final Duration component1() {
            return this.duration;
        }

        public final String component2() {
            return this.landingPageId;
        }

        public final CouponDto copy(Duration duration, String landingPageId) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(landingPageId, "landingPageId");
            return new CouponDto(duration, landingPageId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CouponDto) {
                CouponDto couponDto = (CouponDto) obj;
                return Intrinsics.areEqual(this.duration, couponDto.duration) && Intrinsics.areEqual(this.landingPageId, couponDto.landingPageId);
            }
            return false;
        }

        public int hashCode() {
            return (this.duration.hashCode() * 31) + this.landingPageId.hashCode();
        }

        public String toString() {
            return "CouponDto(duration=" + this.duration + ", landingPageId=" + this.landingPageId + ')';
        }

        public CouponDto(Duration duration, String landingPageId) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(landingPageId, "landingPageId");
            this.duration = duration;
            this.landingPageId = landingPageId;
        }

        public final Duration getDuration() {
            return this.duration;
        }

        public final String getLandingPageId() {
            return this.landingPageId;
        }
    }

    /* compiled from: TigerTicketAssignedProduct.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006+"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$LinkedProduct;", "Ljava/io/Serializable;", "displayName", "", TypedValues.CycleType.S_WAVE_PERIOD, "Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$Duration;", "planVariantDescription", "planVariantId", "price", "", "productDescription", "shortName", "trial", "verb", "(Ljava/lang/String;Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$Duration;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getPeriod", "()Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$Duration;", "getPlanVariantDescription", "getPlanVariantId", "getPrice", "()I", "getProductDescription", "getShortName", "getTrial", "getVerb", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class LinkedProduct implements Serializable {
        private final String displayName;
        private final Duration period;
        private final String planVariantDescription;
        private final String planVariantId;
        private final int price;
        private final String productDescription;
        private final String shortName;
        private final String trial;
        private final String verb;

        public final String component1() {
            return this.displayName;
        }

        public final Duration component2() {
            return this.period;
        }

        public final String component3() {
            return this.planVariantDescription;
        }

        public final String component4() {
            return this.planVariantId;
        }

        public final int component5() {
            return this.price;
        }

        public final String component6() {
            return this.productDescription;
        }

        public final String component7() {
            return this.shortName;
        }

        public final String component8() {
            return this.trial;
        }

        public final String component9() {
            return this.verb;
        }

        public final LinkedProduct copy(String displayName, Duration period, String planVariantDescription, String planVariantId, int i, String str, String shortName, String str2, String verb) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(planVariantDescription, "planVariantDescription");
            Intrinsics.checkNotNullParameter(planVariantId, "planVariantId");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            Intrinsics.checkNotNullParameter(verb, "verb");
            return new LinkedProduct(displayName, period, planVariantDescription, planVariantId, i, str, shortName, str2, verb);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LinkedProduct) {
                LinkedProduct linkedProduct = (LinkedProduct) obj;
                return Intrinsics.areEqual(this.displayName, linkedProduct.displayName) && Intrinsics.areEqual(this.period, linkedProduct.period) && Intrinsics.areEqual(this.planVariantDescription, linkedProduct.planVariantDescription) && Intrinsics.areEqual(this.planVariantId, linkedProduct.planVariantId) && this.price == linkedProduct.price && Intrinsics.areEqual(this.productDescription, linkedProduct.productDescription) && Intrinsics.areEqual(this.shortName, linkedProduct.shortName) && Intrinsics.areEqual(this.trial, linkedProduct.trial) && Intrinsics.areEqual(this.verb, linkedProduct.verb);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((((((this.displayName.hashCode() * 31) + this.period.hashCode()) * 31) + this.planVariantDescription.hashCode()) * 31) + this.planVariantId.hashCode()) * 31) + this.price) * 31;
            String str = this.productDescription;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.shortName.hashCode()) * 31;
            String str2 = this.trial;
            return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.verb.hashCode();
        }

        public String toString() {
            return "LinkedProduct(displayName=" + this.displayName + ", period=" + this.period + ", planVariantDescription=" + this.planVariantDescription + ", planVariantId=" + this.planVariantId + ", price=" + this.price + ", productDescription=" + this.productDescription + ", shortName=" + this.shortName + ", trial=" + this.trial + ", verb=" + this.verb + ')';
        }

        public LinkedProduct(String displayName, Duration period, String planVariantDescription, String planVariantId, int i, String str, String shortName, String str2, String verb) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(period, "period");
            Intrinsics.checkNotNullParameter(planVariantDescription, "planVariantDescription");
            Intrinsics.checkNotNullParameter(planVariantId, "planVariantId");
            Intrinsics.checkNotNullParameter(shortName, "shortName");
            Intrinsics.checkNotNullParameter(verb, "verb");
            this.displayName = displayName;
            this.period = period;
            this.planVariantDescription = planVariantDescription;
            this.planVariantId = planVariantId;
            this.price = i;
            this.productDescription = str;
            this.shortName = shortName;
            this.trial = str2;
            this.verb = verb;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final Duration getPeriod() {
            return this.period;
        }

        public final String getPlanVariantDescription() {
            return this.planVariantDescription;
        }

        public final String getPlanVariantId() {
            return this.planVariantId;
        }

        public final int getPrice() {
            return this.price;
        }

        public final String getProductDescription() {
            return this.productDescription;
        }

        public final String getShortName() {
            return this.shortName;
        }

        public final String getTrial() {
            return this.trial;
        }

        public final String getVerb() {
            return this.verb;
        }
    }

    /* compiled from: TigerTicketAssignedProduct.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/TigerTicketAssignedProduct$Duration;", "Ljava/io/Serializable;", "unit", "", "quantity", "", "(Ljava/lang/String;I)V", "getQuantity", "()I", "getUnit", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Duration implements Serializable {
        private final int quantity;
        private final String unit;

        public static /* synthetic */ Duration copy$default(Duration duration, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = duration.unit;
            }
            if ((i2 & 2) != 0) {
                i = duration.quantity;
            }
            return duration.copy(str, i);
        }

        public final String component1() {
            return this.unit;
        }

        public final int component2() {
            return this.quantity;
        }

        public final Duration copy(String unit, int i) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return new Duration(unit, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Duration) {
                Duration duration = (Duration) obj;
                return Intrinsics.areEqual(this.unit, duration.unit) && this.quantity == duration.quantity;
            }
            return false;
        }

        public int hashCode() {
            return (this.unit.hashCode() * 31) + this.quantity;
        }

        public String toString() {
            return "Duration(unit=" + this.unit + ", quantity=" + this.quantity + ')';
        }

        public Duration(String unit, int i) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.unit = unit;
            this.quantity = i;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final String getUnit() {
            return this.unit;
        }
    }
}
