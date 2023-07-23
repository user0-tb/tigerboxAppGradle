package media.tiger.tigerbox.utils;

import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: FileUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lmedia/tiger/tigerbox/utils/FileUtils;", "", "()V", "TAG", "", "isFileExists", "", "filePath", "readToString", "path", "writeFile", "", "value", "", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();
    private static final String TAG = "FileUtils";

    private FileUtils() {
    }

    public final void writeFile(String path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        writeFile(path, String.valueOf(i));
    }

    public final boolean isFileExists(String str) {
        File file = new File(str);
        return file.exists() && file.canRead() && file.length() > 0;
    }

    public final void writeFile(String path, String str) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (str == null) {
            return;
        }
        try {
            FilesKt.writeText$default(new File(path), str, null, 2, null);
        } catch (Exception e) {
            Timber.Forest forest = Timber.Forest;
            forest.e("FileUtils: ERROR: while writing to file [" + path + "]: [" + e + ']', new Object[0]);
        }
    }

    public final String readToString(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = new File(path);
        if (file.exists()) {
            try {
                return FilesKt.readText$default(file, null, 1, null);
            } catch (Exception e) {
                Timber.Forest forest = Timber.Forest;
                forest.e("FileUtils: ERROR: while reading from file [" + path + "]: [" + e + ']', new Object[0]);
                return "";
            }
        }
        return "";
    }
}
