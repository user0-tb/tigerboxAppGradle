package media.tiger.tigerbox.services.interfaces.audioPlayer;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.domain.DownloadReason;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: AudioPlayerService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B;\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000eHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/AudioProductInfo;", "Ljava/io/Serializable;", "productId", "", "hls", "", "cover", "(ILjava/lang/String;Ljava/lang/String;)V", TtmlNode.ATTR_ID, "hlsPath", "coverPath", MessageBundle.TITLE_ENTRY, "author", "downloadReason", "Lmedia/tiger/tigerbox/model/domain/DownloadReason;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmedia/tiger/tigerbox/model/domain/DownloadReason;)V", "getAuthor", "()Ljava/lang/String;", "getCoverPath", "getDownloadReason", "()Lmedia/tiger/tigerbox/model/domain/DownloadReason;", "getHlsPath", "getId", "()I", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AudioProductInfo implements Serializable {
    private final String author;
    private final String coverPath;
    private final DownloadReason downloadReason;
    private final String hlsPath;
    private final int id;
    private final String title;

    public static /* synthetic */ AudioProductInfo copy$default(AudioProductInfo audioProductInfo, int i, String str, String str2, String str3, String str4, DownloadReason downloadReason, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = audioProductInfo.id;
        }
        if ((i2 & 2) != 0) {
            str = audioProductInfo.hlsPath;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = audioProductInfo.coverPath;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = audioProductInfo.title;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = audioProductInfo.author;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            downloadReason = audioProductInfo.downloadReason;
        }
        return audioProductInfo.copy(i, str5, str6, str7, str8, downloadReason);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.hlsPath;
    }

    public final String component3() {
        return this.coverPath;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.author;
    }

    public final DownloadReason component6() {
        return this.downloadReason;
    }

    public final AudioProductInfo copy(int i, String hlsPath, String coverPath, String title, String author, DownloadReason downloadReason) {
        Intrinsics.checkNotNullParameter(hlsPath, "hlsPath");
        Intrinsics.checkNotNullParameter(coverPath, "coverPath");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(downloadReason, "downloadReason");
        return new AudioProductInfo(i, hlsPath, coverPath, title, author, downloadReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioProductInfo) {
            AudioProductInfo audioProductInfo = (AudioProductInfo) obj;
            return this.id == audioProductInfo.id && Intrinsics.areEqual(this.hlsPath, audioProductInfo.hlsPath) && Intrinsics.areEqual(this.coverPath, audioProductInfo.coverPath) && Intrinsics.areEqual(this.title, audioProductInfo.title) && Intrinsics.areEqual(this.author, audioProductInfo.author) && this.downloadReason == audioProductInfo.downloadReason;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.id * 31) + this.hlsPath.hashCode()) * 31) + this.coverPath.hashCode()) * 31) + this.title.hashCode()) * 31) + this.author.hashCode()) * 31) + this.downloadReason.hashCode();
    }

    public String toString() {
        return "AudioProductInfo(id=" + this.id + ", hlsPath=" + this.hlsPath + ", coverPath=" + this.coverPath + ", title=" + this.title + ", author=" + this.author + ", downloadReason=" + this.downloadReason + ')';
    }

    public AudioProductInfo(int i, String hlsPath, String coverPath, String title, String author, DownloadReason downloadReason) {
        Intrinsics.checkNotNullParameter(hlsPath, "hlsPath");
        Intrinsics.checkNotNullParameter(coverPath, "coverPath");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(downloadReason, "downloadReason");
        this.id = i;
        this.hlsPath = hlsPath;
        this.coverPath = coverPath;
        this.title = title;
        this.author = author;
        this.downloadReason = downloadReason;
    }

    public final int getId() {
        return this.id;
    }

    public final String getHlsPath() {
        return this.hlsPath;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAuthor() {
        return this.author;
    }

    public /* synthetic */ AudioProductInfo(int i, String str, String str2, String str3, String str4, DownloadReason downloadReason, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? DownloadReason.NONE : downloadReason);
    }

    public final DownloadReason getDownloadReason() {
        return this.downloadReason;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioProductInfo(int i, String hls, String cover) {
        this(i, hls, cover, "", "", DownloadReason.NONE);
        Intrinsics.checkNotNullParameter(hls, "hls");
        Intrinsics.checkNotNullParameter(cover, "cover");
    }
}
