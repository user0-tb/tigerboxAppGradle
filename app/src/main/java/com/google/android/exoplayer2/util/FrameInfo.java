package com.google.android.exoplayer2.util;

/* loaded from: classes.dex */
public class FrameInfo {
    public final int height;
    public final float pixelWidthHeightRatio;
    public final long streamOffsetUs;
    public final int width;

    public FrameInfo(int i, int i2, float f, long j) {
        boolean z = i > 0;
        Assertions.checkArgument(z, "width must be positive, but is: " + i);
        boolean z2 = i2 > 0;
        Assertions.checkArgument(z2, "height must be positive, but is: " + i2);
        this.width = i;
        this.height = i2;
        this.pixelWidthHeightRatio = f;
        this.streamOffsetUs = j;
    }
}
