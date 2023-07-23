package media.tiger.tigerbox.webserver.dto;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceInfoDto.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b+\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001<By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0098\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b%\u0010\u001bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u001bR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001e¨\u0006="}, d2 = {"Lmedia/tiger/tigerbox/webserver/dto/UpdateDeviceInfoDto;", "", "deviceName", "", "maxVolume", "", "musicVolumeUnit", "", "musicLightEnabled", "", "logoLight", "Lmedia/tiger/tigerbox/webserver/dto/LogoLight;", "nightLight", "Lmedia/tiger/tigerbox/webserver/dto/NightLight;", "sleepTimer", "timeLimitInitialTimeSeconds", "timeWindowList", "", "Lmedia/tiger/tigerbox/webserver/dto/WindowedTimerDto;", "systemSoundEnabled", "wifiEnabled", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Lmedia/tiger/tigerbox/webserver/dto/LogoLight;Lmedia/tiger/tigerbox/webserver/dto/NightLight;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDeviceName", "()Ljava/lang/String;", "getLogoLight", "()Lmedia/tiger/tigerbox/webserver/dto/LogoLight;", "getMaxVolume", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMusicLightEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMusicVolumeUnit", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getNightLight", "()Lmedia/tiger/tigerbox/webserver/dto/NightLight;", "getSleepTimer", "getSystemSoundEnabled", "getTimeLimitInitialTimeSeconds", "getTimeWindowList", "()Ljava/util/List;", "getWifiEnabled", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Lmedia/tiger/tigerbox/webserver/dto/LogoLight;Lmedia/tiger/tigerbox/webserver/dto/NightLight;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lmedia/tiger/tigerbox/webserver/dto/UpdateDeviceInfoDto;", "equals", "other", "hashCode", "toString", "Companion", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateDeviceInfoDto {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_MAX_SLEEP_TIME = 21600;
    public static final int DEFAULT_MINIMUM_SLEEP_TIME = 60;
    private final String deviceName;
    private final LogoLight logoLight;
    private final Integer maxVolume;
    private final Boolean musicLightEnabled;
    private final Float musicVolumeUnit;
    private final NightLight nightLight;
    private final Integer sleepTimer;
    private final Boolean systemSoundEnabled;
    private final Integer timeLimitInitialTimeSeconds;
    private final List<WindowedTimerDto> timeWindowList;
    private final Boolean wifiEnabled;

    public final String component1() {
        return this.deviceName;
    }

    public final Boolean component10() {
        return this.systemSoundEnabled;
    }

    public final Boolean component11() {
        return this.wifiEnabled;
    }

    public final Integer component2() {
        return this.maxVolume;
    }

    public final Float component3() {
        return this.musicVolumeUnit;
    }

    public final Boolean component4() {
        return this.musicLightEnabled;
    }

    public final LogoLight component5() {
        return this.logoLight;
    }

    public final NightLight component6() {
        return this.nightLight;
    }

    public final Integer component7() {
        return this.sleepTimer;
    }

    public final Integer component8() {
        return this.timeLimitInitialTimeSeconds;
    }

    public final List<WindowedTimerDto> component9() {
        return this.timeWindowList;
    }

    public final UpdateDeviceInfoDto copy(String str, Integer num, Float f, Boolean bool, LogoLight logoLight, NightLight nightLight, Integer num2, Integer num3, List<WindowedTimerDto> list, Boolean bool2, Boolean bool3) {
        return new UpdateDeviceInfoDto(str, num, f, bool, logoLight, nightLight, num2, num3, list, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateDeviceInfoDto) {
            UpdateDeviceInfoDto updateDeviceInfoDto = (UpdateDeviceInfoDto) obj;
            return Intrinsics.areEqual(this.deviceName, updateDeviceInfoDto.deviceName) && Intrinsics.areEqual(this.maxVolume, updateDeviceInfoDto.maxVolume) && Intrinsics.areEqual((Object) this.musicVolumeUnit, (Object) updateDeviceInfoDto.musicVolumeUnit) && Intrinsics.areEqual(this.musicLightEnabled, updateDeviceInfoDto.musicLightEnabled) && Intrinsics.areEqual(this.logoLight, updateDeviceInfoDto.logoLight) && Intrinsics.areEqual(this.nightLight, updateDeviceInfoDto.nightLight) && Intrinsics.areEqual(this.sleepTimer, updateDeviceInfoDto.sleepTimer) && Intrinsics.areEqual(this.timeLimitInitialTimeSeconds, updateDeviceInfoDto.timeLimitInitialTimeSeconds) && Intrinsics.areEqual(this.timeWindowList, updateDeviceInfoDto.timeWindowList) && Intrinsics.areEqual(this.systemSoundEnabled, updateDeviceInfoDto.systemSoundEnabled) && Intrinsics.areEqual(this.wifiEnabled, updateDeviceInfoDto.wifiEnabled);
        }
        return false;
    }

    public int hashCode() {
        String str = this.deviceName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.maxVolume;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.musicVolumeUnit;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.musicLightEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        LogoLight logoLight = this.logoLight;
        int hashCode5 = (hashCode4 + (logoLight == null ? 0 : logoLight.hashCode())) * 31;
        NightLight nightLight = this.nightLight;
        int hashCode6 = (hashCode5 + (nightLight == null ? 0 : nightLight.hashCode())) * 31;
        Integer num2 = this.sleepTimer;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.timeLimitInitialTimeSeconds;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<WindowedTimerDto> list = this.timeWindowList;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.systemSoundEnabled;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.wifiEnabled;
        return hashCode10 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "UpdateDeviceInfoDto(deviceName=" + this.deviceName + ", maxVolume=" + this.maxVolume + ", musicVolumeUnit=" + this.musicVolumeUnit + ", musicLightEnabled=" + this.musicLightEnabled + ", logoLight=" + this.logoLight + ", nightLight=" + this.nightLight + ", sleepTimer=" + this.sleepTimer + ", timeLimitInitialTimeSeconds=" + this.timeLimitInitialTimeSeconds + ", timeWindowList=" + this.timeWindowList + ", systemSoundEnabled=" + this.systemSoundEnabled + ", wifiEnabled=" + this.wifiEnabled + ')';
    }

    public UpdateDeviceInfoDto(String str, Integer num, Float f, Boolean bool, LogoLight logoLight, NightLight nightLight, Integer num2, Integer num3, List<WindowedTimerDto> list, Boolean bool2, Boolean bool3) {
        this.deviceName = str;
        this.maxVolume = num;
        this.musicVolumeUnit = f;
        this.musicLightEnabled = bool;
        this.logoLight = logoLight;
        this.nightLight = nightLight;
        this.sleepTimer = num2;
        this.timeLimitInitialTimeSeconds = num3;
        this.timeWindowList = list;
        this.systemSoundEnabled = bool2;
        this.wifiEnabled = bool3;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }

    public final Integer getMaxVolume() {
        return this.maxVolume;
    }

    public final Float getMusicVolumeUnit() {
        return this.musicVolumeUnit;
    }

    public final Boolean getMusicLightEnabled() {
        return this.musicLightEnabled;
    }

    public final LogoLight getLogoLight() {
        return this.logoLight;
    }

    public final NightLight getNightLight() {
        return this.nightLight;
    }

    public final Integer getSleepTimer() {
        return this.sleepTimer;
    }

    public final Integer getTimeLimitInitialTimeSeconds() {
        return this.timeLimitInitialTimeSeconds;
    }

    public final List<WindowedTimerDto> getTimeWindowList() {
        return this.timeWindowList;
    }

    public final Boolean getSystemSoundEnabled() {
        return this.systemSoundEnabled;
    }

    public final Boolean getWifiEnabled() {
        return this.wifiEnabled;
    }

    /* compiled from: DeviceInfoDto.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lmedia/tiger/tigerbox/webserver/dto/UpdateDeviceInfoDto$Companion;", "", "()V", "DEFAULT_MAX_SLEEP_TIME", "", "DEFAULT_MINIMUM_SLEEP_TIME", "app_tigerBoxRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
