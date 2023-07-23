package j$.lang;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public interface Iterable {

    /* renamed from: j$.lang.Iterable$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ int m(long j) {
            int i = (int) j;
            if (j == i) {
                return i;
            }
            throw new ArithmeticException();
        }

        public static /* synthetic */ long m(long j, long j2) {
            long j3 = j + j2;
            if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
                return j3;
            }
            throw new ArithmeticException();
        }

        public static /* synthetic */ long m$1(long j, long j2) {
            long j3 = j % j2;
            if (j3 == 0) {
                return 0L;
            }
            return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
        }

        public static /* synthetic */ long m$2(long j, long j2) {
            long j3 = j / j2;
            return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
        }

        public static /* synthetic */ long m$3(long j, long j2) {
            int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
            if (numberOfLeadingZeros > 65) {
                return j * j2;
            }
            if (numberOfLeadingZeros >= 64) {
                int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if ((i >= 0) | (j2 != Long.MIN_VALUE)) {
                    long j3 = j * j2;
                    if (i == 0 || j3 / j == j2) {
                        return j3;
                    }
                }
            }
            throw new ArithmeticException();
        }

        public static /* synthetic */ long m$4(long j, long j2) {
            long j3 = j - j2;
            if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
                return j3;
            }
            throw new ArithmeticException();
        }
    }

    void forEach(Consumer consumer);

    Spliterator spliterator();
}
