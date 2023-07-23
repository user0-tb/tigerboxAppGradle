package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import com.google.android.exoplayer2.util.Util;
import media.tiger.tigerbox.services.implementations.downloadsManager.DownloadsManager;

/* loaded from: classes.dex */
final class HtmlUtils {
    private HtmlUtils() {
    }

    public static String toCssRgba(int i) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }

    public static String cssAllClassDescendantsSelector(String str) {
        return DownloadsManager.EXTENSION_SEPARATOR + str + ",." + str + " *";
    }
}
