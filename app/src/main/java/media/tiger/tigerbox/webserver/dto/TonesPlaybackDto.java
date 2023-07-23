package media.tiger.tigerbox.webserver.dto;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: PlaybackDto.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nBU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lmedia/tiger/tigerbox/webserver/dto/TonesPlaybackDto;", "", "productId", "", "cover", "", MessageBundle.TITLE_ENTRY, "author", "isPaused", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "trackNumber", "trackPosition", "", "coverUrl", "(ILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAuthor", "()Ljava/lang/String;", "getCoverUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProductId", "()I", "getTitle", "getTrackNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackPosition", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lmedia/tiger/tigerbox/webserver/dto/TonesPlaybackDto;", "equals", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TonesPlaybackDto {
    private final String author;
    private final String coverUrl;
    private final Boolean isPaused;
    private final int productId;
    private final String title;
    private final Integer trackNumber;
    private final Long trackPosition;

    public static /* synthetic */ TonesPlaybackDto copy$default(TonesPlaybackDto tonesPlaybackDto, int i, Integer num, Long l, String str, String str2, String str3, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tonesPlaybackDto.productId;
        }
        if ((i2 & 2) != 0) {
            num = tonesPlaybackDto.trackNumber;
        }
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            l = tonesPlaybackDto.trackPosition;
        }
        Long l2 = l;
        if ((i2 & 8) != 0) {
            str = tonesPlaybackDto.coverUrl;
        }
        String str4 = str;
        if ((i2 & 16) != 0) {
            str2 = tonesPlaybackDto.title;
        }
        String str5 = str2;
        if ((i2 & 32) != 0) {
            str3 = tonesPlaybackDto.author;
        }
        String str6 = str3;
        if ((i2 & 64) != 0) {
            bool = tonesPlaybackDto.isPaused;
        }
        return tonesPlaybackDto.copy(i, num2, l2, str4, str5, str6, bool);
    }

    public final int component1() {
        return this.productId;
    }

    public final Integer component2() {
        return this.trackNumber;
    }

    public final Long component3() {
        return this.trackPosition;
    }

    public final String component4() {
        return this.coverUrl;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.author;
    }

    public final Boolean component7() {
        return this.isPaused;
    }

    public final TonesPlaybackDto copy(int i, Integer num, Long l, String str, String str2, String str3, Boolean bool) {
        return new TonesPlaybackDto(i, num, l, str, str2, str3, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TonesPlaybackDto) {
            TonesPlaybackDto tonesPlaybackDto = (TonesPlaybackDto) obj;
            return this.productId == tonesPlaybackDto.productId && Intrinsics.areEqual(this.trackNumber, tonesPlaybackDto.trackNumber) && Intrinsics.areEqual(this.trackPosition, tonesPlaybackDto.trackPosition) && Intrinsics.areEqual(this.coverUrl, tonesPlaybackDto.coverUrl) && Intrinsics.areEqual(this.title, tonesPlaybackDto.title) && Intrinsics.areEqual(this.author, tonesPlaybackDto.author) && Intrinsics.areEqual(this.isPaused, tonesPlaybackDto.isPaused);
        }
        return false;
    }

    public int hashCode() {
        int i = this.productId * 31;
        Integer num = this.trackNumber;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.trackPosition;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.coverUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.author;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isPaused;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "TonesPlaybackDto(productId=" + this.productId + ", trackNumber=" + this.trackNumber + ", trackPosition=" + this.trackPosition + ", coverUrl=" + this.coverUrl + ", title=" + this.title + ", author=" + this.author + ", isPaused=" + this.isPaused + ')';
    }

    public TonesPlaybackDto(int i, Integer num, Long l, String str, String str2, String str3, Boolean bool) {
        this.productId = i;
        this.trackNumber = num;
        this.trackPosition = l;
        this.coverUrl = str;
        this.title = str2;
        this.author = str3;
        this.isPaused = bool;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final Integer getTrackNumber() {
        return this.trackNumber;
    }

    public final Long getTrackPosition() {
        return this.trackPosition;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAuthor() {
        return this.author;
    }

    public /* synthetic */ TonesPlaybackDto(int i, Integer num, Long l, String str, String str2, String str3, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) == 0 ? str3 : null, (i2 & 64) != 0 ? false : bool);
    }

    public final Boolean isPaused() {
        return this.isPaused;
    }

    public TonesPlaybackDto(int i, String str, String str2, String str3, Boolean bool) {
        this(i, (Integer) null, (Long) null, str, str2, str3, (Boolean) null);
    }

    public /* synthetic */ TonesPlaybackDto(int i, String str, String str2, String str3, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : bool);
    }
}
