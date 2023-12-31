package media.tiger.tigerbox.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.dto.PlayState;

/* compiled from: PostPlayStateUseCase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/usecase/PostProductPlayStateParameters;", "", "playState", "Lmedia/tiger/tigerbox/model/dto/PlayState;", "(Lmedia/tiger/tigerbox/model/dto/PlayState;)V", "getPlayState", "()Lmedia/tiger/tigerbox/model/dto/PlayState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PostProductPlayStateParameters {
    private final PlayState playState;

    public static /* synthetic */ PostProductPlayStateParameters copy$default(PostProductPlayStateParameters postProductPlayStateParameters, PlayState playState, int i, Object obj) {
        if ((i & 1) != 0) {
            playState = postProductPlayStateParameters.playState;
        }
        return postProductPlayStateParameters.copy(playState);
    }

    public final PlayState component1() {
        return this.playState;
    }

    public final PostProductPlayStateParameters copy(PlayState playState) {
        Intrinsics.checkNotNullParameter(playState, "playState");
        return new PostProductPlayStateParameters(playState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostProductPlayStateParameters) && Intrinsics.areEqual(this.playState, ((PostProductPlayStateParameters) obj).playState);
    }

    public int hashCode() {
        return this.playState.hashCode();
    }

    public String toString() {
        return "PostProductPlayStateParameters(playState=" + this.playState + ')';
    }

    public PostProductPlayStateParameters(PlayState playState) {
        Intrinsics.checkNotNullParameter(playState, "playState");
        this.playState = playState;
    }

    public final PlayState getPlayState() {
        return this.playState;
    }
}
