package media.tiger.tigerbox.utils;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RotateDrawableAnimator.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lmedia/tiger/tigerbox/utils/RotateDrawableAnimator;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "mValueAnimator", "Landroid/animation/ValueAnimator;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RotateDrawableAnimator {
    private final Drawable drawable;
    private final ValueAnimator mValueAnimator;

    public RotateDrawableAnimator(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.drawable = drawable;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10000);
        Intrinsics.checkNotNullExpressionValue(ofInt, "ofInt(0, 10000)");
        this.mValueAnimator = ofInt;
        ofInt.setDuration(3600L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: media.tiger.tigerbox.utils.RotateDrawableAnimator$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RotateDrawableAnimator.m2030_init_$lambda0(RotateDrawableAnimator.this, valueAnimator);
            }
        });
        ofInt.setRepeatMode(1);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m2030_init_$lambda0(RotateDrawableAnimator this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Drawable drawable = this$0.drawable;
        Object animatedValue = animation.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        drawable.setLevel(((Integer) animatedValue).intValue());
    }
}
