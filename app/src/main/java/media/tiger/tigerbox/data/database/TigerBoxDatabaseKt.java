package media.tiger.tigerbox.data.database;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TigerBoxDatabase.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"MIGRATION_TIGERBOX_DATABASE_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_TIGERBOX_DATABASE_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_TIGERBOX_DATABASE_2_3", "getMIGRATION_TIGERBOX_DATABASE_2_3", "app_tigerBoxRelease"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TigerBoxDatabaseKt {
    private static final Migration MIGRATION_TIGERBOX_DATABASE_1_2 = new Migration() { // from class: media.tiger.tigerbox.data.database.TigerBoxDatabaseKt$MIGRATION_TIGERBOX_DATABASE_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("ALTER TABLE tigerboxUser ADD COLUMN activeProfileId INTEGER NOT NULL DEFAULT -1");
            database.execSQL("ALTER TABLE tigerboxUser ADD COLUMN pin TEXT");
        }
    };
    private static final Migration MIGRATION_TIGERBOX_DATABASE_2_3 = new Migration() { // from class: media.tiger.tigerbox.data.database.TigerBoxDatabaseKt$MIGRATION_TIGERBOX_DATABASE_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE IF NOT EXISTS `playbackPositions` (`trackPosition` INTEGER NOT NULL DEFAULT 0, `modifiedDate` TEXT NOT NULL DEFAULT '', `id` INTEGER NOT NULL, `userId` INTEGER NOT NULL DEFAULT -1, `productId` INTEGER NOT NULL DEFAULT -1, `trackNumber` INTEGER NOT NULL DEFAULT -1, PRIMARY KEY (`id`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `playbackTracking` (`id` INTEGER NOT NULL, `accountId` INTEGER NOT NULL DEFAULT -1, `userId` INTEGER NOT NULL DEFAULT -1, `productId` INTEGER NOT NULL DEFAULT -1, `event` TEXT NOT NULL DEFAULT 'progress', `start` INTEGER NOT NULL DEFAULT 0, `end` INTEGER NOT NULL DEFAULT 0, `total` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (`id`))");
            database.execSQL("CREATE TABLE IF NOT EXISTS `hlsKeys` (`id` INTEGER NOT NULL, `key` TEXT NOT NULL DEFAULT '', `url` TEXT NOT NULL DEFAULT '', PRIMARY KEY (`id`))");
        }
    };

    public static final Migration getMIGRATION_TIGERBOX_DATABASE_1_2() {
        return MIGRATION_TIGERBOX_DATABASE_1_2;
    }

    public static final Migration getMIGRATION_TIGERBOX_DATABASE_2_3() {
        return MIGRATION_TIGERBOX_DATABASE_2_3;
    }
}
