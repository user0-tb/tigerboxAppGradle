package media.tiger.tigerbox.model.dto;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Acquisition.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u00011B\u0007\b\u0016¢\u0006\u0002\u0010\u0002Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0084\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0004HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001f\u0010\u0012¨\u00062"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/Acquisition;", "", "()V", TtmlNode.ATTR_ID, "", "version", "assignmentType", "", "source", "validUntil", "productId", "subscriptionId", "slotNumber", "accountId", "metaData", "Lmedia/tiger/tigerbox/model/dto/Acquisition$MetaData;", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lmedia/tiger/tigerbox/model/dto/Acquisition$MetaData;)V", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssignmentType", "()Ljava/lang/String;", "getId", "()I", "getMetaData", "()Lmedia/tiger/tigerbox/model/dto/Acquisition$MetaData;", "getProductId", "getSlotNumber", "getSource", "getSubscriptionId", "getValidUntil", "getVersion", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lmedia/tiger/tigerbox/model/dto/Acquisition$MetaData;)Lmedia/tiger/tigerbox/model/dto/Acquisition;", "equals", "", "other", "hashCode", "toString", "MetaData", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Acquisition {
    private final Integer accountId;
    private final String assignmentType;
    private final int id;
    private final MetaData metaData;
    private final Integer productId;
    private final Integer slotNumber;
    private final String source;
    private final Integer subscriptionId;
    private final String validUntil;
    private final Integer version;

    public final int component1() {
        return this.id;
    }

    public final MetaData component10() {
        return this.metaData;
    }

    public final Integer component2() {
        return this.version;
    }

    public final String component3() {
        return this.assignmentType;
    }

    public final String component4() {
        return this.source;
    }

    public final String component5() {
        return this.validUntil;
    }

    public final Integer component6() {
        return this.productId;
    }

    public final Integer component7() {
        return this.subscriptionId;
    }

    public final Integer component8() {
        return this.slotNumber;
    }

    public final Integer component9() {
        return this.accountId;
    }

    public final Acquisition copy(int i, Integer num, String str, String str2, String str3, Integer num2, Integer num3, Integer num4, Integer num5, MetaData metaData) {
        return new Acquisition(i, num, str, str2, str3, num2, num3, num4, num5, metaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Acquisition) {
            Acquisition acquisition = (Acquisition) obj;
            return this.id == acquisition.id && Intrinsics.areEqual(this.version, acquisition.version) && Intrinsics.areEqual(this.assignmentType, acquisition.assignmentType) && Intrinsics.areEqual(this.source, acquisition.source) && Intrinsics.areEqual(this.validUntil, acquisition.validUntil) && Intrinsics.areEqual(this.productId, acquisition.productId) && Intrinsics.areEqual(this.subscriptionId, acquisition.subscriptionId) && Intrinsics.areEqual(this.slotNumber, acquisition.slotNumber) && Intrinsics.areEqual(this.accountId, acquisition.accountId) && Intrinsics.areEqual(this.metaData, acquisition.metaData);
        }
        return false;
    }

    public int hashCode() {
        int i = this.id * 31;
        Integer num = this.version;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.assignmentType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.validUntil;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.productId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.subscriptionId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.slotNumber;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.accountId;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        MetaData metaData = this.metaData;
        return hashCode8 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        return "Acquisition(id=" + this.id + ", version=" + this.version + ", assignmentType=" + this.assignmentType + ", source=" + this.source + ", validUntil=" + this.validUntil + ", productId=" + this.productId + ", subscriptionId=" + this.subscriptionId + ", slotNumber=" + this.slotNumber + ", accountId=" + this.accountId + ", metaData=" + this.metaData + ')';
    }

    public Acquisition(int i, Integer num, String str, String str2, String str3, Integer num2, Integer num3, Integer num4, Integer num5, MetaData metaData) {
        this.id = i;
        this.version = num;
        this.assignmentType = str;
        this.source = str2;
        this.validUntil = str3;
        this.productId = num2;
        this.subscriptionId = num3;
        this.slotNumber = num4;
        this.accountId = num5;
        this.metaData = metaData;
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final String getAssignmentType() {
        return this.assignmentType;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getValidUntil() {
        return this.validUntil;
    }

    public final Integer getProductId() {
        return this.productId;
    }

    public final Integer getSubscriptionId() {
        return this.subscriptionId;
    }

    public final Integer getSlotNumber() {
        return this.slotNumber;
    }

    public final Integer getAccountId() {
        return this.accountId;
    }

    public final MetaData getMetaData() {
        return this.metaData;
    }

    /* compiled from: Acquisition.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/Acquisition$MetaData;", "", "treeVersion", "", "(Ljava/lang/Integer;)V", "getTreeVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lmedia/tiger/tigerbox/model/dto/Acquisition$MetaData;", "equals", "", "other", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MetaData {
        private final Integer treeVersion;

        public static /* synthetic */ MetaData copy$default(MetaData metaData, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = metaData.treeVersion;
            }
            return metaData.copy(num);
        }

        public final Integer component1() {
            return this.treeVersion;
        }

        public final MetaData copy(Integer num) {
            return new MetaData(num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetaData) && Intrinsics.areEqual(this.treeVersion, ((MetaData) obj).treeVersion);
        }

        public int hashCode() {
            Integer num = this.treeVersion;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "MetaData(treeVersion=" + this.treeVersion + ')';
        }

        public MetaData(Integer num) {
            this.treeVersion = num;
        }

        public final Integer getTreeVersion() {
            return this.treeVersion;
        }
    }

    public Acquisition() {
        this(0, 0, "", "", "", 0, 0, 0, 0, new MetaData(0));
    }
}
