package media.tiger.tigerbox.data.database;

import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TigerBoxDatabase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lmedia/tiger/tigerbox/data/database/TigerBoxDatabase;", "Landroidx/room/RoomDatabase;", "()V", "accessTokenDao", "Lmedia/tiger/tigerbox/data/database/AccessTokenDao;", "hlsKeysDao", "Lmedia/tiger/tigerbox/data/database/HlsKeysDao;", "playbackPositionsDao", "Lmedia/tiger/tigerbox/data/database/PlaybackPositionsDao;", "playbackTrackingDao", "Lmedia/tiger/tigerbox/data/database/PlaybackTrackingDao;", "tigerBoxProfileDao", "Lmedia/tiger/tigerbox/data/database/TigerBoxProfileDao;", "tigerBoxUserDao", "Lmedia/tiger/tigerbox/data/database/TigerBoxUserDao;", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TigerBoxDatabase extends RoomDatabase {
    public static final Companion Companion = new Companion(null);
    public static final String DATABASE_NAME = "tigerboxDatabase";

    public abstract AccessTokenDao accessTokenDao();

    public abstract HlsKeysDao hlsKeysDao();

    public abstract PlaybackPositionsDao playbackPositionsDao();

    public abstract PlaybackTrackingDao playbackTrackingDao();

    public abstract TigerBoxProfileDao tigerBoxProfileDao();

    public abstract TigerBoxUserDao tigerBoxUserDao();

    /* compiled from: TigerBoxDatabase.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmedia/tiger/tigerbox/data/database/TigerBoxDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
