package media.tiger.tigerbox.model.domain;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerCard.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/TigerCard;", "Ljava/io/Serializable;", TtmlNode.ATTR_ID, "", "secureCode", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSecureCode", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerCard implements Serializable {
    private final String id;
    private final String secureCode;
    private final String url;

    public static /* synthetic */ TigerCard copy$default(TigerCard tigerCard, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tigerCard.id;
        }
        if ((i & 2) != 0) {
            str2 = tigerCard.secureCode;
        }
        if ((i & 4) != 0) {
            str3 = tigerCard.url;
        }
        return tigerCard.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.secureCode;
    }

    public final String component3() {
        return this.url;
    }

    public final TigerCard copy(String id, String secureCode, String url) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(secureCode, "secureCode");
        Intrinsics.checkNotNullParameter(url, "url");
        return new TigerCard(id, secureCode, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TigerCard) {
            TigerCard tigerCard = (TigerCard) obj;
            return Intrinsics.areEqual(this.id, tigerCard.id) && Intrinsics.areEqual(this.secureCode, tigerCard.secureCode) && Intrinsics.areEqual(this.url, tigerCard.url);
        }
        return false;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.secureCode.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "TigerCard(id=" + this.id + ", secureCode=" + this.secureCode + ", url=" + this.url + ')';
    }

    public TigerCard(String id, String secureCode, String url) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(secureCode, "secureCode");
        Intrinsics.checkNotNullParameter(url, "url");
        this.id = id;
        this.secureCode = secureCode;
        this.url = url;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSecureCode() {
        return this.secureCode;
    }

    public final String getUrl() {
        return this.url;
    }
}
