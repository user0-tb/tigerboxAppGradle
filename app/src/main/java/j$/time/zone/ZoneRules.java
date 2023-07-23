package j$.time.zone;

import j$.lang.Iterable;
import j$.time.Clock;
import j$.time.Clock$SystemClock$$ExternalSyntheticOutline0;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import media.tiger.tigerbox.ui.settings.timersSetup.TimersSetupLimitSetupViewModel;

/* loaded from: classes2.dex */
public final class ZoneRules implements Serializable {
    private final ZoneOffsetTransitionRule[] lastRules;
    private final transient ConcurrentMap lastRulesCache = new ConcurrentHashMap();
    private final long[] savingsInstantTransitions;
    private final LocalDateTime[] savingsLocalTransitions;
    private final ZoneOffset[] standardOffsets;
    private final long[] standardTransitions;
    private final TimeZone timeZone;
    private final ZoneOffset[] wallOffsets;
    private static final long[] EMPTY_LONG_ARRAY = new long[0];
    private static final ZoneOffsetTransitionRule[] EMPTY_LASTRULES = new ZoneOffsetTransitionRule[0];
    private static final LocalDateTime[] EMPTY_LDT_ARRAY = new LocalDateTime[0];
    private static final ZoneOffsetTransition[] NO_TRANSITIONS = new ZoneOffsetTransition[0];

    private ZoneRules(ZoneOffset zoneOffset) {
        this.standardOffsets = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = EMPTY_LONG_ARRAY;
        this.standardTransitions = jArr;
        this.savingsInstantTransitions = jArr;
        this.savingsLocalTransitions = EMPTY_LDT_ARRAY;
        this.wallOffsets = zoneOffsetArr;
        this.lastRules = EMPTY_LASTRULES;
        this.timeZone = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneRules(TimeZone timeZone) {
        this.standardOffsets = r0;
        ZoneOffset[] zoneOffsetArr = {offsetFromMillis(timeZone.getRawOffset())};
        long[] jArr = EMPTY_LONG_ARRAY;
        this.standardTransitions = jArr;
        this.savingsInstantTransitions = jArr;
        this.savingsLocalTransitions = EMPTY_LDT_ARRAY;
        this.wallOffsets = zoneOffsetArr;
        this.lastRules = EMPTY_LASTRULES;
        this.timeZone = timeZone;
    }

    private Object findOffsetInfo(LocalDateTime localDateTime, ZoneOffsetTransition zoneOffsetTransition) {
        LocalDateTime dateTimeBefore = zoneOffsetTransition.getDateTimeBefore();
        boolean isGap = zoneOffsetTransition.isGap();
        boolean isBefore = localDateTime.isBefore(dateTimeBefore);
        return isGap ? isBefore ? zoneOffsetTransition.getOffsetBefore() : localDateTime.isBefore(zoneOffsetTransition.getDateTimeAfter()) ? zoneOffsetTransition : zoneOffsetTransition.getOffsetAfter() : !isBefore ? zoneOffsetTransition.getOffsetAfter() : localDateTime.isBefore(zoneOffsetTransition.getDateTimeAfter()) ? zoneOffsetTransition.getOffsetBefore() : zoneOffsetTransition;
    }

    private ZoneOffsetTransition[] findTransitionArray(int i) {
        Integer valueOf = Integer.valueOf(i);
        ZoneOffsetTransition[] zoneOffsetTransitionArr = (ZoneOffsetTransition[]) this.lastRulesCache.get(valueOf);
        if (zoneOffsetTransitionArr != null) {
            return zoneOffsetTransitionArr;
        }
        if (this.timeZone == null) {
            ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = this.lastRules;
            ZoneOffsetTransition[] zoneOffsetTransitionArr2 = new ZoneOffsetTransition[zoneOffsetTransitionRuleArr.length];
            if (zoneOffsetTransitionRuleArr.length > 0) {
                ZoneOffsetTransitionRule zoneOffsetTransitionRule = zoneOffsetTransitionRuleArr[0];
                throw null;
            }
            if (i < 2100) {
                this.lastRulesCache.putIfAbsent(valueOf, zoneOffsetTransitionArr2);
            }
            return zoneOffsetTransitionArr2;
        } else if (i < 1800) {
            return NO_TRANSITIONS;
        } else {
            long epochSecond = LocalDateTime.of(i - 1, 12, 31, 0, 0).toEpochSecond(this.standardOffsets[0]);
            long j = 1000;
            int offset = this.timeZone.getOffset(epochSecond * 1000);
            long j2 = 31968000 + epochSecond;
            ZoneOffsetTransition[] zoneOffsetTransitionArr3 = NO_TRANSITIONS;
            while (epochSecond < j2) {
                long j3 = 7776000 + epochSecond;
                long j4 = epochSecond;
                if (offset != this.timeZone.getOffset(j3 * j)) {
                    epochSecond = j4;
                    while (j3 - epochSecond > 1) {
                        long j5 = j2;
                        long m$2 = Iterable.CC.m$2(j3 + epochSecond, 2L);
                        long j6 = j3;
                        if (this.timeZone.getOffset(m$2 * 1000) == offset) {
                            epochSecond = m$2;
                            j = 1000;
                            j3 = j6;
                        } else {
                            j3 = m$2;
                            j = 1000;
                        }
                        j2 = j5;
                    }
                    long j7 = j2;
                    long j8 = j3;
                    long j9 = j;
                    if (this.timeZone.getOffset(epochSecond * j9) == offset) {
                        epochSecond = j8;
                    }
                    ZoneOffset offsetFromMillis = offsetFromMillis(offset);
                    int offset2 = this.timeZone.getOffset(epochSecond * j9);
                    ZoneOffset offsetFromMillis2 = offsetFromMillis(offset2);
                    if (findYear(epochSecond, offsetFromMillis2) == i) {
                        zoneOffsetTransitionArr3 = (ZoneOffsetTransition[]) Arrays.copyOf(zoneOffsetTransitionArr3, zoneOffsetTransitionArr3.length + 1);
                        zoneOffsetTransitionArr3[zoneOffsetTransitionArr3.length - 1] = new ZoneOffsetTransition(epochSecond, offsetFromMillis, offsetFromMillis2);
                    }
                    offset = offset2;
                    j = j9;
                    j2 = j7;
                } else {
                    epochSecond = j3;
                }
            }
            if (1916 <= i && i < 2100) {
                this.lastRulesCache.putIfAbsent(valueOf, zoneOffsetTransitionArr3);
            }
            return zoneOffsetTransitionArr3;
        }
    }

    private int findYear(long j, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Iterable.CC.m$2(j + zoneOffset.getTotalSeconds(), 86400L)).getYear();
    }

