package media.tiger.tigerbox.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.R;
import timber.log.Timber;

/* compiled from: BatteryView.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010'\u001a\u0004\u0018\u00010\u001a2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0014J\b\u0010.\u001a\u00020+H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\"\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lmedia/tiger/tigerbox/ui/view/BatteryView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "anim", "Landroid/view/animation/Animation;", "animationsEnabled", "", "getAnimationsEnabled", "()Z", "value", "batteryColor", "setBatteryColor", "(I)V", "", "batteryPercent", "getBatteryPercent", "()F", "setBatteryPercent", "(F)V", "bitmap", "Landroid/graphics/Bitmap;", "bitmapRect", "Landroid/graphics/RectF;", "borderRect", "chargingColor", "drawableResource", "fillRect", "headRect", "isCharging", "setCharging", "(Z)V", "paint", "Landroid/graphics/Paint;", "getBitmapFromDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "startBlinkingAnimation", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BatteryView extends View {
    private Animation anim;
    private int batteryColor;
    private float batteryPercent;
    private Bitmap bitmap;
    private final RectF bitmapRect;
    private final RectF borderRect;
    private int chargingColor;
    private int drawableResource;
    private final RectF fillRect;
    private final RectF headRect;
    private boolean isCharging;
    private final Paint paint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BatteryView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chargingColor = -7829368;
        this.paint = new Paint();
        this.borderRect = new RectF();
        this.fillRect = new RectF();
        this.headRect = new RectF();
        this.bitmapRect = new RectF();
        this.batteryColor = -7829368;
        this.isCharging = true;
        int[] BatteryView = R.styleable.BatteryView;
        Intrinsics.checkNotNullExpressionValue(BatteryView, "BatteryView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BatteryView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setBatteryPercent(obtainStyledAttributes.getFloat(4, 0.0f));
        setBatteryColor(obtainStyledAttributes.getInt(2, -7829368));
        this.chargingColor = obtainStyledAttributes.getInt(1, -7829368);
        setCharging(obtainStyledAttributes.getBoolean(0, false));
        this.drawableResource = obtainStyledAttributes.getResourceId(3, -1);
        obtainStyledAttributes.recycle();
        int i2 = this.drawableResource;
        if (i2 != -1) {
            this.bitmap = getBitmapFromDrawable(ContextCompat.getDrawable(context, i2));
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.battery_blinking_animation);
        loadAnimation.setRepeatCount(-1);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R…mation.INFINITE\n        }");
        this.anim = loadAnimation;
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: media.tiger.tigerbox.ui.view.BatteryView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (BatteryView.this.isCharging() || BatteryView.this.getBatteryPercent() > 5.0f) {
                    return;
                }
                BatteryView batteryView = BatteryView.this;
                batteryView.startAnimation(batteryView.anim);
            }
        });
    }

    private final boolean getAnimationsEnabled() {
        try {
            if (Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale") == 0.0f) {
                if (Settings.Global.getFloat(getContext().getContentResolver(), "transition_animation_scale") == 0.0f) {
                    return !((Settings.Global.getFloat(getContext().getContentResolver(), "window_animation_scale") > 0.0f ? 1 : (Settings.Global.getFloat(getContext().getContentResolver(), "window_animation_scale") == 0.0f ? 0 : -1)) == 0);
                }
                return true;
            }
            return true;
        } catch (Settings.SettingNotFoundException e) {
            Timber.Forest forest = Timber.Forest;
            forest.i("BatteryView: Error getting animation settings: " + e.getMessage(), new Object[0]);
            return true;
        }
    }

    private final void setBatteryColor(int i) {
        this.batteryColor = i;
        invalidate();
    }

    public final float getBatteryPercent() {
        return this.batteryPercent;
    }

    public final void setBatteryPercent(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 100.0f) {
            f = 100.0f;
        }
        this.batteryPercent = f;
        if (f <= 5.0f) {
            startBlinkingAnimation();
        } else {
            clearAnimation();
        }
        invalidate();
    }

    public final boolean isCharging() {
        return this.isCharging;
    }

    public final void setCharging(boolean z) {
        this.isCharging = z;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        Bitmap bitmap;
        Bitmap bitmap2;
        float f;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = this.paint;
        paint.setAntiAlias(true);
        if (this.isCharging) {
            i = this.chargingColor;
        } else {
            i = this.batteryColor;
        }
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getWidth() / 20.0f);
        float width = getWidth() / 20.0f;
        RectF rectF = this.borderRect;
        rectF.left = width;
        rectF.top = width;
        float f2 = 2;
        float f3 = width * f2;
        rectF.right = getWidth() - f3;
        rectF.bottom = getHeight() - width;
        canvas.drawRoundRect(this.borderRect, 5.0f, 5.0f, this.paint);
        this.paint.setStrokeWidth(0.0f);
        this.paint.setStyle(Paint.Style.FILL);
        RectF rectF2 = this.headRect;
        rectF2.left = getWidth() - width;
        rectF2.top = getHeight() * 0.3f;
        rectF2.right = getWidth();
        rectF2.bottom = getHeight() * 0.7f;
        canvas.drawRoundRect(this.headRect, 1.0f, 1.0f, this.paint);
        float width2 = getWidth() - (width * 3);
        if (!this.isCharging) {
            width2 = (((width2 - f3) / 10) * ((float) Math.ceil(this.batteryPercent / f))) + f3;
            float f4 = this.batteryPercent;
            if (f4 <= 5.0f) {
                this.paint.setColor(this.chargingColor);
            } else if (f4 <= 20.0f) {
                this.paint.setColor(this.chargingColor);
            }
        }
        RectF rectF3 = this.fillRect;
        rectF3.left = f3;
        rectF3.top = f3;
        rectF3.right = width2;
        rectF3.bottom = getHeight() - f3;
        canvas.drawRoundRect(this.fillRect, 2.0f, 2.0f, this.paint);
        if (!this.isCharging || (bitmap = this.bitmap) == null) {
            return;
        }
        Float valueOf = bitmap != null ? Float.valueOf(bitmap.getWidth()) : null;
        Intrinsics.checkNotNull(valueOf);
        float floatValue = valueOf.floatValue();
        Float valueOf2 = this.bitmap != null ? Float.valueOf(bitmap2.getHeight()) : null;
        Intrinsics.checkNotNull(valueOf2);
        float floatValue2 = valueOf2.floatValue();
        if (floatValue2 > getHeight()) {
            floatValue -= floatValue2 - getHeight();
            floatValue2 = getHeight();
        }
        RectF rectF4 = this.bitmapRect;
        float f5 = floatValue / f2;
        rectF4.left = ((getWidth() / 2) - f5) + f3;
        float f6 = floatValue2 / f2;
        rectF4.top = (getHeight() / 2) - f6;
        rectF4.right = ((getWidth() / 2) + f5) - f3;
        rectF4.bottom = (getHeight() / 2) + f6;
        Bitmap bitmap3 = this.bitmap;
        Intrinsics.checkNotNull(bitmap3);
        canvas.drawBitmap(bitmap3, (Rect) null, this.bitmapRect, this.paint);
    }

    private final void startBlinkingAnimation() {
        if (this.isCharging) {
            clearAnimation();
        } else if (getAnimationsEnabled()) {
            startAnimation(this.anim);
        }
    }

    private final Bitmap getBitmapFromDrawable(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
