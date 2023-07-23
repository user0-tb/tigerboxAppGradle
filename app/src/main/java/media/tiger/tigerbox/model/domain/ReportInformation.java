package media.tiger.tigerbox.model.domain;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* compiled from: ReportInformation.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/ReportInformation;", "", TtmlNode.ATTR_ID, "", "accountId", "activeProfileId", "(III)V", "getAccountId", "()I", "getActiveProfileId", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReportInformation {
    private final int accountId;
    private final int activeProfileId;
    private final int id;

    public static /* synthetic */ ReportInformation copy$default(ReportInformation reportInformation, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = reportInformation.id;
        }
        if ((i4 & 2) != 0) {
            i2 = reportInformation.accountId;
        }
        if ((i4 & 4) != 0) {
            i3 = reportInformation.activeProfileId;
        }
        return reportInformation.copy(i, i2, i3);
    }

    public final int component1() {
        return this.id;
    }

    public final int component2() {
        return this.accountId;
    }

    public final int component3() {
        return this.activeProfileId;
    }

    public final ReportInformation copy(int i, int i2, int i3) {
        return new ReportInformation(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReportInformation) {
            ReportInformation reportInformation = (ReportInformation) obj;
            return this.id == reportInformation.id && this.accountId == reportInformation.accountId && this.activeProfileId == reportInformation.activeProfileId;
        }
        return false;
    }

    public int hashCode() {
        return (((this.id * 31) + this.accountId) * 31) + this.activeProfileId;
    }

    public String toString() {
        return "ReportInformation(id=" + this.id + ", accountId=" + this.accountId + ", activeProfileId=" + this.activeProfileId + ')';
    }

    public ReportInformation(int i, int i2, int i3) {
        this.id = i;
        this.accountId = i2;
        this.activeProfileId = i3;
    }

    public final int getId() {
        return this.id;
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final int getActiveProfileId() {
        return this.activeProfileId;
    }
}
