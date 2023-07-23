package j$.util.concurrent;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
abstract class DesugarUnsafe {
    private static final Unsafe theUnsafe;

    static {
        Field field = getField();
        field.setAccessible(true);
        try {
            theUnsafe = (Unsafe) field.get(null);
        } catch (IllegalAccessException e) {
            throw new Error("Couldn't get the Unsafe", e);
        }
    }

    public static final int getAndAddInt(Unsafe unsafe, Object obj, long j, int i) {
        int intVolatile;
        do {
            intVolatile = unsafe.getIntVolatile(obj, j);
        } while (!unsafe.compareAndSwapInt(obj, j, intVolatile, intVolatile + i));
        return intVolatile;
    }

    private static Field getField() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new Error("Couldn't find the Unsafe", e);
        }
    }

    public static Unsafe getUnsafe() {
        return theUnsafe;
    }
}
