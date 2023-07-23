package media.tiger.tigerbox.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.R;

/* compiled from: CircleProgressImageView.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 l2\u00020\u0001:\u0002lmB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u00109\u001a\u00020:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0010\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010A\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010B\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010C\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0002J\u0014\u0010D\u001a\u0004\u0018\u00010\n2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\u0018\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020\u00172\u0006\u0010I\u001a\u00020\u0017H\u0002J\b\u0010J\u001a\u00020:H\u0002J\u0010\u0010K\u001a\u00020:2\u0006\u0010>\u001a\u00020?H\u0014J(\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u0007H\u0014J\u0010\u0010Q\u001a\u00020 2\u0006\u0010R\u001a\u00020SH\u0017J\u0010\u0010T\u001a\u00020:2\u0006\u0010U\u001a\u00020 H\u0016J\u0010\u0010V\u001a\u00020:2\b\b\u0001\u0010W\u001a\u00020\u0007J\u0012\u0010X\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0012\u0010Y\u001a\u00020:2\b\u0010Z\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010[\u001a\u00020:2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0012\u0010\\\u001a\u00020:2\b\b\u0001\u0010]\u001a\u00020\u0007H\u0016J\u0012\u0010^\u001a\u00020:2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J(\u0010a\u001a\u00020:2\u0006\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u0007H\u0016J(\u0010f\u001a\u00020:2\u0006\u0010g\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u0007H\u0016J\u0010\u0010i\u001a\u00020:2\u0006\u0010j\u001a\u00020 H\u0016J\b\u0010k\u001a\u00020:H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001b\u0010\u0014R\u001e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u001d\u0010\u0014R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010#\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0014R\u000e\u0010'\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010(\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010\u0014R\u000e\u0010+\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010.\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020-@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n 8*\u0004\u0018\u00010707X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lmedia/tiger/tigerbox/ui/view/CircleProgressImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bitmap", "Landroid/graphics/Bitmap;", "bitmapHeight", "bitmapPaint", "Landroid/graphics/Paint;", "bitmapShader", "Landroid/graphics/BitmapShader;", "bitmapWidth", "value", "borderColor", "setBorderColor", "(I)V", "borderPaint", "borderRadius", "", "borderRect", "Landroid/graphics/RectF;", "borderWidth", "setBorderWidth", "circleBackgroundColor", "setCircleBackgroundColor", "circleBackgroundPaint", "disableCircularTransformation", "", "drawableRadius", "drawableRect", "max", "getMax", "()I", "setMax", "needBackgroundAndText", "progress", "getProgress", "setProgress", "ready", "setupPending", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "textColor", "textPaint", "textSize", "textTypeface", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "applyColorFilter", "", "cf", "Landroid/graphics/ColorFilter;", "drawBackground", "canvas", "Landroid/graphics/Canvas;", "drawImage", "drawProgressCircle", "drawText", "drawTextAndImage", "getBitmapFromDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "inTouchableArea", "x", "y", "initializeBitmap", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "setAdjustViewBounds", "adjustViewBounds", "setCircleBackgroundColorResource", "circleBackgroundRes", "setColorFilter", "setImageBitmap", "bm", "setImageDrawable", "setImageResource", "resId", "setImageURI", "uri", "Landroid/net/Uri;", "setPadding", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "setPaddingRelative", TtmlNode.START, TtmlNode.END, "setSelected", "selected", "setup", "Companion", "OutlineProvider", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CircleProgressImageView extends AppCompatImageView {
    private static final int COLOR_DRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR = -3355444;
    private static final int DEFAULT_BORDER_WIDTH = 10;
    private static final int DEFAULT_CIRCLE_BACKGROUND_COLOR = -12303292;
    private static final int DEFAULT_MAX_VALUE = 100;
    private static final int DEFAULT_TEXT_COLOR = -1;
    private static final int DEFAULT_TEXT_SIZE = 60;
    private Bitmap bitmap;
    private int bitmapHeight;
    private final Paint bitmapPaint;
    private BitmapShader bitmapShader;
    private int bitmapWidth;
    private int borderColor;
    private final Paint borderPaint;
    private float borderRadius;
    private final RectF borderRect;
    private int borderWidth;
    private int circleBackgroundColor;
    private final Paint circleBackgroundPaint;
    private boolean disableCircularTransformation;
    private float drawableRadius;
    private final RectF drawableRect;
    private int max;
    private boolean needBackgroundAndText;
    private int progress;
    private boolean ready;
    private boolean setupPending;
    private String text;
    private int textColor;
    private final Paint textPaint;
    private int textSize;
    private Typeface textTypeface;
    public static final Companion Companion = new Companion(null);
    private static final ImageView.ScaleType SCALE_TYPE = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressImageView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CircleProgressImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.drawableRect = new RectF();
        this.borderRect = new RectF();
        this.bitmapPaint = new Paint(2);
        this.borderPaint = new Paint();
        this.circleBackgroundPaint = new Paint();
        this.textPaint = new Paint();
        this.textSize = 60;
        this.textColor = -1;
        this.textTypeface = Typeface.DEFAULT_BOLD;
        this.borderColor = DEFAULT_BORDER_COLOR;
        this.borderWidth = 10;
        this.circleBackgroundColor = DEFAULT_CIRCLE_BACKGROUND_COLOR;
        String str = "";
        this.text = "";
        int[] CircleProgressImageView = R.styleable.CircleProgressImageView;
        Intrinsics.checkNotNullExpressionValue(CircleProgressImageView, "CircleProgressImageView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CircleProgressImageView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setBorderWidth(obtainStyledAttributes.getDimensionPixelSize(5, 10));
        setBorderColor(obtainStyledAttributes.getColor(2, DEFAULT_BORDER_COLOR));
        setMax(obtainStyledAttributes.getInt(3, 100));
        setProgress(obtainStyledAttributes.getInt(4, 0));
        if (this.progress < 0) {
            setProgress(0);
        }
        int i2 = this.progress;
        int i3 = this.max;
        if (i2 > i3) {
            setProgress(i3);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setCircleBackgroundColor(obtainStyledAttributes.getColor(0, DEFAULT_CIRCLE_BACKGROUND_COLOR));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            String string = obtainStyledAttributes.getString(1);
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(string, "this.getString(R.styleab…ew_civ_center_text) ?: \"\"");
                str = string;
            }
            setText(str);
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.textSize = obtainStyledAttributes.getDimensionPixelSize(7, 60);
        }
        this.textColor = -1;
        if (obtainStyledAttributes.hasValue(6)) {
            this.textColor = obtainStyledAttributes.getColor(6, -1);
        }
        obtainStyledAttributes.recycle();
        super.setScaleType(SCALE_TYPE);
        this.ready = true;
        setOutlineProvider(new OutlineProvider());
        if (this.setupPending) {
            setup();
            this.setupPending = false;
        }
        invalidate();
    }

    private final void setBorderColor(int i) {
        if (i == this.borderColor) {
            return;
        }
        this.borderColor = i;
        this.borderPaint.setColor(i);
        invalidate();
    }

    private final void setBorderWidth(int i) {
        if (i == this.borderWidth) {
            return;
        }
        this.borderWidth = i;
        setup();
    }

    private final void setCircleBackgroundColor(int i) {
        if (this.circleBackgroundColor == i) {
            return;
        }
        this.circleBackgroundColor = i;
        this.circleBackgroundPaint.setColor(i);
        setup();
    }

    public final int getMax() {
        return this.max;
    }

    public final void setMax(int i) {
        this.max = i;
        if (this.progress > i) {
            setProgress(i);
        }
        setProgress((int) ((this.progress / i) * 360.0f));
        setup();
    }

    public final int getProgress() {
        return this.progress;
    }

    public final void setProgress(int i) {
        if (i < 0) {
            i = 0;
        } else {
            int i2 = this.max;
            if (i > i2) {
                i = i2;
            }
        }
        this.progress = i;
        setup();
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.text = value;
        this.needBackgroundAndText = value.length() > 0;
        setup();
    }

    public final void setCircleBackgroundColorResource(int i) {
        setCircleBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (!(!z)) {
            throw new IllegalArgumentException("adjustViewBounds not supported.".toString());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setup();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        setup();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        setup();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        initializeBitmap();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        initializeBitmap();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        initializeBitmap();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        initializeBitmap();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        if (colorFilter == null) {
            return;
        }
        applyColorFilter(colorFilter);
        invalidate();
    }

    /* compiled from: CircleProgressImageView.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lmedia/tiger/tigerbox/ui/view/CircleProgressImageView$OutlineProvider;", "Landroid/view/ViewOutlineProvider;", "(Lmedia/tiger/tigerbox/ui/view/CircleProgressImageView;)V", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private final class OutlineProvider extends ViewOutlineProvider {
        public OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            Rect rect = new Rect();
            CircleProgressImageView.this.borderRect.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    static /* synthetic */ void applyColorFilter$default(CircleProgressImageView circleProgressImageView, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            colorFilter = circleProgressImageView.getColorFilter();
        }
        circleProgressImageView.applyColorFilter(colorFilter);
    }

    private final void applyColorFilter(ColorFilter colorFilter) {
        if (colorFilter == null) {
            return;
        }
        this.bitmapPaint.setColorFilter(colorFilter);
    }

    private final Bitmap getBitmapFromDrawable(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, BITMAP_CONFIG);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), BITMAP_CONFIG);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final void initializeBitmap() {
        Bitmap bitmapFromDrawable;
        if (this.disableCircularTransformation) {
            bitmapFromDrawable = null;
        } else {
            bitmapFromDrawable = getBitmapFromDrawable(getDrawable());
        }
        this.bitmap = bitmapFromDrawable;
        setup();
    }

    private final void setup() {
        if (!this.ready) {
            this.setupPending = true;
        } else if (getWidth() == 0 && getHeight() == 0) {
        } else {
            if (this.bitmap == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.bitmap;
            Intrinsics.checkNotNull(bitmap);
            this.bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            this.bitmapPaint.setAntiAlias(true);
            this.bitmapPaint.setShader(this.bitmapShader);
            this.borderPaint.setStyle(Paint.Style.STROKE);
            this.borderPaint.setAntiAlias(true);
            this.borderPaint.setColor(this.borderColor);
            this.borderPaint.setStrokeWidth(this.borderWidth);
            this.circleBackgroundPaint.setStyle(Paint.Style.FILL);
            this.circleBackgroundPaint.setAntiAlias(true);
            this.circleBackgroundPaint.setColor(this.circleBackgroundColor);
            this.textPaint.setAntiAlias(true);
            this.textPaint.setColor(this.textColor);
            this.textPaint.setTextSize(this.textSize);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.textPaint.setTextAlign(Paint.Align.CENTER);
            this.textPaint.setTypeface(this.textTypeface);
            Bitmap bitmap2 = this.bitmap;
            Intrinsics.checkNotNull(bitmap2);
            this.bitmapHeight = bitmap2.getHeight();
            Bitmap bitmap3 = this.bitmap;
            Intrinsics.checkNotNull(bitmap3);
            this.bitmapWidth = bitmap3.getWidth();
            float f = this.borderWidth / 2.0f;
            this.borderRect.set(f, f, getWidth() - f, getHeight() - f);
            this.borderRadius = Math.min((this.borderRect.height() - this.borderWidth) / 2.0f, (this.borderRect.width() - this.borderWidth) / 2.0f);
            RectF rectF = this.drawableRect;
            int i = this.borderWidth;
            rectF.set(i, i, getWidth() - this.borderWidth, getHeight() - this.borderWidth);
            this.drawableRadius = Math.min(this.drawableRect.height() / 2.0f, this.drawableRect.width() / 2.0f);
            applyColorFilter$default(this, null, 1, null);
            invalidate();
        }
    }

    private final boolean inTouchableArea(float f, float f2) {
        return Math.pow((double) (f - this.borderRect.centerX()), 2.0d) + Math.pow((double) (f2 - this.borderRect.centerY()), 2.0d) <= Math.pow((double) this.borderRadius, 2.0d);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return inTouchableArea(event.getX(), event.getY()) && super.onTouchEvent(event);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        initializeBitmap();
    }

    private final void drawBackground(Canvas canvas) {
        if (this.circleBackgroundColor != 0) {
            canvas.drawCircle(this.drawableRect.centerX(), this.drawableRect.centerY(), this.drawableRadius, this.circleBackgroundPaint);
        }
    }

    private final void drawProgressCircle(Canvas canvas) {
        if (this.borderWidth > 0) {
            canvas.drawArc(this.borderRect, -90.0f, (this.progress / this.max) * 360.0f, false, this.borderPaint);
        }
    }

    private final void drawText(Canvas canvas) {
        float f = 2;
        canvas.drawText(this.text, this.drawableRect.centerX(), (this.borderRect.centerY() - (this.textPaint.getFontMetrics().top / f)) - (this.textPaint.getFontMetrics().bottom / f), this.textPaint);
    }

    private final void drawImage(Canvas canvas) {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return;
        }
        Objects.requireNonNull(bitmap, "null cannot be cast to non-null type android.graphics.Bitmap");
        canvas.drawBitmap(bitmap, (Rect) null, this.drawableRect, this.bitmapPaint);
    }

    private final void drawTextAndImage(Canvas canvas) {
        float f = 2;
        float centerY = (this.borderRect.centerY() - (this.textPaint.getFontMetrics().top / f)) - (this.textPaint.getFontMetrics().bottom / f);
        canvas.drawCircle(this.drawableRect.centerX(), this.drawableRect.centerY(), this.drawableRadius, this.bitmapPaint);
        canvas.drawText(this.text, this.drawableRect.centerX(), centerY, this.textPaint);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.disableCircularTransformation) {
            super.onDraw(canvas);
            return;
        }
        drawBackground(canvas);
        if ((this.text.length() > 0) && this.bitmap != null) {
            drawTextAndImage(canvas);
        } else {
            if (this.text.length() > 0) {
                drawText(canvas);
            } else {
                drawImage(canvas);
            }
        }
        drawProgressCircle(canvas);
    }

    /* compiled from: CircleProgressImageView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lmedia/tiger/tigerbox/ui/view/CircleProgressImageView$Companion;", "", "()V", "BITMAP_CONFIG", "Landroid/graphics/Bitmap$Config;", "COLOR_DRAWABLE_DIMENSION", "", "DEFAULT_BORDER_COLOR", "DEFAULT_BORDER_WIDTH", "DEFAULT_CIRCLE_BACKGROUND_COLOR", "DEFAULT_MAX_VALUE", "DEFAULT_TEXT_COLOR", "DEFAULT_TEXT_SIZE", "SCALE_TYPE", "Landroid/widget/ImageView$ScaleType;", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
