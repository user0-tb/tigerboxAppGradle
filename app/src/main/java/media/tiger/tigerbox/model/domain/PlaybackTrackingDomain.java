package media.tiger.tigerbox.model.domain;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlaybackTrackingDomain.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lmedia/tiger/tigerbox/model/domain/PlaybackTrackingDomain;", "", "()V", "accountId", "", "userId", "productId", NotificationCompat.CATEGORY_EVENT, "", TtmlNode.START, TtmlNode.END, "total", TtmlNode.ATTR_ID, "(IIILjava/lang/String;IIII)V", "getAccountId", "()I", "getEnd", "getEvent", "()Ljava/lang/String;", "getId", "getProductId", "getStart", "getTotal", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlaybackTrackingDomain {
    private final int accountId;
    private final int end;
    private final String event;
    private final int id;
    private final int productId;
    private final int start;
    private final int total;
    private final int userId;

    public final int component1() {
        return this.accountId;
    }

    public final int component2() {
        return this.userId;
    }

    public final int component3() {
        return this.productId;
    }

    public final String component4() {
        return this.event;
    }

    public final int component5() {
        return this.start;
    }

    public final int component6() {
        return this.end;
    }

    public final int component7() {
        return this.total;
    }

    public final int component8() {
        return this.id;
    }

    public final PlaybackTrackingDomain copy(int i, int i2, int i3, String event, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(event, "event");
        return new PlaybackTrackingDomain(i, i2, i3, event, i4, i5, i6, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaybackTrackingDomain) {
            PlaybackTrackingDomain playbackTrackingDomain = (PlaybackTrackingDomain) obj;
            return this.accountId == playbackTrackingDomain.accountId && this.userId == playbackTrackingDomain.userId && this.productId == playbackTrackingDomain.productId && Intrinsics.areEqual(this.event, playbackTrackingDomain.event) && this.start == playbackTrackingDomain.start && this.end == playbackTrackingDomain.end && this.total == playbackTrackingDomain.total && this.id == playbackTrackingDomain.id;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((this.accountId * 31) + this.userId) * 31) + this.productId) * 31) + this.event.hashCode()) * 31) + this.start) * 31) + this.end) * 31) + this.total) * 31) + this.id;
    }

    public String toString() {
        return "PlaybackTrackingDomain(accountId=" + this.accountId + ", userId=" + this.userId + ", productId=" + this.productId + ", event=" + this.event + ", start=" + this.start + ", end=" + this.end + ", total=" + this.total + ", id=" + this.id + ')';
    }

    public PlaybackTrackingDomain(int i, int i2, int i3, String event, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.accountId = i;
        this.userId = i2;
        this.productId = i3;
        this.event = event;
        this.start = i4;
        this.end = i5;
        this.total = i6;
        this.id = i7;
    }

    public /* synthetic */ PlaybackTrackingDomain(int i, int i2, int i3, String str, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? -1 : i, (i8 & 2) != 0 ? -1 : i2, (i8 & 4) == 0 ? i3 : -1, (i8 & 8) != 0 ? "progress" : str, (i8 & 16) != 0 ? 0 : i4, (i8 & 32) != 0 ? 0 : i5, (i8 & 64) != 0 ? 0 : i6, (i8 & 128) == 0 ? i7 : 0);
    }

    public final int getAccountId() {
        return this.accountId;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getEvent() {
        return this.event;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getId() {
        return this.id;
    }

    public PlaybackTrackingDomain() {
        this(-1, -1, -1, "progress", 0, 0, 0, 0, PsExtractor.VIDEO_STREAM_MASK, null);
    }
}
