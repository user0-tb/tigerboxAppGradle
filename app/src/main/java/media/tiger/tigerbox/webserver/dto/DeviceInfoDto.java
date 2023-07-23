package media.tiger.tigerbox.webserver.dto;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.UShort;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import media.tiger.tigerbox.model.domain.BatteryState;

/* compiled from: DeviceInfoDto.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bO\b\u0086\b\u0018\u00002\u00020\u0001BÚ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020$\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010'\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010N\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bO\u0010*J\u0019\u0010P\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bQ\u0010*J\t\u0010R\u001a\u00020\u0014HÆ\u0003J\u0019\u0010S\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bT\u0010*J\t\u0010U\u001a\u00020\u0007HÆ\u0003J\t\u0010V\u001a\u00020\u0018HÆ\u0003J\t\u0010W\u001a\u00020\u001aHÆ\u0003J\t\u0010X\u001a\u00020\u001cHÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000eHÆ\u0003J\u0019\u0010Z\u001a\u00020 HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b[\u0010AJ\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0007HÆ\u0003J\u0019\u0010_\u001a\u00020$HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b`\u0010GJ\u0019\u0010a\u001a\u00020$HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bb\u0010GJ\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003J\t\u0010e\u001a\u00020\u0007HÆ\u0003J\t\u0010f\u001a\u00020\tHÆ\u0003J\t\u0010g\u001a\u00020\tHÆ\u0003J\t\u0010h\u001a\u00020\tHÆ\u0003J\t\u0010i\u001a\u00020\tHÆ\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010k\u001a\u00020\u0011HÆ\u0003J\u0098\u0002\u0010l\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010'\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020\u00072\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020\u001cHÖ\u0001J\t\u0010r\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u00101R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001c\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010+\u001a\u0004\b9\u0010*R\u0011\u0010\u0016\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u001c\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010+\u001a\u0004\b;\u0010*R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001c\u0010\u001f\u001a\u00020 ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010C\u001a\u0004\bB\u0010AR\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bD\u00101R\u0011\u0010\"\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bE\u0010/R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u001c\u0010#\u001a\u00020$ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010J\u001a\u0004\bI\u0010GR\u001c\u0010%\u001a\u00020$ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010J\u001a\u0004\bK\u0010GR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0011\u0010'\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bM\u0010/\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006s"}, d2 = {"Lmedia/tiger/tigerbox/webserver/dto/DeviceInfoDto;", "", "battery", "Lkotlin/UByte;", "batteryState", "Lmedia/tiger/tigerbox/model/domain/BatteryState;", "bluetoothEnabled", "", "deviceIdentifier", "", "deviceName", "deviceType", "firmware", "lightIntensityRange", "", "", "logoLight", "Lmedia/tiger/tigerbox/webserver/dto/LogoLight;", "maxVolume", "musicVolumeUnit", "", "musicVolume", "musicLightEnabled", "nightLight", "Lmedia/tiger/tigerbox/webserver/dto/NightLight;", "sleepTimer", "", "timeLimitInitialTimeSeconds", "", "timeWindowList", "Lmedia/tiger/tigerbox/webserver/dto/WindowedTimerDto;", "slots", "Lkotlin/UShort;", "systemDateTime", "systemSoundEnabled", "totalCapacity", "Lkotlin/UInt;", "usedCapacity", "volumeRange", "wifiEnabled", "(BLmedia/tiger/tigerbox/model/domain/BatteryState;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmedia/tiger/tigerbox/webserver/dto/LogoLight;BFBZLmedia/tiger/tigerbox/webserver/dto/NightLight;SILjava/util/List;SLjava/lang/String;ZIILjava/util/List;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBattery-w2LRezQ", "()B", "B", "getBatteryState", "()Lmedia/tiger/tigerbox/model/domain/BatteryState;", "getBluetoothEnabled", "()Z", "getDeviceIdentifier", "()Ljava/lang/String;", "getDeviceName", "getDeviceType", "getFirmware", "getLightIntensityRange", "()Ljava/util/List;", "getLogoLight", "()Lmedia/tiger/tigerbox/webserver/dto/LogoLight;", "getMaxVolume-w2LRezQ", "getMusicLightEnabled", "getMusicVolume-w2LRezQ", "getMusicVolumeUnit", "()F", "getNightLight", "()Lmedia/tiger/tigerbox/webserver/dto/NightLight;", "getSleepTimer", "()S", "getSlots-Mh2AYeg", ExifInterface.LATITUDE_SOUTH, "getSystemDateTime", "getSystemSoundEnabled", "getTimeLimitInitialTimeSeconds", "()I", "getTimeWindowList", "getTotalCapacity-pVg5ArA", "I", "getUsedCapacity-pVg5ArA", "getVolumeRange", "getWifiEnabled", "component1", "component1-w2LRezQ", "component10", "component10-w2LRezQ", "component11", "component12", "component12-w2LRezQ", "component13", "component14", "component15", "component16", "component17", "component18", "component18-Mh2AYeg", "component19", "component2", "component20", "component21", "component21-pVg5ArA", "component22", "component22-pVg5ArA", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-wRP0Q7g", "(BLmedia/tiger/tigerbox/model/domain/BatteryState;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lmedia/tiger/tigerbox/webserver/dto/LogoLight;BFBZLmedia/tiger/tigerbox/webserver/dto/NightLight;SILjava/util/List;SLjava/lang/String;ZIILjava/util/List;Z)Lmedia/tiger/tigerbox/webserver/dto/DeviceInfoDto;", "equals", "other", "hashCode", "toString", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceInfoDto {
    private final byte battery;
    private final BatteryState batteryState;
    private final boolean bluetoothEnabled;
    private final String deviceIdentifier;
    private final String deviceName;
    private final String deviceType;
    private final String firmware;
    private final List<Byte> lightIntensityRange;
    private final LogoLight logoLight;
    private final byte maxVolume;
    private final boolean musicLightEnabled;
    private final byte musicVolume;
    private final float musicVolumeUnit;
    private final NightLight nightLight;
    private final short sleepTimer;
    private final short slots;
    private final String systemDateTime;
    private final boolean systemSoundEnabled;
    private final int timeLimitInitialTimeSeconds;
    private final List<WindowedTimerDto> timeWindowList;
    private final int totalCapacity;
    private final int usedCapacity;
    private final List<Byte> volumeRange;
    private final boolean wifiEnabled;

    public /* synthetic */ DeviceInfoDto(byte b, BatteryState batteryState, boolean z, String str, String str2, String str3, String str4, List list, LogoLight logoLight, byte b2, float f, byte b3, boolean z2, NightLight nightLight, short s, int i, List list2, short s2, String str5, boolean z3, int i2, int i3, List list3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(b, batteryState, z, str, str2, str3, str4, list, logoLight, b2, f, b3, z2, nightLight, s, i, list2, s2, str5, z3, i2, i3, list3, z4);
    }

    /* renamed from: component1-w2LRezQ  reason: not valid java name */
    public final byte m2033component1w2LRezQ() {
        return this.battery;
    }

    /* renamed from: component10-w2LRezQ  reason: not valid java name */
    public final byte m2034component10w2LRezQ() {
        return this.maxVolume;
    }

    public final float component11() {
        return this.musicVolumeUnit;
    }

    /* renamed from: component12-w2LRezQ  reason: not valid java name */
    public final byte m2035component12w2LRezQ() {
        return this.musicVolume;
    }

    public final boolean component13() {
        return this.musicLightEnabled;
    }

    public final NightLight component14() {
        return this.nightLight;
    }

    public final short component15() {
        return this.sleepTimer;
    }

    public final int component16() {
        return this.timeLimitInitialTimeSeconds;
    }

    public final List<WindowedTimerDto> component17() {
        return this.timeWindowList;
    }

    /* renamed from: component18-Mh2AYeg  reason: not valid java name */
    public final short m2036component18Mh2AYeg() {
        return this.slots;
    }

    public final String component19() {
        return this.systemDateTime;
    }

    public final BatteryState component2() {
        return this.batteryState;
    }

    public final boolean component20() {
        return this.systemSoundEnabled;
    }

    /* renamed from: component21-pVg5ArA  reason: not valid java name */
    public final int m2037component21pVg5ArA() {
        return this.totalCapacity;
    }

    /* renamed from: component22-pVg5ArA  reason: not valid java name */
    public final int m2038component22pVg5ArA() {
        return this.usedCapacity;
    }

    public final List<Byte> component23() {
        return this.volumeRange;
    }

    public final boolean component24() {
        return this.wifiEnabled;
    }

    public final boolean component3() {
        return this.bluetoothEnabled;
    }

    public final String component4() {
        return this.deviceIdentifier;
    }

    public final String component5() {
        return this.deviceName;
    }

    public final String component6() {
        return this.deviceType;
    }

    public final String component7() {
        return this.firmware;
    }

    public final List<Byte> component8() {
        return this.lightIntensityRange;
    }

    public final LogoLight component9() {
        return this.logoLight;
    }

    /* renamed from: copy-wRP0Q7g  reason: not valid java name */
    public final DeviceInfoDto m2039copywRP0Q7g(byte b, BatteryState batteryState, boolean z, String deviceIdentifier, String deviceName, String deviceType, String firmware, List<Byte> lightIntensityRange, LogoLight logoLight, byte b2, float f, byte b3, boolean z2, NightLight nightLight, short s, int i, List<WindowedTimerDto> timeWindowList, short s2, String systemDateTime, boolean z3, int i2, int i3, List<Byte> volumeRange, boolean z4) {
        Intrinsics.checkNotNullParameter(batteryState, "batteryState");
        Intrinsics.checkNotNullParameter(deviceIdentifier, "deviceIdentifier");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(firmware, "firmware");
        Intrinsics.checkNotNullParameter(lightIntensityRange, "lightIntensityRange");
        Intrinsics.checkNotNullParameter(logoLight, "logoLight");
        Intrinsics.checkNotNullParameter(nightLight, "nightLight");
        Intrinsics.checkNotNullParameter(timeWindowList, "timeWindowList");
        Intrinsics.checkNotNullParameter(systemDateTime, "systemDateTime");
        Intrinsics.checkNotNullParameter(volumeRange, "volumeRange");
        return new DeviceInfoDto(b, batteryState, z, deviceIdentifier, deviceName, deviceType, firmware, lightIntensityRange, logoLight, b2, f, b3, z2, nightLight, s, i, timeWindowList, s2, systemDateTime, z3, i2, i3, volumeRange, z4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceInfoDto) {
            DeviceInfoDto deviceInfoDto = (DeviceInfoDto) obj;
            return this.battery == deviceInfoDto.battery && this.batteryState == deviceInfoDto.batteryState && this.bluetoothEnabled == deviceInfoDto.bluetoothEnabled && Intrinsics.areEqual(this.deviceIdentifier, deviceInfoDto.deviceIdentifier) && Intrinsics.areEqual(this.deviceName, deviceInfoDto.deviceName) && Intrinsics.areEqual(this.deviceType, deviceInfoDto.deviceType) && Intrinsics.areEqual(this.firmware, deviceInfoDto.firmware) && Intrinsics.areEqual(this.lightIntensityRange, deviceInfoDto.lightIntensityRange) && Intrinsics.areEqual(this.logoLight, deviceInfoDto.logoLight) && this.maxVolume == deviceInfoDto.maxVolume && Intrinsics.areEqual((Object) Float.valueOf(this.musicVolumeUnit), (Object) Float.valueOf(deviceInfoDto.musicVolumeUnit)) && this.musicVolume == deviceInfoDto.musicVolume && this.musicLightEnabled == deviceInfoDto.musicLightEnabled && Intrinsics.areEqual(this.nightLight, deviceInfoDto.nightLight) && this.sleepTimer == deviceInfoDto.sleepTimer && this.timeLimitInitialTimeSeconds == deviceInfoDto.timeLimitInitialTimeSeconds && Intrinsics.areEqual(this.timeWindowList, deviceInfoDto.timeWindowList) && this.slots == deviceInfoDto.slots && Intrinsics.areEqual(this.systemDateTime, deviceInfoDto.systemDateTime) && this.systemSoundEnabled == deviceInfoDto.systemSoundEnabled && this.totalCapacity == deviceInfoDto.totalCapacity && this.usedCapacity == deviceInfoDto.usedCapacity && Intrinsics.areEqual(this.volumeRange, deviceInfoDto.volumeRange) && this.wifiEnabled == deviceInfoDto.wifiEnabled;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m269hashCodeimpl = ((UByte.m269hashCodeimpl(this.battery) * 31) + this.batteryState.hashCode()) * 31;
        boolean z = this.bluetoothEnabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode = (((((((((((((((((((m269hashCodeimpl + i) * 31) + this.deviceIdentifier.hashCode()) * 31) + this.deviceName.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.firmware.hashCode()) * 31) + this.lightIntensityRange.hashCode()) * 31) + this.logoLight.hashCode()) * 31) + UByte.m269hashCodeimpl(this.maxVolume)) * 31) + Float.floatToIntBits(this.musicVolumeUnit)) * 31) + UByte.m269hashCodeimpl(this.musicVolume)) * 31;
        boolean z2 = this.musicLightEnabled;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int hashCode2 = (((((((((((((hashCode + i2) * 31) + this.nightLight.hashCode()) * 31) + this.sleepTimer) * 31) + this.timeLimitInitialTimeSeconds) * 31) + this.timeWindowList.hashCode()) * 31) + UShort.m529hashCodeimpl(this.slots)) * 31) + this.systemDateTime.hashCode()) * 31;
        boolean z3 = this.systemSoundEnabled;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        int m345hashCodeimpl = (((((((hashCode2 + i3) * 31) + UInt.m345hashCodeimpl(this.totalCapacity)) * 31) + UInt.m345hashCodeimpl(this.usedCapacity)) * 31) + this.volumeRange.hashCode()) * 31;
        boolean z4 = this.wifiEnabled;
        return m345hashCodeimpl + (z4 ? 1 : z4 ? 1 : 0);
    }

    public String toString() {
        return "DeviceInfoDto(battery=" + ((Object) UByte.m300toStringimpl(this.battery)) + ", batteryState=" + this.batteryState + ", bluetoothEnabled=" + this.bluetoothEnabled + ", deviceIdentifier=" + this.deviceIdentifier + ", deviceName=" + this.deviceName + ", deviceType=" + this.deviceType + ", firmware=" + this.firmware + ", lightIntensityRange=" + this.lightIntensityRange + ", logoLight=" + this.logoLight + ", maxVolume=" + ((Object) UByte.m300toStringimpl(this.maxVolume)) + ", musicVolumeUnit=" + this.musicVolumeUnit + ", musicVolume=" + ((Object) UByte.m300toStringimpl(this.musicVolume)) + ", musicLightEnabled=" + this.musicLightEnabled + ", nightLight=" + this.nightLight + ", sleepTimer=" + ((int) this.sleepTimer) + ", timeLimitInitialTimeSeconds=" + this.timeLimitInitialTimeSeconds + ", timeWindowList=" + this.timeWindowList + ", slots=" + ((Object) UShort.m560toStringimpl(this.slots)) + ", systemDateTime=" + this.systemDateTime + ", systemSoundEnabled=" + this.systemSoundEnabled + ", totalCapacity=" + ((Object) UInt.m378toStringimpl(this.totalCapacity)) + ", usedCapacity=" + ((Object) UInt.m378toStringimpl(this.usedCapacity)) + ", volumeRange=" + this.volumeRange + ", wifiEnabled=" + this.wifiEnabled + ')';
    }

    private DeviceInfoDto(byte b, BatteryState batteryState, boolean z, String str, String str2, String str3, String str4, List<Byte> list, LogoLight logoLight, byte b2, float f, byte b3, boolean z2, NightLight nightLight, short s, int i, List<WindowedTimerDto> list2, short s2, String str5, boolean z3, int i2, int i3, List<Byte> list3, boolean z4) {
        this.battery = b;
        this.batteryState = batteryState;
        this.bluetoothEnabled = z;
        this.deviceIdentifier = str;
        this.deviceName = str2;
        this.deviceType = str3;
        this.firmware = str4;
        this.lightIntensityRange = list;
        this.logoLight = logoLight;
        this.maxVolume = b2;
        this.musicVolumeUnit = f;
        this.musicVolume = b3;
        this.musicLightEnabled = z2;
        this.nightLight = nightLight;
        this.sleepTimer = s;
        this.timeLimitInitialTimeSeconds = i;
        this.timeWindowList = list2;
        this.slots = s2;
        this.systemDateTime = str5;
        this.systemSoundEnabled = z3;
        this.totalCapacity = i2;
        this.usedCapacity = i3;
        this.volumeRange = list3;
        this.wifiEnabled = z4;
    }

    /* renamed from: getBattery-w2LRezQ  reason: not valid java name */
    public final byte m2040getBatteryw2LRezQ() {
        return this.battery;
    }

    public final BatteryState getBatteryState() {
        return this.batteryState;
    }

    public final boolean getBluetoothEnabled() {
        return this.bluetoothEnabled;
    }

    public final String getDeviceIdentifier() {
        return this.deviceIdentifier;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getFirmware() {
        return this.firmware;
    }

    public final List<Byte> getLightIntensityRange() {
        return this.lightIntensityRange;
    }

    public final LogoLight getLogoLight() {
        return this.logoLight;
    }

    /* renamed from: getMaxVolume-w2LRezQ  reason: not valid java name */
    public final byte m2041getMaxVolumew2LRezQ() {
        return this.maxVolume;
    }

    public final float getMusicVolumeUnit() {
        return this.musicVolumeUnit;
    }

    /* renamed from: getMusicVolume-w2LRezQ  reason: not valid java name */
    public final byte m2042getMusicVolumew2LRezQ() {
        return this.musicVolume;
    }

    public final boolean getMusicLightEnabled() {
        return this.musicLightEnabled;
    }

    public final NightLight getNightLight() {
        return this.nightLight;
    }

    public final short getSleepTimer() {
        return this.sleepTimer;
    }

    public final int getTimeLimitInitialTimeSeconds() {
        return this.timeLimitInitialTimeSeconds;
    }

    public final List<WindowedTimerDto> getTimeWindowList() {
        return this.timeWindowList;
    }

    /* renamed from: getSlots-Mh2AYeg  reason: not valid java name */
    public final short m2043getSlotsMh2AYeg() {
        return this.slots;
    }

    public final String getSystemDateTime() {
        return this.systemDateTime;
    }

    public final boolean getSystemSoundEnabled() {
        return this.systemSoundEnabled;
    }

    /* renamed from: getTotalCapacity-pVg5ArA  reason: not valid java name */
    public final int m2044getTotalCapacitypVg5ArA() {
        return this.totalCapacity;
    }

    /* renamed from: getUsedCapacity-pVg5ArA  reason: not valid java name */
    public final int m2045getUsedCapacitypVg5ArA() {
        return this.usedCapacity;
    }

    public final List<Byte> getVolumeRange() {
        return this.volumeRange;
    }

    public final boolean getWifiEnabled() {
        return this.wifiEnabled;
    }
}
