package media.tiger.tigerbox.model.dto;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetProduct.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003123B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jx\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001e\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001f\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0014¨\u00064"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/AssetProduct;", "", TtmlNode.ATTR_ID, "", "version", "assetProductType", "", "ordinal", "productId", "assetId", TtmlNode.TAG_METADATA, "Lmedia/tiger/tigerbox/model/dto/AssetProduct$MetaData;", "asset", "Lmedia/tiger/tigerbox/model/dto/AssetProduct$Asset;", "contentLocation", "Lmedia/tiger/tigerbox/model/dto/AssetProduct$ContentLocation;", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lmedia/tiger/tigerbox/model/dto/AssetProduct$MetaData;Lmedia/tiger/tigerbox/model/dto/AssetProduct$Asset;Lmedia/tiger/tigerbox/model/dto/AssetProduct$ContentLocation;)V", "getAsset", "()Lmedia/tiger/tigerbox/model/dto/AssetProduct$Asset;", "getAssetId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssetProductType", "()Ljava/lang/String;", "getContentLocation", "()Lmedia/tiger/tigerbox/model/dto/AssetProduct$ContentLocation;", "getId", "()I", "getMetadata", "()Lmedia/tiger/tigerbox/model/dto/AssetProduct$MetaData;", "getOrdinal", "getProductId", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lmedia/tiger/tigerbox/model/dto/AssetProduct$MetaData;Lmedia/tiger/tigerbox/model/dto/AssetProduct$Asset;Lmedia/tiger/tigerbox/model/dto/AssetProduct$ContentLocation;)Lmedia/tiger/tigerbox/model/dto/AssetProduct;", "equals", "", "other", "hashCode", "toString", "Asset", "ContentLocation", "MetaData", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AssetProduct {
    private final Asset asset;
    private final Integer assetId;
    private final String assetProductType;
    private final ContentLocation contentLocation;
    private final int id;
    private final MetaData metadata;
    private final Integer ordinal;
    private final Integer productId;
    private final Integer version;

    public final int component1() {
        return this.id;
    }

    public final Integer component2() {
        return this.version;
    }

    public final String component3() {
        return this.assetProductType;
    }

    public final Integer component4() {
        return this.ordinal;
    }

    public final Integer component5() {
        return this.productId;
    }

    public final Integer component6() {
        return this.assetId;
    }

    public final MetaData component7() {
        return this.metadata;
    }

    public final Asset component8() {
        return this.asset;
    }

    public final ContentLocation component9() {
        return this.contentLocation;
    }

    public final AssetProduct copy(int i, Integer num, String str, Integer num2, Integer num3, Integer num4, MetaData metaData, Asset asset, ContentLocation contentLocation) {
        return new AssetProduct(i, num, str, num2, num3, num4, metaData, asset, contentLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AssetProduct) {
            AssetProduct assetProduct = (AssetProduct) obj;
            return this.id == assetProduct.id && Intrinsics.areEqual(this.version, assetProduct.version) && Intrinsics.areEqual(this.assetProductType, assetProduct.assetProductType) && Intrinsics.areEqual(this.ordinal, assetProduct.ordinal) && Intrinsics.areEqual(this.productId, assetProduct.productId) && Intrinsics.areEqual(this.assetId, assetProduct.assetId) && Intrinsics.areEqual(this.metadata, assetProduct.metadata) && Intrinsics.areEqual(this.asset, assetProduct.asset) && Intrinsics.areEqual(this.contentLocation, assetProduct.contentLocation);
        }
        return false;
    }

    public int hashCode() {
        int i = this.id * 31;
        Integer num = this.version;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.assetProductType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.ordinal;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.productId;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.assetId;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        MetaData metaData = this.metadata;
        int hashCode6 = (hashCode5 + (metaData == null ? 0 : metaData.hashCode())) * 31;
        Asset asset = this.asset;
        int hashCode7 = (hashCode6 + (asset == null ? 0 : asset.hashCode())) * 31;
        ContentLocation contentLocation = this.contentLocation;
        return hashCode7 + (contentLocation != null ? contentLocation.hashCode() : 0);
    }

    public String toString() {
        return "AssetProduct(id=" + this.id + ", version=" + this.version + ", assetProductType=" + this.assetProductType + ", ordinal=" + this.ordinal + ", productId=" + this.productId + ", assetId=" + this.assetId + ", metadata=" + this.metadata + ", asset=" + this.asset + ", contentLocation=" + this.contentLocation + ')';
    }

    public AssetProduct(int i, Integer num, String str, Integer num2, Integer num3, Integer num4, MetaData metaData, Asset asset, ContentLocation contentLocation) {
        this.id = i;
        this.version = num;
        this.assetProductType = str;
        this.ordinal = num2;
        this.productId = num3;
        this.assetId = num4;
        this.metadata = metaData;
        this.asset = asset;
        this.contentLocation = contentLocation;
    }

    public final int getId() {
        return this.id;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final String getAssetProductType() {
        return this.assetProductType;
    }

    public final Integer getOrdinal() {
        return this.ordinal;
    }

    public final Integer getProductId() {
        return this.productId;
    }

    public final Integer getAssetId() {
        return this.assetId;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final Asset getAsset() {
        return this.asset;
    }

    public final ContentLocation getContentLocation() {
        return this.contentLocation;
    }

    /* compiled from: AssetProduct.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/AssetProduct$MetaData;", "", "treeVersion", "", "(Ljava/lang/Integer;)V", "getTreeVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lmedia/tiger/tigerbox/model/dto/AssetProduct$MetaData;", "equals", "", "other", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
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

    /* compiled from: AssetProduct.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0010J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u009e\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u001f\u0010\u0014¨\u00063"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/AssetProduct$Asset;", "", TtmlNode.ATTR_ID, "", "version", "name", "", "assetType", "mimeType", "size", "width", "height", "md5Hash", "visibility", "storage", "storageReferenceId", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssetType", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getMd5Hash", "getMimeType", "getName", "getSize", "getStorage", "getStorageReferenceId", "getVersion", "getVisibility", "getWidth", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lmedia/tiger/tigerbox/model/dto/AssetProduct$Asset;", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Asset {
        private final String assetType;
        private final Integer height;
        private final Integer id;
        private final String md5Hash;
        private final String mimeType;
        private final String name;
        private final Integer size;
        private final String storage;
        private final String storageReferenceId;
        private final Integer version;
        private final String visibility;
        private final Integer width;

        public final Integer component1() {
            return this.id;
        }

        public final String component10() {
            return this.visibility;
        }

        public final String component11() {
            return this.storage;
        }

        public final String component12() {
            return this.storageReferenceId;
        }

        public final Integer component2() {
            return this.version;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.assetType;
        }

        public final String component5() {
            return this.mimeType;
        }

        public final Integer component6() {
            return this.size;
        }

        public final Integer component7() {
            return this.width;
        }

        public final Integer component8() {
            return this.height;
        }

        public final String component9() {
            return this.md5Hash;
        }

        public final Asset copy(Integer num, Integer num2, String str, String str2, String str3, Integer num3, Integer num4, Integer num5, String str4, String str5, String str6, String str7) {
            return new Asset(num, num2, str, str2, str3, num3, num4, num5, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Asset) {
                Asset asset = (Asset) obj;
                return Intrinsics.areEqual(this.id, asset.id) && Intrinsics.areEqual(this.version, asset.version) && Intrinsics.areEqual(this.name, asset.name) && Intrinsics.areEqual(this.assetType, asset.assetType) && Intrinsics.areEqual(this.mimeType, asset.mimeType) && Intrinsics.areEqual(this.size, asset.size) && Intrinsics.areEqual(this.width, asset.width) && Intrinsics.areEqual(this.height, asset.height) && Intrinsics.areEqual(this.md5Hash, asset.md5Hash) && Intrinsics.areEqual(this.visibility, asset.visibility) && Intrinsics.areEqual(this.storage, asset.storage) && Intrinsics.areEqual(this.storageReferenceId, asset.storageReferenceId);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.id;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.version;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.name;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.assetType;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mimeType;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num3 = this.size;
            int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.width;
            int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.height;
            int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
            String str4 = this.md5Hash;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.visibility;
            int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.storage;
            int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.storageReferenceId;
            return hashCode11 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "Asset(id=" + this.id + ", version=" + this.version + ", name=" + this.name + ", assetType=" + this.assetType + ", mimeType=" + this.mimeType + ", size=" + this.size + ", width=" + this.width + ", height=" + this.height + ", md5Hash=" + this.md5Hash + ", visibility=" + this.visibility + ", storage=" + this.storage + ", storageReferenceId=" + this.storageReferenceId + ')';
        }

        public Asset(Integer num, Integer num2, String str, String str2, String str3, Integer num3, Integer num4, Integer num5, String str4, String str5, String str6, String str7) {
            this.id = num;
            this.version = num2;
            this.name = str;
            this.assetType = str2;
            this.mimeType = str3;
            this.size = num3;
            this.width = num4;
            this.height = num5;
            this.md5Hash = str4;
            this.visibility = str5;
            this.storage = str6;
            this.storageReferenceId = str7;
        }

        public final Integer getId() {
            return this.id;
        }

        public final Integer getVersion() {
            return this.version;
        }

        public final String getName() {
            return this.name;
        }

        public final String getAssetType() {
            return this.assetType;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final Integer getSize() {
            return this.size;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final String getMd5Hash() {
            return this.md5Hash;
        }

        public final String getVisibility() {
            return this.visibility;
        }

        public final String getStorage() {
            return this.storage;
        }

        public final String getStorageReferenceId() {
            return this.storageReferenceId;
        }
    }

    /* compiled from: AssetProduct.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lmedia/tiger/tigerbox/model/dto/AssetProduct$ContentLocation;", "", "location", "", "expires", "(Ljava/lang/String;Ljava/lang/Object;)V", "getExpires", "()Ljava/lang/Object;", "getLocation", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ContentLocation {
        private final Object expires;
        private final String location;

        public static /* synthetic */ ContentLocation copy$default(ContentLocation contentLocation, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = contentLocation.location;
            }
            if ((i & 2) != 0) {
                obj = contentLocation.expires;
            }
            return contentLocation.copy(str, obj);
        }

        public final String component1() {
            return this.location;
        }

        public final Object component2() {
            return this.expires;
        }

        public final ContentLocation copy(String location, Object obj) {
            Intrinsics.checkNotNullParameter(location, "location");
            return new ContentLocation(location, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ContentLocation) {
                ContentLocation contentLocation = (ContentLocation) obj;
                return Intrinsics.areEqual(this.location, contentLocation.location) && Intrinsics.areEqual(this.expires, contentLocation.expires);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.location.hashCode() * 31;
            Object obj = this.expires;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "ContentLocation(location=" + this.location + ", expires=" + this.expires + ')';
        }

        public ContentLocation(String location, Object obj) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.location = location;
            this.expires = obj;
        }

        public final String getLocation() {
            return this.location;
        }

        public final Object getExpires() {
            return this.expires;
        }
    }
}
