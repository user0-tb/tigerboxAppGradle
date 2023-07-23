package media.tiger.tigerbox.services.interfaces.audioPlayer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.domain.PlaybackPositionDomain$$ExternalSyntheticBackport0;
import org.spongycastle.i18n.MessageBundle;

/* compiled from: AudioTrackModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lmedia/tiger/tigerbox/services/interfaces/audioPlayer/AudioTrackModel;", "", MessageBundle.TITLE_ENTRY, "", TypedValues.TransitionType.S_DURATION, "", "encodingsM3ULocalPath", "encodingsM3UUrl", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getDuration", "()J", "getEncodingsM3ULocalPath", "()Ljava/lang/String;", "getEncodingsM3UUrl", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AudioTrackModel {
    private final long duration;
    private final String encodingsM3ULocalPath;
    private final String encodingsM3UUrl;
    private final String title;

    public static /* synthetic */ AudioTrackModel copy$default(AudioTrackModel audioTrackModel, String str, long j, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioTrackModel.title;
        }
        if ((i & 2) != 0) {
            j = audioTrackModel.duration;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = audioTrackModel.encodingsM3ULocalPath;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = audioTrackModel.encodingsM3UUrl;
        }
        return audioTrackModel.copy(str, j2, str4, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final long component2() {
        return this.duration;
    }

    public final String component3() {
        return this.encodingsM3ULocalPath;
    }

    public final String component4() {
        return this.encodingsM3UUrl;
    }

    public final AudioTrackModel copy(String title, long j, String encodingsM3ULocalPath, String encodingsM3UUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(encodingsM3ULocalPath, "encodingsM3ULocalPath");
        Intrinsics.checkNotNullParameter(encodingsM3UUrl, "encodingsM3UUrl");
        return new AudioTrackModel(title, j, encodingsM3ULocalPath, encodingsM3UUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioTrackModel) {
            AudioTrackModel audioTrackModel = (AudioTrackModel) obj;
            return Intrinsics.areEqual(this.title, audioTrackModel.title) && this.duration == audioTrackModel.duration && Intrinsics.areEqual(this.encodingsM3ULocalPath, audioTrackModel.encodingsM3ULocalPath) && Intrinsics.areEqual(this.encodingsM3UUrl, audioTrackModel.encodingsM3UUrl);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + PlaybackPositionDomain$$ExternalSyntheticBackport0.m(this.duration)) * 31) + this.encodingsM3ULocalPath.hashCode()) * 31) + this.encodingsM3UUrl.hashCode();
    }

    public String toString() {
        return "AudioTrackModel(title=" + this.title + ", duration=" + this.duration + ", encodingsM3ULocalPath=" + this.encodingsM3ULocalPath + ", encodingsM3UUrl=" + this.encodingsM3UUrl + ')';
    }

    public AudioTrackModel(String title, long j, String encodingsM3ULocalPath, String encodingsM3UUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(encodingsM3ULocalPath, "encodingsM3ULocalPath");
        Intrinsics.checkNotNullParameter(encodingsM3UUrl, "encodingsM3UUrl");
        this.title = title;
        this.duration = j;
        this.encodingsM3ULocalPath = encodingsM3ULocalPath;
        this.encodingsM3UUrl = encodingsM3UUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getEncodingsM3ULocalPath() {
        return this.encodingsM3ULocalPath;
    }

    public final String getEncodingsM3UUrl() {
        return this.encodingsM3UUrl;
    }
}
