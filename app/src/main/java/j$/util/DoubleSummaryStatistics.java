package j$.util;

import j$.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public class DoubleSummaryStatistics implements DoubleConsumer {
    private long count;
    private double simpleSum;
    private double sum;
    private double sumCompensation;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void sumWithCompensation(double d) {
        double d2 = d - this.sumCompensation;
        double d3 = this.sum;
        double d4 = d3 + d2;
        this.sumCompensation = (d4 - d3) - d2;
        this.sum = d4;
    }

    @Override // j$.util.function.DoubleConsumer
    public void accept(double d) {
        this.count++;
        this.simpleSum += d;
        sumWithCompensation(d);
        this.min = Math.min(this.min, d);
        this.max = Math.max(this.max, d);
    }

    public void combine(DoubleSummaryStatistics doubleSummaryStatistics) {
        this.count += doubleSummaryStatistics.count;
        this.simpleSum += doubleSummaryStatistics.simpleSum;
        sumWithCompensation(doubleSummaryStatistics.sum);
        sumWithCompensation(doubleSummaryStatistics.sumCompensation);
        this.min = Math.min(this.min, doubleSummaryStatistics.min);
        this.max = Math.max(this.max, doubleSummaryStatistics.max);
    }

    public final double getSum() {
        double d = this.sum + this.sumCompensation;
        return (Double.isNaN(d) && Double.isInfinite(this.simpleSum)) ? this.simpleSum : d;
    }

    public String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = DoubleSummaryStatistics.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Double.valueOf(getSum());
        objArr[3] = Double.valueOf(this.min);
        objArr[4] = Double.valueOf(this.count > 0 ? getSum() / this.count : 0.0d);
        objArr[5] = Double.valueOf(this.max);
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", objArr);
    }
}