    private Object getOffsetInfo(LocalDateTime localDateTime) {
        LocalDateTime[] localDateTimeArr;
        Object obj = null;
        int i = 0;
        if (this.timeZone != null) {
            ZoneOffsetTransition[] findTransitionArray = findTransitionArray(localDateTime.getYear());
            if (findTransitionArray.length == 0) {
                return offsetFromMillis(this.timeZone.getOffset(localDateTime.toEpochSecond(this.standardOffsets[0]) * 1000));
            }
            int length = findTransitionArray.length;
            while (i < length) {
                ZoneOffsetTransition zoneOffsetTransition = findTransitionArray[i];
                Object findOffsetInfo = findOffsetInfo(localDateTime, zoneOffsetTransition);
                if ((findOffsetInfo instanceof ZoneOffsetTransition) || findOffsetInfo.equals(zoneOffsetTransition.getOffsetBefore())) {
                    return findOffsetInfo;
                }
                i++;
                obj = findOffsetInfo;
            }
            return obj;
        } else if (this.savingsInstantTransitions.length == 0) {
            return this.standardOffsets[0];
        } else {
            if (this.lastRules.length > 0) {
                if (localDateTime.isAfter(this.savingsLocalTransitions[localDateTimeArr.length - 1])) {
                    ZoneOffsetTransition[] findTransitionArray2 = findTransitionArray(localDateTime.getYear());
                    int length2 = findTransitionArray2.length;
                    while (i < length2) {
                        ZoneOffsetTransition zoneOffsetTransition2 = findTransitionArray2[i];
                        Object findOffsetInfo2 = findOffsetInfo(localDateTime, zoneOffsetTransition2);
                        if ((findOffsetInfo2 instanceof ZoneOffsetTransition) || findOffsetInfo2.equals(zoneOffsetTransition2.getOffsetBefore())) {
                            return findOffsetInfo2;
                        }
                        i++;
                        obj = findOffsetInfo2;
                    }
                    return obj;
                }
            }
            int binarySearch = Arrays.binarySearch(this.savingsLocalTransitions, localDateTime);
            if (binarySearch == -1) {
                return this.wallOffsets[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else {
                LocalDateTime[] localDateTimeArr2 = this.savingsLocalTransitions;
                if (binarySearch < localDateTimeArr2.length - 1) {
                    int i2 = binarySearch + 1;
                    if (localDateTimeArr2[binarySearch].equals(localDateTimeArr2[i2])) {
                        binarySearch = i2;
                    }
                }
            }
            if ((binarySearch & 1) == 0) {
                LocalDateTime[] localDateTimeArr3 = this.savingsLocalTransitions;
                LocalDateTime localDateTime2 = localDateTimeArr3[binarySearch];
                LocalDateTime localDateTime3 = localDateTimeArr3[binarySearch + 1];
                ZoneOffset[] zoneOffsetArr = this.wallOffsets;
                int i3 = binarySearch / 2;
                ZoneOffset zoneOffset = zoneOffsetArr[i3];
                ZoneOffset zoneOffset2 = zoneOffsetArr[i3 + 1];
                return zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds() ? new ZoneOffsetTransition(localDateTime2, zoneOffset, zoneOffset2) : new ZoneOffsetTransition(localDateTime3, zoneOffset, zoneOffset2);
            }
            return this.wallOffsets[(binarySearch / 2) + 1];
        }
    }

    public static ZoneRules of(ZoneOffset zoneOffset) {
        return new ZoneRules(zoneOffset);
    }

    private static ZoneOffset offsetFromMillis(int i) {
        return ZoneOffset.ofTotalSeconds(i / 1000);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneRules) {
            ZoneRules zoneRules = (ZoneRules) obj;
            return Objects.equals(this.timeZone, zoneRules.timeZone) && Arrays.equals(this.standardTransitions, zoneRules.standardTransitions) && Arrays.equals(this.standardOffsets, zoneRules.standardOffsets) && Arrays.equals(this.savingsInstantTransitions, zoneRules.savingsInstantTransitions) && Arrays.equals(this.wallOffsets, zoneRules.wallOffsets) && Arrays.equals(this.lastRules, zoneRules.lastRules);
        }
        return false;
    }

    public ZoneOffset getOffset(Instant instant) {
        long[] jArr;
        ZoneOffset[] zoneOffsetArr;
        TimeZone timeZone = this.timeZone;
        if (timeZone != null) {
            return offsetFromMillis(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.savingsInstantTransitions.length == 0) {
            return this.standardOffsets[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.lastRules.length > 0) {
            if (epochSecond > this.savingsInstantTransitions[jArr.length - 1]) {
                ZoneOffsetTransition[] findTransitionArray = findTransitionArray(findYear(epochSecond, this.wallOffsets[zoneOffsetArr.length - 1]));
                ZoneOffsetTransition zoneOffsetTransition = null;
                for (int i = 0; i < findTransitionArray.length; i++) {
                    zoneOffsetTransition = findTransitionArray[i];
                    if (epochSecond < zoneOffsetTransition.toEpochSecond()) {
                        return zoneOffsetTransition.getOffsetBefore();
                    }
                }
                return zoneOffsetTransition.getOffsetAfter();
            }
        }
        int binarySearch = Arrays.binarySearch(this.savingsInstantTransitions, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.wallOffsets[binarySearch + 1];
    }

    public ZoneOffsetTransition getTransition(LocalDateTime localDateTime) {
        Object offsetInfo = getOffsetInfo(localDateTime);
        if (offsetInfo instanceof ZoneOffsetTransition) {
            return (ZoneOffsetTransition) offsetInfo;
        }
        return null;
    }

    public List getValidOffsets(LocalDateTime localDateTime) {
        Object offsetInfo = getOffsetInfo(localDateTime);
        return offsetInfo instanceof ZoneOffsetTransition ? ((ZoneOffsetTransition) offsetInfo).getValidOffsets() : Collections.singletonList((ZoneOffset) offsetInfo);
    }

    public int hashCode() {
        TimeZone timeZone = this.timeZone;
        return (((((timeZone != null ? timeZone.hashCode() : 0) ^ Arrays.hashCode(this.standardTransitions)) ^ Arrays.hashCode(this.standardOffsets)) ^ Arrays.hashCode(this.savingsInstantTransitions)) ^ Arrays.hashCode(this.wallOffsets)) ^ Arrays.hashCode(this.lastRules);
    }

    public boolean isDaylightSavings(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.timeZone;
        if (timeZone != null) {
            zoneOffset = offsetFromMillis(timeZone.getRawOffset());
        } else if (this.savingsInstantTransitions.length == 0) {
            zoneOffset = this.standardOffsets[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.standardTransitions, instant.getEpochSecond());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.standardOffsets[binarySearch + 1];
        }
        return !zoneOffset.equals(getOffset(instant));
    }

    public boolean isFixedOffset() {
        TimeZone timeZone = this.timeZone;
        if (timeZone == null) {
            return this.savingsInstantTransitions.length == 0;
        } else if (timeZone.useDaylightTime() || this.timeZone.getDSTSavings() != 0) {
            return false;
        } else {
            Instant now = Instant.now();
            ZoneOffsetTransition zoneOffsetTransition = null;
            if (this.timeZone != null) {
                long epochSecond = now.getEpochSecond();
                if (now.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int findYear = findYear(epochSecond, getOffset(now));
                ZoneOffsetTransition[] findTransitionArray = findTransitionArray(findYear);
                int length = findTransitionArray.length - 1;
                while (true) {
                    if (length >= 0) {
                        if (epochSecond > findTransitionArray[length].toEpochSecond()) {
                            zoneOffsetTransition = findTransitionArray[length];
                            break;
                        }
                        length--;
                    } else if (findYear > 1800) {
                        ZoneOffsetTransition[] findTransitionArray2 = findTransitionArray(findYear - 1);
                        int length2 = findTransitionArray2.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                long min = Math.min(epochSecond - 31104000, (Clock.systemUTC().millis() / 1000) + 31968000);
                                int offset = this.timeZone.getOffset((epochSecond - 1) * 1000);
                                long epochDay = LocalDate.of(TimersSetupLimitSetupViewModel.SEC_30M, 1, 1).toEpochDay() * 86400;
                                while (true) {
                                    if (epochDay > min) {
                                        break;
                                    }
                                    int offset2 = this.timeZone.getOffset(min * 1000);
                                    if (offset != offset2) {
                                        int findYear2 = findYear(min, offsetFromMillis(offset2));
                                        ZoneOffsetTransition[] findTransitionArray3 = findTransitionArray(findYear2 + 1);
                                        int length3 = findTransitionArray3.length - 1;
                                        while (true) {
                                            if (length3 < 0) {
                                                ZoneOffsetTransition[] findTransitionArray4 = findTransitionArray(findYear2);
                                                zoneOffsetTransition = findTransitionArray4[findTransitionArray4.length - 1];
                                                break;
                                            } else if (epochSecond > findTransitionArray3[length3].toEpochSecond()) {
                                                zoneOffsetTransition = findTransitionArray3[length3];
                                                break;
                                            } else {
                                                length3--;
                                            }
                                        }
                                    } else {
                                        min -= 7776000;
                                    }
                                }
                            } else if (epochSecond > findTransitionArray2[length2].toEpochSecond()) {
                                zoneOffsetTransition = findTransitionArray2[length2];
                                break;
                            } else {
                                length2--;
                            }
                        }
                    }
                }
            } else if (this.savingsInstantTransitions.length != 0) {
                long epochSecond2 = now.getEpochSecond();
                if (now.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.savingsInstantTransitions;
                long j = jArr[jArr.length - 1];
                if (this.lastRules.length > 0 && epochSecond2 > j) {
                    ZoneOffset[] zoneOffsetArr = this.wallOffsets;
                    ZoneOffset zoneOffset = zoneOffsetArr[zoneOffsetArr.length - 1];
                    int findYear3 = findYear(epochSecond2, zoneOffset);
                    ZoneOffsetTransition[] findTransitionArray5 = findTransitionArray(findYear3);
                    int length4 = findTransitionArray5.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i = findYear3 - 1;
                            if (i > findYear(j, zoneOffset)) {
                                ZoneOffsetTransition[] findTransitionArray6 = findTransitionArray(i);
                                zoneOffsetTransition = findTransitionArray6[findTransitionArray6.length - 1];
                            }
                        } else if (epochSecond2 > findTransitionArray5[length4].toEpochSecond()) {
                            zoneOffsetTransition = findTransitionArray5[length4];
                            break;
                        } else {
                            length4--;
                        }
                    }
                }
                int binarySearch = Arrays.binarySearch(this.savingsInstantTransitions, epochSecond2);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                if (binarySearch > 0) {
                    int i2 = binarySearch - 1;
                    long j2 = this.savingsInstantTransitions[i2];
                    ZoneOffset[] zoneOffsetArr2 = this.wallOffsets;
                    zoneOffsetTransition = new ZoneOffsetTransition(j2, zoneOffsetArr2[i2], zoneOffsetArr2[binarySearch]);
                }
            }
            return zoneOffsetTransition == null;
        }
    }

    public String toString() {
        StringBuilder m;
        if (this.timeZone != null) {
            m = Clock$SystemClock$$ExternalSyntheticOutline0.m("ZoneRules[timeZone=");
            m.append(this.timeZone.getID());
        } else {
            m = Clock$SystemClock$$ExternalSyntheticOutline0.m("ZoneRules[currentStandardOffset=");
            ZoneOffset[] zoneOffsetArr = this.standardOffsets;
            m.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        }
        m.append("]");
        return m.toString();
    }
}
