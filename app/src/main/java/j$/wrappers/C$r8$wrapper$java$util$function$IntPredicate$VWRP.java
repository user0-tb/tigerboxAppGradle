package j$.wrappers;

import j$.util.function.BinaryOperator;
import j$.util.function.DoubleBinaryOperator;
import j$.util.function.DoubleFunction;
import j$.util.function.DoubleToLongFunction;
import j$.util.function.IntBinaryOperator;
import j$.util.function.IntToLongFunction;
import j$.util.function.LongBinaryOperator;
import j$.util.function.LongFunction;
import j$.util.function.LongUnaryOperator;
import j$.util.function.ObjDoubleConsumer;
import j$.util.function.ObjIntConsumer;
import j$.util.function.ObjLongConsumer;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

/* renamed from: j$.wrappers.$r8$wrapper$java$util$function$IntPredicate$-V-WRP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C$r8$wrapper$java$util$function$IntPredicate$VWRP implements BinaryOperator, DoubleBinaryOperator, DoubleFunction, DoubleToLongFunction, IntBinaryOperator, IntToLongFunction, LongBinaryOperator, LongFunction, LongUnaryOperator, ObjDoubleConsumer, ObjIntConsumer, ObjLongConsumer {
    final /* synthetic */ Object wrappedValue;

    public /* synthetic */ C$r8$wrapper$java$util$function$IntPredicate$VWRP(java.util.function.BinaryOperator binaryOperator) {
        this.wrappedValue = binaryOperator;
    }

    public static /* synthetic */ BinaryOperator convert(java.util.function.BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$function$IntPredicate$VWRP(binaryOperator);
    }

    public static /* synthetic */ C$r8$wrapper$java$util$function$IntPredicate$VWRP convert(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$function$IntPredicate$VWRP(doublePredicate);
    }

    public static /* synthetic */ C$r8$wrapper$java$util$function$IntPredicate$VWRP convert(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$function$IntPredicate$VWRP(intPredicate);
    }

    public static /* synthetic */ C$r8$wrapper$java$util$function$IntPredicate$VWRP convert(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return new C$r8$wrapper$java$util$function$IntPredicate$VWRP(longPredicate);
    }

    @Override // j$.util.function.ObjDoubleConsumer
    public /* synthetic */ void accept(Object obj, double d) {
        ((java.util.function.ObjDoubleConsumer) this.wrappedValue).accept(obj, d);
    }

    @Override // j$.util.function.ObjIntConsumer
    public /* synthetic */ void accept(Object obj, int i) {
        ((java.util.function.ObjIntConsumer) this.wrappedValue).accept(obj, i);
    }

    @Override // j$.util.function.ObjLongConsumer
    public /* synthetic */ void accept(Object obj, long j) {
        ((java.util.function.ObjLongConsumer) this.wrappedValue).accept(obj, j);
    }

    @Override // j$.util.function.DoubleFunction
    public /* synthetic */ Object apply(double d) {
        return ((java.util.function.DoubleFunction) this.wrappedValue).apply(d);
    }

    @Override // j$.util.function.LongFunction
    public /* synthetic */ Object apply(long j) {
        return ((java.util.function.LongFunction) this.wrappedValue).apply(j);
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return ((java.util.function.BinaryOperator) this.wrappedValue).apply(obj, obj2);
    }

    public double applyAsDouble(double d) {
        return ((DoubleUnaryOperator) this.wrappedValue).applyAsDouble(d);
    }

    @Override // j$.util.function.DoubleBinaryOperator
    public /* synthetic */ double applyAsDouble(double d, double d2) {
        return ((java.util.function.DoubleBinaryOperator) this.wrappedValue).applyAsDouble(d, d2);
    }

    public double applyAsDouble(int i) {
        return ((IntToDoubleFunction) this.wrappedValue).applyAsDouble(i);
    }

    public double applyAsDouble(long j) {
        return ((LongToDoubleFunction) this.wrappedValue).applyAsDouble(j);
    }

    public int applyAsInt(double d) {
        return ((DoubleToIntFunction) this.wrappedValue).applyAsInt(d);
    }

    public int applyAsInt(int i) {
        return ((IntUnaryOperator) this.wrappedValue).applyAsInt(i);
    }

    @Override // j$.util.function.IntBinaryOperator
    public /* synthetic */ int applyAsInt(int i, int i2) {
        return ((java.util.function.IntBinaryOperator) this.wrappedValue).applyAsInt(i, i2);
    }

    public int applyAsInt(long j) {
        return ((LongToIntFunction) this.wrappedValue).applyAsInt(j);
    }

    @Override // j$.util.function.DoubleToLongFunction
    public /* synthetic */ long applyAsLong(double d) {
        return ((java.util.function.DoubleToLongFunction) this.wrappedValue).applyAsLong(d);
    }

    @Override // j$.util.function.IntToLongFunction
    public /* synthetic */ long applyAsLong(int i) {
        return ((java.util.function.IntToLongFunction) this.wrappedValue).applyAsLong(i);
    }

    @Override // j$.util.function.LongUnaryOperator
    public /* synthetic */ long applyAsLong(long j) {
        return ((java.util.function.LongUnaryOperator) this.wrappedValue).applyAsLong(j);
    }

    @Override // j$.util.function.LongBinaryOperator
    public /* synthetic */ long applyAsLong(long j, long j2) {
        return ((java.util.function.LongBinaryOperator) this.wrappedValue).applyAsLong(j, j2);
    }

    public boolean test(double d) {
        return ((DoublePredicate) this.wrappedValue).test(d);
    }

    public boolean test(int i) {
        return ((IntPredicate) this.wrappedValue).test(i);
    }

    public boolean test(long j) {
        return ((LongPredicate) this.wrappedValue).test(j);
    }

    public /* synthetic */ C$r8$wrapper$java$util$function$IntPredicate$VWRP(DoublePredicate doublePredicate) {
        this.wrappedValue = doublePredicate;
    }

    public /* synthetic */ C$r8$wrapper$java$util$function$IntPredicate$VWRP(IntPredicate intPredicate) {
        this.wrappedValue = intPredicate;
    }

    public /* synthetic */ C$r8$wrapper$java$util$function$IntPredicate$VWRP(LongPredicate longPredicate) {
        this.wrappedValue = longPredicate;
    }
}
