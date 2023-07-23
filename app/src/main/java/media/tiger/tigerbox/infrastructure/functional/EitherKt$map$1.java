package media.tiger.tigerbox.infrastructure.functional;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import media.tiger.tigerbox.infrastructure.functional.Either;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Either.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EitherKt$map$1<T> extends FunctionReferenceImpl implements Function1<T, Either.Right<? extends T>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public EitherKt$map$1(Object obj) {
        super(1, obj, Either.class, TtmlNode.RIGHT, "right(Ljava/lang/Object;)Lmedia/tiger/tigerbox/infrastructure/functional/Either$Right;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke((EitherKt$map$1<T>) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Either.Right<T> invoke(T t) {
        return ((Either) this.receiver).right(t);
    }
}
